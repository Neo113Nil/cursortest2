package defpackage;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbnn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g2o extends AdListener implements zzg, zze, zzd {
    public final AbstractAdViewAdapter a;
    public final MediationNativeListener b;

    public g2o(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.a = abstractAdViewAdapter;
        this.b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.b.onAdClicked(this.a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.b.onAdClosed(this.a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.b.onAdFailedToLoad(this.a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.b.onAdImpression(this.a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.b.onAdOpened(this.a);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        b4n b4nVar = new b4n();
        b4nVar.setHeadline(unifiedNativeAd.zza());
        b4nVar.setImages(unifiedNativeAd.zzb());
        b4nVar.setBody(unifiedNativeAd.zzc());
        b4nVar.setIcon(unifiedNativeAd.zzd());
        b4nVar.setCallToAction(unifiedNativeAd.zze());
        b4nVar.setAdvertiser(unifiedNativeAd.zzf());
        b4nVar.setStarRating(unifiedNativeAd.zzg());
        b4nVar.setStore(unifiedNativeAd.zzh());
        b4nVar.setPrice(unifiedNativeAd.zzi());
        b4nVar.zzb(unifiedNativeAd.zzk());
        b4nVar.setOverrideImpressionRecording(true);
        b4nVar.setOverrideClickHandling(true);
        b4nVar.zza(unifiedNativeAd.zzj());
        this.b.onAdLoaded(this.a, b4nVar);
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbnn zzbnnVar) {
        this.b.zzc(this.a, zzbnnVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbnn zzbnnVar, String str) {
        this.b.zzd(this.a, zzbnnVar, str);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }
}
