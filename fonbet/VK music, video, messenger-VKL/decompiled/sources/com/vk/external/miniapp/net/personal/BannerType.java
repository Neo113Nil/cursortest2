package com.vk.external.miniapp.net.personal;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BannerType.kt */
/* loaded from: classes18.dex */
public final class BannerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BannerType[] $VALUES;
    public static final BannerType BONUS_VOTES;
    public static final BannerType FREE_VOTES;
    public static final BannerType PERCENT_DISCOUNT;

    static {
        BannerType bannerType = new BannerType("BONUS_VOTES", 0);
        BONUS_VOTES = bannerType;
        BannerType bannerType2 = new BannerType("FREE_VOTES", 1);
        FREE_VOTES = bannerType2;
        BannerType bannerType3 = new BannerType("PERCENT_DISCOUNT", 2);
        PERCENT_DISCOUNT = bannerType3;
        BannerType[] bannerTypeArr = {bannerType, bannerType2, bannerType3};
        $VALUES = bannerTypeArr;
        $ENTRIES = new asp(bannerTypeArr);
    }

    public BannerType() {
        throw null;
    }

    public static BannerType valueOf(String str) {
        return (BannerType) Enum.valueOf(BannerType.class, str);
    }

    public static BannerType[] values() {
        return (BannerType[]) $VALUES.clone();
    }
}
