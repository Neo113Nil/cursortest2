package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketCreateItemReviewCommentResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketCreateItemReviewCommentResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketCreateItemReviewCommentResponseDto> CREATOR = new a();

    @pmi0("comment_id")
    private final int commentId;

    @pmi0("error_message")
    private final String errorMessage;

    /* compiled from: MarketCreateItemReviewCommentResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketCreateItemReviewCommentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCreateItemReviewCommentResponseDto createFromParcel(Parcel parcel) {
            return new MarketCreateItemReviewCommentResponseDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCreateItemReviewCommentResponseDto[] newArray(int i) {
            return new MarketCreateItemReviewCommentResponseDto[i];
        }
    }

    public MarketCreateItemReviewCommentResponseDto(int i, String str) {
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
        if (!(obj instanceof MarketCreateItemReviewCommentResponseDto)) {
            return false;
        }
        MarketCreateItemReviewCommentResponseDto marketCreateItemReviewCommentResponseDto = (MarketCreateItemReviewCommentResponseDto) obj;
        return this.commentId == marketCreateItemReviewCommentResponseDto.commentId && epx.f(this.errorMessage, marketCreateItemReviewCommentResponseDto.errorMessage);
    }

    public final int hashCode() {
        return this.errorMessage.hashCode() + (Integer.hashCode(this.commentId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCreateItemReviewCommentResponseDto(commentId=");
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
