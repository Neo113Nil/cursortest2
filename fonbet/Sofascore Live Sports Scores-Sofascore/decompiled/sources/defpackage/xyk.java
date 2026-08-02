package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ui.view.MediaView;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xyk extends UnifiedNativeAdMapper implements NativeAdListener {
    public final MediationAdLoadCallback s;
    public MediationNativeAdCallback t;
    public NativeAd u;
    public MediaView v;
    public String w;
    public final myk x;

    public xyk(MediationAdLoadCallback mediationAdLoadCallback, myk mykVar) {
        this.s = mediationAdLoadCallback;
        this.x = mykVar;
    }

    public final void a(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        int i;
        int i2;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        VideoOptions videoOptions = nativeAdOptions.getVideoOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        boolean isEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.s;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.w = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            i = 3;
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement == 3) {
                    i2 = 2;
                    oyk.c.a(string, context, new vyk(this, context, string2, i2, videoOptions, mediationNativeAdConfiguration.getWatermark()));
                }
                i = 1;
            }
        } else {
            i = 0;
        }
        i2 = i;
        oyk.c.a(string, context, new vyk(this, context, string2, i2, videoOptions, mediationNativeAdConfiguration.getWatermark()));
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.t;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.t.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.s.onFailure(VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        VungleMediationAdapter.getAdError(vungleError).toString();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.t;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.t;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        setHeadline(this.u.getAdTitle());
        setBody(this.u.getAdBodyText());
        setCallToAction(this.u.getAdCallToActionText());
        Double adStarRating = this.u.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.u.getAdSponsoredText());
        setHasVideoContent(this.u.hasVideoContent());
        setMediaView(this.v);
        this.v.setNativeVideoListener(new cqa(this));
        String appIcon = this.u.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith("file://")) {
            Uri parse = Uri.parse(appIcon);
            wyk wykVar = new wyk();
            wykVar.a = parse;
            setIcon(wykVar);
        }
        setMediaContentAspectRatio(this.u.getMediaAspectRatio());
        if (VungleMediationAdapter.runtimeGmaSdkListensToAdapterReportedImpressions()) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
        this.t = (MediationNativeAdCallback) this.s.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        super.trackViews(view, map, map2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (this.u == null) {
                return;
            }
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (childAt instanceof FrameLayout) {
                ArrayList arrayList = new ArrayList();
                KeyEvent.Callback callback = null;
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add((View) entry.getValue());
                    if (((String) entry.getKey()).equals("3003")) {
                        callback = (View) entry.getValue();
                    } else if (((String) entry.getKey()).equals("3010")) {
                        arrayList.add(this.v);
                    }
                }
                this.u.registerViewForInteraction((FrameLayout) childAt, this.v, callback instanceof ImageView ? (ImageView) callback : null, arrayList);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        super.untrackView(view);
        NativeAd nativeAd = this.u;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
    }
}
