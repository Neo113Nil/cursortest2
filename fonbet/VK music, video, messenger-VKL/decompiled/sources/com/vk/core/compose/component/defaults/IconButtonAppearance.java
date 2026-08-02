package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkIconButtonDefault.kt */
/* loaded from: classes17.dex */
public final class IconButtonAppearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IconButtonAppearance[] $VALUES;
    public static final IconButtonAppearance Accent;
    public static final IconButtonAppearance Negative;
    public static final IconButtonAppearance Neutral;
    public static final IconButtonAppearance Overlay;
    public static final IconButtonAppearance Positive;

    static {
        IconButtonAppearance iconButtonAppearance = new IconButtonAppearance("Accent", 0);
        Accent = iconButtonAppearance;
        IconButtonAppearance iconButtonAppearance2 = new IconButtonAppearance("Positive", 1);
        Positive = iconButtonAppearance2;
        IconButtonAppearance iconButtonAppearance3 = new IconButtonAppearance("Negative", 2);
        Negative = iconButtonAppearance3;
        IconButtonAppearance iconButtonAppearance4 = new IconButtonAppearance("Neutral", 3);
        Neutral = iconButtonAppearance4;
        IconButtonAppearance iconButtonAppearance5 = new IconButtonAppearance("Overlay", 4);
        Overlay = iconButtonAppearance5;
        IconButtonAppearance[] iconButtonAppearanceArr = {iconButtonAppearance, iconButtonAppearance2, iconButtonAppearance3, iconButtonAppearance4, iconButtonAppearance5};
        $VALUES = iconButtonAppearanceArr;
        $ENTRIES = new asp(iconButtonAppearanceArr);
    }

    public IconButtonAppearance() {
        throw null;
    }

    public static zrp<IconButtonAppearance> h() {
        return $ENTRIES;
    }

    public static IconButtonAppearance valueOf(String str) {
        return (IconButtonAppearance) Enum.valueOf(IconButtonAppearance.class, str);
    }

    public static IconButtonAppearance[] values() {
        return (IconButtonAppearance[]) $VALUES.clone();
    }
}
