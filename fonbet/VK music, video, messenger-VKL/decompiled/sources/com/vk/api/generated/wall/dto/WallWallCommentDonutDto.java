package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: WallWallCommentDonutDto.kt */
/* loaded from: classes15.dex */
public final class WallWallCommentDonutDto implements Parcelable {
    public static final Parcelable.Creator<WallWallCommentDonutDto> CREATOR = new a();

    @pmi0("is_don")
    private final Boolean isDon;

    @pmi0("placeholder")
    private final WallWallCommentDonutPlaceholderDto placeholder;

    /* compiled from: WallWallCommentDonutDto.kt */
    public static final class a implements Parcelable.Creator<WallWallCommentDonutDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallCommentDonutDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WallWallCommentDonutDto(valueOf, parcel.readInt() != 0 ? WallWallCommentDonutPlaceholderDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallCommentDonutDto[] newArray(int i) {
            return new WallWallCommentDonutDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallWallCommentDonutDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final WallWallCommentDonutPlaceholderDto d() {
        return this.placeholder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isDon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallCommentDonutDto)) {
            return false;
        }
        WallWallCommentDonutDto wallWallCommentDonutDto = (WallWallCommentDonutDto) obj;
        return epx.f(this.isDon, wallWallCommentDonutDto.isDon) && epx.f(this.placeholder, wallWallCommentDonutDto.placeholder);
    }

    public final int hashCode() {
        Boolean bool = this.isDon;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        WallWallCommentDonutPlaceholderDto wallWallCommentDonutPlaceholderDto = this.placeholder;
        return hashCode + (wallWallCommentDonutPlaceholderDto != null ? wallWallCommentDonutPlaceholderDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallWallCommentDonutDto(isDon=" + this.isDon + ", placeholder=" + this.placeholder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isDon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        WallWallCommentDonutPlaceholderDto wallWallCommentDonutPlaceholderDto = this.placeholder;
        if (wallWallCommentDonutPlaceholderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallCommentDonutPlaceholderDto.writeToParcel(parcel, i);
        }
    }

    public WallWallCommentDonutDto(Boolean bool, WallWallCommentDonutPlaceholderDto wallWallCommentDonutPlaceholderDto) {
        this.isDon = bool;
        this.placeholder = wallWallCommentDonutPlaceholderDto;
    }

    public /* synthetic */ WallWallCommentDonutDto(Boolean bool, WallWallCommentDonutPlaceholderDto wallWallCommentDonutPlaceholderDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : wallWallCommentDonutPlaceholderDto);
    }
}
