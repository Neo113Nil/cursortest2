package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f32536a;

    public l1(A a10) {
        this.f32536a = a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.f32536a.f32326m;
        lock.lock();
        try {
            A.x(this.f32536a);
        } finally {
            lock2 = this.f32536a.f32326m;
            lock2.unlock();
        }
    }
}
