package com.bytedance.sdk.openadsdk.yt;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.activity.single.kj;
import com.bytedance.sdk.openadsdk.component.reward.pcc.lu;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.qy;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.core.settings.vy;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.of;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.yt.sf;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.PglSSConfig;
import defpackage.wv8;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private static volatile oo oo;
    public static String sf;
    private static final AtomicBoolean gm = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, Object> pcc = new ConcurrentHashMap<>();

    public static boolean gm() {
        return pcc("ad_load_and_render_opt", a.k, 0) == 1;
    }

    public static boolean kj() {
        return pcc("jsb_opt_enable", 0) == 1;
    }

    public static boolean oo() {
        return gm() && pcc("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static boolean ork() {
        return pcc("iv_rv_listen_new_arch", 0) == 1;
    }

    public static int pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (sfVar == null) {
            return -1;
        }
        if (!sfVar.gdh) {
            if (atb.sf(sfVar.sf)) {
                return atb.kj(sfVar.sf) ? pcc("playable_link_endcard") : atb.wh(sfVar.sf) ? pcc("pure_playable") : pcc("playable");
            }
            lu luVar = sfVar.ye;
            return (luVar == null || !luVar.lo()) ? (lo.oo(sfVar.sf) || lo.sf(sfVar.sf) || lo.kj(sfVar.sf)) ? pcc("direct_landingpage") : pcc(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD) : pcc("double_endcard");
        }
        kj kjVar = sfVar.ywp;
        if (kjVar instanceof com.bytedance.sdk.openadsdk.activity.single.vj) {
            if (((com.bytedance.sdk.openadsdk.activity.single.vj) kjVar).pcc) {
                return pcc("one_more_mutlti_endcard");
            }
            lu luVar2 = sfVar.ye;
            if (luVar2 != null && luVar2.lo()) {
                return pcc("one_more_mutlti_double_endcard");
            }
        }
        return -1;
    }

    public static int qf() {
        if (gm()) {
            return pcc("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    public static void sf() {
        oo tmg;
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || (tmg = tmg()) == null || gm.getAndSet(true)) {
            return;
        }
        tmg.pcc();
    }

    private static oo tmg() {
        return pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), ork.sf().oo());
    }

    public static boolean vh() {
        return pcc("iv_rv_top_bar_listen_new", 0) == 1;
    }

    public static boolean vj() {
        return gm() && pcc("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    public static boolean vy() {
        return pcc("no_call_close", 0) == 1;
    }

    public static int wh() {
        if (gm()) {
            return pcc("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static String pcc() {
        gm sf2;
        SharedPreferences pcc2;
        try {
            oo tmg = tmg();
            if (tmg == null || (sf2 = tmg.sf()) == null || (pcc2 = sf2.pcc()) == null) {
                return null;
            }
            return new JSONObject(pcc2.getAll()).toString();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.pcc("StrategyUtils", "getStrategyConfig error", e);
            return null;
        }
    }

    public static int pcc(String str, int i) {
        oo tmg = tmg();
        return tmg != null ? tmg.pcc(str, i) : i;
    }

    public static boolean pcc(String str, boolean z) {
        oo tmg = tmg();
        return tmg != null ? tmg.pcc(str, z) : z;
    }

    public static String pcc(String str, String str2) {
        oo tmg = tmg();
        return tmg != null ? tmg.pcc(str, str2) : str2;
    }

    public static <T> T pcc(String str, T t, sf.pcc<T> pccVar) {
        oo tmg = tmg();
        return tmg != null ? (T) tmg.pcc(str, t, pccVar) : t;
    }

    public static int pcc(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String i2 = wv8.i(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = pcc;
            Object obj = concurrentHashMap.get(i2);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String pcc2 = tmg().pcc(str, "");
                if (!TextUtils.isEmpty(pcc2)) {
                    int optInt = new JSONObject(pcc2).optInt(str2, i);
                    concurrentHashMap.put(i2, Integer.valueOf(optInt));
                    return optInt;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("StrategyUtils", th.getMessage());
            }
        }
        return i;
    }

    public static String pcc(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String i = wv8.i(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = pcc;
            Object obj = concurrentHashMap.get(i);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String pcc2 = tmg().pcc(str, "");
                if (!TextUtils.isEmpty(pcc2)) {
                    String optString = new JSONObject(pcc2).optString(str2, str3);
                    concurrentHashMap.put(i, optString);
                    return optString;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    private static int pcc(String str) {
        JSONObject jSONObject = (JSONObject) pcc("rviv_close_button_backup", (Object) null, sf.pcc);
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return -1;
        }
        try {
            Object obj = jSONObject.get(str);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            return -1;
        } catch (JSONException e) {
            e.getMessage();
            return -1;
        }
    }

    public static oo pcc(final Context context, final String str) {
        if (oo == null) {
            synchronized (vj.class) {
                try {
                    if (oo == null) {
                        try {
                            oo ooVar = new oo(new wh() { // from class: com.bytedance.sdk.openadsdk.yt.vj.1
                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public String gm() {
                                    if (fum.pcc(sf())) {
                                        return "pag_adn_strategy_center";
                                    }
                                    return "pag_adn_strategy_center_" + fum.gm(sf());
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public boolean kj() {
                                    return com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj();
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public Handler oo() {
                                    return jr.sf();
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public JSONObject pcc(JSONObject jSONObject) {
                                    String pcc2 = yt.pcc(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                    if (!TextUtils.isEmpty(pcc2)) {
                                        try {
                                            return new JSONObject(pcc2);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    return jSONObject;
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public Map<String, String> qf() {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put(Command.HTTP_HEADER_USER_AGENT, kun.oo());
                                    String sf2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!sf2.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", sf2);
                                        } catch (JSONException unused) {
                                        }
                                        JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new qy(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                        if (encryptType4 != null) {
                                            hashMap.put("transfer-param", encryptType4.optString(PglCryptUtils.KEY_MESSAGE));
                                            if (encryptType4.optInt("cypher") == 4) {
                                                hashMap.put("cypher", "4");
                                            } else {
                                                hashMap.put("cypher", "3");
                                            }
                                        }
                                    }
                                    try {
                                        hashMap.put("x-pangle-target-idc", vh.sf().rc());
                                    } catch (Throwable unused2) {
                                    }
                                    return hashMap;
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public Context sf() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : com.bytedance.sdk.openadsdk.core.lu.pcc();
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public String vj() {
                                    String pcc2 = kun.pcc("/api/ad/union/sdk/strategies/adn", false, true);
                                    vj.sf = pcc2;
                                    return pcc2;
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public JSONObject wh() {
                                    try {
                                        JSONObject pcc2 = vy.pcc(jsj.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), 0L));
                                        if (!pcc2.has(MBridgeConstans.APP_ID)) {
                                            if (!TextUtils.isEmpty(str)) {
                                                pcc2.put(MBridgeConstans.APP_ID, str);
                                            } else {
                                                if (TextUtils.isEmpty(ork.sf().oo())) {
                                                    return null;
                                                }
                                                pcc2.put(MBridgeConstans.APP_ID, ork.sf().oo());
                                            }
                                        }
                                        return yt.pcc(PangleEncryptConstant.CryptDataScene.STRATEGY, pcc2);
                                    } catch (Throwable th) {
                                        com.bytedance.sdk.component.utils.lo.gm("StrategyUtils", th.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public ExecutorService pcc() {
                                    return rnn.vj();
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.wh
                                public HandlerThread pcc(String str2, int i) {
                                    return com.bytedance.sdk.component.utils.kj.pcc(str2, i);
                                }
                            });
                            oo = ooVar;
                            ooVar.pcc(new pcc() { // from class: com.bytedance.sdk.openadsdk.yt.vj.2
                                @Override // com.bytedance.sdk.openadsdk.yt.pcc
                                public void pcc(int i, String str2) {
                                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.yt.vj.2.3
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            return wv8.e("strategy_fetch");
                                        }
                                    });
                                    of.pcc(vj.sf);
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.pcc
                                public void sf() {
                                    com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.yt.vj.2.2
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            return wv8.e("strategy_fetch");
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.wh.pcc.pcc().sf();
                                    com.bytedance.sdk.openadsdk.tz.pcc.gm.pcc().sf();
                                    of.sf();
                                    HashMap hashMap = new HashMap();
                                    String pcc2 = vj.pcc(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(pcc2)) {
                                        hashMap.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, pcc2);
                                    }
                                    com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(hashMap);
                                }

                                @Override // com.bytedance.sdk.openadsdk.yt.pcc
                                public void pcc() {
                                    com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.yt.vj.2.1
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            return wv8.e("strategy_fetch");
                                        }
                                    });
                                }
                            });
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return oo;
    }
}
