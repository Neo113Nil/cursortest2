package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import xsna.sex0;
import xsna.zsn;

@zsn
/* loaded from: classes12.dex */
public class NativeBlurFilter {
    static {
        NativeFiltersLoader.load();
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        bitmap.getClass();
        sex0.a(Boolean.valueOf(i > 0));
        sex0.a(Boolean.valueOf(i2 > 0));
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @zsn
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
