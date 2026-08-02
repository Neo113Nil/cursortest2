package com.vk.core.compose.component.button.tool;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToolButton.kt */
/* loaded from: classes17.dex */
public final class ToolButton$Appearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ToolButton$Appearance[] $VALUES;
    public static final ToolButton$Appearance Accent;
    public static final ToolButton$Appearance Neutral;
    public static final ToolButton$Appearance Overlay;

    static {
        ToolButton$Appearance toolButton$Appearance = new ToolButton$Appearance("Accent", 0);
        Accent = toolButton$Appearance;
        ToolButton$Appearance toolButton$Appearance2 = new ToolButton$Appearance("Neutral", 1);
        Neutral = toolButton$Appearance2;
        ToolButton$Appearance toolButton$Appearance3 = new ToolButton$Appearance("Overlay", 2);
        Overlay = toolButton$Appearance3;
        ToolButton$Appearance[] toolButton$AppearanceArr = {toolButton$Appearance, toolButton$Appearance2, toolButton$Appearance3};
        $VALUES = toolButton$AppearanceArr;
        $ENTRIES = new asp(toolButton$AppearanceArr);
    }

    public ToolButton$Appearance() {
        throw null;
    }

    public static zrp<ToolButton$Appearance> h() {
        return $ENTRIES;
    }

    public static ToolButton$Appearance valueOf(String str) {
        return (ToolButton$Appearance) Enum.valueOf(ToolButton$Appearance.class, str);
    }

    public static ToolButton$Appearance[] values() {
        return (ToolButton$Appearance[]) $VALUES.clone();
    }
}
