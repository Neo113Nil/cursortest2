package com.ironsource.adqualitysdk.sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes4.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f47;

    ISAdQualityDeviceIdType(int i) {
        this.f47 = i;
    }

    @Deprecated
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

    @Deprecated
    public int getValue() {
        return this.f47;
    }
}
