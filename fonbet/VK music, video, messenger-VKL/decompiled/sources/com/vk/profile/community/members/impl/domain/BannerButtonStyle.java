package com.vk.profile.community.members.impl.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MembersListBanner.kt */
/* loaded from: classes5.dex */
public final class BannerButtonStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BannerButtonStyle[] $VALUES;
    public static final BannerButtonStyle FREE;
    public static final BannerButtonStyle PAID;

    static {
        BannerButtonStyle bannerButtonStyle = new BannerButtonStyle("FREE", 0);
        FREE = bannerButtonStyle;
        BannerButtonStyle bannerButtonStyle2 = new BannerButtonStyle("PAID", 1);
        PAID = bannerButtonStyle2;
        BannerButtonStyle[] bannerButtonStyleArr = {bannerButtonStyle, bannerButtonStyle2};
        $VALUES = bannerButtonStyleArr;
        $ENTRIES = new asp(bannerButtonStyleArr);
    }

    public BannerButtonStyle() {
        throw null;
    }

    public static BannerButtonStyle valueOf(String str) {
        return (BannerButtonStyle) Enum.valueOf(BannerButtonStyle.class, str);
    }

    public static BannerButtonStyle[] values() {
        return (BannerButtonStyle[]) $VALUES.clone();
    }
}
