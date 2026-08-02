package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3003g implements com.bumptech.glide.load.engine.v, com.bumptech.glide.load.engine.r {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f30034a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f30035b;

    public C3003g(Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        this.f30034a = (Bitmap) com.bumptech.glide.util.k.e(bitmap, "Bitmap must not be null");
        this.f30035b = (com.bumptech.glide.load.engine.bitmap_recycle.d) com.bumptech.glide.util.k.e(dVar, "BitmapPool must not be null");
    }

    public static C3003g c(Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C3003g(bitmap, dVar);
    }

    @Override // com.bumptech.glide.load.engine.v
    public Class a() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f30034a;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return com.bumptech.glide.util.l.i(this.f30034a);
    }

    @Override // com.bumptech.glide.load.engine.r
    public void initialize() {
        this.f30034a.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
        this.f30035b.c(this.f30034a);
    }
}
