package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkIconButtonDefault.kt */
/* loaded from: classes17.dex */
public final class IconButtonSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IconButtonSize[] $VALUES;
    public static final IconButtonSize Large;
    public static final IconButtonSize Medium;
    public static final IconButtonSize Small;

    static {
        IconButtonSize iconButtonSize = new IconButtonSize("Small", 0);
        Small = iconButtonSize;
        IconButtonSize iconButtonSize2 = new IconButtonSize("Medium", 1);
        Medium = iconButtonSize2;
        IconButtonSize iconButtonSize3 = new IconButtonSize("Large", 2);
        Large = iconButtonSize3;
        IconButtonSize[] iconButtonSizeArr = {iconButtonSize, iconButtonSize2, iconButtonSize3};
        $VALUES = iconButtonSizeArr;
        $ENTRIES = new asp(iconButtonSizeArr);
    }

    public IconButtonSize() {
        throw null;
    }

    public static zrp<IconButtonSize> h() {
        return $ENTRIES;
    }

    public static IconButtonSize valueOf(String str) {
        return (IconButtonSize) Enum.valueOf(IconButtonSize.class, str);
    }

    public static IconButtonSize[] values() {
        return (IconButtonSize[]) $VALUES.clone();
    }
}
