package com.vk.core.compose.component.cell.content;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class Cell$Right$ExtraAction$Dropdown$Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Cell$Right$ExtraAction$Dropdown$Mode[] $VALUES;
    public static final Cell$Right$ExtraAction$Dropdown$Mode Primary;
    public static final Cell$Right$ExtraAction$Dropdown$Mode Secondary;

    static {
        Cell$Right$ExtraAction$Dropdown$Mode cell$Right$ExtraAction$Dropdown$Mode = new Cell$Right$ExtraAction$Dropdown$Mode("Primary", 0);
        Primary = cell$Right$ExtraAction$Dropdown$Mode;
        Cell$Right$ExtraAction$Dropdown$Mode cell$Right$ExtraAction$Dropdown$Mode2 = new Cell$Right$ExtraAction$Dropdown$Mode("Secondary", 1);
        Secondary = cell$Right$ExtraAction$Dropdown$Mode2;
        Cell$Right$ExtraAction$Dropdown$Mode[] cell$Right$ExtraAction$Dropdown$ModeArr = {cell$Right$ExtraAction$Dropdown$Mode, cell$Right$ExtraAction$Dropdown$Mode2};
        $VALUES = cell$Right$ExtraAction$Dropdown$ModeArr;
        $ENTRIES = new asp(cell$Right$ExtraAction$Dropdown$ModeArr);
    }

    public Cell$Right$ExtraAction$Dropdown$Mode() {
        throw null;
    }

    public static Cell$Right$ExtraAction$Dropdown$Mode valueOf(String str) {
        return (Cell$Right$ExtraAction$Dropdown$Mode) Enum.valueOf(Cell$Right$ExtraAction$Dropdown$Mode.class, str);
    }

    public static Cell$Right$ExtraAction$Dropdown$Mode[] values() {
        return (Cell$Right$ExtraAction$Dropdown$Mode[]) $VALUES.clone();
    }
}
