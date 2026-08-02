package com.google.android.gms.internal.measurement;

/* loaded from: classes9.dex */
public final class zzfu extends zzkc implements zzlk {
    private static final zzfu zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzfu zzfuVar = new zzfu();
        zza = zzfuVar;
        zzkc.zzbM(zzfu.class, zzfuVar);
    }

    private zzfu() {
    }

    public static zzft zza() {
        return (zzft) zza.zzbA();
    }

    static /* synthetic */ void zzc(zzfu zzfuVar, String str) {
        str.getClass();
        zzfuVar.zze |= 1;
        zzfuVar.zzf = str;
    }

    static /* synthetic */ void zzd(zzfu zzfuVar, long j11) {
        zzfuVar.zze |= 2;
        zzfuVar.zzg = j11;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzfu();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzft(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
