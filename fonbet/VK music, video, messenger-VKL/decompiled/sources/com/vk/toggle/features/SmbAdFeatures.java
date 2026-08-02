package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SmbAdFeatures.kt */
/* loaded from: classes11.dex */
public final class SmbAdFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SmbAdFeatures[] $VALUES;
    public static final SmbAdFeatures FEATURE_SMB_ADS_DYNAMIC_BUTTON;
    public static final SmbAdFeatures FEATURE_SMB_APP_GALLERY_SEAMLESS_INSTALL;
    public static final SmbAdFeatures FEATURE_SMB_CLIP_UPLOAD_EASY_PROMOTE;
    public static final SmbAdFeatures FEATURE_SMB_DISCLAIMER_REPOSITION;
    public static final SmbAdFeatures FEATURE_SMB_LEAD_ADS;
    public static final SmbAdFeatures FEATURE_SMB_PIXEL_STATS_REFACTORING;
    public static final SmbAdFeatures FEATURE_SMB_VIDEO_AD_DYNAMIC_BUTTON;
    private final String key;

    static {
        SmbAdFeatures smbAdFeatures = new SmbAdFeatures("FEATURE_SMB_ADS_DYNAMIC_BUTTON", 0, "smb_ads_dynamic_button");
        FEATURE_SMB_ADS_DYNAMIC_BUTTON = smbAdFeatures;
        SmbAdFeatures smbAdFeatures2 = new SmbAdFeatures("FEATURE_SMB_LEAD_ADS", 1, "smb_lead_ads");
        FEATURE_SMB_LEAD_ADS = smbAdFeatures2;
        SmbAdFeatures smbAdFeatures3 = new SmbAdFeatures("FEATURE_SMB_PIXEL_STATS_REFACTORING", 2, "smb_pixel_stats_refactoring");
        FEATURE_SMB_PIXEL_STATS_REFACTORING = smbAdFeatures3;
        SmbAdFeatures smbAdFeatures4 = new SmbAdFeatures("FEATURE_SMB_VIDEO_AD_DYNAMIC_BUTTON", 3, "smb_video_ad_dynamic_button");
        FEATURE_SMB_VIDEO_AD_DYNAMIC_BUTTON = smbAdFeatures4;
        SmbAdFeatures smbAdFeatures5 = new SmbAdFeatures("FEATURE_SMB_APP_GALLERY_SEAMLESS_INSTALL", 4, "smb_huawei_seamless_install");
        FEATURE_SMB_APP_GALLERY_SEAMLESS_INSTALL = smbAdFeatures5;
        SmbAdFeatures smbAdFeatures6 = new SmbAdFeatures("FEATURE_SMB_DISCLAIMER_REPOSITION", 5, "smb_credit_disclaimer_position");
        FEATURE_SMB_DISCLAIMER_REPOSITION = smbAdFeatures6;
        SmbAdFeatures smbAdFeatures7 = new SmbAdFeatures("FEATURE_SMB_CLIP_UPLOAD_EASY_PROMOTE", 6, "smb_clip_upload_easy_promote");
        FEATURE_SMB_CLIP_UPLOAD_EASY_PROMOTE = smbAdFeatures7;
        SmbAdFeatures[] smbAdFeaturesArr = {smbAdFeatures, smbAdFeatures2, smbAdFeatures3, smbAdFeatures4, smbAdFeatures5, smbAdFeatures6, smbAdFeatures7};
        $VALUES = smbAdFeaturesArr;
        $ENTRIES = new asp(smbAdFeaturesArr);
    }

    public SmbAdFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<SmbAdFeatures> i() {
        return $ENTRIES;
    }

    public static SmbAdFeatures valueOf(String str) {
        return (SmbAdFeatures) Enum.valueOf(SmbAdFeatures.class, str);
    }

    public static SmbAdFeatures[] values() {
        return (SmbAdFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
