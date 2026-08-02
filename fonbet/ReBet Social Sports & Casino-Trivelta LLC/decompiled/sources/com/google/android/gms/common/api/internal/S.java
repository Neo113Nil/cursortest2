package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class S extends da.c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f32390a;

    public S(X x10) {
        this.f32390a = new WeakReference(x10);
    }

    @Override // da.e
    public final void s(zak zakVar) {
        C3131g0 c3131g0;
        X x10 = (X) this.f32390a.get();
        if (x10 == null) {
            return;
        }
        c3131g0 = x10.f32406a;
        c3131g0.p(new Q(this, x10, x10, zakVar));
    }
}
