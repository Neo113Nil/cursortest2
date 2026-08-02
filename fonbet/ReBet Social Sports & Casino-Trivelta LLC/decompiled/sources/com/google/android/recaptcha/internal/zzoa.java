package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zzoa implements zzox {
    private static final zzog zza = new zzny();
    private final zzog zzb;

    public zzoa() {
        zzmw zza2 = zzmw.zza();
        int i10 = zzos.zza;
        zznz zznzVar = new zznz(zza2, zza);
        byte[] bArr = zznl.zzb;
        this.zzb = zznzVar;
    }

    @Override // com.google.android.recaptcha.internal.zzox
    public final zzow zza(Class cls) {
        int i10 = zzoy.zza;
        if (!zznd.class.isAssignableFrom(cls)) {
            int i11 = zzos.zza;
        }
        zzof zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i12 = zzos.zza;
            return zzom.zzc(zzoy.zzm(), zzmr.zza(), zzb.zza());
        }
        int i13 = zzos.zza;
        return zzol.zzm(cls, zzb, zzop.zza(), zznw.zza(), zzoy.zzm(), zzb.zzc() + (-1) != 1 ? zzmr.zza() : null, zzoe.zza());
    }
}
