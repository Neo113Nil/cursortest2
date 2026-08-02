package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class n1 implements InterfaceC3164x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f32540a;

    public /* synthetic */ n1(A a10, m1 m1Var) {
        this.f32540a = a10;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3164x0
    public final void a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f32540a.f32326m;
        lock.lock();
        try {
            A.w(this.f32540a, bundle);
            this.f32540a.f32323j = ConnectionResult.f32216f;
            A.x(this.f32540a);
        } finally {
            lock2 = this.f32540a.f32326m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3164x0
    public final void b(int i10, boolean z10) {
        Lock lock;
        Lock lock2;
        boolean z11;
        Lock lock3;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        C3131g0 c3131g0;
        lock = this.f32540a.f32326m;
        lock.lock();
        try {
            A a10 = this.f32540a;
            z11 = a10.f32325l;
            if (!z11) {
                connectionResult = a10.f32324k;
                if (connectionResult != null) {
                    connectionResult2 = a10.f32324k;
                    if (connectionResult2.l()) {
                        this.f32540a.f32325l = true;
                        c3131g0 = this.f32540a.f32318e;
                        c3131g0.i(i10);
                        lock3 = this.f32540a.f32326m;
                        lock3.unlock();
                    }
                }
            }
            this.f32540a.f32325l = false;
            A.v(this.f32540a, i10, z10);
            lock3 = this.f32540a.f32326m;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f32540a.f32326m;
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3164x0
    public final void c(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f32540a.f32326m;
        lock.lock();
        try {
            this.f32540a.f32323j = connectionResult;
            A.x(this.f32540a);
        } finally {
            lock2 = this.f32540a.f32326m;
            lock2.unlock();
        }
    }
}
