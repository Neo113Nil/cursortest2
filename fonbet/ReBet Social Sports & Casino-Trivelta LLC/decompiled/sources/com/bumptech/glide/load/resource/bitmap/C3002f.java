package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3002f implements com.bumptech.glide.load.l {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f30033a = new com.bumptech.glide.load.engine.bitmap_recycle.e();

    @Override // com.bumptech.glide.load.l
    public /* bridge */ /* synthetic */ boolean a(Object obj, com.bumptech.glide.load.j jVar) {
        return d(AbstractC3000d.a(obj), jVar);
    }

    @Override // com.bumptech.glide.load.l
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.v b(Object obj, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return c(AbstractC3000d.a(obj), i10, i11, jVar);
    }

    public com.bumptech.glide.load.engine.v c(ImageDecoder.Source source, int i10, int i11, com.bumptech.glide.load.j jVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new D4.j(i10, i11, jVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new C3003g(decodeBitmap, this.f30033a);
    }

    public boolean d(ImageDecoder.Source source, com.bumptech.glide.load.j jVar) {
        return true;
    }
}
