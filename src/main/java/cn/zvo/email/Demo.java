package cn.zvo.email;

/**
 * 发送邮件的DEMO
 * @author 管雷鸣
 *
 */
public class Demo {
	public static void main(String[] args) {

		String host = "smtp.163.com";
		String username = "xnx3_cs@163.com"; //您的163邮箱
		String password = "您邮箱的登录密码";
		
		Email mail = new Email(host, username, password); //创建
		mail.sendHtmlMail("mail@xnx3.com", "邮件的标题", "邮件的内容"); //给 mail@xnx3.com 的邮箱发送一封邮件
		
	}
}
