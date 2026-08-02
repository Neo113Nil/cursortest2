package com.bytedance.sdk.openadsdk.oo;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.zti;
import com.bytedance.sdk.openadsdk.oo.pcc;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsx;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    public static void gm(final of ofVar, String str) {
        if (ofVar == null || !of.gm(ofVar) || ofVar.nn() == null) {
            return;
        }
        pcc(System.currentTimeMillis(), ofVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.25
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", of.this.nn().gm());
                    jSONObject.putOpt("id", of.this.nn().pcc());
                    jSONObject.putOpt("md5", of.this.nn().sf());
                    if (of.this.kez() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(of.this.kez().l));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void oo(final of ofVar, final String str, final int i) {
        pcc(System.currentTimeMillis(), ofVar, str, "material_status", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.13
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i);
                    jSONObject.put("image_mode", ofVar.ct());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(final com.bytedance.sdk.openadsdk.dax.pcc.sf sfVar) {
        if (sfVar == null || sfVar.sf() == null) {
            return;
        }
        final of sf = sfVar.sf();
        final int az = sf.az();
        if (az == 2 || az == 8 || (kun.oo(sf) && sf.pcc.oo.equals(sfVar.pcc()))) {
            pcc(System.currentTimeMillis(), sf, sfVar.gm(), "open_browser", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.41
                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject gm() {
                    JSONArray optJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int oo = com.bytedance.sdk.openadsdk.dax.pcc.sf.this.oo();
                        jSONObject.put("count", kun.ork(com.bytedance.sdk.openadsdk.core.lu.pcc()));
                        jSONObject.put("interceptor", oo);
                        jSONObject.put("success", com.bytedance.sdk.openadsdk.dax.pcc.sf.this.vj());
                        jSONObject.put("link", com.bytedance.sdk.openadsdk.dax.pcc.sf.this.pcc());
                        jSONObject.put("interaction_type", az);
                        jSONObject.put("real_interaction_type", com.bytedance.sdk.openadsdk.dax.pcc.sf.this.qf());
                        if (com.bytedance.sdk.openadsdk.dax.pcc.sf.this.oo() == 9) {
                            jSONObject.put("is_act_signals_api_available", com.bytedance.sdk.openadsdk.dax.pcc.sf.this.kj());
                            jSONObject.put("is_act_signals_callback", com.bytedance.sdk.openadsdk.dax.pcc.sf.this.vy());
                        }
                        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.dax.pcc.sf.this.wh())) {
                            jSONObject.put("exception_msg", com.bytedance.sdk.openadsdk.dax.pcc.sf.this.wh());
                        }
                        if (oo == 2 || oo == 5) {
                            String qrz = sf.qrz();
                            if (!TextUtils.isEmpty(qrz) && (optJSONArray = new JSONObject(qrz).optJSONArray("creatives")) != null && optJSONArray.length() > 0) {
                                jSONObject.put("meta", optJSONArray.optJSONObject(sf.gm()));
                            }
                        }
                        return jSONObject;
                    } catch (Throwable th) {
                        th.getMessage();
                        return jSONObject;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject sf(of ofVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (atb.sf(ofVar) && ofVar.yir()) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        pcc(jSONObject);
        sf(jSONObject);
        return jSONObject;
    }

    public static void vj(of ofVar, final com.bytedance.sdk.openadsdk.dax.pcc.pcc pccVar, final String str) {
        pcc(System.currentTimeMillis(), ofVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.30
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.gm());
                    jSONObject.put("current_url_index", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.oo());
                    jSONObject.put("arbi_start_x", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.vj());
                    jSONObject.put("arbi_start_y", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.wh());
                    jSONObject.put("click_duration", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.qf());
                    jSONObject.put("is_trigger_jump", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.kj());
                    jSONObject.put("click_type", String.valueOf(com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.gpj()));
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                try {
                    com.bytedance.sdk.openadsdk.dax.pcc.pcc pccVar2 = com.bytedance.sdk.openadsdk.dax.pcc.pcc.this;
                    if (pccVar2 == null || pccVar2.pcc() == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.pcc());
                    jSONObject.put("hit_extra", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.sf());
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void wh(of ofVar, String str, final JSONObject jSONObject) {
        pcc(System.currentTimeMillis(), ofVar, str, "click_playable_button", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.47
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                return jSONObject;
            }
        });
    }

    public static void oo(of ofVar, final com.bytedance.sdk.openadsdk.dax.pcc.pcc pccVar, final String str) {
        pcc(System.currentTimeMillis(), ofVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.29
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.gm());
                    jSONObject.put("current_url_index", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.oo());
                    jSONObject.put("trigger_scroll_x", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.vy());
                    jSONObject.put("trigger_scroll_y", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.ork());
                    jSONObject.put("arbi_offset_y", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.vh());
                    jSONObject.put("scroll_type", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.tmg());
                    jSONObject.put("scroll_duration", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.hc());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void vj(of ofVar, String str, final JSONObject jSONObject) {
        pcc(System.currentTimeMillis(), ofVar, str, "click_next_ad_button", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.46
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                return jSONObject;
            }
        });
    }

    public static void oo(of ofVar, String str, final JSONObject jSONObject) {
        pcc(System.currentTimeMillis(), ofVar, str, "show_next_ad_hint", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.45
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                return jSONObject;
            }
        });
    }

    public static void gm(of ofVar, String str, int i) {
        pcc(ofVar, str, i, (String) null);
    }

    public static void gm(of ofVar, String str, final long j) {
        pcc(System.currentTimeMillis(), ofVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.6
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable th) {
                    th.getMessage();
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    public static void gm(of ofVar, final com.bytedance.sdk.openadsdk.dax.pcc.pcc pccVar, final String str) {
        pcc(System.currentTimeMillis(), ofVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.28
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.gm());
                    jSONObject.put("current_url_index", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.oo());
                    jSONObject.put("arbi_stay_duration", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.gbb());
                    jSONObject.put("browsing_percentage", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.jr());
                    jSONObject.put("out_focus_scene", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.dax());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public static void pcc(final int i, final int i2, final int i3, final int i4, final of ofVar, String str, final int i5) {
            if (str == null || TextUtils.isEmpty(ofVar.cz())) {
                return;
            }
            gm.pcc(System.currentTimeMillis(), ofVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.pcc.4
                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject gm() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", of.this.xy());
                        jSONObject.put("channel_name", of.this.cz());
                        jSONObject.put("preload_status", i <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i5);
                        jSONObject.put("preload_h5_type", of.this.tsx());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i);
                        jSONObject2.put("failResourceCount", i2);
                        jSONObject2.put("successCount", i3);
                        jSONObject2.put("failCount", i4);
                        jSONObject.put("resource_info", jSONObject2);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }

        public static void pcc(final int i, final int i2, of ofVar) {
            String pcc = kun.pcc(ofVar);
            if (pcc == null) {
                return;
            }
            gm.pcc(System.currentTimeMillis(), ofVar, pcc.concat("_landingpage"), "local_res_hit_rate", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.pcc.2
                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject gm() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i2);
                        jSONObject.put("hit_times", i);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }

        public static void pcc(final long j, final of ofVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            gm.pcc(System.currentTimeMillis(), ofVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.pcc.3
                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject gm() {
                    int pcc;
                    int i;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        pcc = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(iLoader, str2);
                        jSONObject.put("url", ofVar.xy());
                        jSONObject.put("channel_name", ofVar.cz());
                    } catch (Throwable unused) {
                    }
                    if (!TextUtils.isEmpty(ofVar.cz()) && pcc > 0) {
                        i = 1;
                        jSONObject.put("interceptor_status", i);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", pcc);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    }
                    i = 0;
                    jSONObject.put("interceptor_status", i);
                    JSONObject jSONObject22 = new JSONObject();
                    jSONObject22.put("resource_count", pcc);
                    jSONObject.put("resource_info", jSONObject22);
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject pcc() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(of.sf, ofVar.zpi() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject sf() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }

        public static void pcc(String str, final JSONObject jSONObject, of ofVar) {
            String pcc = kun.pcc(ofVar);
            if (pcc == null) {
                return;
            }
            gm.pcc(System.currentTimeMillis(), ofVar, pcc.concat("_landingpage"), str, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.pcc.1
                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject gm() {
                    return jSONObject;
                }
            });
        }
    }

    public static void gm(of ofVar, String str, String str2, final JSONObject jSONObject) {
        if (ofVar == null || jSONObject == null) {
            return;
        }
        pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.35
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                return jSONObject;
            }
        });
    }

    public static void gm(of ofVar, String str, JSONObject jSONObject) {
        if (ofVar == null) {
            return;
        }
        pcc(ofVar, str, -1L, jSONObject, (JSONObject) null);
    }

    private static void sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject pcc2 = kj.pcc();
            if (pcc2 != null) {
                Iterator<String> keys = pcc2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, pcc2.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void sf(of ofVar, String str, final long j) {
        if (ofVar != null && j > 0 && j < 200000) {
            pcc(System.currentTimeMillis(), ofVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.3
                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject gm() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void sf(of ofVar, String str, final int i) {
        pcc(System.currentTimeMillis(), ofVar, str, "check_meta", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.7
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.vh.sf().tz());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void sf(final of ofVar, String str) {
        pcc(System.currentTimeMillis(), ofVar, str, "picture_click", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.14
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", of.this.hh());
                    jSONObject.put("interaction_method", of.this.kz());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void sf(of ofVar, String str, String str2, final JSONObject jSONObject) {
        pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.18
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                return jSONObject;
            }
        });
    }

    public static void sf(final long j, final of ofVar, String str, final String str2) {
        pcc(System.currentTimeMillis(), ofVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.24
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (of.gm(ofVar)) {
                        if (ofVar.nn() != null) {
                            jSONObject.putOpt("url", ofVar.nn().gm());
                            jSONObject.putOpt("id", ofVar.nn().pcc());
                            jSONObject.putOpt("md5", ofVar.nn().sf());
                        }
                        jSONObject.putOpt("from", str2);
                        if (ofVar.kez() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.put("url", ofVar.kez().h);
                        jSONObject.put("style_id", ofVar.pq());
                        if (ofVar.kez() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    return jSONObject;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject;
                }
            }
        });
    }

    public static void sf(of ofVar, final com.bytedance.sdk.openadsdk.dax.pcc.pcc pccVar, final String str) {
        pcc(System.currentTimeMillis(), ofVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.27
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.gm());
                    jSONObject.put("current_url_index", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.oo());
                    jSONObject.put("arbi_load_duration", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.lu());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void sf(of ofVar, String str, String str2, final JSONObject jSONObject, final long j) {
        if (ofVar == null || jSONObject == null) {
            return;
        }
        pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.34
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void sf(of ofVar, String str, final JSONObject jSONObject) {
        pcc(System.currentTimeMillis(), ofVar, str, sf.wh, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.37
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                return jSONObject;
            }
        });
    }

    public static void sf(of ofVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        pcc(ofVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    public static void sf(of ofVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        sf(ofVar, str, "download_app_ad_track", jSONObject);
    }

    public static void pcc() {
        try {
            Class.forName(gm.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void pcc(of ofVar, String str, final int i) {
        pcc(System.currentTimeMillis(), ofVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(final of ofVar, String str) {
        pcc(System.currentTimeMillis(), ofVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.12
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (of.gm(of.this)) {
                        if (of.this.nn() != null) {
                            jSONObject.putOpt("url", of.this.nn().gm());
                            jSONObject.putOpt("id", of.this.nn().pcc());
                            jSONObject.putOpt("md5", of.this.nn().sf());
                        }
                        if (of.this.kez() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", of.this.kez().h);
                        jSONObject.putOpt("style_id", of.this.pq());
                        if (of.this.kez() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject;
                }
            }
        });
    }

    public static void pcc(final of ofVar, String str, final long j) {
        pcc(System.currentTimeMillis(), ofVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.23
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (of.gm(of.this)) {
                        if (of.this.nn() != null) {
                            jSONObject.putOpt("url", of.this.nn().gm());
                            jSONObject.putOpt("id", of.this.nn().pcc());
                            jSONObject.putOpt("md5", of.this.nn().sf());
                        }
                        if (of.this.kez() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", of.this.kez().h);
                        jSONObject.putOpt("style_id", of.this.pq());
                        if (of.this.kez() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(final of ofVar, String str, final long j, final int i, final String str2, final String str3) {
        pcc(System.currentTimeMillis(), ofVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.33
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (of.gm(of.this)) {
                        if (of.this.nn() != null) {
                            jSONObject.putOpt("url", of.this.nn().gm());
                            jSONObject.putOpt("id", of.this.nn().pcc());
                            jSONObject.putOpt("md5", of.this.nn().sf());
                        }
                        if (of.this.kez() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", of.this.kez().h);
                        jSONObject.putOpt("style_id", of.this.pq());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (of.this.kez() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_msg", str2);
                    return jSONObject;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(final of ofVar, String str, final long j, final int i, final int i2) {
        pcc(System.currentTimeMillis(), ofVar, str, "load", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.44
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(ofVar.kz()));
                    jSONObject.put("first_page", i2);
                    jSONObject.put("preload_h5_type", ofVar.tsx());
                    int i3 = i;
                    if (i3 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i3));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(String str, of ofVar, String str2, final Map<String, Object> map) {
        pcc(System.currentTimeMillis(), ofVar, str2, str, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.48
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                try {
                    if (map == null) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @DungeonFlag
    public static void pcc(of ofVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        pcc(ofVar, "show", str, jSONObject, jSONObject2);
    }

    @DungeonFlag
    private static void pcc(final of ofVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (ofVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (ofVar.iv() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            ofVar.ork(true);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        pcc(new com.bytedance.sdk.component.kj.sf.gm("onShow") { // from class: com.bytedance.sdk.openadsdk.oo.gm.49
            @Override // java.lang.Runnable
            public void run() {
                final String str3;
                if (com.bytedance.sdk.openadsdk.core.lu.oo().lu()) {
                    str3 = com.bytedance.sdk.openadsdk.core.tmg.pcc.pcc.pcc((Application) com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(str2, DeviceUtils.pcc(), ofVar.kot());
                } else {
                    str3 = "none";
                }
                gm.pcc(currentTimeMillis, ofVar, str2, str, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.49.1
                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject gm() {
                        try {
                            AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                jSONObject3.put("interaction_method", ofVar.kz());
                                AnonymousClass49 anonymousClass492 = AnonymousClass49.this;
                                jSONObject.put("real_interaction_method", ofVar.bg());
                                jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.lu.oo().gbb(String.valueOf(ofVar.kot())));
                                jSONObject.put("au_show", str3);
                                return jSONObject;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", ofVar.kz());
                            jSONObject4.put("real_interaction_method", ofVar.bg());
                            jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.lu.oo().gbb(String.valueOf(ofVar.kot())));
                            jSONObject4.put("au_show", str3);
                            return jSONObject4;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject pcc() {
                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                        JSONObject jSONObject3 = jSONObject2;
                        return jSONObject3 == null ? gm.sf(ofVar, new JSONObject()) : gm.sf(ofVar, jSONObject3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject sf() {
                        Object obj;
                        Object obj2;
                        try {
                            mk.sf(ofVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", ofVar.hl());
                                float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - ofVar.wc()).floatValue();
                                if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    floatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(floatValue));
                                long elapsedRealtime = SystemClock.elapsedRealtime() - ofVar.vy();
                                if (elapsedRealtime > 0) {
                                    jSONObject3.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                                }
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(ofVar.bxz()));
                                String wax = ofVar.wax();
                                if (!TextUtils.isEmpty(wax) && !TextUtils.isEmpty(wax)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(wax) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        th.getMessage();
                                    }
                                }
                                if (ofVar.oa() == null || (obj = ofVar.oa().get(TTAdConstant.SDK_BIDDING_TYPE)) == null || Integer.parseInt(obj.toString()) != 2 || (obj2 = ofVar.oa().get("price")) == null) {
                                    return jSONObject3;
                                }
                                jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj2.toString()) * 100000.0d));
                                return jSONObject3;
                            } catch (Throwable unused) {
                                return jSONObject3;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                });
                if ("show".equals(str)) {
                    if (!ofVar.iwd()) {
                        boolean nmd = ofVar.nmd();
                        of ofVar2 = ofVar;
                        if (nmd) {
                            com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(ofVar2.eko(), new gm.sf("show_urls", ofVar));
                        } else {
                            gm.pcc(ofVar2);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int optInt = jSONObject3.optInt("dynamic_show_type");
                        if (ofVar.lrr() == 1 && (optInt == 7 || optInt == 10)) {
                            com.bytedance.sdk.component.utils.vy.pcc().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gm.49.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                                        gm.sf(ofVar, str2, "click", jSONObject4);
                                    } catch (Exception unused) {
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.vh.sf().fvk());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(ofVar, str3);
                }
            }
        });
    }

    private static void pcc(JSONObject jSONObject) {
        try {
            jSONObject.put("screen_scale", rj.wh(com.bytedance.sdk.openadsdk.core.lu.pcc()));
        } catch (Throwable unused) {
        }
    }

    public static void pcc(of ofVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.hc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc(ofVar.eko(), true), 1, ofVar.esn());
    }

    @DungeonFlag
    public static void pcc(final String str, final of ofVar, final String str2, final qf qfVar) {
        if (ofVar == null || qfVar == null || !qfVar.pcc()) {
            return;
        }
        pcc(System.currentTimeMillis(), ofVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.50
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                try {
                    qf qfVar2 = qfVar;
                    if (qfVar2 == null || qfVar2.sf() == null) {
                        return null;
                    }
                    JSONObject sf = qfVar.sf();
                    if (str2.equals("open_ad")) {
                        sf.put("is_icon_only", ofVar.ye() ? 1 : 0);
                    }
                    return sf;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(final of ofVar, final String str, final tsx tsxVar) {
        if (ofVar == null) {
            return;
        }
        final long oo = tsxVar.oo();
        pcc(System.currentTimeMillis(), ofVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.2
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", oo);
                    jSONObject.put("click_time", tsxVar.pcc);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", ofVar.ye() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(of ofVar, final String str, final int i, final String str2, final long j, final boolean z, final int i2, final long j2) {
        pcc(System.currentTimeMillis(), ofVar, str, sf.oo, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.4
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j);
                    jSONObject.put("arbi_trigger_start", z);
                    jSONObject.put("arbi_convert_count", i2);
                    jSONObject.put("loading_start_timestamp", j2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(of ofVar, String str, final long j, final boolean z) {
        pcc(System.currentTimeMillis(), ofVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.5
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z ? 1 : 2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(of ofVar, String str, final int i, final String str2) {
        if (i == 200) {
            return;
        }
        pcc(System.currentTimeMillis(), ofVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.8
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.vh.sf().tz());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                try {
                    if (str2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("extra", str2);
                        return jSONObject;
                    }
                } catch (Throwable unused) {
                }
                return super.pcc();
            }
        });
    }

    public static void pcc(of ofVar, String str, final int i, final String str2, final int i2) {
        pcc(System.currentTimeMillis(), ofVar, str, sf.pcc, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.9
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(of ofVar, final String str, final int i, final String str2, final float f) {
        pcc(System.currentTimeMillis(), ofVar, str, sf.sf, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.10
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(of ofVar, final String str, final int i, final String str2, final String str3, final int i2) {
        pcc(System.currentTimeMillis(), ofVar, str, sf.gm, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.11
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("load_url", str3);
                    jSONObject.put("url_flag", i2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void pcc(final String str, final of ofVar, final com.bytedance.sdk.openadsdk.core.model.tmg tmgVar, final String str2, final boolean z, final Map<String, Object> map, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        pcc(new com.bytedance.sdk.component.kj.sf.gm("onClick") { // from class: com.bytedance.sdk.openadsdk.oo.gm.15
            @Override // java.lang.Runnable
            public void run() {
                of ofVar2 = ofVar;
                if (ofVar2 == null) {
                    return;
                }
                gm.pcc(currentTimeMillis, ofVar2, str2, str, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.15.1
                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject sf() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.tmg tmgVar2 = tmgVar;
                            if (tmgVar2 != null) {
                                JSONObject pcc2 = tmgVar2.pcc();
                                pcc2.put("is_valid", z);
                                int i2 = i;
                                if (i2 > 0 && i2 <= 2) {
                                    pcc2.put("user_behavior_type", i2);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey(IronSourceConstants.EVENTS_DURATION)) {
                                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, map.get(IronSourceConstants.EVENTS_DURATION));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!IronSourceConstants.EVENTS_DURATION.equals(entry.getKey())) {
                                            pcc2.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                pcc2.put("interaction_method", ofVar.kz());
                                if (str2.equals("open_ad")) {
                                    pcc2.put("is_icon_only", ofVar.ye() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", pcc2.toString());
                            }
                            jSONObject.putOpt("log_extra", ofVar.hl());
                            float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - ofVar.wc()).floatValue();
                            if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                floatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(floatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(ofVar.bxz()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.hc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc())) && "click".equals(str)) {
                    com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc(ofVar.oyx(), true), 2, ofVar.esn());
                }
                if ("click".equals(str)) {
                    mk.gm(ofVar);
                }
            }
        });
    }

    public static void pcc(of ofVar, String str, String str2, final JSONObject jSONObject) {
        pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.16
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!jSONObject.has(IronSourceConstants.EVENTS_DURATION)) {
                        return jSONObject2;
                    }
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, jSONObject.get(IronSourceConstants.EVENTS_DURATION));
                    return jSONObject2;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject2;
                }
            }
        });
        if ("click".equals(str2)) {
            mk.gm(ofVar);
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.hc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()))) {
                return;
            }
            com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc(ofVar.oyx(), true), 2, ofVar.esn());
        }
    }

    public static void pcc(of ofVar, String str, final String str2, final long j, final int i, JSONObject jSONObject, final qf qfVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.17
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                qf qfVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (qfVar2 = qfVar) != null) {
                        qfVar2.pcc(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject3.put("percent", i);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void pcc(of ofVar, String str, String str2, final JSONObject jSONObject, final long j) {
        pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.19
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void pcc(final of ofVar, String str, String str2, final Map<String, Object> map) {
        pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.20
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", ofVar.fg());
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get(IronSourceConstants.EVENTS_DURATION);
                        if (obj instanceof Long) {
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void pcc(long j, of ofVar, String str, String str2) {
        pcc(j, ofVar, str, str2, (com.bytedance.sdk.openadsdk.dax.sf.sf) null);
    }

    @DungeonFlag
    public static void pcc(final long j, final of ofVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.dax.sf.sf sfVar) {
        if (ofVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || pcc(ofVar.zsj(), str2)) {
            return;
        }
        pcc(new com.bytedance.sdk.component.kj.sf.gm(str2) { // from class: com.bytedance.sdk.openadsdk.oo.gm.21
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.dax.sf.sf sfVar2 = sfVar;
                    if (sfVar2 != null) {
                        jSONObject = sfVar2.sf();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    com.bytedance.sdk.openadsdk.dax.sf.sf sfVar3 = sfVar;
                    if (sfVar3 != null) {
                        JSONObject pcc2 = sfVar3.pcc();
                        JSONObject gm = sfVar.gm();
                        if (pcc2 != null) {
                            if (gm == null) {
                                gm = new JSONObject();
                            }
                            of ofVar2 = ofVar;
                            if (ofVar2 != null) {
                                pcc2.put("render_sequence", ofVar2.rt());
                            }
                            if (com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.sf()) {
                                pcc2.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.pcc()));
                            }
                            gm.put("pag_json_data", pcc2.toString());
                            jSONObject.put("ad_extra_data", gm.toString());
                        } else if (gm != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            of ofVar3 = ofVar;
                            if (ofVar3 != null) {
                                jSONObject2.put("render_sequence", ofVar3.rt());
                            }
                            if (com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.sf()) {
                                jSONObject2.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.pcc()));
                            }
                            gm.put("pag_json_data", jSONObject2.toString());
                            jSONObject.put("ad_extra_data", gm.toString());
                        } else {
                            String optString = jSONObject.optString("ad_extra_data");
                            JSONObject jSONObject3 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
                            String optString2 = jSONObject3.optString("pag_json_data");
                            JSONObject jSONObject4 = TextUtils.isEmpty(optString2) ? new JSONObject() : new JSONObject(optString2);
                            if (com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.sf()) {
                                jSONObject4.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.pcc()));
                            }
                            jSONObject3.putOpt("pag_json_data", jSONObject4.toString());
                            jSONObject.putOpt("ad_extra_data", jSONObject3.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", ofVar.hl());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(ofVar.bxz()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new pcc.C0117pcc(j, ofVar).sf(str).gm(str2).vj(ofVar.esn()).kj(ofVar.hpk()).pcc(ofVar.bq()).pcc(ofVar.go()).pcc(jSONObject).qf(ofVar.qxv()).pcc((com.bytedance.sdk.openadsdk.oo.sf.pcc) null);
            }
        });
    }

    public static void pcc(of ofVar, String str, final String str2, final int i) {
        pcc(System.currentTimeMillis(), ofVar, str, "playable_track", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.22
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", i);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(of ofVar, final com.bytedance.sdk.openadsdk.dax.pcc.pcc pccVar, final String str) {
        pcc(System.currentTimeMillis(), ofVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.26
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.gm());
                    jSONObject.put("keyword", com.bytedance.sdk.openadsdk.dax.pcc.pcc.this.nac());
                } catch (Throwable th) {
                    th.getMessage();
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(final long j, final of ofVar, String str) {
        if (ofVar == null || !of.gm(ofVar) || ofVar.nn() == null) {
            return;
        }
        pcc(System.currentTimeMillis(), ofVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.31
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", ofVar.nn().gm());
                    jSONObject.putOpt("id", ofVar.nn().pcc());
                    jSONObject.putOpt("md5", ofVar.nn().sf());
                    if (ofVar.kez() == null) {
                        return jSONObject;
                    }
                    jSONObject.putOpt("render_type", Integer.valueOf(ofVar.kez().l));
                    return jSONObject;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    return jSONObject;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject;
                }
            }
        });
    }

    public static void pcc(of ofVar, String str, String str2, final long j, final JSONObject jSONObject) {
        if (ofVar == null || jSONObject == null) {
            return;
        }
        pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.32
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j);
                    return jSONObject2;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject2;
                }
            }
        });
    }

    public static void pcc(of ofVar, String str, final JSONObject jSONObject) {
        pcc(System.currentTimeMillis(), ofVar, str, sf.vj, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.36
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                return jSONObject;
            }
        });
    }

    public static void pcc(String str, long j) {
        com.bytedance.sdk.openadsdk.core.vy.gm.pcc(str, j);
    }

    @DungeonFlag
    public static void pcc(final of ofVar, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject, final boolean z) {
        if (ofVar == null || pcc(ofVar.zsj(), str3)) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        pcc(new com.bytedance.sdk.component.kj.sf.gm("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.oo.gm.38
            @Override // java.lang.Runnable
            public void run() {
                JSONArray optJSONArray;
                String bq = ofVar.bq();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String optString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(optString)) {
                            jSONObject2 = new JSONObject(optString);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put(U3.i.G, DeviceUtils.qf(com.bytedance.sdk.openadsdk.core.lu.pcc()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z) {
                                jSONObject2.put("click_scence", 1);
                            } else if (atb.sf(ofVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (ofVar.yir()) {
                            try {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (optJSONObject == null) {
                                    optJSONObject = new JSONObject();
                                }
                                optJSONObject.put("is_new_playable", 1);
                                if (ofVar.afj()) {
                                    optJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", optJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                        if (optJSONObject2 == null) {
                            optJSONObject2 = new JSONObject();
                        }
                        optJSONObject2.put("render_sequence", ofVar.rt());
                        if (com.bytedance.sdk.openadsdk.gbb.gm.gm(ofVar)) {
                            optJSONObject2.put("is_lp_pre_render", ofVar.ss() ? 1 : 0);
                        }
                        if (com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.sf()) {
                            optJSONObject2.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.pcc()));
                        }
                        jSONObject2.put("pag_json_data", optJSONObject2.toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int optInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z && optInt == 2) {
                            bq = jSONObject2.optString("app_log_url");
                        }
                        int i = 0;
                        if ("click".equals(str3)) {
                            mk.gm(ofVar);
                            float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - of.sf(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                floatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(floatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.hc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()))) {
                                if (z && optInt == 2) {
                                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (optJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i < optJSONArray2.length()) {
                                            arrayList.add(optJSONArray2.optString(i));
                                            i++;
                                        }
                                        com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc((List<String>) arrayList, true), 2, String.valueOf(j));
                                    }
                                } else {
                                    of ofVar2 = ofVar;
                                    if (ofVar2 != null) {
                                        com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc(ofVar2.oyx(), true), 2, ofVar.esn());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.hc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc())) && z && optInt == 2 && (optJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i < optJSONArray.length()) {
                                arrayList2.add(optJSONArray.optString(i));
                                i++;
                            }
                            com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc((List<String>) arrayList2, true), 1, String.valueOf(j));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new pcc.C0117pcc(currentTimeMillis, ofVar).oo(str).sf(str2).gm(str3).vj(String.valueOf(j)).wh(String.valueOf(j2)).pcc(bq).pcc(ofVar.go()).pcc(jSONObject).kj(ofVar.hpk()).qf(ofVar.qxv()).pcc((com.bytedance.sdk.openadsdk.oo.sf.pcc) null);
            }
        });
    }

    public static void pcc(final of ofVar, String str, final long j, final JSONObject jSONObject, final JSONObject jSONObject2) {
        pcc(System.currentTimeMillis(), ofVar, "open_ad", str, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.39
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                try {
                    JSONObject jSONObject3 = jSONObject;
                    return jSONObject3 != null ? jSONObject3 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                try {
                    of ofVar2 = ofVar;
                    if (ofVar2 != null) {
                        int ork = ofVar2.ork();
                        jSONObject3.putOpt("start_type", Integer.valueOf(ork == 1 ? 1 : 2));
                        jSONObject3.putOpt("load_index", Integer.valueOf(ork));
                        if (ork == 1) {
                            jSONObject3.putOpt("init_to_ad_load_time", Long.valueOf(SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.core.jr.gm));
                        }
                    }
                    jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.qf.pcc.oo()));
                    jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.qf.pcc.sf()));
                    return jSONObject3;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject3;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 == -1) {
                        return jSONObject3;
                    }
                    jSONObject3.put(IronSourceConstants.EVENTS_DURATION, j2);
                    return jSONObject3;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject3;
                }
            }
        });
    }

    public static void pcc(final com.bytedance.sdk.component.kj.sf.gm gmVar) {
        if (gmVar == null) {
            return;
        }
        if (rnn.wh()) {
            com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gm.40
                @Override // java.lang.Runnable
                public void run() {
                    rnn.sf(com.bytedance.sdk.component.kj.sf.gm.this, 10);
                }
            });
        } else if (!rnn.qf()) {
            rnn.sf(gmVar, 10);
        } else {
            gmVar.run();
        }
    }

    public static void pcc(JSONObject jSONObject, int i, int i2) {
        try {
            jSONObject.put("skip_show_time", i);
            jSONObject.put("skip_time", i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i2 - (i * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public static void pcc(of ofVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        sf(ofVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void pcc(of ofVar, String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i, final Map<String, Object> map) {
        pcc(System.currentTimeMillis(), ofVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.42
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z);
                    jSONObject.put("force", z2);
                    jSONObject.put("isFromLandingPage", z3);
                    jSONObject.put("finishing", z4);
                    jSONObject.put("from", i);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(final of ofVar, final boolean z, String str, final String str2, final long j, final String str3, final String str4, final int i, final String str5) {
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        pcc(System.currentTimeMillis(), ofVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.gm.43
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                of.pcc kx;
                zti uae;
                JSONObject jSONObject = new JSONObject();
                try {
                    String str6 = str4;
                    int hashCode = str6.hashCode();
                    if (hashCode != -1606803861) {
                        if (hashCode != 3107) {
                            if (hashCode == 2989536 && str6.equals("adv3") && (uae = ofVar.uae()) != null) {
                                jSONObject.putOpt("url", uae.gm());
                                jSONObject.putOpt("id", uae.pcc());
                                jSONObject.putOpt("md5", uae.sf());
                            }
                        } else if (str6.equals("ad") && (kx = ofVar.kx()) != null) {
                            jSONObject.putOpt("url", kx.hc());
                            jSONObject.putOpt("id", kx.oo());
                            jSONObject.putOpt("md5", kx.gbb());
                        }
                    } else if (str6.equals(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
                        boolean z2 = z;
                        of ofVar2 = ofVar;
                        if (z2) {
                            com.bytedance.sdk.openadsdk.core.hc.kj.pcc rnn = ofVar2.rnn();
                            if (rnn != null) {
                                jSONObject.putOpt("url", rnn.gm());
                                jSONObject.putOpt("id", rnn.pcc());
                                jSONObject.putOpt("md5", rnn.sf());
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.core.hc.kj.pcc nn = ofVar2.nn();
                            if (nn != null) {
                                jSONObject.putOpt("url", nn.gm());
                                jSONObject.putOpt("id", nn.pcc());
                                jSONObject.putOpt("md5", nn.sf());
                            }
                        }
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put("from", str3);
                    jSONObject.put("ugen_scene", str4);
                    if (U3.g.e.equals(str2)) {
                        jSONObject.put("error_code", i);
                        jSONObject.put("error_msg", str5);
                        return jSONObject;
                    }
                } catch (Throwable th) {
                    try {
                        jSONObject.put("error_code", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                        jSONObject.put("error_msg", "send template error " + th.getMessage());
                    } catch (Throwable unused) {
                    }
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static boolean pcc(int i, String str) {
        int sf;
        try {
            Set<String> vo = com.bytedance.sdk.openadsdk.core.settings.vh.sf().vo();
            if ((i == 1 && vo != null && vo.contains(str)) || (sf = com.bytedance.sdk.openadsdk.core.settings.vh.sf().sf(str)) == 0) {
                return true;
            }
            if (sf != 100) {
                if (((int) ((Math.random() * 100.0d) + 1.0d)) > sf) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public static JSONObject pcc(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
