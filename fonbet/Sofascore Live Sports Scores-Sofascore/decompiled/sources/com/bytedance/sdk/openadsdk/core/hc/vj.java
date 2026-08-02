package com.bytedance.sdk.openadsdk.core.hc;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.ironsource.L6;
import com.ironsource.U3;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.bf3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private static String pcc = "";

    private static JSONArray gm(of ofVar) {
        try {
            of.pcc kx = ofVar.kx();
            if (kx == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(kx.vy());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt("discount", Double.valueOf(jSONObject.optDouble("discount", 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray optJSONArray = jSONObject.optJSONArray("dpa_images");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                jSONObject2.putOpt("image", optJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", ofVar.bgf());
            JSONArray jSONArray = new JSONArray();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (optJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i);
                        jSONObject3.put("button_text", ofVar.bgf());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static JSONObject pcc(of ofVar, com.bytedance.sdk.openadsdk.core.hc.qf.gm gmVar) {
        of.pcc kx;
        JSONObject jSONObject;
        gmVar.pcc("ad");
        String str = "";
        pcc = "";
        ?? r4 = 0;
        try {
            kx = ofVar.kx();
            if (kx != null) {
                str = kx.jr();
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(kx.gbb()) && !TextUtils.isEmpty(kx.oo())) {
                    str = com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc("ad", kx.oo(), kx.gbb());
                }
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                String str2 = "local data is null id is " + kx.oo() + " md5 is " + kx.gbb();
                pcc = str2;
                gmVar.pcc(3, str2, "net");
                return null;
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
            try {
                pcc = "getTemplate success";
                gmVar.sf(ServiceProvider.NAMED_LOCAL);
                return jSONObject;
            } catch (JSONException unused2) {
                String concat = "parse json exception data is ".concat(String.valueOf(str));
                pcc = concat;
                gmVar.pcc(2, concat, ServiceProvider.NAMED_LOCAL);
                return null;
            }
        } catch (Throwable th2) {
            r4 = kx;
            th = th2;
            String o = bf3.o(new StringBuilder("get template error "), th);
            pcc = o;
            gmVar.pcc(2, o, ServiceProvider.NAMED_LOCAL);
            return r4;
        }
    }

    public static boolean sf(of ofVar) {
        return ofVar != null && ofVar.rt() == 10;
    }

    public static JSONObject pcc(of ofVar, String str) {
        JSONObject hc = ofVar.hc(false);
        try {
            hc.put("show_dislike", ofVar.dk());
            hc.put("language", hc.sf());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String kj = ork.sf().kj();
                int vy = ork.sf().vy();
                jSONObject.put("app_name", kj);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(vy)));
                hc.put("open_app_info", jSONObject);
            }
            hc.put(L6.F, U3.d);
            JSONArray gm = gm(ofVar);
            if (gm != null) {
                hc.put("dpa_data", gm);
            }
            return hc;
        } catch (Throwable th) {
            lo.gm("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
            return hc;
        }
    }

    public static boolean pcc(of ofVar) {
        return ofVar != null && ofVar.rt() == 7;
    }

    public static String pcc() {
        return pcc;
    }

    public static boolean pcc(int i) {
        return i == 10 || i == 9 || i == 11;
    }
}
