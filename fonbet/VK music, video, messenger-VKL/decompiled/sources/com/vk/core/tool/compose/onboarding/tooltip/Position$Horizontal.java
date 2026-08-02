package com.vk.core.tool.compose.onboarding.tooltip;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOnboardingTooltipWrapper.kt */
/* loaded from: classes17.dex */
public final class Position$Horizontal {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Position$Horizontal[] $VALUES;
    public static final Position$Horizontal Center;
    public static final Position$Horizontal Left;
    public static final Position$Horizontal Right;

    static {
        Position$Horizontal position$Horizontal = new Position$Horizontal("Left", 0);
        Left = position$Horizontal;
        Position$Horizontal position$Horizontal2 = new Position$Horizontal("Center", 1);
        Center = position$Horizontal2;
        Position$Horizontal position$Horizontal3 = new Position$Horizontal("Right", 2);
        Right = position$Horizontal3;
        Position$Horizontal[] position$HorizontalArr = {position$Horizontal, position$Horizontal2, position$Horizontal3};
        $VALUES = position$HorizontalArr;
        $ENTRIES = new asp(position$HorizontalArr);
    }

    public Position$Horizontal() {
        throw null;
    }

    public static Position$Horizontal valueOf(String str) {
        return (Position$Horizontal) Enum.valueOf(Position$Horizontal.class, str);
    }

    public static Position$Horizontal[] values() {
        return (Position$Horizontal[]) $VALUES.clone();
    }
}
