package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetPlaylistsPlaylistAliasesDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetPlaylistsPlaylistAliasesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetPlaylistsPlaylistAliasesDto[] $VALUES;

    @pmi0("co_owner_pending")
    public static final ShortVideoGetPlaylistsPlaylistAliasesDto CO_OWNER_PENDING;
    public static final Parcelable.Creator<ShortVideoGetPlaylistsPlaylistAliasesDto> CREATOR;

    @pmi0("favorite")
    public static final ShortVideoGetPlaylistsPlaylistAliasesDto FAVORITE;

    @pmi0("published")
    public static final ShortVideoGetPlaylistsPlaylistAliasesDto PUBLISHED;

    @pmi0("scheduled")
    public static final ShortVideoGetPlaylistsPlaylistAliasesDto SCHEDULED;
    private final String value;

    /* compiled from: ShortVideoGetPlaylistsPlaylistAliasesDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetPlaylistsPlaylistAliasesDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetPlaylistsPlaylistAliasesDto createFromParcel(Parcel parcel) {
            return ShortVideoGetPlaylistsPlaylistAliasesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetPlaylistsPlaylistAliasesDto[] newArray(int i) {
            return new ShortVideoGetPlaylistsPlaylistAliasesDto[i];
        }
    }

    static {
        ShortVideoGetPlaylistsPlaylistAliasesDto shortVideoGetPlaylistsPlaylistAliasesDto = new ShortVideoGetPlaylistsPlaylistAliasesDto("CO_OWNER_PENDING", 0, "co_owner_pending");
        CO_OWNER_PENDING = shortVideoGetPlaylistsPlaylistAliasesDto;
        ShortVideoGetPlaylistsPlaylistAliasesDto shortVideoGetPlaylistsPlaylistAliasesDto2 = new ShortVideoGetPlaylistsPlaylistAliasesDto("FAVORITE", 1, "favorite");
        FAVORITE = shortVideoGetPlaylistsPlaylistAliasesDto2;
        ShortVideoGetPlaylistsPlaylistAliasesDto shortVideoGetPlaylistsPlaylistAliasesDto3 = new ShortVideoGetPlaylistsPlaylistAliasesDto("PUBLISHED", 2, "published");
        PUBLISHED = shortVideoGetPlaylistsPlaylistAliasesDto3;
        ShortVideoGetPlaylistsPlaylistAliasesDto shortVideoGetPlaylistsPlaylistAliasesDto4 = new ShortVideoGetPlaylistsPlaylistAliasesDto("SCHEDULED", 3, "scheduled");
        SCHEDULED = shortVideoGetPlaylistsPlaylistAliasesDto4;
        ShortVideoGetPlaylistsPlaylistAliasesDto[] shortVideoGetPlaylistsPlaylistAliasesDtoArr = {shortVideoGetPlaylistsPlaylistAliasesDto, shortVideoGetPlaylistsPlaylistAliasesDto2, shortVideoGetPlaylistsPlaylistAliasesDto3, shortVideoGetPlaylistsPlaylistAliasesDto4};
        $VALUES = shortVideoGetPlaylistsPlaylistAliasesDtoArr;
        $ENTRIES = new asp(shortVideoGetPlaylistsPlaylistAliasesDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetPlaylistsPlaylistAliasesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetPlaylistsPlaylistAliasesDto valueOf(String str) {
        return (ShortVideoGetPlaylistsPlaylistAliasesDto) Enum.valueOf(ShortVideoGetPlaylistsPlaylistAliasesDto.class, str);
    }

    public static ShortVideoGetPlaylistsPlaylistAliasesDto[] values() {
        return (ShortVideoGetPlaylistsPlaylistAliasesDto[]) $VALUES.clone();
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
