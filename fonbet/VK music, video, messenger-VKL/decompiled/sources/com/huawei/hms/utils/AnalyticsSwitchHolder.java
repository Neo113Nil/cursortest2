package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import java.sql.Timestamp;
import org.chromium.base.TimeUtils;

/* loaded from: classes13.dex */
public class AnalyticsSwitchHolder {
    public static final int ANALYTICS_DISABLED = 2;
    public static final int ANALYTICS_ENABLED = 1;
    private static volatile int a;
    private static final Object b = new Object();
    private static volatile Long c = 0L;
    private static volatile boolean d = false;
    private static volatile boolean e = false;

    public class a implements Runnable {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnalyticsSwitchHolder.f(this.a);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnalyticsSwitchHolder.f(this.a);
        }
    }

    private static boolean b(Context context) {
        PackageManager packageManager;
        Bundle bundle;
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bireport.setting");
                }
            } catch (AndroidException | RuntimeException unused) {
            }
        }
        return false;
    }

    private static void c(Context context) {
        c = Long.valueOf(new Timestamp(System.currentTimeMillis()).getTime());
        new Thread(new a(context), "Thread-getStateForHmsAnalyticsProvider").start();
    }

    private static boolean d(Context context) {
        return RegionUtils.isChinaROM(context);
    }

    private static void e(Context context) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (timestamp.getTime() - c.longValue() < TimeUtils.MILLISECONDS_PER_DAY || c.longValue() <= 0) {
            return;
        }
        c = Long.valueOf(timestamp.getTime());
        new Thread(new b(context), "Thread-refreshOobeAnalyticsState").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context) {
        if (context == null) {
            return;
        }
        if (HiAnalyticsUtils.getInstance().getOobeAnalyticsState(context) != 1) {
            synchronized (b) {
                a = 2;
            }
            com.huawei.hms.stats.a.c().a();
            return;
        }
        synchronized (b) {
            a = 1;
        }
        if (HiAnalyticsUtils.getInstance().getInitFlag() || d) {
            return;
        }
        HMSBIInitializer.getInstance(context).initHaSDK();
        d = true;
    }

    public static int getAndRefreshAnalyticsState(Context context) {
        int i;
        synchronized (b) {
            isAnalyticsDisabled(context);
            i = a;
        }
        return i;
    }

    public static boolean getBiSetting(Context context) {
        PackageManager packageManager;
        Bundle bundle;
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bi.setting");
                }
            } catch (AndroidException | RuntimeException unused) {
            }
        }
        return false;
    }

    public static boolean isAnalyticsDisabled(Context context) {
        synchronized (b) {
            try {
                if (a == 0) {
                    if (context == null) {
                        return true;
                    }
                    if (b(context)) {
                        a = 1;
                    } else if (getBiSetting(context)) {
                        a = 2;
                    } else if (d(context)) {
                        a = 1;
                    } else {
                        a = 3;
                        e = true;
                        c(context);
                    }
                } else if (e) {
                    e(context);
                }
                return a != 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
