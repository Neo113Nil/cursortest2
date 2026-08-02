package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketUpdateItemReviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketUpdateItemReviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketUpdateItemReviewResponseDto> CREATOR = new a();

    @pmi0("result_description")
    private final String resultDescription;

    @pmi0("result_title")
    private final String resultTitle;

    /* compiled from: MarketUpdateItemReviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketUpdateItemReviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketUpdateItemReviewResponseDto createFromParcel(Parcel parcel) {
            return new MarketUpdateItemReviewResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketUpdateItemReviewResponseDto[] newArray(int i) {
            return new MarketUpdateItemReviewResponseDto[i];
        }
    }

    public MarketUpdateItemReviewResponseDto(String str, String str2) {
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
        if (!(obj instanceof MarketUpdateItemReviewResponseDto)) {
            return false;
        }
        MarketUpdateItemReviewResponseDto marketUpdateItemReviewResponseDto = (MarketUpdateItemReviewResponseDto) obj;
        return epx.f(this.resultTitle, marketUpdateItemReviewResponseDto.resultTitle) && epx.f(this.resultDescription, marketUpdateItemReviewResponseDto.resultDescription);
    }

    public final int hashCode() {
        return this.resultDescription.hashCode() + (this.resultTitle.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketUpdateItemReviewResponseDto(resultTitle=");
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
