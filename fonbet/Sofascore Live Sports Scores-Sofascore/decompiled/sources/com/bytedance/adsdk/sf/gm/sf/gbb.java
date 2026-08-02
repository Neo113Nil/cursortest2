package com.bytedance.adsdk.sf.gm.sf;

import android.graphics.PointF;
import defpackage.lnb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb {
    private boolean gm;
    private final List<com.bytedance.adsdk.sf.gm.pcc> pcc;
    private PointF sf;

    public gbb(PointF pointF, boolean z, List<com.bytedance.adsdk.sf.gm.pcc> list) {
        this.sf = pointF;
        this.gm = z;
        this.pcc = new ArrayList(list);
    }

    public List<com.bytedance.adsdk.sf.gm.pcc> gm() {
        return this.pcc;
    }

    public void pcc(gbb gbbVar, gbb gbbVar2, float f) {
        if (this.sf == null) {
            this.sf = new PointF();
        }
        this.gm = gbbVar.sf() || gbbVar2.sf();
        if (gbbVar.gm().size() != gbbVar2.gm().size()) {
            gbbVar.gm().size();
            gbbVar2.gm().size();
        }
        int min = Math.min(gbbVar.gm().size(), gbbVar2.gm().size());
        int size = this.pcc.size();
        List<com.bytedance.adsdk.sf.gm.pcc> list = this.pcc;
        if (size < min) {
            for (int size2 = list.size(); size2 < min; size2++) {
                this.pcc.add(new com.bytedance.adsdk.sf.gm.pcc());
            }
        } else if (list.size() > min) {
            for (int size3 = this.pcc.size() - 1; size3 >= min; size3--) {
                List<com.bytedance.adsdk.sf.gm.pcc> list2 = this.pcc;
                list2.remove(list2.size() - 1);
            }
        }
        PointF pcc = gbbVar.pcc();
        PointF pcc2 = gbbVar2.pcc();
        pcc(com.bytedance.adsdk.sf.wh.vj.pcc(pcc.x, pcc2.x, f), com.bytedance.adsdk.sf.wh.vj.pcc(pcc.y, pcc2.y, f));
        for (int size4 = this.pcc.size() - 1; size4 >= 0; size4--) {
            com.bytedance.adsdk.sf.gm.pcc pccVar = gbbVar.gm().get(size4);
            com.bytedance.adsdk.sf.gm.pcc pccVar2 = gbbVar2.gm().get(size4);
            PointF pcc3 = pccVar.pcc();
            PointF sf = pccVar.sf();
            PointF gm = pccVar.gm();
            PointF pcc4 = pccVar2.pcc();
            PointF sf2 = pccVar2.sf();
            PointF gm2 = pccVar2.gm();
            this.pcc.get(size4).pcc(com.bytedance.adsdk.sf.wh.vj.pcc(pcc3.x, pcc4.x, f), com.bytedance.adsdk.sf.wh.vj.pcc(pcc3.y, pcc4.y, f));
            this.pcc.get(size4).sf(com.bytedance.adsdk.sf.wh.vj.pcc(sf.x, sf2.x, f), com.bytedance.adsdk.sf.wh.vj.pcc(sf.y, sf2.y, f));
            this.pcc.get(size4).gm(com.bytedance.adsdk.sf.wh.vj.pcc(gm.x, gm2.x, f), com.bytedance.adsdk.sf.wh.vj.pcc(gm.y, gm2.y, f));
        }
    }

    public boolean sf() {
        return this.gm;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.pcc.size());
        sb.append("closed=");
        return lnb.r(sb, this.gm, '}');
    }

    public gbb() {
        this.pcc = new ArrayList();
    }

    public PointF pcc() {
        return this.sf;
    }

    public void pcc(boolean z) {
        this.gm = z;
    }

    public void pcc(float f, float f2) {
        PointF pointF = this.sf;
        if (pointF == null) {
            pointF = new PointF();
            this.sf = pointF;
        }
        pointF.set(f, f2);
    }
}
