package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.fn0;
import defpackage.grn;
import defpackage.inn;
import defpackage.nkn;
import defpackage.p2o;
import defpackage.wt3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcaq implements zzcas {
    public static final Object l = new Object();
    public static zzcas m;
    public static zzcas n;
    public static zzcas o;
    public static Boolean p;
    public final Context b;
    public final VersionInfoParcel e;
    public final PackageInfo f;
    public final String g;
    public final String h;
    public boolean j;
    public final HashSet k;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();
    public final ExecutorService d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new p2o(1)));
    public final AtomicBoolean i = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcaq(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfo;
        inn innVar;
        String str;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = context;
        this.e = versionInfoParcel;
        String str2 = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b9)).booleanValue()) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = Wrappers.a(context).b(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.f = packageInfo;
                innVar = zzbjg.O8;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                    str = "unknown";
                } else {
                    Handler handler2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                    str = Locale.getDefault().getCountry();
                }
                this.g = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                    str2 = "unknown";
                } else {
                    Context context2 = this.b;
                    Handler handler3 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                    if (context2 != null) {
                        try {
                            PackageInfo b = Wrappers.a(context2).b(128, "com.android.vending");
                            if (b != null) {
                                str2 = Integer.toString(b.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.h = str2;
                if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K8)).intValue() <= 0) {
                    this.k = new HashSet();
                    return;
                }
                return;
            }
        }
        packageInfo = null;
        this.f = packageInfo;
        innVar = zzbjg.O8;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
        }
        this.g = str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
        }
        this.h = str2;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K8)).intValue() <= 0) {
        }
    }

    public static zzcas c(Context context) {
        zzcas zzcasVar;
        synchronized (l) {
            try {
                zzcasVar = m;
                if (zzcasVar == null) {
                    if (h(context)) {
                        zzcasVar = new zzcaq(context, VersionInfoParcel.forPackage());
                        m = zzcasVar;
                    } else {
                        zzcasVar = new zzcar();
                        m = zzcasVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcasVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0017, B:10:0x0029, B:13:0x003d, B:15:0x0043, B:18:0x005e, B:19:0x0074, B:20:0x0077, B:22:0x007d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzcas d(Context context, VersionInfoParcel versionInfoParcel) {
        zzcas zzcasVar;
        boolean z;
        zzcar zzcarVar;
        synchronized (l) {
            try {
                zzcas zzcasVar2 = o;
                zzcasVar = zzcasVar2;
                if (zzcasVar2 == null) {
                    if (((Boolean) zzbkz.c.c()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I8)).booleanValue() || ((Boolean) zzbkz.a.c()).booleanValue()) {
                            z = true;
                            if (h(context)) {
                                if (!z || context == null) {
                                    zzcarVar = new zzcar();
                                } else {
                                    zzcaq zzcaqVar = new zzcaq(context, versionInfoParcel);
                                    zzcaqVar.j = true;
                                    zzcaqVar.i();
                                    Thread.setDefaultUncaughtExceptionHandler(new grn(zzcaqVar, Thread.getDefaultUncaughtExceptionHandler(), 0));
                                    zzcarVar = zzcaqVar;
                                }
                                o = zzcarVar;
                                zzcasVar = zzcarVar;
                            } else {
                                zzcaq zzcaqVar2 = new zzcaq(context, versionInfoParcel);
                                zzcaqVar2.i();
                                Thread.setDefaultUncaughtExceptionHandler(new grn(zzcaqVar2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                                o = zzcaqVar2;
                                zzcasVar = zzcaqVar2;
                            }
                        }
                    }
                    z = false;
                    if (h(context)) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcasVar;
    }

    public static zzcas e(Context context) {
        zzcas zzcasVar;
        synchronized (l) {
            try {
                zzcasVar = n;
                if (zzcasVar == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J8)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I8)).booleanValue() && context != null) {
                            zzcasVar = new zzcaq(context, VersionInfoParcel.forPackage());
                            n = zzcasVar;
                        }
                    }
                    zzcasVar = new zzcar();
                    n = zzcasVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcasVar;
    }

    public static String f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        Boolean bool;
        if (context != null) {
            synchronized (l) {
                try {
                    bool = p;
                    if (bool == null) {
                        bool = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.te)).intValue());
                        p = bool;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool.booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void a(String str, Throwable th) {
        if (this.j) {
            return;
        }
        b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void b(Throwable th, String str, float f) {
        Throwable th2;
        String str2;
        boolean z;
        String str3;
        ActivityManager.MemoryInfo zze;
        Context context = this.b;
        if (this.j) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        if (((Boolean) zzblq.e.c()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.k3)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzq(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzq(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String f2 = f(th);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ja)).booleanValue() || (str2 = com.google.android.gms.ads.internal.util.client.zzf.zzh(f(th))) == null) {
                str2 = "";
            }
            double d = f;
            double random = Math.random();
            int i = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z = Wrappers.a(context).c();
                } catch (Throwable th5) {
                    zzo.zzg("Error fetching instant app info", th5);
                    z = false;
                }
                try {
                    str3 = context.getPackageName();
                } catch (Throwable unused) {
                    zzo.zzi("Cannot obtain package name, proceeding.");
                    str3 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(L6.F, Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str4 = Build.MANUFACTURER;
                String str5 = Build.MODEL;
                if (!str5.startsWith(str4)) {
                    str5 = wt3.m(str4, " ", new StringBuilder(fn0.c(1, str4) + str5.length()), str5);
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(U3.i.G, str5);
                VersionInfoParcel versionInfoParcel = this.e;
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", f2).appendQueryParameter("eids", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, com.google.android.gms.ads.internal.client.zzba.zzb().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "919173219").appendQueryParameter(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzblq.c.c()));
                GoogleApiAvailabilityLight.b.getClass();
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("gmscv", String.valueOf(GooglePlayServicesUtilLight.b(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    appendQueryParameter4.appendQueryParameter("hash", str2);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.P8)).booleanValue() && (zze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                    appendQueryParameter4.appendQueryParameter("available_memory", Long.toString(zze.availMem));
                    appendQueryParameter4.appendQueryParameter("total_memory", Long.toString(zze.totalMem));
                    appendQueryParameter4.appendQueryParameter("is_low_memory", true != zze.lowMemory ? "0" : "1");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O8)).booleanValue()) {
                    String str6 = this.g;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter4.appendQueryParameter("countrycode", str6);
                    }
                    String str7 = this.h;
                    if (!TextUtils.isEmpty(str7)) {
                        appendQueryParameter4.appendQueryParameter("psv", str7);
                    }
                    PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                    if (currentWebViewPackage != null) {
                        appendQueryParameter4.appendQueryParameter("wvvc", Integer.toString(currentWebViewPackage.versionCode));
                        appendQueryParameter4.appendQueryParameter("wvvn", currentWebViewPackage.versionName);
                        appendQueryParameter4.appendQueryParameter("wvpn", currentWebViewPackage.packageName);
                    }
                }
                PackageInfo packageInfo = this.f;
                if (packageInfo != null) {
                    appendQueryParameter4.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter4.appendQueryParameter("appvn", packageInfo.versionName);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.fd)).booleanValue()) {
                    String zzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(context);
                    appendQueryParameter4.appendQueryParameter("uev", zzf != null ? zzf : "");
                }
                arrayList2.add(appendQueryParameter4.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.d.execute(new nkn(new zzu(context, null), (String) it.next(), false, 5));
                }
            }
        }
    }

    public final void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= com.google.android.gms.ads.internal.util.client.zzf.zzq(stackTraceElement.getClassName());
                    z2 |= zzcaq.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K8)).intValue();
            if (intValue > 0) {
                HashSet hashSet = this.k;
                if (hashSet.size() >= intValue) {
                    return;
                }
                String zzh = com.google.android.gms.ads.internal.util.client.zzf.zzh(f(th));
                if (zzh == null) {
                    zzh = "";
                }
                if (hashSet.contains(zzh)) {
                    return;
                } else {
                    hashSet.add(zzh);
                }
            }
            if (!z || z2) {
                return;
            }
            if (!this.j) {
                a("", th);
            }
            if (this.i.getAndSet(true) || !((Boolean) zzbkz.c.c()).booleanValue() || (sharedPreferences = (context = this.b).getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", zzbir.b(context, "crash_without_write") + 1).commit();
        }
    }

    public final void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.a) {
            this.c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new grn(this, thread.getUncaughtExceptionHandler(), 1));
    }
}
