package com.blaze.gam.custom_native;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import defpackage.uim;
import defpackage.zzl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"toNativeAd", "Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel;", "toAdData", "Lcom/blaze/gam/custom_native/BlazeCustomNativeAdData;", "reportAdImpression", "", "reportCTAClicked", "reportAdEvent", "Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler$EventType;", "adModel", "blaze_gam_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeCustomNativeAdsReportingKt {
    @Keep
    public static final void reportAdEvent(@NotNull BlazeGoogleCustomNativeAdsHandler.EventType eventType, @NotNull BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel) {
        eventType.getClass();
        blazeGoogleCustomNativeAdModel.getClass();
        int i = uim.a[eventType.ordinal()];
        if (i == 1) {
            reportAdImpression(blazeGoogleCustomNativeAdModel);
        } else {
            if (i != 2) {
                return;
            }
            reportCTAClicked(blazeGoogleCustomNativeAdModel);
        }
    }

    @Keep
    public static final void reportAdImpression(@NotNull BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel) {
        blazeGoogleCustomNativeAdModel.getClass();
        NativeCustomFormatAd nativeAd = toNativeAd(blazeGoogleCustomNativeAdModel);
        if (nativeAd != null) {
            nativeAd.recordImpression();
        }
        blazeGoogleCustomNativeAdModel.getTitle();
    }

    @Keep
    public static final void reportCTAClicked(@NotNull BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel) {
        String str;
        blazeGoogleCustomNativeAdModel.getClass();
        BlazeGoogleCustomNativeAdModel.Content content = blazeGoogleCustomNativeAdModel.getContent();
        if (content instanceof BlazeGoogleCustomNativeAdModel.Content.Image) {
            str = "image";
        } else {
            if (!(content instanceof BlazeGoogleCustomNativeAdModel.Content.Video)) {
                zzl.b();
                return;
            }
            str = "video";
        }
        NativeCustomFormatAd nativeAd = toNativeAd(blazeGoogleCustomNativeAdModel);
        if (nativeAd != null) {
            nativeAd.performClick(str);
        }
        blazeGoogleCustomNativeAdModel.getTitle();
    }

    @Keep
    @Nullable
    public static final BlazeCustomNativeAdData toAdData(@NotNull BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel) {
        blazeGoogleCustomNativeAdModel.getClass();
        Object customAdditionalData = blazeGoogleCustomNativeAdModel.getCustomAdditionalData();
        if (customAdditionalData instanceof BlazeCustomNativeAdData) {
            return (BlazeCustomNativeAdData) customAdditionalData;
        }
        return null;
    }

    @Keep
    @Nullable
    public static final NativeCustomFormatAd toNativeAd(@NotNull BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel) {
        blazeGoogleCustomNativeAdModel.getClass();
        BlazeCustomNativeAdData adData = toAdData(blazeGoogleCustomNativeAdModel);
        if (adData != null) {
            return adData.getNativeAd();
        }
        return null;
    }
}
