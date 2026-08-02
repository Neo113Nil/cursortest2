package com.vk.ecomm.design.compose.imagegallery.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageGalleryItem.kt */
/* loaded from: classes18.dex */
public final class ImageGalleryCellItemPlaceholderType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImageGalleryCellItemPlaceholderType[] $VALUES;
    public static final ImageGalleryCellItemPlaceholderType PROGRESS;
    public static final ImageGalleryCellItemPlaceholderType RELOAD;

    static {
        ImageGalleryCellItemPlaceholderType imageGalleryCellItemPlaceholderType = new ImageGalleryCellItemPlaceholderType("PROGRESS", 0);
        PROGRESS = imageGalleryCellItemPlaceholderType;
        ImageGalleryCellItemPlaceholderType imageGalleryCellItemPlaceholderType2 = new ImageGalleryCellItemPlaceholderType("RELOAD", 1);
        RELOAD = imageGalleryCellItemPlaceholderType2;
        ImageGalleryCellItemPlaceholderType[] imageGalleryCellItemPlaceholderTypeArr = {imageGalleryCellItemPlaceholderType, imageGalleryCellItemPlaceholderType2};
        $VALUES = imageGalleryCellItemPlaceholderTypeArr;
        $ENTRIES = new asp(imageGalleryCellItemPlaceholderTypeArr);
    }

    public ImageGalleryCellItemPlaceholderType() {
        throw null;
    }

    public static ImageGalleryCellItemPlaceholderType valueOf(String str) {
        return (ImageGalleryCellItemPlaceholderType) Enum.valueOf(ImageGalleryCellItemPlaceholderType.class, str);
    }

    public static ImageGalleryCellItemPlaceholderType[] values() {
        return (ImageGalleryCellItemPlaceholderType[]) $VALUES.clone();
    }
}
