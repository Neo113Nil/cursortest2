package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private List<C0028pcc> gm;
    private long oo;
    private String pcc;
    private float sf;
    private long vj;
    private String wh;

    public static pcc pcc(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        if (jSONObject == null) {
            return null;
        }
        pcc pccVar = new pcc();
        pccVar.pcc(jSONObject.optString("ordering"));
        String optString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", optString)) {
            pccVar.pcc(-1.0f);
        } else {
            try {
                pccVar.pcc(Float.parseFloat(optString));
            } catch (NumberFormatException unused) {
                pccVar.pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        pccVar.pcc(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION, 0L));
        pccVar.sf(com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("startDelay"), gmVar.tmg()), 0L));
        pccVar.sf(jSONObject.optString("loopMode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("animators");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.qf.sf.pcc(jSONObject2, optJSONObject);
                }
                arrayList.add(C0028pcc.pcc(optJSONObject, gmVar));
            }
            pccVar.pcc(arrayList);
        }
        return pccVar;
    }

    public List<C0028pcc> gm() {
        return this.gm;
    }

    public long oo() {
        return this.oo;
    }

    public float sf() {
        return this.sf;
    }

    public long vj() {
        return this.vj;
    }

    public String wh() {
        return this.wh;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.core.pcc$pcc, reason: collision with other inner class name */
    public static class C0028pcc {
        private String gm;
        private float[] kj;
        private long oo;
        private String ork;
        private long pcc;
        private float qf;
        private float sf;
        private String vj;
        private String vy;
        private float wh;

        public static C0028pcc pcc(JSONObject jSONObject, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
            if (jSONObject == null) {
                return null;
            }
            C0028pcc c0028pcc = new C0028pcc();
            c0028pcc.pcc(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
            String optString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", optString)) {
                c0028pcc.pcc(-1.0f);
            } else {
                try {
                    c0028pcc.pcc(Float.parseFloat(optString));
                } catch (NumberFormatException unused) {
                    c0028pcc.pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            c0028pcc.pcc(jSONObject.optString("loopMode"));
            c0028pcc.sf(jSONObject.optString("type"));
            if (TextUtils.equals(c0028pcc.vj(), "ripple")) {
                c0028pcc.gm(jSONObject.optString("rippleColor"));
            }
            View vh = gmVar.vh();
            Context context = vh != null ? vh.getContext() : null;
            if (TextUtils.equals(c0028pcc.vj(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                String pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("valueTo"), gmVar.tmg());
                int pcc2 = com.bytedance.adsdk.ugeno.qf.pcc.pcc(jSONObject.optString("valueFrom"));
                int pcc3 = com.bytedance.adsdk.ugeno.qf.pcc.pcc(pcc);
                c0028pcc.sf(pcc2);
                c0028pcc.gm(pcc3);
            } else if ((TextUtils.equals(c0028pcc.vj(), "translateX") || TextUtils.equals(c0028pcc.vj(), "translateY")) && context != null) {
                try {
                    float pcc4 = com.bytedance.adsdk.ugeno.qf.kj.pcc(context, (float) jSONObject.optDouble("valueFrom"));
                    float pcc5 = com.bytedance.adsdk.ugeno.qf.kj.pcc(context, (float) jSONObject.optDouble("valueTo"));
                    c0028pcc.sf(pcc4);
                    c0028pcc.gm(pcc5);
                } catch (Exception unused2) {
                }
            } else {
                c0028pcc.sf((float) jSONObject.optDouble("valueFrom"));
                c0028pcc.gm((float) jSONObject.optDouble("valueTo"));
            }
            c0028pcc.oo(jSONObject.optString("interpolator"));
            c0028pcc.sf(com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("startDelay"), gmVar.tmg()), 0L));
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                float[] fArr = new float[optJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c0028pcc.vj(), "translateX") || TextUtils.equals(c0028pcc.vj(), "translateY")) && context != null) {
                    while (i < optJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.qf.kj.pcc(context, (float) pcc.pcc(optJSONArray.optString(i), gmVar.tmg()));
                        i++;
                    }
                } else {
                    while (i < optJSONArray.length()) {
                        fArr[i] = (float) pcc.pcc(optJSONArray.optString(i), gmVar.tmg());
                        i++;
                    }
                }
                c0028pcc.pcc(fArr);
            }
            return c0028pcc;
        }

        public String gm() {
            return this.gm;
        }

        public float[] kj() {
            return this.kj;
        }

        public long oo() {
            return this.oo;
        }

        public String ork() {
            return this.ork;
        }

        public float qf() {
            return this.qf;
        }

        public float sf() {
            return this.sf;
        }

        public String vj() {
            return this.vj;
        }

        public String vy() {
            return this.vy;
        }

        public float wh() {
            return this.wh;
        }

        public void gm(float f) {
            this.qf = f;
        }

        public void oo(String str) {
            this.vy = str;
        }

        public void sf(long j) {
            this.oo = j;
        }

        public void gm(String str) {
            this.ork = str;
        }

        public void sf(String str) {
            this.vj = str;
        }

        public void sf(float f) {
            this.wh = f;
        }

        public void pcc(long j) {
            this.pcc = j;
        }

        public void pcc(float f) {
            this.sf = f;
        }

        public void pcc(String str) {
            this.gm = str;
        }

        public void pcc(float[] fArr) {
            this.kj = fArr;
        }

        public long pcc() {
            return this.pcc;
        }
    }

    public void sf(long j) {
        this.vj = j;
    }

    public void sf(String str) {
        this.wh = str;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(float f) {
        this.sf = f;
    }

    public void pcc(List<C0028pcc> list) {
        this.gm = list;
    }

    public void pcc(long j) {
        this.oo = j;
    }

    public static pcc pcc(String str, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return pcc(new JSONObject(str), gmVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static pcc pcc(JSONObject jSONObject, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        return pcc(jSONObject, null, gmVar);
    }

    public String pcc() {
        return this.pcc;
    }

    public static double pcc(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
