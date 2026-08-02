package com.bytedance.sdk.openadsdk.oo;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb {
    private static volatile gbb pcc;
    private Map<String, Object> oo;
    private sf gm = sf.pcc();
    private final Handler sf = new Handler(com.bytedance.sdk.openadsdk.core.jr.sf().getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.oo.gbb.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 100) {
                return true;
            }
            Object obj = message.obj;
            pcc pccVar = (obj == null || !(obj instanceof pcc)) ? null : (pcc) obj;
            if (pccVar == null) {
                return true;
            }
            gbb.this.sf(pccVar);
            return true;
        }
    });

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf {
        public int pcc = 300;
        public int sf = 6000;

        private sf() {
        }

        public static sf pcc() {
            return new sf();
        }
    }

    private gbb() {
    }

    private void gm(pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        this.sf.post(pccVar);
    }

    private void pcc(pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        pccVar.sf();
        int pcc2 = pccVar.pcc();
        sf sfVar = this.gm;
        if (pcc2 * sfVar.pcc > sfVar.sf) {
            gm(pccVar.pcc(false));
            return;
        }
        Message obtainMessage = this.sf.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = pccVar;
        this.sf.sendMessageDelayed(obtainMessage, this.gm.pcc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        boolean oo = com.bytedance.sdk.openadsdk.core.dax.pcc().oo();
        boolean pcc2 = com.bytedance.sdk.openadsdk.core.dax.pcc().pcc(true);
        if (!oo && pcc2) {
            pcc(pccVar);
            return;
        }
        Map map = pccVar.vj;
        if (map == null) {
            map = new HashMap();
            pccVar.vj = map;
        }
        map.put("is_background", Boolean.valueOf(oo));
        pccVar.vj.put("has_focus", Boolean.valueOf(pcc2));
        gm(pccVar.pcc(true));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements Serializable, Runnable {
        public of gm;
        public String oo;
        public Map<String, Object> vj;
        public final AtomicInteger pcc = new AtomicInteger(0);
        public final AtomicBoolean sf = new AtomicBoolean(false);
        private final long wh = SystemClock.elapsedRealtime();

        public pcc(of ofVar, String str, Map<String, Object> map) {
            this.gm = ofVar;
            this.oo = str;
            this.vj = map;
        }

        public int pcc() {
            return this.pcc.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.gm == null || TextUtils.isEmpty(this.oo)) {
                return;
            }
            String str = this.sf.get() ? "dpl_success" : "dpl_failed";
            if (this.vj == null) {
                this.vj = new HashMap();
            }
            of ofVar = this.gm;
            if (ofVar != null && ofVar.fg() == 0) {
                Map<String, Object> map = this.vj;
                of ofVar2 = this.gm;
                map.put("auto_click", Boolean.valueOf((ofVar2 == null || ofVar2.gpj()) ? false : true));
            }
            this.vj.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.dax.pcc().gm()));
            this.vj.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(SystemClock.elapsedRealtime() - this.wh));
            gm.pcc(this.gm, this.oo, str, this.vj);
        }

        public void sf() {
            this.pcc.incrementAndGet();
        }

        public pcc pcc(boolean z) {
            this.sf.set(z);
            return this;
        }

        public static pcc pcc(of ofVar, String str, Map<String, Object> map) {
            return new pcc(ofVar, str, map);
        }
    }

    public static gbb pcc() {
        if (pcc == null) {
            synchronized (gbb.class) {
                try {
                    if (pcc == null) {
                        pcc = new gbb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public gbb pcc(Map<String, Object> map) {
        this.oo = map;
        return pcc();
    }

    public void pcc(of ofVar, String str) {
        Message obtainMessage = this.sf.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = pcc.pcc(ofVar, str, this.oo);
        obtainMessage.sendToTarget();
    }
}
