package com.vk.stickers.styles.colorpalette;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorTone.kt */
/* loaded from: classes6.dex */
public final class ColorTone {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ColorTone[] $VALUES;
    public static final ColorTone TONE_0;
    public static final ColorTone TONE_10;
    public static final ColorTone TONE_100;
    public static final ColorTone TONE_20;
    public static final ColorTone TONE_25;
    public static final ColorTone TONE_30;
    public static final ColorTone TONE_35;
    public static final ColorTone TONE_40;
    public static final ColorTone TONE_5;
    public static final ColorTone TONE_50;
    public static final ColorTone TONE_60;
    public static final ColorTone TONE_70;
    public static final ColorTone TONE_80;
    public static final ColorTone TONE_90;
    public static final ColorTone TONE_95;
    public static final ColorTone TONE_98;
    public static final ColorTone TONE_99;
    private final int value;

    static {
        ColorTone colorTone = new ColorTone("TONE_0", 0, 0);
        TONE_0 = colorTone;
        ColorTone colorTone2 = new ColorTone("TONE_5", 1, 5);
        TONE_5 = colorTone2;
        ColorTone colorTone3 = new ColorTone("TONE_10", 2, 10);
        TONE_10 = colorTone3;
        ColorTone colorTone4 = new ColorTone("TONE_20", 3, 20);
        TONE_20 = colorTone4;
        ColorTone colorTone5 = new ColorTone("TONE_25", 4, 25);
        TONE_25 = colorTone5;
        ColorTone colorTone6 = new ColorTone("TONE_30", 5, 30);
        TONE_30 = colorTone6;
        ColorTone colorTone7 = new ColorTone("TONE_35", 6, 35);
        TONE_35 = colorTone7;
        ColorTone colorTone8 = new ColorTone("TONE_40", 7, 40);
        TONE_40 = colorTone8;
        ColorTone colorTone9 = new ColorTone("TONE_50", 8, 50);
        TONE_50 = colorTone9;
        ColorTone colorTone10 = new ColorTone("TONE_60", 9, 60);
        TONE_60 = colorTone10;
        ColorTone colorTone11 = new ColorTone("TONE_70", 10, 70);
        TONE_70 = colorTone11;
        ColorTone colorTone12 = new ColorTone("TONE_80", 11, 80);
        TONE_80 = colorTone12;
        ColorTone colorTone13 = new ColorTone("TONE_90", 12, 90);
        TONE_90 = colorTone13;
        ColorTone colorTone14 = new ColorTone("TONE_95", 13, 95);
        TONE_95 = colorTone14;
        ColorTone colorTone15 = new ColorTone("TONE_98", 14, 98);
        TONE_98 = colorTone15;
        ColorTone colorTone16 = new ColorTone("TONE_99", 15, 99);
        TONE_99 = colorTone16;
        ColorTone colorTone17 = new ColorTone("TONE_100", 16, 100);
        TONE_100 = colorTone17;
        ColorTone[] colorToneArr = {colorTone, colorTone2, colorTone3, colorTone4, colorTone5, colorTone6, colorTone7, colorTone8, colorTone9, colorTone10, colorTone11, colorTone12, colorTone13, colorTone14, colorTone15, colorTone16, colorTone17};
        $VALUES = colorToneArr;
        $ENTRIES = new asp(colorToneArr);
    }

    public ColorTone(String str, int i, int i2) {
        this.value = i2;
    }

    public static ColorTone valueOf(String str) {
        return (ColorTone) Enum.valueOf(ColorTone.class, str);
    }

    public static ColorTone[] values() {
        return (ColorTone[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
