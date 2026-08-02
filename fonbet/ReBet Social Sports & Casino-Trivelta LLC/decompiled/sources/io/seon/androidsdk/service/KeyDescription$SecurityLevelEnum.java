package io.seon.androidsdk.service;

/* loaded from: classes3.dex */
enum KeyDescription$SecurityLevelEnum {
    SOFTWARE,
    TRUSTED_ENVIRONMENT,
    STRONGBOX,
    ERROR;

    public static KeyDescription$SecurityLevelEnum get(Integer num) {
        int intValue;
        try {
            intValue = num.intValue();
        } catch (Exception unused) {
        }
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? ERROR : STRONGBOX : TRUSTED_ENVIRONMENT : SOFTWARE;
    }
}
