package com.vk.voip.ui.groupcalls.grid.type;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GridViewType.kt */
/* loaded from: classes7.dex */
public final class GridViewType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GridViewType[] $VALUES;
    public static final GridViewType FIT_BETWEEN_CONTROLS;
    public static final GridViewType FULL_SCREEN;

    static {
        GridViewType gridViewType = new GridViewType("FULL_SCREEN", 0);
        FULL_SCREEN = gridViewType;
        GridViewType gridViewType2 = new GridViewType("FIT_BETWEEN_CONTROLS", 1);
        FIT_BETWEEN_CONTROLS = gridViewType2;
        GridViewType[] gridViewTypeArr = {gridViewType, gridViewType2};
        $VALUES = gridViewTypeArr;
        $ENTRIES = new asp(gridViewTypeArr);
    }

    public GridViewType() {
        throw null;
    }

    public static GridViewType valueOf(String str) {
        return (GridViewType) Enum.valueOf(GridViewType.class, str);
    }

    public static GridViewType[] values() {
        return (GridViewType[]) $VALUES.clone();
    }
}
