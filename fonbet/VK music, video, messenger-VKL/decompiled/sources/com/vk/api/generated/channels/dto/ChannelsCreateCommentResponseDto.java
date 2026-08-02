package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsCreateCommentResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsCreateCommentResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsCreateCommentResponseDto> CREATOR = new a();

    @pmi0("comment")
    private final ChannelsMessageCommentDto comment;

    @pmi0("comment_id")
    private final int commentId;

    /* compiled from: ChannelsCreateCommentResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsCreateCommentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateCommentResponseDto createFromParcel(Parcel parcel) {
            return new ChannelsCreateCommentResponseDto(parcel.readInt(), parcel.readInt() == 0 ? null : ChannelsMessageCommentDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateCommentResponseDto[] newArray(int i) {
            return new ChannelsCreateCommentResponseDto[i];
        }
    }

    public ChannelsCreateCommentResponseDto(int i, ChannelsMessageCommentDto channelsMessageCommentDto) {
        this.commentId = i;
        this.comment = channelsMessageCommentDto;
    }

    public final ChannelsMessageCommentDto d() {
        return this.comment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.commentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsCreateCommentResponseDto)) {
            return false;
        }
        ChannelsCreateCommentResponseDto channelsCreateCommentResponseDto = (ChannelsCreateCommentResponseDto) obj;
        return this.commentId == channelsCreateCommentResponseDto.commentId && epx.f(this.comment, channelsCreateCommentResponseDto.comment);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.commentId) * 31;
        ChannelsMessageCommentDto channelsMessageCommentDto = this.comment;
        return hashCode + (channelsMessageCommentDto == null ? 0 : channelsMessageCommentDto.hashCode());
    }

    public final String toString() {
        return "ChannelsCreateCommentResponseDto(commentId=" + this.commentId + ", comment=" + this.comment + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.commentId);
        ChannelsMessageCommentDto channelsMessageCommentDto = this.comment;
        if (channelsMessageCommentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsMessageCommentDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ChannelsCreateCommentResponseDto(int i, ChannelsMessageCommentDto channelsMessageCommentDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : channelsMessageCommentDto);
    }
}
