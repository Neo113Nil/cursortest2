package com.vk.core.util.measure;

import xsna.asp;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScaleType.kt */
/* loaded from: classes17.dex */
public final class ScaleType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScaleType[] $VALUES;
    public static final ScaleType BOTTOM_CROP;
    public static final ScaleType CENTER_CROP;
    public static final ScaleType CENTER_CROP_UPSCALE;
    public static final ScaleType CENTER_INSIDE;
    public static final a Companion;
    public static final ScaleType FIT_CENTER;
    public static final ScaleType FIT_END;
    public static final ScaleType FIT_START;
    public static final ScaleType FIT_XY;
    public static final ScaleType TOP_CROP;
    private final int typeAsInt;

    /* compiled from: ScaleType.kt */
    public static final class a {
        public static ScaleType a(int i) {
            switch (i) {
                case 1:
                    return ScaleType.FIT_XY;
                case 2:
                    return ScaleType.CENTER_CROP;
                case 3:
                    return ScaleType.CENTER_INSIDE;
                case 4:
                    return ScaleType.FIT_START;
                case 5:
                    return ScaleType.FIT_CENTER;
                case 6:
                    return ScaleType.FIT_END;
                case 7:
                    return ScaleType.CENTER_CROP_UPSCALE;
                case 8:
                    return ScaleType.TOP_CROP;
                case 9:
                    return ScaleType.BOTTOM_CROP;
                default:
                    throw new IllegalArgumentException(lhg.a(i, "Unknown typeAsInt value: "));
            }
        }
    }

    static {
        ScaleType scaleType = new ScaleType("FIT_XY", 0, 1);
        FIT_XY = scaleType;
        ScaleType scaleType2 = new ScaleType("CENTER_CROP", 1, 2);
        CENTER_CROP = scaleType2;
        ScaleType scaleType3 = new ScaleType("CENTER_INSIDE", 2, 3);
        CENTER_INSIDE = scaleType3;
        ScaleType scaleType4 = new ScaleType("FIT_START", 3, 4);
        FIT_START = scaleType4;
        ScaleType scaleType5 = new ScaleType("FIT_CENTER", 4, 5);
        FIT_CENTER = scaleType5;
        ScaleType scaleType6 = new ScaleType("FIT_END", 5, 6);
        FIT_END = scaleType6;
        ScaleType scaleType7 = new ScaleType("CENTER_CROP_UPSCALE", 6, 7);
        CENTER_CROP_UPSCALE = scaleType7;
        ScaleType scaleType8 = new ScaleType("TOP_CROP", 7, 8);
        TOP_CROP = scaleType8;
        ScaleType scaleType9 = new ScaleType("BOTTOM_CROP", 8, 9);
        BOTTOM_CROP = scaleType9;
        ScaleType[] scaleTypeArr = {scaleType, scaleType2, scaleType3, scaleType4, scaleType5, scaleType6, scaleType7, scaleType8, scaleType9};
        $VALUES = scaleTypeArr;
        $ENTRIES = new asp(scaleTypeArr);
        Companion = new a();
    }

    public ScaleType(String str, int i, int i2) {
        this.typeAsInt = i2;
    }

    public static ScaleType valueOf(String str) {
        return (ScaleType) Enum.valueOf(ScaleType.class, str);
    }

    public static ScaleType[] values() {
        return (ScaleType[]) $VALUES.clone();
    }

    public final int h() {
        return this.typeAsInt;
    }
}
