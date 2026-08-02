package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhql extends zzidr implements zzifd {
    private static final zzhql zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzhqn zzb;
    private int zzc;

    static {
        zzhql zzhqlVar = new zzhql();
        zzd = zzhqlVar;
        zzidr.zzbu(zzhql.class, zzhqlVar);
    }

    private zzhql() {
    }

    public static zzhqk zzc() {
        return (zzhqk) zzd.zzbn();
    }

    public static zzhql zzd() {
        return zzd;
    }

    public final zzhqn zza() {
        zzhqn zzhqnVar = this.zzb;
        return zzhqnVar == null ? zzhqn.zzc() : zzhqnVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhql();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqk(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zze;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhql.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(zzhqn zzhqnVar) {
        zzhqnVar.getClass();
        this.zzb = zzhqnVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
