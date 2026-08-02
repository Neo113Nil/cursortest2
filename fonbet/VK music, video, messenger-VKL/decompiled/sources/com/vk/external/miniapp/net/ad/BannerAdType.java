package com.vk.external.miniapp.net.ad;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BannerAdType.kt */
/* loaded from: classes18.dex */
public final class BannerAdType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BannerAdType[] $VALUES;
    public static final BannerAdType BANNER;

    static {
        BannerAdType bannerAdType = new BannerAdType("BANNER", 0);
        BANNER = bannerAdType;
        BannerAdType[] bannerAdTypeArr = {bannerAdType};
        $VALUES = bannerAdTypeArr;
        $ENTRIES = new asp(bannerAdTypeArr);
    }

    public BannerAdType() {
        throw null;
    }

    public static BannerAdType valueOf(String str) {
        return (BannerAdType) Enum.valueOf(BannerAdType.class, str);
    }

    public static BannerAdType[] values() {
        return (BannerAdType[]) $VALUES.clone();
    }
}
