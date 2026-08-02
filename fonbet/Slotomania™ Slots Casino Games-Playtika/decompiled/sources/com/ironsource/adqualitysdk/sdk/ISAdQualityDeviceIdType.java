package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes6.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* renamed from: ﾇ, reason: contains not printable characters */
    private final int f59;

    ISAdQualityDeviceIdType(int i) {
        this.f59 = i;
    }

    public final int getValue() {
        return this.f59;
    }

    public static ISAdQualityDeviceIdType fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return GAID;
        }
        if (i != 2) {
            return null;
        }
        return IDFA;
    }
}
