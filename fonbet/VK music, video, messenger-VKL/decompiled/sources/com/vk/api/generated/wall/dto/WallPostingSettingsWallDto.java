package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallPostingSettingsWallDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsWallDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsWallDto> CREATOR = new a();

    @pmi0("group")
    private final WallPostingSettingsWallGroupDto group;

    @pmi0("user")
    private final WallPostingSettingsWallUserDto user;

    /* compiled from: WallPostingSettingsWallDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsWallDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsWallDto createFromParcel(Parcel parcel) {
            return new WallPostingSettingsWallDto(parcel.readInt() == 0 ? null : WallPostingSettingsWallUserDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WallPostingSettingsWallGroupDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsWallDto[] newArray(int i) {
            return new WallPostingSettingsWallDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallPostingSettingsWallDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final WallPostingSettingsWallGroupDto d() {
        return this.group;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final WallPostingSettingsWallUserDto e() {
        return this.user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsWallDto)) {
            return false;
        }
        WallPostingSettingsWallDto wallPostingSettingsWallDto = (WallPostingSettingsWallDto) obj;
        return epx.f(this.user, wallPostingSettingsWallDto.user) && epx.f(this.group, wallPostingSettingsWallDto.group);
    }

    public final int hashCode() {
        WallPostingSettingsWallUserDto wallPostingSettingsWallUserDto = this.user;
        int hashCode = (wallPostingSettingsWallUserDto == null ? 0 : wallPostingSettingsWallUserDto.hashCode()) * 31;
        WallPostingSettingsWallGroupDto wallPostingSettingsWallGroupDto = this.group;
        return hashCode + (wallPostingSettingsWallGroupDto != null ? wallPostingSettingsWallGroupDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallPostingSettingsWallDto(user=" + this.user + ", group=" + this.group + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WallPostingSettingsWallUserDto wallPostingSettingsWallUserDto = this.user;
        if (wallPostingSettingsWallUserDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsWallUserDto.writeToParcel(parcel, i);
        }
        WallPostingSettingsWallGroupDto wallPostingSettingsWallGroupDto = this.group;
        if (wallPostingSettingsWallGroupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsWallGroupDto.writeToParcel(parcel, i);
        }
    }

    public WallPostingSettingsWallDto(WallPostingSettingsWallUserDto wallPostingSettingsWallUserDto, WallPostingSettingsWallGroupDto wallPostingSettingsWallGroupDto) {
        this.user = wallPostingSettingsWallUserDto;
        this.group = wallPostingSettingsWallGroupDto;
    }

    public /* synthetic */ WallPostingSettingsWallDto(WallPostingSettingsWallUserDto wallPostingSettingsWallUserDto, WallPostingSettingsWallGroupDto wallPostingSettingsWallGroupDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : wallPostingSettingsWallUserDto, (i & 2) != 0 ? null : wallPostingSettingsWallGroupDto);
    }
}
