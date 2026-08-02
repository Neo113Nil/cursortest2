package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ShortVideoSaveLikeResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSaveLikeResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoSaveLikeResponseDto> CREATOR = new a();

    @pmi0("likes")
    private final int likes;

    /* compiled from: ShortVideoSaveLikeResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSaveLikeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSaveLikeResponseDto createFromParcel(Parcel parcel) {
            return new ShortVideoSaveLikeResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSaveLikeResponseDto[] newArray(int i) {
            return new ShortVideoSaveLikeResponseDto[i];
        }
    }

    public ShortVideoSaveLikeResponseDto(int i) {
        this.likes = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoSaveLikeResponseDto) && this.likes == ((ShortVideoSaveLikeResponseDto) obj).likes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.likes);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ShortVideoSaveLikeResponseDto(likes="), this.likes, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.likes);
    }
}
