package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.a70;
import defpackage.aoo;
import defpackage.fso;
import defpackage.vno;
import defpackage.xno;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhz extends fso {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public aoo d;
    public aoo e;
    public final PriorityBlockingQueue f;
    public final LinkedBlockingQueue g;
    public final vno h;
    public final vno i;
    public final Object j;
    public final Semaphore k;

    public zzhz(zzic zzicVar) {
        super(zzicVar);
        this.j = new Object();
        this.k = new Semaphore(2);
        this.f = new PriorityBlockingQueue();
        this.g = new LinkedBlockingQueue();
        this.h = new vno(this, "Thread death: Uncaught exception on worker thread");
        this.i = new vno(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.t01
    public final void Q() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        a70.r("Call expected from worker thread");
    }

    @Override // defpackage.fso
    public final boolean R() {
        return false;
    }

    public final void U() {
        if (Thread.currentThread() == this.e) {
            return;
        }
        a70.r("Call expected from network thread");
    }

    public final void V() {
        if (Thread.currentThread() != this.d) {
            return;
        }
        a70.r("Call not expected from worker thread");
    }

    public final boolean W() {
        return Thread.currentThread() == this.d;
    }

    public final xno X(Callable callable) {
        S();
        xno xnoVar = new xno(this, callable, false);
        if (Thread.currentThread() != this.d) {
            d0(xnoVar);
            return xnoVar;
        }
        if (!this.f.isEmpty()) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.a("Callable skipped the worker queue.");
        }
        xnoVar.run();
        return xnoVar;
    }

    public final xno Y(Callable callable) {
        S();
        xno xnoVar = new xno(this, callable, true);
        if (Thread.currentThread() == this.d) {
            xnoVar.run();
            return xnoVar;
        }
        d0(xnoVar);
        return xnoVar;
    }

    public final void Z(Runnable runnable) {
        S();
        Preconditions.i(runnable);
        d0(new xno(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object a0(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzhz zzhzVar = ((zzic) this.b).g;
            zzic.m(zzhzVar);
            zzhzVar.Z(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzgu zzguVar = ((zzic) this.b).f;
                zzic.m(zzguVar);
                zzgs zzgsVar = zzguVar.j;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                zzgsVar.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            zzgu zzguVar2 = ((zzic) this.b).f;
            zzic.m(zzguVar2);
            zzguVar2.j.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void b0(Runnable runnable) {
        S();
        d0(new xno(this, runnable, true, "Task exception on worker thread"));
    }

    public final void c0(Runnable runnable) {
        S();
        xno xnoVar = new xno(this, runnable, false, "Task exception on network thread");
        synchronized (this.j) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.g;
                linkedBlockingQueue.add(xnoVar);
                aoo aooVar = this.e;
                if (aooVar == null) {
                    aoo aooVar2 = new aoo(this, "Measurement Network", linkedBlockingQueue);
                    this.e = aooVar2;
                    aooVar2.setUncaughtExceptionHandler(this.i);
                    this.e.start();
                } else {
                    Object obj = aooVar.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d0(xno xnoVar) {
        synchronized (this.j) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f;
                priorityBlockingQueue.add(xnoVar);
                aoo aooVar = this.d;
                if (aooVar == null) {
                    aoo aooVar2 = new aoo(this, "Measurement Worker", priorityBlockingQueue);
                    this.d = aooVar2;
                    aooVar2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    Object obj = aooVar.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
