package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import x2.ExecutorC6789k;

/* loaded from: classes.dex */
public class V {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f28487e;

    /* renamed from: a, reason: collision with root package name */
    public final Set f28488a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f28489b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f28490c;

    /* renamed from: d, reason: collision with root package name */
    public volatile T f28491d;

    public static class a extends FutureTask {

        /* renamed from: a, reason: collision with root package name */
        public V f28492a;

        public a(V v10, Callable callable) {
            super(callable);
            this.f28492a = v10;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f28492a.l((T) get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f28492a.l(new T(e10));
                }
            } finally {
                this.f28492a = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f28487e = new ExecutorC6789k();
        } else {
            f28487e = Executors.newCachedThreadPool(new com.airbnb.lottie.utils.h());
        }
    }

    public V(Callable callable) {
        this(callable, false);
    }

    public synchronized V c(O o10) {
        try {
            T t10 = this.f28491d;
            if (t10 != null && t10.a() != null) {
                o10.onResult(t10.a());
            }
            this.f28489b.add(o10);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized V d(O o10) {
        try {
            T t10 = this.f28491d;
            if (t10 != null && t10.b() != null) {
                o10.onResult(t10.b());
            }
            this.f28488a.add(o10);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public T e() {
        return this.f28491d;
    }

    public final synchronized void f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f28489b);
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.utils.g.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((O) it.next()).onResult(th2);
        }
    }

    public final void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f28490c.post(new Runnable() { // from class: com.airbnb.lottie.U
                @Override // java.lang.Runnable
                public final void run() {
                    V.this.h();
                }
            });
        }
    }

    public final void h() {
        T t10 = this.f28491d;
        if (t10 == null) {
            return;
        }
        if (t10.b() != null) {
            i(t10.b());
        } else {
            f(t10.a());
        }
    }

    public final synchronized void i(Object obj) {
        Iterator it = new ArrayList(this.f28488a).iterator();
        while (it.hasNext()) {
            ((O) it.next()).onResult(obj);
        }
    }

    public synchronized V j(O o10) {
        this.f28489b.remove(o10);
        return this;
    }

    public synchronized V k(O o10) {
        this.f28488a.remove(o10);
        return this;
    }

    public final void l(T t10) {
        if (this.f28491d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f28491d = t10;
        g();
    }

    public V(Object obj) {
        this.f28488a = new LinkedHashSet(1);
        this.f28489b = new LinkedHashSet(1);
        this.f28490c = new Handler(Looper.getMainLooper());
        this.f28491d = null;
        l(new T(obj));
    }

    public V(Callable callable, boolean z10) {
        this.f28488a = new LinkedHashSet(1);
        this.f28489b = new LinkedHashSet(1);
        this.f28490c = new Handler(Looper.getMainLooper());
        this.f28491d = null;
        if (z10) {
            try {
                l((T) callable.call());
                return;
            } catch (Throwable th2) {
                l(new T(th2));
                return;
            }
        }
        f28487e.execute(new a(this, callable));
    }
}
