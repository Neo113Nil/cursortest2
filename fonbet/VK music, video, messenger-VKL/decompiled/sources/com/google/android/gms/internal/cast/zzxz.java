package com.google.android.gms.internal.cast;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzxz implements zzzg {
    private static final zzxz zza = new zzxz();

    private zzxz() {
    }

    public static zzxz zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.cast.zzzg
    public final boolean zzb(Class cls) {
        return zzyd.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.cast.zzzg
    public final zzzf zzc(Class cls) {
        if (!zzyd.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzzf) zzyd.zzF(cls.asSubclass(zzyd.class)).zzb(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
