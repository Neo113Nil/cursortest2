package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallGroupWallStatusDto.kt */
/* loaded from: classes15.dex */
public final class WallGroupWallStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallGroupWallStatusDto[] $VALUES;
    public static final Parcelable.Creator<WallGroupWallStatusDto> CREATOR;

    @pmi0("0")
    public static final WallGroupWallStatusDto DISABLED;

    @pmi0("2")
    public static final WallGroupWallStatusDto LIMITED;

    @pmi0("1")
    public static final WallGroupWallStatusDto OPEN;

    @pmi0("3")
    public static final WallGroupWallStatusDto RESTRICTED;
    private final int value;

    /* compiled from: WallGroupWallStatusDto.kt */
    public static final class a implements Parcelable.Creator<WallGroupWallStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGroupWallStatusDto createFromParcel(Parcel parcel) {
            return WallGroupWallStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallGroupWallStatusDto[] newArray(int i) {
            return new WallGroupWallStatusDto[i];
        }
    }

    static {
        WallGroupWallStatusDto wallGroupWallStatusDto = new WallGroupWallStatusDto("DISABLED", 0, 0);
        DISABLED = wallGroupWallStatusDto;
        WallGroupWallStatusDto wallGroupWallStatusDto2 = new WallGroupWallStatusDto("OPEN", 1, 1);
        OPEN = wallGroupWallStatusDto2;
        WallGroupWallStatusDto wallGroupWallStatusDto3 = new WallGroupWallStatusDto("LIMITED", 2, 2);
        LIMITED = wallGroupWallStatusDto3;
        WallGroupWallStatusDto wallGroupWallStatusDto4 = new WallGroupWallStatusDto("RESTRICTED", 3, 3);
        RESTRICTED = wallGroupWallStatusDto4;
        WallGroupWallStatusDto[] wallGroupWallStatusDtoArr = {wallGroupWallStatusDto, wallGroupWallStatusDto2, wallGroupWallStatusDto3, wallGroupWallStatusDto4};
        $VALUES = wallGroupWallStatusDtoArr;
        $ENTRIES = new asp(wallGroupWallStatusDtoArr);
        CREATOR = new a();
    }

    private WallGroupWallStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static WallGroupWallStatusDto valueOf(String str) {
        return (WallGroupWallStatusDto) Enum.valueOf(WallGroupWallStatusDto.class, str);
    }

    public static WallGroupWallStatusDto[] values() {
        return (WallGroupWallStatusDto[]) $VALUES.clone();
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
