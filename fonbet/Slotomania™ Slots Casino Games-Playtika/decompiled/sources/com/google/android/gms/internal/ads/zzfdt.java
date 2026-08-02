package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfdt implements zzfby {
    public zzfdt(zzceg zzcegVar, zzhbs zzhbsVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        final ListenableFuture zza = zzhbi.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgO)).booleanValue()) {
            zza = zzhbi.zza(null);
        }
        final ListenableFuture zza2 = zzhbi.zza(null);
        return zzhbi.zzo(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfds
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfdu((String) ListenableFuture.this.get(), (String) zza2.get());
            }
        }, zzcff.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 47;
    }
}
