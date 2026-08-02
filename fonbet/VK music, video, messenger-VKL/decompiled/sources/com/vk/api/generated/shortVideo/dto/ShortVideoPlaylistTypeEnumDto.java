package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.b;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoPlaylistTypeEnumDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoPlaylistTypeEnumDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoPlaylistTypeEnumDto[] $VALUES;

    @pmi0(b.JSON_KEY_ADS)
    public static final ShortVideoPlaylistTypeEnumDto ADS;

    @pmi0("authors")
    public static final ShortVideoPlaylistTypeEnumDto AUTHORS;

    @pmi0("co_owner_pending")
    public static final ShortVideoPlaylistTypeEnumDto CO_OWNER_PENDING;
    public static final Parcelable.Creator<ShortVideoPlaylistTypeEnumDto> CREATOR;

    @pmi0("favorite")
    public static final ShortVideoPlaylistTypeEnumDto FAVORITE;

    @pmi0("published")
    public static final ShortVideoPlaylistTypeEnumDto PUBLISHED;

    @pmi0("scheduled")
    public static final ShortVideoPlaylistTypeEnumDto SCHEDULED;
    private final String value;

    /* compiled from: ShortVideoPlaylistTypeEnumDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoPlaylistTypeEnumDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoPlaylistTypeEnumDto createFromParcel(Parcel parcel) {
            return ShortVideoPlaylistTypeEnumDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoPlaylistTypeEnumDto[] newArray(int i) {
            return new ShortVideoPlaylistTypeEnumDto[i];
        }
    }

    static {
        ShortVideoPlaylistTypeEnumDto shortVideoPlaylistTypeEnumDto = new ShortVideoPlaylistTypeEnumDto("AUTHORS", 0, "authors");
        AUTHORS = shortVideoPlaylistTypeEnumDto;
        ShortVideoPlaylistTypeEnumDto shortVideoPlaylistTypeEnumDto2 = new ShortVideoPlaylistTypeEnumDto("FAVORITE", 1, "favorite");
        FAVORITE = shortVideoPlaylistTypeEnumDto2;
        ShortVideoPlaylistTypeEnumDto shortVideoPlaylistTypeEnumDto3 = new ShortVideoPlaylistTypeEnumDto("PUBLISHED", 2, "published");
        PUBLISHED = shortVideoPlaylistTypeEnumDto3;
        ShortVideoPlaylistTypeEnumDto shortVideoPlaylistTypeEnumDto4 = new ShortVideoPlaylistTypeEnumDto("SCHEDULED", 3, "scheduled");
        SCHEDULED = shortVideoPlaylistTypeEnumDto4;
        ShortVideoPlaylistTypeEnumDto shortVideoPlaylistTypeEnumDto5 = new ShortVideoPlaylistTypeEnumDto("ADS", 4, b.JSON_KEY_ADS);
        ADS = shortVideoPlaylistTypeEnumDto5;
        ShortVideoPlaylistTypeEnumDto shortVideoPlaylistTypeEnumDto6 = new ShortVideoPlaylistTypeEnumDto("CO_OWNER_PENDING", 5, "co_owner_pending");
        CO_OWNER_PENDING = shortVideoPlaylistTypeEnumDto6;
        ShortVideoPlaylistTypeEnumDto[] shortVideoPlaylistTypeEnumDtoArr = {shortVideoPlaylistTypeEnumDto, shortVideoPlaylistTypeEnumDto2, shortVideoPlaylistTypeEnumDto3, shortVideoPlaylistTypeEnumDto4, shortVideoPlaylistTypeEnumDto5, shortVideoPlaylistTypeEnumDto6};
        $VALUES = shortVideoPlaylistTypeEnumDtoArr;
        $ENTRIES = new asp(shortVideoPlaylistTypeEnumDtoArr);
        CREATOR = new a();
    }

    private ShortVideoPlaylistTypeEnumDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoPlaylistTypeEnumDto valueOf(String str) {
        return (ShortVideoPlaylistTypeEnumDto) Enum.valueOf(ShortVideoPlaylistTypeEnumDto.class, str);
    }

    public static ShortVideoPlaylistTypeEnumDto[] values() {
        return (ShortVideoPlaylistTypeEnumDto[]) $VALUES.clone();
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
