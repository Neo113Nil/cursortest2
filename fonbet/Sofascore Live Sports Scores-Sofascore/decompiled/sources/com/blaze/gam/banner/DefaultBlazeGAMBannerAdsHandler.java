package com.blaze.gam.banner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsHandler;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsRequestData;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerHandlerEventType;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import defpackage.fmm;
import defpackage.wzb;
import defpackage.zzl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0015\u001a\u00020\u0014*\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/blaze/gam/banner/DefaultBlazeGAMBannerAdsHandler;", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsHandler;", "Lcom/blaze/gam/banner/BlazeGAMBannerAdsDelegate;", "delegate", "<init>", "(Lcom/blaze/gam/banner/BlazeGAMBannerAdsDelegate;)V", "Landroid/content/Context;", "context", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData;", "adRequestData", "Lkotlin/Function2;", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerHandlerEventType;", "", "", "onAnalyticEvent", "Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "createAdManagerAdView", "(Landroid/content/Context;Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData;Lkotlin/jvm/functions/Function2;)Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "extraInfo", "fmm", "createAdListener", "(Lcom/google/android/gms/ads/admanager/AdManagerAdView;Lkotlin/jvm/functions/Function2;Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)Lfmm;", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize;", "Lcom/google/android/gms/ads/AdSize;", "asGoogleAdSize", "(Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData$AdSize;)Lcom/google/android/gms/ads/AdSize;", "Landroid/view/View;", "createAndLoadAdBannerView", "(Landroid/content/Context;Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData;Lkotlin/jvm/functions/Function2;)Landroid/view/View;", "Lcom/blaze/gam/banner/BlazeGAMBannerAdsDelegate;", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultBlazeGAMBannerAdsHandler implements BlazeGAMBannerAdsHandler {

    @Nullable
    private final BlazeGAMBannerAdsDelegate delegate;

    public DefaultBlazeGAMBannerAdsHandler(@Nullable BlazeGAMBannerAdsDelegate blazeGAMBannerAdsDelegate) {
        this.delegate = blazeGAMBannerAdsDelegate;
    }

    private final AdSize asGoogleAdSize(BlazeGAMBannerAdsRequestData.AdSize adSize) {
        if (adSize instanceof BlazeGAMBannerAdsRequestData.AdSize.Banner) {
            AdSize adSize2 = AdSize.BANNER;
            adSize2.getClass();
            return adSize2;
        }
        if (adSize instanceof BlazeGAMBannerAdsRequestData.AdSize.LargeBanner) {
            AdSize adSize3 = AdSize.LARGE_BANNER;
            adSize3.getClass();
            return adSize3;
        }
        if (adSize instanceof BlazeGAMBannerAdsRequestData.AdSize.Custom) {
            BlazeGAMBannerAdsRequestData.AdSize.Custom custom = (BlazeGAMBannerAdsRequestData.AdSize.Custom) adSize;
            return new AdSize(custom.getWidth(), custom.getHeight());
        }
        zzl.b();
        return null;
    }

    private final fmm createAdListener(AdManagerAdView adManagerAdView, Function2<? super BlazeGAMBannerHandlerEventType, ? super String, Unit> function2, BlazeContentExtraInfo blazeContentExtraInfo) {
        return new fmm(this, adManagerAdView, blazeContentExtraInfo, function2);
    }

    private final AdManagerAdView createAdManagerAdView(Context context, BlazeGAMBannerAdsRequestData adRequestData, Function2<? super BlazeGAMBannerHandlerEventType, ? super String, Unit> onAnalyticEvent) {
        AdSize asGoogleAdSize = asGoogleAdSize(adRequestData.getAdSize());
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        adManagerAdView.setAdUnitId(adRequestData.getAdUnitId());
        adManagerAdView.setAdSize(asGoogleAdSize);
        adManagerAdView.setAdListener(createAdListener(adManagerAdView, onAnalyticEvent, adRequestData.getExtraInfo()));
        int width = asGoogleAdSize.getWidth();
        context.getClass();
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(wzb.b(width * context.getResources().getDisplayMetrics().density), wzb.b(asGoogleAdSize.getHeight() * context.getResources().getDisplayMetrics().density)));
        return adManagerAdView;
    }

    @Override // com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsHandler
    @NotNull
    public View createAndLoadAdBannerView(@NotNull Context context, @NotNull BlazeGAMBannerAdsRequestData adRequestData, @NotNull Function2<? super BlazeGAMBannerHandlerEventType, ? super String, Unit> onAnalyticEvent) {
        context.getClass();
        adRequestData.getClass();
        onAnalyticEvent.getClass();
        AdManagerAdView createAdManagerAdView = createAdManagerAdView(context, adRequestData, onAnalyticEvent);
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, String> entry : adRequestData.getContext().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest build = builder.build();
        build.getClass();
        BlazeGAMBannerHandlerEventType blazeGAMBannerHandlerEventType = BlazeGAMBannerHandlerEventType.AD_REQUESTED;
        onAnalyticEvent.invoke(blazeGAMBannerHandlerEventType, adRequestData.getAdUnitId());
        BlazeGAMBannerAdsDelegate blazeGAMBannerAdsDelegate = this.delegate;
        if (blazeGAMBannerAdsDelegate != null) {
            blazeGAMBannerAdsDelegate.onGAMBannerAdsAdEvent(blazeGAMBannerHandlerEventType, new BlazeGAMBannerAdsAdData(createAdManagerAdView, adRequestData.getExtraInfo()));
        }
        createAdManagerAdView.loadAd(build);
        return createAdManagerAdView;
    }
}
