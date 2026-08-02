package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: MarketMarketItemRatingDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketItemRatingDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketItemRatingDto> CREATOR = new a();

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final float rating;

    @pmi0("reviews_count")
    private final int reviewsCount;

    @pmi0("reviews_count_text")
    private final String reviewsCountText;

    /* compiled from: MarketMarketItemRatingDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketItemRatingDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemRatingDto createFromParcel(Parcel parcel) {
            return new MarketMarketItemRatingDto(parcel.readFloat(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemRatingDto[] newArray(int i) {
            return new MarketMarketItemRatingDto[i];
        }
    }

    public MarketMarketItemRatingDto(float f, int i, String str) {
        this.rating = f;
        this.reviewsCount = i;
        this.reviewsCountText = str;
    }

    public final float d() {
        return this.rating;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.reviewsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItemRatingDto)) {
            return false;
        }
        MarketMarketItemRatingDto marketMarketItemRatingDto = (MarketMarketItemRatingDto) obj;
        return Float.compare(this.rating, marketMarketItemRatingDto.rating) == 0 && this.reviewsCount == marketMarketItemRatingDto.reviewsCount && epx.f(this.reviewsCountText, marketMarketItemRatingDto.reviewsCountText);
    }

    public final String f() {
        return this.reviewsCountText;
    }

    public final int hashCode() {
        return this.reviewsCountText.hashCode() + shy.a(this.reviewsCount, Float.hashCode(this.rating) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketItemRatingDto(rating=");
        sb.append(this.rating);
        sb.append(", reviewsCount=");
        sb.append(this.reviewsCount);
        sb.append(", reviewsCountText=");
        return ho8.a(sb, this.reviewsCountText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.rating);
        parcel.writeInt(this.reviewsCount);
        parcel.writeString(this.reviewsCountText);
    }
}
