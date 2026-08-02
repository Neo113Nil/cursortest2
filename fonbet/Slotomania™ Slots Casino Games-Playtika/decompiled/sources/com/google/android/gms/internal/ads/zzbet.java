package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbet extends com.google.android.gms.ads.internal.client.zzck {
    private final AppEventListener zza;

    public zzbet(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void zzb(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }

    public final AppEventListener zzc() {
        return this.zza;
    }
}
