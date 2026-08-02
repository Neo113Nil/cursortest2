package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zznd implements zzny {
    private static final zznk zzb = new zznb();
    private final zznk zza;

    public zznd() {
        zzma zza = zzma.zza();
        int i10 = zznu.zza;
        zznc zzncVar = new zznc(zza, zzb);
        byte[] bArr = zzmp.zzb;
        this.zza = zzncVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzny
    public final zznx zza(Class cls) {
        int i10 = zznz.zza;
        if (!zzmf.class.isAssignableFrom(cls)) {
            int i11 = zznu.zza;
        }
        zznj zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i12 = zznu.zza;
            return zznq.zzg(zznz.zzA(), zzlu.zza(), zzc.zzb());
        }
        int i13 = zznu.zza;
        return zznp.zzl(cls, zzc, zzns.zza(), zzmz.zza(), zznz.zzA(), zzc.zzc() + (-1) != 1 ? zzlu.zza() : null, zzni.zza());
    }
}
