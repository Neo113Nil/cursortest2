package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tmg;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.TTSdkSettings;
import com.bytedance.sdk.openadsdk.core.settings.ork;
import com.bytedance.sdk.openadsdk.core.settings.vj;
import com.bytedance.sdk.openadsdk.core.settings.vy;
import com.bytedance.sdk.openadsdk.oo.pcc.ork;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import defpackage.bf3;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh implements vy.pcc {
    private static String qy;
    private int dax;
    private final vj.sf<Map<String, Integer>> fum;
    private final AtomicBoolean gbb;
    private final kj hc;
    private volatile boolean jr;
    vj.sf<com.bytedance.sdk.openadsdk.oo.pcc.ork> kj;
    private final Runnable lo;
    private boolean lu;
    private int nac;
    private final vj.sf<Set<String>> of;
    private Set<String> ork;
    private final com.bytedance.sdk.openadsdk.core.settings.pcc tmg;
    private final Set<String> tz;
    private vj.sf<JSONObject> yt;
    public static final String pcc = String.join("_", "bus_con_collect", kun.ye());
    public static final String sf = String.join("_", "bus_con", kun.ye(), kun.atb(), "timeout");
    public static final String gm = String.join("_", "bus_con", kun.ye(), kun.atb(), "alpha");
    private static final String vy = kun.of();
    public static String oo = "";
    public static int vj = -2;
    public static String wh = AndroidTcfDataSource.TCF_TCSTRING_KEY;
    private static boolean vh = false;
    private static final ConcurrentLinkedQueue<ork.pcc> gpj = new ConcurrentLinkedQueue<>();
    static final ConcurrentHashMap<String, Integer> qf = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        static final vh pcc = new vh();
    }

    private vh() {
        this.ork = Collections.synchronizedSet(new HashSet());
        this.tmg = new com.bytedance.sdk.openadsdk.core.settings.pcc();
        this.hc = new kj(new ork.pcc() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ork.pcc
            public void pcc() {
                ork.pcc[] pccVarArr;
                boolean unused = vh.vh = true;
                com.bytedance.sdk.openadsdk.core.vh.sf.pcc().gbb();
                if (vh.gpj == null || vh.gpj.size() == 0 || (pccVarArr = (ork.pcc[]) vh.gpj.toArray()) == null) {
                    return;
                }
                for (ork.pcc pccVar : pccVarArr) {
                    pccVar.pcc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ork.pcc
            public void sf() {
                com.bytedance.sdk.openadsdk.core.vh.sf.pcc().jr();
                if (vh.gpj == null || vh.gpj.isEmpty()) {
                    return;
                }
                Iterator it = vh.gpj.iterator();
                while (it.hasNext()) {
                    ((ork.pcc) it.next()).sf();
                }
            }
        });
        this.gbb = new AtomicBoolean(false);
        this.jr = false;
        this.dax = 5000;
        this.nac = 10;
        this.lo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.7
            @Override // java.lang.Runnable
            public void run() {
                vh.this.pcc(2, false);
                vh.this.ei();
            }
        };
        this.fum = new vj.sf<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> sf(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap hashMap = new HashMap(jSONObject.length());
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int optInt = jSONObject.optInt(next, 100);
                            if (optInt < 0 || optInt > 100) {
                                hashMap.put(next, 100);
                            } else {
                                hashMap.put(next, Integer.valueOf(optInt));
                            }
                        }
                    }
                    return hashMap;
                } catch (Exception e) {
                    lo.gm(bf3.j(e, new StringBuilder("get applog rate from sp failed:")), new Object[0]);
                    return null;
                }
            }
        };
        this.tz = new HashSet();
        this.of = new vj.sf<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public Set<String> sf(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("applog_count");
                        if (optInt >= 2 && optInt <= 100) {
                            vh.this.nac = optInt;
                        }
                        int optInt2 = jSONObject.optInt("applog_interval");
                        if (optInt2 >= 100 && optInt2 <= 30000) {
                            vh.this.dax = optInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e) {
                        e.getMessage();
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.yt = new vj.sf<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public JSONObject sf(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    lo.gm("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.kj = new vj.sf<com.bytedance.sdk.openadsdk.oo.pcc.ork>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.oo.pcc.ork sf(String str) {
                com.bytedance.sdk.openadsdk.oo.pcc.ork orkVar = new com.bytedance.sdk.openadsdk.oo.pcc.ork();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    orkVar.pcc(jSONObject.optInt("enable_strategy", 0) == 1);
                    orkVar.pcc(pcc(jSONObject.optJSONObject(BuildConfig.FLAVOR)));
                    JSONObject optJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            orkVar.pcc(next, pcc(optJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return orkVar;
            }

            private ork.pcc pcc(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new ork.pcc(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
    }

    private String az() {
        return this.hc.pcc("force_language", "");
    }

    public static boolean bxz() {
        return vh;
    }

    private Set<String> gr() {
        return (Set) this.hc.pcc("perf_con_applog_send", this.tz, this.of);
    }

    public static String kez() {
        String str = qy;
        if (str == null) {
            str = com.bytedance.sdk.openadsdk.core.gm.pcc().sf("settings_host_from_meta", "");
            qy = str;
            if (str == null) {
                qy = "";
                return "";
            }
        }
        return str;
    }

    public static void ye(String str) {
        if (str == null) {
            str = "";
        }
        String kez = kez();
        if (kez == null || !kez.equals(str)) {
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("settings_host_from_meta", str);
            qy = str;
            sf().pcc(8, true);
        }
    }

    public boolean atb(String str) {
        Set<String> uae;
        if (TextUtils.isEmpty(str) || (uae = uae()) == null || uae.size() == 0) {
            return false;
        }
        return uae.contains(str);
    }

    public boolean bbd() {
        return this.hc.pcc("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public boolean bg() {
        return this.hc.pcc("read_video_from_cache", 1) == 1;
    }

    public boolean dax() {
        return this.hc.pcc("support_gzip", false);
    }

    public void ei() {
        jr.sf().removeCallbacks(this.lo);
        jr.sf().postDelayed(this.lo, gdh());
    }

    public boolean erj() {
        return this.hc.pcc("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    public int ew() {
        int pcc2 = this.hc.pcc("perf_con_webview_cache_count_v3", 0);
        if (pcc2 < 0) {
            return 0;
        }
        return pcc2;
    }

    public int fmh() {
        return this.hc.pcc("vbtt", 5);
    }

    public String fum() {
        return this.hc.pcc("bus_con_check_clz", "");
    }

    public int fvk() {
        int pcc2 = this.hc.pcc("bus_con_auto_click_delay", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        return pcc2 <= 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : pcc2;
    }

    public int fy() {
        return this.hc.pcc("perf_con_sync_gaid", 0);
    }

    public int gbb(String str) {
        return tsz(String.valueOf(str)).kj;
    }

    public int gd() {
        int pcc2 = this.hc.pcc("privacy_personalized_ad", Integer.MAX_VALUE);
        if (pcc2 != Integer.MAX_VALUE) {
            return pcc2;
        }
        int qy2 = kun.qy();
        if (qy2 == 1 || qy2 == 2) {
            return 2;
        }
        return qy2 != 3 ? 0 : 1;
    }

    public long gdh() {
        long pcc2 = this.hc.pcc("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (pcc2 < 0 || pcc2 > 86400000) ? TTAdConstant.AD_MAX_EVENT_TIME : pcc2;
    }

    public Set<String> gga() {
        kj kjVar = this.hc;
        Set<String> set = Collections.EMPTY_SET;
        Set<String> set2 = (Set) kjVar.pcc("ads_url_backup", set, vj.sf);
        return (set2 == null || set2.size() == 0) ? set : set2;
    }

    public int gh() {
        return this.hc.pcc("blank_detect_rate", 30);
    }

    public synchronized void gm() {
        SystemClock.elapsedRealtime();
        boolean z = this.jr;
        this.tmg.pcc(this.jr);
        this.hc.pcc(this.jr);
        gm.pcc(!z);
        this.jr = true;
        SystemClock.elapsedRealtime();
        if (!z) {
            jr.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.3
                @Override // java.lang.Runnable
                public void run() {
                    vh.this.pcc(1, com.bytedance.sdk.openadsdk.core.vh.sf.pcc().qf() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().ork());
                    vh.this.ei();
                }
            }, 1000L);
        }
    }

    public JSONObject gpj(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.hc.pcc("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", tsz(str).zti);
                return jSONObject2;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObject2;
                lo.gm("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public Set<String> gqd() {
        kj kjVar = this.hc;
        Set<String> set = Collections.EMPTY_SET;
        Set<String> set2 = (Set) kjVar.pcc("dual_event_url_backup", set, vj.sf);
        return (set2 == null || set2.size() == 0) ? set : set2;
    }

    public boolean hc(String str) {
        try {
            return tsz(str).of != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public String hoh() {
        return this.hc.pcc("privacy_app_reg", "");
    }

    public String hpk() {
        return this.hc.pcc("dc", "");
    }

    public int iv() {
        return this.hc.pcc("ivrv_downward", 0);
    }

    public String jq() {
        return this.hc.pcc("dual_event_url", (String) null);
    }

    public boolean jr() {
        return this.hc.pcc("allow_blind_mode_request_ad", false);
    }

    public boolean jsj(String str) {
        return lu.oo().tsz(str).jr == 1;
    }

    public void jy() {
        vj.pcc sf2 = this.hc.sf();
        sf2.pcc("settings_url", "");
        sf2.pcc();
        ye("");
    }

    public void kj() {
        this.hc.sf().pcc("ab_test_param").pcc();
    }

    public String kun() {
        return this.hc.pcc("settings_url", "");
    }

    public boolean kx() {
        return this.hc.pcc("bus_con_video_keep_screen_on", 1) == 1;
    }

    public int kz() {
        int pcc2 = this.hc.pcc("perf_con_webview_cache_count", 0);
        if (pcc2 < 0) {
            return 0;
        }
        return pcc2;
    }

    public int lo() {
        return this.hc.pcc("bus_con_behavior_count", 300);
    }

    public int lq() {
        return this.hc.pcc(InneractiveMediationNameConsts.MAX, 50);
    }

    public String lrr() {
        return this.hc.pcc("policy_url", "");
    }

    public boolean lu(String str) {
        return str == null || DeviceUtils.ork(lu.pcc()) == 0 || tsz(str).hc == 1;
    }

    public boolean mk(@NonNull String str) {
        Set set = (Set) this.hc.pcc("privacy_fields_allowed", Collections.EMPTY_SET, vj.sf);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int qy2 = kun.qy();
        if (qy2 != 1) {
            if (qy2 != 2 && qy2 != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public int mu() {
        int pcc2 = this.hc.pcc("fetch_tpl_second", 0);
        if (pcc2 <= 0) {
            return 0;
        }
        return pcc2;
    }

    public com.bytedance.sdk.openadsdk.oo.pcc.ork mua() {
        return (com.bytedance.sdk.openadsdk.oo.pcc.ork) this.hc.pcc("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.oo.pcc.ork.pcc, this.kj);
    }

    public boolean nac(String str) {
        return tsz(str).tz == 0;
    }

    public void nn() {
        String az = az();
        if (TextUtils.isEmpty(az)) {
            return;
        }
        if (az.equals("zh-Hant")) {
            tmg.pcc(lu.pcc(), "zh", "tw");
        } else {
            tmg.pcc(lu.pcc(), az, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            lo.gm("TTAD.SdkSettings", th.getMessage());
        }
    }

    public boolean of() {
        return this.hc.pcc(pcc, false);
    }

    public String oo() {
        return this.hc.pcc("aes_key", "");
    }

    public int ork(String str) {
        if (str == null) {
            return 5000;
        }
        return tsz(str).dax;
    }

    public long otd() {
        return this.hc.pcc("last_req_time", 0L);
    }

    public void pcc(@TTSdkSettings.FETCH_REQUEST_SOURCE final int i, boolean z) {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().oo()) {
            return;
        }
        if (!jr.vj() && i != 1 && i != 2) {
            if (z) {
                this.lu = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ork.sf().oo())) {
                return;
            }
            if (this.lu) {
                this.lu = false;
                if (!z) {
                    z = true;
                }
            }
            long otd = otd();
            long currentTimeMillis = System.currentTimeMillis();
            long gdh = gdh();
            long j = currentTimeMillis - otd;
            if ((z || j >= gdh) && this.gbb.compareAndSet(false, true)) {
                rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("setting_req") { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.vh.sf.pcc().pcc(new com.bytedance.sdk.openadsdk.core.vh.oo() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.6.1
                            @Override // com.bytedance.sdk.openadsdk.core.vh.oo
                            public void pcc(boolean z2) {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                if (!z2) {
                                    vh.this.gbb.set(false);
                                } else {
                                    vh vhVar = vh.this;
                                    new vy(vhVar, vhVar.hc, vh.this.tmg).run();
                                }
                            }
                        }, i == 6);
                    }
                });
                jr.sf().removeCallbacks(this.lo);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("settings request error", "settings", th);
        }
    }

    public int pq() {
        int pcc2 = this.hc.pcc("fetch_tpl_timeout_ctrl", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        return pcc2 <= 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : pcc2;
    }

    public boolean ptr() {
        return this.hc.pcc("privacy_debug_unlock", 1) != 0;
    }

    public boolean pv() {
        return this.hc.pcc("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public boolean qc() {
        return this.hc.pcc("perf_con_is_new_net_thread", 0) == 1;
    }

    public boolean qcw() {
        return this.jr;
    }

    public long qf() {
        return this.hc.pcc("data_time", 0L);
    }

    public float qy() {
        return this.hc.pcc(gm, 1.0f);
    }

    public boolean ra() {
        int pcc2 = this.tmg.pcc("perf_con_apm", 100);
        if (pcc2 == 0) {
            return false;
        }
        return pcc2 < 0 || pcc2 >= 100 || pcc2 > ((int) (Math.random() * 100.0d));
    }

    public String rc() {
        return this.hc.pcc("target_region", "");
    }

    public String ri() {
        return this.hc.pcc("dc", "TX");
    }

    public String rj() {
        return this.hc.pcc("app_log_url", "");
    }

    public boolean rnn() {
        return this.hc.gm();
    }

    public long rt() {
        return this.hc.pcc("perf_con_adlog_expire_time", 0L);
    }

    public boolean se() {
        return this.hc.pcc("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    public int sf(String str) {
        Integer num;
        Map map = (Map) this.hc.pcc("perf_con_applog_rate", null, this.fum);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public int tmg(String str) {
        return tsz(str).tmg;
    }

    public String[] tmh() {
        Set<String> set;
        try {
            set = this.ork;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.hc.pcc("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.ork.add(jSONArray.getString(i));
                }
            }
            Set<String> pcc2 = kj.pcc(this.ork);
            this.ork = pcc2;
            if (pcc2 != null) {
                if (pcc2.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.ork.toArray(new String[0]);
    }

    public String tsx() {
        return this.hc.pcc("ads_url", "");
    }

    public int tsz() {
        return this.hc.pcc("loadedCallbackOpportunity", 0);
    }

    public boolean tz() {
        return this.hc.pcc("bus_con_url_check", 1) != 0;
    }

    public Set<String> uae() {
        return (Set) this.hc.pcc("token_adx_ids", Collections.EMPTY_SET, vj.sf);
    }

    public Set<String> vd() {
        return (Set) this.hc.pcc("privacy_fields_allowed", Collections.EMPTY_SET, vj.sf);
    }

    public boolean vgx() {
        return this.gbb.get();
    }

    public int vh() {
        return this.hc.pcc("perf_con_drawable_code", 0);
    }

    public boolean vj(String str) {
        int i = tsz(str).vj;
        return i != 1 ? i == 2 && com.bytedance.sdk.component.utils.lu.gm(lu.pcc()) != 0 : com.bytedance.sdk.component.utils.lu.oo(lu.pcc());
    }

    public Set<String> vo() {
        return (Set) this.hc.pcc("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, vj.sf);
    }

    public boolean vr() {
        return this.hc.pcc("global_rate", 1.0f) == 1.0f;
    }

    public String vy() {
        return this.hc.pcc("ab_test_version", "");
    }

    public JSONObject wax() {
        return (JSONObject) this.hc.pcc("perf_con_thread_pool_config", new JSONObject(), this.yt);
    }

    @Nullable
    public JSONObject wh() {
        return (JSONObject) this.hc.pcc("digest", null, vj.pcc);
    }

    public String xb() {
        return this.hc.pcc("dyn_draw_engine_url", vy);
    }

    public boolean xf() {
        return this.hc.pcc("token_enable", 0) == 1;
    }

    public int yt() {
        return this.hc.pcc(sf, 10000);
    }

    public boolean ywp() {
        if (com.bytedance.sdk.component.adexpress.oo.sf.pcc(lu.pcc())) {
            return this.hc.pcc("support_rtl", false);
        }
        return false;
    }

    public boolean zsj() {
        int pcc2 = this.hc.pcc("privacy_ad_enable", Integer.MAX_VALUE);
        if (pcc2 == 1) {
            return true;
        }
        if (pcc2 == 0) {
            return false;
        }
        int qy2 = kun.qy();
        return qy2 == 1 || qy2 == 2 || qy2 == 3;
    }

    public wh zti() {
        return (wh) this.hc.pcc("insert_js_config", wh.pcc, new vj.sf<wh>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public wh sf(String str) {
                return new wh(str);
            }
        });
    }

    public Set<String> tmg() {
        return gr();
    }

    public int dax(String str) {
        return tsz(str).ork;
    }

    public boolean jr(String str) {
        return gbb(str) != 1;
    }

    public int of(String str) {
        return tsz(str).jsj;
    }

    @NonNull
    public sf tsz(String str) {
        return gm.pcc(str);
    }

    public int vh(String str) {
        return tsz(str).vh;
    }

    public boolean fum(String str) {
        return tsz(str).fum;
    }

    public int gbb() {
        gr();
        return this.dax;
    }

    public int lo(String str) {
        return tsz(str).lo;
    }

    public boolean oo(String str) {
        return tsz(str).mk;
    }

    public int qf(String str) {
        return tsz(str).lu;
    }

    public boolean qy(String str) {
        return tsz(str).ye;
    }

    public int vy(String str) {
        if (str == null) {
            return 1;
        }
        return tsz(str).gbb;
    }

    public int yt(String str) {
        return tsz(str).tsz;
    }

    public int hc() {
        gr();
        return this.nac;
    }

    public boolean nac() {
        return this.hc.pcc("ad_revenue_enable", true);
    }

    public int ork() {
        return this.hc.pcc("splash_video_load_strategy", 0);
    }

    public int tz(String str) {
        return tsz(str).qy;
    }

    public boolean wh(String str) {
        return tsz(str).qf == 1;
    }

    public int jsj() {
        return this.hc.pcc("bus_con_slide_num", 2);
    }

    public boolean kj(String str) {
        return str == null || tsz(str).gbb == 1;
    }

    public boolean lu() {
        return this.hc.pcc("bus_con_adshow_check_enable", true);
    }

    public boolean atb() {
        return this.hc.pcc("landingpage_new_style", -1) == 1;
    }

    public int vj() {
        return this.hc.pcc("max_tpl_cnts", 100);
    }

    public long ye() {
        return this.hc.pcc(IronSourceConstants.EVENTS_DURATION, Ua.s);
    }

    public static String sf(Context context) {
        SharedPreferences gm2;
        return (context == null || (gm2 = gm(context)) == null) ? "" : gm2.getString(wh, "");
    }

    public static vh sf() {
        return pcc.pcc;
    }

    public String gpj() {
        return this.hc.pcc("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public int sf(int i) {
        return tsz(String.valueOf(i)).sf;
    }

    @Nullable
    private static SharedPreferences gm(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean gm(String str) {
        return tsz(str).gm == 1;
    }

    public int gm(int i) {
        return tsz(String.valueOf(i)).vy;
    }

    public String mk() {
        return this.hc.pcc("ab_test_param", "");
    }

    public void pcc() {
        try {
            gm.sf();
            this.hc.oo();
            this.tmg.oo();
            Context pcc2 = lu.pcc();
            File file = new File(new File(pcc2.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                pcc2.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    public static int pcc(Context context) {
        if (context == null) {
            return -2;
        }
        try {
            SharedPreferences gm2 = gm(context);
            if (gm2 == null) {
                return -2;
            }
            int i = gm2.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
            int i2 = gm2.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
            if (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
                return -2;
            }
            return gm2.getInt("IABTCF_gdprApplies", -1);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public void pcc(JSONObject jSONObject, vj.pcc pccVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        kj kjVar = this.hc;
        String str = vy;
        String pcc2 = kjVar.pcc("dyn_draw_engine_url", str);
        final String optString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(pcc2) && !TextUtils.isEmpty(optString) && !optString.equals(pcc2)) {
            jr.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.4
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(vh.this.hc.pcc("dyn_draw_engine_url", vh.vy), optString)) {
                        com.bytedance.sdk.component.adexpress.pcc.sf.vj.sf().gm();
                    }
                }
            }, 5000L);
        }
        pccVar.pcc("dyn_draw_engine_url", optString);
    }

    public int pcc(String str) {
        if (str == null) {
            return 0;
        }
        return lu.oo().tsz(str).gpj;
    }

    public int pcc(int i) {
        return tsz(String.valueOf(i)).lq;
    }

    public void pcc(long j) {
        this.hc.sf().pcc("last_req_time", j).pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vy.pcc
    public void pcc(boolean z) {
        this.gbb.set(false);
        ei();
        if (z) {
            HashMap hashMap = new HashMap();
            Set<String> vd = vd();
            if (vd != null && !vd.isEmpty()) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, vd);
            }
            String lu = kun.lu();
            if (!TextUtils.isEmpty(lu)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, lu);
            }
            if (com.bytedance.sdk.openadsdk.utils.sf.gm()) {
                Set<String> gga = sf().gga();
                if (gga != null && !gga.isEmpty()) {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, gga);
                } else {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
                }
            } else {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
            }
            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, rc());
            com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(hashMap);
        }
    }

    public static void pcc(ork.pcc pccVar) {
        ConcurrentLinkedQueue<ork.pcc> concurrentLinkedQueue = gpj;
        if (concurrentLinkedQueue.contains(pccVar)) {
            return;
        }
        concurrentLinkedQueue.add(pccVar);
    }
}
