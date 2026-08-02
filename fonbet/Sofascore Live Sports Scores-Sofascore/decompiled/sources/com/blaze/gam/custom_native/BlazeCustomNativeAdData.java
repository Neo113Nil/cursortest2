package com.blaze.gam.custom_native;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/blaze/gam/custom_native/BlazeCustomNativeAdData;", "", "nativeAd", "Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "<init>", "(Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)V", "getNativeAd", "()Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;", "getExtraInfo", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeCustomNativeAdData {

    @NotNull
    private final BlazeContentExtraInfo extraInfo;

    @Nullable
    private final NativeCustomFormatAd nativeAd;

    public BlazeCustomNativeAdData(@Nullable NativeCustomFormatAd nativeCustomFormatAd, @NotNull BlazeContentExtraInfo blazeContentExtraInfo) {
        blazeContentExtraInfo.getClass();
        this.nativeAd = nativeCustomFormatAd;
        this.extraInfo = blazeContentExtraInfo;
    }

    public static /* synthetic */ BlazeCustomNativeAdData copy$default(BlazeCustomNativeAdData blazeCustomNativeAdData, NativeCustomFormatAd nativeCustomFormatAd, BlazeContentExtraInfo blazeContentExtraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            nativeCustomFormatAd = blazeCustomNativeAdData.nativeAd;
        }
        if ((i & 2) != 0) {
            blazeContentExtraInfo = blazeCustomNativeAdData.extraInfo;
        }
        return blazeCustomNativeAdData.copy(nativeCustomFormatAd, blazeContentExtraInfo);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final NativeCustomFormatAd getNativeAd() {
        return this.nativeAd;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @NotNull
    public final BlazeCustomNativeAdData copy(@Nullable NativeCustomFormatAd nativeAd, @NotNull BlazeContentExtraInfo extraInfo) {
        extraInfo.getClass();
        return new BlazeCustomNativeAdData(nativeAd, extraInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeCustomNativeAdData)) {
            return false;
        }
        BlazeCustomNativeAdData blazeCustomNativeAdData = (BlazeCustomNativeAdData) other;
        return Intrinsics.c(this.nativeAd, blazeCustomNativeAdData.nativeAd) && Intrinsics.c(this.extraInfo, blazeCustomNativeAdData.extraInfo);
    }

    @NotNull
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @Nullable
    public final NativeCustomFormatAd getNativeAd() {
        return this.nativeAd;
    }

    public int hashCode() {
        NativeCustomFormatAd nativeCustomFormatAd = this.nativeAd;
        return this.extraInfo.hashCode() + ((nativeCustomFormatAd == null ? 0 : nativeCustomFormatAd.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "BlazeCustomNativeAdData(nativeAd=" + this.nativeAd + ", extraInfo=" + this.extraInfo + ')';
    }
}
