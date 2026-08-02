package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.bytedance.adsdk.ugeno.oo.wh;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gm {
    protected com.bytedance.adsdk.ugeno.oo.wh gm;
    protected String kj;
    protected wh.pcc oo;
    protected Context ork;
    protected com.bytedance.adsdk.ugeno.oo.vh pcc;
    protected String qf;
    protected com.bytedance.adsdk.ugeno.sf.gm sf;
    protected Map<String, Object> vj;
    protected String vy;
    protected String wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public static gm pcc(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.oo.wh pcc;
            wh.pcc pcc2;
            if (gmVar == null || jSONObject == null || (pcc = com.bytedance.adsdk.ugeno.oo.wh.pcc(jSONObject, jSONObject2)) == null || (pcc2 = pcc.pcc()) == null) {
                return null;
            }
            String pcc3 = pcc2.pcc();
            if (TextUtils.equals(pcc3, Payload.CUSTOM)) {
                oo ooVar = new oo(context);
                ooVar.pcc(gmVar);
                ooVar.pcc(pcc);
                ooVar.gm();
                return ooVar;
            }
            com.bytedance.adsdk.ugeno.oo.qf pcc4 = (TextUtils.isEmpty(pcc3) || TextUtils.equals(pcc3, "global")) ? com.bytedance.adsdk.ugeno.oo.ork.pcc(pcc2.sf()) : com.bytedance.adsdk.ugeno.oo.ork.pcc(pcc2.vj());
            if (pcc4 == null) {
                return null;
            }
            gm pcc5 = pcc4.pcc(context);
            pcc5.pcc(gmVar);
            pcc5.pcc(pcc);
            pcc5.gm();
            return pcc5;
        }
    }

    public gm(Context context) {
        this.ork = context;
    }

    public void gm() {
        this.oo = this.gm.pcc();
        com.bytedance.adsdk.ugeno.oo.wh whVar = this.gm;
        if (whVar == null) {
            return;
        }
        wh.pcc pcc2 = whVar.pcc();
        this.oo = pcc2;
        if (pcc2 == null) {
            return;
        }
        this.vj = pcc2.gm();
        this.wh = this.oo.sf();
        this.qf = this.oo.pcc();
        this.kj = this.oo.oo();
        this.vy = this.oo.vj();
    }

    public String oo() {
        return this.wh;
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        this.sf = gmVar;
    }

    public abstract boolean pcc(Object... objArr);

    public com.bytedance.adsdk.ugeno.oo.wh qf() {
        return this.gm;
    }

    public String vj() {
        return this.kj;
    }

    public String wh() {
        return this.vy;
    }

    public void pcc(com.bytedance.adsdk.ugeno.oo.wh whVar) {
        this.gm = whVar;
    }

    public void pcc(com.bytedance.adsdk.ugeno.oo.vh vhVar) {
        this.pcc = vhVar;
    }
}
