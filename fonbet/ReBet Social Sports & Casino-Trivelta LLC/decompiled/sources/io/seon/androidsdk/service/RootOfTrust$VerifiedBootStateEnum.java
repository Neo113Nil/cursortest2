package io.seon.androidsdk.service;

import java.math.BigInteger;

/* loaded from: classes3.dex */
enum RootOfTrust$VerifiedBootStateEnum {
    VERIFIED,
    SELF_SIGNED,
    UNVERIFIED,
    FAILED,
    ERROR;

    public static RootOfTrust$VerifiedBootStateEnum get(BigInteger bigInteger) {
        int intValue;
        try {
            intValue = bigInteger.intValue();
        } catch (Exception unused) {
        }
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? ERROR : FAILED : UNVERIFIED : SELF_SIGNED : VERIFIED;
    }
}
