package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.android.core.util.a;
import io.sentry.protocol.C4799a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.sentry.android.core.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4704q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f51267a = new io.sentry.android.core.util.a(new a.InterfaceC0747a() { // from class: io.sentry.android.core.l0
        @Override // io.sentry.android.core.util.a.InterfaceC0747a
        public final Object a(Context context) {
            return AbstractC4704q0.d(context);
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f51268b = new io.sentry.android.core.util.a(new a.InterfaceC0747a() { // from class: io.sentry.android.core.m0
        @Override // io.sentry.android.core.util.a.InterfaceC0747a
        public final Object a(Context context) {
            return AbstractC4704q0.b(context);
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f51269c = new io.sentry.android.core.util.a(new a.InterfaceC0747a() { // from class: io.sentry.android.core.n0
        @Override // io.sentry.android.core.util.a.InterfaceC0747a
        public final Object a(Context context) {
            return AbstractC4704q0.a(context);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f51270d = new io.sentry.android.core.util.a(new a.InterfaceC0747a() { // from class: io.sentry.android.core.o0
        @Override // io.sentry.android.core.util.a.InterfaceC0747a
        public final Object a(Context context) {
            return AbstractC4704q0.c(context);
        }
    });

    /* renamed from: e, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f51271e = new io.sentry.android.core.util.a(new a.InterfaceC0747a() { // from class: io.sentry.android.core.p0
        @Override // io.sentry.android.core.util.a.InterfaceC0747a
        public final Object a(Context context) {
            return AbstractC4704q0.e(context);
        }
    });

    /* renamed from: io.sentry.android.core.q0$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f51272a;

        /* renamed from: b, reason: collision with root package name */
        public final String f51273b;

        public a(boolean z10, String str) {
            this.f51272a = z10;
            this.f51273b = str;
        }

        public Map a() {
            HashMap hashMap = new HashMap();
            hashMap.put("isSideLoaded", String.valueOf(this.f51272a));
            String str = this.f51273b;
            if (str != null) {
                hashMap.put("installerStore", str);
            }
            return hashMap;
        }
    }

    /* renamed from: io.sentry.android.core.q0$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f51274a;
        private final String[] splitNames;

        public b(boolean z10, String[] strArr) {
            this.f51274a = z10;
            this.splitNames = strArr;
        }

        public String[] a() {
            return this.splitNames;
        }

        public boolean b() {
            return this.f51274a;
        }
    }

    public static /* synthetic */ String a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 != 0) {
                return context.getString(i10);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo c(Context context) {
        PackageManager.ApplicationInfoFlags of2;
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of2 = PackageManager.ApplicationInfoFlags.of(128L);
            applicationInfo = packageManager.getApplicationInfo(packageName, of2);
            return applicationInfo;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo d(Context context) {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of2 = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of2);
            return packageInfo;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo e(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        Intent intent;
        if (!context.getPackageName().endsWith(".test")) {
            return false;
        }
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                intent = it.next().getTaskInfo().baseIntent;
                ComponentName component = intent.getComponent();
                if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Context g(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static ApplicationInfo h(Context context, C4683i0 c4683i0) {
        return c4683i0.d() >= 33 ? (ApplicationInfo) f51270d.a(context) : (ApplicationInfo) f51271e.a(context);
    }

    public static String i(Context context) {
        return (String) f51269c.a(context);
    }

    public static String[] j() {
        return Build.SUPPORTED_ABIS;
    }

    public static DisplayMetrics k(Context context, ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Error getting DisplayMetrics.", th2);
            return null;
        }
    }

    public static String l(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    public static String m(ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                return readLine;
            } finally {
            }
        } catch (IOException e10) {
            iLogger.b(EnumC4788n3.ERROR, "Exception while attempting to read kernel information", e10);
            return property;
        }
    }

    public static ActivityManager.MemoryInfo n(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.c(EnumC4788n3.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    public static PackageInfo o(Context context, int i10, ILogger iLogger, C4683i0 c4683i0) {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        try {
            if (c4683i0.d() < 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
            }
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of2 = PackageManager.PackageInfoFlags.of(i10);
            packageInfo = packageManager.getPackageInfo(packageName, of2);
            return packageInfo;
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    public static PackageInfo p(Context context, C4683i0 c4683i0) {
        return c4683i0.d() >= 33 ? (PackageInfo) f51267a.a(context) : (PackageInfo) f51268b.a(context);
    }

    public static String q(PackageInfo packageInfo, C4683i0 c4683i0) {
        long longVersionCode;
        if (c4683i0.d() < 28) {
            return r(packageInfo);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }

    public static String r(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean s() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent t(Context context, F3 f32, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return u(context, new C4683i0(f32.getLogger()), broadcastReceiver, intentFilter, handler);
    }

    public static Intent u(Context context, C4683i0 c4683i0, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        Intent registerReceiver;
        if (c4683i0.d() < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4);
        return registerReceiver;
    }

    public static a v(Context context, ILogger iLogger, C4683i0 c4683i0) {
        String str;
        try {
            PackageInfo p10 = p(context, c4683i0);
            PackageManager packageManager = context.getPackageManager();
            if (p10 != null && packageManager != null) {
                str = p10.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.c(EnumC4788n3.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    public static b w(Context context, C4683i0 c4683i0) {
        Bundle bundle;
        ApplicationInfo h10 = h(context, c4683i0);
        PackageInfo p10 = p(context, c4683i0);
        if (p10 == null) {
            return null;
        }
        return new b((h10 == null || (bundle = h10.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), p10.splitNames);
    }

    public static void x(PackageInfo packageInfo, C4683i0 c4683i0, C4713v0 c4713v0, C4799a c4799a) {
        c4799a.n(packageInfo.packageName);
        c4799a.q(packageInfo.versionName);
        c4799a.m(q(packageInfo, c4683i0));
        HashMap hashMap = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                hashMap.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i10] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        c4799a.s(hashMap);
        if (c4713v0 != null) {
            try {
                b m10 = c4713v0.m();
                if (m10 != null) {
                    c4799a.t(Boolean.valueOf(m10.b()));
                    if (m10.a() != null) {
                        c4799a.u(Arrays.asList(m10.a()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
