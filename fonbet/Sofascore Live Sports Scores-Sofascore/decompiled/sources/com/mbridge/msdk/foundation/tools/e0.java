package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e0 implements Executor {
    private Runnable a;
    private Runnable b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.b;
        this.a = runnable;
        this.b = null;
        if (runnable != null) {
            c0.a().execute(this.a);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.a == null) {
                this.a = a(runnable);
                c0.a().execute(this.a);
            } else if (this.b == null) {
                this.b = a(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }
}
