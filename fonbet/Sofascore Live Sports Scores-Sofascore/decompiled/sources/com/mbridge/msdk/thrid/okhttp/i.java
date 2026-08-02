package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.connection.g;
import defpackage.a70;
import defpackage.ogj;
import defpackage.vxd;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i {
    private static final Executor g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp ConnectionPool", true));
    static final /* synthetic */ boolean h = true;
    private final int a;
    private final long b;
    private final Runnable c;
    private final Deque<com.mbridge.msdk.thrid.okhttp.internal.connection.c> d;
    final com.mbridge.msdk.thrid.okhttp.internal.connection.d e;
    boolean f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long a = i.this.a(System.nanoTime());
                if (a == -1) {
                    return;
                }
                if (a > 0) {
                    long j = a / 1000000;
                    long j2 = a - (1000000 * j);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i(int i, long j, TimeUnit timeUnit) {
        this.c = new a();
        this.d = new ArrayDeque();
        this.e = new com.mbridge.msdk.thrid.okhttp.internal.connection.d();
        this.a = i;
        this.b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        a70.p(vxd.l(j, "keepAliveDuration <= 0: "));
        throw null;
    }

    public long a(long j) {
        synchronized (this) {
            try {
                com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = null;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2 : this.d) {
                    if (a(cVar2, j) > 0) {
                        i2++;
                    } else {
                        i++;
                        long j3 = j - cVar2.o;
                        if (j3 > j2) {
                            cVar = cVar2;
                            j2 = j3;
                        }
                    }
                }
                long j4 = this.b;
                if (j2 < j4 && i <= this.a) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    this.f = false;
                    return -1L;
                }
                this.d.remove(cVar);
                com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.g());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!h && !Thread.holdsLock(this)) {
            ogj.b();
            return;
        }
        if (!this.f) {
            this.f = true;
            g.execute(this.c);
        }
        this.d.add(cVar);
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public Socket a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
        if (!h && !Thread.holdsLock(this)) {
            ogj.b();
            return null;
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.d) {
            if (cVar.a(aVar, null) && cVar.f() && cVar != gVar.c()) {
                return gVar.b(cVar);
            }
        }
        return null;
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!h && !Thread.holdsLock(this)) {
            ogj.b();
            return false;
        }
        if (!cVar.k && this.a != 0) {
            notifyAll();
            return false;
        }
        this.d.remove(cVar);
        return true;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
        if (!h && !Thread.holdsLock(this)) {
            ogj.b();
            return null;
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.d) {
            if (cVar.a(aVar, c0Var)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    private int a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar, long j) {
        List<Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> list = cVar.n;
        int i = 0;
        while (i < list.size()) {
            Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("A connection to " + cVar.c().a().k() + " was leaked. Did you forget to close a response body?", ((g.a) reference).a);
                list.remove(i);
                cVar.k = true;
                if (list.isEmpty()) {
                    cVar.o = j - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
