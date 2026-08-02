package com.bytedance.adsdk.sf.pcc.sf;

import defpackage.a70;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tmg extends qf<com.bytedance.adsdk.sf.qf.gm> {
    private final com.bytedance.adsdk.sf.qf.gm oo;

    public tmg(List<com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.qf.gm>> list) {
        super(list);
        this.oo = new com.bytedance.adsdk.sf.qf.gm();
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.sf.qf.gm pcc(com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.qf.gm> pccVar, float f) {
        com.bytedance.adsdk.sf.qf.gm gmVar;
        com.bytedance.adsdk.sf.qf.gm gmVar2 = pccVar.pcc;
        if (gmVar2 == null || (gmVar = pccVar.sf) == null) {
            a70.r("Missing values for keyframe.");
            return null;
        }
        com.bytedance.adsdk.sf.qf.gm gmVar3 = gmVar2;
        com.bytedance.adsdk.sf.qf.gm gmVar4 = gmVar;
        if (this.gm == null) {
            this.oo.pcc(com.bytedance.adsdk.sf.wh.vj.pcc(gmVar3.pcc(), gmVar4.pcc(), f), com.bytedance.adsdk.sf.wh.vj.pcc(gmVar3.sf(), gmVar4.sf(), f));
            return this.oo;
        }
        pccVar.qf.getClass();
        oo();
        kj();
        throw null;
    }
}
