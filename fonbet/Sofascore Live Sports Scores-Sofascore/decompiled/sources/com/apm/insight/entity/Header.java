package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.l.k;
import com.apm.insight.l.l;
import com.apm.insight.runtime.o;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.C4324ta;
import com.ironsource.L6;
import com.ironsource.U3;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class Header {
    private static final String[] a = {"version_code", "manifest_version_code", C4324ta.b, "update_version_code"};
    private static String d = null;
    private static int e = -1;
    private static int f = -1;
    private Context b;
    private JSONObject c = new JSONObject();

    public Header(Context context) {
        this.b = context;
    }

    @Keep
    public static void addOtherHeader(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (com.apm.insight.l.d.b()) {
                sb.append("MIUI-");
            } else if (com.apm.insight.l.d.c()) {
                sb.append("FLYME-");
            } else {
                String a2 = com.apm.insight.l.d.a();
                if (com.apm.insight.l.d.a(a2)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", l.a());
        } catch (Throwable unused) {
        }
        try {
            DisplayMetrics displayMetrics = e.g().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            String str = i != 120 ? i != 240 ? i != 320 ? "mdpi" : "xhdpi" : "hdpi" : "ldpi";
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", str);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused2) {
        }
        try {
            String language = e.g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put(L6.F, U3.d);
            jSONObject.put("device_id", e.c().a());
            String str2 = Build.VERSION.RELEASE;
            if (!str2.contains(".")) {
                str2 = str2.concat(".0");
            }
            jSONObject.put("os_version", str2);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str3 = Build.MODEL;
            String str4 = Build.BRAND;
            if (str3 == null) {
                str3 = str4;
            } else if (str4 != null && !str3.contains(str4)) {
                str3 = str4 + ' ' + str3;
            }
            jSONObject.put(Payload.DEVICE_MODEL, str3);
            jSONObject.put("device_brand", str4);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", g());
            Context g = e.g();
            String packageName = g.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = g.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i2 = applicationInfo.labelRes;
                if (i2 > 0) {
                    jSONObject.put("display_name", g.getString(i2));
                } else {
                    jSONObject.put("display_name", g.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d.a(jSONObject);
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        try {
            jSONObject.put("access", k.a(e.g()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) e.g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put(L6.R0, networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public static boolean b() {
        int i = f;
        int i2 = i;
        if (i == -1) {
            ?? contains = g().contains("86");
            f = contains;
            i2 = contains;
        }
        return i2 == 1;
    }

    public static boolean c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    public static boolean d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String optString = jSONObject.optString(C4324ta.b);
            if (TextUtils.isEmpty(optString)) {
                return true;
            }
            try {
                return Integer.parseInt(optString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    private static String g() {
        String str = d;
        if (str != null) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            if (Build.SUPPORTED_ABIS.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (i >= strArr.length) {
                        break;
                    }
                    sb.append(strArr[i]);
                    if (i != strArr.length - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            } else {
                sb = new StringBuilder(Build.CPU_ABI);
            }
            if (TextUtils.isEmpty(sb.toString())) {
                d = "unknown";
            }
            String sb2 = sb.toString();
            d = sb2;
            return sb2;
        } catch (Exception e2) {
            com.apm.insight.a.b((Throwable) e2);
            d = "unknown";
            return "unknown";
        }
    }

    public final JSONObject a(@Nullable Map<String, Object> map) {
        if (map == null) {
            return this.c;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!this.c.has(entry.getKey())) {
                this.c.put(entry.getKey(), entry.getValue());
            }
        }
        String[] strArr = a;
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (map.containsKey(str)) {
                try {
                    this.c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Throwable unused) {
                    this.c.put(str, map.get(str));
                }
            }
        }
        if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
            try {
                this.c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
            } catch (Throwable unused2) {
            }
        }
        if (map.containsKey("iid")) {
            this.c.put("udid", map.get("iid"));
            this.c.remove("iid");
        }
        if (map.containsKey("version_name")) {
            this.c.put("app_version", map.get("version_name"));
            this.c.remove("version_name");
        }
        return this.c;
    }

    public final JSONObject e() {
        try {
            long f2 = e.a().f();
            if (f2 > 0) {
                this.c.put("user_id", f2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this.c;
    }

    public final JSONObject f() {
        return this.c;
    }

    public static Header b(Context context) {
        Header a2 = a(context);
        a(a2);
        b(a2);
        a2.c();
        a2.d();
        a2.e();
        return a2;
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public static void b(Header header) {
        if (header == null) {
            return;
        }
        addOtherHeader(header.c);
    }

    public final JSONObject d() {
        try {
            this.c.put("device_id", e.c().a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this.c;
    }

    public final JSONObject c() {
        return a(e.a().a());
    }

    public static Header a(long j) {
        Header a2;
        o a3 = o.a();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject a4 = a3.a(j);
        if (a4 != null && a4.length() != 0) {
            try {
                if (!a4.has(C4324ta.b)) {
                    a4.put(C4324ta.b, 4444);
                }
            } catch (Exception unused) {
            }
            a2 = new Header(e.g());
        } else {
            a2 = a(e.g());
            a2.c();
            try {
                a2.c.put("errHeader", 1);
            } catch (Throwable unused2) {
            }
        }
        b(a2);
        a2.a(a4);
        return a2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public static boolean a() {
        int i = e;
        int i2 = i;
        if (i == -1) {
            ?? contains = g().contains("64");
            e = contains;
            i2 = contains;
        }
        return i2 == 1;
    }

    public final JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.c;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                this.c.put(next, jSONObject.opt(next));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this.c;
    }

    public static Header a(Context context) {
        Header header = new Header(context);
        JSONObject jSONObject = header.c;
        try {
            jSONObject.put("sdk_version", 20089);
            jSONObject.put("sdk_version_name", "2008-20250701130429");
        } catch (Exception unused) {
        }
        return header;
    }

    public static Header a(Header header) {
        addRuntimeHeader(header.c);
        return header;
    }
}
