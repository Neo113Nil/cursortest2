package com.bytedance.adsdk.sf.pcc.sf;

import defpackage.a70;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends qf<Integer> {
    public wh(List<com.bytedance.adsdk.sf.qf.pcc<Integer>> list) {
        super(list);
    }

    public int gm(com.bytedance.adsdk.sf.qf.pcc<Integer> pccVar, float f) {
        if (pccVar.pcc == null || pccVar.sf == null) {
            a70.r("Missing values for keyframe.");
            return 0;
        }
        if (this.gm == null) {
            return com.bytedance.adsdk.sf.wh.vj.pcc(pccVar.kj(), pccVar.vy(), f);
        }
        pccVar.qf.getClass();
        oo();
        kj();
        throw null;
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Integer pcc(com.bytedance.adsdk.sf.qf.pcc<Integer> pccVar, float f) {
        return Integer.valueOf(gm(pccVar, f));
    }

    public int vy() {
        return gm(gm(), vj());
    }
}
