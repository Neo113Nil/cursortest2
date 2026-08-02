package com.vk.auth.main;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.ads.BuildConfig;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.zrp;

/* compiled from: AuthStatSender.kt */
/* loaded from: classes.dex */
public interface AuthStatSender {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthStatSender.kt */
    /* loaded from: classes15.dex */
    public static final class Element {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Element[] $VALUES;
        public static final Element AVATAR_BUTTON;
        public static final Element CHOOSE_COUNTRY_BUTTON;
        public static final Element CONTINUE_BUTTON;
        public static final Element FORGOT_PASSWORD_BUTTON;
        public static final Element LOGIN_BUTTON;
        public static final Element PRIVACY_LINK;
        public static final Element RESEND_CODE_BUTTON;
        public static final Element SIGN_UP_BUTTON;
        public static final Element TERMS_LINK;
        private final String alias;

        static {
            Element element = new Element("LOGIN_BUTTON", 0, "login");
            LOGIN_BUTTON = element;
            Element element2 = new Element("FORGOT_PASSWORD_BUTTON", 1, "forgot_pass");
            FORGOT_PASSWORD_BUTTON = element2;
            Element element3 = new Element("SIGN_UP_BUTTON", 2, "registration");
            SIGN_UP_BUTTON = element3;
            Element element4 = new Element("CONTINUE_BUTTON", 3, "continue");
            CONTINUE_BUTTON = element4;
            Element element5 = new Element("TERMS_LINK", 4, "regulations");
            TERMS_LINK = element5;
            Element element6 = new Element("PRIVACY_LINK", 5, "regulations");
            PRIVACY_LINK = element6;
            Element element7 = new Element("CHOOSE_COUNTRY_BUTTON", 6, "country");
            CHOOSE_COUNTRY_BUTTON = element7;
            Element element8 = new Element("AVATAR_BUTTON", 7, "avatar");
            AVATAR_BUTTON = element8;
            Element element9 = new Element("RESEND_CODE_BUTTON", 8, "no_code");
            RESEND_CODE_BUTTON = element9;
            Element[] elementArr = {element, element2, element3, element4, element5, element6, element7, element8, element9};
            $VALUES = elementArr;
            $ENTRIES = new asp(elementArr);
        }

        public Element(String str, int i, String str2) {
            this.alias = str2;
        }

        public static Element valueOf(String str) {
            return (Element) Enum.valueOf(Element.class, str);
        }

        public static Element[] values() {
            return (Element[]) $VALUES.clone();
        }

        public final String h() {
            return this.alias;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthStatSender.kt */
    /* loaded from: classes15.dex */
    public static final class Screen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        public static final Screen BIRTHDAY;
        public static final Screen CHOOSE_METHOD;
        public static final Screen EXCHANGE_LOGIN;
        public static final Screen EXISTING_PROFILE;
        public static final Screen LOGIN;
        public static final Screen LOGIN_PASSWORD;
        public static final Screen NAME;
        public static final Screen PASSWORD;
        public static final Screen PHONE;
        public static final Screen PHONE_CODE;
        public static final Screen SUCCESS_UNLINK_PHONE;
        public static final Screen SUCCESS_VALIDATE_PHONE;
        public static final Screen UNKNOWN;
        public static final Screen URL_CHECK;
        public static final Screen VERIFICATION_ASK_NUMBER;
        private final String alias;

        static {
            Screen screen = new Screen("CHOOSE_METHOD", 0, "start");
            CHOOSE_METHOD = screen;
            Screen screen2 = new Screen("LOGIN_PASSWORD", 1, "start");
            LOGIN_PASSWORD = screen2;
            Screen screen3 = new Screen("EXCHANGE_LOGIN", 2, "start");
            EXCHANGE_LOGIN = screen3;
            Screen screen4 = new Screen("LOGIN", 3, "start");
            LOGIN = screen4;
            Screen screen5 = new Screen("PHONE", 4, "phone");
            PHONE = screen5;
            Screen screen6 = new Screen("PHONE_CODE", 5, "phone_code");
            PHONE_CODE = screen6;
            Screen screen7 = new Screen("URL_CHECK", 6, "url_check");
            URL_CHECK = screen7;
            Screen screen8 = new Screen("EXISTING_PROFILE", 7, "existing_profile");
            EXISTING_PROFILE = screen8;
            Screen screen9 = new Screen("BIRTHDAY", 8, "birthday");
            BIRTHDAY = screen9;
            Screen screen10 = new Screen("NAME", 9, "information");
            NAME = screen10;
            Screen screen11 = new Screen("PASSWORD", 10, LoginApiConstants.PARAM_NAME_PASSWORD);
            PASSWORD = screen11;
            Screen screen12 = new Screen("VERIFICATION_ASK_NUMBER", 11, "verification_ask_number");
            VERIFICATION_ASK_NUMBER = screen12;
            Screen screen13 = new Screen("SUCCESS_UNLINK_PHONE", 12, "success_unlink_phone");
            SUCCESS_UNLINK_PHONE = screen13;
            Screen screen14 = new Screen("SUCCESS_VALIDATE_PHONE", 13, "success_validate_phone");
            SUCCESS_VALIDATE_PHONE = screen14;
            Screen screen15 = new Screen(GrsBaseInfo.CountryCodeSource.UNKNOWN, 14, "unknown");
            UNKNOWN = screen15;
            Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6, screen7, screen8, screen9, screen10, screen11, screen12, screen13, screen14, screen15};
            $VALUES = screenArr;
            $ENTRIES = new asp(screenArr);
        }

        public Screen(String str, int i, String str2) {
            this.alias = str2;
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }

        public final String h() {
            return this.alias;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthStatSender.kt */
    /* loaded from: classes15.dex */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status DEFAULT;
        public static final Status EXCHANGE_LOGIN;
        public static final Status LOGIN;
        public static final Status REGISTRATION;
        public static final Status SEX;
        private final String alias;

        static {
            Status status = new Status("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = status;
            Status status2 = new Status("LOGIN", 1, "login");
            LOGIN = status2;
            Status status3 = new Status("EXCHANGE_LOGIN", 2, "login_saved_acc");
            EXCHANGE_LOGIN = status3;
            Status status4 = new Status("REGISTRATION", 3, "registration");
            REGISTRATION = status4;
            Status status5 = new Status("SEX", 4, "sex");
            SEX = status5;
            Status[] statusArr = {status, status2, status3, status4, status5};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status(String str, int i, String str2) {
            this.alias = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String h() {
            return this.alias;
        }
    }

    void a(Screen screen);

    void b(Screen screen);

    void c(Screen screen, Status status, Element element);

    void d(Screen screen);

    void e(Screen screen);

    void f(Screen screen);

    void g(Screen screen);

    void h(Screen screen);

    void i(Screen screen);
}
