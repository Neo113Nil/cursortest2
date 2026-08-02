package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class suc extends NativeAdMapper implements AdLoad.Listener {
    public final String q;
    public final String r;
    public final String s;
    public final MediationAdLoadCallback t;
    public NativeAd u;

    public suc(MediationAdLoadCallback mediationAdLoadCallback, String str, String str2, String str3) {
        this.q = str;
        this.r = str2;
        this.s = str3;
        this.t = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void destroy() {
        NativeAd nativeAd = this.u;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.u = null;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void handleClick(View view) {
        view.getClass();
        NativeAd nativeAd = this.u;
        if (nativeAd != null) {
            nativeAd.handleGeneralAdClick();
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.t.onFailure(new AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk"));
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadSuccess(MolocoAd molocoAd) {
        NativeAd.Assets assets;
        Drawable createFromPath;
        molocoAd.getClass();
        setOverrideClickHandling(true);
        NativeAd nativeAd = this.u;
        if (nativeAd != null && (assets = nativeAd.getAssets()) != null) {
            if (assets.getRating() != null) {
                setStarRating(Double.valueOf(r0.floatValue()));
            }
            String sponsorText = assets.getSponsorText();
            if (sponsorText != null) {
                setAdvertiser(sponsorText);
            }
            setStore("Google Play");
            String title = assets.getTitle();
            if (title != null) {
                setHeadline(title);
            }
            String description = assets.getDescription();
            if (description != null) {
                setBody(description);
            }
            String callToActionText = assets.getCallToActionText();
            if (callToActionText != null) {
                setCallToAction(callToActionText);
            }
            Uri iconUri = assets.getIconUri();
            if (iconUri != null && (createFromPath = Drawable.createFromPath(iconUri.toString())) != null) {
                setIcon(new puc(createFromPath));
            }
            View mediaView = assets.getMediaView();
            if (mediaView != null) {
                mediaView.setTag("native_ad_media_view");
                setMediaView(mediaView);
            }
        }
        Object onSuccess = this.t.onSuccess(this);
        onSuccess.getClass();
        MediationNativeAdCallback mediationNativeAdCallback = (MediationNativeAdCallback) onSuccess;
        NativeAd nativeAd2 = this.u;
        if (nativeAd2 == null) {
            return;
        }
        nativeAd2.setInteractionListener(new ruc(mediationNativeAdCallback));
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void recordImpression() {
        NativeAd nativeAd = this.u;
        if (nativeAd != null) {
            nativeAd.handleImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        view.getClass();
        map.getClass();
        map2.getClass();
        final int i = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: ouc
            public final /* synthetic */ suc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                suc sucVar = this.b;
                switch (i2) {
                    case 0:
                        NativeAd nativeAd = sucVar.u;
                        if (nativeAd != null) {
                            nativeAd.handleGeneralAdClick();
                            break;
                        }
                        break;
                    default:
                        NativeAd nativeAd2 = sucVar.u;
                        if (nativeAd2 != null) {
                            nativeAd2.handleGeneralAdClick();
                            break;
                        }
                        break;
                }
            }
        });
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            final int i2 = 1;
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: ouc
                public final /* synthetic */ suc b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i22 = i2;
                    suc sucVar = this.b;
                    switch (i22) {
                        case 0:
                            NativeAd nativeAd = sucVar.u;
                            if (nativeAd != null) {
                                nativeAd.handleGeneralAdClick();
                                break;
                            }
                            break;
                        default:
                            NativeAd nativeAd2 = sucVar.u;
                            if (nativeAd2 != null) {
                                nativeAd2.handleGeneralAdClick();
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }
}
