package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import ca.InterfaceC2905e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class U implements f.b, f.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f32399a;

    public /* synthetic */ U(X x10, T t10) {
        this.f32399a = x10;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3146o
    public final void c(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean q10;
        Lock lock3;
        lock = this.f32399a.f32407b;
        lock.lock();
        try {
            q10 = this.f32399a.q(connectionResult);
            if (q10) {
                this.f32399a.i();
                this.f32399a.n();
            } else {
                this.f32399a.l(connectionResult);
            }
            lock3 = this.f32399a.f32407b;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f32399a.f32407b;
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void g(Bundle bundle) {
        C3180d c3180d;
        InterfaceC2905e interfaceC2905e;
        c3180d = this.f32399a.f32423r;
        interfaceC2905e = this.f32399a.f32416k;
        ((InterfaceC2905e) AbstractC3191o.m(interfaceC2905e)).c(new S(this.f32399a));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void i(int i10) {
    }
}
