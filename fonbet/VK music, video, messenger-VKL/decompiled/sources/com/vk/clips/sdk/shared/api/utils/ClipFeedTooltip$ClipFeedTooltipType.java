package com.vk.clips.sdk.shared.api.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipFeedTooltip.kt */
/* loaded from: classes17.dex */
public final class ClipFeedTooltip$ClipFeedTooltipType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipFeedTooltip$ClipFeedTooltipType[] $VALUES;
    public static final ClipFeedTooltip$ClipFeedTooltipType AUTHOR_SWIPE_ONBOARDING;
    public static final ClipFeedTooltip$ClipFeedTooltipType DECORATION_ONBOARDING;
    public static final ClipFeedTooltip$ClipFeedTooltipType DOUBLE_TAP_ONBOARDING;
    public static final ClipFeedTooltip$ClipFeedTooltipType FAST_FORWARD_ONBOARDING;
    public static final ClipFeedTooltip$ClipFeedTooltipType SCROLL_ONBOARDING;
    public static final ClipFeedTooltip$ClipFeedTooltipType SOUND_CANNOT_BE_USED;
    public static final ClipFeedTooltip$ClipFeedTooltipType SUBSCRIBE;

    static {
        ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType = new ClipFeedTooltip$ClipFeedTooltipType("SCROLL_ONBOARDING", 0);
        SCROLL_ONBOARDING = clipFeedTooltip$ClipFeedTooltipType;
        ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType2 = new ClipFeedTooltip$ClipFeedTooltipType("DOUBLE_TAP_ONBOARDING", 1);
        DOUBLE_TAP_ONBOARDING = clipFeedTooltip$ClipFeedTooltipType2;
        ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType3 = new ClipFeedTooltip$ClipFeedTooltipType("SUBSCRIBE", 2);
        SUBSCRIBE = clipFeedTooltip$ClipFeedTooltipType3;
        ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType4 = new ClipFeedTooltip$ClipFeedTooltipType("SOUND_CANNOT_BE_USED", 3);
        SOUND_CANNOT_BE_USED = clipFeedTooltip$ClipFeedTooltipType4;
        ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType5 = new ClipFeedTooltip$ClipFeedTooltipType("DECORATION_ONBOARDING", 4);
        DECORATION_ONBOARDING = clipFeedTooltip$ClipFeedTooltipType5;
        ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType6 = new ClipFeedTooltip$ClipFeedTooltipType("FAST_FORWARD_ONBOARDING", 5);
        FAST_FORWARD_ONBOARDING = clipFeedTooltip$ClipFeedTooltipType6;
        ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType7 = new ClipFeedTooltip$ClipFeedTooltipType("AUTHOR_SWIPE_ONBOARDING", 6);
        AUTHOR_SWIPE_ONBOARDING = clipFeedTooltip$ClipFeedTooltipType7;
        ClipFeedTooltip$ClipFeedTooltipType[] clipFeedTooltip$ClipFeedTooltipTypeArr = {clipFeedTooltip$ClipFeedTooltipType, clipFeedTooltip$ClipFeedTooltipType2, clipFeedTooltip$ClipFeedTooltipType3, clipFeedTooltip$ClipFeedTooltipType4, clipFeedTooltip$ClipFeedTooltipType5, clipFeedTooltip$ClipFeedTooltipType6, clipFeedTooltip$ClipFeedTooltipType7};
        $VALUES = clipFeedTooltip$ClipFeedTooltipTypeArr;
        $ENTRIES = new asp(clipFeedTooltip$ClipFeedTooltipTypeArr);
    }

    public ClipFeedTooltip$ClipFeedTooltipType() {
        throw null;
    }

    public static zrp<ClipFeedTooltip$ClipFeedTooltipType> h() {
        return $ENTRIES;
    }

    public static ClipFeedTooltip$ClipFeedTooltipType valueOf(String str) {
        return (ClipFeedTooltip$ClipFeedTooltipType) Enum.valueOf(ClipFeedTooltip$ClipFeedTooltipType.class, str);
    }

    public static ClipFeedTooltip$ClipFeedTooltipType[] values() {
        return (ClipFeedTooltip$ClipFeedTooltipType[]) $VALUES.clone();
    }
}
