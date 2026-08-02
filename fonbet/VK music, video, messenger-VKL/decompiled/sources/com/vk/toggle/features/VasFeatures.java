package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VasFeatures.kt */
/* loaded from: classes11.dex */
public final class VasFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VasFeatures[] $VALUES;
    public static final VasFeatures STICKERS_URL_CHECK;
    public static final VasFeatures VAS_GIFTS_SERVICE_CATALOG;
    public static final VasFeatures VAS_GIFTS_SERVICE_LISTS;
    public static final VasFeatures VAS_GIFT_BUTTON_IN_PROFILE;
    public static final VasFeatures VAS_GIFT_MINIAPP_DISKOTEKA_FIX;
    public static final VasFeatures VAS_REACTION_TO_GIFT;
    public static final VasFeatures VAS_SCHEDULED_GIFTS;
    private final String key;

    static {
        VasFeatures vasFeatures = new VasFeatures("STICKERS_URL_CHECK", 0, "vas_sticker_url_check");
        STICKERS_URL_CHECK = vasFeatures;
        VasFeatures vasFeatures2 = new VasFeatures("VAS_GIFT_MINIAPP_DISKOTEKA_FIX", 1, "vas_gift_miniapp_diskoteka_fix");
        VAS_GIFT_MINIAPP_DISKOTEKA_FIX = vasFeatures2;
        VasFeatures vasFeatures3 = new VasFeatures("VAS_SCHEDULED_GIFTS", 2, "vas_scheduled_gifts");
        VAS_SCHEDULED_GIFTS = vasFeatures3;
        VasFeatures vasFeatures4 = new VasFeatures("VAS_GIFTS_SERVICE_CATALOG", 3, "vas_gifts_service_catalog");
        VAS_GIFTS_SERVICE_CATALOG = vasFeatures4;
        VasFeatures vasFeatures5 = new VasFeatures("VAS_GIFTS_SERVICE_LISTS", 4, "vas_gifts_service_lists");
        VAS_GIFTS_SERVICE_LISTS = vasFeatures5;
        VasFeatures vasFeatures6 = new VasFeatures("VAS_REACTION_TO_GIFT", 5, "vas_reaction_to_gift");
        VAS_REACTION_TO_GIFT = vasFeatures6;
        VasFeatures vasFeatures7 = new VasFeatures("VAS_GIFT_BUTTON_IN_PROFILE", 6, "vas_gift_button_in_profile");
        VAS_GIFT_BUTTON_IN_PROFILE = vasFeatures7;
        VasFeatures[] vasFeaturesArr = {vasFeatures, vasFeatures2, vasFeatures3, vasFeatures4, vasFeatures5, vasFeatures6, vasFeatures7};
        $VALUES = vasFeaturesArr;
        $ENTRIES = new asp(vasFeaturesArr);
    }

    public VasFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<VasFeatures> i() {
        return $ENTRIES;
    }

    public static VasFeatures valueOf(String str) {
        return (VasFeatures) Enum.valueOf(VasFeatures.class, str);
    }

    public static VasFeatures[] values() {
        return (VasFeatures[]) $VALUES.clone();
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
