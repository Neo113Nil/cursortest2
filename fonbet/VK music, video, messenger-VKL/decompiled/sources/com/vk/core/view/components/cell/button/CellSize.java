package com.vk.core.view.components.cell.button;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButton.kt */
/* loaded from: classes17.dex */
public final class CellSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CellSize[] $VALUES;
    public static final CellSize Large;
    public static final CellSize Medium;
    public static final CellSize Small;

    static {
        CellSize cellSize = new CellSize("Small", 0);
        Small = cellSize;
        CellSize cellSize2 = new CellSize("Medium", 1);
        Medium = cellSize2;
        CellSize cellSize3 = new CellSize("Large", 2);
        Large = cellSize3;
        CellSize[] cellSizeArr = {cellSize, cellSize2, cellSize3};
        $VALUES = cellSizeArr;
        $ENTRIES = new asp(cellSizeArr);
    }

    public CellSize() {
        throw null;
    }

    public static CellSize valueOf(String str) {
        return (CellSize) Enum.valueOf(CellSize.class, str);
    }

    public static CellSize[] values() {
        return (CellSize[]) $VALUES.clone();
    }
}
