package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3007k implements com.bumptech.glide.load.l {

    /* renamed from: a, reason: collision with root package name */
    public final C3002f f30037a = new C3002f();

    @Override // com.bumptech.glide.load.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v b(ByteBuffer byteBuffer, int i10, int i11, com.bumptech.glide.load.j jVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f30037a.c(createSource, i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, com.bumptech.glide.load.j jVar) {
        return true;
    }
}
