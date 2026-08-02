package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes2.dex */
public final class D implements com.bumptech.glide.load.engine.v, com.bumptech.glide.load.engine.r {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f29989a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.v f29990b;

    public D(Resources resources, com.bumptech.glide.load.engine.v vVar) {
        this.f29989a = (Resources) com.bumptech.glide.util.k.d(resources);
        this.f29990b = (com.bumptech.glide.load.engine.v) com.bumptech.glide.util.k.d(vVar);
    }

    public static com.bumptech.glide.load.engine.v c(Resources resources, com.bumptech.glide.load.engine.v vVar) {
        if (vVar == null) {
            return null;
        }
        return new D(resources, vVar);
    }

    @Override // com.bumptech.glide.load.engine.v
    public Class a() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f29989a, (Bitmap) this.f29990b.get());
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.f29990b.getSize();
    }

    @Override // com.bumptech.glide.load.engine.r
    public void initialize() {
        com.bumptech.glide.load.engine.v vVar = this.f29990b;
        if (vVar instanceof com.bumptech.glide.load.engine.r) {
            ((com.bumptech.glide.load.engine.r) vVar).initialize();
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
        this.f29990b.recycle();
    }
}
