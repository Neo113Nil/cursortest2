package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zzu extends zzuz<zzu, zzt> implements zzwl {
    private static final zzu zza;
    private int zze;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private String zzf = "";
    private long zzh = 2147483647L;

    static {
        zzu zzuVar = new zzu();
        zza = zzuVar;
        zzuz.zzak(zzu.class, zzuVar);
    }

    private zzu() {
    }

    public final long zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zzu();
        }
        zzn zznVar = null;
        if (i12 == 4) {
            return new zzt(zznVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        return (this.zze & 1) != 0;
    }
}
