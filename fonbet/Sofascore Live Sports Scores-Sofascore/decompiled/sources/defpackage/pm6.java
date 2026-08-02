package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pm6 implements AdListener, NativeAdListener {
    public final WeakReference a;
    public final NativeAdBase b;
    public final /* synthetic */ qm6 c;

    public pm6(qm6 qm6Var, Context context, NativeAdBase nativeAdBase) {
        this.c = qm6Var;
        this.b = nativeAdBase;
        this.a = new WeakReference(context);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        qm6 qm6Var = this.c;
        qm6Var.s.reportAdClicked();
        qm6Var.s.onAdOpened();
        qm6Var.s.onAdLeftApplication();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        qm6 qm6Var = this.c;
        MediationAdLoadCallback mediationAdLoadCallback = qm6Var.q;
        if (ad != this.b) {
            AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        Context context = (Context) this.a.get();
        if (context == null) {
            AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError2.getMessage();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        NativeAdBase nativeAdBase = qm6Var.r;
        boolean z = false;
        boolean z2 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        if (nativeAdBase instanceof NativeBannerAd) {
            z = z2;
        } else if (z2 && nativeAdBase.getAdCoverImage() != null && qm6Var.t != null) {
            z = true;
        }
        if (!z) {
            AdError adError3 = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError3.getMessage();
            adError3.getMessage();
            mediationAdLoadCallback.onFailure(adError3);
            return;
        }
        qm6Var.setHeadline(qm6Var.r.getAdHeadline());
        if (qm6Var.r.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new om6(Uri.parse(qm6Var.r.getAdCoverImage().getUrl())));
            qm6Var.setImages(arrayList);
        }
        qm6Var.setBody(qm6Var.r.getAdBodyText());
        Drawable preloadedIconViewDrawable = qm6Var.r.getPreloadedIconViewDrawable();
        NativeAdBase nativeAdBase2 = qm6Var.r;
        if (preloadedIconViewDrawable != null) {
            Drawable preloadedIconViewDrawable2 = nativeAdBase2.getPreloadedIconViewDrawable();
            om6 om6Var = new om6();
            om6Var.a = preloadedIconViewDrawable2;
            qm6Var.setIcon(om6Var);
        } else if (nativeAdBase2.getAdIcon() == null) {
            qm6Var.setIcon(new om6());
        } else {
            qm6Var.setIcon(new om6(Uri.parse(qm6Var.r.getAdIcon().getUrl())));
        }
        qm6Var.setCallToAction(qm6Var.r.getAdCallToAction());
        qm6Var.setAdvertiser(qm6Var.r.getAdvertiserName());
        qm6Var.t.setListener(new hpo(qm6Var));
        qm6Var.setHasVideoContent(true);
        qm6Var.setMediaView(qm6Var.t);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", qm6Var.r.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, qm6Var.r.getAdSocialContext());
        qm6Var.setExtras(bundle);
        qm6Var.setAdChoicesContent(new AdOptionsView(context, qm6Var.r, null));
        qm6Var.s = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(qm6Var);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getMessage();
        this.c.q.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad) {
    }
}
