package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LikesDeleteResponseDto.kt */
/* loaded from: classes14.dex */
public final class LikesDeleteResponseDto implements Parcelable {
    public static final Parcelable.Creator<LikesDeleteResponseDto> CREATOR = new a();

    @pmi0("likes")
    private final int likes;

    @pmi0("reactions")
    private final LikesItemReactionsDto reactions;

    /* compiled from: LikesDeleteResponseDto.kt */
    public static final class a implements Parcelable.Creator<LikesDeleteResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesDeleteResponseDto createFromParcel(Parcel parcel) {
            return new LikesDeleteResponseDto(parcel.readInt(), (LikesItemReactionsDto) parcel.readParcelable(LikesDeleteResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LikesDeleteResponseDto[] newArray(int i) {
            return new LikesDeleteResponseDto[i];
        }
    }

    public LikesDeleteResponseDto(int i, LikesItemReactionsDto likesItemReactionsDto) {
        this.likes = i;
        this.reactions = likesItemReactionsDto;
    }

    public final LikesItemReactionsDto d() {
        return this.reactions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesDeleteResponseDto)) {
            return false;
        }
        LikesDeleteResponseDto likesDeleteResponseDto = (LikesDeleteResponseDto) obj;
        return this.likes == likesDeleteResponseDto.likes && epx.f(this.reactions, likesDeleteResponseDto.reactions);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.likes) * 31;
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        return hashCode + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode());
    }

    public final int l1() {
        return this.likes;
    }

    public final String toString() {
        return "LikesDeleteResponseDto(likes=" + this.likes + ", reactions=" + this.reactions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.likes);
        parcel.writeParcelable(this.reactions, i);
    }

    public /* synthetic */ LikesDeleteResponseDto(int i, LikesItemReactionsDto likesItemReactionsDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : likesItemReactionsDto);
    }
}
