package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class m0 extends B6.h {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3030n f30823b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f30824c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f30825d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30826e;

    public m0(InterfaceC3030n consumer, g0 producerListener, e0 producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerListener, "producerListener");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        this.f30823b = consumer;
        this.f30824c = producerListener;
        this.f30825d = producerContext;
        this.f30826e = producerName;
        producerListener.d(producerContext, producerName);
    }

    @Override // B6.h
    public void d() {
        g0 g0Var = this.f30824c;
        e0 e0Var = this.f30825d;
        String str = this.f30826e;
        g0Var.c(e0Var, str, g0Var.f(e0Var, str) ? g() : null);
        this.f30823b.a();
    }

    @Override // B6.h
    public void e(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        g0 g0Var = this.f30824c;
        e0 e0Var = this.f30825d;
        String str = this.f30826e;
        g0Var.k(e0Var, str, e10, g0Var.f(e0Var, str) ? h(e10) : null);
        this.f30823b.onFailure(e10);
    }

    @Override // B6.h
    public void f(Object obj) {
        g0 g0Var = this.f30824c;
        e0 e0Var = this.f30825d;
        String str = this.f30826e;
        g0Var.j(e0Var, str, g0Var.f(e0Var, str) ? i(obj) : null);
        this.f30823b.b(obj, 1);
    }

    public Map g() {
        return null;
    }

    public Map h(Exception exc) {
        return null;
    }

    public Map i(Object obj) {
        return null;
    }
}
