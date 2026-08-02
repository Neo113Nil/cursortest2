package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallWallpostContentLayoutItemDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostContentLayoutItemDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallWallpostContentLayoutItemDto[] $VALUES;
    public static final Parcelable.Creator<WallWallpostContentLayoutItemDto> CREATOR;

    @pmi0("primary")
    public static final WallWallpostContentLayoutItemDto PRIMARY;

    @pmi0(X3.i.Y)
    public static final WallWallpostContentLayoutItemDto SECONDARY;

    @pmi0("text")
    public static final WallWallpostContentLayoutItemDto TEXT;
    private final String value;

    /* compiled from: WallWallpostContentLayoutItemDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostContentLayoutItemDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostContentLayoutItemDto createFromParcel(Parcel parcel) {
            return WallWallpostContentLayoutItemDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostContentLayoutItemDto[] newArray(int i) {
            return new WallWallpostContentLayoutItemDto[i];
        }
    }

    static {
        WallWallpostContentLayoutItemDto wallWallpostContentLayoutItemDto = new WallWallpostContentLayoutItemDto("TEXT", 0, "text");
        TEXT = wallWallpostContentLayoutItemDto;
        WallWallpostContentLayoutItemDto wallWallpostContentLayoutItemDto2 = new WallWallpostContentLayoutItemDto("PRIMARY", 1, "primary");
        PRIMARY = wallWallpostContentLayoutItemDto2;
        WallWallpostContentLayoutItemDto wallWallpostContentLayoutItemDto3 = new WallWallpostContentLayoutItemDto("SECONDARY", 2, X3.i.Y);
        SECONDARY = wallWallpostContentLayoutItemDto3;
        WallWallpostContentLayoutItemDto[] wallWallpostContentLayoutItemDtoArr = {wallWallpostContentLayoutItemDto, wallWallpostContentLayoutItemDto2, wallWallpostContentLayoutItemDto3};
        $VALUES = wallWallpostContentLayoutItemDtoArr;
        $ENTRIES = new asp(wallWallpostContentLayoutItemDtoArr);
        CREATOR = new a();
    }

    private WallWallpostContentLayoutItemDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallWallpostContentLayoutItemDto valueOf(String str) {
        return (WallWallpostContentLayoutItemDto) Enum.valueOf(WallWallpostContentLayoutItemDto.class, str);
    }

    public static WallWallpostContentLayoutItemDto[] values() {
        return (WallWallpostContentLayoutItemDto[]) $VALUES.clone();
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
