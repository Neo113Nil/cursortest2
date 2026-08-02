package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes7.dex */
final class zzgf {
    private static final zzgf zza = new zzgf();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgj zzb = new zzfp();

    private zzgf() {
    }

    public static zzgf zza() {
        return zza;
    }

    public final zzgi zzb(Class cls) {
        zzfa.zzc(cls, "messageType");
        zzgi zzgiVar = (zzgi) this.zzc.get(cls);
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zza2 = this.zzb.zza(cls);
        zzfa.zzc(cls, "messageType");
        zzgi zzgiVar2 = (zzgi) this.zzc.putIfAbsent(cls, zza2);
        return zzgiVar2 == null ? zza2 : zzgiVar2;
    }
}
