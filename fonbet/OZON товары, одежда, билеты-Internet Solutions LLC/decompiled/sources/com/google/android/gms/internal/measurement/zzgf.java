package com.google.android.gms.internal.measurement;

/* loaded from: classes9.dex */
public final class zzgf extends zzkc implements zzlk {
    private static final zzgf zza;
    private int zze;
    private int zzf = 1;
    private zzkj zzg = zzkc.zzbG();

    static {
        zzgf zzgfVar = new zzgf();
        zza = zzgfVar;
        zzkc.zzbM(zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static zzgd zza() {
        return (zzgd) zza.zzbA();
    }

    static /* synthetic */ void zzc(zzgf zzgfVar, zzfu zzfuVar) {
        zzfuVar.getClass();
        zzkj zzkjVar = zzgfVar.zzg;
        if (!zzkjVar.zzc()) {
            zzgfVar.zzg = zzkc.zzbH(zzkjVar);
        }
        zzgfVar.zzg.add(zzfuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzge.zza, "zzg", zzfu.class});
        }
        if (i12 == 3) {
            return new zzgf();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzgd(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
