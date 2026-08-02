package com.vk.stickers.api.models.photo;

import android.graphics.Color;
import java.util.List;
import xsna.asp;
import xsna.e43;
import xsna.iah0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoStickerStyle.kt */
/* loaded from: classes5.dex */
public final class PhotoStickerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotoStickerStyle[] $VALUES;
    public static final PhotoStickerStyle CIRCLE_SHADOW;
    public static final a Companion;
    public static final PhotoStickerStyle DEFAULT_SHADOW;
    public static final PhotoStickerStyle RECTANGLE_SHADOW;
    public static final PhotoStickerStyle SQUARE_SHADOW;
    private static final List<PhotoStickerStyle> patterns;
    private final int borderColor;
    private final float borderWidth;
    private final int code;
    private final float shadowWidth;
    private final ShapeType shape;
    private final String styleName;

    /* compiled from: PhotoStickerStyle.kt */
    public static final class a {
    }

    static {
        PhotoStickerStyle photoStickerStyle = new PhotoStickerStyle("DEFAULT_SHADOW", 0, "rectangle", Color.parseColor("#09000000"), ShapeType.NONE, 0);
        DEFAULT_SHADOW = photoStickerStyle;
        PhotoStickerStyle photoStickerStyle2 = new PhotoStickerStyle("RECTANGLE_SHADOW", 1, "rounded_rectangle", Color.parseColor("#09000000"), ShapeType.RECTANGLE, 1);
        RECTANGLE_SHADOW = photoStickerStyle2;
        PhotoStickerStyle photoStickerStyle3 = new PhotoStickerStyle("SQUARE_SHADOW", 2, "rounded_square", Color.parseColor("#09000000"), ShapeType.SQUARE, 2);
        SQUARE_SHADOW = photoStickerStyle3;
        PhotoStickerStyle photoStickerStyle4 = new PhotoStickerStyle("CIRCLE_SHADOW", 3, "circle", Color.parseColor("#09000000"), ShapeType.CIRCLE, 3);
        CIRCLE_SHADOW = photoStickerStyle4;
        PhotoStickerStyle[] photoStickerStyleArr = {photoStickerStyle, photoStickerStyle2, photoStickerStyle3, photoStickerStyle4};
        $VALUES = photoStickerStyleArr;
        $ENTRIES = new asp(photoStickerStyleArr);
        Companion = new a();
        patterns = e43.l(photoStickerStyle2, photoStickerStyle3, photoStickerStyle4, photoStickerStyle);
    }

    public PhotoStickerStyle(String str, int i, String str2, int i2, ShapeType shapeType, int i3) {
        this.styleName = str2;
        this.borderColor = i2;
        this.shape = shapeType;
        this.code = i3;
        float f = 4;
        this.borderWidth = iah0.a(f);
        this.shadowWidth = iah0.a(f);
    }

    public static PhotoStickerStyle valueOf(String str) {
        return (PhotoStickerStyle) Enum.valueOf(PhotoStickerStyle.class, str);
    }

    public static PhotoStickerStyle[] values() {
        return (PhotoStickerStyle[]) $VALUES.clone();
    }

    public final int i() {
        return this.borderColor;
    }

    public final int j() {
        return this.code;
    }

    public final float k() {
        return this.shadowWidth;
    }

    public final ShapeType l() {
        return this.shape;
    }

    public final String m() {
        return this.styleName;
    }

    public final PhotoStickerStyle n() {
        List<PhotoStickerStyle> list = patterns;
        int indexOf = list.indexOf(this) + 1;
        if (indexOf == list.size()) {
            indexOf = 0;
        }
        return list.get(indexOf);
    }
}
