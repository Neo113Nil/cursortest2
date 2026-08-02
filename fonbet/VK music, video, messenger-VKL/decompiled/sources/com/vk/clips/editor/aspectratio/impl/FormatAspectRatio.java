package com.vk.clips.editor.aspectratio.impl;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AspectRatioButton.kt */
/* loaded from: classes16.dex */
public final class FormatAspectRatio {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FormatAspectRatio[] $VALUES;
    public static final FormatAspectRatio ORIGINAL;
    public static final FormatAspectRatio RATIO16x9;
    public static final FormatAspectRatio RATIO3x4;
    public static final FormatAspectRatio RATIO4x3;
    public static final FormatAspectRatio RATIO4x5;
    public static final FormatAspectRatio RATIO9x16;
    public static final FormatAspectRatio SQUARE;
    private final int height;
    private final int width;

    static {
        FormatAspectRatio formatAspectRatio = new FormatAspectRatio("ORIGINAL", 0, 0, 0);
        ORIGINAL = formatAspectRatio;
        FormatAspectRatio formatAspectRatio2 = new FormatAspectRatio("SQUARE", 1, 1, 1);
        SQUARE = formatAspectRatio2;
        FormatAspectRatio formatAspectRatio3 = new FormatAspectRatio("RATIO9x16", 2, 9, 16);
        RATIO9x16 = formatAspectRatio3;
        FormatAspectRatio formatAspectRatio4 = new FormatAspectRatio("RATIO16x9", 3, 16, 9);
        RATIO16x9 = formatAspectRatio4;
        FormatAspectRatio formatAspectRatio5 = new FormatAspectRatio("RATIO4x5", 4, 4, 5);
        RATIO4x5 = formatAspectRatio5;
        FormatAspectRatio formatAspectRatio6 = new FormatAspectRatio("RATIO3x4", 5, 3, 4);
        RATIO3x4 = formatAspectRatio6;
        FormatAspectRatio formatAspectRatio7 = new FormatAspectRatio("RATIO4x3", 6, 4, 3);
        RATIO4x3 = formatAspectRatio7;
        FormatAspectRatio[] formatAspectRatioArr = {formatAspectRatio, formatAspectRatio2, formatAspectRatio3, formatAspectRatio4, formatAspectRatio5, formatAspectRatio6, formatAspectRatio7};
        $VALUES = formatAspectRatioArr;
        $ENTRIES = new asp(formatAspectRatioArr);
    }

    public FormatAspectRatio(String str, int i, int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    public static FormatAspectRatio valueOf(String str) {
        return (FormatAspectRatio) Enum.valueOf(FormatAspectRatio.class, str);
    }

    public static FormatAspectRatio[] values() {
        return (FormatAspectRatio[]) $VALUES.clone();
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
