package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes9.dex */
abstract class zzvy {
    private static final zzvy zza = new zzvu(null);
    private static final zzvy zzb = new zzvw(0 == true ? 1 : 0);

    /* synthetic */ zzvy(zzvx zzvxVar) {
    }

    static zzvy zzd() {
        return zza;
    }

    static zzvy zze() {
        return zzb;
    }

    abstract <L> List<L> zza(Object obj, long j11);

    abstract void zzb(Object obj, long j11);

    abstract <L> void zzc(Object obj, Object obj2, long j11);
}
