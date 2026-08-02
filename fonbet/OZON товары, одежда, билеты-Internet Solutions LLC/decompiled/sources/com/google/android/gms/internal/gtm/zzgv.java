package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class zzgv implements zzha {
    private static zzgv zza;
    private static final Object zzb = new Object();
    private static final Set<String> zzc = new HashSet(Arrays.asList("GET", "HEAD", "POST", "PUT"));
    private final zzic zzd;
    private final zzhc zze;

    private zzgv(Context context) {
        zzhc zzb2 = zzhc.zzb(context);
        zzic zzicVar = new zzic();
        this.zze = zzb2;
        this.zzd = zzicVar;
    }

    public static zzha zza(Context context) {
        zzgv zzgvVar;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zza = new zzgv(context);
                }
                zzgvVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgvVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzha
    public final boolean zzb(String str, String str2, String str3, Map<String, String> map, String str4) {
        if (str2 != null && !zzc.contains(str2)) {
            zzhl.zze("Unsupport http method " + str2 + ". Drop the hit.");
            return false;
        }
        if (zzhs.zza().zzd() || this.zzd.zza()) {
            this.zze.zzf(str, str2, str3, map, str4);
            return true;
        }
        zzhl.zze("Too many hits sent too quickly (rate throttled).");
        return false;
    }
}
