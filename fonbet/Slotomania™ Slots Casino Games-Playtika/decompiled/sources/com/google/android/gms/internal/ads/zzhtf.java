package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhtf extends zzidr implements zzifd {
    private static final zzhtf zze;
    private static volatile zzifk zzf;
    private int zza;
    private zzhth zzb;
    private int zzc;
    private zzicn zzd = zzicn.zza;

    static {
        zzhtf zzhtfVar = new zzhtf();
        zze = zzhtfVar;
        zzidr.zzbu(zzhtf.class, zzhtfVar);
    }

    private zzhtf() {
    }

    public static zzhtf zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhtf) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzhte zze() {
        return (zzhte) zze.zzbn();
    }

    public final zzhth zza() {
        zzhth zzhthVar = this.zzb;
        return zzhthVar == null ? zzhth.zzc() : zzhthVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzicn zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhtf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhte(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzf;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhtf.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzg(zzhth zzhthVar) {
        zzhthVar.getClass();
        this.zzb = zzhthVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzc = i;
    }

    final /* synthetic */ void zzi(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }
}
