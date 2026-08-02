package com.vk.photo.editor.features.crop.models.params;

import com.unity3d.services.UnityAdsConstants;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CropAspectRatioFormat.kt */
/* loaded from: classes4.dex */
public final class CropAspectRatioFormat {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CropAspectRatioFormat[] $VALUES;
    public static final CropAspectRatioFormat Crop16X9;
    public static final CropAspectRatioFormat Crop3X4;
    public static final CropAspectRatioFormat Crop4X3;
    public static final CropAspectRatioFormat Crop9X16;
    public static final CropAspectRatioFormat CropFree;
    public static final CropAspectRatioFormat CropOriginal;
    public static final CropAspectRatioFormat CropSquare;
    private final float value;

    /* compiled from: CropAspectRatioFormat.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CropAspectRatioFormat.values().length];
            try {
                iArr[CropAspectRatioFormat.CropOriginal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropAspectRatioFormat.CropFree.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropAspectRatioFormat.CropSquare.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropAspectRatioFormat.Crop3X4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CropAspectRatioFormat.Crop4X3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CropAspectRatioFormat.Crop16X9.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CropAspectRatioFormat.Crop9X16.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        CropAspectRatioFormat cropAspectRatioFormat = new CropAspectRatioFormat("CropOriginal", 0, -1.0f);
        CropOriginal = cropAspectRatioFormat;
        CropAspectRatioFormat cropAspectRatioFormat2 = new CropAspectRatioFormat("CropFree", 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        CropFree = cropAspectRatioFormat2;
        CropAspectRatioFormat cropAspectRatioFormat3 = new CropAspectRatioFormat("CropSquare", 2, 1.0f);
        CropSquare = cropAspectRatioFormat3;
        CropAspectRatioFormat cropAspectRatioFormat4 = new CropAspectRatioFormat("Crop3X4", 3, 0.75f);
        Crop3X4 = cropAspectRatioFormat4;
        CropAspectRatioFormat cropAspectRatioFormat5 = new CropAspectRatioFormat("Crop4X3", 4, 1.3333334f);
        Crop4X3 = cropAspectRatioFormat5;
        CropAspectRatioFormat cropAspectRatioFormat6 = new CropAspectRatioFormat("Crop16X9", 5, 1.7777778f);
        Crop16X9 = cropAspectRatioFormat6;
        CropAspectRatioFormat cropAspectRatioFormat7 = new CropAspectRatioFormat("Crop9X16", 6, 0.5625f);
        Crop9X16 = cropAspectRatioFormat7;
        CropAspectRatioFormat[] cropAspectRatioFormatArr = {cropAspectRatioFormat, cropAspectRatioFormat2, cropAspectRatioFormat3, cropAspectRatioFormat4, cropAspectRatioFormat5, cropAspectRatioFormat6, cropAspectRatioFormat7};
        $VALUES = cropAspectRatioFormatArr;
        $ENTRIES = new asp(cropAspectRatioFormatArr);
    }

    public CropAspectRatioFormat(String str, int i, float f) {
        this.value = f;
    }

    public static CropAspectRatioFormat valueOf(String str) {
        return (CropAspectRatioFormat) Enum.valueOf(CropAspectRatioFormat.class, str);
    }

    public static CropAspectRatioFormat[] values() {
        return (CropAspectRatioFormat[]) $VALUES.clone();
    }

    public final float h() {
        return this.value;
    }
}
