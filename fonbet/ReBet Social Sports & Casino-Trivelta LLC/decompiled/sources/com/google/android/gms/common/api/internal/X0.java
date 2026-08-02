package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class X0 extends S0 {

    /* renamed from: c, reason: collision with root package name */
    public final F0 f32427c;

    public X0(F0 f02, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f32427c = f02;
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final /* bridge */ /* synthetic */ void d(D d10, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3166y0
    public final boolean f(C3147o0 c3147o0) {
        return this.f32427c.f32353a.f();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3166y0
    public final Feature[] g(C3147o0 c3147o0) {
        return this.f32427c.f32353a.c();
    }

    @Override // com.google.android.gms.common.api.internal.S0
    public final void h(C3147o0 c3147o0) {
        this.f32427c.f32353a.d(c3147o0.v(), this.f32391b);
        C3140l.a b10 = this.f32427c.f32353a.b();
        if (b10 != null) {
            c3147o0.x().put(b10, this.f32427c);
        }
    }
}
