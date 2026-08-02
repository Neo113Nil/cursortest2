package com.bytedance.sdk.component.adexpress.oo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public static void pcc(com.bytedance.sdk.component.kj.sf.gm gmVar, int i) {
        if (gmVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.pcc.pcc.gm gm = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm();
        ExecutorService gbb = gm != null ? gm.gbb() : null;
        if (gbb != null) {
            gmVar.setPriority(i);
            gbb.execute(gmVar);
        }
    }

    public static void sf(com.bytedance.sdk.component.kj.sf.gm gmVar, int i) {
        if (gmVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.pcc.pcc.gm gm = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm();
        ExecutorService hc = gm != null ? gm.hc() : null;
        if (hc != null) {
            gmVar.setPriority(i);
            hc.execute(gmVar);
        }
    }

    public static ScheduledFuture pcc(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.pcc.pcc.gm gm = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm();
        ScheduledExecutorService jr = gm != null ? gm.jr() : null;
        if (jr != null) {
            return jr.schedule(runnable, j, timeUnit);
        }
        return null;
    }
}
