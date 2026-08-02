package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzifm {
    private static final zzifm zza = new zzifm();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzifv zzb = new zziet();

    private zzifm() {
    }

    static zzifm zza() {
        return zza;
    }

    final zzifu zzb(Class cls) {
        zziee.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzc;
        zzifu zzifuVar = (zzifu) concurrentMap.get(cls);
        if (zzifuVar == null) {
            zzifuVar = this.zzb.zza(cls);
            zzifu zzifuVar2 = (zzifu) concurrentMap.putIfAbsent(cls, zzifuVar);
            if (zzifuVar2 != null) {
                return zzifuVar2;
            }
        }
        return zzifuVar;
    }
}
