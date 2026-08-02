package lc;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: lc.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ExecutorC5458l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f55821a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public Runnable f55822b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f55823c;

    /* renamed from: lc.l$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f55824a;

        public a(Runnable runnable) {
            this.f55824a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f55824a.run();
            } finally {
                ExecutorC5458l.this.a();
            }
        }
    }

    public ExecutorC5458l(Executor executor) {
        this.f55823c = executor;
    }

    public synchronized void a() {
        Runnable runnable = (Runnable) this.f55821a.poll();
        this.f55822b = runnable;
        if (runnable != null) {
            this.f55823c.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f55821a.offer(new a(runnable));
        if (this.f55822b == null) {
            a();
        }
    }
}
