package com.vk.cachecontrol.api;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheTarget.kt */
/* loaded from: classes.dex */
public final class CacheTarget {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CacheTarget[] $VALUES;
    public static final CacheTarget DOWNLOADED_VIDEOS;
    public static final CacheTarget DOWNLOADS;
    public static final CacheTarget OTHER;
    public static final CacheTarget PHOTOS;
    public static final CacheTarget SYSTEM;
    public static final CacheTarget VIDEOS;

    static {
        CacheTarget cacheTarget = new CacheTarget("PHOTOS", 0);
        PHOTOS = cacheTarget;
        CacheTarget cacheTarget2 = new CacheTarget("VIDEOS", 1);
        VIDEOS = cacheTarget2;
        CacheTarget cacheTarget3 = new CacheTarget("DOWNLOADS", 2);
        DOWNLOADS = cacheTarget3;
        CacheTarget cacheTarget4 = new CacheTarget("DOWNLOADED_VIDEOS", 3);
        DOWNLOADED_VIDEOS = cacheTarget4;
        CacheTarget cacheTarget5 = new CacheTarget(NativeAdContent.ViewTag.OTHER, 4);
        OTHER = cacheTarget5;
        CacheTarget cacheTarget6 = new CacheTarget("SYSTEM", 5);
        SYSTEM = cacheTarget6;
        CacheTarget[] cacheTargetArr = {cacheTarget, cacheTarget2, cacheTarget3, cacheTarget4, cacheTarget5, cacheTarget6};
        $VALUES = cacheTargetArr;
        $ENTRIES = new asp(cacheTargetArr);
    }

    public CacheTarget() {
        throw null;
    }

    public static CacheTarget valueOf(String str) {
        return (CacheTarget) Enum.valueOf(CacheTarget.class, str);
    }

    public static CacheTarget[] values() {
        return (CacheTarget[]) $VALUES.clone();
    }
}
