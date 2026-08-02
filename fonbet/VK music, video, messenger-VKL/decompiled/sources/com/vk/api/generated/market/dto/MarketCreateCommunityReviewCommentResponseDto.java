package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketCreateCommunityReviewCommentResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketCreateCommunityReviewCommentResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketCreateCommunityReviewCommentResponseDto> CREATOR = new a();

    @pmi0("comment_id")
    private final int commentId;

    @pmi0("error_message")
    private final String errorMessage;

    /* compiled from: MarketCreateCommunityReviewCommentResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketCreateCommunityReviewCommentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCreateCommunityReviewCommentResponseDto createFromParcel(Parcel parcel) {
            return new MarketCreateCommunityReviewCommentResponseDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCreateCommunityReviewCommentResponseDto[] newArray(int i) {
            return new MarketCreateCommunityReviewCommentResponseDto[i];
        }
    }

    public MarketCreateCommunityReviewCommentResponseDto(int i, String str) {
        this.commentId = i;
        this.errorMessage = str;
    }

    public final int d() {
        return this.commentId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCreateCommunityReviewCommentResponseDto)) {
            return false;
        }
        MarketCreateCommunityReviewCommentResponseDto marketCreateCommunityReviewCommentResponseDto = (MarketCreateCommunityReviewCommentResponseDto) obj;
        return this.commentId == marketCreateCommunityReviewCommentResponseDto.commentId && epx.f(this.errorMessage, marketCreateCommunityReviewCommentResponseDto.errorMessage);
    }

    public final int hashCode() {
        return this.errorMessage.hashCode() + (Integer.hashCode(this.commentId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCreateCommunityReviewCommentResponseDto(commentId=");
        sb.append(this.commentId);
        sb.append(", errorMessage=");
        return ho8.a(sb, this.errorMessage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.commentId);
        parcel.writeString(this.errorMessage);
    }
}
