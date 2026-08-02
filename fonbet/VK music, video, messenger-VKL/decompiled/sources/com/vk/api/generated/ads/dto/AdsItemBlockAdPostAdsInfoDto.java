package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: AdsItemBlockAdPostAdsInfoDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockAdPostAdsInfoDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockAdPostAdsInfoDto> CREATOR = new a();

    @pmi0("has_cta_button")
    private final boolean hasCtaButton;

    /* compiled from: AdsItemBlockAdPostAdsInfoDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockAdPostAdsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdPostAdsInfoDto createFromParcel(Parcel parcel) {
            return new AdsItemBlockAdPostAdsInfoDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdPostAdsInfoDto[] newArray(int i) {
            return new AdsItemBlockAdPostAdsInfoDto[i];
        }
    }

    public AdsItemBlockAdPostAdsInfoDto(boolean z) {
        this.hasCtaButton = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsItemBlockAdPostAdsInfoDto) && this.hasCtaButton == ((AdsItemBlockAdPostAdsInfoDto) obj).hasCtaButton;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasCtaButton);
    }

    public final String toString() {
        return q0.a(new StringBuilder("AdsItemBlockAdPostAdsInfoDto(hasCtaButton="), this.hasCtaButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasCtaButton ? 1 : 0);
    }
}
