package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzle {
    private static final zzle zza = new zzle();
    private final ConcurrentMap<Class<?>, zzli<?>> zzc = new ConcurrentHashMap();
    private final zzll zzb = new zzke();

    public static zzle zza() {
        return zza;
    }

    public final <T> zzli<T> zza(Class<T> cls) {
        zzjn.zza(cls, "messageType");
        zzli<T> zzliVar = (zzli) this.zzc.get(cls);
        if (zzliVar == null) {
            zzliVar = this.zzb.zza(cls);
            zzjn.zza(cls, "messageType");
            zzjn.zza(zzliVar, "schema");
            zzli<T> zzliVar2 = (zzli) this.zzc.putIfAbsent(cls, zzliVar);
            if (zzliVar2 != null) {
                return zzliVar2;
            }
        }
        return zzliVar;
    }

    public final <T> zzli<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzle() {
    }
}
