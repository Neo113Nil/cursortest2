package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallWallpostAttachmentStyleDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentStyleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallWallpostAttachmentStyleDto[] $VALUES;

    @pmi0("chip")
    public static final WallWallpostAttachmentStyleDto CHIP;

    @pmi0("compact")
    public static final WallWallpostAttachmentStyleDto COMPACT;
    public static final Parcelable.Creator<WallWallpostAttachmentStyleDto> CREATOR;

    @pmi0("full")
    public static final WallWallpostAttachmentStyleDto FULL;

    @pmi0("on_media")
    public static final WallWallpostAttachmentStyleDto ON_MEDIA;

    @pmi0("under_media")
    public static final WallWallpostAttachmentStyleDto UNDER_MEDIA;
    private final String value;

    /* compiled from: WallWallpostAttachmentStyleDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentStyleDto createFromParcel(Parcel parcel) {
            return WallWallpostAttachmentStyleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentStyleDto[] newArray(int i) {
            return new WallWallpostAttachmentStyleDto[i];
        }
    }

    static {
        WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto = new WallWallpostAttachmentStyleDto("FULL", 0, "full");
        FULL = wallWallpostAttachmentStyleDto;
        WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto2 = new WallWallpostAttachmentStyleDto("COMPACT", 1, "compact");
        COMPACT = wallWallpostAttachmentStyleDto2;
        WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto3 = new WallWallpostAttachmentStyleDto("CHIP", 2, "chip");
        CHIP = wallWallpostAttachmentStyleDto3;
        WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto4 = new WallWallpostAttachmentStyleDto("ON_MEDIA", 3, "on_media");
        ON_MEDIA = wallWallpostAttachmentStyleDto4;
        WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto5 = new WallWallpostAttachmentStyleDto("UNDER_MEDIA", 4, "under_media");
        UNDER_MEDIA = wallWallpostAttachmentStyleDto5;
        WallWallpostAttachmentStyleDto[] wallWallpostAttachmentStyleDtoArr = {wallWallpostAttachmentStyleDto, wallWallpostAttachmentStyleDto2, wallWallpostAttachmentStyleDto3, wallWallpostAttachmentStyleDto4, wallWallpostAttachmentStyleDto5};
        $VALUES = wallWallpostAttachmentStyleDtoArr;
        $ENTRIES = new asp(wallWallpostAttachmentStyleDtoArr);
        CREATOR = new a();
    }

    private WallWallpostAttachmentStyleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallWallpostAttachmentStyleDto valueOf(String str) {
        return (WallWallpostAttachmentStyleDto) Enum.valueOf(WallWallpostAttachmentStyleDto.class, str);
    }

    public static WallWallpostAttachmentStyleDto[] values() {
        return (WallWallpostAttachmentStyleDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
