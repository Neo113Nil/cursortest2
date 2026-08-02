package com.vk.core.view.components.cell.button;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButton.kt */
/* loaded from: classes17.dex */
public final class IconAlign {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IconAlign[] $VALUES;
    public static final IconAlign Center;
    public static final IconAlign Top;

    static {
        IconAlign iconAlign = new IconAlign("Top", 0);
        Top = iconAlign;
        IconAlign iconAlign2 = new IconAlign("Center", 1);
        Center = iconAlign2;
        IconAlign[] iconAlignArr = {iconAlign, iconAlign2};
        $VALUES = iconAlignArr;
        $ENTRIES = new asp(iconAlignArr);
    }

    public IconAlign() {
        throw null;
    }

    public static zrp<IconAlign> h() {
        return $ENTRIES;
    }

    public static IconAlign valueOf(String str) {
        return (IconAlign) Enum.valueOf(IconAlign.class, str);
    }

    public static IconAlign[] values() {
        return (IconAlign[]) $VALUES.clone();
    }
}
