package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public class G implements com.bumptech.glide.load.l {

    /* renamed from: a, reason: collision with root package name */
    public final F4.m f29997a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f29998b;

    public G(F4.m mVar, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        this.f29997a = mVar;
        this.f29998b = dVar;
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v b(Uri uri, int i10, int i11, com.bumptech.glide.load.j jVar) {
        com.bumptech.glide.load.engine.v b10 = this.f29997a.b(uri, i10, i11, jVar);
        if (b10 == null) {
            return null;
        }
        return v.a(this.f29998b, (Drawable) b10.get(), i10, i11);
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, com.bumptech.glide.load.j jVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
