package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.Path;
import com.bytedance.adsdk.sf.pcc.pcc.gpj;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc extends pcc<com.bytedance.adsdk.sf.gm.sf.gbb, Path> {
    private final com.bytedance.adsdk.sf.gm.sf.gbb oo;
    private final Path vj;
    private List<gpj> wh;

    public hc(List<com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf.gbb>> list) {
        super(list);
        this.oo = new com.bytedance.adsdk.sf.gm.sf.gbb();
        this.vj = new Path();
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Path pcc(com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf.gbb> pccVar, float f) {
        this.oo.pcc(pccVar.pcc, pccVar.sf, f);
        com.bytedance.adsdk.sf.gm.sf.gbb gbbVar = this.oo;
        List<gpj> list = this.wh;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                gbbVar = this.wh.get(size).pcc(gbbVar);
            }
        }
        com.bytedance.adsdk.sf.wh.vj.pcc(gbbVar, this.vj);
        return this.vj;
    }

    public void pcc(List<gpj> list) {
        this.wh = list;
    }
}
