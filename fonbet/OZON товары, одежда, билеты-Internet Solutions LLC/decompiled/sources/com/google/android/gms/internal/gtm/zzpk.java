package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;

/* loaded from: classes9.dex */
final class zzpk<T> {
    private Status zza;
    private T zzb;
    private long zzc;

    public zzpk(Status status, T t2, long j11) {
        this.zza = status;
        this.zzb = t2;
        this.zzc = j11;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb(T t2) {
        this.zzb = t2;
    }

    public final void zzc(long j11) {
        this.zzc = j11;
    }

    public final void zzd(Status status) {
        this.zza = status;
    }
}
