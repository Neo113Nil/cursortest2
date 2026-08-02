package com.applovin.impl;

import com.google.android.exoplayer2.ExoPlayer;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class f6 {
    private static final ExecutorService r = Executors.newFixedThreadPool(4);
    private final com.applovin.impl.sdk.l a;
    private final com.applovin.impl.sdk.p b;
    private final ScheduledThreadPoolExecutor c;
    private final ScheduledThreadPoolExecutor d;
    private final ScheduledThreadPoolExecutor e;
    private final ScheduledThreadPoolExecutor f;
    private final ScheduledThreadPoolExecutor g;
    private final ScheduledThreadPoolExecutor h;
    private final ScheduledThreadPoolExecutor i;
    private ExecutorService k;
    private ExecutorService l;
    private boolean o;
    private boolean p;
    private final boolean q;
    private final Map j = new HashMap();
    private final List m = new ArrayList(5);
    private final Object n = new Object();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    private static class c extends e {
        private final long f;

        public c(com.applovin.impl.sdk.l lVar, k5 k5Var, b bVar, long j) {
            super(lVar, k5Var, bVar);
            this.f = j;
        }
    }

    private class d implements ThreadFactory {
        private final String a;

        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.p unused = f6.this.b;
                if (com.applovin.impl.sdk.p.a()) {
                    f6.this.b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        d(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) f6.this.a.a(z4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements Runnable {
        private final com.applovin.impl.sdk.l a;
        private final String b;
        private final com.applovin.impl.sdk.p c;
        protected final k5 d;
        protected final b e;

        public e(com.applovin.impl.sdk.l lVar, k5 k5Var, b bVar) {
            this.a = lVar;
            this.c = lVar.Q();
            this.b = k5Var.c();
            this.d = k5Var;
            this.e = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean a;
            try {
                p0.a();
                if (this.a.G0() && !this.d.d()) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.d(this.b, "Task re-scheduled...");
                    }
                    this.a.s0().a(this.d, this.e, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                    if (a) {
                        return;
                    } else {
                        return;
                    }
                }
                ScheduledFuture b = this.d.b(Thread.currentThread(), ((Long) this.a.a(z4.v)).longValue());
                this.d.run();
                if (b != null) {
                    b.cancel(false);
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.a(this.b, "Task failed execution", th);
                    }
                    this.d.a(th);
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.d(this.b, this.e + " queue finished task " + this.d.c());
                    }
                } finally {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.d(this.b, this.e + " queue finished task " + this.d.c());
                    }
                }
            }
        }
    }

    public f6(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
        this.p = ((Boolean) lVar.a(z4.T)).booleanValue();
        this.q = ((Boolean) lVar.a(z4.W6)).booleanValue();
        this.c = b("auxiliary_operations", ((Integer) lVar.a(z4.O)).intValue());
        this.d = b("shared_thread_pool", ((Integer) lVar.a(z4.N)).intValue());
        this.e = b("core", ((Integer) lVar.a(z4.U)).intValue());
        this.g = b("caching", ((Integer) lVar.a(z4.V)).intValue());
        this.h = b("mediation", ((Integer) lVar.a(z4.W)).intValue());
        this.f = b("timeout", ((Integer) lVar.a(z4.X)).intValue());
        this.i = b("other", ((Integer) lVar.a(z4.Y)).intValue());
        if (((Boolean) lVar.a(z4.J0)).booleanValue() && ((Boolean) lVar.a(z4.K0)).booleanValue()) {
            this.k = Executors.newFixedThreadPool(((Integer) lVar.a(z4.L0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.l = Executors.newFixedThreadPool(((Integer) lVar.a(z4.M0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public Executor c() {
        return this.p ? this.e : this.d;
    }

    public ExecutorService d() {
        return this.l;
    }

    public boolean e() {
        return (a() == null || d() == null) ? false : true;
    }

    public boolean f() {
        return this.o;
    }

    public void g() {
        synchronized (this.n) {
            this.o = true;
            for (e eVar : this.m) {
                if (this.q) {
                    c cVar = (c) eVar;
                    a(cVar.d, cVar.e, cVar.f);
                } else {
                    a(eVar.d, eVar.e);
                }
            }
            this.m.clear();
        }
    }

    public void h() {
        synchronized (this.n) {
            this.o = false;
        }
    }

    public ExecutorService a() {
        return this.k;
    }

    public ScheduledFuture b(k5 k5Var, b bVar, long j) {
        return this.p ? a(new e(this.a, k5Var, bVar)).schedule(k5Var, j, TimeUnit.MILLISECONDS) : this.c.schedule(k5Var, j, TimeUnit.MILLISECONDS);
    }

    public void a(k5 k5Var, b bVar) {
        a(k5Var, bVar, 0L);
    }

    public void a(k5 k5Var, b bVar, long j) {
        a(k5Var, bVar, j, false);
    }

    public void a(k5 k5Var, b bVar, long j, boolean z) {
        k5 k5Var2;
        long j2;
        e eVar;
        if (k5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j >= 0) {
            if (this.q) {
                k5Var2 = k5Var;
                j2 = j;
                eVar = new c(this.a, k5Var2, bVar, j2);
            } else {
                k5Var2 = k5Var;
                j2 = j;
                eVar = new e(this.a, k5Var2, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j2, z);
                return;
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.d(k5Var2.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
    }

    public ExecutorService b() {
        return this.p ? this.g : r;
    }

    private boolean b(e eVar) {
        if (eVar.d.d()) {
            return false;
        }
        synchronized (this.n) {
            if (this.o) {
                return false;
            }
            this.m.add(eVar);
            return true;
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.p) {
            com.applovin.impl.sdk.l lVar = this.a;
            e eVar = new e(lVar, new u6(lVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.c.submit(runnable);
    }

    private ScheduledThreadPoolExecutor b(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new d(str));
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.f6$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                f6.this.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new u6(this.a, str, runnable));
    }

    public void a(k5 k5Var) {
        if (k5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.p ? this.e : this.d;
            try {
                if (q7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.a, k5Var, b.CORE));
                    return;
                }
                ScheduledFuture b2 = k5Var.b(Thread.currentThread(), ((Long) this.a.a(z4.v)).longValue());
                k5Var.run();
                if (b2 != null) {
                    b2.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.a(k5Var.c(), "Task failed execution", th);
                }
                k5Var.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(k5 k5Var, m3 m3Var) {
        String b2 = m3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.j.get(b2);
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = b(b2, 1);
            this.j.put(b2, scheduledThreadPoolExecutor);
        }
        scheduledThreadPoolExecutor.submit(new e(this.a, k5Var, b.MEDIATION));
    }

    private void a(final e eVar, long j, boolean z) {
        final ScheduledThreadPoolExecutor a2 = this.p ? a(eVar) : this.d;
        if (j <= 0) {
            a2.submit(eVar);
        } else if (z) {
            i0.a(j, this.a, new Runnable() { // from class: com.applovin.impl.f6$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    a2.execute(eVar);
                }
            });
        } else {
            a2.schedule(eVar, j, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i = a.a[eVar.e.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.g;
        }
        if (i == 3) {
            return this.h;
        }
        if (i != 4) {
            return this.i;
        }
        return this.f;
    }

    public ExecutorService a(String str, int i) {
        return Executors.newFixedThreadPool(i, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
