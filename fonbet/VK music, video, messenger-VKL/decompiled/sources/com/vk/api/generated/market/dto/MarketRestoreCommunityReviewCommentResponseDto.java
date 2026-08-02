package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketRestoreCommunityReviewCommentResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketRestoreCommunityReviewCommentResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketRestoreCommunityReviewCommentResponseDto> CREATOR = new a();

    @pmi0("result_description")
    private final String resultDescription;

    @pmi0("result_title")
    private final String resultTitle;

    /* compiled from: MarketRestoreCommunityReviewCommentResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketRestoreCommunityReviewCommentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketRestoreCommunityReviewCommentResponseDto createFromParcel(Parcel parcel) {
            return new MarketRestoreCommunityReviewCommentResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketRestoreCommunityReviewCommentResponseDto[] newArray(int i) {
            return new MarketRestoreCommunityReviewCommentResponseDto[i];
        }
    }

    public MarketRestoreCommunityReviewCommentResponseDto(String str, String str2) {
        this.resultTitle = str;
        this.resultDescription = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketRestoreCommunityReviewCommentResponseDto)) {
            return false;
        }
        MarketRestoreCommunityReviewCommentResponseDto marketRestoreCommunityReviewCommentResponseDto = (MarketRestoreCommunityReviewCommentResponseDto) obj;
        return epx.f(this.resultTitle, marketRestoreCommunityReviewCommentResponseDto.resultTitle) && epx.f(this.resultDescription, marketRestoreCommunityReviewCommentResponseDto.resultDescription);
    }

    public final int hashCode() {
        return this.resultDescription.hashCode() + (this.resultTitle.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketRestoreCommunityReviewCommentResponseDto(resultTitle=");
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
