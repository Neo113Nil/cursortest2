package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ShortVideoSaveAnonLikeResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSaveAnonLikeResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoSaveAnonLikeResponseDto> CREATOR = new a();

    @pmi0("likes")
    private final int likes;

    @pmi0("success")
    private final boolean success;

    /* compiled from: ShortVideoSaveAnonLikeResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSaveAnonLikeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSaveAnonLikeResponseDto createFromParcel(Parcel parcel) {
            return new ShortVideoSaveAnonLikeResponseDto(parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSaveAnonLikeResponseDto[] newArray(int i) {
            return new ShortVideoSaveAnonLikeResponseDto[i];
        }
    }

    public ShortVideoSaveAnonLikeResponseDto(boolean z, int i) {
        this.success = z;
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
        if (!(obj instanceof ShortVideoSaveAnonLikeResponseDto)) {
            return false;
        }
        ShortVideoSaveAnonLikeResponseDto shortVideoSaveAnonLikeResponseDto = (ShortVideoSaveAnonLikeResponseDto) obj;
        return this.success == shortVideoSaveAnonLikeResponseDto.success && this.likes == shortVideoSaveAnonLikeResponseDto.likes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.likes) + (Boolean.hashCode(this.success) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoSaveAnonLikeResponseDto(success=");
        sb.append(this.success);
        sb.append(", likes=");
        return vu5.b(sb, this.likes, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success ? 1 : 0);
        parcel.writeInt(this.likes);
    }
}
