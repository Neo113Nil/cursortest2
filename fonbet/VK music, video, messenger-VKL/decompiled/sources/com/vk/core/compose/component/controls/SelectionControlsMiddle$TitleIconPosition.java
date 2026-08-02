package com.vk.core.compose.component.controls;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionControlsMiddle.kt */
/* loaded from: classes17.dex */
public final class SelectionControlsMiddle$TitleIconPosition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SelectionControlsMiddle$TitleIconPosition[] $VALUES;
    public static final SelectionControlsMiddle$TitleIconPosition AfterTitleText;
    public static final SelectionControlsMiddle$TitleIconPosition ComponentEnd;

    static {
        SelectionControlsMiddle$TitleIconPosition selectionControlsMiddle$TitleIconPosition = new SelectionControlsMiddle$TitleIconPosition("AfterTitleText", 0);
        AfterTitleText = selectionControlsMiddle$TitleIconPosition;
        SelectionControlsMiddle$TitleIconPosition selectionControlsMiddle$TitleIconPosition2 = new SelectionControlsMiddle$TitleIconPosition("ComponentEnd", 1);
        ComponentEnd = selectionControlsMiddle$TitleIconPosition2;
        SelectionControlsMiddle$TitleIconPosition[] selectionControlsMiddle$TitleIconPositionArr = {selectionControlsMiddle$TitleIconPosition, selectionControlsMiddle$TitleIconPosition2};
        $VALUES = selectionControlsMiddle$TitleIconPositionArr;
        $ENTRIES = new asp(selectionControlsMiddle$TitleIconPositionArr);
    }

    public SelectionControlsMiddle$TitleIconPosition() {
        throw null;
    }

    public static SelectionControlsMiddle$TitleIconPosition valueOf(String str) {
        return (SelectionControlsMiddle$TitleIconPosition) Enum.valueOf(SelectionControlsMiddle$TitleIconPosition.class, str);
    }

    public static SelectionControlsMiddle$TitleIconPosition[] values() {
        return (SelectionControlsMiddle$TitleIconPosition[]) $VALUES.clone();
    }
}
