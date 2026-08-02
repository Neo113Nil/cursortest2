package com.vk.image.coder;

import android.graphics.Bitmap;

/* compiled from: ImageCoder.kt */
/* loaded from: classes2.dex */
public final class ImageCoder {
    public static final ImageCoder a = new ImageCoder();

    static {
        System.loadLibrary("vk-jpeg-coder");
    }

    private final native boolean nativeEncode(Bitmap bitmap, String str, int i, boolean z);

    public final boolean a(Bitmap bitmap, String str, int i) {
        return nativeEncode(bitmap, str, i, true);
    }
}
