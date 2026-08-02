package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zza implements CustomEventBannerListener {
    public final CustomEventAdapter a;
    public final MediationBannerListener b;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.a = customEventAdapter;
        this.b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzo.zzd("Custom event adapter called onAdClicked.");
        this.b.onAdClicked(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.zzd("Custom event adapter called onAdClosed.");
        this.b.onAdClosed(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzo.zzd("Custom event adapter called onAdFailedToLoad.");
        this.b.onAdFailedToLoad(this.a, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzo.zzd("Custom event adapter called onAdLeftApplication.");
        this.b.onAdLeftApplication(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void onAdLoaded(View view) {
        zzo.zzd("Custom event adapter called onAdLoaded.");
        CustomEventAdapter customEventAdapter = this.a;
        customEventAdapter.a = view;
        this.b.onAdLoaded(customEventAdapter);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzo.zzd("Custom event adapter called onAdOpened.");
        this.b.onAdOpened(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzo.zzd("Custom event adapter called onAdFailedToLoad.");
        this.b.onAdFailedToLoad(this.a, adError);
    }
}
