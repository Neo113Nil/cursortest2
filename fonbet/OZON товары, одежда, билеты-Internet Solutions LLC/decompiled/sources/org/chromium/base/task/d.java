package org.chromium.base.task;

import android.os.Binder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.TraceEvent;
import org.chromium.base.j;

/* loaded from: classes10.dex */
public abstract class d<Result> {

    /* renamed from: a, reason: collision with root package name */
    private final d<Result>.a f78584a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f78585b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f78586c = new AtomicBoolean();

    class a extends FutureTask<Result> {
        a(c cVar) {
            super(cVar);
        }

        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            d dVar = d.this;
            try {
                d.d(dVar, get());
            } catch (InterruptedException e11) {
                Log.w(j.c("AsyncTask"), e11.toString());
            } catch (CancellationException unused) {
                d.d(dVar, null);
            } catch (ExecutionException e12) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
            }
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            try {
                d dVar = d.this;
                TraceEvent r11 = TraceEvent.r("AsyncTask.run: ".concat(d.class.getName()));
                try {
                    super.run();
                    if (r11 != null) {
                        r11.close();
                    }
                } finally {
                }
            } finally {
                Thread.interrupted();
            }
        }
    }

    static {
        new ArrayDeque();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [org.chromium.base.task.c] */
    public d() {
        int i11 = PostTask.f78564f;
        this.f78584a = new a(new Callable() { // from class: org.chromium.base.task.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.b(d.this);
            }
        });
    }

    public static void a(d dVar, Object obj) {
        if (dVar.f78585b.get()) {
            return;
        }
        dVar.f();
    }

    public static Object b(d dVar) {
        Object obj;
        dVar.f78586c.set(true);
        try {
            obj = dVar.e();
            try {
                Binder.flushPendingCommands();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                try {
                    dVar.f78585b.set(true);
                    throw th;
                } finally {
                    PostTask.b(new org.chromium.base.task.a(dVar, obj), 7);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }

    static void d(d dVar, Object obj) {
        if (dVar.f78586c.get()) {
            return;
        }
        PostTask.b(new org.chromium.base.task.a(dVar, obj), 7);
    }

    protected abstract Result e();

    protected abstract void f();
}
