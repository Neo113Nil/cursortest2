package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: WallPostingSettingsWallUserDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsWallUserDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsWallUserDto> CREATOR = new a();

    @pmi0("comments_are_closed")
    private final boolean commentsAreClosed;

    @pmi0("is_closed")
    private final boolean isClosed;

    @pmi0("wall")
    private final WallUserWallStatusDto wall;

    /* compiled from: WallPostingSettingsWallUserDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsWallUserDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsWallUserDto createFromParcel(Parcel parcel) {
            return new WallPostingSettingsWallUserDto(parcel.readInt() != 0, WallUserWallStatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsWallUserDto[] newArray(int i) {
            return new WallPostingSettingsWallUserDto[i];
        }
    }

    public WallPostingSettingsWallUserDto(boolean z, WallUserWallStatusDto wallUserWallStatusDto, boolean z2) {
        this.isClosed = z;
        this.wall = wallUserWallStatusDto;
        this.commentsAreClosed = z2;
    }

    public final WallUserWallStatusDto d() {
        return this.wall;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isClosed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsWallUserDto)) {
            return false;
        }
        WallPostingSettingsWallUserDto wallPostingSettingsWallUserDto = (WallPostingSettingsWallUserDto) obj;
        return this.isClosed == wallPostingSettingsWallUserDto.isClosed && this.wall == wallPostingSettingsWallUserDto.wall && this.commentsAreClosed == wallPostingSettingsWallUserDto.commentsAreClosed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.commentsAreClosed) + ((this.wall.hashCode() + (Boolean.hashCode(this.isClosed) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingSettingsWallUserDto(isClosed=");
        sb.append(this.isClosed);
        sb.append(", wall=");
        sb.append(this.wall);
        sb.append(", commentsAreClosed=");
        return q0.a(sb, this.commentsAreClosed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isClosed ? 1 : 0);
        this.wall.writeToParcel(parcel, i);
        parcel.writeInt(this.commentsAreClosed ? 1 : 0);
    }
}
