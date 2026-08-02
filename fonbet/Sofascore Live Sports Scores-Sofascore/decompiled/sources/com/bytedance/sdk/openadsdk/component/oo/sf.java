package com.bytedance.sdk.openadsdk.component.oo;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.lq;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsx;
import com.ironsource.C4227o2;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static void pcc(of ofVar, int i, lq lqVar) {
        JSONObject jSONObject = new JSONObject();
        long j = 0;
        try {
            jSONObject.put("openad_creative_type", of.vj(ofVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i);
            if (lqVar != null) {
                lqVar.sf(tsx.sf());
                pcc(jSONObject, ofVar);
                jSONObject.put("client_start_time", lqVar.sf());
                jSONObject.put("sever_time", lqVar.oo());
                jSONObject.put("network_time", lqVar.gm());
                jSONObject.put("client_end_time", lqVar.vj());
                jSONObject.put("download_resource_duration", lqVar.qf());
                jSONObject.put("resource_source", lqVar.kj());
                jSONObject.put("is_bidding", lqVar.pcc ? 1 : 0);
                if (lqVar.pcc) {
                    jSONObject.put("load_wait_time", lqVar.sf);
                }
                j = lqVar.wh();
            }
        } catch (JSONException e) {
            lo.pcc("TTAppOpenAdReport", "reportLoadNetDuration json error", e);
        }
        gm.pcc(ofVar, "load_net_duration", j, jSONObject, (JSONObject) null);
    }

    public static void sf(of ofVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", ofVar.kez().c);
            jSONObject.put("video_duration", ofVar.kez().d);
            jSONObject.put(C4227o2.u, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        gm.pcc(ofVar, "download_video_duration", j, jSONObject, (JSONObject) null);
    }

    public static void sf(of ofVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", of.vj(ofVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e) {
            lo.pcc("TTAppOpenAdReport", "reportCacheLoss json error", e);
        }
        gm.gm(ofVar, "cache_loss", jSONObject);
    }

    public static void pcc(of ofVar, int i, int i2, float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            pcc(jSONObject, ofVar);
            jSONObject.put("openad_creative_type", of.vj(ofVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f);
            gm.pcc(jSONObject, i2, i);
        } catch (JSONException e) {
            lo.pcc("TTAppOpenAdReport", "reportSkip json error", e);
        }
        gm.pcc(ofVar, "skip", i, jSONObject, (JSONObject) null);
    }

    public static void pcc(of ofVar, long j, float f, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            pcc(jSONObject, ofVar);
            jSONObject.put("openad_creative_type", of.vj(ofVar) ? "video_normal_ad" : "image_normal_ad");
            if (z) {
                double d = f;
                jSONObject.put("video_duration", d);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d));
            } else {
                jSONObject.put("image_duration", f);
            }
        } catch (JSONException e) {
            lo.pcc("TTAppOpenAdReport", "reportDestroy json error", e);
        }
        gm.gm(ofVar, "destroy", jSONObject);
    }

    public static void pcc(of ofVar) {
        gm.gm(ofVar, "cache_expire", (JSONObject) null);
    }

    public static void pcc(final String str, final int i, final int i2, final boolean z) {
        rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("opencache") { // from class: com.bytedance.sdk.openadsdk.component.oo.sf.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.pcc sf;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = lu.gm().pcc(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (sf = com.bytedance.sdk.openadsdk.core.model.pcc.sf(jSONObject)) == null || !sf.wh()) {
                        return;
                    }
                    sf.pcc(sf.qf(), i, i2, z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void pcc(of ofVar, int i, int i2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cache_lib", i);
            jSONObject.put("cache_replace", z ? 1 : 0);
            jSONObject.put("cache_refresh_scene", i2);
            if (i2 == 0) {
                jSONObject.put("cache_preload", 0);
            } else {
                jSONObject.put("cache_preload", 1);
            }
            jSONObject.put("aoa_cache_count", com.bytedance.sdk.openadsdk.component.qf.pcc.kj());
            gm.pcc(ofVar, "cache_refresh", -1L, (JSONObject) null, jSONObject);
        } catch (JSONException e) {
            lo.pcc("TTAppOpenAdReport", "reportCacheRefresh json error", e);
        }
    }

    public static void pcc(String str, of ofVar, JSONObject jSONObject) {
        gm.pcc(ofVar, str, -1L, (JSONObject) null, jSONObject);
    }

    public static void pcc(String str, String str2, of ofVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("scene", str2);
        } catch (JSONException e) {
            lo.gm("TTAppOpenAdReport", e);
        }
        pcc(str, ofVar, jSONObject);
    }

    public static void pcc(of ofVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C4227o2.u, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        gm.pcc(ofVar, "download_image_duration", j, jSONObject, (JSONObject) null);
    }

    public static void pcc(final int i, final int i2, final lq lqVar) {
        oo.pcc("openad_load_ad_timeout", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.oo.sf.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                lq lqVar2 = lqVar;
                if (lqVar2 != null) {
                    jSONObject.put("start_type", lqVar2.ork() == 1);
                    jSONObject.put("load_index", lqVar.ork());
                }
                jSONObject.put("start_type_backup", com.bytedance.sdk.openadsdk.component.qf.pcc.oo());
                jSONObject.put("app_running_time", com.bytedance.sdk.openadsdk.component.qf.pcc.sf());
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("openad_load_ad_timeout").sf(jSONObject.toString());
            }
        });
    }

    public static void pcc(of ofVar, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            pcc(jSONObject, ofVar);
            jSONObject.put("openad_creative_type", of.vj(ofVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            lo.gm("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        gm.pcc(ofVar, "load_cache_duration", j, jSONObject, (JSONObject) null);
    }

    public static void pcc(final lq lqVar, final int i, final int i2) {
        if (lqVar != null) {
            oo.pcc("app_running_time", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.oo.sf.3
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_running_time", lq.this.vy());
                    jSONObject.put("loaded_app_running_time", com.bytedance.sdk.openadsdk.component.qf.pcc.sf());
                    jSONObject.put("load_time", lq.this.pcc().oo());
                    jSONObject.put("load_from", i);
                    jSONObject.put("load_result", i2);
                    int ork = lq.this.ork();
                    jSONObject.put("load_index", ork);
                    if (ork == 1) {
                        jSONObject.put("init_to_ad_load_time", SystemClock.elapsedRealtime() - jr.gm);
                    }
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("app_running_time").sf(jSONObject.toString());
                }
            });
        }
    }

    private static void pcc(JSONObject jSONObject, of ofVar) {
        int i;
        if (ofVar != null) {
            try {
                if (ofVar.ye()) {
                    i = 1;
                    jSONObject.put("is_icon_only", i);
                }
            } catch (JSONException e) {
                lo.gm("TTAppOpenAdReport", e.getMessage());
                return;
            }
        }
        i = 0;
        jSONObject.put("is_icon_only", i);
    }
}
