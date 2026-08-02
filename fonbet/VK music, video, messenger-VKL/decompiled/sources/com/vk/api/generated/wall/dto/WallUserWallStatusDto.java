package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallUserWallStatusDto.kt */
/* loaded from: classes15.dex */
public final class WallUserWallStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallUserWallStatusDto[] $VALUES;
    public static final Parcelable.Creator<WallUserWallStatusDto> CREATOR;

    @pmi0("1")
    public static final WallUserWallStatusDto NO_WALL_REPLIES;

    @pmi0("0")
    public static final WallUserWallStatusDto WITH_WALL_REPLIES;
    private final int value;

    /* compiled from: WallUserWallStatusDto.kt */
    public static final class a implements Parcelable.Creator<WallUserWallStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final WallUserWallStatusDto createFromParcel(Parcel parcel) {
            return WallUserWallStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallUserWallStatusDto[] newArray(int i) {
            return new WallUserWallStatusDto[i];
        }
    }

    static {
        WallUserWallStatusDto wallUserWallStatusDto = new WallUserWallStatusDto("WITH_WALL_REPLIES", 0, 0);
        WITH_WALL_REPLIES = wallUserWallStatusDto;
        WallUserWallStatusDto wallUserWallStatusDto2 = new WallUserWallStatusDto("NO_WALL_REPLIES", 1, 1);
        NO_WALL_REPLIES = wallUserWallStatusDto2;
        WallUserWallStatusDto[] wallUserWallStatusDtoArr = {wallUserWallStatusDto, wallUserWallStatusDto2};
        $VALUES = wallUserWallStatusDtoArr;
        $ENTRIES = new asp(wallUserWallStatusDtoArr);
        CREATOR = new a();
    }

    private WallUserWallStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static WallUserWallStatusDto valueOf(String str) {
        return (WallUserWallStatusDto) Enum.valueOf(WallUserWallStatusDto.class, str);
    }

    public static WallUserWallStatusDto[] values() {
        return (WallUserWallStatusDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
