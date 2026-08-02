package com.vk.photo.editor.features.collage.model;

import com.coremedia.iso.boxes.FreeBox;
import com.unity3d.services.UnityAdsConstants;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CollageAspectRatioFormat.kt */
/* loaded from: classes4.dex */
public final class CollageAspectRatioFormat {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CollageAspectRatioFormat[] $VALUES;
    public static final CollageAspectRatioFormat Collage16X9;
    public static final CollageAspectRatioFormat Collage3X4;
    public static final CollageAspectRatioFormat Collage4X3;
    public static final CollageAspectRatioFormat Collage9X16;
    public static final CollageAspectRatioFormat CollageFree;
    public static final CollageAspectRatioFormat CollageOriginal;
    public static final CollageAspectRatioFormat CollageSquare;
    private final String id;
    private final float value;

    static {
        CollageAspectRatioFormat collageAspectRatioFormat = new CollageAspectRatioFormat("CollageOriginal", 0, "original", -1.0f);
        CollageOriginal = collageAspectRatioFormat;
        CollageAspectRatioFormat collageAspectRatioFormat2 = new CollageAspectRatioFormat("CollageFree", 1, FreeBox.TYPE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        CollageFree = collageAspectRatioFormat2;
        CollageAspectRatioFormat collageAspectRatioFormat3 = new CollageAspectRatioFormat("CollageSquare", 2, "square", 1.0f);
        CollageSquare = collageAspectRatioFormat3;
        CollageAspectRatioFormat collageAspectRatioFormat4 = new CollageAspectRatioFormat("Collage3X4", 3, "3x4", 0.75f);
        Collage3X4 = collageAspectRatioFormat4;
        CollageAspectRatioFormat collageAspectRatioFormat5 = new CollageAspectRatioFormat("Collage4X3", 4, "4x3", 1.3333334f);
        Collage4X3 = collageAspectRatioFormat5;
        CollageAspectRatioFormat collageAspectRatioFormat6 = new CollageAspectRatioFormat("Collage16X9", 5, "16x9", 1.7777778f);
        Collage16X9 = collageAspectRatioFormat6;
        CollageAspectRatioFormat collageAspectRatioFormat7 = new CollageAspectRatioFormat("Collage9X16", 6, "9x16", 0.5625f);
        Collage9X16 = collageAspectRatioFormat7;
        CollageAspectRatioFormat[] collageAspectRatioFormatArr = {collageAspectRatioFormat, collageAspectRatioFormat2, collageAspectRatioFormat3, collageAspectRatioFormat4, collageAspectRatioFormat5, collageAspectRatioFormat6, collageAspectRatioFormat7};
        $VALUES = collageAspectRatioFormatArr;
        $ENTRIES = new asp(collageAspectRatioFormatArr);
    }

    public CollageAspectRatioFormat(String str, int i, String str2, float f) {
        this.id = str2;
        this.value = f;
    }

    public static zrp<CollageAspectRatioFormat> h() {
        return $ENTRIES;
    }

    public static CollageAspectRatioFormat valueOf(String str) {
        return (CollageAspectRatioFormat) Enum.valueOf(CollageAspectRatioFormat.class, str);
    }

    public static CollageAspectRatioFormat[] values() {
        return (CollageAspectRatioFormat[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    public final float i() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.id;
    }
}
