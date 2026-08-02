package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2998b implements com.bumptech.glide.load.m {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f30028a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.m f30029b;

    public C2998b(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.m mVar) {
        this.f30028a = dVar;
        this.f30029b = mVar;
    }

    @Override // com.bumptech.glide.load.m
    public com.bumptech.glide.load.c b(com.bumptech.glide.load.j jVar) {
        return this.f30029b.b(jVar);
    }

    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(com.bumptech.glide.load.engine.v vVar, File file, com.bumptech.glide.load.j jVar) {
        return this.f30029b.a(new C3003g(((BitmapDrawable) vVar.get()).getBitmap(), this.f30028a), file, jVar);
    }
}
