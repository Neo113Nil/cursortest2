package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzetz implements zzfby {
    private final zzhbs zza;
    private final zzfkm zzb;

    zzetz(zzhbs zzhbsVar, zzfkm zzfkmVar, zzflc zzflcVar) {
        this.zza = zzhbsVar;
        this.zzb = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzety
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzetz.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 5;
    }

    final /* synthetic */ zzeua zzc() {
        List asList;
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhY)).booleanValue()) {
            String zzc = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzia)).booleanValue()) {
                asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzib)).split(","));
            } else {
                asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhZ)).split(","));
            }
            if (asList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(zzc))) {
                str = zzflc.zza();
            }
        }
        return new zzeua(str);
    }
}
