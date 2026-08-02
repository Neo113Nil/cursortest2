package io.sentry.android.core;

import J0.C3349u1;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.sentry.I2;
import io.sentry.ILogger;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"NewApi"})
    @NotNull
    private static final io.sentry.android.core.util.a<PackageInfo> f66915a = new io.sentry.android.core.util.a<>(new T7.P(6));

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.sentry.android.core.util.a<PackageInfo> f66916b = new io.sentry.android.core.util.a<>(new T7.Q(3));

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.sentry.android.core.util.a<String> f66917c = new io.sentry.android.core.util.a<>(new C3349u1(3));

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"NewApi"})
    @NotNull
    private static final io.sentry.android.core.util.a<ApplicationInfo> f66918d = new io.sentry.android.core.util.a<>(new Cm.e(8));

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final io.sentry.android.core.util.a<ApplicationInfo> f66919e = new io.sentry.android.core.util.a<>(new K00.b());

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f66920a;

        /* renamed from: b, reason: collision with root package name */
        private final String f66921b;

        public a(boolean z11, String str) {
            this.f66920a = z11;
            this.f66921b = str;
        }

        @NotNull
        public final HashMap a() {
            HashMap hashMap = new HashMap();
            hashMap.put("isSideLoaded", String.valueOf(this.f66920a));
            String str = this.f66921b;
            if (str != null) {
                hashMap.put("installerStore", str);
            }
            return hashMap;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f66922a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f66923b;

        public b(boolean z11, String[] strArr) {
            this.f66922a = z11;
            this.f66923b = strArr;
        }

        public final String[] a() {
            return this.f66923b;
        }

        public final boolean b() {
            return this.f66922a;
        }
    }

    @SuppressLint({"NewApi"})
    static ApplicationInfo a(@NotNull Context context, @NotNull I i11) {
        i11.getClass();
        return Build.VERSION.SDK_INT >= 33 ? f66918d.a(context) : f66919e.a(context);
    }

    static String b(@NotNull Context context) {
        return f66917c.a(context);
    }

    static String c(@NotNull ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            iLogger.a(I2.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    static ActivityManager.MemoryInfo d(@NotNull Context context, @NotNull ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.c(I2.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            iLogger.a(I2.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    static PackageInfo e(@NotNull Context context, @NotNull I i11) {
        i11.getClass();
        return Build.VERSION.SDK_INT >= 33 ? f66915a.a(context) : f66916b.a(context);
    }

    @SuppressLint({"NewApi"})
    @NotNull
    static String f(@NotNull PackageInfo packageInfo, @NotNull I i11) {
        long longVersionCode;
        i11.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            return Integer.toString(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }

    public static boolean g() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }
}
