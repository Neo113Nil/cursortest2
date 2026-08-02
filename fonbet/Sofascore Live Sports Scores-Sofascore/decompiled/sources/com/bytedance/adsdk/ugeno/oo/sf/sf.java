package com.bytedance.adsdk.ugeno.oo.sf;

import com.bytedance.adsdk.ugeno.oo.wh;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends pcc {
    private List<com.bytedance.adsdk.ugeno.oo.pcc.oo> vy;

    public sf(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
        this.vy = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        Object obj;
        com.bytedance.adsdk.ugeno.oo.pcc.gm pcc;
        Map<String, Object> map = this.wh;
        if (map == null || map.size() <= 0 || (obj = this.wh.get("name")) == null) {
            return;
        }
        String valueOf = String.valueOf(obj);
        com.bytedance.adsdk.ugeno.oo.pcc.pcc rj = this.gm.rj();
        if (rj == null || (pcc = rj.pcc(valueOf)) == null) {
            return;
        }
        pcc.pcc(valueOf);
    }
}
