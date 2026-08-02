package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfqc extends zzidr implements zzifd {
    private static final zzfqc zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzied zzb = zzbM();
    private zzihf zzc;

    static {
        zzfqc zzfqcVar = new zzfqc();
        zzd = zzfqcVar;
        zzidr.zzbu(zzfqc.class, zzfqcVar);
    }

    private zzfqc() {
    }

    public static zzfpz zzb() {
        return (zzfpz) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb.size();
    }

    final /* synthetic */ void zzc(zzfqb zzfqbVar) {
        zzfqbVar.getClass();
        zzied zziedVar = this.zzb;
        if (!zziedVar.zza()) {
            this.zzb = zzidr.zzbN(zziedVar);
        }
        this.zzb.add(zzfqbVar);
    }

    final /* synthetic */ void zzd() {
        this.zzb = zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfqb.class, "zzc"});
        }
        if (ordinal == 3) {
            return new zzfqc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfpz(bArr);
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
        synchronized (zzfqc.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
