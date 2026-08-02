package com.bytedance.sdk.openadsdk.component.oo;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.dax.pcc.gm;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.ironsource.U3;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static void pcc() {
        Map<String, ?> all;
        if (com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc()) {
            try {
                SharedPreferences pcc = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(lu.pcc(), "abnormal_close_file");
                if (pcc != null && (all = pcc.getAll()) != null && !all.isEmpty()) {
                    HashSet hashSet = new HashSet(all.keySet());
                    final String jSONObject = new JSONObject(all).toString();
                    if (TextUtils.isEmpty(jSONObject)) {
                        return;
                    }
                    oo.pcc("ad_show_detail", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.oo.pcc.2
                        @Override // com.bytedance.sdk.openadsdk.dax.sf
                        public gm pcc() throws Exception {
                            return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("ad_show_detail").sf(jSONObject);
                        }
                    });
                    sf(hashSet);
                }
            } catch (Throwable th) {
                lo.pcc("AbnormalCloseReport", "delayReport exception", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String sf(int i) {
        try {
            File pcc = com.bytedance.sdk.openadsdk.core.settings.gm.pcc();
            pcc.getAbsolutePath();
            pcc.exists();
            if (!pcc.exists()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray(new String(qf.oo(pcc)));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.getInt("code_id") == i) {
                    jSONObject.putOpt("ad_slot_conf", jSONObject2);
                }
            }
            jSONObject.putOpt("abtest", sf());
            jSONObject.putOpt("app_common_config", pcc(String.valueOf(i)));
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void pcc(final of ofVar, final int i) {
        if (com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc()) {
            try {
                oo.pcc("ad_show_detail", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.oo.pcc.1
                    @Override // com.bytedance.sdk.openadsdk.dax.sf
                    public gm pcc() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("request_id", of.this.qxv());
                        jSONObject.putOpt("creative_info", of.this.qrz());
                        jSONObject.putOpt("dynamic_show_type", Integer.valueOf(i));
                        jSONObject.putOpt("settings", pcc.sf(of.this.kot()));
                        jSONObject.putOpt(U3.f.e, vj.pcc());
                        return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("ad_show_detail").sf(jSONObject.toString());
                    }
                });
            } catch (Throwable th) {
                lo.pcc("AbnormalCloseReport", "report exception", th);
            }
        }
    }

    public static void pcc(of ofVar) {
        if (ofVar == null) {
            return;
        }
        sf((Set<String>) Collections.singleton("abnormal_close_key".concat(String.valueOf(ofVar.qxv()))));
    }

    private static String pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return lu.oo().gpj(str).optString("app_common_config");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void sf(final of ofVar, final int i) {
        if (com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc()) {
            rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("save_ad_detail") { // from class: com.bytedance.sdk.openadsdk.component.oo.pcc.3
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        String qxv = ofVar.qxv();
                        jSONObject.putOpt("request_id", qxv);
                        jSONObject.putOpt("creative_info", ofVar.qrz());
                        jSONObject.putOpt("dynamic_show_type", Integer.valueOf(i));
                        jSONObject.putOpt("settings", pcc.sf(ofVar.kot()));
                        jSONObject.putOpt(U3.f.e, vj.pcc());
                        jSONObject.putOpt("timestamp", Long.valueOf(System.currentTimeMillis()));
                        SharedPreferences pcc = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(lu.pcc(), "abnormal_close_file");
                        if (pcc == null) {
                            pcc.sf("abnormal_close_key".concat(String.valueOf(qxv)), jSONObject.toString());
                            return;
                        }
                        Map<String, ?> all = pcc.getAll();
                        if (all.size() >= com.bytedance.sdk.openadsdk.of.pcc.pcc.sf()) {
                            String str = null;
                            long j = Long.MAX_VALUE;
                            for (Map.Entry<String, ?> entry : all.entrySet()) {
                                String key = entry.getKey();
                                try {
                                    long optLong = new JSONObject((String) entry.getValue()).optLong("timestamp", Long.MAX_VALUE);
                                    if (optLong < j) {
                                        str = key;
                                        j = optLong;
                                    }
                                } catch (Throwable th) {
                                    lo.pcc("AbnormalCloseReport", "parse entry json error", th);
                                }
                            }
                            if (str != null) {
                                pcc.sf((Set<String>) Collections.singleton(str));
                            }
                        }
                        pcc.sf("abnormal_close_key".concat(String.valueOf(qxv)), jSONObject.toString());
                    } catch (Throwable th2) {
                        lo.pcc("AbnormalCloseReport", "save exception", th2);
                    }
                }
            });
        }
    }

    private static String sf() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("version", lu.oo().vy());
            jSONObject.putOpt("params", lu.oo().mk());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(String str, String str2) {
        SharedPreferences pcc;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (pcc = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(lu.pcc(), "abnormal_close_file")) == null) {
            return;
        }
        SharedPreferences.Editor edit = pcc.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(final Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        set.toString();
        rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("remove_entries_from_sp") { // from class: com.bytedance.sdk.openadsdk.component.oo.pcc.4
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences pcc = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(lu.pcc(), "abnormal_close_file");
                if (pcc == null) {
                    return;
                }
                SharedPreferences.Editor edit = pcc.edit();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    edit.remove((String) it.next());
                }
                edit.apply();
            }
        });
    }
}
