package com.vk.stickers.styles.colorpalette;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorPaletteType.kt */
/* loaded from: classes6.dex */
public final class ColorPaletteType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ColorPaletteType[] $VALUES;
    public static final ColorPaletteType PRIMARY;
    public static final ColorPaletteType SECONDARY;

    static {
        ColorPaletteType colorPaletteType = new ColorPaletteType("PRIMARY", 0);
        PRIMARY = colorPaletteType;
        ColorPaletteType colorPaletteType2 = new ColorPaletteType("SECONDARY", 1);
        SECONDARY = colorPaletteType2;
        ColorPaletteType[] colorPaletteTypeArr = {colorPaletteType, colorPaletteType2};
        $VALUES = colorPaletteTypeArr;
        $ENTRIES = new asp(colorPaletteTypeArr);
    }

    public ColorPaletteType() {
        throw null;
    }

    public static ColorPaletteType valueOf(String str) {
        return (ColorPaletteType) Enum.valueOf(ColorPaletteType.class, str);
    }

    public static ColorPaletteType[] values() {
        return (ColorPaletteType[]) $VALUES.clone();
    }
}
