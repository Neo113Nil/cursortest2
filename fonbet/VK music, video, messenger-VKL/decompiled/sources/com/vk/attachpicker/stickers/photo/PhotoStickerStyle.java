package com.vk.attachpicker.stickers.photo;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoStickerInfo.kt */
/* loaded from: classes15.dex */
public final class PhotoStickerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotoStickerStyle[] $VALUES;
    public static final PhotoStickerStyle FULLSCREEN;
    public static final PhotoStickerStyle PREVIEW;
    private final int code;
    private final String value;

    static {
        PhotoStickerStyle photoStickerStyle = new PhotoStickerStyle("PREVIEW", 0, 8, "preview");
        PREVIEW = photoStickerStyle;
        PhotoStickerStyle photoStickerStyle2 = new PhotoStickerStyle("FULLSCREEN", 1, 10, "fullview");
        FULLSCREEN = photoStickerStyle2;
        PhotoStickerStyle[] photoStickerStyleArr = {photoStickerStyle, photoStickerStyle2};
        $VALUES = photoStickerStyleArr;
        $ENTRIES = new asp(photoStickerStyleArr);
    }

    public PhotoStickerStyle(String str, int i, int i2, String str2) {
        this.code = i2;
        this.value = str2;
    }

    public static zrp<PhotoStickerStyle> i() {
        return $ENTRIES;
    }

    public static PhotoStickerStyle valueOf(String str) {
        return (PhotoStickerStyle) Enum.valueOf(PhotoStickerStyle.class, str);
    }

    public static PhotoStickerStyle[] values() {
        return (PhotoStickerStyle[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }

    public final String j() {
        return this.value;
    }
}
