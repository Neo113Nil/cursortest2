package com.unity3d.ads;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdFormat.kt */
/* loaded from: classes14.dex */
public final class AdFormat {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdFormat[] $VALUES;
    public static final AdFormat UNSPECIFIED = new AdFormat("UNSPECIFIED", 0);
    public static final AdFormat INTERSTITIAL = new AdFormat("INTERSTITIAL", 1);
    public static final AdFormat REWARDED = new AdFormat("REWARDED", 2);
    public static final AdFormat BANNER = new AdFormat("BANNER", 3);

    private static final /* synthetic */ AdFormat[] $values() {
        return new AdFormat[]{UNSPECIFIED, INTERSTITIAL, REWARDED, BANNER};
    }

    static {
        AdFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private AdFormat(String str, int i) {
    }

    public static zrp<AdFormat> getEntries() {
        return $ENTRIES;
    }

    public static AdFormat valueOf(String str) {
        return (AdFormat) Enum.valueOf(AdFormat.class, str);
    }

    public static AdFormat[] values() {
        return (AdFormat[]) $VALUES.clone();
    }
}
