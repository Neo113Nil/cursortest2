package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzfac implements zzfby {
    private static String zzc;
    private final zzhbs zza;
    private final Context zzb;

    public zzfac(zzhbs zzhbsVar, Context context) {
        this.zza = zzhbsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfac.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 27;
    }

    final /* synthetic */ zzfad zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue()) {
            return new zzfad(null);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgt)).booleanValue()) {
            return new zzfad(com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb));
        }
        if (zzc == null) {
            zzc = com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb);
        }
        return new zzfad(zzc);
    }
}
