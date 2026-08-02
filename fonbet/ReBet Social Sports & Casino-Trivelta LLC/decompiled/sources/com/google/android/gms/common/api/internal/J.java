package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class J implements InterfaceC3125d0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3131g0 f32362a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32363b = false;

    public J(C3131g0 c3131g0) {
        this.f32362a = c3131g0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void b() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void c() {
        if (this.f32363b) {
            this.f32363b = false;
            this.f32362a.p(new I(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void d(ConnectionResult connectionResult, C3117a c3117a, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void e(int i10) {
        this.f32362a.o(null);
        this.f32362a.f32516o.b(i10, this.f32363b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final AbstractC3124d f(AbstractC3124d abstractC3124d) {
        h(abstractC3124d);
        return abstractC3124d;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final boolean g() {
        if (this.f32363b) {
            return false;
        }
        Set set = this.f32362a.f32515n.f32471w;
        if (set == null || set.isEmpty()) {
            this.f32362a.o(null);
            return true;
        }
        this.f32363b = true;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((T0) it.next()).f();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final AbstractC3124d h(AbstractC3124d abstractC3124d) {
        try {
            this.f32362a.f32515n.f32472x.a(abstractC3124d);
            C3123c0 c3123c0 = this.f32362a.f32515n;
            C3117a.f fVar = (C3117a.f) c3123c0.f32463o.get(abstractC3124d.getClientKey());
            AbstractC3191o.n(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f32362a.f32508g.containsKey(abstractC3124d.getClientKey())) {
                abstractC3124d.run(fVar);
                return abstractC3124d;
            }
            abstractC3124d.setFailedResult(new Status(17));
            return abstractC3124d;
        } catch (DeadObjectException unused) {
            this.f32362a.p(new H(this, this));
            return abstractC3124d;
        }
    }
}
