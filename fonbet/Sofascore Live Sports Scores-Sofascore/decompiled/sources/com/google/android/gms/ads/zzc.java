package com.google.android.gms.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzc {
    public static AdSize zza(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    public static AdSize zzb(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.f = true;
        adSize.g = i2;
        return adSize;
    }

    public static AdSize zzc(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.h = true;
        adSize.i = i2;
        return adSize;
    }

    public static boolean zzd(AdSize adSize) {
        return adSize.h;
    }

    public static int zze(AdSize adSize) {
        return adSize.i;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.d;
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.f;
    }

    public static int zzh(AdSize adSize) {
        return adSize.g;
    }

    public static boolean zzi(AdSize adSize) {
        return adSize.e;
    }
}
