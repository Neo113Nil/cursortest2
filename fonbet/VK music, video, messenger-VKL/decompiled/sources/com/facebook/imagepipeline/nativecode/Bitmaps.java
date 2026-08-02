package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import xsna.sex0;
import xsna.zsn;

@zsn
/* loaded from: classes.dex */
public class Bitmaps {
    public static final /* synthetic */ int a = 0;

    static {
        ImagePipelineNativeLoader.load();
    }

    @zsn
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        sex0.a(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        sex0.a(Boolean.valueOf(bitmap.isMutable()));
        sex0.a(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        sex0.a(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @zsn
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
