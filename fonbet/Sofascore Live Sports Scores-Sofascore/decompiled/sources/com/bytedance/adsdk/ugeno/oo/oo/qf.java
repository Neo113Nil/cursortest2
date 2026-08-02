package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends gm {
    public qf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(objArr[0]), 0);
            Map<String, Object> map = this.vj;
            if (map == null || map.isEmpty()) {
                this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
            } else {
                Object obj = this.vj.get("type");
                if (pcc == (obj != null ? com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj), 0) : 0)) {
                    this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
            }
        }
        return false;
    }
}
