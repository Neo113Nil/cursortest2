package com.vk.imageloader.fresco;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FrescoQualityCallback.kt */
/* loaded from: classes2.dex */
public final class Quality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Quality[] $VALUES;
    public static final Quality BEST;
    public static final Quality LOWEST;
    public static final Quality SUITABLE;

    static {
        Quality quality = new Quality("BEST", 0);
        BEST = quality;
        Quality quality2 = new Quality("SUITABLE", 1);
        SUITABLE = quality2;
        Quality quality3 = new Quality("LOWEST", 2);
        LOWEST = quality3;
        Quality[] qualityArr = {quality, quality2, quality3};
        $VALUES = qualityArr;
        $ENTRIES = new asp(qualityArr);
    }

    public Quality() {
        throw null;
    }

    public static Quality valueOf(String str) {
        return (Quality) Enum.valueOf(Quality.class, str);
    }

    public static Quality[] values() {
        return (Quality[]) $VALUES.clone();
    }
}
