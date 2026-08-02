package com.vk.catalog2.common.ui.mvp.holder.container;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkBannerVh.kt */
/* loaded from: classes16.dex */
public final class BannerSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BannerSize[] $VALUES;
    public static final BannerSize Large;
    public static final BannerSize Normal;
    public static final BannerSize Small;

    static {
        BannerSize bannerSize = new BannerSize("Large", 0);
        Large = bannerSize;
        BannerSize bannerSize2 = new BannerSize("Small", 1);
        Small = bannerSize2;
        BannerSize bannerSize3 = new BannerSize("Normal", 2);
        Normal = bannerSize3;
        BannerSize[] bannerSizeArr = {bannerSize, bannerSize2, bannerSize3};
        $VALUES = bannerSizeArr;
        $ENTRIES = new asp(bannerSizeArr);
    }

    public BannerSize() {
        throw null;
    }

    public static BannerSize valueOf(String str) {
        return (BannerSize) Enum.valueOf(BannerSize.class, str);
    }

    public static BannerSize[] values() {
        return (BannerSize[]) $VALUES.clone();
    }
}
