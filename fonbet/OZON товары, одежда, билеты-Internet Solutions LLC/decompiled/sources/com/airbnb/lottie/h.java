package com.airbnb.lottie;

import B5.t;
import B5.w;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class h<T> {

    /* renamed from: e, reason: collision with root package name */
    public static ExecutorService f57344e = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f57345a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f57346b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f57347c;

    /* renamed from: d, reason: collision with root package name */
    private volatile w<T> f57348d;

    private class a extends FutureTask<w<T>> {
        a(Callable<w<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            h hVar = h.this;
            if (isCancelled()) {
                return;
            }
            try {
                hVar.g(get());
            } catch (InterruptedException | ExecutionException e11) {
                hVar.g(new w(e11));
            }
        }
    }

    public h() {
        throw null;
    }

    h(Callable<w<T>> callable, boolean z11) {
        this.f57345a = new LinkedHashSet(1);
        this.f57346b = new LinkedHashSet(1);
        this.f57347c = new Handler(Looper.getMainLooper());
        this.f57348d = null;
        if (!z11) {
            f57344e.execute(new a(callable));
            return;
        }
        try {
            g(callable.call());
        } catch (Throwable th2) {
            g(new w<>(th2));
        }
    }

    public static void a(h hVar) {
        w<T> wVar = hVar.f57348d;
        if (wVar == null) {
            return;
        }
        if (wVar.b() != null) {
            T b11 = wVar.b();
            synchronized (hVar) {
                Iterator it = new ArrayList(hVar.f57345a).iterator();
                while (it.hasNext()) {
                    ((t) it.next()).onResult(b11);
                }
            }
            return;
        }
        Throwable a11 = wVar.a();
        synchronized (hVar) {
            ArrayList arrayList = new ArrayList(hVar.f57346b);
            if (arrayList.isEmpty()) {
                O5.c.d("Lottie encountered an error but no failure listener was added:", a11);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((t) it2.next()).onResult(a11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(w<T> wVar) {
        if (this.f57348d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f57348d = wVar;
        this.f57347c.post(new Runnable() { // from class: B5.x
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.h.a(com.airbnb.lottie.h.this);
            }
        });
    }

    public final synchronized void c(t tVar) {
        try {
            w<T> wVar = this.f57348d;
            if (wVar != null && wVar.a() != null) {
                tVar.onResult(wVar.a());
            }
            this.f57346b.add(tVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(t tVar) {
        try {
            w<T> wVar = this.f57348d;
            if (wVar != null && wVar.b() != null) {
                tVar.onResult(wVar.b());
            }
            this.f57345a.add(tVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(t tVar) {
        this.f57346b.remove(tVar);
    }

    public final synchronized void f(t tVar) {
        this.f57345a.remove(tVar);
    }
}
