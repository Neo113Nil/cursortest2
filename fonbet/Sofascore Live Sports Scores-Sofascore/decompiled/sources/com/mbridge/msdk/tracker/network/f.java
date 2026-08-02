package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f implements w {
    private final Executor a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
            boolean a = this.b.a();
            t tVar = this.a;
            if (a) {
                tVar.a((t) this.b.a);
            } else {
                tVar.b(this.b.c);
            }
            boolean z = this.b.d;
            t tVar2 = this.a;
            if (z) {
                tVar2.a("intermediate-response");
            } else {
                tVar2.c("done");
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
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.a.execute(new b(tVar, v.a(b0Var), null));
    }

    public f(Executor executor) {
        this.a = executor;
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.a.execute(new b(tVar, vVar, runnable));
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }
}
