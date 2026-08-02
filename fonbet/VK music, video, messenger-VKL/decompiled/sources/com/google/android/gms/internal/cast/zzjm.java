package com.google.android.gms.internal.cast;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzjm {
    private static String zza = "com.google.android.gms.internal.cast.zzjq";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.gms.internal.cast.zzjq", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzko.zza();
    }

    public static zzjl zzb() {
        zzjm zzjmVar;
        zzjmVar = zzjk.zza;
        return zzjmVar.zzc();
    }

    public static zzix zzd(String str) {
        zzjm zzjmVar;
        zzjmVar = zzjk.zza;
        return zzjmVar.zze(str);
    }

    public static zzjz zzf() {
        zzjm zzjmVar;
        zzjmVar = zzjk.zza;
        return zzjmVar.zzg();
    }

    public static boolean zzh(String str, Level level, boolean z) {
        zzf().zzb(str, level, z);
        return false;
    }

    public static zzkk zzi() {
        return zzf().zzc();
    }

    public static zziz zzj() {
        return zzf().zzd();
    }

    public static long zzk() {
        zzjm zzjmVar;
        zzjmVar = zzjk.zza;
        return zzjmVar.zzl();
    }

    public static String zzm() {
        zzjm zzjmVar;
        zzjmVar = zzjk.zza;
        return zzjmVar.zzn();
    }

    public abstract zzjl zzc();

    public abstract zzix zze(String str);

    public zzjz zzg() {
        return zzjz.zze();
    }

    public long zzl() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public abstract String zzn();
}
