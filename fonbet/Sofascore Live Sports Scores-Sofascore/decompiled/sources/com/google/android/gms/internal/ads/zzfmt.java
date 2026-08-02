package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.me4;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfmt {
    public static void a(int i, String str, Throwable th) {
        String g = me4.g(i, "Ad failed to load : ", new StringBuilder(String.valueOf(i).length() + 20));
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh(g);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().e(str, th);
    }

    public static void b(Context context, boolean z) {
        if (z) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        String zzF = com.google.android.gms.ads.internal.util.client.zzf.zzF(context);
        String m = wt3.m("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", zzF, new StringBuilder(String.valueOf(zzF).length() + 102), "\")) to get test ads on this device.");
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh(m);
    }
}
