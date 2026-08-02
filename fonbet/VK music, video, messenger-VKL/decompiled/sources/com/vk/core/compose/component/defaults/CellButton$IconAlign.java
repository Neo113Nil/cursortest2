package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class CellButton$IconAlign {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CellButton$IconAlign[] $VALUES;
    public static final CellButton$IconAlign Center;
    public static final CellButton$IconAlign Top;

    static {
        CellButton$IconAlign cellButton$IconAlign = new CellButton$IconAlign("Top", 0);
        Top = cellButton$IconAlign;
        CellButton$IconAlign cellButton$IconAlign2 = new CellButton$IconAlign("Center", 1);
        Center = cellButton$IconAlign2;
        CellButton$IconAlign[] cellButton$IconAlignArr = {cellButton$IconAlign, cellButton$IconAlign2};
        $VALUES = cellButton$IconAlignArr;
        $ENTRIES = new asp(cellButton$IconAlignArr);
    }

    public CellButton$IconAlign() {
        throw null;
    }

    public static CellButton$IconAlign valueOf(String str) {
        return (CellButton$IconAlign) Enum.valueOf(CellButton$IconAlign.class, str);
    }

    public static CellButton$IconAlign[] values() {
        return (CellButton$IconAlign[]) $VALUES.clone();
    }
}
