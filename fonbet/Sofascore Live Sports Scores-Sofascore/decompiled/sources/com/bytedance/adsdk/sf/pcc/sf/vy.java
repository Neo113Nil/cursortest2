package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends com.bytedance.adsdk.sf.qf.pcc<PointF> {
    private Path ork;
    private final com.bytedance.adsdk.sf.qf.pcc<PointF> vh;

    public vy(com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar) {
        super(qfVar, pccVar.pcc, pccVar.sf, pccVar.gm, pccVar.oo, pccVar.vj, pccVar.wh, pccVar.qf);
        this.vh = pccVar;
        pcc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pcc() {
        T t;
        T t2;
        T t3 = this.sf;
        boolean z = (t3 == 0 || (t2 = this.pcc) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.pcc;
        if (t4 == 0 || (t = this.sf) == 0 || z) {
            return;
        }
        com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar = this.vh;
        this.ork = com.bytedance.adsdk.sf.wh.wh.pcc((PointF) t4, (PointF) t, pccVar.kj, pccVar.vy);
    }

    public Path sf() {
        return this.ork;
    }
}
