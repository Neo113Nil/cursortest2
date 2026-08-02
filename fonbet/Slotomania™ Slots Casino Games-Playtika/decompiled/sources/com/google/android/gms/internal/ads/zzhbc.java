package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public abstract class zzhbc extends zzgvq implements Future {
    protected zzhbc() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return zza().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return zza().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zza().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zza().isDone();
    }

    protected abstract Future zza();

    @Override // com.google.android.gms.internal.ads.zzgvq
    protected /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zza().get(j, timeUnit);
    }
}
