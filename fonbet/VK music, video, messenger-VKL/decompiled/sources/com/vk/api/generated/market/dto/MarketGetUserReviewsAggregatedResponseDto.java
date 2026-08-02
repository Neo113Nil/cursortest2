package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetUserReviewsAggregatedResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetUserReviewsAggregatedResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetUserReviewsAggregatedResponseDto> CREATOR = new a();

    @pmi0("communities_reviews")
    private final MarketUserReviewsCommunitiesResponseObjectDto communitiesReviews;

    @pmi0("items_for_review")
    private final MarketUserReviewsItemsForReviewObjectDto itemsForReview;

    @pmi0("items_reviews")
    private final MarketUserReviewsItemsResponseObjectDto itemsReviews;

    /* compiled from: MarketGetUserReviewsAggregatedResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetUserReviewsAggregatedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetUserReviewsAggregatedResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetUserReviewsAggregatedResponseDto(parcel.readInt() == 0 ? null : MarketUserReviewsItemsForReviewObjectDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketUserReviewsItemsResponseObjectDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarketUserReviewsCommunitiesResponseObjectDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetUserReviewsAggregatedResponseDto[] newArray(int i) {
            return new MarketGetUserReviewsAggregatedResponseDto[i];
        }
    }

    public MarketGetUserReviewsAggregatedResponseDto() {
        this(null, null, null, 7, null);
    }

    public final MarketUserReviewsCommunitiesResponseObjectDto d() {
        return this.communitiesReviews;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketUserReviewsItemsForReviewObjectDto e() {
        return this.itemsForReview;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetUserReviewsAggregatedResponseDto)) {
            return false;
        }
        MarketGetUserReviewsAggregatedResponseDto marketGetUserReviewsAggregatedResponseDto = (MarketGetUserReviewsAggregatedResponseDto) obj;
        return epx.f(this.itemsForReview, marketGetUserReviewsAggregatedResponseDto.itemsForReview) && epx.f(this.itemsReviews, marketGetUserReviewsAggregatedResponseDto.itemsReviews) && epx.f(this.communitiesReviews, marketGetUserReviewsAggregatedResponseDto.communitiesReviews);
    }

    public final MarketUserReviewsItemsResponseObjectDto f() {
        return this.itemsReviews;
    }

    public final int hashCode() {
        MarketUserReviewsItemsForReviewObjectDto marketUserReviewsItemsForReviewObjectDto = this.itemsForReview;
        int hashCode = (marketUserReviewsItemsForReviewObjectDto == null ? 0 : marketUserReviewsItemsForReviewObjectDto.hashCode()) * 31;
        MarketUserReviewsItemsResponseObjectDto marketUserReviewsItemsResponseObjectDto = this.itemsReviews;
        int hashCode2 = (hashCode + (marketUserReviewsItemsResponseObjectDto == null ? 0 : marketUserReviewsItemsResponseObjectDto.hashCode())) * 31;
        MarketUserReviewsCommunitiesResponseObjectDto marketUserReviewsCommunitiesResponseObjectDto = this.communitiesReviews;
        return hashCode2 + (marketUserReviewsCommunitiesResponseObjectDto != null ? marketUserReviewsCommunitiesResponseObjectDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketGetUserReviewsAggregatedResponseDto(itemsForReview=" + this.itemsForReview + ", itemsReviews=" + this.itemsReviews + ", communitiesReviews=" + this.communitiesReviews + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketUserReviewsItemsForReviewObjectDto marketUserReviewsItemsForReviewObjectDto = this.itemsForReview;
        if (marketUserReviewsItemsForReviewObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketUserReviewsItemsForReviewObjectDto.writeToParcel(parcel, i);
        }
        MarketUserReviewsItemsResponseObjectDto marketUserReviewsItemsResponseObjectDto = this.itemsReviews;
        if (marketUserReviewsItemsResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketUserReviewsItemsResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketUserReviewsCommunitiesResponseObjectDto marketUserReviewsCommunitiesResponseObjectDto = this.communitiesReviews;
        if (marketUserReviewsCommunitiesResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketUserReviewsCommunitiesResponseObjectDto.writeToParcel(parcel, i);
        }
    }

    public MarketGetUserReviewsAggregatedResponseDto(MarketUserReviewsItemsForReviewObjectDto marketUserReviewsItemsForReviewObjectDto, MarketUserReviewsItemsResponseObjectDto marketUserReviewsItemsResponseObjectDto, MarketUserReviewsCommunitiesResponseObjectDto marketUserReviewsCommunitiesResponseObjectDto) {
        this.itemsForReview = marketUserReviewsItemsForReviewObjectDto;
        this.itemsReviews = marketUserReviewsItemsResponseObjectDto;
        this.communitiesReviews = marketUserReviewsCommunitiesResponseObjectDto;
    }

    public /* synthetic */ MarketGetUserReviewsAggregatedResponseDto(MarketUserReviewsItemsForReviewObjectDto marketUserReviewsItemsForReviewObjectDto, MarketUserReviewsItemsResponseObjectDto marketUserReviewsItemsResponseObjectDto, MarketUserReviewsCommunitiesResponseObjectDto marketUserReviewsCommunitiesResponseObjectDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketUserReviewsItemsForReviewObjectDto, (i & 2) != 0 ? null : marketUserReviewsItemsResponseObjectDto, (i & 4) != 0 ? null : marketUserReviewsCommunitiesResponseObjectDto);
    }
}
