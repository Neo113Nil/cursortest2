package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.dylanvann.fastimage.FastImageGlideModule;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a, reason: collision with root package name */
    public final FastImageGlideModule f29495a = new FastImageGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        Log.isLoggable("Glide", 3);
    }

    @Override // J4.c
    public void a(Context context, c cVar, j jVar) {
        new com.bumptech.glide.integration.okhttp3.a().a(context, cVar, jVar);
        new com.dylanvann.fastimage.b().a(context, cVar, jVar);
        this.f29495a.a(context, cVar, jVar);
    }

    @Override // J4.a
    public void b(Context context, d dVar) {
        this.f29495a.b(context, dVar);
    }

    @Override // J4.a
    public boolean c() {
        return this.f29495a.c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public Set d() {
        return Collections.EMPTY_SET;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a e() {
        return new a();
    }
}
