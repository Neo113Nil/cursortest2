package com.bytedance.sdk.component.kj.pcc;

import android.os.Handler;
import com.bytedance.sdk.component.utils.kj;
import com.bytedance.sdk.component.utils.tsz;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private final oo<sf> pcc;
    private Handler sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.kj.pcc.pcc$pcc, reason: collision with other inner class name */
    public static class C0049pcc {
        private static final pcc pcc = new pcc();
    }

    private pcc() {
        this.pcc = oo.pcc(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final Handler handler, final Handler handler2) {
        if (!handler.getLooper().getQueue().isIdle()) {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.kj.pcc.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.pcc(handler, handler2);
                }
            }, 1000L);
        } else {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        }
    }

    public Handler sf() {
        Handler handler;
        Handler handler2 = this.sf;
        if (handler2 != null) {
            return handler2;
        }
        synchronized (pcc.class) {
            try {
                handler = this.sf;
                if (handler == null) {
                    handler = pcc("csj_io_handler");
                    this.sf = handler;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    private sf sf(tsz.pcc pccVar, String str) {
        return new sf(kj.pcc(str), pccVar);
    }

    public static pcc pcc() {
        return C0049pcc.pcc;
    }

    public tsz pcc(tsz.pcc pccVar, final String str) {
        sf pcc = this.pcc.pcc();
        if (pcc != null) {
            pcc.pcc(pccVar);
            pcc.post(new Runnable() { // from class: com.bytedance.sdk.component.kj.pcc.pcc.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return pcc;
        }
        return sf(pccVar, str);
    }

    public tsz pcc(String str) {
        return pcc((tsz.pcc) null, str);
    }

    public boolean pcc(tsz tszVar) {
        if (!(tszVar instanceof sf)) {
            return false;
        }
        sf sfVar = (sf) tszVar;
        if (this.pcc.pcc((oo<sf>) sfVar)) {
            return true;
        }
        sfVar.sf();
        return true;
    }
}
