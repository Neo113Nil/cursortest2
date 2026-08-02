package com.google.android.gms.internal.cast;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzza implements zzzt {
    private static final zzzg zzb = new zzyy();
    private final zzzg zza;

    public zzza() {
        zzxz zza = zzxz.zza();
        int i = zzxb.zza;
        zzyz zzyzVar = new zzyz(zza, zzb);
        byte[] bArr = zzym.zzb;
        this.zza = zzyzVar;
    }

    @Override // com.google.android.gms.internal.cast.zzzt
    public final zzzs zza(Class cls) {
        int i = zzzu.zza;
        if (!zzyd.class.isAssignableFrom(cls)) {
            int i2 = zzxb.zza;
        }
        zzzf zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i3 = zzxb.zza;
            return zzzm.zzi(zzzu.zzB(), zzxu.zza(), zzc.zzb());
        }
        int i4 = zzxb.zza;
        return zzzl.zzi(cls, zzc, zzzo.zza(), zzyw.zza(), zzzu.zzB(), zzc.zzc() + (-1) != 1 ? zzxu.zza() : null, zzze.zza());
    }
}
