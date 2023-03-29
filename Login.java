package amazonPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	public static WebDriver driver;

	
	public void URL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.amazon.in/");
		
	}
	void search() {
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("shoe for children");
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();	
	}
	void validatetitle() {
		String title = driver.getTitle();
		System.out.println("The title of the page is "+title);
	}
	void selection() {
		WebElement s1 = driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5']//div[@class='s-card-container s-overflow-hidden aok-relative puis-expand-height puis-include-content-margin puis s-latency-cf-section s-card-border']//div[@class='a-section a-spacing-base a-text-center']//div[@class='s-product-image-container aok-relative s-text-center s-image-overlay-grey s-padding-left-small s-padding-right-small puis-spacing-small s-height-equalized']//div[@class='s-image-padding']//span[@class='rush-component']//a[@class='a-link-normal s-no-outline']//div[@class='a-section aok-relative s-image-tall-aspect']//img[@class='s-image']"));
		s1.click();
	}
	
	void addToCart() {
		WebElement buy = driver.findElement(By.id("buy-now-button"));
		
		buy.click();
	}	
	
	
	
	
	public static void main(String[] args) {
		Login l1 = new Login();
		l1.URL();
		l1.validatetitle();
		l1.search();
		l1.selection();
		l1.addToCart();
		
	}

}

