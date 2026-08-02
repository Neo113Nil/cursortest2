package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3127e0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3125d0 f32477a;

    public AbstractC3127e0(InterfaceC3125d0 interfaceC3125d0) {
        this.f32477a = interfaceC3125d0;
    }

    public abstract void a();

    public final void b(C3131g0 c3131g0) {
        Lock lock;
        Lock lock2;
        InterfaceC3125d0 interfaceC3125d0;
        lock = c3131g0.f32502a;
        lock.lock();
        try {
            interfaceC3125d0 = c3131g0.f32512k;
            if (interfaceC3125d0 == this.f32477a) {
                a();
            }
        } finally {
            lock2 = c3131g0.f32502a;
            lock2.unlock();
        }
    }
}
