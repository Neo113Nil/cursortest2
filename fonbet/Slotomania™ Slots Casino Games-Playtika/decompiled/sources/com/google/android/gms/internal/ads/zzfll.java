package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfll {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzhbs zzc;

    public zzfll(Callable callable, zzhbs zzhbsVar) {
        this.zzb = callable;
        this.zzc = zzhbsVar;
    }

    public final synchronized void zza(int i) {
        Deque deque = this.zza;
        int size = i - deque.size();
        for (int i2 = 0; i2 < size; i2++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    public final synchronized ListenableFuture zzb() {
        zza(1);
        return (ListenableFuture) this.zza.poll();
    }

    public final synchronized void zzc(ListenableFuture listenableFuture) {
        this.zza.addFirst(listenableFuture);
    }
}
