package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc {
    private String gm;
    protected JSONObject pcc;
    protected com.bytedance.adsdk.ugeno.sf.gm sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.pcc.pcc.pcc$pcc, reason: collision with other inner class name */
    public static class C0033pcc {
        public static pcc pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
            if (gmVar == null || jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("type");
            optString.getClass();
            switch (optString) {
                case "stretch":
                    return new vj(gmVar, jSONObject);
                case "ripple":
                    return new sf(gmVar, jSONObject);
                case "rub_in":
                    return new gm(gmVar, jSONObject);
                case "shine":
                    return new oo(gmVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        this.pcc = jSONObject;
        this.sf = gmVar;
        pcc();
    }

    public abstract List<PropertyValuesHolder> gm();

    public String oo() {
        return this.gm;
    }

    public void pcc() {
        this.gm = this.pcc.optString("type");
        sf();
    }

    public abstract void pcc(int i, int i2);

    public abstract void pcc(Canvas canvas);

    public abstract void sf();

    public abstract void sf(Canvas canvas);
}
