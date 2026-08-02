package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgev extends zzidr implements zzifd {
    private static final zzgev zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzied zzb = zzbM();
    private zzihf zzc;

    static {
        zzgev zzgevVar = new zzgev();
        zzd = zzgevVar;
        zzidr.zzbu(zzgev.class, zzgevVar);
    }

    private zzgev() {
    }

    public static zzgeu zza() {
        return (zzgeu) zzd.zzbn();
    }

    final /* synthetic */ void zzb(zzget zzgetVar) {
        zzgetVar.getClass();
        zzied zziedVar = this.zzb;
        if (!zziedVar.zza()) {
            this.zzb = zzidr.zzbN(zziedVar);
        }
        this.zzb.add(zzgetVar);
    }

    final /* synthetic */ void zzc(zzihf zzihfVar) {
        zzihfVar.getClass();
        this.zzc = zzihfVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzget.class, "zzc"});
        }
        if (ordinal == 3) {
            return new zzgev();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgeu(bArr);
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
        synchronized (zzgev.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
