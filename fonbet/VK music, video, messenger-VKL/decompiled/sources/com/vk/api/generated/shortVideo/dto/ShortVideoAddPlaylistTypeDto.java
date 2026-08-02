package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoAddPlaylistTypeDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoAddPlaylistTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoAddPlaylistTypeDto[] $VALUES;

    @pmi0("authors")
    public static final ShortVideoAddPlaylistTypeDto AUTHORS;
    public static final Parcelable.Creator<ShortVideoAddPlaylistTypeDto> CREATOR;

    @pmi0("favorite")
    public static final ShortVideoAddPlaylistTypeDto FAVORITE;
    private final String value;

    /* compiled from: ShortVideoAddPlaylistTypeDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoAddPlaylistTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoAddPlaylistTypeDto createFromParcel(Parcel parcel) {
            return ShortVideoAddPlaylistTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoAddPlaylistTypeDto[] newArray(int i) {
            return new ShortVideoAddPlaylistTypeDto[i];
        }
    }

    static {
        ShortVideoAddPlaylistTypeDto shortVideoAddPlaylistTypeDto = new ShortVideoAddPlaylistTypeDto("AUTHORS", 0, "authors");
        AUTHORS = shortVideoAddPlaylistTypeDto;
        ShortVideoAddPlaylistTypeDto shortVideoAddPlaylistTypeDto2 = new ShortVideoAddPlaylistTypeDto("FAVORITE", 1, "favorite");
        FAVORITE = shortVideoAddPlaylistTypeDto2;
        ShortVideoAddPlaylistTypeDto[] shortVideoAddPlaylistTypeDtoArr = {shortVideoAddPlaylistTypeDto, shortVideoAddPlaylistTypeDto2};
        $VALUES = shortVideoAddPlaylistTypeDtoArr;
        $ENTRIES = new asp(shortVideoAddPlaylistTypeDtoArr);
        CREATOR = new a();
    }

    private ShortVideoAddPlaylistTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoAddPlaylistTypeDto valueOf(String str) {
        return (ShortVideoAddPlaylistTypeDto) Enum.valueOf(ShortVideoAddPlaylistTypeDto.class, str);
    }

    public static ShortVideoAddPlaylistTypeDto[] values() {
        return (ShortVideoAddPlaylistTypeDto[]) $VALUES.clone();
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
