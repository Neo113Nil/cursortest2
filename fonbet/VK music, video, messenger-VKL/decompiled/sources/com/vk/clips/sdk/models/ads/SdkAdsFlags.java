package com.vk.clips.sdk.models.ads;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SdkClipsAdsFeaturesParams.kt */
/* loaded from: classes17.dex */
public final class SdkAdsFlags {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SdkAdsFlags[] $VALUES;
    public static final SdkAdsFlags HIDE_CLOSING_AD_BANNER;
    public static final SdkAdsFlags HIDE_FULLSCREEN_AD_BANNER;
    public static final SdkAdsFlags UNKNOWN;

    static {
        SdkAdsFlags sdkAdsFlags = new SdkAdsFlags(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = sdkAdsFlags;
        SdkAdsFlags sdkAdsFlags2 = new SdkAdsFlags("HIDE_CLOSING_AD_BANNER", 1);
        HIDE_CLOSING_AD_BANNER = sdkAdsFlags2;
        SdkAdsFlags sdkAdsFlags3 = new SdkAdsFlags("HIDE_FULLSCREEN_AD_BANNER", 2);
        HIDE_FULLSCREEN_AD_BANNER = sdkAdsFlags3;
        SdkAdsFlags[] sdkAdsFlagsArr = {sdkAdsFlags, sdkAdsFlags2, sdkAdsFlags3};
        $VALUES = sdkAdsFlagsArr;
        $ENTRIES = new asp(sdkAdsFlagsArr);
    }

    public SdkAdsFlags() {
        throw null;
    }

    public static SdkAdsFlags valueOf(String str) {
        return (SdkAdsFlags) Enum.valueOf(SdkAdsFlags.class, str);
    }

    public static SdkAdsFlags[] values() {
        return (SdkAdsFlags[]) $VALUES.clone();
    }
}
