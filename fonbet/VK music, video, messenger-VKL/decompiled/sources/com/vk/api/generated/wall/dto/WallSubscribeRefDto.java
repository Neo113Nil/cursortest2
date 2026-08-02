package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallSubscribeRefDto.kt */
/* loaded from: classes15.dex */
public final class WallSubscribeRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallSubscribeRefDto[] $VALUES;

    @pmi0("block_header_community")
    public static final WallSubscribeRefDto BLOCK_HEADER_COMMUNITY;

    @pmi0("community_navbar")
    public static final WallSubscribeRefDto COMMUNITY_NAVBAR;
    public static final Parcelable.Creator<WallSubscribeRefDto> CREATOR;
    private final String value;

    /* compiled from: WallSubscribeRefDto.kt */
    public static final class a implements Parcelable.Creator<WallSubscribeRefDto> {
        @Override // android.os.Parcelable.Creator
        public final WallSubscribeRefDto createFromParcel(Parcel parcel) {
            return WallSubscribeRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallSubscribeRefDto[] newArray(int i) {
            return new WallSubscribeRefDto[i];
        }
    }

    static {
        WallSubscribeRefDto wallSubscribeRefDto = new WallSubscribeRefDto("BLOCK_HEADER_COMMUNITY", 0, "block_header_community");
        BLOCK_HEADER_COMMUNITY = wallSubscribeRefDto;
        WallSubscribeRefDto wallSubscribeRefDto2 = new WallSubscribeRefDto("COMMUNITY_NAVBAR", 1, "community_navbar");
        COMMUNITY_NAVBAR = wallSubscribeRefDto2;
        WallSubscribeRefDto[] wallSubscribeRefDtoArr = {wallSubscribeRefDto, wallSubscribeRefDto2};
        $VALUES = wallSubscribeRefDtoArr;
        $ENTRIES = new asp(wallSubscribeRefDtoArr);
        CREATOR = new a();
    }

    private WallSubscribeRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallSubscribeRefDto valueOf(String str) {
        return (WallSubscribeRefDto) Enum.valueOf(WallSubscribeRefDto.class, str);
    }

    public static WallSubscribeRefDto[] values() {
        return (WallSubscribeRefDto[]) $VALUES.clone();
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
