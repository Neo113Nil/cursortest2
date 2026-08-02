package com.vk.core.compose.component.button.tool;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToolButton.kt */
/* loaded from: classes17.dex */
public final class ToolButton$TextPosition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ToolButton$TextPosition[] $VALUES;
    public static final ToolButton$TextPosition Bottom;
    public static final ToolButton$TextPosition None;
    public static final ToolButton$TextPosition Right;

    static {
        ToolButton$TextPosition toolButton$TextPosition = new ToolButton$TextPosition("None", 0);
        None = toolButton$TextPosition;
        ToolButton$TextPosition toolButton$TextPosition2 = new ToolButton$TextPosition("Right", 1);
        Right = toolButton$TextPosition2;
        ToolButton$TextPosition toolButton$TextPosition3 = new ToolButton$TextPosition("Bottom", 2);
        Bottom = toolButton$TextPosition3;
        ToolButton$TextPosition[] toolButton$TextPositionArr = {toolButton$TextPosition, toolButton$TextPosition2, toolButton$TextPosition3};
        $VALUES = toolButton$TextPositionArr;
        $ENTRIES = new asp(toolButton$TextPositionArr);
    }

    public ToolButton$TextPosition() {
        throw null;
    }

    public static zrp<ToolButton$TextPosition> h() {
        return $ENTRIES;
    }

    public static ToolButton$TextPosition valueOf(String str) {
        return (ToolButton$TextPosition) Enum.valueOf(ToolButton$TextPosition.class, str);
    }

    public static ToolButton$TextPosition[] values() {
        return (ToolButton$TextPosition[]) $VALUES.clone();
    }
}
