package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhcs extends zzidr implements zzifd {
    private static final zzhcs zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzhcp zzb;
    private zzigf zzc;
    private zzied zzd = zzbM();
    private zziec zze = zzbE();

    static {
        zzhcs zzhcsVar = new zzhcs();
        zzf = zzhcsVar;
        zzidr.zzbu(zzhcs.class, zzhcsVar);
    }

    private zzhcs() {
    }

    public static zzhcr zza() {
        return (zzhcr) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zzhcp zzhcpVar) {
        zzhcpVar.getClass();
        this.zzb = zzhcpVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzc(Iterable iterable) {
        zziec zziecVar = this.zze;
        if (!zziecVar.zza()) {
            this.zze = zzidr.zzbF(zziecVar);
        }
        zzibw.zzaW(iterable, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", zzigf.class, "zze"});
        }
        if (ordinal == 3) {
            return new zzhcs();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhcr(bArr);
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
        synchronized (zzhcs.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
