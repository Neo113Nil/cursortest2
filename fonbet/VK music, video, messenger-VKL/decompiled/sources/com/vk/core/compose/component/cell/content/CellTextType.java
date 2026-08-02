package com.vk.core.compose.component.cell.content;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextImpl.kt */
/* loaded from: classes17.dex */
public final class CellTextType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CellTextType[] $VALUES;
    public static final CellTextType ExtraSubtitle;
    public static final CellTextType Subtitle;
    public static final CellTextType Title;

    static {
        CellTextType cellTextType = new CellTextType("Title", 0);
        Title = cellTextType;
        CellTextType cellTextType2 = new CellTextType("Subtitle", 1);
        Subtitle = cellTextType2;
        CellTextType cellTextType3 = new CellTextType("ExtraSubtitle", 2);
        ExtraSubtitle = cellTextType3;
        CellTextType[] cellTextTypeArr = {cellTextType, cellTextType2, cellTextType3};
        $VALUES = cellTextTypeArr;
        $ENTRIES = new asp(cellTextTypeArr);
    }

    public CellTextType() {
        throw null;
    }

    public static CellTextType valueOf(String str) {
        return (CellTextType) Enum.valueOf(CellTextType.class, str);
    }

    public static CellTextType[] values() {
        return (CellTextType[]) $VALUES.clone();
    }
}
