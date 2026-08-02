package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class C implements com.bumptech.glide.load.l {

    /* renamed from: a, reason: collision with root package name */
    public final C3002f f29988a = new C3002f();

    @Override // com.bumptech.glide.load.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v b(InputStream inputStream, int i10, int i11, com.bumptech.glide.load.j jVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream));
        return this.f29988a.c(createSource, i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, com.bumptech.glide.load.j jVar) {
        return true;
    }
}
