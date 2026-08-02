package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$RegistrationFieldItem {

    @pmi0("end_interaction_time")
    private final String endInteractionTime;

    @pmi0("name")
    private final Name name;

    @pmi0("start_interaction_time")
    private final String startInteractionTime;

    @pmi0("value")
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("account_found_by_number")
        public static final Name ACCOUNT_FOUND_BY_NUMBER;

        @pmi0("account_found_seamlessly")
        public static final Name ACCOUNT_FOUND_SEAMLESSLY;

        @pmi0("app_id")
        public static final Name APP_ID;

        @pmi0("auth_code_id")
        public static final Name AUTH_CODE_ID;

        @pmi0("auth_existing_account_open")
        public static final Name AUTH_EXISTING_ACCOUNT_OPEN;

        @pmi0("bday")
        public static final Name BDAY;

        @pmi0("captcha")
        public static final Name CAPTCHA;

        @pmi0("contents_auths")
        public static final Name CONTENTS_AUTHS;

        @pmi0("country")
        public static final Name COUNTRY;

        @pmi0("email")
        public static final Name EMAIL;

        @pmi0("external_accounts_showing")
        public static final Name EXTERNAL_ACCOUNTS_SHOWING;

        @pmi0("first_name")
        public static final Name FIRST_NAME;

        @pmi0("friend_ask")
        public static final Name FRIEND_ASK;

        @pmi0("full_name")
        public static final Name FULL_NAME;

        @pmi0("is_another_s_computer_on")
        public static final Name IS_ANOTHER_S_COMPUTER_ON;

        @pmi0("is_first_account")
        public static final Name IS_FIRST_ACCOUNT;

        @pmi0("is_net_error")
        public static final Name IS_NET_ERROR;

        @pmi0("is_old_service_number")
        public static final Name IS_OLD_SERVICE_NUMBER;

        @pmi0("is_remember_browser_on")
        public static final Name IS_REMEMBER_BROWSER_ON;

        @pmi0("last_name")
        public static final Name LAST_NAME;

        @pmi0(LoginApiConstants.PARAM_NAME_PASSWORD)
        public static final Name PASSWORD;

        @pmi0("password_verify")
        public static final Name PASSWORD_VERIFY;

        @pmi0("phone_country")
        public static final Name PHONE_COUNTRY;

        @pmi0("phone_number")
        public static final Name PHONE_NUMBER;

        @pmi0("photo")
        public static final Name PHOTO;

        @pmi0("qr_code_id")
        public static final Name QR_CODE_ID;

        @pmi0("qr_code_source")
        public static final Name QR_CODE_SOURCE;

        @pmi0("rules_accept")
        public static final Name RULES_ACCEPT;

        @pmi0("select_country_name")
        public static final Name SELECT_COUNTRY_NAME;

        @pmi0("sex")
        public static final Name SEX;

        @pmi0("sms_code")
        public static final Name SMS_CODE;

        @pmi0("usecase")
        public static final Name USECASE;

        @pmi0("usecase_explanation")
        public static final Name USECASE_EXPLANATION;

        @pmi0("verification_type")
        public static final Name VERIFICATION_TYPE;

        static {
            Name name = new Name("PHONE_NUMBER", 0);
            PHONE_NUMBER = name;
            Name name2 = new Name("SMS_CODE", 1);
            SMS_CODE = name2;
            Name name3 = new Name("COUNTRY", 2);
            COUNTRY = name3;
            Name name4 = new Name("PHONE_COUNTRY", 3);
            PHONE_COUNTRY = name4;
            Name name5 = new Name("RULES_ACCEPT", 4);
            RULES_ACCEPT = name5;
            Name name6 = new Name("CAPTCHA", 5);
            CAPTCHA = name6;
            Name name7 = new Name("FIRST_NAME", 6);
            FIRST_NAME = name7;
            Name name8 = new Name("LAST_NAME", 7);
            LAST_NAME = name8;
            Name name9 = new Name("FULL_NAME", 8);
            FULL_NAME = name9;
            Name name10 = new Name("SEX", 9);
            SEX = name10;
            Name name11 = new Name("BDAY", 10);
            BDAY = name11;
            Name name12 = new Name("PASSWORD", 11);
            PASSWORD = name12;
            Name name13 = new Name("PASSWORD_VERIFY", 12);
            PASSWORD_VERIFY = name13;
            Name name14 = new Name("PHOTO", 13);
            PHOTO = name14;
            Name name15 = new Name("FRIEND_ASK", 14);
            FRIEND_ASK = name15;
            Name name16 = new Name("AUTH_EXISTING_ACCOUNT_OPEN", 15);
            AUTH_EXISTING_ACCOUNT_OPEN = name16;
            Name name17 = new Name("VERIFICATION_TYPE", 16);
            VERIFICATION_TYPE = name17;
            Name name18 = new Name("EXTERNAL_ACCOUNTS_SHOWING", 17);
            EXTERNAL_ACCOUNTS_SHOWING = name18;
            Name name19 = new Name(CommonConstant.RETKEY.EMAIL, 18);
            EMAIL = name19;
            Name name20 = new Name("SELECT_COUNTRY_NAME", 19);
            SELECT_COUNTRY_NAME = name20;
            Name name21 = new Name("IS_OLD_SERVICE_NUMBER", 20);
            IS_OLD_SERVICE_NUMBER = name21;
            Name name22 = new Name("ACCOUNT_FOUND_BY_NUMBER", 21);
            ACCOUNT_FOUND_BY_NUMBER = name22;
            Name name23 = new Name("ACCOUNT_FOUND_SEAMLESSLY", 22);
            ACCOUNT_FOUND_SEAMLESSLY = name23;
            Name name24 = new Name("IS_NET_ERROR", 23);
            IS_NET_ERROR = name24;
            Name name25 = new Name("CONTENTS_AUTHS", 24);
            CONTENTS_AUTHS = name25;
            Name name26 = new Name("QR_CODE_ID", 25);
            QR_CODE_ID = name26;
            Name name27 = new Name("QR_CODE_SOURCE", 26);
            QR_CODE_SOURCE = name27;
            Name name28 = new Name("APP_ID", 27);
            APP_ID = name28;
            Name name29 = new Name("AUTH_CODE_ID", 28);
            AUTH_CODE_ID = name29;
            Name name30 = new Name("IS_REMEMBER_BROWSER_ON", 29);
            IS_REMEMBER_BROWSER_ON = name30;
            Name name31 = new Name("IS_ANOTHER_S_COMPUTER_ON", 30);
            IS_ANOTHER_S_COMPUTER_ON = name31;
            Name name32 = new Name("USECASE", 31);
            USECASE = name32;
            Name name33 = new Name("USECASE_EXPLANATION", 32);
            USECASE_EXPLANATION = name33;
            Name name34 = new Name("IS_FIRST_ACCOUNT", 33);
            IS_FIRST_ACCOUNT = name34;
            Name[] nameArr = {name, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15, name16, name17, name18, name19, name20, name21, name22, name23, name24, name25, name26, name27, name28, name29, name30, name31, name32, name33, name34};
            $VALUES = nameArr;
            $ENTRIES = new asp(nameArr);
        }

        private Name(String str, int i) {
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    public SchemeStat$RegistrationFieldItem(Name name, String str, String str2, String str3) {
        this.name = name;
        this.startInteractionTime = str;
        this.endInteractionTime = str2;
        this.value = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$RegistrationFieldItem)) {
            return false;
        }
        SchemeStat$RegistrationFieldItem schemeStat$RegistrationFieldItem = (SchemeStat$RegistrationFieldItem) obj;
        return this.name == schemeStat$RegistrationFieldItem.name && epx.f(this.startInteractionTime, schemeStat$RegistrationFieldItem.startInteractionTime) && epx.f(this.endInteractionTime, schemeStat$RegistrationFieldItem.endInteractionTime) && epx.f(this.value, schemeStat$RegistrationFieldItem.value);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.startInteractionTime), 31, this.endInteractionTime);
        String str = this.value;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationFieldItem(name=");
        sb.append(this.name);
        sb.append(", startInteractionTime=");
        sb.append(this.startInteractionTime);
        sb.append(", endInteractionTime=");
        sb.append(this.endInteractionTime);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    public /* synthetic */ SchemeStat$RegistrationFieldItem(Name name, String str, String str2, String str3, int i, zcl zclVar) {
        this(name, str, str2, (i & 8) != 0 ? null : str3);
    }
}
