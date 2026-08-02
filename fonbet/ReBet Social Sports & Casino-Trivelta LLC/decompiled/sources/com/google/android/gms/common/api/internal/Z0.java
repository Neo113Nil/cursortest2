package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class Z0 extends S0 {

    /* renamed from: c, reason: collision with root package name */
    public final C3140l.a f32433c;

    public Z0(C3140l.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f32433c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final /* bridge */ /* synthetic */ void d(D d10, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3166y0
    public final boolean f(C3147o0 c3147o0) {
        F0 f02 = (F0) c3147o0.x().get(this.f32433c);
        return f02 != null && f02.f32353a.f();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3166y0
    public final Feature[] g(C3147o0 c3147o0) {
        F0 f02 = (F0) c3147o0.x().get(this.f32433c);
        if (f02 == null) {
            return null;
        }
        return f02.f32353a.c();
    }

    @Override // com.google.android.gms.common.api.internal.S0
    public final void h(C3147o0 c3147o0) {
        F0 f02 = (F0) c3147o0.x().remove(this.f32433c);
        if (f02 == null) {
            this.f32391b.trySetResult(Boolean.FALSE);
            return;
        }
        f02.f32354b.b(c3147o0.v(), this.f32391b);
        f02.f32353a.a();
    }
}
