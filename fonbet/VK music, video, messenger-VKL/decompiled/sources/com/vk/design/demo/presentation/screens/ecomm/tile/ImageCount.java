package com.vk.design.demo.presentation.screens.ecomm.tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketProductTileContentImages.kt */
/* loaded from: classes18.dex */
public final class ImageCount {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImageCount[] $VALUES;
    public static final ImageCount None;
    public static final ImageCount OneImage;
    public static final ImageCount TwoImages;

    static {
        ImageCount imageCount = new ImageCount("None", 0);
        None = imageCount;
        ImageCount imageCount2 = new ImageCount("OneImage", 1);
        OneImage = imageCount2;
        ImageCount imageCount3 = new ImageCount("TwoImages", 2);
        TwoImages = imageCount3;
        ImageCount[] imageCountArr = {imageCount, imageCount2, imageCount3};
        $VALUES = imageCountArr;
        $ENTRIES = new asp(imageCountArr);
    }

    public ImageCount() {
        throw null;
    }

    public static ImageCount valueOf(String str) {
        return (ImageCount) Enum.valueOf(ImageCount.class, str);
    }

    public static ImageCount[] values() {
        return (ImageCount[]) $VALUES.clone();
    }
}
