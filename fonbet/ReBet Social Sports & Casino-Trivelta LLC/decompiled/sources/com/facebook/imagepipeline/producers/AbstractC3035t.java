package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3035t extends AbstractC3019c {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3030n f30884b;

    public AbstractC3035t(InterfaceC3030n consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f30884b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3019c
    public void f() {
        this.f30884b.a();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3019c
    public void g(Throwable t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        this.f30884b.onFailure(t10);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3019c
    public void i(float f10) {
        this.f30884b.c(f10);
    }

    public final InterfaceC3030n o() {
        return this.f30884b;
    }
}
