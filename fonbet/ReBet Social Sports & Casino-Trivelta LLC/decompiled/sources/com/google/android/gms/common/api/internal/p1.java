package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class p1 implements InterfaceC3164x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f32555a;

    public /* synthetic */ p1(A a10, o1 o1Var) {
        this.f32555a = a10;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3164x0
    public final void a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f32555a.f32326m;
        lock.lock();
        try {
            this.f32555a.f32324k = ConnectionResult.f32216f;
            A.x(this.f32555a);
        } finally {
            lock2 = this.f32555a.f32326m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3164x0
    public final void b(int i10, boolean z10) {
        Lock lock;
        Lock lock2;
        boolean z11;
        C3131g0 c3131g0;
        Lock lock3;
        lock = this.f32555a.f32326m;
        lock.lock();
        try {
            A a10 = this.f32555a;
            z11 = a10.f32325l;
            if (z11) {
                a10.f32325l = false;
                A.v(this.f32555a, i10, z10);
            } else {
                a10.f32325l = true;
                c3131g0 = this.f32555a.f32317d;
                c3131g0.i(i10);
            }
            lock3 = this.f32555a.f32326m;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f32555a.f32326m;
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3164x0
    public final void c(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f32555a.f32326m;
        lock.lock();
        try {
            this.f32555a.f32324k = connectionResult;
            A.x(this.f32555a);
        } finally {
            lock2 = this.f32555a.f32326m;
            lock2.unlock();
        }
    }
}
