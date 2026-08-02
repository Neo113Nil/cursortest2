package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzbtd implements zzcfo {
    final /* synthetic */ zzbtc zza;

    zzbtd(zzbth zzbthVar, zzbtc zzbtcVar) {
        this.zza = zzbtcVar;
        Objects.requireNonNull(zzbthVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzf(((zzbsd) obj).zzl());
    }
}
