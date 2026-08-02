package com.bytedance.sdk.component.wh.pcc.qf;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.wh.pcc.qf;
import com.bytedance.sdk.component.wh.pcc.vj;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static int gm = 3000;
    private static volatile HandlerThread pcc;
    private static volatile Handler sf;

    static {
        gm();
    }

    private static void gm() {
        HandlerThread pcc2;
        vj jr = qf.wh().jr();
        if (jr != null && (pcc2 = jr.pcc("csj_ad_log", 10)) != null) {
            pcc = pcc2;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        pcc = handlerThread;
        handlerThread.start();
    }

    public static Handler pcc() {
        if (pcc == null || !pcc.isAlive()) {
            synchronized (pcc.class) {
                try {
                    if (pcc != null) {
                        if (!pcc.isAlive()) {
                        }
                    }
                    gm();
                    sf = new Handler(pcc.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (sf == null) {
            synchronized (pcc.class) {
                try {
                    if (sf == null) {
                        sf = new Handler(pcc.getLooper());
                    }
                } finally {
                }
            }
        }
        return sf;
    }

    public static int sf() {
        int i = gm;
        if (i > 0) {
            return i;
        }
        gm = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        return IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
    }
}
