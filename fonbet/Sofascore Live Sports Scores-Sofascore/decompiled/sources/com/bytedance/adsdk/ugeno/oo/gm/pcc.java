package com.bytedance.adsdk.ugeno.oo.gm;

import com.bytedance.adsdk.ugeno.oo.wh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends com.bytedance.adsdk.ugeno.oo.sf.pcc {
    public pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        com.bytedance.adsdk.ugeno.sf.gm sf;
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.gm;
        if (gmVar == null || (sf = gmVar.sf(gmVar)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.sf.gm wh = sf.wh("SwiperView");
        if (wh instanceof com.bytedance.adsdk.ugeno.sf) {
            ((com.bytedance.adsdk.ugeno.sf) wh).gm();
        }
    }
}
