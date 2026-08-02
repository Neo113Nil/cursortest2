package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzewj {
    public final ListenableFuture zza;
    private final long zzb;
    private final Clock zzc;

    public zzewj(ListenableFuture listenableFuture, long j, Clock clock) {
        this.zza = listenableFuture;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
