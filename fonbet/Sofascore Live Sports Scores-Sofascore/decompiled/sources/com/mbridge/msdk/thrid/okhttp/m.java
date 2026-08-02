package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.x;
import defpackage.a70;
import defpackage.ljg;
import defpackage.ogj;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m {
    static final /* synthetic */ boolean h = true;
    private Runnable c;
    private ExecutorService d;
    private int a = 64;
    private int b = 5;
    private final Deque<x.b> e = new ArrayDeque();
    private final Deque<x.b> f = new ArrayDeque();
    private final Deque<x> g = new ArrayDeque();

    public m(ExecutorService executorService) {
        this.d = executorService;
    }

    private boolean b() {
        boolean z;
        if (!h && Thread.holdsLock(this)) {
            ogj.b();
            return false;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<x.b> it = this.e.iterator();
                while (it.hasNext()) {
                    x.b next = it.next();
                    if (this.f.size() >= this.a) {
                        break;
                    }
                    if (c(next) < this.b) {
                        it.remove();
                        arrayList.add(next);
                        this.f.add(next);
                    }
                }
                z = c() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((x.b) arrayList.get(i)).a(a());
        }
        return z;
    }

    private int c(x.b bVar) {
        int i = 0;
        for (x.b bVar2 : this.f) {
            if (!bVar2.c().f && bVar2.d().equals(bVar.d())) {
                i++;
            }
        }
        return i;
    }

    public synchronized ExecutorService a() {
        ExecutorService executorService;
        executorService = this.d;
        if (executorService == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false));
            this.d = threadPoolExecutor;
            executorService = threadPoolExecutor;
        }
        return executorService;
    }

    public m() {
    }

    public void a(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.a = i;
            }
            b();
            return;
        }
        a70.p(ljg.j(i, "max < 1: "));
    }

    public synchronized int c() {
        return this.f.size() + this.g.size();
    }

    public void a(x.b bVar) {
        synchronized (this) {
            this.e.add(bVar);
        }
        b();
    }

    public synchronized void a(x xVar) {
        this.g.add(xVar);
    }

    private <T> void a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void b(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.b = i;
            }
            b();
            return;
        }
        a70.p(ljg.j(i, "max < 1: "));
    }

    public void b(x.b bVar) {
        a(this.f, bVar);
    }

    public void b(x xVar) {
        a(this.g, xVar);
    }
}
