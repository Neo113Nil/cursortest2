package com.mbridge.msdk.tracker;

import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class o {
    private r a;
    private final int b;
    private final p c;
    private final w d;
    private final int e;
    private com.mbridge.msdk.tracker.network.u f;
    private final Executor g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements v.a {
        private final r a;
        private final t b;

        public b(r rVar, t tVar) {
            this.a = rVar;
            this.b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.a
        public void a(b0 b0Var) {
            int d;
            int g;
            String message;
            if (y.a(this.a)) {
                if (b0Var != null) {
                    try {
                        d = b0Var.d();
                        g = b0Var.g();
                        message = b0Var.getMessage();
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    message = "";
                    d = 0;
                    g = 0;
                }
                this.a.a(this.b, 0, "volleyError:" + d + ",responseCode:" + g + ",errorMessage:" + message);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements v.b {
        private final r a;
        private final t b;

        public c(r rVar, t tVar) {
            this.a = rVar;
            this.b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.b
        public void a(Object obj) {
            if (y.a(this.a)) {
                try {
                    this.a.a(this.b);
                } catch (Exception unused) {
                }
            }
        }
    }

    public o(int i, p pVar, w wVar, int i2) {
        this.b = i;
        this.c = pVar;
        this.d = wVar;
        this.e = i2;
        this.g = new ThreadPoolExecutor(i, i, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z) {
        int i = this.e;
        p pVar = this.c;
        v<Object> vVar = i == 1 ? new v<>(pVar.c(), 1, this.c.a()) : new v<>(pVar.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.d);
        vVar.a(z ? t.a.HIGH : t.a.NORMAL);
        vVar.a((v.b<Object>) new c(this.a, tVar));
        vVar.a((v.a) new b(this.a, tVar));
        return vVar;
    }

    public void b(t tVar, Map<String, String> map, boolean z) {
        if (y.b(map)) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f.a(a(tVar, map, z));
        } catch (Exception e) {
            if (y.a(this.a)) {
                this.a.a(tVar, 0, e.getMessage());
            }
        }
    }

    public void a(r rVar) {
        this.a = rVar;
    }

    private void a() {
        if (y.a(this.f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.u a2 = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.c.b()), new com.mbridge.msdk.tracker.network.f(this.g), this.b, null);
        this.f = a2;
        a2.b();
    }
}
