package com.blaze.gam.custom_native;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import defpackage.lm5;
import defpackage.rq3;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDelegate;", "", "", "errMsg", "", "onGAMCustomNativeAdError", "(Ljava/lang/String;)V", "Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler$EventType;", "eventType", "Lcom/blaze/gam/custom_native/BlazeCustomNativeAdData;", "adData", "onGAMCustomNativeAdEvent", "(Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler$EventType;Lcom/blaze/gam/custom_native/BlazeCustomNativeAdData;)V", "Lcom/blaze/gam/custom_native/BlazeGamCustomNativeAdRequestInformation;", "requestData", "", "customGAMTargetingProperties", "(Lcom/blaze/gam/custom_native/BlazeGamCustomNativeAdRequestInformation;Lrq3;)Ljava/lang/Object;", "publisherProvidedId", "Landroid/os/Bundle;", "networkExtras", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BlazeGAMCustomNativeAdsDelegate {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @Nullable
        public static Object customGAMTargetingProperties(@NotNull BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate, @NotNull BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, @NotNull rq3<? super Map<String, String>> rq3Var) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }

        @Nullable
        public static Object networkExtras(@NotNull BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate, @NotNull BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, @NotNull rq3<? super Bundle> rq3Var) {
            return null;
        }

        public static void onGAMCustomNativeAdError(@NotNull BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate, @NotNull String str) {
            str.getClass();
        }

        public static void onGAMCustomNativeAdEvent(@NotNull BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate, @NotNull BlazeGoogleCustomNativeAdsHandler.EventType eventType, @NotNull BlazeCustomNativeAdData blazeCustomNativeAdData) {
            eventType.getClass();
            blazeCustomNativeAdData.getClass();
        }

        @Nullable
        public static Object publisherProvidedId(@NotNull BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate, @NotNull BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, @NotNull rq3<? super String> rq3Var) {
            return null;
        }
    }

    @Nullable
    Object customGAMTargetingProperties(@NotNull BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, @NotNull rq3<? super Map<String, String>> rq3Var);

    @Nullable
    Object networkExtras(@NotNull BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, @NotNull rq3<? super Bundle> rq3Var);

    void onGAMCustomNativeAdError(@NotNull String errMsg);

    void onGAMCustomNativeAdEvent(@NotNull BlazeGoogleCustomNativeAdsHandler.EventType eventType, @NotNull BlazeCustomNativeAdData adData);

    @Nullable
    Object publisherProvidedId(@NotNull BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, @NotNull rq3<? super String> rq3Var);
}
