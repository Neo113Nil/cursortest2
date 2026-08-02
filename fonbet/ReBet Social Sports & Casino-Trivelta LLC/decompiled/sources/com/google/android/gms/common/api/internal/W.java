package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public abstract class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f32404a;

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        C3131g0 c3131g0;
        lock = this.f32404a.f32407b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e10) {
                c3131g0 = this.f32404a.f32406a;
                c3131g0.q(e10);
            }
        } finally {
            lock2 = this.f32404a.f32407b;
            lock2.unlock();
        }
    }
}
