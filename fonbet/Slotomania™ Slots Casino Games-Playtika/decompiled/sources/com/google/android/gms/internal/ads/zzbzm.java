package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import io.ktor.sse.ServerSentEventKt;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes7.dex */
public final class zzbzm implements zzbzo {
    public static zzbzo zza;
    static zzbzo zzb;
    static zzbzo zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;
    private Set zzp;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzbzm(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfo;
        zzbhv zzbhvVar;
        String str;
        this.zzf = new Object();
        this.zzh = new WeakHashMap();
        zzfzv.zza();
        this.zzi = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzn = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = versionInfoParcel;
        String str2 = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziV)).booleanValue()) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.zzk = packageInfo;
                zzbhvVar = zzbie.zziI;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                    str = "unknown";
                } else {
                    Handler handler2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                    str = Locale.getDefault().getCountry();
                }
                this.zzl = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                    str2 = "unknown";
                } else {
                    Context context2 = this.zzg;
                    Handler handler3 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                    if (context2 != null) {
                        try {
                            PackageInfo packageInfo2 = Wrappers.packageManager(context2).getPackageInfo("com.android.vending", 128);
                            if (packageInfo2 != null) {
                                str2 = Integer.toString(packageInfo2.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.zzm = str2;
                if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziE)).intValue() <= 0) {
                    this.zzp = new HashSet();
                    return;
                }
                return;
            }
        }
        packageInfo = null;
        this.zzk = packageInfo;
        zzbhvVar = zzbie.zziI;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
        }
        this.zzl = str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
        }
        this.zzm = str2;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziE)).intValue() <= 0) {
        }
    }

    public static zzbzo zza(Context context) {
        synchronized (zze) {
            if (zza == null) {
                if (zzj(context)) {
                    zza = new zzbzm(context, VersionInfoParcel.forPackage());
                } else {
                    zza = new zzbzn();
                }
            }
        }
        return zza;
    }

    public static zzbzo zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzc == null) {
                boolean z = false;
                if (((Boolean) zzbjw.zzc.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziC)).booleanValue() || ((Boolean) zzbjw.zza.zze()).booleanValue()) {
                        z = true;
                    }
                }
                if (zzj(context)) {
                    zzbzm zzbzmVar = new zzbzm(context, versionInfoParcel);
                    zzbzmVar.zzl();
                    zzbzmVar.zzk();
                    zzc = zzbzmVar;
                } else if (!z || context == null) {
                    zzc = new zzbzn();
                } else {
                    zzbzm zzbzmVar2 = new zzbzm(context, versionInfoParcel, true);
                    zzbzmVar2.zzl();
                    zzbzmVar2.zzk();
                    zzc = zzbzmVar2;
                }
            }
        }
        return zzc;
    }

    public static zzbzo zzc(Context context) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziD)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziC)).booleanValue() && context != null) {
                        zzb = new zzbzm(context, VersionInfoParcel.forPackage());
                    }
                }
                zzb = new zzbzn();
            }
        }
        return zzb;
    }

    public static zzbzo zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziD)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziC)).booleanValue()) {
                        zzb = new zzbzm(context, versionInfoParcel);
                    }
                }
                zzb = new zzbzn();
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzgtn.zza(com.google.android.gms.ads.internal.util.client.zzf.zzh(zze(th)));
    }

    private static boolean zzj(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            if (zzd == null) {
                zzd = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzog)).intValue());
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziC)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void zzk() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbzj(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzl() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, true);
        }
        thread.setUncaughtExceptionHandler(new zzbzk(this, thread.getUncaughtExceptionHandler()));
    }

    protected final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= com.google.android.gms.ads.internal.util.client.zzf.zzq(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziE)).intValue();
            if (intValue > 0) {
                if (this.zzp.size() >= intValue) {
                    return;
                }
                String zzf = zzf(th);
                if (this.zzp.contains(zzf)) {
                    return;
                } else {
                    this.zzp.add(zzf);
                }
            }
            if (!z || z2) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbjw.zzc.zze()).booleanValue()) {
                return;
            }
            zzbhp.zzb(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zzi(Throwable th, String str, float f) {
        Throwable th2;
        String str2;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo zze2;
        if (this.zzo) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean z = false;
        if (((Boolean) zzbkn.zze.zze()).booleanValue()) {
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
                boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdf)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzq(th4.getClass().getName());
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
            String zze3 = zze(th);
            String zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkb)).booleanValue() ? zzf(th) : "";
            double d = f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    z = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                } catch (Throwable th5) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching instant app info", th5);
                }
                try {
                    str2 = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
                    sb.append(str3);
                    sb.append(ServerSentEventKt.SPACE);
                    sb.append(str4);
                    str4 = sb.toString();
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4);
                VersionInfoParcel versionInfoParcel = this.zzj;
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter(AppsFlyerProperties.APP_ID, str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze3).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zzb().zze())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "873078379").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbkn.zzc.zze()));
                Context context = this.zzg;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(zzf)) {
                    appendQueryParameter4.appendQueryParameter("hash", zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziJ)).booleanValue() && (zze2 = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                    appendQueryParameter4.appendQueryParameter("available_memory", Long.toString(zze2.availMem));
                    appendQueryParameter4.appendQueryParameter("total_memory", Long.toString(zze2.totalMem));
                    appendQueryParameter4.appendQueryParameter("is_low_memory", true == zze2.lowMemory ? "1" : "0");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziI)).booleanValue()) {
                    String str5 = this.zzl;
                    if (!TextUtils.isEmpty(str5)) {
                        appendQueryParameter4.appendQueryParameter("countrycode", str5);
                    }
                    String str6 = this.zzm;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter4.appendQueryParameter("psv", str6);
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        packageInfo = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        appendQueryParameter4.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                        appendQueryParameter4.appendQueryParameter("wvvn", packageInfo.versionName);
                        appendQueryParameter4.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                PackageInfo packageInfo2 = this.zzk;
                if (packageInfo2 != null) {
                    appendQueryParameter4.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                    appendQueryParameter4.appendQueryParameter("appvn", packageInfo2.versionName);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmS)).booleanValue()) {
                    appendQueryParameter4.appendQueryParameter("uev", zzgtn.zza(com.google.android.gms.ads.internal.util.client.zzf.zzf(this.zzg)));
                }
                arrayList2.add(appendQueryParameter4.toString());
                for (final String str7 : arrayList2) {
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(this.zzg, null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzl
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.ads.internal.util.client.zzu.this.zzc(str7, null);
                        }
                    });
                }
            }
        }
    }

    protected zzbzm(Context context, VersionInfoParcel versionInfoParcel, boolean z) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
