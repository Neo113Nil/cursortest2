package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import xsna.zsn;

@zsn
/* loaded from: classes12.dex */
public class NativeRoundingFilter {
    static {
        NativeFiltersLoader.load();
    }

    public static void addRoundedCorners(Bitmap bitmap, int i, int i2, int i3, int i4) {
        nativeAddRoundedCornersFilter(bitmap, i, i2, i3, i4);
    }

    @zsn
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @zsn
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @zsn
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @zsn
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    public static void toCircle(Bitmap bitmap) {
        toCircle(bitmap, false);
    }

    public static void toCircleFast(Bitmap bitmap) {
        toCircleFast(bitmap, false);
    }

    public static void toCircleWithBorder(Bitmap bitmap, int i, int i2, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleWithBorderFilter(bitmap, i, i2, z);
    }

    @zsn
    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z);
    }

    @zsn
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z);
    }
}
