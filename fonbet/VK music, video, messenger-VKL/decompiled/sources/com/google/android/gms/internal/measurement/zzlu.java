package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes12.dex */
final class zzlu {
    private static final zzlu zza = new zzlu();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzly zzb = new zzle();

    private zzlu() {
    }

    public static zzlu zza() {
        return zza;
    }

    public final zzlx zzb(Class cls) {
        zzkn.zzf(cls, "messageType");
        zzlx zzlxVar = (zzlx) this.zzc.get(cls);
        if (zzlxVar != null) {
            return zzlxVar;
        }
        zzlx zza2 = this.zzb.zza(cls);
        zzkn.zzf(cls, "messageType");
        zzkn.zzf(zza2, "schema");
        zzlx zzlxVar2 = (zzlx) this.zzc.putIfAbsent(cls, zza2);
        return zzlxVar2 == null ? zza2 : zzlxVar2;
    }
}
