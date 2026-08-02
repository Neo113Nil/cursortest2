package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.foundation.tools.m0;
import defpackage.w1l;
import defpackage.xtl;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private static volatile c d;
    private final ConcurrentLinkedQueue<Runnable> a = new ConcurrentLinkedQueue<>();
    private ThreadPoolExecutor b;
    private final AtomicBoolean c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private c() {
        int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = new AtomicBoolean(false);
    }

    private boolean b() {
        try {
            int h = m0.h();
            if (h > 0) {
                int x = m0.x();
                return x > 0 && (((double) h) / ((double) x)) * 100.0d <= 5.0d;
            }
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("Memory check failed: "), "SocketThreadPoolManager");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (!this.a.isEmpty()) {
            try {
                Runnable poll = this.a.poll();
                if (poll != null) {
                    if ((poll instanceof b) && ((b) poll).e() != null) {
                        ((b) poll).e().callStart();
                    }
                    poll.run();
                }
            } catch (Throwable th) {
                this.c.set(false);
                if (!this.a.isEmpty()) {
                    d();
                }
                throw th;
            }
        }
        this.c.set(false);
        if (this.a.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.c.compareAndSet(false, true)) {
            this.b.execute(new xtl(this, 5));
        }
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                try {
                    if (d == null) {
                        d = new c();
                    }
                } finally {
                }
            }
        }
        return d;
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.b.getActiveCount(), this.b.getQueue().size());
    }
}
