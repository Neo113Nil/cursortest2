package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetOwnerVideosPlaylistAliasDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetOwnerVideosPlaylistAliasDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetOwnerVideosPlaylistAliasDto[] $VALUES;

    @pmi0("co_owner_pending")
    public static final ShortVideoGetOwnerVideosPlaylistAliasDto CO_OWNER_PENDING;
    public static final Parcelable.Creator<ShortVideoGetOwnerVideosPlaylistAliasDto> CREATOR;

    @pmi0("favorite")
    public static final ShortVideoGetOwnerVideosPlaylistAliasDto FAVORITE;
    private final String value;

    /* compiled from: ShortVideoGetOwnerVideosPlaylistAliasDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetOwnerVideosPlaylistAliasDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetOwnerVideosPlaylistAliasDto createFromParcel(Parcel parcel) {
            return ShortVideoGetOwnerVideosPlaylistAliasDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetOwnerVideosPlaylistAliasDto[] newArray(int i) {
            return new ShortVideoGetOwnerVideosPlaylistAliasDto[i];
        }
    }

    static {
        ShortVideoGetOwnerVideosPlaylistAliasDto shortVideoGetOwnerVideosPlaylistAliasDto = new ShortVideoGetOwnerVideosPlaylistAliasDto("CO_OWNER_PENDING", 0, "co_owner_pending");
        CO_OWNER_PENDING = shortVideoGetOwnerVideosPlaylistAliasDto;
        ShortVideoGetOwnerVideosPlaylistAliasDto shortVideoGetOwnerVideosPlaylistAliasDto2 = new ShortVideoGetOwnerVideosPlaylistAliasDto("FAVORITE", 1, "favorite");
        FAVORITE = shortVideoGetOwnerVideosPlaylistAliasDto2;
        ShortVideoGetOwnerVideosPlaylistAliasDto[] shortVideoGetOwnerVideosPlaylistAliasDtoArr = {shortVideoGetOwnerVideosPlaylistAliasDto, shortVideoGetOwnerVideosPlaylistAliasDto2};
        $VALUES = shortVideoGetOwnerVideosPlaylistAliasDtoArr;
        $ENTRIES = new asp(shortVideoGetOwnerVideosPlaylistAliasDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetOwnerVideosPlaylistAliasDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetOwnerVideosPlaylistAliasDto valueOf(String str) {
        return (ShortVideoGetOwnerVideosPlaylistAliasDto) Enum.valueOf(ShortVideoGetOwnerVideosPlaylistAliasDto.class, str);
    }

    public static ShortVideoGetOwnerVideosPlaylistAliasDto[] values() {
        return (ShortVideoGetOwnerVideosPlaylistAliasDto[]) $VALUES.clone();
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
