package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzgx extends zzkc implements zzlk {
    private static final zzgx zza;
    private int zze;
    private int zzf;
    private zzkj zzg = zzkc.zzbG();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        zzgx zzgxVar = new zzgx();
        zza = zzgxVar;
        zzkc.zzbM(zzgx.class, zzgxVar);
    }

    private zzgx() {
    }

    public final double zza() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final List zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzj;
    }

    public final boolean zzg() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 4) != 0;
    }

    public final int zzj() {
        int zza2 = zzgw.zza(this.zzf);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zzgv.zza, "zzg", zzgx.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new zzgx();
        }
        zzgm zzgmVar = null;
        if (i12 == 4) {
            return new zzgt(zzgmVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
