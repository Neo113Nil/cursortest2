package com.ironsource.adqualitysdk.sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes4.dex */
public enum ISAdQualityMediationNetwork {
    UNKNOWN(-1),
    ADMOB(0),
    DT_FAIR_BID(1),
    HELIUM(2),
    LEVEL_PLAY(3),
    MAX(4),
    UNITY(5),
    SELF_MEDIATED(6),
    OTHER(7);


    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f53;

    ISAdQualityMediationNetwork(int i) {
        this.f53 = i;
    }

    @Deprecated
    public static ISAdQualityMediationNetwork fromInt(int i) {
        switch (i) {
            case -1:
                return UNKNOWN;
            case 0:
                return ADMOB;
            case 1:
                return DT_FAIR_BID;
            case 2:
                return HELIUM;
            case 3:
                return LEVEL_PLAY;
            case 4:
                return MAX;
            case 5:
                return UNITY;
            case 6:
                return SELF_MEDIATED;
            case 7:
                return OTHER;
            default:
                return null;
        }
    }

    @Deprecated
    public int getValue() {
        return this.f53;
    }
}
