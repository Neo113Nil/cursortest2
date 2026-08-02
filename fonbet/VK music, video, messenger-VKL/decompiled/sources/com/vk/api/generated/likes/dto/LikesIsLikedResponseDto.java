package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.wp;
import xsna.zcl;

/* compiled from: LikesIsLikedResponseDto.kt */
/* loaded from: classes14.dex */
public final class LikesIsLikedResponseDto implements Parcelable {
    public static final Parcelable.Creator<LikesIsLikedResponseDto> CREATOR = new a();

    @pmi0("copied")
    private final BaseBoolIntDto copied;

    @pmi0("liked")
    private final BaseBoolIntDto liked;

    @pmi0("reaction_id")
    private final Integer reactionId;

    /* compiled from: LikesIsLikedResponseDto.kt */
    public static final class a implements Parcelable.Creator<LikesIsLikedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesIsLikedResponseDto createFromParcel(Parcel parcel) {
            return new LikesIsLikedResponseDto((BaseBoolIntDto) parcel.readParcelable(LikesIsLikedResponseDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(LikesIsLikedResponseDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final LikesIsLikedResponseDto[] newArray(int i) {
            return new LikesIsLikedResponseDto[i];
        }
    }

    public LikesIsLikedResponseDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num) {
        this.liked = baseBoolIntDto;
        this.copied = baseBoolIntDto2;
        this.reactionId = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesIsLikedResponseDto)) {
            return false;
        }
        LikesIsLikedResponseDto likesIsLikedResponseDto = (LikesIsLikedResponseDto) obj;
        return this.liked == likesIsLikedResponseDto.liked && this.copied == likesIsLikedResponseDto.copied && epx.f(this.reactionId, likesIsLikedResponseDto.reactionId);
    }

    public final int hashCode() {
        int b = wp.b(this.copied, this.liked.hashCode() * 31, 31);
        Integer num = this.reactionId;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesIsLikedResponseDto(liked=");
        sb.append(this.liked);
        sb.append(", copied=");
        sb.append(this.copied);
        sb.append(", reactionId=");
        return uqi.b(sb, this.reactionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.liked, i);
        parcel.writeParcelable(this.copied, i);
        Integer num = this.reactionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ LikesIsLikedResponseDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, int i, zcl zclVar) {
        this(baseBoolIntDto, baseBoolIntDto2, (i & 4) != 0 ? null : num);
    }
}
