package com.vk.ads.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NativeAdAnalyticsData.kt */
/* loaded from: classes14.dex */
public final class NativeAdType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NativeAdType[] $VALUES;
    public static final NativeAdType APPLOVIN;
    public static final NativeAdType YANDEX;

    static {
        NativeAdType nativeAdType = new NativeAdType("APPLOVIN", 0);
        APPLOVIN = nativeAdType;
        NativeAdType nativeAdType2 = new NativeAdType("YANDEX", 1);
        YANDEX = nativeAdType2;
        NativeAdType[] nativeAdTypeArr = {nativeAdType, nativeAdType2};
        $VALUES = nativeAdTypeArr;
        $ENTRIES = new asp(nativeAdTypeArr);
    }

    public NativeAdType() {
        throw null;
    }

    public static NativeAdType valueOf(String str) {
        return (NativeAdType) Enum.valueOf(NativeAdType.class, str);
    }

    public static NativeAdType[] values() {
        return (NativeAdType[]) $VALUES.clone();
    }
}
