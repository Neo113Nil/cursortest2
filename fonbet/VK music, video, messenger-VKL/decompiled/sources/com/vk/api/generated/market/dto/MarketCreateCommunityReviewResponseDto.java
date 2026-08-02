package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketCreateCommunityReviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketCreateCommunityReviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketCreateCommunityReviewResponseDto> CREATOR = new a();

    @pmi0("result_description")
    private final String resultDescription;

    @pmi0("result_title")
    private final String resultTitle;

    /* compiled from: MarketCreateCommunityReviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketCreateCommunityReviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCreateCommunityReviewResponseDto createFromParcel(Parcel parcel) {
            return new MarketCreateCommunityReviewResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCreateCommunityReviewResponseDto[] newArray(int i) {
            return new MarketCreateCommunityReviewResponseDto[i];
        }
    }

    public MarketCreateCommunityReviewResponseDto(String str, String str2) {
        this.resultTitle = str;
        this.resultDescription = str2;
    }

    public final String d() {
        return this.resultDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.resultTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCreateCommunityReviewResponseDto)) {
            return false;
        }
        MarketCreateCommunityReviewResponseDto marketCreateCommunityReviewResponseDto = (MarketCreateCommunityReviewResponseDto) obj;
        return epx.f(this.resultTitle, marketCreateCommunityReviewResponseDto.resultTitle) && epx.f(this.resultDescription, marketCreateCommunityReviewResponseDto.resultDescription);
    }

    public final int hashCode() {
        return this.resultDescription.hashCode() + (this.resultTitle.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCreateCommunityReviewResponseDto(resultTitle=");
        sb.append(this.resultTitle);
        sb.append(", resultDescription=");
        return ho8.a(sb, this.resultDescription, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resultTitle);
        parcel.writeString(this.resultDescription);
    }
}
