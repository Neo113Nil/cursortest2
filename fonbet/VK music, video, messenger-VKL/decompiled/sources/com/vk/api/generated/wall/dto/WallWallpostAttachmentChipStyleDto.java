package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallWallpostAttachmentChipStyleDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentChipStyleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallWallpostAttachmentChipStyleDto[] $VALUES;

    @pmi0("chip")
    public static final WallWallpostAttachmentChipStyleDto CHIP;
    public static final Parcelable.Creator<WallWallpostAttachmentChipStyleDto> CREATOR;

    @pmi0("grey")
    public static final WallWallpostAttachmentChipStyleDto GREY;

    @pmi0("link")
    public static final WallWallpostAttachmentChipStyleDto LINK;
    private final String value;

    /* compiled from: WallWallpostAttachmentChipStyleDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentChipStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentChipStyleDto createFromParcel(Parcel parcel) {
            return WallWallpostAttachmentChipStyleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentChipStyleDto[] newArray(int i) {
            return new WallWallpostAttachmentChipStyleDto[i];
        }
    }

    static {
        WallWallpostAttachmentChipStyleDto wallWallpostAttachmentChipStyleDto = new WallWallpostAttachmentChipStyleDto("CHIP", 0, "chip");
        CHIP = wallWallpostAttachmentChipStyleDto;
        WallWallpostAttachmentChipStyleDto wallWallpostAttachmentChipStyleDto2 = new WallWallpostAttachmentChipStyleDto("LINK", 1, "link");
        LINK = wallWallpostAttachmentChipStyleDto2;
        WallWallpostAttachmentChipStyleDto wallWallpostAttachmentChipStyleDto3 = new WallWallpostAttachmentChipStyleDto("GREY", 2, "grey");
        GREY = wallWallpostAttachmentChipStyleDto3;
        WallWallpostAttachmentChipStyleDto[] wallWallpostAttachmentChipStyleDtoArr = {wallWallpostAttachmentChipStyleDto, wallWallpostAttachmentChipStyleDto2, wallWallpostAttachmentChipStyleDto3};
        $VALUES = wallWallpostAttachmentChipStyleDtoArr;
        $ENTRIES = new asp(wallWallpostAttachmentChipStyleDtoArr);
        CREATOR = new a();
    }

    private WallWallpostAttachmentChipStyleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallWallpostAttachmentChipStyleDto valueOf(String str) {
        return (WallWallpostAttachmentChipStyleDto) Enum.valueOf(WallWallpostAttachmentChipStyleDto.class, str);
    }

    public static WallWallpostAttachmentChipStyleDto[] values() {
        return (WallWallpostAttachmentChipStyleDto[]) $VALUES.clone();
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
