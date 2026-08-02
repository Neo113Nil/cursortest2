package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RateLimiterConfig.kt */
/* loaded from: classes6.dex */
public final class RateMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RateMode[] $VALUES;
    public static final a Companion;
    public static final RateMode LEAKY_BUCKET;
    public static final RateMode LEAKY_BUCKET_BURST;
    public static final RateMode SLIDING_WINDOW;
    public static final RateMode TOKEN_BUCKET;

    /* compiled from: RateLimiterConfig.kt */
    public static final class a {
        public static RateMode a(String str) {
            switch (str.hashCode()) {
                case -1934166239:
                    if (str.equals("sliding_window")) {
                        return RateMode.SLIDING_WINDOW;
                    }
                    return null;
                case -1754918160:
                    if (str.equals("token_bucket")) {
                        return RateMode.TOKEN_BUCKET;
                    }
                    return null;
                case -296548141:
                    if (str.equals("leaky_bucket")) {
                        return RateMode.LEAKY_BUCKET;
                    }
                    return null;
                case 392702644:
                    if (str.equals("leaky_bucket_burst")) {
                        return RateMode.LEAKY_BUCKET_BURST;
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    static {
        RateMode rateMode = new RateMode("SLIDING_WINDOW", 0);
        SLIDING_WINDOW = rateMode;
        RateMode rateMode2 = new RateMode("LEAKY_BUCKET_BURST", 1);
        LEAKY_BUCKET_BURST = rateMode2;
        RateMode rateMode3 = new RateMode("TOKEN_BUCKET", 2);
        TOKEN_BUCKET = rateMode3;
        RateMode rateMode4 = new RateMode("LEAKY_BUCKET", 3);
        LEAKY_BUCKET = rateMode4;
        RateMode[] rateModeArr = {rateMode, rateMode2, rateMode3, rateMode4};
        $VALUES = rateModeArr;
        $ENTRIES = new asp(rateModeArr);
        Companion = new a();
    }

    public RateMode() {
        throw null;
    }

    public static RateMode valueOf(String str) {
        return (RateMode) Enum.valueOf(RateMode.class, str);
    }

    public static RateMode[] values() {
        return (RateMode[]) $VALUES.clone();
    }
}
