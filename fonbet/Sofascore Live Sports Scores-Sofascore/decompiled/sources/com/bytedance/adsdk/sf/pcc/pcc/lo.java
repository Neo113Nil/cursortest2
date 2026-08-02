package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo extends pcc {
    private com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> kj;
    private final com.bytedance.adsdk.sf.gm.gm.pcc oo;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> qf;
    private final String vj;
    private final boolean wh;

    public lo(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.lu luVar) {
        super(vyVar, pccVar, luVar.qf().pcc(), luVar.kj().pcc(), luVar.vy(), luVar.gm(), luVar.oo(), luVar.vj(), luVar.wh());
        this.oo = pccVar;
        this.vj = luVar.pcc();
        this.wh = luVar.ork();
        com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pcc = luVar.sf().pcc();
        this.qf = pcc;
        pcc.pcc(this);
        pccVar.pcc(pcc);
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.pcc, com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(Canvas canvas, Matrix matrix, int i) {
        if (this.wh) {
            return;
        }
        this.sf.setColor(((com.bytedance.adsdk.sf.pcc.sf.sf) this.qf).vy());
        com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> pccVar = this.kj;
        if (pccVar != null) {
            this.sf.setColorFilter(pccVar.qf());
        }
        super.pcc(canvas, matrix, i);
    }
}
