package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: ExecutorDelivery.java */
/* loaded from: classes14.dex */
public class f implements w {
    private final Executor a;

    /* compiled from: ExecutorDelivery.java */
    public class a implements Executor {
        final /* synthetic */ Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    /* compiled from: ExecutorDelivery.java */
    public static class b implements Runnable {
        private final t a;
        private final v b;
        private final Runnable c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.a = tVar;
            this.b = vVar;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.v()) {
                this.a.c("canceled-at-delivery");
                return;
            }
            if (this.b.a()) {
                this.a.a((t) this.b.a);
            } else {
                this.a.b(this.b.c);
            }
            if (this.b.d) {
                this.a.a("intermediate-response");
            } else {
                this.a.c("done");
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.a.execute(new b(tVar, v.a(b0Var), null));
    }
}
