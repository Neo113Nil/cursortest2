package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SoccomFeatures.kt */
/* loaded from: classes11.dex */
public final class SoccomFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SoccomFeatures[] $VALUES;
    public static final SoccomFeatures CHECKOUT_NEW_FLOW;
    public static final SoccomFeatures CLIPS_SHOPS_BADGE;
    public static final SoccomFeatures CLIPS_SHOPS_GRID;
    public static final SoccomFeatures CLIPS_SHOPS_MORE_BUTTON;
    public static final SoccomFeatures CLIPS_SHOPS_MORE_PRELOAD;
    public static final SoccomFeatures MESSENGER_CLIP_SNIPPET;
    public static final SoccomFeatures MULTI_INTEGRATION;
    public static final SoccomFeatures OZON_PRODUCT_OLD_PRICE;
    public static final SoccomFeatures PRODUCT_CARD_RATING;
    public static final SoccomFeatures SUPERAPP_MARKET_LAMODA;
    private final String key;

    static {
        SoccomFeatures soccomFeatures = new SoccomFeatures("OZON_PRODUCT_OLD_PRICE", 0, "sccm_product_old_price");
        OZON_PRODUCT_OLD_PRICE = soccomFeatures;
        SoccomFeatures soccomFeatures2 = new SoccomFeatures("CLIPS_SHOPS_MORE_BUTTON", 1, "sccm_clips_shops_more_button");
        CLIPS_SHOPS_MORE_BUTTON = soccomFeatures2;
        SoccomFeatures soccomFeatures3 = new SoccomFeatures("CLIPS_SHOPS_MORE_PRELOAD", 2, "sccm_clips_shops_more_preload");
        CLIPS_SHOPS_MORE_PRELOAD = soccomFeatures3;
        SoccomFeatures soccomFeatures4 = new SoccomFeatures("CLIPS_SHOPS_GRID", 3, "sccm_clips_shops_grid");
        CLIPS_SHOPS_GRID = soccomFeatures4;
        SoccomFeatures soccomFeatures5 = new SoccomFeatures("MULTI_INTEGRATION", 4, "sccm_multi_integration");
        MULTI_INTEGRATION = soccomFeatures5;
        SoccomFeatures soccomFeatures6 = new SoccomFeatures("CLIPS_SHOPS_BADGE", 5, "sccm_clips_shops_badge");
        CLIPS_SHOPS_BADGE = soccomFeatures6;
        SoccomFeatures soccomFeatures7 = new SoccomFeatures("MESSENGER_CLIP_SNIPPET", 6, "sccm_messenger_clip_snippet");
        MESSENGER_CLIP_SNIPPET = soccomFeatures7;
        SoccomFeatures soccomFeatures8 = new SoccomFeatures("PRODUCT_CARD_RATING", 7, "sccm_product_card_rating");
        PRODUCT_CARD_RATING = soccomFeatures8;
        SoccomFeatures soccomFeatures9 = new SoccomFeatures("SUPERAPP_MARKET_LAMODA", 8, "sccm_superapp_market_lamoda");
        SUPERAPP_MARKET_LAMODA = soccomFeatures9;
        SoccomFeatures soccomFeatures10 = new SoccomFeatures("CHECKOUT_NEW_FLOW", 9, "sccm_checkout_new_flow");
        CHECKOUT_NEW_FLOW = soccomFeatures10;
        SoccomFeatures[] soccomFeaturesArr = {soccomFeatures, soccomFeatures2, soccomFeatures3, soccomFeatures4, soccomFeatures5, soccomFeatures6, soccomFeatures7, soccomFeatures8, soccomFeatures9, soccomFeatures10};
        $VALUES = soccomFeaturesArr;
        $ENTRIES = new asp(soccomFeaturesArr);
    }

    public SoccomFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<SoccomFeatures> i() {
        return $ENTRIES;
    }

    public static SoccomFeatures valueOf(String str) {
        return (SoccomFeatures) Enum.valueOf(SoccomFeatures.class, str);
    }

    public static SoccomFeatures[] values() {
        return (SoccomFeatures[]) $VALUES.clone();
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
