package com.bytedance.sdk.component.kj.pcc;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.lo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class vj {
    private static volatile vj pcc;
    private volatile Handler gm;
    private volatile HandlerThread sf;

    private vj() {
        sf();
    }

    private boolean gm() {
        return (this.sf == null || this.gm == null || !this.sf.isAlive()) ? false : true;
    }

    public static vj pcc() {
        if (pcc == null) {
            synchronized (vj.class) {
                try {
                    if (pcc == null) {
                        pcc = new vj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    private void sf() {
        try {
            if (gm()) {
                return;
            }
            this.sf = new HandlerThread("csj_dispatch_msg") { // from class: com.bytedance.sdk.component.kj.pcc.vj.1
                boolean pcc = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.pcc) {
                        return;
                    }
                    this.pcc = true;
                    super.start();
                }
            };
            this.sf.start();
            this.gm = new Handler(this.sf.getLooper());
        } catch (Throwable th) {
            lo.pcc("TTDispatchThread", "new handlerThread error", th);
        }
    }

    public void pcc(Runnable runnable) {
        Handler handler;
        if (gm() && (handler = this.gm) != null) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }
}
