package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzezc implements zzfby {
    private final zzhbs zza;
    private final zzfkm zzb;

    zzezc(zzhbs zzhbsVar, zzfkm zzfkmVar) {
        this.zza = zzhbsVar;
        this.zzb = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzezc.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 21;
    }

    final /* synthetic */ zzezd zzc() {
        return new zzezd("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd)));
    }
}
