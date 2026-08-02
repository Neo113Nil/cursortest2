package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class CellButton$Appearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CellButton$Appearance[] $VALUES;
    public static final CellButton$Appearance Accent;
    public static final CellButton$Appearance Negative;
    public static final CellButton$Appearance Neutral;

    static {
        CellButton$Appearance cellButton$Appearance = new CellButton$Appearance("Accent", 0);
        Accent = cellButton$Appearance;
        CellButton$Appearance cellButton$Appearance2 = new CellButton$Appearance("Neutral", 1);
        Neutral = cellButton$Appearance2;
        CellButton$Appearance cellButton$Appearance3 = new CellButton$Appearance("Negative", 2);
        Negative = cellButton$Appearance3;
        CellButton$Appearance[] cellButton$AppearanceArr = {cellButton$Appearance, cellButton$Appearance2, cellButton$Appearance3};
        $VALUES = cellButton$AppearanceArr;
        $ENTRIES = new asp(cellButton$AppearanceArr);
    }

    public CellButton$Appearance() {
        throw null;
    }

    public static zrp<CellButton$Appearance> h() {
        return $ENTRIES;
    }

    public static CellButton$Appearance valueOf(String str) {
        return (CellButton$Appearance) Enum.valueOf(CellButton$Appearance.class, str);
    }

    public static CellButton$Appearance[] values() {
        return (CellButton$Appearance[]) $VALUES.clone();
    }
}
