package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhqx extends zzidr implements zzifd {
    private static final zzhqx zzc;
    private static volatile zzifk zzd;
    private int zza;
    private int zzb;

    static {
        zzhqx zzhqxVar = new zzhqx();
        zzc = zzhqxVar;
        zzidr.zzbu(zzhqx.class, zzhqxVar);
    }

    private zzhqx() {
    }

    public static zzhqx zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhqx) zzidr.zzbT(zzc, zzicnVar, zzidbVar);
    }

    public static zzhqw zzd() {
        return (zzhqw) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhqx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqw(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzd;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhqx.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }
}
