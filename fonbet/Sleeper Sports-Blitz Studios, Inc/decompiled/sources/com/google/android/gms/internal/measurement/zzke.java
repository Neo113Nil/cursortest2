package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzke implements zzll {
    private static final zzkr zza = new zzkh();
    private final zzkr zzb;

    @Override // com.google.android.gms.internal.measurement.zzll
    public final <T> zzli<T> zza(Class<T> cls) {
        zzlk.zza((Class<?>) cls);
        zzko zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzkw.zza(zzlk.zza(), zzjb.zza(), zza2.zza());
        }
        return zzku.zza(cls, zza2, zzla.zza(), zzkc.zza(), zzlk.zza(), zzkg.zza[zza2.zzb().ordinal()] != 1 ? zzjb.zza() : null, zzkp.zza());
    }

    public zzke() {
        this(new zzkj(zzji.zza(), zza));
    }

    private zzke(zzkr zzkrVar) {
        this.zzb = (zzkr) zzjn.zza(zzkrVar, "messageInfoFactory");
    }
}
