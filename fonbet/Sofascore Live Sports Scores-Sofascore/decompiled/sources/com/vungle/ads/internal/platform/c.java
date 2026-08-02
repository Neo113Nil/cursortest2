package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.Task;
import com.iab.omid.library.vungle.internal.l;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.network.w;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.bnk;
import defpackage.joa;
import defpackage.p2g;
import defpackage.s5l;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.yn3;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c implements f {
    public final Context a;
    public final j b;
    public final PowerManager c;
    public final AudioManager d;
    public Long e;
    public String f;
    public Integer g;
    public i0 h;
    public String i;

    public c(Context context, j jVar, PowerManager powerManager, AudioManager audioManager) {
        context.getClass();
        jVar.getClass();
        powerManager.getClass();
        audioManager.getClass();
        this.a = context;
        this.b = jVar;
        this.c = powerManager;
        this.d = audioManager;
        q();
    }

    public final i0 a() {
        i0 i0Var;
        String a;
        i0 i0Var2 = this.h;
        if (i0Var2 != null && (a = i0Var2.a()) != null && a.length() != 0) {
            return i0Var2;
        }
        boolean z = true;
        if (kotlin.text.c.o(Build.MANUFACTURER, "Amazon", true)) {
            i0Var = new i0();
            try {
                ContentResolver contentResolver = this.a.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                    z = false;
                }
                i0Var.b = z;
                i0Var.a = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException e) {
                boolean z2 = u.a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info: Setting not found.", e);
            } catch (Exception e2) {
                boolean z3 = u.a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info", e2);
            }
        } else {
            i0 i0Var3 = new i0();
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
                advertisingIdInfo.getClass();
                i0Var3.a(advertisingIdInfo.getId());
                i0Var3.a(advertisingIdInfo.isLimitAdTrackingEnabled());
            } catch (GooglePlayServicesNotAvailableException e3) {
                boolean z4 = u.a;
                StringBuilder a2 = l.a("Play services Not available: ");
                a2.append(e3.getLocalizedMessage());
                t.b("AndroidPlatform", a2.toString());
            } catch (Exception e4) {
                boolean z5 = u.a;
                StringBuilder a3 = l.a("Error getting Google advertising info: ");
                a3.append(e4.getLocalizedMessage());
                t.b("AndroidPlatform", a3.toString());
            } catch (NoClassDefFoundError e5) {
                boolean z6 = u.a;
                StringBuilder a4 = l.a("Play services Not available: ");
                a4.append(e5.getLocalizedMessage());
                t.b("AndroidPlatform", a4.toString());
                i0Var3.a(Settings.Secure.getString(this.a.getContentResolver(), "advertising_id"));
            }
            i0Var = i0Var3;
        }
        this.h = i0Var;
        return i0Var;
    }

    public final String b() {
        return this.f;
    }

    public final Integer c() {
        return this.g;
    }

    public final long d() {
        return Build.TIME;
    }

    public final String e() {
        String a = a.a(this.a);
        a.getClass();
        return a;
    }

    public final String f() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.a;
            String str2 = (i >= 33 ? context.getPackageManager().getPackageInfo("com.android.vending", PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo("com.android.vending", 0)).versionName;
            this.i = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final long g() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public final long h() {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            int i = Build.VERSION.SDK_INT;
            Context context = this.a;
            u2gVar = Long.valueOf((i >= 33 ? context.getPackageManager().getPackageInfo("android", PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo("android", 0)).firstInstallTime);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            if (a instanceof PackageManager.NameNotFoundException) {
                boolean z = u.a;
                StringBuilder a2 = l.a("Error getting OS installation time: ");
                a2.append(((PackageManager.NameNotFoundException) a).getLocalizedMessage());
                t.b("AndroidPlatform", a2.toString());
            }
            u2gVar = -1L;
        }
        return ((Number) u2gVar).longValue();
    }

    public final long i() {
        joa a = ypa.a(ysa.a, new b(this.a));
        Long l = this.e;
        if (l != null) {
            return l.longValue();
        }
        long a2 = ((FilePreferences) a.getValue()).a("sit", 0L);
        if (a2 == 0) {
            a2 = System.currentTimeMillis();
            ((FilePreferences) a.getValue()).b("sit", a2).b();
        }
        this.e = Long.valueOf(a2);
        return a2;
    }

    public final String j() {
        return System.getProperty("http.agent");
    }

    public final float k() {
        try {
            float streamVolume = this.d.getStreamVolume(3) / this.d.getStreamMaxVolume(3);
            if (!Float.isNaN(streamVolume)) {
                if (!Float.isInfinite(streamVolume) && streamVolume >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (streamVolume > 1.0f) {
                        return 1.0f;
                    }
                    return streamVolume;
                }
            }
        } catch (Exception unused) {
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean l() {
        return this.c.isPowerSaveMode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (kotlin.text.StringsKt.J(r0, com.appsflyer.sdk_base.referrer.Payload.SOURCE_SAMSUNG, true) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        String str;
        boolean z;
        String str2 = Build.HARDWARE;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.ROOT);
            str.getClass();
        } else {
            str = "";
        }
        if (StringsKt.J(str, "exynos", false)) {
            if (Build.VERSION.SDK_INT >= 31) {
                String str3 = Build.SOC_MANUFACTURER;
                str3.getClass();
            }
            z = true;
            boolean z2 = !StringsKt.J(str, "mali", false) || z;
            int i = Build.VERSION.SDK_INT;
            return !z2 && (29 > i && i < 34);
        }
        z = false;
        if (StringsKt.J(str, "mali", false)) {
        }
        int i2 = Build.VERSION.SDK_INT;
        if (z2) {
        }
    }

    public final boolean n() {
        try {
            return Intrinsics.c(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e) {
            boolean z = u.a;
            t.a("AndroidPlatform", "Acquiring external storage state failed", e);
            return false;
        }
    }

    public final boolean o() {
        try {
            if (this.d.getRingerMode() != 0) {
                if (this.d.getRingerMode() != 1) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean p() {
        try {
            return this.d.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public final void q() {
        String str = this.f;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.a);
                client.getClass();
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                appSetIdInfo.getClass();
                appSetIdInfo.addOnSuccessListener(new bnk(this, 9));
            } catch (Exception e) {
                boolean z = u.a;
                StringBuilder a = l.a("Error getting AppSetID: ");
                a.append(e.getLocalizedMessage());
                t.b("AndroidPlatform", a.toString());
            } catch (NoClassDefFoundError e2) {
                boolean z2 = u.a;
                StringBuilder a2 = l.a("Required libs to get AppSetID Not available: ");
                a2.append(e2.getLocalizedMessage());
                t.b("AndroidPlatform", a2.toString());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(Context context, j jVar) {
        this(context, jVar, (PowerManager) r0, (AudioManager) r1);
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        Object systemService2 = context.getSystemService("audio");
        systemService2.getClass();
    }

    public static final void a(c cVar, yn3 yn3Var) {
        cVar.getClass();
        yn3Var.getClass();
        g.a(cVar.a, yn3Var);
    }

    public final void a(w wVar) {
        wVar.getClass();
        this.b.execute(new s5l(22, this, wVar));
    }

    public static final void a(c cVar, AppSetIdInfo appSetIdInfo) {
        cVar.getClass();
        if (appSetIdInfo != null) {
            cVar.f = appSetIdInfo.getId();
            cVar.g = Integer.valueOf(appSetIdInfo.getScope());
        }
    }
}
