package com.vk.donut.design.compose.banner;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class InfoBannerIcon {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InfoBannerIcon[] $VALUES;
    public static final InfoBannerIcon ERROR;

    static {
        InfoBannerIcon infoBannerIcon = new InfoBannerIcon("ERROR", 0);
        ERROR = infoBannerIcon;
        InfoBannerIcon[] infoBannerIconArr = {infoBannerIcon};
        $VALUES = infoBannerIconArr;
        $ENTRIES = new asp(infoBannerIconArr);
    }

    public InfoBannerIcon() {
        throw null;
    }

    public static InfoBannerIcon valueOf(String str) {
        return (InfoBannerIcon) Enum.valueOf(InfoBannerIcon.class, str);
    }

    public static InfoBannerIcon[] values() {
        return (InfoBannerIcon[]) $VALUES.clone();
    }
}
