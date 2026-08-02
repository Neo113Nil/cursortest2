package com.ironsource.adqualitysdk.sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes4.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f51;

    ISAdQualityLogLevel(int i) {
        this.f51 = i;
    }

    @Deprecated
    public static ISAdQualityLogLevel fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i == 3) {
            return INFO;
        }
        if (i == 4) {
            return DEBUG;
        }
        if (i != 5) {
            return null;
        }
        return VERBOSE;
    }

    @Deprecated
    public int getValue() {
        return this.f51;
    }

    @Deprecated
    public boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f51;
        return i != NONE.f51 && i >= iSAdQualityLogLevel.f51;
    }
}
