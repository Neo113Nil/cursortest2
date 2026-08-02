package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: WallEditResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallEditResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallEditResponseDto> CREATOR = new a();

    @pmi0("post_id")
    private final int postId;

    /* compiled from: WallEditResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallEditResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallEditResponseDto createFromParcel(Parcel parcel) {
            return new WallEditResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallEditResponseDto[] newArray(int i) {
            return new WallEditResponseDto[i];
        }
    }

    public WallEditResponseDto(int i) {
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
        return (obj instanceof WallEditResponseDto) && this.postId == ((WallEditResponseDto) obj).postId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.postId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("WallEditResponseDto(postId="), this.postId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.postId);
    }
}
