package com.bytedance.adsdk.ugeno.oo.sf;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oo.wh;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends pcc {
    public vj(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
    }

    private void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        Object obj;
        if (gmVar == null) {
            return;
        }
        for (String str : this.wh.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id") && (obj = this.wh.get(str)) != null) {
                gmVar.pcc(str, String.valueOf(obj));
            }
        }
        gmVar.pcc(this.wh.containsKey("width"), this.wh.containsKey("height"));
        gmVar.sf();
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        Map<String, Object> map = this.wh;
        if (map == null || map.size() <= 0) {
            return;
        }
        Object obj = this.wh.get("id");
        if (obj == null) {
            pcc(this.gm);
            return;
        }
        String valueOf = String.valueOf(obj);
        boolean isEmpty = TextUtils.isEmpty(valueOf);
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.gm;
        if (isEmpty) {
            pcc(gmVar);
            return;
        }
        com.bytedance.adsdk.ugeno.sf.gm sf = gmVar.sf(gmVar);
        if (sf == null) {
            return;
        }
        pcc(sf.vj(valueOf));
    }
}
