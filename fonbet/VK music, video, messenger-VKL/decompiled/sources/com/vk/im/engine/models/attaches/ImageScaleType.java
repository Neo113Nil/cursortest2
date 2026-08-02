package com.vk.im.engine.models.attaches;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.on00;
import xsna.qe3;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageScaleType.kt */
/* loaded from: classes2.dex */
public final class ImageScaleType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImageScaleType[] $VALUES;
    public static final ImageScaleType BOTTOM_CROP;
    public static final ImageScaleType CENTER_CROP;
    public static final a Companion;
    public static final ImageScaleType TOP_CROP;
    private static final Lazy<Map<Integer, ImageScaleType>> values$delegate;
    private final int typeAsInt;

    /* compiled from: ImageScaleType.kt */
    public static final class a {
    }

    static {
        ImageScaleType imageScaleType = new ImageScaleType("TOP_CROP", 0, 1);
        TOP_CROP = imageScaleType;
        ImageScaleType imageScaleType2 = new ImageScaleType("CENTER_CROP", 1, 2);
        CENTER_CROP = imageScaleType2;
        ImageScaleType imageScaleType3 = new ImageScaleType("BOTTOM_CROP", 2, 3);
        BOTTOM_CROP = imageScaleType3;
        ImageScaleType[] imageScaleTypeArr = {imageScaleType, imageScaleType2, imageScaleType3};
        $VALUES = imageScaleTypeArr;
        $ENTRIES = new asp(imageScaleTypeArr);
        Companion = new a();
        values$delegate = new bpn0(new qe3(27));
    }

    public ImageScaleType(String str, int i, int i2) {
        this.typeAsInt = i2;
    }

    public static LinkedHashMap h() {
        ImageScaleType[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (ImageScaleType imageScaleType : values) {
            linkedHashMap.put(Integer.valueOf(imageScaleType.typeAsInt), imageScaleType);
        }
        return linkedHashMap;
    }

    public static ImageScaleType valueOf(String str) {
        return (ImageScaleType) Enum.valueOf(ImageScaleType.class, str);
    }

    public static ImageScaleType[] values() {
        return (ImageScaleType[]) $VALUES.clone();
    }

    public final int j() {
        return this.typeAsInt;
    }
}
