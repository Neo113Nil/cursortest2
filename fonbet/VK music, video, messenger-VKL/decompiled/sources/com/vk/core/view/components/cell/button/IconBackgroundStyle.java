package com.vk.core.view.components.cell.button;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButton.kt */
/* loaded from: classes17.dex */
public final class IconBackgroundStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IconBackgroundStyle[] $VALUES;
    public static final IconBackgroundStyle Circle;
    public static final IconBackgroundStyle None;
    public static final IconBackgroundStyle SquireLargeRadius;
    public static final IconBackgroundStyle SquireMediumRadius;
    public static final IconBackgroundStyle SquireSmallRadius;

    static {
        IconBackgroundStyle iconBackgroundStyle = new IconBackgroundStyle("None", 0);
        None = iconBackgroundStyle;
        IconBackgroundStyle iconBackgroundStyle2 = new IconBackgroundStyle("Circle", 1);
        Circle = iconBackgroundStyle2;
        IconBackgroundStyle iconBackgroundStyle3 = new IconBackgroundStyle("SquireSmallRadius", 2);
        SquireSmallRadius = iconBackgroundStyle3;
        IconBackgroundStyle iconBackgroundStyle4 = new IconBackgroundStyle("SquireMediumRadius", 3);
        SquireMediumRadius = iconBackgroundStyle4;
        IconBackgroundStyle iconBackgroundStyle5 = new IconBackgroundStyle("SquireLargeRadius", 4);
        SquireLargeRadius = iconBackgroundStyle5;
        IconBackgroundStyle[] iconBackgroundStyleArr = {iconBackgroundStyle, iconBackgroundStyle2, iconBackgroundStyle3, iconBackgroundStyle4, iconBackgroundStyle5};
        $VALUES = iconBackgroundStyleArr;
        $ENTRIES = new asp(iconBackgroundStyleArr);
    }

    public IconBackgroundStyle() {
        throw null;
    }

    public static zrp<IconBackgroundStyle> h() {
        return $ENTRIES;
    }

    public static IconBackgroundStyle valueOf(String str) {
        return (IconBackgroundStyle) Enum.valueOf(IconBackgroundStyle.class, str);
    }

    public static IconBackgroundStyle[] values() {
        return (IconBackgroundStyle[]) $VALUES.clone();
    }
}
