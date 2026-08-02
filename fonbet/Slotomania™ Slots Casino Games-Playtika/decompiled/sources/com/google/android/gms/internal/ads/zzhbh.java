package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhbh {
    private final boolean zza;
    private final zzgvz zzb;

    /* synthetic */ zzhbh(boolean z, zzgvz zzgvzVar, byte[] bArr) {
        this.zza = z;
        this.zzb = zzgvzVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzhaw(this.zzb, this.zza, executor, callable);
    }
}
