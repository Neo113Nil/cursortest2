package com.ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.ironsource.InterfaceC4488p4;
import com.ironsource.InterfaceC4652y7;
import com.ironsource.X3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import xsna.fp;

/* loaded from: classes13.dex */
public class Y4 implements InterfaceC4652y7, InterfaceC4652y7.a {
    private static final String A = "browser_user_agent";
    private static final String B = "browser_user_agent_time";
    private static final String C = "IABTCF_gdprApplies";
    private static final String D = "IABTCF_TCString";
    private static final String E = "IABTCF_AddtlConsent";
    private static final String j = "android";
    private static final String k = "com.google.android.gms.permission.AD_ID";
    private static final String l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final String m = "com.google.android.gms.appset.AppSet";
    private static final String n = "com.google.android.gms.tasks.OnSuccessListener";
    private static final String o = "getAdvertisingIdInfo";
    private static final String p = "getClient";
    private static final String q = "getAppSetIdInfo";
    private static final String r = "addOnSuccessListener";
    private static final String s = "getId";
    private static final String t = "isLimitAdTrackingEnabled";
    private static final String u = "Mediation_Shared_Preferences";
    private static final String v = "supersonic_shared_preferen";
    private static final String w = "cachedUUID";
    private static final String x = "auid";
    private static final String y = "unityads-installinfo";
    private static final String z = "unityads-idfi";
    private String b = null;
    private String c = null;
    private String d = null;
    private String e = "";
    private boolean f = false;
    private String g = "";
    private volatile String h;
    private volatile String i;

    public class a implements InvocationHandler {
        public a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String obj3 = obj2.getClass().getMethod(Y4.s, null).invoke(objArr[0], null).toString();
                        if (!TextUtils.isEmpty(obj3)) {
                            Y4.this.g = obj3;
                            return null;
                        }
                    }
                } catch (Exception e) {
                    C4452n4.d().a(e);
                }
            }
            return null;
        }
    }

    private String N(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object P = P(context);
        return P.getClass().getMethod(s, null).invoke(P, null).toString();
    }

    private void O(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object invoke = AppSet.class.getMethod(p, Context.class).invoke(AppSet.class, context);
        Object invoke2 = invoke.getClass().getMethod(q, null).invoke(invoke, null);
        invoke2.getClass().getMethod(r, OnSuccessListener.class).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
    }

    private Object P(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return AdvertisingIdClient.class.getMethod(o, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    private String Q(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object P = P(context);
        return String.valueOf(((Boolean) P.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(P, null)).booleanValue());
    }

    private String R(Context context) {
        try {
            return C4297ea.a(context, u, A, "");
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    private long S(Context context) {
        try {
            return Long.parseLong(C4297ea.a(context, u, B, String.valueOf(-1L)));
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int A(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String B(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public File C(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean D(Context context) {
        Intent a2 = fp.a("android.intent.action.BATTERY_CHANGED", context, null);
        int intExtra = a2 != null ? a2.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int E(Context context) {
        Intent a2 = fp.a("android.intent.action.BATTERY_CHANGED", context, null);
        if (a2 != null) {
            return a2.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public float F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String G(Context context) {
        try {
            return C4297ea.a(context, E, (String) null);
        } catch (Exception e) {
            C4452n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String H(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String I(Context context) {
        V4 v4 = V4.a;
        if (v4.b()) {
            try {
                if (!v4.a()) {
                    return N(context);
                }
                if (this.i != null) {
                    return this.i;
                }
                String N = N(context);
                if (TextUtils.isEmpty(N)) {
                    return N;
                }
                this.i = N;
                return N;
            } catch (Exception e) {
                C4452n4.d().a(e);
            }
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean J(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int K(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String L(Context context) {
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveActivity != null) {
                return resolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th) {
            C4452n4.d().a(th);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int M(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public Long c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String d() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int e() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean f(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public File g(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.InterfaceC4652y7
    public long h() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean i(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean j() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                if (Environment.isExternalStorageRemovable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C4452n4.d().a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String l() {
        return Build.MODEL;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int m() {
        return -(TimeZone.getDefault().getOffset(a()) / 60000);
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String n(Context context) {
        if (context == null) {
            return "";
        }
        int M = M(context);
        if (M == 0) {
            return X3.i.C;
        }
        if (M == 1) {
            return X3.i.D;
        }
        if (M == 11) {
            return X3.i.C;
        }
        if (M == 12) {
            return X3.i.D;
        }
        switch (M) {
            case 6:
            case 8:
                return X3.i.C;
            case 7:
            case 9:
                return X3.i.D;
            default:
                return "none";
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public ActivityManager.MemoryInfo o(Context context) {
        if (context == null || !Kb.Y().h().d()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean p() {
        return b("su");
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String q() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public long r(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String s(Context context) {
        return b(context) ? "Tablet" : DeviceInfo.STR_TYPE_PHONE;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String t() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e) {
            IronLog.INTERNAL.error(e.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int u(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String v(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String w(Context context) {
        try {
            return C4297ea.a(context, "IABTCF_TCString", (String) null);
        } catch (Exception e) {
            C4452n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean x(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String y(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String z(Context context) {
        if (!V4.a.c()) {
            return "";
        }
        try {
            O(context);
            return !TextUtils.isEmpty(this.g) ? this.g : "";
        } catch (Exception e) {
            C4452n4.d().a(e);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int c() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public synchronized String e(Context context) {
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        if (context == null) {
            return "";
        }
        String a2 = C4297ea.a(context, "supersonic_shared_preferen", "auid", "");
        this.c = a2;
        if (TextUtils.isEmpty(a2)) {
            String uuid = UUID.randomUUID().toString();
            this.c = uuid;
            C4297ea.b(context, "supersonic_shared_preferen", "auid", uuid);
        }
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public long g() {
        if (j()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int l(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public File m(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int p(Context context) {
        int K = K(context);
        int A2 = A(context);
        return (((K == 0 || K == 2) && A2 == 2) || ((K == 1 || K == 3) && A2 == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean q(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String d(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean h(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(k)) {
                    return true;
                }
            }
        } catch (Exception e) {
            C4452n4.d().a(e);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public File k(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int t(Context context) {
        try {
            return C4297ea.a(context, C, -1);
        } catch (Exception e) {
            C4452n4.d().a(e);
            return -1;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String c(Context context) {
        try {
            if (V4.a.a()) {
                if (this.h == null) {
                    String Q = Q(context);
                    if (TextUtils.isEmpty(Q)) {
                        return Q;
                    }
                    this.h = Q;
                    return Q;
                }
                return this.h;
            }
            return Q(context);
        } catch (Exception e) {
            C4452n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String f() {
        return "android";
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String s() {
        try {
            if (this.e.isEmpty()) {
                return R(ContextProvider.getInstance().getApplicationContext());
            }
            return this.e;
        } catch (Exception e) {
            C4452n4.d().a(e);
            return "";
        }
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public Boolean b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String i() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int o() {
        return k();
    }

    @Override // com.ironsource.InterfaceC4652y7
    public float r() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    private boolean b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                if (new File(strArr[i] + str).exists()) {
                    return true;
                }
            }
        } catch (Exception e) {
            C4452n4.d().a(e);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public String j(Context context) {
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (context == null) {
            return null;
        }
        String a2 = C4297ea.a(context, "unityads-installinfo", "unityads-idfi", (String) null);
        this.d = a2;
        return a2;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean n() {
        return this.f;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    @Override // com.ironsource.InterfaceC4652y7
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.ironsource.InterfaceC4652y7
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public synchronized String a(Context context) {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (C4297ea.a(context, u, InterfaceC4652y7.a, true)) {
            String a2 = C4297ea.a(context, u, w, "");
            if (TextUtils.isEmpty(a2)) {
                String uuid = UUID.randomUUID().toString();
                this.b = uuid;
                C4297ea.b(context, u, w, uuid);
            } else {
                this.b = a2;
            }
        }
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4652y7
    public int b() {
        return c();
    }

    private void b(Context context, long j2) {
        try {
            C4297ea.b(context, u, B, String.valueOf(j2));
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4652y7.a
    public void a(Context context, long j2) {
        if (context != null) {
            if (!new C4607vg(new InterfaceC4488p4.a()).a(S(context), j2)) {
                this.e = R(context);
                this.f = !r0.isEmpty();
            }
            if (this.e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j2 > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e) {
                    C4452n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    private void a(Context context, String str) {
        try {
            C4297ea.b(context, u, A, str);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
