package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSliderDefault.kt */
/* loaded from: classes17.dex */
public final class SliderSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SliderSize[] $VALUES;
    public static final SliderSize Compact;
    public static final SliderSize Regular;

    static {
        SliderSize sliderSize = new SliderSize("Regular", 0);
        Regular = sliderSize;
        SliderSize sliderSize2 = new SliderSize("Compact", 1);
        Compact = sliderSize2;
        SliderSize[] sliderSizeArr = {sliderSize, sliderSize2};
        $VALUES = sliderSizeArr;
        $ENTRIES = new asp(sliderSizeArr);
    }

    public SliderSize() {
        throw null;
    }

    public static SliderSize valueOf(String str) {
        return (SliderSize) Enum.valueOf(SliderSize.class, str);
    }

    public static SliderSize[] values() {
        return (SliderSize[]) $VALUES.clone();
    }
}
