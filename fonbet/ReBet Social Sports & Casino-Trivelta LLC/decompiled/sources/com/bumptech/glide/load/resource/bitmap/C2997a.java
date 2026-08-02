package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2997a implements com.bumptech.glide.load.l {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.l f30026a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f30027b;

    public C2997a(Resources resources, com.bumptech.glide.load.l lVar) {
        this.f30027b = (Resources) com.bumptech.glide.util.k.d(resources);
        this.f30026a = (com.bumptech.glide.load.l) com.bumptech.glide.util.k.d(lVar);
    }

    @Override // com.bumptech.glide.load.l
    public boolean a(Object obj, com.bumptech.glide.load.j jVar) {
        return this.f30026a.a(obj, jVar);
    }

    @Override // com.bumptech.glide.load.l
    public com.bumptech.glide.load.engine.v b(Object obj, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return D.c(this.f30027b, this.f30026a.b(obj, i10, i11, jVar));
    }
}
