package com.vk.core.tool.onboarding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public final class VkTooltip$BalloonPosition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkTooltip$BalloonPosition[] $VALUES;
    public static final VkTooltip$BalloonPosition Bottom;
    public static final VkTooltip$BalloonPosition BottomLeft;
    public static final VkTooltip$BalloonPosition BottomRight;
    public static final VkTooltip$BalloonPosition Top;
    public static final VkTooltip$BalloonPosition TopLeft;
    public static final VkTooltip$BalloonPosition TopRight;

    static {
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition = new VkTooltip$BalloonPosition("Top", 0);
        Top = vkTooltip$BalloonPosition;
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition2 = new VkTooltip$BalloonPosition("Bottom", 1);
        Bottom = vkTooltip$BalloonPosition2;
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition3 = new VkTooltip$BalloonPosition("TopLeft", 2);
        TopLeft = vkTooltip$BalloonPosition3;
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition4 = new VkTooltip$BalloonPosition("TopRight", 3);
        TopRight = vkTooltip$BalloonPosition4;
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition5 = new VkTooltip$BalloonPosition("BottomRight", 4);
        BottomRight = vkTooltip$BalloonPosition5;
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition6 = new VkTooltip$BalloonPosition("BottomLeft", 5);
        BottomLeft = vkTooltip$BalloonPosition6;
        VkTooltip$BalloonPosition[] vkTooltip$BalloonPositionArr = {vkTooltip$BalloonPosition, vkTooltip$BalloonPosition2, vkTooltip$BalloonPosition3, vkTooltip$BalloonPosition4, vkTooltip$BalloonPosition5, vkTooltip$BalloonPosition6};
        $VALUES = vkTooltip$BalloonPositionArr;
        $ENTRIES = new asp(vkTooltip$BalloonPositionArr);
    }

    public VkTooltip$BalloonPosition() {
        throw null;
    }

    public static VkTooltip$BalloonPosition valueOf(String str) {
        return (VkTooltip$BalloonPosition) Enum.valueOf(VkTooltip$BalloonPosition.class, str);
    }

    public static VkTooltip$BalloonPosition[] values() {
        return (VkTooltip$BalloonPosition[]) $VALUES.clone();
    }
}
