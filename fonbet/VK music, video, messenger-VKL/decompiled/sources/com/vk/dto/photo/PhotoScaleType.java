package com.vk.dto.photo;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoScaleType.kt */
/* loaded from: classes18.dex */
public final class PhotoScaleType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotoScaleType[] $VALUES;
    public static final PhotoScaleType BOTTOM_CROP;
    public static final PhotoScaleType CENTER_CROP;
    public static final a Companion;
    public static final PhotoScaleType TOP_CROP;
    private final String key;

    /* compiled from: PhotoScaleType.kt */
    public static final class a {
    }

    static {
        PhotoScaleType photoScaleType = new PhotoScaleType("TOP_CROP", 0, "top");
        TOP_CROP = photoScaleType;
        PhotoScaleType photoScaleType2 = new PhotoScaleType("CENTER_CROP", 1, TtmlNode.CENTER);
        CENTER_CROP = photoScaleType2;
        PhotoScaleType photoScaleType3 = new PhotoScaleType("BOTTOM_CROP", 2, "bottom");
        BOTTOM_CROP = photoScaleType3;
        PhotoScaleType[] photoScaleTypeArr = {photoScaleType, photoScaleType2, photoScaleType3};
        $VALUES = photoScaleTypeArr;
        $ENTRIES = new asp(photoScaleTypeArr);
        Companion = new a();
    }

    public PhotoScaleType(String str, int i, String str2) {
        this.key = str2;
    }

    public static final PhotoScaleType a(String str) {
        PhotoScaleType photoScaleType;
        Companion.getClass();
        PhotoScaleType[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                photoScaleType = null;
                break;
            }
            photoScaleType = values[i];
            if (epx.f(photoScaleType.h(), str)) {
                break;
            }
            i++;
        }
        return photoScaleType == null ? CENTER_CROP : photoScaleType;
    }

    public static PhotoScaleType valueOf(String str) {
        return (PhotoScaleType) Enum.valueOf(PhotoScaleType.class, str);
    }

    public static PhotoScaleType[] values() {
        return (PhotoScaleType[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }
}
