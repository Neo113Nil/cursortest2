package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: WallPostResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallPostResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallPostResponseDto> CREATOR = new a();

    @pmi0("post_id")
    private final int postId;

    /* compiled from: WallPostResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallPostResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostResponseDto createFromParcel(Parcel parcel) {
            return new WallPostResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostResponseDto[] newArray(int i) {
            return new WallPostResponseDto[i];
        }
    }

    public WallPostResponseDto(int i) {
        this.postId = i;
    }

    public final int d() {
        return this.postId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallPostResponseDto) && this.postId == ((WallPostResponseDto) obj).postId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.postId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("WallPostResponseDto(postId="), this.postId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.postId);
    }
}
