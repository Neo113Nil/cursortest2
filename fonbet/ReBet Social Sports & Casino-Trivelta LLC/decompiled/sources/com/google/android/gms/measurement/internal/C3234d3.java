package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3234d3 extends P3 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLong f33977k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public C3226c3 f33978c;

    /* renamed from: d, reason: collision with root package name */
    public C3226c3 f33979d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f33980e;

    /* renamed from: f, reason: collision with root package name */
    public final BlockingQueue f33981f;

    /* renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f33982g;

    /* renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f33983h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f33984i;

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f33985j;

    public C3234d3(C3298l3 c3298l3) {
        super(c3298l3);
        this.f33984i = new Object();
        this.f33985j = new Semaphore(2);
        this.f33980e = new PriorityBlockingQueue();
        this.f33981f = new LinkedBlockingQueue();
        this.f33982g = new C3210a3(this, "Thread death: Uncaught exception on worker thread");
        this.f33983h = new C3210a3(this, "Thread death: Uncaught exception on network thread");
    }

    public final /* synthetic */ void A(C3226c3 c3226c3) {
        this.f33979d = null;
    }

    public final /* synthetic */ Object B() {
        return this.f33984i;
    }

    public final /* synthetic */ Semaphore C() {
        return this.f33985j;
    }

    public final /* synthetic */ boolean D() {
        return false;
    }

    public final void F(C3218b3 c3218b3) {
        synchronized (this.f33984i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f33980e;
                priorityBlockingQueue.add(c3218b3);
                C3226c3 c3226c3 = this.f33978c;
                if (c3226c3 == null) {
                    C3226c3 c3226c32 = new C3226c3(this, "Measurement Worker", priorityBlockingQueue);
                    this.f33978c = c3226c32;
                    c3226c32.setUncaughtExceptionHandler(this.f33982g);
                    this.f33978c.start();
                } else {
                    c3226c3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.O3
    public final void g() {
        if (Thread.currentThread() != this.f33979d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.O3
    public final void h() {
        if (Thread.currentThread() != this.f33978c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.P3
    public final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f33978c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f33978c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f33979d;
    }

    public final Future r(Callable callable) {
        l();
        AbstractC3191o.m(callable);
        C3218b3 c3218b3 = new C3218b3(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f33978c) {
            F(c3218b3);
            return c3218b3;
        }
        if (!this.f33980e.isEmpty()) {
            this.f33578a.a().r().a("Callable skipped the worker queue.");
        }
        c3218b3.run();
        return c3218b3;
    }

    public final Future s(Callable callable) {
        l();
        AbstractC3191o.m(callable);
        C3218b3 c3218b3 = new C3218b3(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f33978c) {
            c3218b3.run();
            return c3218b3;
        }
        F(c3218b3);
        return c3218b3;
    }

    public final void t(Runnable runnable) {
        l();
        AbstractC3191o.m(runnable);
        F(new C3218b3(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object u(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f33578a.b().t(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                C3376v2 r10 = this.f33578a.a().r();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                r10.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f33578a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        l();
        AbstractC3191o.m(runnable);
        F(new C3218b3(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) {
        l();
        AbstractC3191o.m(runnable);
        C3218b3 c3218b3 = new C3218b3(this, runnable, false, "Task exception on network thread");
        synchronized (this.f33984i) {
            try {
                BlockingQueue blockingQueue = this.f33981f;
                blockingQueue.add(c3218b3);
                C3226c3 c3226c3 = this.f33979d;
                if (c3226c3 == null) {
                    C3226c3 c3226c32 = new C3226c3(this, "Measurement Network", blockingQueue);
                    this.f33979d = c3226c32;
                    c3226c32.setUncaughtExceptionHandler(this.f33983h);
                    this.f33979d.start();
                } else {
                    c3226c3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ C3226c3 x() {
        return this.f33978c;
    }

    public final /* synthetic */ void y(C3226c3 c3226c3) {
        this.f33978c = null;
    }

    public final /* synthetic */ C3226c3 z() {
        return this.f33979d;
    }
}
