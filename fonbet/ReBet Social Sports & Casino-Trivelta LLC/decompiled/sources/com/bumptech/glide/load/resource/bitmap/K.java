package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class K implements com.bumptech.glide.load.l {

    public static final class a implements com.bumptech.glide.load.engine.v {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f30014a;

        public a(Bitmap bitmap) {
            this.f30014a = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.v
        public Class a() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.v
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f30014a;
        }

        @Override // com.bumptech.glide.load.engine.v
        public int getSize() {
            return com.bumptech.glide.util.l.i(this.f30014a);
        }

        @Override // com.bumptech.glide.load.engine.v
        public void recycle() {
        }
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v b(Bitmap bitmap, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, com.bumptech.glide.load.j jVar) {
        return true;
    }
}
