package com.google.android.gms.internal.cast;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzzp {
    private static final zzzp zza = new zzzp();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzzt zzb = new zzza();

    private zzzp() {
    }

    public static zzzp zza() {
        return zza;
    }

    public final zzzs zzb(Class cls) {
        byte[] bArr = zzym.zzb;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentMap concurrentMap = this.zzc;
        zzzs zzzsVar = (zzzs) concurrentMap.get(cls);
        if (zzzsVar == null) {
            zzzsVar = this.zzb.zza(cls);
            zzzs zzzsVar2 = (zzzs) concurrentMap.putIfAbsent(cls, zzzsVar);
            if (zzzsVar2 != null) {
                return zzzsVar2;
            }
        }
        return zzzsVar;
    }
}
