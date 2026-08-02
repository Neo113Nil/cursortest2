package com.bytedance.sdk.openadsdk.core.ork.sf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.component.reward.gm.kj;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.model.gpj;
import com.bytedance.sdk.openadsdk.core.model.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.zti;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.ork;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.bf3;
import defpackage.swm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    public static String pcc = "https://pag_open_icon_id/appicon.png";
    private static String sf = "";

    private static JSONObject gm(of ofVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            mu.pcc(jSONObject, ofVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject pcc(boolean z, @NonNull of ofVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", ofVar.bgf());
            if (ofVar.zk() != null) {
                if (ofVar.zk() == null || TextUtils.isEmpty(ofVar.zk().pcc())) {
                    jSONObject.put("icon", "");
                } else {
                    jSONObject.put("icon", ofVar.zk().pcc());
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (ofVar.by() != null) {
                for (int i = 0; i < ofVar.by().size(); i++) {
                    lu luVar = ofVar.by().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", luVar.gm());
                    jSONObject2.put("width", luVar.sf());
                    jSONObject2.put("url", luVar.pcc());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", ofVar.ct());
            jSONObject.put("interaction_type", ofVar.az());
            jSONObject.put("interaction_method", ofVar.kz());
            jSONObject.put("is_compliance_template", gm());
            jSONObject.put("title", ofVar.gmh());
            jSONObject.put("description", ofVar.lc());
            jSONObject.put("source", ofVar.ofe());
            JSONObject jSONObject3 = new JSONObject();
            gpj jsj = ofVar.jsj();
            if (jsj == null) {
                jsj = new gpj();
            }
            jSONObject3.put("ceiling_time", jsj.oo());
            jSONObject3.put("ceiling_ratio", jsj.vj());
            jSONObject3.put("expand_ratio", jsj.wh());
            jSONObject.put("interaction_params", jSONObject3);
            if (ofVar.xfm() != null) {
                jSONObject.put("comment_num", ofVar.xfm().vj());
                jSONObject.put("score", ofVar.xfm().oo());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, ofVar.xfm().wh());
                jSONObject.put("app", ofVar.xfm().kj());
            }
            swm kez = ofVar.kez();
            if (kez != null) {
                JSONObject c = kez.c();
                c.put("video_duration", kez.d * kez.r);
                jSONObject.put("video", c);
            }
            if (ofVar.kx() != null) {
                jSONObject.put("dynamic_creative", ofVar.kx().vy());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, String> sf(of ofVar) {
        HashMap hashMap = null;
        if (ofVar == null) {
            return null;
        }
        List<lu> by = ofVar.by();
        if (by != null && by.size() > 0) {
            hashMap = new HashMap();
            for (lu luVar : by) {
                if (luVar != null) {
                    hashMap.put(luVar.pcc(), luVar.qf());
                }
            }
            lu zk = ofVar.zk();
            if (zk != null) {
                hashMap.put(zk.pcc(), zk.qf());
            }
        }
        return hashMap;
    }

    public static boolean gm() {
        return true;
    }

    private static String sf(of.pcc pccVar) {
        com.bytedance.sdk.component.adexpress.pcc.gm.sf gm;
        if (pccVar != null) {
            String qf = pccVar.qf();
            return (!TextUtils.isEmpty(qf) || (gm = com.bytedance.sdk.component.adexpress.pcc.sf.sf.gm(pccVar.oo())) == null) ? qf : gm.vj();
        }
        return "";
    }

    public static JSONObject sf() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", hc.sf());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            mu.sf(jSONObject3);
            jSONObject3.put(L6.H, "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e) {
            lo.gm("TemplateUtils", e.getMessage());
            return jSONObject;
        }
    }

    public static JSONObject pcc(float f, float f2, boolean z, @NonNull of ofVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(L6.H, "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", pcc(false, ofVar));
            jSONObject.put("template_Plugin", sf(ofVar.kx()));
            jSONObject.put("diff_template_Plugin", pcc(ofVar.kx()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject pcc(of ofVar) {
        return pcc(ofVar, false, (JSONObject) null);
    }

    public static JSONObject pcc(of ofVar, boolean z, JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (ofVar == null) {
            return null;
        }
        try {
            jSONObject2 = pcc(ofVar, false, z);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObject3 = new JSONObject();
            mu.sf(jSONObject3);
            jSONObject3.put(L6.H, "android");
            jSONObject2.put("xAppInfo", jSONObject3);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            JSONObject sf2 = mu.sf(ofVar);
            sf2.put("language", hc.sf());
            jSONObject2.put("xSetting", sf2);
            return jSONObject2;
        } catch (Throwable th) {
            th.getMessage();
            return jSONObject2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r2.length() <= r4.gm()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
    
        r4 = r2.optJSONObject(r4.gm());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        r5 = new org.json.JSONObject(r4.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject pcc(of ofVar, boolean z, boolean z2) {
        JSONObject jSONObject = null;
        if (ofVar != null) {
            try {
                String qrz = ofVar.qrz();
                if (qrz != null) {
                    JSONObject jSONObject2 = new JSONObject(qrz);
                    JSONArray optJSONArray = jSONObject2.optJSONArray("creatives");
                    if (!z && !z2) {
                        jSONObject = new JSONObject();
                        if (optJSONArray != null && optJSONArray.length() > 1) {
                            optJSONArray.remove(0);
                            jSONObject.put("xRestCreatives", optJSONArray);
                        }
                        jSONObject2.remove("creatives");
                        jSONObject.put("xRestResponse", jSONObject2);
                    }
                    JSONObject jSONObject3 = null;
                    if (jSONObject3 == null) {
                        return null;
                    }
                    jSONObject = jSONObject3;
                    if (optJSONArray != null) {
                        optJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", optJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th) {
                lo.pcc("TemplateUtils", "filterTemplateInfo", th);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject pcc(float f, float f2, boolean z, of ofVar, String str, com.bytedance.sdk.openadsdk.core.hc.qf.gm gmVar) {
        sf = "";
        if (ofVar == null) {
            return null;
        }
        try {
            JSONObject pcc2 = pcc(f, f2, z, ofVar, str);
            if (gmVar != null) {
                gmVar.pcc("adv3");
            }
            zti uae = ofVar.uae();
            if (uae != null) {
                String oo = uae.oo();
                if (!TextUtils.isEmpty(oo)) {
                    pcc2.put("xTemplate", new JSONObject(oo));
                    sf = "getTemplate success by local data";
                    if (gmVar != null) {
                        gmVar.sf(ServiceProvider.NAMED_LOCAL);
                        return pcc2;
                    }
                } else {
                    String pcc3 = com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc("adv3", uae.pcc(), uae.sf());
                    if (!TextUtils.isEmpty(pcc3)) {
                        pcc2.put("xTemplate", new JSONObject(pcc3));
                        sf = "getTemplate success by db data";
                        if (gmVar != null) {
                            gmVar.sf(ServiceProvider.NAMED_LOCAL);
                            return pcc2;
                        }
                    } else {
                        String str2 = "local db data is null id is " + uae.pcc() + " md5 is " + uae.sf();
                        sf = str2;
                        if (gmVar != null) {
                            gmVar.pcc(3, str2, "net");
                        }
                    }
                }
            }
            return pcc2;
        } catch (Exception e) {
            String j = bf3.j(e, new StringBuilder("load template exception "));
            sf = j;
            if (gmVar != null) {
                gmVar.pcc(3, j, "net");
            }
            return null;
        }
    }

    public static JSONObject pcc(float f, float f2, boolean z, of ofVar, String str) {
        if (ofVar == null) {
            return null;
        }
        try {
            JSONObject pcc2 = pcc(ofVar, true, true);
            if (pcc2 == null) {
                return null;
            }
            try {
                if (!kj.pcc(ofVar)) {
                    pcc(pcc2, ofVar, str);
                }
                JSONObject sf2 = mu.sf(ofVar);
                sf2.put("language", hc.sf());
                pcc2.put("xSetting", sf2);
                pcc2.put("xAdInfo", pcc(str, gm(ofVar), ofVar));
                JSONObject jSONObject = new JSONObject();
                mu.sf(jSONObject);
                jSONObject.put(L6.H, "android");
                pcc2.put("xAppInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", f);
                jSONObject2.put("height", f2);
                if (z) {
                    jSONObject2.put("isLandscape", true);
                }
                pcc2.put("xSize", jSONObject2);
                return pcc2;
            } catch (Throwable unused) {
                return pcc2;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void pcc(JSONObject jSONObject, of ofVar, String str) {
        if (ofVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            swm kez = ofVar.kez();
            if (kez != null) {
                JSONObject c = kez.c();
                c.put("video_duration", kez.d * kez.r);
                jSONObject.put("video", c);
            } else if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("video_duration", com.bytedance.sdk.openadsdk.core.lu.oo().yt(String.valueOf(ofVar.kot())));
                jSONObject.put("video", jSONObject2);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static JSONObject pcc(String str, JSONObject jSONObject, of ofVar) {
        if (ofVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", ork.sf().kj());
                    int vy = ork.sf().vy();
                    if (vy != 0) {
                        int rt = ofVar.rt();
                        if (9 == rt || 11 == rt) {
                            jSONObject2.put("app_icon", pcc);
                        } else if (10 == rt) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(vy)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray optJSONArray = jSONObject2.optJSONArray("keys");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (jSONObject.has(optString)) {
                        jSONObject3.put(optString, jSONObject.opt(optString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String pcc(of.pcc pccVar) {
        if (pccVar != null) {
            return pccVar.kj();
        }
        return "";
    }

    public static String pcc() {
        return sf;
    }

    public static String pcc(of ofVar, String str) {
        List<lu> by;
        if (ofVar != null && (by = ofVar.by()) != null && by.size() > 0) {
            for (lu luVar : by) {
                if (luVar != null && TextUtils.equals(str, luVar.pcc())) {
                    return luVar.qf();
                }
            }
        }
        return null;
    }
}
