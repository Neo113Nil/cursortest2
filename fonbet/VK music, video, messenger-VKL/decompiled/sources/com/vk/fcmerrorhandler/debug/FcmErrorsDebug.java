package com.vk.fcmerrorhandler.debug;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FcmErrorsDebug.kt */
/* loaded from: classes18.dex */
public final class FcmErrorsDebug {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FcmErrorsDebug[] $VALUES;
    public static final FcmErrorsDebug FCM_AUTHENTICATION_FAILED_ERROR;
    public static final FcmErrorsDebug FCM_CUSTOM_API_TEST_ERROR;
    public static final FcmErrorsDebug FCM_FIS_AUTH_ERROR;
    public static final FcmErrorsDebug FCM_PHONE_REGISTRATION_ERROR_ERROR;
    public static final FcmErrorsDebug SERVICE_NOT_AVAILABLE_ERROR;

    static {
        FcmErrorsDebug fcmErrorsDebug = new FcmErrorsDebug("FCM_FIS_AUTH_ERROR", 0);
        FCM_FIS_AUTH_ERROR = fcmErrorsDebug;
        FcmErrorsDebug fcmErrorsDebug2 = new FcmErrorsDebug("FCM_AUTHENTICATION_FAILED_ERROR", 1);
        FCM_AUTHENTICATION_FAILED_ERROR = fcmErrorsDebug2;
        FcmErrorsDebug fcmErrorsDebug3 = new FcmErrorsDebug("FCM_PHONE_REGISTRATION_ERROR_ERROR", 2);
        FCM_PHONE_REGISTRATION_ERROR_ERROR = fcmErrorsDebug3;
        FcmErrorsDebug fcmErrorsDebug4 = new FcmErrorsDebug("SERVICE_NOT_AVAILABLE_ERROR", 3);
        SERVICE_NOT_AVAILABLE_ERROR = fcmErrorsDebug4;
        FcmErrorsDebug fcmErrorsDebug5 = new FcmErrorsDebug("FCM_CUSTOM_API_TEST_ERROR", 4);
        FCM_CUSTOM_API_TEST_ERROR = fcmErrorsDebug5;
        FcmErrorsDebug[] fcmErrorsDebugArr = {fcmErrorsDebug, fcmErrorsDebug2, fcmErrorsDebug3, fcmErrorsDebug4, fcmErrorsDebug5};
        $VALUES = fcmErrorsDebugArr;
        $ENTRIES = new asp(fcmErrorsDebugArr);
    }

    public FcmErrorsDebug() {
        throw null;
    }

    public static FcmErrorsDebug valueOf(String str) {
        return (FcmErrorsDebug) Enum.valueOf(FcmErrorsDebug.class, str);
    }

    public static FcmErrorsDebug[] values() {
        return (FcmErrorsDebug[]) $VALUES.clone();
    }
}
