package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class u {
    private volatile ThreadPoolExecutor a;
    private final int e;
    private final com.mbridge.msdk.tracker.network.b f;
    private final m g;
    private final w h;
    private final AtomicInteger b = new AtomicInteger();
    private final Set<t<?>> c = new HashSet();
    private final PriorityBlockingQueue<t<?>> d = new PriorityBlockingQueue<>();
    private final List<c> i = new ArrayList();
    private boolean j = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new n(u.this.d, u.this.g, u.this.f, u.this.h).run();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface c {
        void a(t<?> tVar, int i);
    }

    public u(m mVar, w wVar, int i, com.mbridge.msdk.tracker.network.b bVar) {
        this.e = i;
        this.f = bVar;
        this.g = mVar;
        this.h = wVar;
    }

    private void b(int i) {
        this.a = new ThreadPoolExecutor(i, i, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public <T> t<T> a(t<T> tVar) {
        tVar.a(this);
        synchronized (this.c) {
            this.c.add(tVar);
        }
        tVar.b(a());
        tVar.a("add-to-queue");
        a(tVar, 0);
        b(tVar);
        if (this.a == null) {
            a(this.e);
        }
        if (!this.a.isShutdown()) {
            this.a.execute(new b());
        }
        return tVar;
    }

    public <T> void c(t<T> tVar) {
        synchronized (this.c) {
            this.c.remove(tVar);
        }
        a(tVar, 5);
    }

    public <T> void d(t<T> tVar) {
        this.d.add(tVar);
    }

    public void b() {
        if (!this.j || this.a == null) {
            a(this.e);
            this.j = true;
        }
    }

    public <T> void b(t<T> tVar) {
        d(tVar);
    }

    private void a(int i) {
        if (this.a != null) {
            return;
        }
        try {
            b(i);
        } catch (Throwable unused) {
            try {
                b(5);
            } catch (Exception unused2) {
                this.a = null;
            }
        }
    }

    public int a() {
        return this.b.incrementAndGet();
    }

    public void a(t<?> tVar, int i) {
        synchronized (this.i) {
            try {
                Iterator<c> it = this.i.iterator();
                while (it.hasNext()) {
                    it.next().a(tVar, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
