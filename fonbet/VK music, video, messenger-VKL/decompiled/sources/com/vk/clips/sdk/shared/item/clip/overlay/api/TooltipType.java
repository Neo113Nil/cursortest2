package com.vk.clips.sdk.shared.item.clip.overlay.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipType.kt */
/* loaded from: classes17.dex */
public final class TooltipType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TooltipType[] $VALUES;
    public static final TooltipType SOUND_MODERATION_NOT_PASSED;
    public static final TooltipType UNAVAILABLE_SOUND;

    static {
        TooltipType tooltipType = new TooltipType("UNAVAILABLE_SOUND", 0);
        UNAVAILABLE_SOUND = tooltipType;
        TooltipType tooltipType2 = new TooltipType("SOUND_MODERATION_NOT_PASSED", 1);
        SOUND_MODERATION_NOT_PASSED = tooltipType2;
        TooltipType[] tooltipTypeArr = {tooltipType, tooltipType2};
        $VALUES = tooltipTypeArr;
        $ENTRIES = new asp(tooltipTypeArr);
    }

    public TooltipType() {
        throw null;
    }

    public static TooltipType valueOf(String str) {
        return (TooltipType) Enum.valueOf(TooltipType.class, str);
    }

    public static TooltipType[] values() {
        return (TooltipType[]) $VALUES.clone();
    }
}
