package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class E implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f30629a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f30630b;

    public E(h0 h0Var, g0 g0Var) {
        this.f30629a = h0Var;
        this.f30630b = g0Var;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void b(e0 context, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f30629a;
        if (h0Var != null) {
            h0Var.onUltimateProducerReached(context.getId(), str, z10);
        }
        g0 g0Var = this.f30630b;
        if (g0Var != null) {
            g0Var.b(context, str, z10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void c(e0 context, String str, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f30629a;
        if (h0Var != null) {
            h0Var.onProducerFinishWithCancellation(context.getId(), str, map);
        }
        g0 g0Var = this.f30630b;
        if (g0Var != null) {
            g0Var.c(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void d(e0 context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f30629a;
        if (h0Var != null) {
            h0Var.onProducerStart(context.getId(), str);
        }
        g0 g0Var = this.f30630b;
        if (g0Var != null) {
            g0Var.d(context, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public boolean f(e0 context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f30629a;
        Boolean valueOf = h0Var != null ? Boolean.valueOf(h0Var.requiresExtraMap(context.getId())) : null;
        if (!Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
            g0 g0Var = this.f30630b;
            valueOf = g0Var != null ? Boolean.valueOf(g0Var.f(context, str)) : null;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void h(e0 context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f30629a;
        if (h0Var != null) {
            h0Var.onProducerEvent(context.getId(), str, str2);
        }
        g0 g0Var = this.f30630b;
        if (g0Var != null) {
            g0Var.h(context, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void j(e0 context, String str, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f30629a;
        if (h0Var != null) {
            h0Var.onProducerFinishWithSuccess(context.getId(), str, map);
        }
        g0 g0Var = this.f30630b;
        if (g0Var != null) {
            g0Var.j(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void k(e0 context, String str, Throwable th2, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f30629a;
        if (h0Var != null) {
            h0Var.onProducerFinishWithFailure(context.getId(), str, th2, map);
        }
        g0 g0Var = this.f30630b;
        if (g0Var != null) {
            g0Var.k(context, str, th2, map);
        }
    }
}
