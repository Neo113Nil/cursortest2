package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzb extends zzbd {
    private final zza zza;

    public zzb(zza zzaVar) {
        this.zza = zzaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbe
    public final void zzb() {
        this.zza.onAdClicked();
    }
}
