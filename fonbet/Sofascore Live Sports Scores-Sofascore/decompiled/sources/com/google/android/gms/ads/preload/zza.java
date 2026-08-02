package com.google.android.gms.ads.preload;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zza extends zzcd {
    public final /* synthetic */ PreloadCallbackV2 a;

    public zza(zzb zzbVar, PreloadCallbackV2 preloadCallbackV2) {
        this.a = preloadCallbackV2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(String str, @Nullable zzdx zzdxVar) {
        this.a.onAdPreloaded(str, ResponseInfo.zzb(zzdxVar));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(String str) {
        this.a.onAdsExhausted(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzg(String str, zze zzeVar) {
        this.a.onAdFailedToPreload(str, zzeVar.zzb());
    }
}
