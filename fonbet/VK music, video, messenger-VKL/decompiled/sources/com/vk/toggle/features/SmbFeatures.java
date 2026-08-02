package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SmbFeatures.kt */
/* loaded from: classes11.dex */
public final class SmbFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SmbFeatures[] $VALUES;
    public static final SmbFeatures FEATURE_SMB_ALBUM_EDITOR_REFACTORING;
    public static final SmbFeatures MARKET_TILE;
    public static final SmbFeatures NAVGO_UPDATE_SCREEN_INFO;
    public static final SmbFeatures PIN_REVIEW;
    public static final SmbFeatures PIN_REVIEW_FREE;
    public static final SmbFeatures PRODUCT_BUTTONS_REFACH;
    public static final SmbFeatures PRODUCT_BUY_NOW;
    public static final SmbFeatures PRODUCT_CARD_PARAMS;
    public static final SmbFeatures REPLY_VIDEO_ATTACH;
    private final String key;

    static {
        SmbFeatures smbFeatures = new SmbFeatures("REPLY_VIDEO_ATTACH", 0, "smb_reply_video_attach");
        REPLY_VIDEO_ATTACH = smbFeatures;
        SmbFeatures smbFeatures2 = new SmbFeatures("FEATURE_SMB_ALBUM_EDITOR_REFACTORING", 1, "smb_album_editor_refactoring");
        FEATURE_SMB_ALBUM_EDITOR_REFACTORING = smbFeatures2;
        SmbFeatures smbFeatures3 = new SmbFeatures("MARKET_TILE", 2, "smb_superapp_market_tile");
        MARKET_TILE = smbFeatures3;
        SmbFeatures smbFeatures4 = new SmbFeatures("NAVGO_UPDATE_SCREEN_INFO", 3, "smb_navgo_update_screen_info");
        NAVGO_UPDATE_SCREEN_INFO = smbFeatures4;
        SmbFeatures smbFeatures5 = new SmbFeatures("PIN_REVIEW", 4, "smb_pin_review");
        PIN_REVIEW = smbFeatures5;
        SmbFeatures smbFeatures6 = new SmbFeatures("PIN_REVIEW_FREE", 5, "sccm_pin_review_free");
        PIN_REVIEW_FREE = smbFeatures6;
        SmbFeatures smbFeatures7 = new SmbFeatures("PRODUCT_BUTTONS_REFACH", 6, "sccm_product_buttons_refach");
        PRODUCT_BUTTONS_REFACH = smbFeatures7;
        SmbFeatures smbFeatures8 = new SmbFeatures("PRODUCT_BUY_NOW", 7, "sccm_product_buy_now");
        PRODUCT_BUY_NOW = smbFeatures8;
        SmbFeatures smbFeatures9 = new SmbFeatures("PRODUCT_CARD_PARAMS", 8, "sccm_product_card_params");
        PRODUCT_CARD_PARAMS = smbFeatures9;
        SmbFeatures[] smbFeaturesArr = {smbFeatures, smbFeatures2, smbFeatures3, smbFeatures4, smbFeatures5, smbFeatures6, smbFeatures7, smbFeatures8, smbFeatures9};
        $VALUES = smbFeaturesArr;
        $ENTRIES = new asp(smbFeaturesArr);
    }

    public SmbFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<SmbFeatures> i() {
        return $ENTRIES;
    }

    public static SmbFeatures valueOf(String str) {
        return (SmbFeatures) Enum.valueOf(SmbFeatures.class, str);
    }

    public static SmbFeatures[] values() {
        return (SmbFeatures[]) $VALUES.clone();
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
