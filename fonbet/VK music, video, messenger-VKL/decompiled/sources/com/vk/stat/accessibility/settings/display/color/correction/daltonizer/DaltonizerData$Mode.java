package com.vk.stat.accessibility.settings.display.color.correction.daltonizer;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DaltonizerData.kt */
/* loaded from: classes5.dex */
public final class DaltonizerData$Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DaltonizerData$Mode[] $VALUES;
    public static final DaltonizerData$Mode Deuteranomaly;
    public static final DaltonizerData$Mode Protanomaly;
    public static final DaltonizerData$Mode Tritanomaly;
    private final int code;

    static {
        DaltonizerData$Mode daltonizerData$Mode = new DaltonizerData$Mode("Protanomaly", 0, 11);
        Protanomaly = daltonizerData$Mode;
        DaltonizerData$Mode daltonizerData$Mode2 = new DaltonizerData$Mode("Deuteranomaly", 1, 12);
        Deuteranomaly = daltonizerData$Mode2;
        DaltonizerData$Mode daltonizerData$Mode3 = new DaltonizerData$Mode("Tritanomaly", 2, 13);
        Tritanomaly = daltonizerData$Mode3;
        DaltonizerData$Mode[] daltonizerData$ModeArr = {daltonizerData$Mode, daltonizerData$Mode2, daltonizerData$Mode3};
        $VALUES = daltonizerData$ModeArr;
        $ENTRIES = new asp(daltonizerData$ModeArr);
    }

    public DaltonizerData$Mode(String str, int i, int i2) {
        this.code = i2;
    }

    public static DaltonizerData$Mode valueOf(String str) {
        return (DaltonizerData$Mode) Enum.valueOf(DaltonizerData$Mode.class, str);
    }

    public static DaltonizerData$Mode[] values() {
        return (DaltonizerData$Mode[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
