package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.oo.qf;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork {
    public static gbb pcc = null;
    public static final Set<String> sf = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ork.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean vh = false;
    private volatile ConcurrentHashMap<String, qf.pcc> dax;
    private String gbb;
    private boolean gm;
    private boolean hc;
    private com.bytedance.sdk.openadsdk.core.jr.gm.gm jr;

    @Nullable
    private String kj;

    @NonNull
    private String oo;
    private int ork;
    private int qf;
    private String tmg;
    private String vj;
    private int vy;

    @NonNull
    private String wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private static final ork pcc = new ork();
    }

    private ork() {
        this.gm = false;
        this.vy = 0;
        this.ork = -1;
        this.dax = null;
    }

    public static void fum() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            vh = true;
        }
    }

    public static boolean lo() {
        return vh;
    }

    public static Pair<String, Long> oo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject tmg = tmg(str);
            if (tmg == null) {
                return null;
            }
            return new Pair<>(tmg.getString(U3.i.X), Long.valueOf(tmg.getLong("time")));
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    private static void ork(String str) {
        gbb gbbVar;
        if (TextUtils.isEmpty(str) && (gbbVar = pcc) != null) {
            gbbVar.pcc(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.lo.gm("TTAD.GlobalInfo", "appid cannot be empty");
    }

    public static void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(U3.i.X, str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static boolean qf(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    private static JSONObject tmg(String str) {
        String sf2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("sp_global_file", str, (String) null);
        if (TextUtils.isEmpty(sf2)) {
            return null;
        }
        try {
            return new JSONObject(sf2);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    private static void vh(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        gbb gbbVar = pcc;
        if (gbbVar != null) {
            gbbVar.pcc(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.lo.gm("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public static int vj() {
        try {
            String pcc2 = pcc("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(pcc2)) {
                return 0;
            }
            return Integer.valueOf(pcc2).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vy(String str) {
        if (TextUtils.isEmpty(this.kj)) {
            this.kj = str;
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = new JSONArray(this.kj);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString)) {
                        hashMap.put(optString, optJSONObject);
                    }
                }
            }
            JSONArray jSONArray2 = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject optJSONObject2 = jSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    String optString2 = optJSONObject2.optString("name");
                    String optString3 = optJSONObject2.optString(U3.i.X);
                    if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                        hashMap.put(optString2, optJSONObject2);
                    }
                }
            }
            Collection values = hashMap.values();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it = values.iterator();
            while (it.hasNext()) {
                jSONArray3.put((JSONObject) it.next());
            }
            this.kj = jSONArray3.toString();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static int wh() {
        try {
            String pcc2 = pcc("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(pcc2)) {
                return 0;
            }
            return Integer.valueOf(pcc2).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public boolean dax() {
        return "5001121".contains(this.oo);
    }

    public boolean gbb() {
        return true;
    }

    public void gm(@Nullable final String str) {
        vh(str);
        if (com.bytedance.sdk.openadsdk.utils.rnn.wh()) {
            jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.2
                @Override // java.lang.Runnable
                public void run() {
                    ork.this.vy(str);
                }
            });
        } else {
            vy(str);
        }
    }

    public void gpj() {
        try {
            if (this.dax == null || this.dax.size() != 0) {
                return;
            }
            this.dax = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public com.bytedance.sdk.openadsdk.core.jr.gm.gm hc() {
        com.bytedance.sdk.openadsdk.core.jr.gm.gm gmVar = this.jr;
        if (gmVar != null) {
            return gmVar;
        }
        com.bytedance.sdk.openadsdk.core.jr.gm.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.jr.gm.gm(10, 8);
        this.jr = gmVar2;
        return gmVar2;
    }

    public boolean jr() {
        return sf.contains(this.oo);
    }

    @NonNull
    public String kj() {
        if (TextUtils.isEmpty(this.wh)) {
            this.wh = pcc(lu.pcc());
        }
        return this.wh;
    }

    public String lu() {
        if (!TextUtils.isEmpty(this.gbb)) {
            return this.gbb;
        }
        String pcc2 = com.bytedance.sdk.openadsdk.utils.tmg.pcc();
        this.gbb = pcc2;
        if (!TextUtils.isEmpty(pcc2)) {
            return this.gbb;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.tmg.pcc(valueOf);
        this.gbb = valueOf;
        return valueOf;
    }

    public boolean nac() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.kun.wh());
    }

    public void sf(String str) {
        this.vj = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        pcc("mediation_info", str);
    }

    public String tz() {
        return this.tmg;
    }

    public void sf(boolean z) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    public static void sf(int i) {
        if (i >= 0) {
            pcc("config_fail_times", String.valueOf(i));
        }
    }

    @NonNull
    public static ork sf() {
        return pcc.pcc;
    }

    public void kj(String str) {
        this.tmg = str;
    }

    public int ork() {
        return this.ork;
    }

    public void gm(int i) {
        this.qf = i;
    }

    public boolean gm() {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_global_file", "sdk_activate_init", true);
    }

    public void gm(boolean z) {
        this.gm = z;
    }

    @Nullable
    public String tmg() {
        return this.kj;
    }

    public boolean vh() {
        int i = this.ork;
        return i < -1 || i > 1;
    }

    public void vj(int i) {
        this.vy = i;
    }

    public void wh(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.dax == null) {
                return;
            }
            this.dax.remove(str);
        } catch (Throwable unused) {
        }
    }

    public qf.pcc vj(String str) {
        try {
            if (this.dax == null || str == null) {
                return null;
            }
            return this.dax.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String qf() {
        String str = this.vj;
        if (str != null) {
            return str;
        }
        String pcc2 = pcc("mediation_info", Long.MAX_VALUE);
        this.vj = pcc2;
        if (pcc2 != null) {
            return pcc2;
        }
        this.vj = "";
        return "";
    }

    public void oo(int i) {
        this.ork = i;
    }

    @Nullable
    public String oo() {
        if (TextUtils.isEmpty(this.oo)) {
            String pcc2 = pcc(MBridgeConstans.APP_ID, Long.MAX_VALUE);
            if (!TextUtils.isEmpty(pcc2)) {
                this.oo = pcc2;
            }
        }
        return this.oo;
    }

    public static void pcc(gbb gbbVar) {
        pcc = gbbVar;
    }

    public boolean pcc() {
        return this.hc;
    }

    public void pcc(boolean z) {
        this.hc = z;
    }

    public static void pcc(int i) {
        if (i >= 0) {
            pcc("domain_index", String.valueOf(i));
        }
    }

    public void pcc(@NonNull String str) {
        ork(str);
        this.oo = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        pcc(MBridgeConstans.APP_ID, str);
    }

    private String pcc(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String pcc(String str, long j) {
        JSONObject tmg;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            tmg = tmg(str);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.GlobalInfo", e.getMessage());
        }
        if (tmg == null) {
            return null;
        }
        if (System.currentTimeMillis() - tmg.getLong("time") <= j) {
            return tmg.getString(U3.i.X);
        }
        return null;
    }

    public void pcc(String str, qf.pcc pccVar) {
        try {
            if (TextUtils.isEmpty(str) || pccVar == null) {
                return;
            }
            if (this.dax == null) {
                synchronized (ork.class) {
                    try {
                        if (this.dax == null) {
                            this.dax = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.dax != null) {
                this.dax.put(str, pccVar);
            }
        } catch (Throwable unused) {
        }
    }

    public int vy() {
        return this.qf;
    }
}
