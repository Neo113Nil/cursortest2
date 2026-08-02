package com.vk.catalog2.common.dto.api.banner;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BannerStyle.kt */
/* loaded from: classes16.dex */
public final class BannerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BannerStyle[] $VALUES;
    public static final a Companion;
    public static final BannerStyle IMAGE_CENTER;
    public static final BannerStyle IMAGE_CROPPED_RIGHT;
    public static final BannerStyle IMAGE_LEFT;
    public static final BannerStyle IMAGE_RIGHT;
    public static final BannerStyle WITHOUT_IMAGE;
    private final String serverName;

    /* compiled from: BannerStyle.kt */
    public static final class a {
        public static BannerStyle a(String str) {
            for (BannerStyle bannerStyle : BannerStyle.values()) {
                if (epx.f(bannerStyle.h(), str)) {
                    return bannerStyle;
                }
            }
            return null;
        }
    }

    static {
        BannerStyle bannerStyle = new BannerStyle("IMAGE_RIGHT", 0, "cover_middle_right");
        IMAGE_RIGHT = bannerStyle;
        BannerStyle bannerStyle2 = new BannerStyle("IMAGE_LEFT", 1, "cover_middle_left");
        IMAGE_LEFT = bannerStyle2;
        BannerStyle bannerStyle3 = new BannerStyle("IMAGE_CENTER", 2, "cover_middle_middle");
        IMAGE_CENTER = bannerStyle3;
        BannerStyle bannerStyle4 = new BannerStyle("IMAGE_CROPPED_RIGHT", 3, "cropped_cover_middle_right");
        IMAGE_CROPPED_RIGHT = bannerStyle4;
        BannerStyle bannerStyle5 = new BannerStyle("WITHOUT_IMAGE", 4, "no_cover");
        WITHOUT_IMAGE = bannerStyle5;
        BannerStyle[] bannerStyleArr = {bannerStyle, bannerStyle2, bannerStyle3, bannerStyle4, bannerStyle5};
        $VALUES = bannerStyleArr;
        $ENTRIES = new asp(bannerStyleArr);
        Companion = new a();
    }

    public BannerStyle(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static BannerStyle valueOf(String str) {
        return (BannerStyle) Enum.valueOf(BannerStyle.class, str);
    }

    public static BannerStyle[] values() {
        return (BannerStyle[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }
}
