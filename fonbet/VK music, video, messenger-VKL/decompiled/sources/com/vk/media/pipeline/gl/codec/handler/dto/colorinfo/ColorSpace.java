package com.vk.media.pipeline.gl.codec.handler.dto.colorinfo;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorSpace.kt */
/* loaded from: classes3.dex */
public final class ColorSpace {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ColorSpace[] $VALUES;
    public static final ColorSpace COLOR_SPACE_BT2020;
    public static final ColorSpace COLOR_SPACE_BT601;
    public static final ColorSpace COLOR_SPACE_BT601_NTSC;
    public static final ColorSpace COLOR_SPACE_BT709;
    private final int mediaFormatValue;

    static {
        ColorSpace colorSpace = new ColorSpace("COLOR_SPACE_BT601", 0, 2);
        COLOR_SPACE_BT601 = colorSpace;
        ColorSpace colorSpace2 = new ColorSpace("COLOR_SPACE_BT601_NTSC", 1, 4);
        COLOR_SPACE_BT601_NTSC = colorSpace2;
        ColorSpace colorSpace3 = new ColorSpace("COLOR_SPACE_BT709", 2, 1);
        COLOR_SPACE_BT709 = colorSpace3;
        ColorSpace colorSpace4 = new ColorSpace("COLOR_SPACE_BT2020", 3, 6);
        COLOR_SPACE_BT2020 = colorSpace4;
        ColorSpace[] colorSpaceArr = {colorSpace, colorSpace2, colorSpace3, colorSpace4};
        $VALUES = colorSpaceArr;
        $ENTRIES = new asp(colorSpaceArr);
    }

    public ColorSpace(String str, int i, int i2) {
        this.mediaFormatValue = i2;
    }

    public static zrp<ColorSpace> h() {
        return $ENTRIES;
    }

    public static ColorSpace valueOf(String str) {
        return (ColorSpace) Enum.valueOf(ColorSpace.class, str);
    }

    public static ColorSpace[] values() {
        return (ColorSpace[]) $VALUES.clone();
    }

    public final int i() {
        return this.mediaFormatValue;
    }
}
