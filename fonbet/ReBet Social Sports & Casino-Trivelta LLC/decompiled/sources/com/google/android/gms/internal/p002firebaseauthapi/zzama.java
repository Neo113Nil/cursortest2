package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzama implements zzane {
    private static final zzamj zza = new zzalz();
    private final zzamj zzb;

    public zzama() {
        this(new zzamb(zzalg.zza(), zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final <T> zzanb<T> zza(Class<T> cls) {
        zzand.zza((Class<?>) cls);
        zzamk zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzams.zza(zzand.zza(), zzaky.zza(), zza2.zza());
        }
        return zzamq.zza(cls, zza2, zzamw.zza(), zzaly.zza(), zzand.zza(), zzamc.zza[zza2.zzb().ordinal()] != 1 ? zzaky.zza() : null, zzamh.zza());
    }

    private zzama(zzamj zzamjVar) {
        this.zzb = (zzamj) zzalh.zza(zzamjVar, "messageInfoFactory");
    }
}
