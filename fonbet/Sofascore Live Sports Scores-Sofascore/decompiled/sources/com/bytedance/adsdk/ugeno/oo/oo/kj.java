package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import com.bytedance.adsdk.ugeno.oo.wh;
import defpackage.ljg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends gm {
    private int hc;
    private int tmg;
    private int vh;

    public kj(Context context) {
        super(context);
        this.vh = -1;
        this.tmg = -1;
        this.hc = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(objArr[0]), -1);
            int pcc2 = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(objArr[1]), -1);
            int pcc3 = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(objArr[2]), -1);
            Map<String, Object> map = this.vj;
            if (map == null || map.isEmpty()) {
                HashMap hashMap = new HashMap();
                ljg.s(pcc, pcc2, "fromIndex", "toIndex", hashMap);
                hashMap.put("type", Integer.valueOf(pcc3));
                Iterator<wh.pcc> it = this.gm.sf().iterator();
                while (it.hasNext()) {
                    it.next().sf(hashMap);
                }
                this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
            } else {
                Object obj = this.vj.get("fromIndex");
                if (obj != null) {
                    this.vh = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj), -1);
                }
                if (this.vj.get("toIndex") != null) {
                    this.tmg = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(this.vj.get("toIndex")), -1);
                }
                if (this.vj.get("type") != null) {
                    this.hc = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(this.vj.get("type")), -1);
                }
                if (pcc == this.vh && pcc2 == this.tmg && pcc3 == this.hc) {
                    this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
            }
        }
        return false;
    }
}
