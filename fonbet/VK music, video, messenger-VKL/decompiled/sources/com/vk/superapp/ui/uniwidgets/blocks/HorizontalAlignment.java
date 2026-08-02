package com.vk.superapp.ui.uniwidgets.blocks;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiBlocks.kt */
/* loaded from: classes6.dex */
public final class HorizontalAlignment {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HorizontalAlignment[] $VALUES;
    public static final HorizontalAlignment CENTER;
    public static final HorizontalAlignment LEFT;
    public static final HorizontalAlignment RIGHT;

    static {
        HorizontalAlignment horizontalAlignment = new HorizontalAlignment("LEFT", 0);
        LEFT = horizontalAlignment;
        HorizontalAlignment horizontalAlignment2 = new HorizontalAlignment("CENTER", 1);
        CENTER = horizontalAlignment2;
        HorizontalAlignment horizontalAlignment3 = new HorizontalAlignment("RIGHT", 2);
        RIGHT = horizontalAlignment3;
        HorizontalAlignment[] horizontalAlignmentArr = {horizontalAlignment, horizontalAlignment2, horizontalAlignment3};
        $VALUES = horizontalAlignmentArr;
        $ENTRIES = new asp(horizontalAlignmentArr);
    }

    public HorizontalAlignment() {
        throw null;
    }

    public static HorizontalAlignment valueOf(String str) {
        return (HorizontalAlignment) Enum.valueOf(HorizontalAlignment.class, str);
    }

    public static HorizontalAlignment[] values() {
        return (HorizontalAlignment[]) $VALUES.clone();
    }
}
