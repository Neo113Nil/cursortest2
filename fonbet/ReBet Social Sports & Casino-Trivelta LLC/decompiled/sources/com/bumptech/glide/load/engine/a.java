package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.p;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29692a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f29693b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f29694c;

    /* renamed from: d, reason: collision with root package name */
    public final ReferenceQueue f29695d;

    /* renamed from: e, reason: collision with root package name */
    public p.a f29696e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f29697f;

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0468a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC0469a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f29698a;

            public RunnableC0469a(Runnable runnable) {
                this.f29698a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f29698a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0469a(runnable), "glide-active-resources");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    public static final class c extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.g f29701a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f29702b;

        /* renamed from: c, reason: collision with root package name */
        public v f29703c;

        public c(com.bumptech.glide.load.g gVar, p pVar, ReferenceQueue referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f29701a = (com.bumptech.glide.load.g) com.bumptech.glide.util.k.d(gVar);
            this.f29703c = (pVar.d() && z10) ? (v) com.bumptech.glide.util.k.d(pVar.c()) : null;
            this.f29702b = pVar.d();
        }

        public void a() {
            this.f29703c = null;
            clear();
        }
    }

    public a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0468a()));
    }

    public synchronized void a(com.bumptech.glide.load.g gVar, p pVar) {
        c cVar = (c) this.f29694c.put(gVar, new c(gVar, pVar, this.f29695d, this.f29692a));
        if (cVar != null) {
            cVar.a();
        }
    }

    public void b() {
        while (!this.f29697f) {
            try {
                c((c) this.f29695d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(c cVar) {
        v vVar;
        synchronized (this) {
            this.f29694c.remove(cVar.f29701a);
            if (cVar.f29702b && (vVar = cVar.f29703c) != null) {
                this.f29696e.d(cVar.f29701a, new p(vVar, true, false, cVar.f29701a, this.f29696e));
            }
        }
    }

    public synchronized void d(com.bumptech.glide.load.g gVar) {
        c cVar = (c) this.f29694c.remove(gVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized p e(com.bumptech.glide.load.g gVar) {
        c cVar = (c) this.f29694c.get(gVar);
        if (cVar == null) {
            return null;
        }
        p pVar = (p) cVar.get();
        if (pVar == null) {
            c(cVar);
        }
        return pVar;
    }

    public void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f29696e = aVar;
            }
        }
    }

    public a(boolean z10, Executor executor) {
        this.f29694c = new HashMap();
        this.f29695d = new ReferenceQueue();
        this.f29692a = z10;
        this.f29693b = executor;
        executor.execute(new b());
    }
}
