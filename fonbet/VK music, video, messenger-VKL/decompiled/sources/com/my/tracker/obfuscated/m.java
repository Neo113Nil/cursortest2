package com.my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import xsna.asu0;
import xsna.az4;

/* loaded from: classes.dex */
public abstract class m {
    public static final Handler a;
    public static final Executor b;
    public static final Executor c;
    public static final Executor d;
    public static final Executor e;
    public static final Executor f;
    private static final Executor g;
    private static final a h;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        a = handler;
        b = asu0.C();
        c = asu0.C();
        d = asu0.C();
        e = asu0.C();
        f = asu0.C();
        g = new az4(handler);
        h = new a();
    }

    public static void a(Runnable runnable) {
        b.execute(h.a(runnable));
    }

    public static void b(Runnable runnable) {
        c.execute(h.a(runnable));
    }

    public static void c(Runnable runnable) {
        d.execute(h.a(runnable));
    }

    public static void d(Runnable runnable) {
        e.execute(h.a(runnable));
    }

    public static void e(Runnable runnable) {
        f.execute(h.a(runnable));
    }

    public static void f(Runnable runnable) {
        Runnable a2 = h.a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a2.run();
        } else {
            g.execute(a2);
        }
    }

    public static final class a {
        private final ArrayDeque a = new ArrayDeque();

        /* renamed from: com.my.tracker.obfuscated.m$a$a, reason: collision with other inner class name */
        public static final class RunnableC0363a implements Runnable {
            final a a;
            volatile Runnable b;

            public RunnableC0363a(a aVar) {
                this.a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    try {
                        x2.b("RunnableThrowableDecorator: exception has been caught", th);
                        a aVar = this.a;
                        if (aVar != null) {
                            aVar.a(this);
                        }
                    } finally {
                        a aVar2 = this.a;
                        if (aVar2 != null) {
                            aVar2.a(this);
                        }
                    }
                }
            }
        }

        public a() {
            for (int i = 0; i < 64; i++) {
                this.a.add(new RunnableC0363a(this));
            }
        }

        public Runnable a(Runnable runnable) {
            RunnableC0363a runnableC0363a;
            synchronized (this) {
                runnableC0363a = (RunnableC0363a) this.a.pollFirst();
            }
            if (runnableC0363a == null) {
                runnableC0363a = new RunnableC0363a(null);
            }
            runnableC0363a.b = runnable;
            return runnableC0363a;
        }

        public void a(RunnableC0363a runnableC0363a) {
            synchronized (this) {
                runnableC0363a.b = null;
                this.a.add(runnableC0363a);
            }
        }
    }
}
