package com.vk.auth.restore;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RestoreConstants.kt */
/* loaded from: classes15.dex */
public final class RestoreNavValue {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RestoreNavValue[] $VALUES;
    public static final RestoreNavValue AUTH_ALERT_NO_AVAILABLE_FACTORS;
    public static final RestoreNavValue AUTH_MAIL_RU;
    public static final RestoreNavValue AUTH_PRIMARY_FACTOR_CHOICE;
    public static final RestoreNavValue AUTH_SCREEN;
    public static final RestoreNavValue AUTH_SERVICE_EXTENDED_ACCESS_TOKEN_SCREEN;
    public static final RestoreNavValue AUTH_SERVICE_EXTENDED_SILENT_TOKEN_SCREEN;
    public static final RestoreNavValue LOGIN_PASSWORD_SCREEN;
    public static final RestoreNavValue REG_EDU_SCREEN;
    public static final RestoreNavValue REG_SCREEN;
    private final String value;

    static {
        RestoreNavValue restoreNavValue = new RestoreNavValue("AUTH_SCREEN", 0, "auth_forgot_password");
        AUTH_SCREEN = restoreNavValue;
        RestoreNavValue restoreNavValue2 = new RestoreNavValue("LOGIN_PASSWORD_SCREEN", 1, "auth_login_pwd_screen");
        LOGIN_PASSWORD_SCREEN = restoreNavValue2;
        RestoreNavValue restoreNavValue3 = new RestoreNavValue("REG_SCREEN", 2, "reg_forgot_pwd");
        REG_SCREEN = restoreNavValue3;
        RestoreNavValue restoreNavValue4 = new RestoreNavValue("REG_EDU_SCREEN", 3, "reg_edu_email_pwd_forgot_pwd");
        REG_EDU_SCREEN = restoreNavValue4;
        RestoreNavValue restoreNavValue5 = new RestoreNavValue("AUTH_SERVICE_EXTENDED_ACCESS_TOKEN_SCREEN", 4, "auth_service_extended_access_token");
        AUTH_SERVICE_EXTENDED_ACCESS_TOKEN_SCREEN = restoreNavValue5;
        RestoreNavValue restoreNavValue6 = new RestoreNavValue("AUTH_SERVICE_EXTENDED_SILENT_TOKEN_SCREEN", 5, "auth_service_extended_silent_token");
        AUTH_SERVICE_EXTENDED_SILENT_TOKEN_SCREEN = restoreNavValue6;
        RestoreNavValue restoreNavValue7 = new RestoreNavValue("AUTH_PRIMARY_FACTOR_CHOICE", 6, "auth_primary_factor_choice");
        AUTH_PRIMARY_FACTOR_CHOICE = restoreNavValue7;
        RestoreNavValue restoreNavValue8 = new RestoreNavValue("AUTH_ALERT_NO_AVAILABLE_FACTORS", 7, "auth_alert_no_available_factors");
        AUTH_ALERT_NO_AVAILABLE_FACTORS = restoreNavValue8;
        RestoreNavValue restoreNavValue9 = new RestoreNavValue("AUTH_MAIL_RU", 8, "auth_mail_ru");
        AUTH_MAIL_RU = restoreNavValue9;
        RestoreNavValue[] restoreNavValueArr = {restoreNavValue, restoreNavValue2, restoreNavValue3, restoreNavValue4, restoreNavValue5, restoreNavValue6, restoreNavValue7, restoreNavValue8, restoreNavValue9};
        $VALUES = restoreNavValueArr;
        $ENTRIES = new asp(restoreNavValueArr);
    }

    public RestoreNavValue(String str, int i, String str2) {
        this.value = str2;
    }

    public static RestoreNavValue valueOf(String str) {
        return (RestoreNavValue) Enum.valueOf(RestoreNavValue.class, str);
    }

    public static RestoreNavValue[] values() {
        return (RestoreNavValue[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
