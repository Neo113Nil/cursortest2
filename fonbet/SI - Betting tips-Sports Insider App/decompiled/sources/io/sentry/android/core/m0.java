package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import io.appmetrica.analytics.impl.ap;
import io.sentry.ILogger;
import io.sentry.b5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e6.j f15776a = new e6.j(new ap(18));

    /* renamed from: b, reason: collision with root package name */
    public static final e6.j f15777b = new e6.j(new ap(19));

    /* renamed from: c, reason: collision with root package name */
    public static final e6.j f15778c = new e6.j(new ap(20));

    /* renamed from: d, reason: collision with root package name */
    public static final e6.j f15779d = new e6.j(new ap(21));

    /* renamed from: e, reason: collision with root package name */
    public static final e6.j f15780e = new e6.j(new ap(22));

    public static /* synthetic */ ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            iLogger.e(b5.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    public static ActivityManager.MemoryInfo d(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.h(b5.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            iLogger.e(b5.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    public static PackageInfo e(Context context, ILogger iLogger, n0 n0Var) {
        try {
            n0Var.getClass();
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (Throwable th2) {
            iLogger.e(b5.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    public static PackageInfo f(Context context, n0 n0Var) {
        n0Var.getClass();
        return Build.VERSION.SDK_INT >= 33 ? (PackageInfo) f15776a.a(context) : (PackageInfo) f15777b.a(context);
    }

    public static String g(PackageInfo packageInfo, n0 n0Var) {
        n0Var.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean h() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent i(Context context, n0 n0Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        n0Var.getClass();
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }
}
