package com.bytedance.adsdk.ugeno.oo.sf;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oo.wh;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends pcc {
    public oo(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        Object obj;
        com.bytedance.adsdk.ugeno.sf.gm gmVar;
        com.bytedance.adsdk.ugeno.sf.gm sf;
        com.bytedance.adsdk.ugeno.sf.gm kj;
        com.bytedance.adsdk.ugeno.pcc.pcc tmg;
        Map<String, Object> map = this.wh;
        if (map == null || map.size() <= 0 || (obj = this.wh.get("name")) == null) {
            return;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf) || (sf = (gmVar = this.gm).sf(gmVar)) == null || (kj = sf.kj(valueOf)) == null || (tmg = kj.tmg(valueOf)) == null) {
            return;
        }
        tmg.sf();
        tmg.pcc(new com.bytedance.adsdk.ugeno.pcc.sf() { // from class: com.bytedance.adsdk.ugeno.oo.sf.oo.1
            @Override // com.bytedance.adsdk.ugeno.pcc.sf
            public void sf() {
                oo.this.gm();
            }

            @Override // com.bytedance.adsdk.ugeno.pcc.sf
            public void pcc() {
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void sf() {
    }
}
