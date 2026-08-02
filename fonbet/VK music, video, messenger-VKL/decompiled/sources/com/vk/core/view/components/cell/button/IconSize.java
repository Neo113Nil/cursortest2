package com.vk.core.view.components.cell.button;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButton.kt */
/* loaded from: classes17.dex */
public final class IconSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IconSize[] $VALUES;
    public static final IconSize Large;
    public static final IconSize Medium;
    public static final IconSize Small;

    static {
        IconSize iconSize = new IconSize("Small", 0);
        Small = iconSize;
        IconSize iconSize2 = new IconSize("Medium", 1);
        Medium = iconSize2;
        IconSize iconSize3 = new IconSize("Large", 2);
        Large = iconSize3;
        IconSize[] iconSizeArr = {iconSize, iconSize2, iconSize3};
        $VALUES = iconSizeArr;
        $ENTRIES = new asp(iconSizeArr);
    }

    public IconSize() {
        throw null;
    }

    public static zrp<IconSize> h() {
        return $ENTRIES;
    }

    public static IconSize valueOf(String str) {
        return (IconSize) Enum.valueOf(IconSize.class, str);
    }

    public static IconSize[] values() {
        return (IconSize[]) $VALUES.clone();
    }
}
