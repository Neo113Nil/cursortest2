package com.ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
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
import androidx.autofill.HintConstants;
import com.ironsource.InterfaceC2592p4;
import com.ironsource.InterfaceC2738x7;
import com.ironsource.X3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* loaded from: classes2.dex */
public class Y4 implements InterfaceC2738x7, InterfaceC2738x7.a {
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

    class a implements InvocationHandler {
        a() {
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
                        }
                    }
                } catch (Exception e) {
                    C2556n4.d().a(e);
                }
            }
            return null;
        }
    }

    private String O(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object Q = Q(context);
        return Q.getClass().getMethod(s, null).invoke(Q, null).toString();
    }

    private void P(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = Class.forName(m);
        Object invoke = cls.getMethod(p, Context.class).invoke(cls, context);
        Object invoke2 = invoke.getClass().getMethod(q, null).invoke(invoke, null);
        Class<?> cls2 = Class.forName(n);
        invoke2.getClass().getMethod(r, cls2).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls2}, new a()));
    }

    private Object Q(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = Class.forName(l);
        return cls.getMethod(o, Context.class).invoke(cls, context);
    }

    private String R(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object Q = Q(context);
        return String.valueOf(((Boolean) Q.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(Q, null)).booleanValue());
    }

    private String S(Context context) {
        try {
            return C2383da.a(context, u, A, "");
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    private long T(Context context) {
        try {
            return Long.parseLong(C2383da.a(context, u, B, String.valueOf(-1L)));
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int A(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String B(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public File C(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean D(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int E(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public float F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String G(Context context) {
        try {
            return C2383da.a(context, E, (String) null);
        } catch (Exception e) {
            C2556n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String H(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public List<ApplicationInfo> I(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String J(Context context) {
        V4 v4 = V4.a;
        if (v4.b()) {
            try {
                if (!v4.a()) {
                    return O(context);
                }
                if (this.i != null) {
                    return this.i;
                }
                String O = O(context);
                if (!TextUtils.isEmpty(O)) {
                    this.i = O;
                }
                return O;
            } catch (Exception e) {
                C2556n4.d().a(e);
            }
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int L(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String M(Context context) {
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveActivity != null) {
                return resolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th) {
            C2556n4.d().a(th);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int N(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.InterfaceC2738x7
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

    @Override // com.ironsource.InterfaceC2738x7
    public Long c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String d() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int e() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean f(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public File g(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.InterfaceC2738x7
    public long h() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean i(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean j() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return Environment.isExternalStorageRemovable();
            }
            return false;
        } catch (Exception e) {
            C2556n4.d().a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String l() {
        return Build.MODEL;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int m() {
        return -(TimeZone.getDefault().getOffset(a()) / 60000);
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String n(Context context) {
        if (context == null) {
            return "";
        }
        int N = N(context);
        if (N == 0) {
            return X3.i.C;
        }
        if (N == 1) {
            return X3.i.D;
        }
        if (N == 11) {
            return X3.i.C;
        }
        if (N == 12) {
            return X3.i.D;
        }
        switch (N) {
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

    @Override // com.ironsource.InterfaceC2738x7
    public ActivityManager.MemoryInfo o(Context context) {
        if (context == null || !Jb.Y().h().d()) {
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

    @Override // com.ironsource.InterfaceC2738x7
    public boolean p() {
        return b(AndroidStaticDeviceInfoDataSource.BINARY_SU);
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String q() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public long r(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String s(Context context) {
        return b(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String t() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e) {
            IronLog.INTERNAL.error(e.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int u(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String v(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String w(Context context) {
        try {
            return C2383da.a(context, "IABTCF_TCString", (String) null);
        } catch (Exception e) {
            C2556n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean x(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String y(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean K(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int c() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public synchronized String e(Context context) {
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        if (context == null) {
            return "";
        }
        String a2 = C2383da.a(context, "supersonic_shared_preferen", "auid", "");
        this.c = a2;
        if (TextUtils.isEmpty(a2)) {
            String uuid = UUID.randomUUID().toString();
            this.c = uuid;
            C2383da.b(context, "supersonic_shared_preferen", "auid", uuid);
        }
        return this.c;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public long g() {
        if (j()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int l(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public File m(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int p(Context context) {
        int L = L(context);
        int A2 = A(context);
        return (((L == 0 || L == 2) && A2 == 2) || ((L == 1 || L == 3) && A2 == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean q(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String d(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean h(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(k)) {
                    return true;
                }
            }
        } catch (Exception e) {
            C2556n4.d().a(e);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public File k(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String z(Context context) {
        if (!V4.a.c()) {
            return "";
        }
        try {
            P(context);
            return !TextUtils.isEmpty(this.g) ? this.g : "";
        } catch (Exception e) {
            C2556n4.d().a(e);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String c(Context context) {
        try {
            if (V4.a.a()) {
                if (this.h == null) {
                    String R = R(context);
                    if (!TextUtils.isEmpty(R)) {
                        this.h = R;
                    }
                    return R;
                }
                return this.h;
            }
            return R(context);
        } catch (Exception e) {
            C2556n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int t(Context context) {
        try {
            return C2383da.a(context, "IABTCF_gdprApplies", -1);
        } catch (Exception e) {
            C2556n4.d().a(e);
            return -1;
        }
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public Boolean b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String f() {
        return "android";
    }

    @Override // com.ironsource.InterfaceC2738x7
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
            C2556n4.d().a(e);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int o() {
        return k();
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String s() {
        try {
            if (this.e.isEmpty()) {
                return S(ContextProvider.getInstance().getApplicationContext());
            }
            return this.e;
        } catch (Exception e) {
            C2556n4.d().a(e);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String i() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public String j(Context context) {
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (context == null) {
            return null;
        }
        String a2 = C2383da.a(context, "unityads-installinfo", "unityads-idfi", (String) null);
        this.d = a2;
        return a2;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    @Override // com.ironsource.InterfaceC2738x7
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public synchronized String a(Context context) {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (C2383da.a(context, u, InterfaceC2738x7.a, true)) {
            String a2 = C2383da.a(context, u, w, "");
            if (TextUtils.isEmpty(a2)) {
                String uuid = UUID.randomUUID().toString();
                this.b = uuid;
                C2383da.b(context, u, w, uuid);
            } else {
                this.b = a2;
            }
        }
        return this.b;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public boolean n() {
        return this.f;
    }

    @Override // com.ironsource.InterfaceC2738x7
    public int b() {
        return c();
    }

    private void b(Context context, long j2) {
        try {
            C2383da.b(context, u, B, String.valueOf(j2));
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC2738x7.a
    public void a(Context context, long j2) {
        if (context != null) {
            if (!new C2604pg(new InterfaceC2592p4.a()).a(T(context), j2)) {
                this.e = S(context);
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
                    C2556n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    private void a(Context context, String str) {
        try {
            C2383da.b(context, u, A, str);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
