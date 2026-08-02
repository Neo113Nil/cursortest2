package com.vk.superapp.core.api.models;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ValidationType.kt */
/* loaded from: classes6.dex */
public final class ValidationType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ValidationType[] $VALUES;
    public static final ValidationType APP;
    public static final ValidationType CALL_RESET;
    public static final a Companion;
    public static final ValidationType EMAIL;
    public static final ValidationType LIBVERIFY;
    public static final ValidationType PHONE;
    public static final ValidationType PHONE_OAUTH;
    public static final ValidationType PHONE_OAUTH_CONFIRMATION;
    public static final ValidationType PUSH;
    public static final ValidationType SMS;
    public static final ValidationType URL;
    private final String jsonValue;

    /* compiled from: ValidationType.kt */
    public static final class a {
        public static ValidationType a(String str) {
            ValidationType validationType;
            ValidationType[] values = ValidationType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    validationType = null;
                    break;
                }
                validationType = values[i];
                if (epx.f(validationType.h(), str)) {
                    break;
                }
                i++;
            }
            return validationType == null ? ValidationType.URL : validationType;
        }
    }

    static {
        ValidationType validationType = new ValidationType("SMS", 0, "2fa_sms");
        SMS = validationType;
        ValidationType validationType2 = new ValidationType("PUSH", 1, "2fa_push");
        PUSH = validationType2;
        ValidationType validationType3 = new ValidationType(CommonConstant.RETKEY.EMAIL, 2, "2fa_email");
        EMAIL = validationType3;
        ValidationType validationType4 = new ValidationType("APP", 3, "2fa_app");
        APP = validationType4;
        ValidationType validationType5 = new ValidationType("LIBVERIFY", 4, "2fa_libverify");
        LIBVERIFY = validationType5;
        ValidationType validationType6 = new ValidationType("CALL_RESET", 5, "2fa_callreset");
        CALL_RESET = validationType6;
        ValidationType validationType7 = new ValidationType("PHONE", 6, "phone");
        PHONE = validationType7;
        ValidationType validationType8 = new ValidationType("PHONE_OAUTH", 7, "phone_oauth");
        PHONE_OAUTH = validationType8;
        ValidationType validationType9 = new ValidationType("URL", 8, "");
        URL = validationType9;
        ValidationType validationType10 = new ValidationType("PHONE_OAUTH_CONFIRMATION", 9, "phone_oauth_confirmation");
        PHONE_OAUTH_CONFIRMATION = validationType10;
        ValidationType[] validationTypeArr = {validationType, validationType2, validationType3, validationType4, validationType5, validationType6, validationType7, validationType8, validationType9, validationType10};
        $VALUES = validationTypeArr;
        $ENTRIES = new asp(validationTypeArr);
        Companion = new a();
    }

    public ValidationType(String str, int i, String str2) {
        this.jsonValue = str2;
    }

    public static ValidationType valueOf(String str) {
        return (ValidationType) Enum.valueOf(ValidationType.class, str);
    }

    public static ValidationType[] values() {
        return (ValidationType[]) $VALUES.clone();
    }

    public final String h() {
        return this.jsonValue;
    }
}
