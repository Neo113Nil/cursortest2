package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MarketGetItemReviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemReviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetItemReviewResponseDto> CREATOR = new a();

    @pmi0("review")
    private final MarketItemSkuReviewDto review;

    /* compiled from: MarketGetItemReviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemReviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemReviewResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetItemReviewResponseDto(MarketItemSkuReviewDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemReviewResponseDto[] newArray(int i) {
            return new MarketGetItemReviewResponseDto[i];
        }
    }

    public MarketGetItemReviewResponseDto(MarketItemSkuReviewDto marketItemSkuReviewDto) {
        this.review = marketItemSkuReviewDto;
    }

    public final MarketItemSkuReviewDto d() {
        return this.review;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetItemReviewResponseDto) && epx.f(this.review, ((MarketGetItemReviewResponseDto) obj).review);
    }

    public final int hashCode() {
        return this.review.hashCode();
    }

    public final String toString() {
        return "MarketGetItemReviewResponseDto(review=" + this.review + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.review.writeToParcel(parcel, i);
    }
}
