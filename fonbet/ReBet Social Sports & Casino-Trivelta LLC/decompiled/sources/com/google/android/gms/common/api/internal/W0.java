package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class W0 extends a1 {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3124d f32405b;

    public W0(int i10, AbstractC3124d abstractC3124d) {
        super(i10);
        this.f32405b = (AbstractC3124d) AbstractC3191o.n(abstractC3124d, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void a(Status status) {
        try {
            this.f32405b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void b(Exception exc) {
        try {
            this.f32405b.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void c(C3147o0 c3147o0) {
        try {
            this.f32405b.run(c3147o0.v());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void d(D d10, boolean z10) {
        d10.c(this.f32405b, z10);
    }
}
