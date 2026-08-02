package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class CellButton$IconSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CellButton$IconSize[] $VALUES;
    public static final CellButton$IconSize Large;
    public static final CellButton$IconSize Medium;
    public static final CellButton$IconSize Small;

    static {
        CellButton$IconSize cellButton$IconSize = new CellButton$IconSize("Small", 0);
        Small = cellButton$IconSize;
        CellButton$IconSize cellButton$IconSize2 = new CellButton$IconSize("Medium", 1);
        Medium = cellButton$IconSize2;
        CellButton$IconSize cellButton$IconSize3 = new CellButton$IconSize("Large", 2);
        Large = cellButton$IconSize3;
        CellButton$IconSize[] cellButton$IconSizeArr = {cellButton$IconSize, cellButton$IconSize2, cellButton$IconSize3};
        $VALUES = cellButton$IconSizeArr;
        $ENTRIES = new asp(cellButton$IconSizeArr);
    }

    public CellButton$IconSize() {
        throw null;
    }

    public static zrp<CellButton$IconSize> h() {
        return $ENTRIES;
    }

    public static CellButton$IconSize valueOf(String str) {
        return (CellButton$IconSize) Enum.valueOf(CellButton$IconSize.class, str);
    }

    public static CellButton$IconSize[] values() {
        return (CellButton$IconSize[]) $VALUES.clone();
    }
}
