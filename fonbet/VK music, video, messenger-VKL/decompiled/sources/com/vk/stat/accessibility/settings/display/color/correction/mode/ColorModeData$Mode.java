package com.vk.stat.accessibility.settings.display.color.correction.mode;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorModeData.kt */
/* loaded from: classes5.dex */
public final class ColorModeData$Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ColorModeData$Mode[] $VALUES;
    public static final ColorModeData$Mode Automatic;
    public static final ColorModeData$Mode Boosted;
    public static final ColorModeData$Mode Natural;
    public static final ColorModeData$Mode Saturated;
    private final int code;

    static {
        ColorModeData$Mode colorModeData$Mode = new ColorModeData$Mode("Natural", 0, 0);
        Natural = colorModeData$Mode;
        ColorModeData$Mode colorModeData$Mode2 = new ColorModeData$Mode("Boosted", 1, 1);
        Boosted = colorModeData$Mode2;
        ColorModeData$Mode colorModeData$Mode3 = new ColorModeData$Mode("Saturated", 2, 2);
        Saturated = colorModeData$Mode3;
        ColorModeData$Mode colorModeData$Mode4 = new ColorModeData$Mode("Automatic", 3, 3);
        Automatic = colorModeData$Mode4;
        ColorModeData$Mode[] colorModeData$ModeArr = {colorModeData$Mode, colorModeData$Mode2, colorModeData$Mode3, colorModeData$Mode4};
        $VALUES = colorModeData$ModeArr;
        $ENTRIES = new asp(colorModeData$ModeArr);
    }

    public ColorModeData$Mode(String str, int i, int i2) {
        this.code = i2;
    }

    public static ColorModeData$Mode valueOf(String str) {
        return (ColorModeData$Mode) Enum.valueOf(ColorModeData$Mode.class, str);
    }

    public static ColorModeData$Mode[] values() {
        return (ColorModeData$Mode[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
