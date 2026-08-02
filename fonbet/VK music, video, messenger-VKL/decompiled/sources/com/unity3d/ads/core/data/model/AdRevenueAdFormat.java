package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.Result;
import xsna.asp;
import xsna.zcl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdRevenueAdFormat.kt */
/* loaded from: classes14.dex */
public final class AdRevenueAdFormat {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdRevenueAdFormat[] $VALUES;
    public static final Companion Companion;
    public static final AdRevenueAdFormat BANNER = new AdRevenueAdFormat("BANNER", 0);
    public static final AdRevenueAdFormat MREC = new AdRevenueAdFormat("MREC", 1);
    public static final AdRevenueAdFormat INTERSTITIAL = new AdRevenueAdFormat("INTERSTITIAL", 2);
    public static final AdRevenueAdFormat REWARDED = new AdRevenueAdFormat("REWARDED", 3);
    public static final AdRevenueAdFormat NATIVE = new AdRevenueAdFormat("NATIVE", 4);

    /* compiled from: AdRevenueAdFormat.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AdRevenueAdFormat fromString(String str) {
            Object failure;
            if (str == null) {
                return null;
            }
            try {
                failure = AdRevenueAdFormat.valueOf(str.toUpperCase(Locale.ROOT));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            return (AdRevenueAdFormat) (failure instanceof Result.Failure ? null : failure);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AdRevenueAdFormat[] $values() {
        return new AdRevenueAdFormat[]{BANNER, MREC, INTERSTITIAL, REWARDED, NATIVE};
    }

    static {
        AdRevenueAdFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
        Companion = new Companion(null);
    }

    private AdRevenueAdFormat(String str, int i) {
    }

    public static zrp<AdRevenueAdFormat> getEntries() {
        return $ENTRIES;
    }

    public static AdRevenueAdFormat valueOf(String str) {
        return (AdRevenueAdFormat) Enum.valueOf(AdRevenueAdFormat.class, str);
    }

    public static AdRevenueAdFormat[] values() {
        return (AdRevenueAdFormat[]) $VALUES.clone();
    }
}
