package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzga extends zzkc implements zzlk {
    private static final zzga zza;
    private zzkj zze = zzkc.zzbG();

    static {
        zzga zzgaVar = new zzga();
        zza = zzgaVar;
        zzkc.zzbM(zzga.class, zzgaVar);
    }

    private zzga() {
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbA();
    }

    static /* synthetic */ void zze(zzga zzgaVar, zzgc zzgcVar) {
        zzgcVar.getClass();
        zzkj zzkjVar = zzgaVar.zze;
        if (!zzkjVar.zzc()) {
            zzgaVar.zze = zzkc.zzbH(zzkjVar);
        }
        zzgaVar.zze.add(zzgcVar);
    }

    public final zzgc zzc(int i11) {
        return (zzgc) this.zze.get(0);
    }

    public final List zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgc.class});
        }
        if (i12 == 3) {
            return new zzga();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzfz(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
