package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzewo implements zzfby {
    private final zzhbs zza;

    zzewo(zzhbs zzhbsVar) {
        this.zza = zzhbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzewp(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzb()).longValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 55;
    }
}
