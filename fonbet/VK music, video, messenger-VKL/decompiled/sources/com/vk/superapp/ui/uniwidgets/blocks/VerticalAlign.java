package com.vk.superapp.ui.uniwidgets.blocks;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiBlocks.kt */
/* loaded from: classes6.dex */
public final class VerticalAlign {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VerticalAlign[] $VALUES;
    public static final VerticalAlign BOTTOM;
    public static final VerticalAlign CENTER;
    public static final VerticalAlign TOP;

    static {
        VerticalAlign verticalAlign = new VerticalAlign("TOP", 0);
        TOP = verticalAlign;
        VerticalAlign verticalAlign2 = new VerticalAlign("CENTER", 1);
        CENTER = verticalAlign2;
        VerticalAlign verticalAlign3 = new VerticalAlign("BOTTOM", 2);
        BOTTOM = verticalAlign3;
        VerticalAlign[] verticalAlignArr = {verticalAlign, verticalAlign2, verticalAlign3};
        $VALUES = verticalAlignArr;
        $ENTRIES = new asp(verticalAlignArr);
    }

    public VerticalAlign() {
        throw null;
    }

    public static VerticalAlign valueOf(String str) {
        return (VerticalAlign) Enum.valueOf(VerticalAlign.class, str);
    }

    public static VerticalAlign[] values() {
        return (VerticalAlign[]) $VALUES.clone();
    }
}
