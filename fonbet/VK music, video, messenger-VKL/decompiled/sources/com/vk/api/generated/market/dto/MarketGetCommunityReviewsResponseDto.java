package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketGetCommunityReviewsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCommunityReviewsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCommunityReviewsResponseDto> CREATOR = new a();

    @pmi0("community_rating")
    private final MarketCommunityRatingDto communityRating;

    @pmi0("faq_link")
    private final String faqLink;

    @pmi0("friends")
    private final MarketCommunityReviewFriendsDto friends;

    @pmi0("last_id")
    private final int lastId;

    @pmi0("reviews")
    private final List<MarketCommunityReviewDto> reviews;

    /* compiled from: MarketGetCommunityReviewsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCommunityReviewsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityReviewsResponseDto createFromParcel(Parcel parcel) {
            MarketCommunityRatingDto marketCommunityRatingDto = (MarketCommunityRatingDto) parcel.readParcelable(MarketGetCommunityReviewsResponseDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketCommunityReviewDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetCommunityReviewsResponseDto(marketCommunityRatingDto, arrayList, parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : MarketCommunityReviewFriendsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityReviewsResponseDto[] newArray(int i) {
            return new MarketGetCommunityReviewsResponseDto[i];
        }
    }

    public MarketGetCommunityReviewsResponseDto(MarketCommunityRatingDto marketCommunityRatingDto, List<MarketCommunityReviewDto> list, int i, String str, MarketCommunityReviewFriendsDto marketCommunityReviewFriendsDto) {
        this.communityRating = marketCommunityRatingDto;
        this.reviews = list;
        this.lastId = i;
        this.faqLink = str;
        this.friends = marketCommunityReviewFriendsDto;
    }

    public final MarketCommunityRatingDto d() {
        return this.communityRating;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.faqLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCommunityReviewsResponseDto)) {
            return false;
        }
        MarketGetCommunityReviewsResponseDto marketGetCommunityReviewsResponseDto = (MarketGetCommunityReviewsResponseDto) obj;
        return epx.f(this.communityRating, marketGetCommunityReviewsResponseDto.communityRating) && epx.f(this.reviews, marketGetCommunityReviewsResponseDto.reviews) && this.lastId == marketGetCommunityReviewsResponseDto.lastId && epx.f(this.faqLink, marketGetCommunityReviewsResponseDto.faqLink) && epx.f(this.friends, marketGetCommunityReviewsResponseDto.friends);
    }

    public final MarketCommunityReviewFriendsDto f() {
        return this.friends;
    }

    public final int g() {
        return this.lastId;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.lastId, fw3.a(this.communityRating.hashCode() * 31, 31, this.reviews), 31), 31, this.faqLink);
        MarketCommunityReviewFriendsDto marketCommunityReviewFriendsDto = this.friends;
        return a2 + (marketCommunityReviewFriendsDto == null ? 0 : marketCommunityReviewFriendsDto.hashCode());
    }

    public final List<MarketCommunityReviewDto> i() {
        return this.reviews;
    }

    public final String toString() {
        return "MarketGetCommunityReviewsResponseDto(communityRating=" + this.communityRating + ", reviews=" + this.reviews + ", lastId=" + this.lastId + ", faqLink=" + this.faqLink + ", friends=" + this.friends + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.communityRating, i);
        Iterator a2 = ao.a(parcel, this.reviews);
        while (a2.hasNext()) {
            ((MarketCommunityReviewDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.lastId);
        parcel.writeString(this.faqLink);
        MarketCommunityReviewFriendsDto marketCommunityReviewFriendsDto = this.friends;
        if (marketCommunityReviewFriendsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCommunityReviewFriendsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketGetCommunityReviewsResponseDto(MarketCommunityRatingDto marketCommunityRatingDto, List list, int i, String str, MarketCommunityReviewFriendsDto marketCommunityReviewFriendsDto, int i2, zcl zclVar) {
        this(marketCommunityRatingDto, list, i, str, (i2 & 16) != 0 ? null : marketCommunityReviewFriendsDto);
    }
}
