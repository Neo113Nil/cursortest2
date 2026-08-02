package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.AbstractC3179c;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class L implements AbstractC3179c.InterfaceC0491c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f32365a;

    /* renamed from: b, reason: collision with root package name */
    public final C3117a f32366b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32367c;

    public L(X x10, C3117a c3117a, boolean z10) {
        this.f32365a = new WeakReference(x10);
        this.f32366b = c3117a;
        this.f32367c = z10;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c.InterfaceC0491c
    public final void a(ConnectionResult connectionResult) {
        C3131g0 c3131g0;
        Lock lock;
        Lock lock2;
        boolean o10;
        boolean p10;
        X x10 = (X) this.f32365a.get();
        if (x10 == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        c3131g0 = x10.f32406a;
        AbstractC3191o.q(myLooper == c3131g0.f32515n.l(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = x10.f32407b;
        lock.lock();
        try {
            o10 = x10.o(0);
            if (o10) {
                if (!connectionResult.l()) {
                    x10.m(connectionResult, this.f32366b, this.f32367c);
                }
                p10 = x10.p();
                if (p10) {
                    x10.n();
                }
            }
        } finally {
            lock2 = x10.f32407b;
            lock2.unlock();
        }
    }
}
