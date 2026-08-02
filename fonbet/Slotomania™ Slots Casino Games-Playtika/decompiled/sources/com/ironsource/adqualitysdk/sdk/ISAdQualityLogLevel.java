package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes3.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* renamed from: ﾒ, reason: contains not printable characters */
    private final int f63;

    ISAdQualityLogLevel(int i) {
        this.f63 = i;
    }

    public final int getValue() {
        return this.f63;
    }

    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f63;
        return i != NONE.f63 && i >= iSAdQualityLogLevel.f63;
    }

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
}
