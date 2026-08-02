package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.C4259pg;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    static String a = "NormalDeviceInfoProvider";

    public String a(Context context) {
        Locale locale;
        if (context != null) {
            try {
                if (context.getResources() != null && context.getResources().getConfiguration() != null && (locale = context.getResources().getConfiguration().locale) != null) {
                    return locale.toLanguageTag();
                }
            } catch (Throwable th) {
                q0.a(a, th.getMessage(), th);
            }
        }
        return "en-US";
    }

    public int b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Exception e) {
            q0.b(a, e.getMessage());
            return -1;
        }
    }

    public String c() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
            str = null;
        }
        try {
            if (TextUtils.isEmpty(str) || !str.equals("harmony")) {
                str2 = "android";
            } else {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod(C4259pg.b, null).invoke(cls2, null));
                } catch (Throwable th2) {
                    q0.b(a, th2.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th3) {
                    q0.b(a, th3.getMessage());
                }
                str2 = jSONObject.toString();
                if (!TextUtils.isEmpty(str2)) {
                    str2 = k0.b(str2);
                }
            }
            return str2;
        } catch (Throwable th4) {
            q0.b(a, th4.getMessage());
            return null;
        }
    }

    public String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            q0.b(a, e.getMessage(), e);
            return "";
        }
    }

    public Map<String, Object> e() {
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d == null) {
                return null;
            }
            ActivityManager activityManager = (ActivityManager) d.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            long j2 = memoryInfo.availMem;
            HashMap hashMap = new HashMap();
            hashMap.put("totalMem", Long.valueOf((j / 1024) / 1024));
            hashMap.put(L6.w, Long.valueOf((j2 / 1024) / 1024));
            return hashMap;
        } catch (Throwable th) {
            q0.b(a, th.getMessage(), th);
            return null;
        }
    }

    public int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Integer num = g(context).get("height");
            return num == null ? displayMetrics.heightPixels : num.intValue();
        } catch (Exception e) {
            q0.b(a, e.getMessage(), e);
            return 0;
        }
    }

    public HashMap<String, Integer> g(Context context) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (context == null) {
            return hashMap;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (context instanceof Activity) {
                ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            }
            hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
            hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
            return hashMap;
        } catch (Exception e) {
            q0.b(a, e.getMessage(), e);
            return hashMap;
        }
    }

    public int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Integer num = g(context).get("width");
            return num == null ? displayMetrics.widthPixels : num.intValue();
        } catch (Exception e) {
            q0.b(a, e.getMessage(), e);
            return 0;
        }
    }

    public Map<String, String> i(Context context) {
        if (context == null) {
            return null;
        }
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                return null;
            }
            String substring = simOperator.substring(0, Math.min(3, simOperator.length()));
            String substring2 = simOperator.substring(Math.min(3, simOperator.length()));
            HashMap hashMap = new HashMap();
            hashMap.put("mcc", substring);
            hashMap.put("mnc", substring2);
            return hashMap;
        } catch (Exception e) {
            q0.b(a, e.getMessage(), e);
            return null;
        }
    }

    public int j(Context context) {
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null) {
                    return 1;
                }
                return configuration.orientation == 2 ? 2 : 1;
            } catch (Throwable th) {
                q0.b(a, th.getMessage(), th);
            }
        }
        return 1;
    }

    public int k() {
        try {
            return Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver(), "install_non_market_apps", 0);
        } catch (Throwable th) {
            q0.b(a, th.getMessage(), th);
            return 0;
        }
    }

    public String l(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        try {
            str = Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Throwable th) {
            q0.b(a, th.getMessage(), th);
            str = "";
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public int m() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                String str3 = Build.HARDWARE;
                if (!str3.equals("goldfish") && !str3.equals("vbox86") && !str3.contains("qemu")) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public HashMap<String, Object> n() {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d == null) {
                hashMap.put("available", 0);
                return hashMap;
            }
            PackageManager packageManager = d.getPackageManager();
            if (packageManager == null) {
                hashMap.put("available", 0);
                return hashMap;
            }
            boolean z = packageManager.getApplicationInfo("com.android.vending", 0).enabled;
            PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 0);
            hashMap.put("available", Integer.valueOf(z ? 1 : 2));
            hashMap.put("versionName", packageInfo.versionName);
            hashMap.put("versionCode", Integer.valueOf(packageInfo.versionCode));
            return hashMap;
        } catch (Throwable th) {
            q0.b(a, th.getMessage(), th);
            return hashMap;
        }
    }

    public int o() {
        try {
            return GoogleApiAvailability.e.b(com.mbridge.msdk.foundation.controller.c.n().d(), GoogleApiAvailabilityLight.a);
        } catch (Throwable th) {
            q0.b(a, th.getMessage(), th);
            return -1;
        }
    }

    public int p() {
        return v0.g() ? 1 : 0;
    }

    public long b() {
        try {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String k(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return "0";
        }
    }

    public String d() {
        return Build.MANUFACTURER;
    }

    public int l() {
        return v0.e();
    }

    public String j() {
        try {
            return Arrays.asList(Build.SUPPORTED_ABIS).toString();
        } catch (Throwable th) {
            q0.b(a, th.getMessage(), th);
            return "";
        }
    }

    public String f() {
        return Build.MODEL;
    }

    public int h() {
        return Build.VERSION.SDK_INT;
    }

    public String a(Context context, String str) {
        try {
            return (TextUtils.isEmpty(str) || context == null) ? "" : context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e) {
            q0.b(a, e.getMessage(), e);
            return "";
        }
    }

    public String a() {
        return Build.BRAND;
    }

    public int a(String str) {
        return v0.f(str);
    }

    public String e(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
        } catch (Exception e) {
            q0.b(a, e.getMessage(), e);
            return "";
        }
    }

    public float i() {
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d != null) {
                float f = d.getResources().getDisplayMetrics().density;
                if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return 2.5f;
                }
                return f;
            }
        } catch (Exception e) {
            q0.b(a, e.getMessage(), e);
        }
        return 2.5f;
    }

    public String g() {
        return Build.VERSION.RELEASE;
    }

    public int n(Context context) {
        return v0.c(context, "com.tencent.mm") ? 1 : 0;
    }

    public int m(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (context.getResources() != null && context.getResources().getConfiguration() != null) {
                return (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? 1 : 0;
            }
            return 0;
        } catch (Throwable th) {
            q0.b(a, th.getMessage(), th);
            return 0;
        }
    }

    public int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            q0.b(a, e.getMessage(), e);
            return -1;
        }
    }
}
