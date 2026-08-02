package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf implements vh, vj, pcc.InterfaceC0027pcc {
    private final Paint gm;
    private com.bytedance.adsdk.sf.pcc.sf.gm hc;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> kj;
    private final com.bytedance.adsdk.sf.gm.gm.pcc oo;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> ork;
    float pcc;
    private final List<hc> qf;
    private final Path sf;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> tmg;
    private final com.bytedance.adsdk.sf.vy vh;
    private final String vj;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> vy;
    private final boolean wh;

    public qf(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.jr jrVar) {
        Path path = new Path();
        this.sf = path;
        this.gm = new com.bytedance.adsdk.sf.pcc.pcc(1);
        this.qf = new ArrayList();
        this.oo = pccVar;
        this.vj = jrVar.pcc();
        this.wh = jrVar.vj();
        this.vh = vyVar;
        if (pccVar.ork() != null) {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc = pccVar.ork().pcc().pcc();
            this.tmg = pcc;
            pcc.pcc(this);
            pccVar.pcc(this.tmg);
        }
        if (pccVar.vh() != null) {
            this.hc = new com.bytedance.adsdk.sf.pcc.sf.gm(this, pccVar, pccVar.vh());
        }
        if (jrVar.sf() == null || jrVar.gm() == null) {
            this.kj = null;
            this.vy = null;
            return;
        }
        path.setFillType(jrVar.oo());
        com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pcc2 = jrVar.sf().pcc();
        this.kj = pcc2;
        pcc2.pcc(this);
        pccVar.pcc(pcc2);
        com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pcc3 = jrVar.gm().pcc();
        this.vy = pcc3;
        pcc3.pcc(this);
        pccVar.pcc(pcc3);
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(Canvas canvas, Matrix matrix, int i) {
        if (this.wh) {
            return;
        }
        com.bytedance.adsdk.sf.vj.pcc("FillContent#draw");
        int i2 = 0;
        this.gm.setColor((com.bytedance.adsdk.sf.wh.vj.pcc((int) ((((i / 255.0f) * this.vy.qf().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.sf.pcc.sf.sf) this.kj).vy() & 16777215));
        com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> pccVar = this.ork;
        if (pccVar != null) {
            this.gm.setColorFilter(pccVar.qf());
        }
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar2 = this.tmg;
        if (pccVar2 != null) {
            float floatValue = pccVar2.qf().floatValue();
            if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.gm.setMaskFilter(null);
            } else if (floatValue != this.pcc) {
                this.gm.setMaskFilter(this.oo.sf(floatValue));
            }
            this.pcc = floatValue;
        }
        com.bytedance.adsdk.sf.pcc.sf.gm gmVar = this.hc;
        if (gmVar != null) {
            gmVar.pcc(this.gm);
        }
        this.sf.reset();
        while (true) {
            int size = this.qf.size();
            Path path = this.sf;
            if (i2 >= size) {
                canvas.drawPath(path, this.gm);
                com.bytedance.adsdk.sf.vj.sf("FillContent#draw");
                return;
            } else {
                path.addPath(this.qf.get(i2).oo(), matrix);
                i2++;
            }
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        for (int i = 0; i < list2.size(); i++) {
            gm gmVar = list2.get(i);
            if (gmVar instanceof hc) {
                this.qf.add((hc) gmVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0027pcc
    public void pcc() {
        this.vh.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        this.sf.reset();
        int i = 0;
        while (true) {
            int size = this.qf.size();
            Path path = this.sf;
            if (i < size) {
                path.addPath(this.qf.get(i).oo(), matrix);
                i++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }
}
