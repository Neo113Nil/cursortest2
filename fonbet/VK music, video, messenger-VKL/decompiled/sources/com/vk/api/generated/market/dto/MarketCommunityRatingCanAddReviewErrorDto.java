package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketCommunityRatingCanAddReviewErrorDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityRatingCanAddReviewErrorDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityRatingCanAddReviewErrorDto> CREATOR = new a();

    @pmi0("code")
    private final int code;

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCommunityRatingCanAddReviewErrorDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityRatingCanAddReviewErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityRatingCanAddReviewErrorDto createFromParcel(Parcel parcel) {
            return new MarketCommunityRatingCanAddReviewErrorDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityRatingCanAddReviewErrorDto[] newArray(int i) {
            return new MarketCommunityRatingCanAddReviewErrorDto[i];
        }
    }

    public MarketCommunityRatingCanAddReviewErrorDto(int i, String str, String str2) {
        this.code = i;
        this.title = str;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCommunityRatingCanAddReviewErrorDto)) {
            return false;
        }
        MarketCommunityRatingCanAddReviewErrorDto marketCommunityRatingCanAddReviewErrorDto = (MarketCommunityRatingCanAddReviewErrorDto) obj;
        return this.code == marketCommunityRatingCanAddReviewErrorDto.code && epx.f(this.title, marketCommunityRatingCanAddReviewErrorDto.title) && epx.f(this.description, marketCommunityRatingCanAddReviewErrorDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.description.hashCode() + urd0.a(Integer.hashCode(this.code) * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCommunityRatingCanAddReviewErrorDto(code=");
        sb.append(this.code);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
