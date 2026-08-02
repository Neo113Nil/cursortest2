package com.vk.dto.common.filter;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageSizeFilters.kt */
/* loaded from: classes18.dex */
public final class ImageSide {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImageSide[] $VALUES;
    public static final ImageSide HEIGHT;
    public static final ImageSide WIDTH;

    static {
        ImageSide imageSide = new ImageSide("WIDTH", 0);
        WIDTH = imageSide;
        ImageSide imageSide2 = new ImageSide("HEIGHT", 1);
        HEIGHT = imageSide2;
        ImageSide[] imageSideArr = {imageSide, imageSide2};
        $VALUES = imageSideArr;
        $ENTRIES = new asp(imageSideArr);
    }

    public ImageSide() {
        throw null;
    }

    public static ImageSide valueOf(String str) {
        return (ImageSide) Enum.valueOf(ImageSide.class, str);
    }

    public static ImageSide[] values() {
        return (ImageSide[]) $VALUES.clone();
    }
}
