package com.blaze.gam.custom_native;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import defpackage.lm5;
import defpackage.wx4;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/blaze/gam/custom_native/BlazeGAMDelegate;", "", "onGAMAdError", "", "errMsg", "", "onGAMAdEvent", "eventType", "Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler$EventType;", "adData", "Lcom/blaze/gam/custom_native/BlazeCustomNativeAdData;", "customGAMTargetingProperties", "", "getCustomGAMTargetingProperties", "()Ljava/util/Map;", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@wx4
/* loaded from: classes2.dex */
public interface BlazeGAMDelegate {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Map<String, String> getCustomGAMTargetingProperties(@NotNull BlazeGAMDelegate blazeGAMDelegate) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }

        public static void onGAMAdError(@NotNull BlazeGAMDelegate blazeGAMDelegate, @NotNull String str) {
            str.getClass();
        }

        public static void onGAMAdEvent(@NotNull BlazeGAMDelegate blazeGAMDelegate, @NotNull BlazeGoogleCustomNativeAdsHandler.EventType eventType, @NotNull BlazeCustomNativeAdData blazeCustomNativeAdData) {
            eventType.getClass();
            blazeCustomNativeAdData.getClass();
        }
    }

    @NotNull
    Map<String, String> getCustomGAMTargetingProperties();

    void onGAMAdError(@NotNull String errMsg);

    void onGAMAdEvent(@NotNull BlazeGoogleCustomNativeAdsHandler.EventType eventType, @NotNull BlazeCustomNativeAdData adData);
}
