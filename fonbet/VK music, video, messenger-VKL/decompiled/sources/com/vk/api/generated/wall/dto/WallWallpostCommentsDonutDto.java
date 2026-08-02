package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallWallpostCommentsDonutDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostCommentsDonutDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostCommentsDonutDto> CREATOR = new a();

    @pmi0("placeholder")
    private final WallWallpostCommentsDonutPlaceholderDto placeholder;

    /* compiled from: WallWallpostCommentsDonutDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostCommentsDonutDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostCommentsDonutDto createFromParcel(Parcel parcel) {
            return new WallWallpostCommentsDonutDto(parcel.readInt() == 0 ? null : WallWallpostCommentsDonutPlaceholderDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostCommentsDonutDto[] newArray(int i) {
            return new WallWallpostCommentsDonutDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallWallpostCommentsDonutDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final WallWallpostCommentsDonutPlaceholderDto d() {
        return this.placeholder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallWallpostCommentsDonutDto) && epx.f(this.placeholder, ((WallWallpostCommentsDonutDto) obj).placeholder);
    }

    public final int hashCode() {
        WallWallpostCommentsDonutPlaceholderDto wallWallpostCommentsDonutPlaceholderDto = this.placeholder;
        if (wallWallpostCommentsDonutPlaceholderDto == null) {
            return 0;
        }
        return wallWallpostCommentsDonutPlaceholderDto.hashCode();
    }

    public final String toString() {
        return "WallWallpostCommentsDonutDto(placeholder=" + this.placeholder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WallWallpostCommentsDonutPlaceholderDto wallWallpostCommentsDonutPlaceholderDto = this.placeholder;
        if (wallWallpostCommentsDonutPlaceholderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostCommentsDonutPlaceholderDto.writeToParcel(parcel, i);
        }
    }

    public WallWallpostCommentsDonutDto(WallWallpostCommentsDonutPlaceholderDto wallWallpostCommentsDonutPlaceholderDto) {
        this.placeholder = wallWallpostCommentsDonutPlaceholderDto;
    }

    public /* synthetic */ WallWallpostCommentsDonutDto(WallWallpostCommentsDonutPlaceholderDto wallWallpostCommentsDonutPlaceholderDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : wallWallpostCommentsDonutPlaceholderDto);
    }
}
