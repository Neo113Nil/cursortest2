package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MarketGetCommunityReviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCommunityReviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCommunityReviewResponseDto> CREATOR = new a();

    @pmi0("review")
    private final MarketCommunityReviewDto review;

    /* compiled from: MarketGetCommunityReviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCommunityReviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityReviewResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetCommunityReviewResponseDto(MarketCommunityReviewDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityReviewResponseDto[] newArray(int i) {
            return new MarketGetCommunityReviewResponseDto[i];
        }
    }

    public MarketGetCommunityReviewResponseDto(MarketCommunityReviewDto marketCommunityReviewDto) {
        this.review = marketCommunityReviewDto;
    }

    public final MarketCommunityReviewDto d() {
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
        return (obj instanceof MarketGetCommunityReviewResponseDto) && epx.f(this.review, ((MarketGetCommunityReviewResponseDto) obj).review);
    }

    public final int hashCode() {
        return this.review.hashCode();
    }

    public final String toString() {
        return "MarketGetCommunityReviewResponseDto(review=" + this.review + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.review.writeToParcel(parcel, i);
    }
}
