package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* renamed from: com.facebook.imagepipeline.producers.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3024h extends U {

    /* renamed from: f, reason: collision with root package name */
    public final A7.k f30774f;

    public C3024h(A7.k kVar, d0 d0Var) {
        super(d0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f30774f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public H6.a g(H6.a aVar) {
        return H6.a.B(aVar);
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f30774f.a(e0Var.D0(), e0Var.d()), e0Var.T1());
    }
}
