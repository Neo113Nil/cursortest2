package com.vk.clips.sdk.shared.api.deps.video;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SdkVideoAdsType.kt */
/* loaded from: classes17.dex */
public final class SdkVideoAdsType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SdkVideoAdsType[] $VALUES;
    public static final a Companion;
    public static final SdkVideoAdsType MAIL_PROMOTED_SHORT_VIDEO;
    public static final SdkVideoAdsType MAIL_SHORT_VIDEO;
    public static final SdkVideoAdsType MAIL_SHORT_VIDEO_KNOWN_OWNER;
    public static final SdkVideoAdsType MY_TARGET_VIDEO;
    public static final SdkVideoAdsType UNKNOWN;
    public static final SdkVideoAdsType VK_SHORT_VIDEO;
    private final String key;

    /* compiled from: SdkVideoAdsType.kt */
    public static final class a {
    }

    static {
        SdkVideoAdsType sdkVideoAdsType = new SdkVideoAdsType("VK_SHORT_VIDEO", 0, "ads_vk_short_video");
        VK_SHORT_VIDEO = sdkVideoAdsType;
        SdkVideoAdsType sdkVideoAdsType2 = new SdkVideoAdsType("MAIL_SHORT_VIDEO", 1, "ads_mail_short_video");
        MAIL_SHORT_VIDEO = sdkVideoAdsType2;
        SdkVideoAdsType sdkVideoAdsType3 = new SdkVideoAdsType("MAIL_SHORT_VIDEO_KNOWN_OWNER", 2, "ads_mail_short_video_known_owner");
        MAIL_SHORT_VIDEO_KNOWN_OWNER = sdkVideoAdsType3;
        SdkVideoAdsType sdkVideoAdsType4 = new SdkVideoAdsType("MAIL_PROMOTED_SHORT_VIDEO", 3, "ads_mail_promoted_short_video");
        MAIL_PROMOTED_SHORT_VIDEO = sdkVideoAdsType4;
        SdkVideoAdsType sdkVideoAdsType5 = new SdkVideoAdsType("MY_TARGET_VIDEO", 4, "ads_my_target_video");
        MY_TARGET_VIDEO = sdkVideoAdsType5;
        SdkVideoAdsType sdkVideoAdsType6 = new SdkVideoAdsType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, "unknown");
        UNKNOWN = sdkVideoAdsType6;
        SdkVideoAdsType[] sdkVideoAdsTypeArr = {sdkVideoAdsType, sdkVideoAdsType2, sdkVideoAdsType3, sdkVideoAdsType4, sdkVideoAdsType5, sdkVideoAdsType6};
        $VALUES = sdkVideoAdsTypeArr;
        $ENTRIES = new asp(sdkVideoAdsTypeArr);
        Companion = new a();
    }

    public SdkVideoAdsType(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<SdkVideoAdsType> h() {
        return $ENTRIES;
    }

    public static SdkVideoAdsType valueOf(String str) {
        return (SdkVideoAdsType) Enum.valueOf(SdkVideoAdsType.class, str);
    }

    public static SdkVideoAdsType[] values() {
        return (SdkVideoAdsType[]) $VALUES.clone();
    }

    public final String i() {
        return this.key;
    }
}
