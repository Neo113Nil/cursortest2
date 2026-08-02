package com.vk.core.tool.compose.onboarding.tooltip;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOnboardingTooltipWrapper.kt */
/* loaded from: classes17.dex */
public final class Position$Vertical {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Position$Vertical[] $VALUES;
    public static final Position$Vertical Bottom;
    public static final Position$Vertical Top;

    static {
        Position$Vertical position$Vertical = new Position$Vertical("Top", 0);
        Top = position$Vertical;
        Position$Vertical position$Vertical2 = new Position$Vertical("Bottom", 1);
        Bottom = position$Vertical2;
        Position$Vertical[] position$VerticalArr = {position$Vertical, position$Vertical2};
        $VALUES = position$VerticalArr;
        $ENTRIES = new asp(position$VerticalArr);
    }

    public Position$Vertical() {
        throw null;
    }

    public static Position$Vertical valueOf(String str) {
        return (Position$Vertical) Enum.valueOf(Position$Vertical.class, str);
    }

    public static Position$Vertical[] values() {
        return (Position$Vertical[]) $VALUES.clone();
    }
}
