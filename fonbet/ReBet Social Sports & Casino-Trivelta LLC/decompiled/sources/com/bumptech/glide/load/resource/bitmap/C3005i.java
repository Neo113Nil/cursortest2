package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3005i implements com.bumptech.glide.load.l {

    /* renamed from: a, reason: collision with root package name */
    public final u f30036a;

    public C3005i(u uVar) {
        this.f30036a = uVar;
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v b(ByteBuffer byteBuffer, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return this.f30036a.g(byteBuffer, i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, com.bumptech.glide.load.j jVar) {
        return this.f30036a.q(byteBuffer);
    }
}
