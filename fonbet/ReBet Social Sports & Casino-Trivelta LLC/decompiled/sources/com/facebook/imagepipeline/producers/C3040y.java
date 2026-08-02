package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* renamed from: com.facebook.imagepipeline.producers.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3040y extends U {

    /* renamed from: f, reason: collision with root package name */
    public final A7.k f30906f;

    public C3040y(A7.k kVar, boolean z10, d0 d0Var) {
        super(d0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z10);
        this.f30906f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public H7.k g(H7.k kVar) {
        return H7.k.k(kVar);
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f30906f.d(e0Var.D0(), e0Var.d()), e0Var.T1());
    }
}
