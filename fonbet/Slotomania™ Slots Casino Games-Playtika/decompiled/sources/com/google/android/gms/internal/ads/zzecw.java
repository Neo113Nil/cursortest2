package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
final class zzecw extends AdListener {
    final /* synthetic */ zzedc zza;

    zzecw(zzedc zzedcVar) {
        Objects.requireNonNull(zzedcVar);
        this.zza = zzedcVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzm;
        zzedc zzedcVar = this.zza;
        zzm = zzedc.zzm(loadAdError);
        zzedcVar.zzg(zzm);
    }
}
