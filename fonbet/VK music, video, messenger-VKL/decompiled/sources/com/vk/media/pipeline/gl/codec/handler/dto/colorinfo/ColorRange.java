package com.vk.media.pipeline.gl.codec.handler.dto.colorinfo;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorRange.kt */
/* loaded from: classes3.dex */
public final class ColorRange {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ColorRange[] $VALUES;
    public static final ColorRange COLOR_RANGE_FULL;
    public static final ColorRange COLOR_RANGE_LIMITED;
    private final int mediaFormatValue;

    static {
        ColorRange colorRange = new ColorRange("COLOR_RANGE_LIMITED", 0, 2);
        COLOR_RANGE_LIMITED = colorRange;
        ColorRange colorRange2 = new ColorRange("COLOR_RANGE_FULL", 1, 1);
        COLOR_RANGE_FULL = colorRange2;
        ColorRange[] colorRangeArr = {colorRange, colorRange2};
        $VALUES = colorRangeArr;
        $ENTRIES = new asp(colorRangeArr);
    }

    public ColorRange(String str, int i, int i2) {
        this.mediaFormatValue = i2;
    }

    public static zrp<ColorRange> h() {
        return $ENTRIES;
    }

    public static ColorRange valueOf(String str) {
        return (ColorRange) Enum.valueOf(ColorRange.class, str);
    }

    public static ColorRange[] values() {
        return (ColorRange[]) $VALUES.clone();
    }

    public final int i() {
        return this.mediaFormatValue;
    }
}
