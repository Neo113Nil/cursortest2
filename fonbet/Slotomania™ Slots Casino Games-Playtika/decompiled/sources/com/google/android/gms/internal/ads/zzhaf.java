package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhaf extends zzhah {
    zzhaf(ListenableFuture listenableFuture, zzhaq zzhaqVar) {
        super(listenableFuture, zzhaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzhaq zzhaqVar = (zzhaq) obj;
        ListenableFuture zza = zzhaqVar.zza(obj2);
        zzgsw.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhaqVar);
        return zza;
    }
}
