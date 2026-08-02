package com.google.android.gms.analytics;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzfa;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzd {
    public static String zza(int i11) {
        return zzn("&cd", i11);
    }

    public static String zzb(int i11) {
        return zzn("cd", i11);
    }

    public static String zzc(int i11) {
        return zzn("cd", i11);
    }

    public static String zzd(int i11) {
        return zzn("&cm", i11);
    }

    public static String zze(int i11) {
        return zzn("cm", i11);
    }

    public static String zzf(int i11) {
        return zzn("cm", i11);
    }

    public static String zzg(int i11) {
        return zzn("&il", i11);
    }

    public static String zzh(int i11) {
        return zzn("il", i11);
    }

    public static String zzi(int i11) {
        return zzn("pi", i11);
    }

    public static String zzj(int i11) {
        return zzn("&pr", i11);
    }

    public static String zzk(int i11) {
        return zzn("pr", i11);
    }

    public static String zzl(int i11) {
        return zzn("&promo", i11);
    }

    public static String zzm(int i11) {
        return zzn("promo", i11);
    }

    private static String zzn(String str, int i11) {
        if (i11 <= 0) {
            zzfa.zzb("index out of range for prefix", str);
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 11);
        sb2.append(str);
        sb2.append(i11);
        return sb2.toString();
    }
}
