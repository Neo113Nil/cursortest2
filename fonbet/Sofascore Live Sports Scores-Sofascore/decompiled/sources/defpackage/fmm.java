package defpackage;

import com.blaze.blazesdk.ads.banners.BlazeGAMBannerHandlerEventType;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.gam.banner.BlazeGAMBannerAdsAdData;
import com.blaze.gam.banner.BlazeGAMBannerAdsDelegate;
import com.blaze.gam.banner.DefaultBlazeGAMBannerAdsHandler;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fmm extends AdListener {
    public final /* synthetic */ DefaultBlazeGAMBannerAdsHandler a;
    public final /* synthetic */ AdManagerAdView b;
    public final /* synthetic */ BlazeContentExtraInfo c;
    public final /* synthetic */ Function2 d;

    public fmm(DefaultBlazeGAMBannerAdsHandler defaultBlazeGAMBannerAdsHandler, AdManagerAdView adManagerAdView, BlazeContentExtraInfo blazeContentExtraInfo, Function2 function2) {
        this.a = defaultBlazeGAMBannerAdsHandler;
        this.b = adManagerAdView;
        this.c = blazeContentExtraInfo;
        this.d = function2;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        BlazeGAMBannerAdsDelegate blazeGAMBannerAdsDelegate;
        BlazeGAMBannerHandlerEventType blazeGAMBannerHandlerEventType = BlazeGAMBannerHandlerEventType.AD_CLICKED;
        blazeGAMBannerAdsDelegate = this.a.delegate;
        AdManagerAdView adManagerAdView = this.b;
        if (blazeGAMBannerAdsDelegate != null) {
            blazeGAMBannerAdsDelegate.onGAMBannerAdsAdEvent(blazeGAMBannerHandlerEventType, new BlazeGAMBannerAdsAdData(adManagerAdView, this.c));
        }
        String adUnitId = adManagerAdView.getAdUnitId();
        adUnitId.getClass();
        this.d.invoke(blazeGAMBannerHandlerEventType, adUnitId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        BlazeGAMBannerAdsDelegate blazeGAMBannerAdsDelegate;
        loadAdError.getClass();
        blazeGAMBannerAdsDelegate = this.a.delegate;
        if (blazeGAMBannerAdsDelegate != null) {
            String message = loadAdError.getMessage();
            message.getClass();
            blazeGAMBannerAdsDelegate.onGAMBannerAdsAdError(message, new BlazeGAMBannerAdsAdData(this.b, new BlazeContentExtraInfo(null, null, null, null, null, 31, null)));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        BlazeGAMBannerAdsDelegate blazeGAMBannerAdsDelegate;
        BlazeGAMBannerHandlerEventType blazeGAMBannerHandlerEventType = BlazeGAMBannerHandlerEventType.AD_IMPRESSION;
        blazeGAMBannerAdsDelegate = this.a.delegate;
        AdManagerAdView adManagerAdView = this.b;
        if (blazeGAMBannerAdsDelegate != null) {
            blazeGAMBannerAdsDelegate.onGAMBannerAdsAdEvent(blazeGAMBannerHandlerEventType, new BlazeGAMBannerAdsAdData(adManagerAdView, this.c));
        }
        String adUnitId = adManagerAdView.getAdUnitId();
        adUnitId.getClass();
        this.d.invoke(blazeGAMBannerHandlerEventType, adUnitId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        BlazeGAMBannerAdsDelegate blazeGAMBannerAdsDelegate;
        BlazeGAMBannerHandlerEventType blazeGAMBannerHandlerEventType = BlazeGAMBannerHandlerEventType.AD_LOADED;
        blazeGAMBannerAdsDelegate = this.a.delegate;
        AdManagerAdView adManagerAdView = this.b;
        if (blazeGAMBannerAdsDelegate != null) {
            blazeGAMBannerAdsDelegate.onGAMBannerAdsAdEvent(blazeGAMBannerHandlerEventType, new BlazeGAMBannerAdsAdData(adManagerAdView, this.c));
        }
        String adUnitId = adManagerAdView.getAdUnitId();
        adUnitId.getClass();
        this.d.invoke(blazeGAMBannerHandlerEventType, adUnitId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
    }
}
