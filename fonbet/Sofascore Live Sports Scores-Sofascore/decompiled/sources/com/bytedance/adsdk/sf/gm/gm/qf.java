package com.bytedance.adsdk.sf.gm.gm;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.sf.gm.sf.dax;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends pcc {
    private final sf kj;
    private final com.bytedance.adsdk.sf.pcc.pcc.oo qf;

    public qf(com.bytedance.adsdk.sf.vy vyVar, vj vjVar, sf sfVar, com.bytedance.adsdk.sf.qf qfVar) {
        super(vyVar, vjVar);
        this.kj = sfVar;
        com.bytedance.adsdk.sf.pcc.pcc.oo ooVar = new com.bytedance.adsdk.sf.pcc.pcc.oo(vyVar, this, new dax("__container", vjVar.gbb(), false), qfVar);
        this.qf = ooVar;
        List<com.bytedance.adsdk.sf.pcc.pcc.gm> list = Collections.EMPTY_LIST;
        ooVar.pcc(list, list);
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public com.bytedance.adsdk.sf.gm.sf.pcc ork() {
        com.bytedance.adsdk.sf.gm.sf.pcc ork = super.ork();
        return ork != null ? ork : this.kj.ork();
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc, com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        super.pcc(rectF, matrix, z);
        this.qf.pcc(rectF, this.pcc, z);
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public void sf(Canvas canvas, Matrix matrix, int i) {
        super.sf(canvas, matrix, i);
        this.qf.pcc(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public com.bytedance.adsdk.sf.vj.ork vh() {
        com.bytedance.adsdk.sf.vj.ork vh = super.vh();
        return vh != null ? vh : this.kj.vh();
    }
}
