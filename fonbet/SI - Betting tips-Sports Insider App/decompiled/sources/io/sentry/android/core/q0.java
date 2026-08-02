package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile q0 f15817i;
    public static final io.sentry.util.a j = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f15818a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f15819b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f15820c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f15821d;

    /* renamed from: e, reason: collision with root package name */
    public final g6.h0 f15822e;

    /* renamed from: f, reason: collision with root package name */
    public final com.android.billingclient.api.u0 f15823f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.protocol.o f15824g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f15825h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String str;
        g6.h0 h0Var;
        PackageInfo f6;
        com.android.billingclient.api.u0 u0Var;
        ActivityManager.MemoryInfo d10;
        Bundle bundle;
        PackageInfo f10;
        PackageManager packageManager;
        this.f15818a = context;
        this.f15819b = sentryAndroidOptions;
        this.f15820c = new n0(sentryAndroidOptions.getLogger());
        io.sentry.android.core.internal.util.f.f15714c.a();
        io.sentry.protocol.o oVar = new io.sentry.protocol.o();
        oVar.f16869a = "Android";
        oVar.f16870b = Build.VERSION.RELEASE;
        oVar.f16872d = Build.DISPLAY;
        ILogger logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    property = readLine;
                } finally {
                }
            } catch (IOException e7) {
                logger.e(b5.ERROR, "Exception while attempting to read kernel information", e7);
            }
        }
        if (property != null) {
            oVar.f16873e = property;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            oVar.f16874f = Boolean.valueOf(new io.sentry.android.core.internal.util.j(this.f15818a, sentryAndroidOptions.getLogger(), this.f15820c).a());
        }
        this.f15824g = oVar;
        this.f15821d = this.f15820c.b();
        ILogger logger2 = sentryAndroidOptions.getLogger();
        boolean z5 = false;
        try {
            f10 = m0.f(context, this.f15820c);
            packageManager = context.getPackageManager();
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        if (f10 != null && packageManager != null) {
            str = f10.packageName;
            try {
                String installerPackageName = packageManager.getInstallerPackageName(str);
                h0Var = new g6.h0(installerPackageName == null, installerPackageName);
            } catch (IllegalArgumentException unused2) {
                logger2.h(b5.DEBUG, "%s package isn't installed.", str);
                h0Var = null;
                this.f15822e = h0Var;
                n0 n0Var = this.f15820c;
                n0Var.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                }
                f6 = m0.f(context, n0Var);
                if (f6 != null) {
                }
                this.f15823f = u0Var;
                d10 = m0.d(context, sentryAndroidOptions.getLogger());
                if (d10 != null) {
                }
            }
            this.f15822e = h0Var;
            n0 n0Var2 = this.f15820c;
            n0Var2.getClass();
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) m0.f15779d.a(context) : (ApplicationInfo) m0.f15780e.a(context);
            f6 = m0.f(context, n0Var2);
            if (f6 != null) {
                String[] strArr = f6.splitNames;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    z5 = bundle.getBoolean("com.android.vending.splits.required");
                }
                u0Var = new com.android.billingclient.api.u0();
                u0Var.f4106a = z5;
                u0Var.f4107b = strArr;
            } else {
                u0Var = null;
            }
            this.f15823f = u0Var;
            d10 = m0.d(context, sentryAndroidOptions.getLogger());
            if (d10 != null) {
                this.f15825h = Long.valueOf(d10.totalMem);
                return;
            } else {
                this.f15825h = null;
                return;
            }
        }
        h0Var = null;
        this.f15822e = h0Var;
        n0 n0Var22 = this.f15820c;
        n0Var22.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
        }
        f6 = m0.f(context, n0Var22);
        if (f6 != null) {
        }
        this.f15823f = u0Var;
        d10 = m0.d(context, sentryAndroidOptions.getLogger());
        if (d10 != null) {
        }
    }

    public static Float b(Intent intent, b6 b6Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    public static q0 c(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f15817i == null) {
            io.sentry.r a7 = j.a();
            try {
                if (f15817i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    f15817i = new q0(context, sentryAndroidOptions);
                }
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f15817i;
    }

    public static Boolean d(Intent intent, b6 b6Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z5 = true;
            if (intExtra != 1 && intExtra != 2) {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:0|1|(1:3)|4|5|6|7|(1:(22:10|(3:78|79|80)|12|(1:14)|15|16|17|(1:19)|20|21|22|(2:24|(10:26|27|(3:65|66|67)|29|(1:31)|32|(1:34)|35|(8:39|(6:41|42|43|(2:45|46)|48|46)|51|(1:(1:54))(1:62)|55|(1:58)|59|(1:61))|63))|71|27|(0)|29|(0)|32|(0)|35|(9:37|39|(0)|51|(0)(0)|55|(1:58)|59|(0))|63)(1:84))(1:87)|85|(0)|12|(0)|15|16|17|(0)|20|21|22|(0)|71|27|(0)|29|(0)|32|(0)|35|(0)|63|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d8, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d9, code lost:
    
        r2.getLogger().b(io.sentry.b5.ERROR, r8, "Error getting the device's boot time.", new java.lang.Object[0]);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x009f, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a0, code lost:
    
        r8.e(io.sentry.b5.ERROR, "Error getting DisplayMetrics.", r9);
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.sentry.protocol.f a(boolean z5, boolean z7) {
        io.sentry.protocol.e eVar;
        Boolean bool;
        DisplayMetrics displayMetrics;
        TimeZone timeZone;
        String str;
        ArrayList a7;
        Intent i5;
        int i10;
        ActivityManager.MemoryInfo d10;
        Float f6;
        int intExtra;
        int i11;
        Context context = this.f15818a;
        io.sentry.protocol.f fVar = new io.sentry.protocol.f();
        fVar.f16777b = Build.MANUFACTURER;
        fVar.f16778c = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.f15819b;
        fVar.f16779d = m0.c(sentryAndroidOptions.getLogger());
        fVar.f16780e = Build.MODEL;
        fVar.f16781f = Build.ID;
        fVar.f16782g = Build.SUPPORTED_ABIS;
        n0 n0Var = this.f15820c;
        n0Var.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            fVar.H = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Boolean bool2 = null;
        try {
            i11 = context.getResources().getConfiguration().orientation;
            try {
            } catch (Throwable th2) {
                th = th2;
                eVar = null;
                sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting device orientation.", th);
                fVar.f16785k = eVar;
                bool = this.f15821d;
                if (bool != null) {
                }
                ILogger logger = sentryAndroidOptions.getLogger();
                displayMetrics = context.getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                }
                Date date = com.google.android.play.core.appupdate.b.o(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                fVar.f16798y = date;
                if (Build.VERSION.SDK_INT >= 24) {
                }
                timeZone = Calendar.getInstance().getTimeZone();
                fVar.f16799z = timeZone;
                if (fVar.A == null) {
                }
                Locale locale = Locale.getDefault();
                if (fVar.B == null) {
                }
                a7 = io.sentry.android.core.internal.util.f.f15714c.a();
                if (!a7.isEmpty()) {
                }
                fVar.f16787m = this.f15825h;
                if (z5) {
                }
                return fVar;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (i11 == 1) {
            eVar = io.sentry.protocol.e.PORTRAIT;
        } else {
            if (i11 != 2) {
                eVar = null;
                if (eVar == null) {
                    try {
                        sentryAndroidOptions.getLogger().h(b5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                        eVar = null;
                    } catch (Throwable th4) {
                        th = th4;
                        sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting device orientation.", th);
                        fVar.f16785k = eVar;
                        bool = this.f15821d;
                        if (bool != null) {
                        }
                        ILogger logger2 = sentryAndroidOptions.getLogger();
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                        }
                        Date date2 = com.google.android.play.core.appupdate.b.o(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                        fVar.f16798y = date2;
                        if (Build.VERSION.SDK_INT >= 24) {
                        }
                        timeZone = Calendar.getInstance().getTimeZone();
                        fVar.f16799z = timeZone;
                        if (fVar.A == null) {
                        }
                        Locale locale2 = Locale.getDefault();
                        if (fVar.B == null) {
                        }
                        a7 = io.sentry.android.core.internal.util.f.f15714c.a();
                        if (!a7.isEmpty()) {
                        }
                        fVar.f16787m = this.f15825h;
                        if (z5) {
                        }
                        return fVar;
                    }
                }
                fVar.f16785k = eVar;
                bool = this.f15821d;
                if (bool != null) {
                    fVar.f16786l = bool;
                }
                ILogger logger22 = sentryAndroidOptions.getLogger();
                displayMetrics = context.getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    fVar.f16794u = Integer.valueOf(displayMetrics.widthPixels);
                    fVar.f16795v = Integer.valueOf(displayMetrics.heightPixels);
                    fVar.f16796w = Float.valueOf(displayMetrics.density);
                    fVar.f16797x = Integer.valueOf(displayMetrics.densityDpi);
                }
                Date date22 = com.google.android.play.core.appupdate.b.o(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                fVar.f16798y = date22;
                if (Build.VERSION.SDK_INT >= 24) {
                    LocaleList locales = context.getResources().getConfiguration().getLocales();
                    if (!locales.isEmpty()) {
                        timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                        fVar.f16799z = timeZone;
                        if (fVar.A == null) {
                            try {
                                str = (String) sentryAndroidOptions.getRuntimeManager().b(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(27, this));
                            } catch (Throwable th5) {
                                sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting installationId.", th5);
                                str = null;
                            }
                            fVar.A = str;
                        }
                        Locale locale22 = Locale.getDefault();
                        if (fVar.B == null) {
                            fVar.B = locale22.toString();
                        }
                        a7 = io.sentry.android.core.internal.util.f.f15714c.a();
                        if (!a7.isEmpty()) {
                            fVar.F = Double.valueOf(((Integer) Collections.max(a7)).doubleValue());
                            fVar.E = Integer.valueOf(a7.size());
                        }
                        fVar.f16787m = this.f15825h;
                        if (z5 && sentryAndroidOptions.isCollectAdditionalContext()) {
                            boolean isCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
                            i5 = m0.i(context, n0Var, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
                            if (i5 != null) {
                                fVar.f16783h = b(i5, sentryAndroidOptions);
                                fVar.f16784i = d(i5, sentryAndroidOptions);
                                try {
                                    intExtra = i5.getIntExtra("temperature", -1);
                                } catch (Throwable th6) {
                                    sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting battery temperature.", th6);
                                }
                                if (intExtra != -1) {
                                    f6 = Float.valueOf(intExtra / 10.0f);
                                    fVar.D = f6;
                                }
                                f6 = null;
                                fVar.D = f6;
                            }
                            i10 = p0.f15789a[sentryAndroidOptions.getConnectionStatusProvider().T().ordinal()];
                            if (i10 != 1) {
                                bool2 = Boolean.FALSE;
                            } else if (i10 == 2) {
                                bool2 = Boolean.TRUE;
                            }
                            fVar.j = bool2;
                            d10 = m0.d(context, sentryAndroidOptions.getLogger());
                            if (d10 != null && z7) {
                                fVar.f16788n = Long.valueOf(d10.availMem);
                                fVar.f16790p = Boolean.valueOf(d10.lowMemory);
                            }
                            sentryAndroidOptions.getRuntimeManager().a(new com.logrocket.core.l(2, this, fVar, isCollectExternalStorageContext));
                            if (fVar.C == null) {
                                fVar.C = sentryAndroidOptions.getConnectionStatusProvider().u();
                            }
                        }
                        return fVar;
                    }
                }
                timeZone = Calendar.getInstance().getTimeZone();
                fVar.f16799z = timeZone;
                if (fVar.A == null) {
                }
                Locale locale222 = Locale.getDefault();
                if (fVar.B == null) {
                }
                a7 = io.sentry.android.core.internal.util.f.f15714c.a();
                if (!a7.isEmpty()) {
                }
                fVar.f16787m = this.f15825h;
                if (z5) {
                    boolean isCollectExternalStorageContext2 = sentryAndroidOptions.isCollectExternalStorageContext();
                    i5 = m0.i(context, n0Var, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
                    if (i5 != null) {
                    }
                    i10 = p0.f15789a[sentryAndroidOptions.getConnectionStatusProvider().T().ordinal()];
                    if (i10 != 1) {
                    }
                    fVar.j = bool2;
                    d10 = m0.d(context, sentryAndroidOptions.getLogger());
                    if (d10 != null) {
                        fVar.f16788n = Long.valueOf(d10.availMem);
                        fVar.f16790p = Boolean.valueOf(d10.lowMemory);
                    }
                    sentryAndroidOptions.getRuntimeManager().a(new com.logrocket.core.l(2, this, fVar, isCollectExternalStorageContext2));
                    if (fVar.C == null) {
                    }
                }
                return fVar;
            }
            eVar = io.sentry.protocol.e.LANDSCAPE;
        }
        if (eVar == null) {
        }
        fVar.f16785k = eVar;
        bool = this.f15821d;
        if (bool != null) {
        }
        ILogger logger222 = sentryAndroidOptions.getLogger();
        displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
        }
        Date date222 = com.google.android.play.core.appupdate.b.o(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        fVar.f16798y = date222;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        timeZone = Calendar.getInstance().getTimeZone();
        fVar.f16799z = timeZone;
        if (fVar.A == null) {
        }
        Locale locale2222 = Locale.getDefault();
        if (fVar.B == null) {
        }
        a7 = io.sentry.android.core.internal.util.f.f15714c.a();
        if (!a7.isEmpty()) {
        }
        fVar.f16787m = this.f15825h;
        if (z5) {
        }
        return fVar;
    }
}
