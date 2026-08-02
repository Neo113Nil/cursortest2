package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetOwnerVideosPlaylistDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetOwnerVideosPlaylistDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetOwnerVideosPlaylistDto[] $VALUES;
    public static final Parcelable.Creator<ShortVideoGetOwnerVideosPlaylistDto> CREATOR;

    @pmi0("published")
    public static final ShortVideoGetOwnerVideosPlaylistDto PUBLISHED;

    @pmi0("scheduled")
    public static final ShortVideoGetOwnerVideosPlaylistDto SCHEDULED;
    private final String value;

    /* compiled from: ShortVideoGetOwnerVideosPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetOwnerVideosPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetOwnerVideosPlaylistDto createFromParcel(Parcel parcel) {
            return ShortVideoGetOwnerVideosPlaylistDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetOwnerVideosPlaylistDto[] newArray(int i) {
            return new ShortVideoGetOwnerVideosPlaylistDto[i];
        }
    }

    static {
        ShortVideoGetOwnerVideosPlaylistDto shortVideoGetOwnerVideosPlaylistDto = new ShortVideoGetOwnerVideosPlaylistDto("PUBLISHED", 0, "published");
        PUBLISHED = shortVideoGetOwnerVideosPlaylistDto;
        ShortVideoGetOwnerVideosPlaylistDto shortVideoGetOwnerVideosPlaylistDto2 = new ShortVideoGetOwnerVideosPlaylistDto("SCHEDULED", 1, "scheduled");
        SCHEDULED = shortVideoGetOwnerVideosPlaylistDto2;
        ShortVideoGetOwnerVideosPlaylistDto[] shortVideoGetOwnerVideosPlaylistDtoArr = {shortVideoGetOwnerVideosPlaylistDto, shortVideoGetOwnerVideosPlaylistDto2};
        $VALUES = shortVideoGetOwnerVideosPlaylistDtoArr;
        $ENTRIES = new asp(shortVideoGetOwnerVideosPlaylistDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetOwnerVideosPlaylistDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetOwnerVideosPlaylistDto valueOf(String str) {
        return (ShortVideoGetOwnerVideosPlaylistDto) Enum.valueOf(ShortVideoGetOwnerVideosPlaylistDto.class, str);
    }

    public static ShortVideoGetOwnerVideosPlaylistDto[] values() {
        return (ShortVideoGetOwnerVideosPlaylistDto[]) $VALUES.clone();
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
