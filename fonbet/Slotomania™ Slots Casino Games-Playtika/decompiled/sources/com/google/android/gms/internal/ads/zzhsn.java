package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhsn extends zzidr implements zzifd {
    private static final zzhsn zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzhsf zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhsn zzhsnVar = new zzhsn();
        zzf = zzhsnVar;
        zzidr.zzbu(zzhsn.class, zzhsnVar);
    }

    private zzhsn() {
    }

    public static zzhsm zze() {
        return (zzhsm) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzhsf zzb() {
        zzhsf zzhsfVar = this.zzb;
        return zzhsfVar == null ? zzhsf.zze() : zzhsfVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhtb zzd() {
        zzhtb zzb = zzhtb.zzb(this.zze);
        return zzb == null ? zzhtb.UNRECOGNIZED : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhsn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsm(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzg;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhsn.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzg(zzhsf zzhsfVar) {
        zzhsfVar.getClass();
        this.zzb = zzhsfVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzd = i;
    }

    final /* synthetic */ void zzi(zzhtb zzhtbVar) {
        this.zze = zzhtbVar.zza();
    }

    public final int zzk() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzc = zzhsg.zza(i);
    }
}
