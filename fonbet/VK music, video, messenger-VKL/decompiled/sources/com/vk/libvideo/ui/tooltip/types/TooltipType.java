package com.vk.libvideo.ui.tooltip.types;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipType.kt */
/* loaded from: classes3.dex */
public final class TooltipType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TooltipType[] $VALUES;
    public static final TooltipType DOWNLOAD;
    public static final TooltipType KZ_SUB;
    public static final TooltipType MULTITRACK_ONBOARDING;
    public static final TooltipType MULTI_AUDIO;
    public static final TooltipType NEURO;

    static {
        TooltipType tooltipType = new TooltipType("NEURO", 0);
        NEURO = tooltipType;
        TooltipType tooltipType2 = new TooltipType("MULTI_AUDIO", 1);
        MULTI_AUDIO = tooltipType2;
        TooltipType tooltipType3 = new TooltipType("KZ_SUB", 2);
        KZ_SUB = tooltipType3;
        TooltipType tooltipType4 = new TooltipType("DOWNLOAD", 3);
        DOWNLOAD = tooltipType4;
        TooltipType tooltipType5 = new TooltipType("MULTITRACK_ONBOARDING", 4);
        MULTITRACK_ONBOARDING = tooltipType5;
        TooltipType[] tooltipTypeArr = {tooltipType, tooltipType2, tooltipType3, tooltipType4, tooltipType5};
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
