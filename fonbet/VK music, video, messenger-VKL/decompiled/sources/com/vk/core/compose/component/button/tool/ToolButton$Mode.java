package com.vk.core.compose.component.button.tool;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToolButton.kt */
/* loaded from: classes17.dex */
public final class ToolButton$Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ToolButton$Mode[] $VALUES;
    public static final ToolButton$Mode Outline;
    public static final ToolButton$Mode Primary;
    public static final ToolButton$Mode Secondary;
    public static final ToolButton$Mode Tertiary;

    static {
        ToolButton$Mode toolButton$Mode = new ToolButton$Mode("Primary", 0);
        Primary = toolButton$Mode;
        ToolButton$Mode toolButton$Mode2 = new ToolButton$Mode("Secondary", 1);
        Secondary = toolButton$Mode2;
        ToolButton$Mode toolButton$Mode3 = new ToolButton$Mode("Tertiary", 2);
        Tertiary = toolButton$Mode3;
        ToolButton$Mode toolButton$Mode4 = new ToolButton$Mode("Outline", 3);
        Outline = toolButton$Mode4;
        ToolButton$Mode[] toolButton$ModeArr = {toolButton$Mode, toolButton$Mode2, toolButton$Mode3, toolButton$Mode4};
        $VALUES = toolButton$ModeArr;
        $ENTRIES = new asp(toolButton$ModeArr);
    }

    public ToolButton$Mode() {
        throw null;
    }

    public static zrp<ToolButton$Mode> h() {
        return $ENTRIES;
    }

    public static ToolButton$Mode valueOf(String str) {
        return (ToolButton$Mode) Enum.valueOf(ToolButton$Mode.class, str);
    }

    public static ToolButton$Mode[] values() {
        return (ToolButton$Mode[]) $VALUES.clone();
    }
}
