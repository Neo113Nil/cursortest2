package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3226c3 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33958a;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f33959b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33960c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3234d3 f33961d;

    public C3226c3(C3234d3 c3234d3, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(c3234d3);
        this.f33961d = c3234d3;
        this.f33960c = false;
        AbstractC3191o.m(str);
        AbstractC3191o.m(blockingQueue);
        this.f33958a = new Object();
        this.f33959b = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f33958a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        C3234d3 c3234d3 = this.f33961d;
        synchronized (c3234d3.B()) {
            try {
                if (!this.f33960c) {
                    c3234d3.C().release();
                    c3234d3.B().notifyAll();
                    if (this == c3234d3.x()) {
                        c3234d3.y(null);
                    } else if (this == c3234d3.z()) {
                        c3234d3.A(null);
                    } else {
                        c3234d3.f33578a.a().o().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f33960c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.f33961d.f33578a.a().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f33961d.C().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f33959b;
                C3218b3 c3218b3 = (C3218b3) blockingQueue.poll();
                if (c3218b3 != null) {
                    Process.setThreadPriority(true != c3218b3.f33931b ? 10 : threadPriority);
                    c3218b3.run();
                } else {
                    Object obj = this.f33958a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f33961d.D();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f33961d.B()) {
                        if (this.f33959b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }
}
