package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzegu {
    private final zzcmx zza;
    private final Context zzb;
    private final Executor zzc;

    zzegu(zzcmx zzcmxVar, Context context, Executor executor) {
        this.zza = zzcmxVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzegu.this.zzb();
            }
        });
    }

    final /* synthetic */ void zzb() {
        zzegw zzh = this.zza.zzh();
        zzh.zzb(this.zzb);
        zzh.zza().zza().zza();
    }
}
