package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzet<V> {
    private final zzes<V> zza;
    private final V zzb;
    private final V zzc;
    private final Object zzd = new Object();

    private zzet(V v11, V v12, zzes<V> zzesVar) {
        this.zzb = v11;
        this.zzc = v12;
        this.zza = zzesVar;
    }

    static <T> zzet<T> zza(T t2, T t11, zzes<T> zzesVar) {
        return new zzet<>(t2, t11, zzesVar);
    }

    public final V zzb() {
        synchronized (this.zzd) {
        }
        return this.zzb;
    }
}
