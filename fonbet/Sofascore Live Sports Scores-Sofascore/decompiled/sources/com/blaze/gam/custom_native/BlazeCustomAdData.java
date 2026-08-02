package com.blaze.gam.custom_native;

import androidx.annotation.Keep;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import defpackage.wx4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/blaze/gam/custom_native/BlazeCustomAdData;", "", "nativeAd", "Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;", "<init>", "(Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;)V", "getNativeAd", "()Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@wx4
/* loaded from: classes2.dex */
public final /* data */ class BlazeCustomAdData {

    @Nullable
    private final NativeCustomFormatAd nativeAd;

    public BlazeCustomAdData(@Nullable NativeCustomFormatAd nativeCustomFormatAd) {
        this.nativeAd = nativeCustomFormatAd;
    }

    public static /* synthetic */ BlazeCustomAdData copy$default(BlazeCustomAdData blazeCustomAdData, NativeCustomFormatAd nativeCustomFormatAd, int i, Object obj) {
        if ((i & 1) != 0) {
            nativeCustomFormatAd = blazeCustomAdData.nativeAd;
        }
        return blazeCustomAdData.copy(nativeCustomFormatAd);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final NativeCustomFormatAd getNativeAd() {
        return this.nativeAd;
    }

    @NotNull
    public final BlazeCustomAdData copy(@Nullable NativeCustomFormatAd nativeAd) {
        return new BlazeCustomAdData(nativeAd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BlazeCustomAdData) && Intrinsics.c(this.nativeAd, ((BlazeCustomAdData) other).nativeAd);
    }

    @Nullable
    public final NativeCustomFormatAd getNativeAd() {
        return this.nativeAd;
    }

    public int hashCode() {
        NativeCustomFormatAd nativeCustomFormatAd = this.nativeAd;
        if (nativeCustomFormatAd == null) {
            return 0;
        }
        return nativeCustomFormatAd.hashCode();
    }

    @NotNull
    public String toString() {
        return "BlazeCustomAdData(nativeAd=" + this.nativeAd + ')';
    }
}
