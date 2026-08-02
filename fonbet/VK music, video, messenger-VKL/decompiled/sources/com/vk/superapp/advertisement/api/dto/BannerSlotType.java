package com.vk.superapp.advertisement.api.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BannerSlotType.kt */
/* loaded from: classes6.dex */
public final class BannerSlotType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BannerSlotType[] $VALUES;
    public static final BannerSlotType AD;

    static {
        BannerSlotType bannerSlotType = new BannerSlotType("AD", 0);
        AD = bannerSlotType;
        BannerSlotType[] bannerSlotTypeArr = {bannerSlotType};
        $VALUES = bannerSlotTypeArr;
        $ENTRIES = new asp(bannerSlotTypeArr);
    }

    public BannerSlotType() {
        throw null;
    }

    public static BannerSlotType valueOf(String str) {
        return (BannerSlotType) Enum.valueOf(BannerSlotType.class, str);
    }

    public static BannerSlotType[] values() {
        return (BannerSlotType[]) $VALUES.clone();
    }
}
