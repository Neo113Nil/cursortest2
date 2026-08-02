package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class CellButton$IconBackgroundStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CellButton$IconBackgroundStyle[] $VALUES;
    public static final CellButton$IconBackgroundStyle Circle;
    public static final CellButton$IconBackgroundStyle None;
    public static final CellButton$IconBackgroundStyle SquireLargeRadius;
    public static final CellButton$IconBackgroundStyle SquireMediumRadius;
    public static final CellButton$IconBackgroundStyle SquireSmallRadius;

    static {
        CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle = new CellButton$IconBackgroundStyle("None", 0);
        None = cellButton$IconBackgroundStyle;
        CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle2 = new CellButton$IconBackgroundStyle("Circle", 1);
        Circle = cellButton$IconBackgroundStyle2;
        CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle3 = new CellButton$IconBackgroundStyle("SquireSmallRadius", 2);
        SquireSmallRadius = cellButton$IconBackgroundStyle3;
        CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle4 = new CellButton$IconBackgroundStyle("SquireMediumRadius", 3);
        SquireMediumRadius = cellButton$IconBackgroundStyle4;
        CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle5 = new CellButton$IconBackgroundStyle("SquireLargeRadius", 4);
        SquireLargeRadius = cellButton$IconBackgroundStyle5;
        CellButton$IconBackgroundStyle[] cellButton$IconBackgroundStyleArr = {cellButton$IconBackgroundStyle, cellButton$IconBackgroundStyle2, cellButton$IconBackgroundStyle3, cellButton$IconBackgroundStyle4, cellButton$IconBackgroundStyle5};
        $VALUES = cellButton$IconBackgroundStyleArr;
        $ENTRIES = new asp(cellButton$IconBackgroundStyleArr);
    }

    public CellButton$IconBackgroundStyle() {
        throw null;
    }

    public static zrp<CellButton$IconBackgroundStyle> h() {
        return $ENTRIES;
    }

    public static CellButton$IconBackgroundStyle valueOf(String str) {
        return (CellButton$IconBackgroundStyle) Enum.valueOf(CellButton$IconBackgroundStyle.class, str);
    }

    public static CellButton$IconBackgroundStyle[] values() {
        return (CellButton$IconBackgroundStyle[]) $VALUES.clone();
    }
}
