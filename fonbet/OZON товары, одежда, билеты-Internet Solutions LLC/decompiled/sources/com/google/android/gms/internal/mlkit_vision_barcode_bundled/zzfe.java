package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes9.dex */
final class zzfe implements zzgf {
    private static final zzfk zza = new zzfc();
    private final zzfk zzb;

    public zzfe() {
        zzea zza2 = zzea.zza();
        int i11 = zzfu.zza;
        zzfd zzfdVar = new zzfd(zza2, zza);
        byte[] bArr = zzep.zzb;
        this.zzb = zzfdVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgf
    public final zzge zza(Class cls) {
        int i11 = zzgg.zza;
        if (!zzeh.class.isAssignableFrom(cls)) {
            int i12 = zzfu.zza;
        }
        zzfj zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i13 = zzfu.zza;
            return zzfq.zzc(zzgg.zzm(), zzdv.zza(), zzb.zza());
        }
        int i14 = zzfu.zza;
        return zzfp.zzl(cls, zzb, zzft.zza(), zzfa.zza(), zzgg.zzm(), zzb.zzc() + (-1) != 1 ? zzdv.zza() : null, zzfi.zza());
    }
}
