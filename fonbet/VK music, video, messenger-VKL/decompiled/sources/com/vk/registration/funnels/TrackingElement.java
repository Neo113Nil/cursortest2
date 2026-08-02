package com.vk.registration.funnels;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import java.io.Serializable;
import xsna.asp;
import xsna.zrp;

/* compiled from: TrackingElement.kt */
/* loaded from: classes5.dex */
public interface TrackingElement extends Serializable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TrackingElement.kt */
    public static final class Registration implements TrackingElement {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Registration[] $VALUES;
        public static final Registration BDAY;
        public static final Registration CALL_LIST;
        public static final Registration CAPTCHA;
        public static final Registration COARSE_LOCATION;
        public static final Registration EMAIL;
        public static final Registration FIRST_NAME;
        public static final Registration FRIEND_ASK;
        public static final Registration FULL_NAME;
        public static final Registration LAST_NAME;
        public static final Registration LOCATION;
        public static final Registration PASSWORD;
        public static final Registration PASSWORD_VERIFY;
        public static final Registration PHONE_BOOK;
        public static final Registration PHONE_COUNTRY;
        public static final Registration PHONE_NUMBER;
        public static final Registration PHONE_STATE;
        public static final Registration PHOTO;
        public static final Registration PUSH;
        public static final Registration RULES_ACCEPT;
        public static final Registration SCREEN_TYPE;
        public static final Registration SELECT_COUNTRY_NAME;
        public static final Registration SEX;
        public static final Registration SMS_CODE;
        public static final Registration VALIDATION_FACTOR_FLOW;
        public static final Registration VERIFICATION_TYPE;
        public static final Registration WRITE_CONTACTS;
        private final SchemeStatSak$RegistrationFieldItem.Name statName;

        static {
            Registration registration = new Registration("PHONE_NUMBER", 0, SchemeStatSak$RegistrationFieldItem.Name.PHONE_NUMBER);
            PHONE_NUMBER = registration;
            Registration registration2 = new Registration("PHONE_COUNTRY", 1, SchemeStatSak$RegistrationFieldItem.Name.PHONE_COUNTRY);
            PHONE_COUNTRY = registration2;
            Registration registration3 = new Registration("RULES_ACCEPT", 2, SchemeStatSak$RegistrationFieldItem.Name.RULES_ACCEPT);
            RULES_ACCEPT = registration3;
            Registration registration4 = new Registration("SMS_CODE", 3, SchemeStatSak$RegistrationFieldItem.Name.SMS_CODE);
            SMS_CODE = registration4;
            Registration registration5 = new Registration("CAPTCHA", 4, SchemeStatSak$RegistrationFieldItem.Name.CAPTCHA);
            CAPTCHA = registration5;
            Registration registration6 = new Registration("FIRST_NAME", 5, SchemeStatSak$RegistrationFieldItem.Name.FIRST_NAME);
            FIRST_NAME = registration6;
            Registration registration7 = new Registration("LAST_NAME", 6, SchemeStatSak$RegistrationFieldItem.Name.LAST_NAME);
            LAST_NAME = registration7;
            Registration registration8 = new Registration("FULL_NAME", 7, SchemeStatSak$RegistrationFieldItem.Name.FULL_NAME);
            FULL_NAME = registration8;
            Registration registration9 = new Registration("SEX", 8, SchemeStatSak$RegistrationFieldItem.Name.SEX);
            SEX = registration9;
            Registration registration10 = new Registration("BDAY", 9, SchemeStatSak$RegistrationFieldItem.Name.BDAY);
            BDAY = registration10;
            Registration registration11 = new Registration("PASSWORD", 10, SchemeStatSak$RegistrationFieldItem.Name.PASSWORD);
            PASSWORD = registration11;
            Registration registration12 = new Registration("PASSWORD_VERIFY", 11, SchemeStatSak$RegistrationFieldItem.Name.PASSWORD_VERIFY);
            PASSWORD_VERIFY = registration12;
            Registration registration13 = new Registration("PHOTO", 12, SchemeStatSak$RegistrationFieldItem.Name.PHOTO);
            PHOTO = registration13;
            Registration registration14 = new Registration("FRIEND_ASK", 13, SchemeStatSak$RegistrationFieldItem.Name.FRIEND_ASK);
            FRIEND_ASK = registration14;
            Registration registration15 = new Registration("VERIFICATION_TYPE", 14, SchemeStatSak$RegistrationFieldItem.Name.VERIFICATION_TYPE);
            VERIFICATION_TYPE = registration15;
            Registration registration16 = new Registration(CommonConstant.RETKEY.EMAIL, 15, SchemeStatSak$RegistrationFieldItem.Name.EMAIL);
            EMAIL = registration16;
            Registration registration17 = new Registration("SELECT_COUNTRY_NAME", 16, SchemeStatSak$RegistrationFieldItem.Name.SELECT_COUNTRY_NAME);
            SELECT_COUNTRY_NAME = registration17;
            Registration registration18 = new Registration("VALIDATION_FACTOR_FLOW", 17, SchemeStatSak$RegistrationFieldItem.Name.VALIDATION_FACTOR_FLOW);
            VALIDATION_FACTOR_FLOW = registration18;
            Registration registration19 = new Registration("CALL_LIST", 18, SchemeStatSak$RegistrationFieldItem.Name.CALL_LIST);
            CALL_LIST = registration19;
            Registration registration20 = new Registration("PHONE_BOOK", 19, SchemeStatSak$RegistrationFieldItem.Name.PHONE_BOOK);
            PHONE_BOOK = registration20;
            Registration registration21 = new Registration("LOCATION", 20, SchemeStatSak$RegistrationFieldItem.Name.LOCATION);
            LOCATION = registration21;
            Registration registration22 = new Registration("PUSH", 21, SchemeStatSak$RegistrationFieldItem.Name.PUSH);
            PUSH = registration22;
            Registration registration23 = new Registration("PHONE_STATE", 22, SchemeStatSak$RegistrationFieldItem.Name.PHONE_STATE);
            PHONE_STATE = registration23;
            Registration registration24 = new Registration("WRITE_CONTACTS", 23, SchemeStatSak$RegistrationFieldItem.Name.WRITE_CONTACTS);
            WRITE_CONTACTS = registration24;
            Registration registration25 = new Registration("COARSE_LOCATION", 24, SchemeStatSak$RegistrationFieldItem.Name.COARSE_LOCATION);
            COARSE_LOCATION = registration25;
            Registration registration26 = new Registration("SCREEN_TYPE", 25, SchemeStatSak$RegistrationFieldItem.Name.SCREEN_TYPE);
            SCREEN_TYPE = registration26;
            Registration[] registrationArr = {registration, registration2, registration3, registration4, registration5, registration6, registration7, registration8, registration9, registration10, registration11, registration12, registration13, registration14, registration15, registration16, registration17, registration18, registration19, registration20, registration21, registration22, registration23, registration24, registration25, registration26};
            $VALUES = registrationArr;
            $ENTRIES = new asp(registrationArr);
        }

        public Registration(String str, int i, SchemeStatSak$RegistrationFieldItem.Name name) {
            this.statName = name;
        }

        public static Registration valueOf(String str) {
            return (Registration) Enum.valueOf(Registration.class, str);
        }

        public static Registration[] values() {
            return (Registration[]) $VALUES.clone();
        }

        public final SchemeStatSak$RegistrationFieldItem.Name h() {
            return this.statName;
        }
    }
}
