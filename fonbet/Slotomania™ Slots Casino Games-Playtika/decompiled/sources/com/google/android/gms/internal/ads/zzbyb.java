package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
final class zzbyb extends zzbmv {
    final /* synthetic */ zzbyc zza;

    /* synthetic */ zzbyb(zzbyc zzbycVar, byte[] bArr) {
        Objects.requireNonNull(zzbycVar);
        this.zza = zzbycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zze(zzbmj zzbmjVar) {
        zzbyc zzbycVar = this.zza;
        zzbycVar.zzd().onCustomFormatAdLoaded(zzbycVar.zzc(zzbmjVar));
    }
}
