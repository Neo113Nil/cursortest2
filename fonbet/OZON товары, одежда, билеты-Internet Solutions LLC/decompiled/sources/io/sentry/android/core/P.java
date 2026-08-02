package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.C7165l;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.J;
import io.sentry.W2;
import io.sentry.android.core.K;
import io.sentry.protocol.C7189e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile P f66949i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f66950j = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f66951a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f66952b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f66953c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f66954d;

    /* renamed from: e, reason: collision with root package name */
    private final K.a f66955e;

    /* renamed from: f, reason: collision with root package name */
    private final K.b f66956f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.n f66957g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f66958h;

    /* loaded from: classes10.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66959a;

        static {
            int[] iArr = new int[J.a.values().length];
            f66959a = iArr;
            try {
                iArr[J.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66959a[J.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public P(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        String str;
        K.a aVar;
        PackageInfo e11;
        K.b bVar;
        ActivityManager.MemoryInfo d11;
        Bundle bundle;
        PackageInfo e12;
        PackageManager packageManager;
        this.f66951a = context;
        this.f66952b = sentryAndroidOptions;
        this.f66953c = new I(sentryAndroidOptions.getLogger());
        io.sentry.android.core.internal.util.f.a().b();
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        nVar.j("Android");
        nVar.m(Build.VERSION.RELEASE);
        String str2 = Build.DISPLAY;
        nVar.h();
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
            } catch (IOException e13) {
                logger.a(I2.ERROR, "Exception while attempting to read kernel information", e13);
            }
        }
        if (property != null) {
            nVar.i(property);
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            nVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.n(this.f66951a, sentryAndroidOptions.getLogger(), this.f66953c).a()));
        }
        this.f66957g = nVar;
        this.f66954d = this.f66953c.a();
        ILogger logger2 = sentryAndroidOptions.getLogger();
        boolean z11 = false;
        try {
            e12 = K.e(context, this.f66953c);
            packageManager = context.getPackageManager();
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        if (e12 != null && packageManager != null) {
            str = e12.packageName;
            try {
                String installerPackageName = packageManager.getInstallerPackageName(str);
                aVar = new K.a(installerPackageName == null, installerPackageName);
            } catch (IllegalArgumentException unused2) {
                logger2.c(I2.DEBUG, "%s package isn't installed.", str);
                aVar = null;
                this.f66955e = aVar;
                I i11 = this.f66953c;
                ApplicationInfo a11 = K.a(context, i11);
                e11 = K.e(context, i11);
                if (e11 != null) {
                }
                this.f66956f = bVar;
                d11 = K.d(context, sentryAndroidOptions.getLogger());
                if (d11 != null) {
                }
            }
            this.f66955e = aVar;
            I i112 = this.f66953c;
            ApplicationInfo a112 = K.a(context, i112);
            e11 = K.e(context, i112);
            if (e11 != null) {
                String[] strArr = e11.splitNames;
                if (a112 != null && (bundle = a112.metaData) != null) {
                    z11 = bundle.getBoolean("com.android.vending.splits.required");
                }
                bVar = new K.b(z11, strArr);
            } else {
                bVar = null;
            }
            this.f66956f = bVar;
            d11 = K.d(context, sentryAndroidOptions.getLogger());
            if (d11 != null) {
                this.f66958h = Long.valueOf(d11.totalMem);
                return;
            } else {
                this.f66958h = null;
                return;
            }
        }
        aVar = null;
        this.f66955e = aVar;
        I i1122 = this.f66953c;
        ApplicationInfo a1122 = K.a(context, i1122);
        e11 = K.e(context, i1122);
        if (e11 != null) {
        }
        this.f66956f = bVar;
        d11 = K.d(context, sentryAndroidOptions.getLogger());
        if (d11 != null) {
        }
    }

    public static Float b(@NotNull Intent intent, @NotNull W2 w22) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            w22.getLogger().a(I2.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    @NotNull
    public static P c(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (f66949i == null) {
            InterfaceC7097a0 a11 = f66950j.a();
            try {
                if (f66949i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    f66949i = new P(context, sentryAndroidOptions);
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f66949i;
    }

    public static Boolean h(@NotNull Intent intent, @NotNull W2 w22) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z11 = true;
            if (intExtra != 1 && intExtra != 2) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        } catch (Throwable th2) {
            w22.getLogger().a(I2.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0298, code lost:
    
        r13 = new android.os.StatFs(r3.getPath());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0257  */
    @SuppressLint({"NewApi"})
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7189e a(boolean z11, boolean z12) {
        C7189e.b bVar;
        Boolean bool;
        DisplayMetrics displayMetrics;
        Date date;
        String str;
        ArrayList b11;
        boolean isCollectExternalStorageContext;
        Intent registerReceiver;
        ActivityManager.MemoryInfo d11;
        File dataDirectory;
        Long l11;
        File file;
        Long l12;
        Long l13;
        Float f7;
        int intExtra;
        String str2;
        String str3;
        Context context = this.f66951a;
        C7189e c7189e = new C7189e();
        String str4 = Build.MANUFACTURER;
        c7189e.b0();
        String str5 = Build.BRAND;
        c7189e.P();
        SentryAndroidOptions sentryAndroidOptions = this.f66952b;
        c7189e.V(K.c(sentryAndroidOptions.getLogger()));
        String str6 = Build.MODEL;
        c7189e.d0();
        String str7 = Build.ID;
        c7189e.e0();
        c7189e.L(Build.SUPPORTED_ABIS);
        this.f66953c.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            StringBuilder sb2 = new StringBuilder();
            str2 = Build.SOC_MANUFACTURER;
            sb2.append(str2);
            sb2.append(" ");
            str3 = Build.SOC_MODEL;
            sb2.append(str3);
            c7189e.R(sb2.toString());
        }
        Long l14 = null;
        try {
            bVar = io.sentry.android.core.internal.util.h.a(context.getResources().getConfiguration().orientation);
            if (bVar == null) {
                try {
                    sentryAndroidOptions.getLogger().c(I2.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    bVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting device orientation.", th);
                    c7189e.g0(bVar);
                    bool = this.f66954d;
                    if (bool != null) {
                    }
                    ILogger logger = sentryAndroidOptions.getLogger();
                    displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                    }
                    date = C7165l.c(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                    c7189e.O(date);
                    LocaleList locales = context.getResources().getConfiguration().getLocales();
                    c7189e.p0(locales.isEmpty() ? Calendar.getInstance(locales.get(0)).getTimeZone() : Calendar.getInstance().getTimeZone());
                    if (c7189e.J() == null) {
                    }
                    Locale locale = Locale.getDefault();
                    if (c7189e.K() == null) {
                    }
                    b11 = io.sentry.android.core.internal.util.f.a().b();
                    if (!b11.isEmpty()) {
                    }
                    c7189e.c0(this.f66958h);
                    if (z11) {
                        isCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                        if (Build.VERSION.SDK_INT < 33) {
                        }
                        if (registerReceiver != null) {
                        }
                        int i11 = a.f66959a[sentryAndroidOptions.getConnectionStatusProvider().l().ordinal()];
                        c7189e.f0(i11 == 1 ? i11 != 2 ? null : Boolean.TRUE : Boolean.FALSE);
                        d11 = K.d(context, sentryAndroidOptions.getLogger());
                        if (d11 != null) {
                            c7189e.W(Long.valueOf(d11.availMem));
                            c7189e.a0(Boolean.valueOf(d11.lowMemory));
                        }
                        dataDirectory = Environment.getDataDirectory();
                        if (dataDirectory != null) {
                        }
                        if (isCollectExternalStorageContext) {
                        }
                        if (c7189e.I() == null) {
                        }
                    }
                    return c7189e;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bVar = null;
        }
        c7189e.g0(bVar);
        bool = this.f66954d;
        if (bool != null) {
            c7189e.n0(bool);
        }
        ILogger logger2 = sentryAndroidOptions.getLogger();
        try {
            displayMetrics = context.getResources().getDisplayMetrics();
        } catch (Throwable th4) {
            logger2.a(I2.ERROR, "Error getting DisplayMetrics.", th4);
            displayMetrics = null;
        }
        if (displayMetrics != null) {
            c7189e.m0(Integer.valueOf(displayMetrics.widthPixels));
            c7189e.l0(Integer.valueOf(displayMetrics.heightPixels));
            c7189e.j0(Float.valueOf(displayMetrics.density));
            c7189e.k0(Integer.valueOf(displayMetrics.densityDpi));
        }
        try {
            date = C7165l.c(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e11) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, e11, "Error getting the device's boot time.", new Object[0]);
            date = null;
        }
        c7189e.O(date);
        LocaleList locales2 = context.getResources().getConfiguration().getLocales();
        c7189e.p0(locales2.isEmpty() ? Calendar.getInstance(locales2.get(0)).getTimeZone() : Calendar.getInstance().getTimeZone());
        if (c7189e.J() == null) {
            try {
                str = V.a(context);
            } catch (Throwable th5) {
                sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting installationId.", th5);
                str = null;
            }
            c7189e.Y(str);
        }
        Locale locale2 = Locale.getDefault();
        if (c7189e.K() == null) {
            c7189e.Z(locale2.toString());
        }
        b11 = io.sentry.android.core.internal.util.f.a().b();
        if (!b11.isEmpty()) {
            c7189e.i0(Double.valueOf(((Integer) Collections.max(b11)).doubleValue()));
            c7189e.h0(Integer.valueOf(b11.size()));
        }
        c7189e.c0(this.f66958h);
        if (z11 && sentryAndroidOptions.isCollectAdditionalContext()) {
            isCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            registerReceiver = Build.VERSION.SDK_INT < 33 ? context.registerReceiver(null, intentFilter2, null, null, 4) : context.registerReceiver(null, intentFilter2, null, null);
            if (registerReceiver != null) {
                c7189e.M(b(registerReceiver, sentryAndroidOptions));
                c7189e.Q(h(registerReceiver, sentryAndroidOptions));
                try {
                    intExtra = registerReceiver.getIntExtra("temperature", -1);
                } catch (Throwable th6) {
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting battery temperature.", th6);
                }
                if (intExtra != -1) {
                    f7 = Float.valueOf(intExtra / 10.0f);
                    c7189e.N(f7);
                }
                f7 = null;
                c7189e.N(f7);
            }
            int i112 = a.f66959a[sentryAndroidOptions.getConnectionStatusProvider().l().ordinal()];
            c7189e.f0(i112 == 1 ? i112 != 2 ? null : Boolean.TRUE : Boolean.FALSE);
            d11 = K.d(context, sentryAndroidOptions.getLogger());
            if (d11 != null && z12) {
                c7189e.W(Long.valueOf(d11.availMem));
                c7189e.a0(Boolean.valueOf(d11.lowMemory));
            }
            dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                StatFs statFs = new StatFs(dataDirectory.getPath());
                try {
                    l12 = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                } catch (Throwable th7) {
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting total internal storage amount.", th7);
                    l12 = null;
                }
                c7189e.o0(l12);
                try {
                    l13 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                } catch (Throwable th8) {
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting unused internal storage amount.", th8);
                    l13 = null;
                }
                c7189e.X(l13);
            }
            if (isCollectExternalStorageContext) {
                File externalFilesDir = context.getExternalFilesDir(null);
                try {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs != null) {
                        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                        int length = externalFilesDirs.length;
                        for (int i12 = 0; i12 < length; i12++) {
                            file = externalFilesDirs[i12];
                            if (file != null) {
                                if (absolutePath == null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        sentryAndroidOptions.getLogger().c(I2.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                    }
                    file = null;
                } catch (Throwable unused) {
                    sentryAndroidOptions.getLogger().c(I2.INFO, "Not possible to read external files directory", new Object[0]);
                }
                StatFs statFs2 = null;
                if (statFs2 != null) {
                    try {
                        l11 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th9) {
                        sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting total external storage amount.", th9);
                        l11 = null;
                    }
                    c7189e.U(l11);
                    try {
                        l14 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th10) {
                        sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting unused external storage amount.", th10);
                    }
                    c7189e.T(l14);
                }
            }
            if (c7189e.I() == null) {
                c7189e.S(sentryAndroidOptions.getConnectionStatusProvider().D());
            }
        }
        return c7189e;
    }

    @NotNull
    public final io.sentry.protocol.n d() {
        return this.f66957g;
    }

    public final K.a e() {
        return this.f66955e;
    }

    public final K.b f() {
        return this.f66956f;
    }

    public final Long g() {
        return this.f66958h;
    }
}
