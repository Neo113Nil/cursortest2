package com.unity3d.ads.core.data.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdRevenueOrigin.kt */
/* loaded from: classes14.dex */
public final class AdRevenueOrigin {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdRevenueOrigin[] $VALUES;
    public static final AdRevenueOrigin AUTOMATIC_COLLECTION = new AdRevenueOrigin("AUTOMATIC_COLLECTION", 0);

    private static final /* synthetic */ AdRevenueOrigin[] $values() {
        return new AdRevenueOrigin[]{AUTOMATIC_COLLECTION};
    }

    static {
        AdRevenueOrigin[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private AdRevenueOrigin(String str, int i) {
    }

    public static zrp<AdRevenueOrigin> getEntries() {
        return $ENTRIES;
    }

    public static AdRevenueOrigin valueOf(String str) {
        return (AdRevenueOrigin) Enum.valueOf(AdRevenueOrigin.class, str);
    }

    public static AdRevenueOrigin[] values() {
        return (AdRevenueOrigin[]) $VALUES.clone();
    }
}
