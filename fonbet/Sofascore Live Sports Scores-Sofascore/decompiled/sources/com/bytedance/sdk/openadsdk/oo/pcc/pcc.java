package com.bytedance.sdk.openadsdk.oo.pcc;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jsj;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.mk;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.ye;
import com.ironsource.C4324ta;
import com.ironsource.L6;
import com.ironsource.U3;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static volatile pcc wh;
    private Context gm;
    private final boolean oo = gm();
    private long pcc;
    private int sf;
    private final String vj;

    private pcc() {
        Context pcc = lu.pcc();
        if (pcc != null) {
            this.gm = pcc.getApplicationContext();
        }
        this.vj = vj();
    }

    private boolean gm() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private int oo() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private String vj() {
        return DeviceUtils.gm(this.gm) ? "tv" : DeviceUtils.sf(this.gm) ? "android_pad" : "android";
    }

    private String wh() {
        StringBuilder sb = new StringBuilder();
        try {
            if (mk.wh()) {
                sb.append("MIUI-");
            } else if (mk.gm()) {
                sb.append("FLYME-");
            } else {
                String jr = mk.jr();
                if (mk.pcc(jr)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(jr)) {
                    sb.append(jr);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public List<com.bytedance.sdk.openadsdk.oo.pcc> pcc(List<com.bytedance.sdk.openadsdk.oo.pcc> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.oo.pcc pccVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject oo = pccVar.oo();
                jSONObject.putOpt("event", oo.optString("label"));
                long optLong = oo.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(optLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.oo.wh.gm.format(new Date(optLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = oo.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, oo.opt(next));
                    }
                }
                if (i > 0 && pccVar.gm() == 3) {
                    jSONObject2.put("_ad_staging_flag", i);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.oo.wh(pccVar.pcc, jSONObject));
            } catch (Exception e) {
                lo.gm("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    public JSONObject sf() {
        Context pcc;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.gm == null && (pcc = lu.pcc()) != null) {
                this.gm = pcc.getApplicationContext();
            }
            jSONObject.put(L6.d0, kun.oo());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", kun.kj());
            jSONObject.put("sim_op", pcc(this.gm));
            jSONObject.put("root", this.oo ? 1 : 0);
            jSONObject.put("timezone", oo());
            jSONObject.put("access", jsj.pcc(this.gm));
            jSONObject.put(L6.F, U3.d);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.vj);
            jSONObject.put(Payload.DEVICE_MODEL, Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", rj.vj(this.gm) + "x" + rj.gm(this.gm));
            jSONObject.put("display_density", pcc(rj.ork(this.gm)));
            jSONObject.put("density_dpi", rj.ork(this.gm));
            jSONObject.put(C4324ta.b, "1371");
            jSONObject.put("device_id", hc.pcc(this.gm));
            jSONObject.put("rom", wh());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.sf);
            jSONObject.put("uid", this.pcc);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
            jSONObject.put("locale_language", DeviceUtils.oo());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.vj() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.sf() ? 1 : 0);
            vh oo = lu.oo();
            Context context = this.gm;
            if (context != null) {
                jSONObject.put("force_language", tz.pcc(context, "tt_choose_language"));
            }
            if (oo.mk("mnc")) {
                jSONObject.put("mnc", ye.gm());
            }
            if (oo.mk("mcc")) {
                jSONObject.put("mcc", ye.sf());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String pcc(List<com.bytedance.sdk.openadsdk.oo.pcc> list) {
        String str;
        if (list.size() > 0 && list.get(0) != null && list.get(0).oo() != null) {
            str = list.get(0).oo().optString("app_log_url");
        } else {
            str = "";
        }
        return kun.vj(str);
    }

    private void pcc(com.bytedance.sdk.openadsdk.oo.pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        try {
            String optString = pccVar.oo().optJSONObject("params").optString("log_extra", "");
            long pcc = of.pcc(optString);
            int oo = of.oo(optString);
            if (pcc == 0) {
                pcc = this.pcc;
            }
            this.pcc = pcc;
            if (oo == 0) {
                oo = this.sf;
            }
            this.sf = oo;
        } catch (Exception e) {
            lo.gm("AdLogParamsGenerate", "getInfoFromLogExtra exception", e.getMessage());
        }
    }

    public JSONObject pcc(List<com.bytedance.sdk.openadsdk.oo.pcc> list, long j, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            pcc(list.get(0));
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.oo.pcc> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().vj());
            }
            jSONObject2.put("event_v3", jSONArray);
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("_gen_time", j);
            jSONObject2.put("local_time", j / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public static pcc pcc() {
        if (wh == null) {
            synchronized (pcc.class) {
                try {
                    if (wh == null) {
                        wh = new pcc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return wh;
    }

    private String pcc(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private String pcc(int i) {
        if (i == 120) {
            return "ldpi";
        }
        if (i == 160) {
            return "mdpi";
        }
        if (i == 240) {
            return "hdpi";
        }
        if (i == 320) {
            return "xhdpi";
        }
        if (i == 480) {
            return "xxhdpi";
        }
        if (i != 640) {
            return "mdpi";
        }
        return "xxxhdpi";
    }

    public List<String> sf(List<com.bytedance.sdk.openadsdk.oo.pcc> list) {
        JSONArray optJSONArray = (list.isEmpty() || list.get(0) == null || list.get(0).oo() == null) ? null : list.get(0).oo().optJSONArray("app_log_url_back");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String wh2 = kun.wh(optJSONArray.optString(i));
                if (!TextUtils.isEmpty(wh2)) {
                    arrayList.add(wh2);
                }
            }
        }
        return arrayList;
    }
}
