package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfoj {
    public static final zzfop zza(ListenableFuture listenableFuture, Object obj, zzfoq zzfoqVar) {
        ListenableFuture listenableFuture2;
        listenableFuture2 = zzfoq.zza;
        return new zzfop(zzfoqVar, obj, null, listenableFuture2, Collections.emptyList(), listenableFuture, null);
    }

    public static final zzfop zzb(Callable callable, Object obj, zzfoq zzfoqVar) {
        return zzc(callable, zzfoqVar.zze(), obj, zzfoqVar);
    }

    public static final zzfop zzc(Callable callable, zzhbs zzhbsVar, Object obj, zzfoq zzfoqVar) {
        ListenableFuture listenableFuture;
        listenableFuture = zzfoq.zza;
        return new zzfop(zzfoqVar, obj, null, listenableFuture, Collections.emptyList(), zzhbsVar.submit(callable), null);
    }

    public static final zzfop zzd(final zzfoe zzfoeVar, zzhbs zzhbsVar, Object obj, zzfoq zzfoqVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfoi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfoe.this.zza();
                return null;
            }
        }, zzhbsVar, obj, zzfoqVar);
    }
}
