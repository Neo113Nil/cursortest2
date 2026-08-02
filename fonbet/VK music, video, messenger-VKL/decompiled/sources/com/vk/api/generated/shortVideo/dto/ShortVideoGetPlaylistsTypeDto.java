package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.b;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetPlaylistsTypeDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetPlaylistsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetPlaylistsTypeDto[] $VALUES;

    @pmi0(b.JSON_KEY_ADS)
    public static final ShortVideoGetPlaylistsTypeDto ADS;

    @pmi0("authors")
    public static final ShortVideoGetPlaylistsTypeDto AUTHORS;

    @pmi0("co_owner_pending")
    public static final ShortVideoGetPlaylistsTypeDto CO_OWNER_PENDING;
    public static final Parcelable.Creator<ShortVideoGetPlaylistsTypeDto> CREATOR;

    @pmi0("favorite")
    public static final ShortVideoGetPlaylistsTypeDto FAVORITE;

    @pmi0("published")
    public static final ShortVideoGetPlaylistsTypeDto PUBLISHED;

    @pmi0("scheduled")
    public static final ShortVideoGetPlaylistsTypeDto SCHEDULED;
    private final String value;

    /* compiled from: ShortVideoGetPlaylistsTypeDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetPlaylistsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetPlaylistsTypeDto createFromParcel(Parcel parcel) {
            return ShortVideoGetPlaylistsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetPlaylistsTypeDto[] newArray(int i) {
            return new ShortVideoGetPlaylistsTypeDto[i];
        }
    }

    static {
        ShortVideoGetPlaylistsTypeDto shortVideoGetPlaylistsTypeDto = new ShortVideoGetPlaylistsTypeDto("ADS", 0, b.JSON_KEY_ADS);
        ADS = shortVideoGetPlaylistsTypeDto;
        ShortVideoGetPlaylistsTypeDto shortVideoGetPlaylistsTypeDto2 = new ShortVideoGetPlaylistsTypeDto("AUTHORS", 1, "authors");
        AUTHORS = shortVideoGetPlaylistsTypeDto2;
        ShortVideoGetPlaylistsTypeDto shortVideoGetPlaylistsTypeDto3 = new ShortVideoGetPlaylistsTypeDto("CO_OWNER_PENDING", 2, "co_owner_pending");
        CO_OWNER_PENDING = shortVideoGetPlaylistsTypeDto3;
        ShortVideoGetPlaylistsTypeDto shortVideoGetPlaylistsTypeDto4 = new ShortVideoGetPlaylistsTypeDto("FAVORITE", 3, "favorite");
        FAVORITE = shortVideoGetPlaylistsTypeDto4;
        ShortVideoGetPlaylistsTypeDto shortVideoGetPlaylistsTypeDto5 = new ShortVideoGetPlaylistsTypeDto("PUBLISHED", 4, "published");
        PUBLISHED = shortVideoGetPlaylistsTypeDto5;
        ShortVideoGetPlaylistsTypeDto shortVideoGetPlaylistsTypeDto6 = new ShortVideoGetPlaylistsTypeDto("SCHEDULED", 5, "scheduled");
        SCHEDULED = shortVideoGetPlaylistsTypeDto6;
        ShortVideoGetPlaylistsTypeDto[] shortVideoGetPlaylistsTypeDtoArr = {shortVideoGetPlaylistsTypeDto, shortVideoGetPlaylistsTypeDto2, shortVideoGetPlaylistsTypeDto3, shortVideoGetPlaylistsTypeDto4, shortVideoGetPlaylistsTypeDto5, shortVideoGetPlaylistsTypeDto6};
        $VALUES = shortVideoGetPlaylistsTypeDtoArr;
        $ENTRIES = new asp(shortVideoGetPlaylistsTypeDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetPlaylistsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetPlaylistsTypeDto valueOf(String str) {
        return (ShortVideoGetPlaylistsTypeDto) Enum.valueOf(ShortVideoGetPlaylistsTypeDto.class, str);
    }

    public static ShortVideoGetPlaylistsTypeDto[] values() {
        return (ShortVideoGetPlaylistsTypeDto[]) $VALUES.clone();
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
