package com.blaze.gam.custom_native;

import android.content.Context;
import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import defpackage.rq3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/blaze/gam/custom_native/DefaultBlazeGoogleCustomNativeAdsHandler;", "Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler;", "Landroid/content/Context;", "appContext", "Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDefaultConfig;", "defaultAdConfig", "Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDelegate;", "delegate", "<init>", "(Landroid/content/Context;Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDefaultConfig;Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDelegate;)V", "Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler$EventType;", "eventType", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel;", "adModel", "", "onAdEvent", "(Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler$EventType;Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel;)V", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeAdRequestData;", "adRequestData", "provideAd", "(Lcom/blaze/blazesdk/ads/custom_native/models/BlazeAdRequestData;Lrq3;)Ljava/lang/Object;", "Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDelegate;", "Lcom/blaze/gam/custom_native/BlazeCustomNativeAdsProvider;", "adsProvider", "Lcom/blaze/gam/custom_native/BlazeCustomNativeAdsProvider;", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultBlazeGoogleCustomNativeAdsHandler implements BlazeGoogleCustomNativeAdsHandler {

    @NotNull
    private final BlazeCustomNativeAdsProvider adsProvider;

    @Nullable
    private final BlazeGAMCustomNativeAdsDelegate delegate;

    public DefaultBlazeGoogleCustomNativeAdsHandler(@NotNull Context context, @Nullable BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig, @Nullable BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate) {
        context.getClass();
        this.delegate = blazeGAMCustomNativeAdsDelegate;
        this.adsProvider = new BlazeCustomNativeAdsProvider(context, blazeGAMCustomNativeAdsDefaultConfig, blazeGAMCustomNativeAdsDelegate);
    }

    @Override // com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler
    public void onAdEvent(@NotNull BlazeGoogleCustomNativeAdsHandler.EventType eventType, @NotNull BlazeGoogleCustomNativeAdModel adModel) {
        BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate;
        eventType.getClass();
        adModel.getClass();
        BlazeCustomNativeAdsReportingKt.reportAdEvent(eventType, adModel);
        BlazeCustomNativeAdData adData = BlazeCustomNativeAdsReportingKt.toAdData(adModel);
        if (adData == null || (blazeGAMCustomNativeAdsDelegate = this.delegate) == null) {
            return;
        }
        blazeGAMCustomNativeAdsDelegate.onGAMCustomNativeAdEvent(eventType, adData);
    }

    @Override // com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler
    @Nullable
    public Object provideAd(@NotNull BlazeAdRequestData blazeAdRequestData, @NotNull rq3<? super BlazeGoogleCustomNativeAdModel> rq3Var) {
        return this.adsProvider.generateAd(blazeAdRequestData, rq3Var);
    }

    public /* synthetic */ DefaultBlazeGoogleCustomNativeAdsHandler(Context context, BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig, BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : blazeGAMCustomNativeAdsDefaultConfig, (i & 4) != 0 ? null : blazeGAMCustomNativeAdsDelegate);
    }
}
