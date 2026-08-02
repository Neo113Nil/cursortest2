package com.blaze.blazesdk.ads.banners;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsHandler;", "", "Landroid/content/Context;", "context", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData;", "adRequestData", "Lkotlin/Function2;", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerHandlerEventType;", "", "", "onAnalyticEvent", "Landroid/view/View;", "createAndLoadAdBannerView", "(Landroid/content/Context;Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsRequestData;Lkotlin/jvm/functions/Function2;)Landroid/view/View;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BlazeGAMBannerAdsHandler {
    @NotNull
    View createAndLoadAdBannerView(@NotNull Context context, @NotNull BlazeGAMBannerAdsRequestData adRequestData, @NotNull Function2<? super BlazeGAMBannerHandlerEventType, ? super String, Unit> onAnalyticEvent);
}
