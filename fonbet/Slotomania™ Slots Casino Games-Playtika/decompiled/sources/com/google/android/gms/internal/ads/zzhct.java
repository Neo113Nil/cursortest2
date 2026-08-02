package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhct extends zzidr implements zzifd {
    private static final zzhct zzb;
    private static volatile zzifk zzc;
    private zzied zza = zzbM();

    static {
        zzhct zzhctVar = new zzhct();
        zzb = zzhctVar;
        zzidr.zzbu(zzhct.class, zzhctVar);
    }

    private zzhct() {
    }

    public static zzhcq zzb() {
        return (zzhcq) zzb.zzbn();
    }

    public final int zza() {
        return this.zza.size();
    }

    final /* synthetic */ void zzc(zzhcs zzhcsVar) {
        zzhcsVar.getClass();
        zzied zziedVar = this.zza;
        if (!zziedVar.zza()) {
            this.zza = zzidr.zzbN(zziedVar);
        }
        this.zza.add(zzhcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzhcs.class});
        }
        if (ordinal == 3) {
            return new zzhct();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhcq(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzc;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhct.class) {
            zzifkVar = zzc;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzb);
                zzc = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
