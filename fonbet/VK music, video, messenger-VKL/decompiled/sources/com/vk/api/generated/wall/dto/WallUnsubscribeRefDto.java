package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallUnsubscribeRefDto.kt */
/* loaded from: classes15.dex */
public final class WallUnsubscribeRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallUnsubscribeRefDto[] $VALUES;

    @pmi0("block_header_community")
    public static final WallUnsubscribeRefDto BLOCK_HEADER_COMMUNITY;

    @pmi0("community_navbar")
    public static final WallUnsubscribeRefDto COMMUNITY_NAVBAR;
    public static final Parcelable.Creator<WallUnsubscribeRefDto> CREATOR;
    private final String value;

    /* compiled from: WallUnsubscribeRefDto.kt */
    public static final class a implements Parcelable.Creator<WallUnsubscribeRefDto> {
        @Override // android.os.Parcelable.Creator
        public final WallUnsubscribeRefDto createFromParcel(Parcel parcel) {
            return WallUnsubscribeRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallUnsubscribeRefDto[] newArray(int i) {
            return new WallUnsubscribeRefDto[i];
        }
    }

    static {
        WallUnsubscribeRefDto wallUnsubscribeRefDto = new WallUnsubscribeRefDto("BLOCK_HEADER_COMMUNITY", 0, "block_header_community");
        BLOCK_HEADER_COMMUNITY = wallUnsubscribeRefDto;
        WallUnsubscribeRefDto wallUnsubscribeRefDto2 = new WallUnsubscribeRefDto("COMMUNITY_NAVBAR", 1, "community_navbar");
        COMMUNITY_NAVBAR = wallUnsubscribeRefDto2;
        WallUnsubscribeRefDto[] wallUnsubscribeRefDtoArr = {wallUnsubscribeRefDto, wallUnsubscribeRefDto2};
        $VALUES = wallUnsubscribeRefDtoArr;
        $ENTRIES = new asp(wallUnsubscribeRefDtoArr);
        CREATOR = new a();
    }

    private WallUnsubscribeRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallUnsubscribeRefDto valueOf(String str) {
        return (WallUnsubscribeRefDto) Enum.valueOf(WallUnsubscribeRefDto.class, str);
    }

    public static WallUnsubscribeRefDto[] values() {
        return (WallUnsubscribeRefDto[]) $VALUES.clone();
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
