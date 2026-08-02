package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class F extends E implements J7.d {

    /* renamed from: c, reason: collision with root package name */
    public final J7.e f30631c;

    /* renamed from: d, reason: collision with root package name */
    public final J7.d f30632d;

    public F(J7.e eVar, J7.d dVar) {
        super(eVar, dVar);
        this.f30631c = eVar;
        this.f30632d = dVar;
    }

    @Override // J7.d
    public void a(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        J7.e eVar = this.f30631c;
        if (eVar != null) {
            eVar.onRequestStart(producerContext.D0(), producerContext.d(), producerContext.getId(), producerContext.n1());
        }
        J7.d dVar = this.f30632d;
        if (dVar != null) {
            dVar.a(producerContext);
        }
    }

    @Override // J7.d
    public void e(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        J7.e eVar = this.f30631c;
        if (eVar != null) {
            eVar.onRequestSuccess(producerContext.D0(), producerContext.getId(), producerContext.n1());
        }
        J7.d dVar = this.f30632d;
        if (dVar != null) {
            dVar.e(producerContext);
        }
    }

    @Override // J7.d
    public void g(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        J7.e eVar = this.f30631c;
        if (eVar != null) {
            eVar.onRequestCancellation(producerContext.getId());
        }
        J7.d dVar = this.f30632d;
        if (dVar != null) {
            dVar.g(producerContext);
        }
    }

    @Override // J7.d
    public void i(e0 producerContext, Throwable th2) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        J7.e eVar = this.f30631c;
        if (eVar != null) {
            eVar.onRequestFailure(producerContext.D0(), producerContext.getId(), th2, producerContext.n1());
        }
        J7.d dVar = this.f30632d;
        if (dVar != null) {
            dVar.i(producerContext, th2);
        }
    }
}
