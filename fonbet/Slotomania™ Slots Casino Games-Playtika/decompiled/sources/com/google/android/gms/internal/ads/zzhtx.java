package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhtx extends zzidr implements zzifd {
    private static final zzhtx zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private zzhtz zzc;

    static {
        zzhtx zzhtxVar = new zzhtx();
        zzd = zzhtxVar;
        zzidr.zzbu(zzhtx.class, zzhtxVar);
    }

    private zzhtx() {
    }

    public static zzhtx zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhtx) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhtw zzd() {
        return (zzhtw) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhtz zzb() {
        zzhtz zzhtzVar = this.zzc;
        return zzhtzVar == null ? zzhtz.zzc() : zzhtzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhtx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtw(bArr);
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
        synchronized (zzhtx.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(zzhtz zzhtzVar) {
        zzhtzVar.getClass();
        this.zzc = zzhtzVar;
        this.zza |= 1;
    }
}
