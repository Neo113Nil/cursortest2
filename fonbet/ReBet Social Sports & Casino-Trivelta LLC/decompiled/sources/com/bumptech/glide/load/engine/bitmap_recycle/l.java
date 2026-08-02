package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public interface l {
    String a(Bitmap bitmap);

    String b(int i10, int i11, Bitmap.Config config);

    void c(Bitmap bitmap);

    Bitmap d(int i10, int i11, Bitmap.Config config);

    int e(Bitmap bitmap);

    Bitmap removeLast();
}
