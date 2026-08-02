package io.sentry.util;

import f0.AbstractC4221b;
import io.sentry.InterfaceC4765j0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: io.sentry.util.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4843a implements InterfaceC4765j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f52792b = AtomicReferenceFieldUpdater.newUpdater(C4843a.class, ReentrantLock.class, "a");

    /* renamed from: a, reason: collision with root package name */
    public volatile ReentrantLock f52793a;

    @Override // io.sentry.InterfaceC4765j0, java.lang.AutoCloseable
    public void close() {
        ((ReentrantLock) w.c(this.f52793a, "close() called before acquire()")).unlock();
    }

    public InterfaceC4765j0 d() {
        k().lock();
        return this;
    }

    public final ReentrantLock k() {
        ReentrantLock reentrantLock = this.f52793a;
        if (reentrantLock != null) {
            return reentrantLock;
        }
        ReentrantLock reentrantLock2 = new ReentrantLock();
        return AbstractC4221b.a(f52792b, this, null, reentrantLock2) ? reentrantLock2 : (ReentrantLock) w.c(this.f52793a, "lock must have been set by the winning thread");
    }
}
