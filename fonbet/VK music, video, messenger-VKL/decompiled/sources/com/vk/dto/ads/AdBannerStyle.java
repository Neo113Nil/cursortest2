package com.vk.dto.ads;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdBlockItem.kt */
/* loaded from: classes18.dex */
public final class AdBannerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdBannerStyle[] $VALUES;
    public static final AdBannerStyle BOTTOM_BUTTON;
    public static final AdBannerStyle BOTTOM_DOTS;
    public static final a Companion;
    private final String serverName;

    /* compiled from: AdBlockItem.kt */
    public static final class a {
        public static AdBannerStyle a(String str) {
            for (AdBannerStyle adBannerStyle : AdBannerStyle.values()) {
                if (epx.f(adBannerStyle.h(), str)) {
                    return adBannerStyle;
                }
            }
            return null;
        }
    }

    static {
        AdBannerStyle adBannerStyle = new AdBannerStyle("BOTTOM_BUTTON", 0, "with_bottom_button");
        BOTTOM_BUTTON = adBannerStyle;
        AdBannerStyle adBannerStyle2 = new AdBannerStyle("BOTTOM_DOTS", 1, "with_bottom_dots");
        BOTTOM_DOTS = adBannerStyle2;
        AdBannerStyle[] adBannerStyleArr = {adBannerStyle, adBannerStyle2};
        $VALUES = adBannerStyleArr;
        $ENTRIES = new asp(adBannerStyleArr);
        Companion = new a();
    }

    public AdBannerStyle(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static AdBannerStyle valueOf(String str) {
        return (AdBannerStyle) Enum.valueOf(AdBannerStyle.class, str);
    }

    public static AdBannerStyle[] values() {
        return (AdBannerStyle[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }
}
