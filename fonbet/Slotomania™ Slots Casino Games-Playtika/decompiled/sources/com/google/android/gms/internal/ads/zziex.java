package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zziex {
    zziex() {
    }

    public static final boolean zza(Object obj) {
        return !((zziew) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zziew zziewVar = (zziew) obj;
        zziew zziewVar2 = (zziew) obj2;
        if (!zziewVar2.isEmpty()) {
            if (!zziewVar.zze()) {
                zziewVar = zziewVar.zzc();
            }
            zziewVar.zzb(zziewVar2);
        }
        return zziewVar;
    }
}
