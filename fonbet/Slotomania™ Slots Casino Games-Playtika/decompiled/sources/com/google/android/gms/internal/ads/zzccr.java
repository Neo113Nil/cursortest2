package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzccr implements zzhbf {
    final /* synthetic */ ListenableFuture zza;

    zzccr(zzccw zzccwVar, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
        Objects.requireNonNull(zzccwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        List list;
        list = zzccw.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzccw.zzc;
        list.remove(this.zza);
    }
}
