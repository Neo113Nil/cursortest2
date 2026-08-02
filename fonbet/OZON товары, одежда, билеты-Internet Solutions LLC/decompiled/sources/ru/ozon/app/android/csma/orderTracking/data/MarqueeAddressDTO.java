package ru.ozon.app.android.csma.orderTracking.data;

import G.g;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/MarqueeAddressDTO;", "", "deliveryVariantNameText", "", "streetText", "houseText", "textColor", "animationParams", "Lru/ozon/app/android/csma/orderTracking/data/AnimationParamsDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/csma/orderTracking/data/AnimationParamsDTO;)V", "getDeliveryVariantNameText", "()Ljava/lang/String;", "getStreetText", "getHouseText", "getTextColor", "getAnimationParams", "()Lru/ozon/app/android/csma/orderTracking/data/AnimationParamsDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MarqueeAddressDTO {
    private final AnimationParamsDTO animationParams;

    @NotNull
    private final String deliveryVariantNameText;
    private final String houseText;

    @NotNull
    private final String streetText;
    private final String textColor;

    public MarqueeAddressDTO(@NotNull String deliveryVariantNameText, @NotNull String streetText, String str, String str2, AnimationParamsDTO animationParamsDTO) {
        Intrinsics.checkNotNullParameter(deliveryVariantNameText, "deliveryVariantNameText");
        Intrinsics.checkNotNullParameter(streetText, "streetText");
        this.deliveryVariantNameText = deliveryVariantNameText;
        this.streetText = streetText;
        this.houseText = str;
        this.textColor = str2;
        this.animationParams = animationParamsDTO;
    }

    public static /* synthetic */ MarqueeAddressDTO copy$default(MarqueeAddressDTO marqueeAddressDTO, String str, String str2, String str3, String str4, AnimationParamsDTO animationParamsDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marqueeAddressDTO.deliveryVariantNameText;
        }
        if ((i11 & 2) != 0) {
            str2 = marqueeAddressDTO.streetText;
        }
        if ((i11 & 4) != 0) {
            str3 = marqueeAddressDTO.houseText;
        }
        if ((i11 & 8) != 0) {
            str4 = marqueeAddressDTO.textColor;
        }
        if ((i11 & 16) != 0) {
            animationParamsDTO = marqueeAddressDTO.animationParams;
        }
        AnimationParamsDTO animationParamsDTO2 = animationParamsDTO;
        String str5 = str3;
        return marqueeAddressDTO.copy(str, str2, str5, str4, animationParamsDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeliveryVariantNameText() {
        return this.deliveryVariantNameText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStreetText() {
        return this.streetText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHouseText() {
        return this.houseText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component5, reason: from getter */
    public final AnimationParamsDTO getAnimationParams() {
        return this.animationParams;
    }

    @NotNull
    public final MarqueeAddressDTO copy(@NotNull String deliveryVariantNameText, @NotNull String streetText, String houseText, String textColor, AnimationParamsDTO animationParams) {
        Intrinsics.checkNotNullParameter(deliveryVariantNameText, "deliveryVariantNameText");
        Intrinsics.checkNotNullParameter(streetText, "streetText");
        return new MarqueeAddressDTO(deliveryVariantNameText, streetText, houseText, textColor, animationParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarqueeAddressDTO)) {
            return false;
        }
        MarqueeAddressDTO marqueeAddressDTO = (MarqueeAddressDTO) other;
        return Intrinsics.d(this.deliveryVariantNameText, marqueeAddressDTO.deliveryVariantNameText) && Intrinsics.d(this.streetText, marqueeAddressDTO.streetText) && Intrinsics.d(this.houseText, marqueeAddressDTO.houseText) && Intrinsics.d(this.textColor, marqueeAddressDTO.textColor) && Intrinsics.d(this.animationParams, marqueeAddressDTO.animationParams);
    }

    public final AnimationParamsDTO getAnimationParams() {
        return this.animationParams;
    }

    @NotNull
    public final String getDeliveryVariantNameText() {
        return this.deliveryVariantNameText;
    }

    public final String getHouseText() {
        return this.houseText;
    }

    @NotNull
    public final String getStreetText() {
        return this.streetText;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int a11 = g.a(this.deliveryVariantNameText.hashCode() * 31, 31, this.streetText);
        String str = this.houseText;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnimationParamsDTO animationParamsDTO = this.animationParams;
        return hashCode2 + (animationParamsDTO != null ? animationParamsDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.deliveryVariantNameText;
        String str2 = this.streetText;
        String str3 = this.houseText;
        String str4 = this.textColor;
        AnimationParamsDTO animationParamsDTO = this.animationParams;
        StringBuilder d11 = C3660k.d("MarqueeAddressDTO(deliveryVariantNameText=", str, ", streetText=", str2, ", houseText=");
        a.h(d11, str3, ", textColor=", str4, ", animationParams=");
        d11.append(animationParamsDTO);
        d11.append(")");
        return d11.toString();
    }
}
