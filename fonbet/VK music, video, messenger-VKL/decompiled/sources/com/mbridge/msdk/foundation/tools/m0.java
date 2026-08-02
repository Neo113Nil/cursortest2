package com.mbridge.msdk.foundation.tools;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ironsource.C4217a2;
import com.ironsource.C4553sg;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBConfiguration;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.i5s;
import xsna.l6g;
import xsna.xe9;

/* compiled from: SameDiTool.java */
/* loaded from: classes13.dex */
public class m0 extends v {
    private static int A = 0;
    private static String B = "";
    private static Object C = null;
    private static int D = 0;
    private static int E = 0;
    private static long F = -1;
    private static long G = -1;
    private static String H = "";
    private static String I = "";
    private static String J = "";
    private static String j = "";
    private static String k = "";
    private static int l = -1;
    private static String m = "";
    private static int n = -1;
    private static int o = 0;
    private static String p = "";
    private static int q = -1;
    private static String r = "";
    private static String s = "";
    private static volatile int t = -1;
    private static String u = "";
    private static String v = "";
    private static int w = 0;
    private static String x = "";
    private static String y = "";
    private static int z = -1;

    /* compiled from: SameDiTool.java */
    public class a implements Runnable {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.c(this.a);
        }
    }

    /* compiled from: SameDiTool.java */
    public class b implements Runnable {
        final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                str = WebSettings.getDefaultUserAgent(this.a);
            } catch (Throwable unused) {
                str = null;
            }
            try {
                if (TextUtils.isEmpty(str) || str.equals(m0.y)) {
                    return;
                }
                String unused2 = m0.y = str;
                m0.H(this.a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: SameDiTool.java */
    public class c implements Runnable {
        final /* synthetic */ Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
                if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.z) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = m0.t = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        int unused2 = m0.t = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
                    if (telephonyManager == null) {
                        int unused3 = m0.t = 0;
                    } else {
                        int unused4 = m0.t = m0.c(telephonyManager.getNetworkType());
                    }
                }
            } catch (Exception unused5) {
                int unused6 = m0.t = 0;
            }
        }
    }

    /* compiled from: SameDiTool.java */
    public class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = m0.x = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: SameDiTool.java */
    public class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.util.c.a();
            } catch (Exception e) {
                q0.b("SameDiTool", e.getMessage());
            }
        }
    }

    /* compiled from: SameDiTool.java */
    public class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Context d = com.mbridge.msdk.foundation.controller.c.n().d();
                if (d != null) {
                    ActivityManager activityManager = (ActivityManager) d.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    long unused = m0.G = memoryInfo.totalMem;
                    long unused2 = m0.F = memoryInfo.availMem;
                }
            } catch (Throwable th) {
                q0.b("SameDiTool", th.getMessage());
            }
        }
    }

    private static void A(Context context) {
        try {
            new Thread(new b(context)).start();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static int B() {
        try {
            if (v0.i()) {
                return 1;
            }
            return v0.j() ? 2 : 0;
        } catch (Exception e2) {
            q0.b("SameDiTool", e2.getMessage());
            return 0;
        }
    }

    public static int C() {
        return z;
    }

    public static void D(Context context) {
        try {
            v.e(context);
            p();
            r();
            t(context);
            C(context);
            B(context);
            G(context);
            o();
            t();
            p(context);
            y();
            com.mbridge.msdk.foundation.same.a.B = false;
            com.mbridge.msdk.foundation.same.a.z = v0.b("android.permission.ACCESS_NETWORK_STATE", context);
            x(context);
            m();
            g.b();
            g();
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
    }

    public static int E() {
        return q;
    }

    public static boolean F(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static int G(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    private static void H() {
        String str = Build.VERSION.RELEASE;
        String o2 = o();
        String str2 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(o2)) {
            y = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        StringBuilder a2 = xe9.a("Mozilla/5.0 (Linux; Android ", str, "; ", o2, " Build/");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        y = i5s.a(a2, str2, ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
    }

    public static int c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static Object d(String str) {
        if (C == null) {
            C = v0.g(str);
        }
        return C;
    }

    public static int e(String str) {
        if (E == 0) {
            E = v0.f(str);
        }
        return E;
    }

    public static void g(Context context) {
        try {
            c cVar = new c(context);
            if (com.mbridge.msdk.foundation.same.threadpool.a.d().getActiveCount() < 1) {
                com.mbridge.msdk.foundation.same.threadpool.a.d().execute(cVar);
            }
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                g.c(context);
            } else {
                new Handler(context.getMainLooper()).post(new a(context));
            }
        } catch (Exception e2) {
            q0.b("SameDiTool", "", e2);
        }
    }

    public static String i() {
        if (TextUtils.isEmpty(y)) {
            l(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        return y;
    }

    public static String j() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static String k(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) || context == null) {
                return C4217a2.f;
            }
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String format = new DecimalFormat("0.0").format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(format) ? C4217a2.f : format;
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
            return C4217a2.f;
        }
    }

    public static String l(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        i(context);
        try {
            if (Looper.myLooper() != Looper.getMainLooper() || MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(y)) {
                    H();
                }
                A(context);
            } else if (TextUtils.isEmpty(y)) {
                try {
                    y = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(y)) {
                    try {
                        Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                        declaredConstructor.setAccessible(true);
                        y = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                        declaredConstructor.setAccessible(false);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (TextUtils.isEmpty(y)) {
                        try {
                            y = new WebView(context).getSettings().getUserAgentString();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    if (TextUtils.isEmpty(y)) {
                        H();
                    }
                }
            } else {
                A(context);
            }
        } catch (Throwable th3) {
            q0.b("SameDiTool", th3.getMessage(), th3);
        }
        H(context);
        return y;
    }

    public static int m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap v2 = v(context);
            return v2.get("height") == null ? displayMetrics.heightPixels : ((Integer) v2.get("height")).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int n(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap v2 = v(context);
            return v2.get("width") == null ? displayMetrics.widthPixels : ((Integer) v2.get("width")).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String o() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    public static String p(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(p)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                String languageTag = locale.toLanguageTag();
                p = languageTag;
                return languageTag;
            } catch (Throwable th) {
                q0.a("SameDiTool", th.getMessage());
                p = "en-US";
            }
        }
        return p;
    }

    public static String q(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                r = "";
            } else if (TextUtils.isEmpty(r)) {
                if (context == null) {
                    r = "";
                    return "";
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    r = simOperator.substring(0, Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            r = "";
        }
        return r;
    }

    public static String r(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                s = "";
            } else if (TextUtils.isEmpty(s)) {
                if (context == null) {
                    s = "";
                    return r;
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    s = simOperator.substring(Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            s = "";
        }
        return s;
    }

    @SuppressLint({"MissingPermission"})
    public static int s(Context context) {
        try {
            Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return t;
            }
            if (d2 == null) {
                return t;
            }
            if (t != -1) {
                g(d2);
                return t;
            }
            t = 0;
            return t;
        } catch (Exception e2) {
            q0.b("SameDiTool", e2.getMessage(), e2);
            t = 0;
            return t;
        }
    }

    public static String t(Context context) {
        if (context == null) {
            return v;
        }
        try {
            if (!TextUtils.isEmpty(v)) {
                return v;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            v = str;
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String u() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static HashMap v(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
            hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
            return hashMap;
        } catch (Exception e2) {
            q0.b("SameDiTool", e2.getMessage(), e2);
            return hashMap;
        }
    }

    public static String w() {
        try {
            if (TextUtils.isEmpty(I)) {
                Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
                long a2 = l0.a();
                String j2 = j(d2);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", j2);
                    jSONObject.put("2", String.valueOf(G));
                    jSONObject.put("3", String.valueOf(a2));
                    jSONObject.put("4", "");
                    jSONObject.put(CampaignEx.CLICKMODE_ON, "");
                } catch (Exception e2) {
                    q0.b("SameDiTool", e2.getMessage());
                }
                String b2 = com.mbridge.msdk.foundation.tools.a.b(jSONObject.toString());
                I = b2;
                if (b2 == null) {
                    I = "";
                }
            }
        } catch (Exception e3) {
            q0.b("SameDiTool", e3.getMessage());
        }
        return I;
    }

    public static int x() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        long j2 = G;
        if (j2 > 0) {
            return Long.valueOf((j2 / 1000) / 1000).intValue();
        }
        return -1;
    }

    public static String y(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e2) {
            q0.b("SameDiTool", e2.getMessage(), e2);
            return "";
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    public static String z(Context context) {
        return (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) ? String.valueOf(G) : "";
    }

    public static String C(Context context) {
        if (context == null) {
            return B;
        }
        try {
            if (!TextUtils.isEmpty(B)) {
                return B;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            B = str;
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int E(Context context) {
        if (l == -1) {
            l = v0.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return l;
    }

    public static int F() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return -1;
        }
        String str = Build.FINGERPRINT;
        if (!str.startsWith(PeerVideoSettingsBitrateTable.CODEC_GENERIC) && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith(PeerVideoSettingsBitrateTable.CODEC_GENERIC) || !Build.DEVICE.startsWith(PeerVideoSettingsBitrateTable.CODEC_GENERIC)) && !"google_sdk".equals(Build.PRODUCT))) {
                String str3 = Build.HARDWARE;
                if (!str3.equals("goldfish") && !str3.equals("vbox86") && !str3.contains("qemu")) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static String a(Context context, int i) {
        TelephonyManager telephonyManager;
        if (i != 0 && i != 9) {
            try {
                return (!com.mbridge.msdk.foundation.same.a.z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
            } catch (Throwable th) {
                q0.b("SameDiTool", th.getMessage(), th);
            }
        }
        return "";
    }

    public static void f(String str) {
        J = str;
    }

    public static String j(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(k)) {
                    k = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                k = "";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            k = "";
        }
        return k;
    }

    public static String z() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(H)) {
            long j2 = G;
            if (j2 > 0) {
                H = Math.ceil(Float.valueOf(j2 / 1.0737418E9f).doubleValue()) + "GB";
            }
        }
        return H;
    }

    public static int A() {
        try {
        } catch (Exception e2) {
            o = 0;
            q0.b("SameDiTool", e2.getMessage());
        }
        if (!s0.a().a("v_a_d_p", false)) {
            return 0;
        }
        if (v0.i()) {
            o = 1;
        } else if (v0.j()) {
            o = 2;
        } else {
            o = 0;
        }
        return o;
    }

    public static int B(Context context) {
        if (context == null) {
            return A;
        }
        int i = A;
        if (i != 0) {
            return i;
        }
        try {
            int i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            A = i2;
            return i2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static int G() {
        if (n == -1) {
            n = v0.g() ? 1 : 0;
        }
        return n;
    }

    public static void d(int i) {
        q = i;
    }

    private static void i(Context context) {
        if (TextUtils.isEmpty(y)) {
            try {
                y = y0.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th) {
                q0.b("SameDiTool", th.getMessage(), th);
            }
        }
    }

    public static float o(Context context) {
        Resources resources;
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null && (resources = context.getResources()) != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
        return -1.0f;
    }

    public static int u(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return -1;
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
            return -1;
        }
    }

    public static int x(Context context) {
        if (context == null) {
            return w;
        }
        if (w == 0) {
            try {
                w = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e2) {
                q0.b("SameDiTool", e2.getMessage());
            }
        }
        return w;
    }

    public static void g() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new e());
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
    }

    public static int h() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return 0;
            }
            long j2 = F;
            if (j2 > 0) {
                return Long.valueOf((j2 / 1000) / 1000).intValue();
            }
            return -1;
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage(), th);
            return -1;
        }
    }

    public static String m() {
        String str;
        if (!TextUtils.isEmpty(m)) {
            return m;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod(C4553sg.b, null).invoke(cls2, null));
                } catch (Throwable th2) {
                    q0.b("SameDiTool", th2.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th3) {
                    q0.b("SameDiTool", th3.getMessage());
                }
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = k0.b(jSONObject2);
                }
                m = jSONObject2;
            } else {
                m = "android";
            }
        } catch (Throwable th4) {
            q0.b("SameDiTool", th4.getMessage());
        }
        return m;
    }

    public static int n() {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    public static String y() {
        try {
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage(), th);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            return "";
        }
        if (TextUtils.isEmpty(x)) {
            new Thread(new d()).start();
            return x;
        }
        return x;
    }

    public static String a(String str, Context context) {
        try {
        } catch (Exception e2) {
            q0.b("SameDiTool", e2.getMessage(), e2);
        }
        if (!TextUtils.isEmpty(j)) {
            return j;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            j = context.getPackageManager().getInstallerPackageName(str);
            q0.a("SameDiTool", "PKGSource:" + j);
        }
        return j;
    }

    public static String t() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    public static Map<String, String> k() {
        Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
        HashMap hashMap = new HashMap();
        hashMap.put("model", o());
        hashMap.put("brand", t());
        hashMap.put("screen_size", n(d2) + "x" + m(d2));
        hashMap.put(StatCustomFieldKey.NETWORK_TYPE, String.valueOf(t));
        hashMap.put("useragent", y);
        hashMap.put("language", p(d2));
        hashMap.put("os_version", r());
        hashMap.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, y());
        hashMap.put("coppa", String.valueOf(com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c()));
        hashMap.put("platform", "1");
        hashMap.put(O6.X0, g.d());
        hashMap.put("gaid2", g.b);
        hashMap.put("package_name", t(d2));
        hashMap.put(CommonUrlParts.APP_VERSION, C(d2));
        hashMap.put("app_version_code", String.valueOf(B(d2)));
        hashMap.put("pkg_source", a(t(d2), d2));
        hashMap.put("version_flag", "1");
        hashMap.put("dyview_type", "1");
        hashMap.put("unknown_source", String.valueOf(C()));
        hashMap.put("sdk_version", MBConfiguration.SDK_VERSION);
        hashMap.put("mcc", q(d2));
        hashMap.put("mnc", r(d2));
        hashMap.put("withGP", String.valueOf(E()));
        hashMap.put("has_wx", String.valueOf(E(d2)));
        hashMap.put("opensdk_ver", String.valueOf(D()));
        hashMap.put("adid_limit", String.valueOf(g.a()));
        hashMap.put(X3.i.n, String.valueOf(G(d2)));
        hashMap.put("network_str", a(d2, s(d2)));
        hashMap.put("brt", w(d2));
        hashMap.put("dmf", String.valueOf(F));
        hashMap.put("dmt", String.valueOf(G));
        hashMap.put("font", String.valueOf(o(d2)));
        hashMap.put("fw_type", "2");
        hashMap.put("h", String.valueOf(t0.c()));
        hashMap.put("i", String.valueOf(t0.a()));
        hashMap.put(O6.a1, String.valueOf(u(d2)));
        hashMap.put("simu", String.valueOf(F()));
        hashMap.put("target_os_version", String.valueOf(x(d2)));
        hashMap.put(O6.i0, k(d2));
        hashMap.put("ui_orientation", String.valueOf(G(d2)));
        hashMap.put("tun", String.valueOf(A()));
        hashMap.put("gp_version", v());
        hashMap.put("os_api_version", String.valueOf(n()));
        hashMap.put("manufacturer", q());
        hashMap.put("weChatSupportApi", String.valueOf(e("")));
        hashMap.put("hasWXOpenSDK", String.valueOf(G()));
        hashMap.put("az_aid_info_origin", g.e());
        return hashMap;
    }

    public static String v() {
        return J;
    }

    private static void p() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new f());
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
    }

    public static String q() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    public static String r() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(u)) {
            u = l6g.a(s(), "");
        }
        return u;
    }

    public static int s() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String w(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return String.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return "0";
        }
    }

    public static int D() {
        if (D == 0) {
            D = v0.e();
        }
        return D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(Context context) {
        try {
            y0.b(context, "mbridge_ua", y);
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage(), th);
        }
    }

    public static void l() {
        try {
            Object a2 = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID, "");
            Object a3 = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (a2 instanceof String) {
                String str = (String) a2;
                if (!TextUtils.isEmpty(str)) {
                    g.a(str);
                }
                if (a3 instanceof Integer) {
                    g.a(((Integer) a3).intValue());
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SameDiTool", e2.getMessage());
            }
        }
    }
}
