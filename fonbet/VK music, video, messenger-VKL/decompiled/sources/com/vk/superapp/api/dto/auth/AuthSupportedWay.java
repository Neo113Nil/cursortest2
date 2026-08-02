package com.vk.superapp.api.dto.auth;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthSupportedWay.kt */
/* loaded from: classes6.dex */
public final class AuthSupportedWay {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthSupportedWay[] $VALUES;
    public static final AuthSupportedWay CALLRESET;
    public static final AuthSupportedWay CALL_IN;
    public static final AuthSupportedWay CODEGEN;
    public static final a Companion;
    public static final AuthSupportedWay EMAIL;
    public static final AuthSupportedWay LIBVERIFY;
    public static final AuthSupportedWay MAX_CODE;
    public static final AuthSupportedWay MAX_MESSENGER;
    public static final AuthSupportedWay OFFICIAL_MESSENGER;
    public static final AuthSupportedWay PASSKEY;
    public static final AuthSupportedWay PASSWORD;
    public static final AuthSupportedWay PUSH;
    public static final AuthSupportedWay RESERVE_CODE;
    public static final AuthSupportedWay SMS;
    private final String value;

    /* compiled from: AuthSupportedWay.kt */
    public static final class a {
    }

    static {
        AuthSupportedWay authSupportedWay = new AuthSupportedWay("PUSH", 0, "push");
        PUSH = authSupportedWay;
        AuthSupportedWay authSupportedWay2 = new AuthSupportedWay(CommonConstant.RETKEY.EMAIL, 1, "email");
        EMAIL = authSupportedWay2;
        AuthSupportedWay authSupportedWay3 = new AuthSupportedWay("SMS", 2, "sms");
        SMS = authSupportedWay3;
        AuthSupportedWay authSupportedWay4 = new AuthSupportedWay("CALLRESET", 3, "callreset");
        CALLRESET = authSupportedWay4;
        AuthSupportedWay authSupportedWay5 = new AuthSupportedWay("PASSWORD", 4, LoginApiConstants.PARAM_NAME_PASSWORD);
        PASSWORD = authSupportedWay5;
        AuthSupportedWay authSupportedWay6 = new AuthSupportedWay("RESERVE_CODE", 5, "reserve_code");
        RESERVE_CODE = authSupportedWay6;
        AuthSupportedWay authSupportedWay7 = new AuthSupportedWay("CODEGEN", 6, "codegen");
        CODEGEN = authSupportedWay7;
        AuthSupportedWay authSupportedWay8 = new AuthSupportedWay("PASSKEY", 7, "passkey");
        PASSKEY = authSupportedWay8;
        AuthSupportedWay authSupportedWay9 = new AuthSupportedWay("LIBVERIFY", 8, "libverify");
        LIBVERIFY = authSupportedWay9;
        AuthSupportedWay authSupportedWay10 = new AuthSupportedWay("CALL_IN", 9, "call_in");
        CALL_IN = authSupportedWay10;
        AuthSupportedWay authSupportedWay11 = new AuthSupportedWay("MAX_MESSENGER", 10, "max_messenger");
        MAX_MESSENGER = authSupportedWay11;
        AuthSupportedWay authSupportedWay12 = new AuthSupportedWay("MAX_CODE", 11, "max_code");
        MAX_CODE = authSupportedWay12;
        AuthSupportedWay authSupportedWay13 = new AuthSupportedWay("OFFICIAL_MESSENGER", 12, "official_messenger");
        OFFICIAL_MESSENGER = authSupportedWay13;
        AuthSupportedWay[] authSupportedWayArr = {authSupportedWay, authSupportedWay2, authSupportedWay3, authSupportedWay4, authSupportedWay5, authSupportedWay6, authSupportedWay7, authSupportedWay8, authSupportedWay9, authSupportedWay10, authSupportedWay11, authSupportedWay12, authSupportedWay13};
        $VALUES = authSupportedWayArr;
        $ENTRIES = new asp(authSupportedWayArr);
        Companion = new a();
    }

    public AuthSupportedWay(String str, int i, String str2) {
        this.value = str2;
    }

    public static AuthSupportedWay valueOf(String str) {
        return (AuthSupportedWay) Enum.valueOf(AuthSupportedWay.class, str);
    }

    public static AuthSupportedWay[] values() {
        return (AuthSupportedWay[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
