package com.facebook.imagepipeline.nativecode;

import D6.k;
import android.graphics.Bitmap;

@D6.d
/* loaded from: classes2.dex */
public class NativeRoundingFilter {
    static {
        b.a();
    }

    @D6.d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i10, int i11, int i12, int i13);

    @D6.d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z10);

    @D6.d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z10);

    @D6.d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i10, int i11, boolean z10);

    @D6.d
    public static void toCircle(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z10);
    }

    @D6.d
    public static void toCircleFast(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z10);
    }
}
