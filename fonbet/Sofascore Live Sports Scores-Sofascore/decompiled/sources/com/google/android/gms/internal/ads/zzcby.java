package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcby {
    public int a;
    public int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final float k;
    public final int l;
    public final int m;
    public final String n;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:35)|4|(1:6)(1:34)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d5, blocks: (B:12:0x009f, B:14:0x00ad), top: B:11:0x009f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcby(Context context) {
        ActivityInfo activityInfo;
        PackageInfo b;
        String sb;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo b2;
        PackageManager packageManager = context.getPackageManager();
        zzbjg.a(context);
        b(context);
        c(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.c = e(packageManager, "geo:0,0?q=donuts") != null;
        this.d = e(packageManager, "http://www.google.com") != null;
        this.e = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzay.zza();
        this.f = com.google.android.gms.ads.internal.util.client.zzf.zzy();
        this.g = DeviceProperties.a(context);
        this.h = DeviceProperties.d(context);
        this.i = locale.getLanguage();
        ResolveInfo e = e(packageManager, "market://details?id=com.google.android.gms.ads");
        String str = null;
        if (e != null && (activityInfo = e.activityInfo) != null) {
            try {
                b = Wrappers.a(context).b(0, activityInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (b != null) {
                int i = b.versionCode;
                String str2 = activityInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(str2).length());
                sb2.append(i);
                sb2.append(".");
                sb2.append(str2);
                sb = sb2.toString();
                this.j = sb;
                b2 = Wrappers.a(context).b(128, "com.android.vending");
                if (b2 != null) {
                    int i2 = b2.versionCode;
                    String str3 = b2.packageName;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(str3).length());
                    sb3.append(i2);
                    sb3.append(".");
                    sb3.append(str3);
                    str = sb3.toString();
                }
                this.n = str;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.k = displayMetrics.density;
                    this.l = displayMetrics.widthPixels;
                    this.m = displayMetrics.heightPixels;
                }
                return;
            }
        }
        sb = null;
        this.j = sb;
        b2 = Wrappers.a(context).b(128, "com.android.vending");
        if (b2 != null) {
        }
        this.n = str;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.k = displayMetrics.density;
        this.l = displayMetrics.widthPixels;
        this.m = displayMetrics.heightPixels;
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().d("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final zzcbz a() {
        return new zzcbz(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.n, this.a, this.b, this.k, this.l, this.m);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzh().d("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        if (PlatformVersion.a()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z9)).booleanValue()) {
                networkType = 0;
                this.b = networkType;
                telephonyManager.getPhoneType();
                this.a = -2;
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.a = activeNetworkInfo.getType();
                    activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.a = -1;
                }
                connectivityManager.isActiveNetworkMetered();
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.b = networkType;
        telephonyManager.getPhoneType();
        this.a = -2;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("status", -1);
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
        }
    }

    public zzcby(Context context, zzcbz zzcbzVar) {
        zzbjg.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        zzbkh.a(context);
        this.c = zzcbzVar.a;
        this.d = zzcbzVar.b;
        this.e = zzcbzVar.c;
        this.f = zzcbzVar.d;
        this.g = zzcbzVar.e;
        this.h = zzcbzVar.f;
        this.i = zzcbzVar.g;
        this.j = zzcbzVar.h;
        this.n = zzcbzVar.i;
        this.k = zzcbzVar.l;
        this.l = zzcbzVar.m;
        this.m = zzcbzVar.n;
    }
}
