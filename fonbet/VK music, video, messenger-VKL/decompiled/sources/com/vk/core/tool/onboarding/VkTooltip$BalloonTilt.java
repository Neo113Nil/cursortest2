package com.vk.core.tool.onboarding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public final class VkTooltip$BalloonTilt {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkTooltip$BalloonTilt[] $VALUES;
    public static final VkTooltip$BalloonTilt Left;
    public static final VkTooltip$BalloonTilt Right;

    static {
        VkTooltip$BalloonTilt vkTooltip$BalloonTilt = new VkTooltip$BalloonTilt("Left", 0);
        Left = vkTooltip$BalloonTilt;
        VkTooltip$BalloonTilt vkTooltip$BalloonTilt2 = new VkTooltip$BalloonTilt("Right", 1);
        Right = vkTooltip$BalloonTilt2;
        VkTooltip$BalloonTilt[] vkTooltip$BalloonTiltArr = {vkTooltip$BalloonTilt, vkTooltip$BalloonTilt2};
        $VALUES = vkTooltip$BalloonTiltArr;
        $ENTRIES = new asp(vkTooltip$BalloonTiltArr);
    }

    public VkTooltip$BalloonTilt() {
        throw null;
    }

    public static VkTooltip$BalloonTilt valueOf(String str) {
        return (VkTooltip$BalloonTilt) Enum.valueOf(VkTooltip$BalloonTilt.class, str);
    }

    public static VkTooltip$BalloonTilt[] values() {
        return (VkTooltip$BalloonTilt[]) $VALUES.clone();
    }
}
