package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes9.dex */
final class zzwt {
    private static final zzwt zza = new zzwt();
    private final ConcurrentMap<Class<?>, zzwx<?>> zzc = new ConcurrentHashMap();
    private final zzwy zzb = new zzwc();

    private zzwt() {
    }

    public static zzwt zza() {
        return zza;
    }

    public final <T> zzwx<T> zzb(Class<T> cls) {
        zzvi.zzf(cls, "messageType");
        zzwx<T> zzwxVar = (zzwx) this.zzc.get(cls);
        if (zzwxVar != null) {
            return zzwxVar;
        }
        zzwx<T> zza2 = this.zzb.zza(cls);
        zzvi.zzf(cls, "messageType");
        zzvi.zzf(zza2, "schema");
        zzwx<T> zzwxVar2 = (zzwx) this.zzc.putIfAbsent(cls, zza2);
        return zzwxVar2 == null ? zza2 : zzwxVar2;
    }
}
