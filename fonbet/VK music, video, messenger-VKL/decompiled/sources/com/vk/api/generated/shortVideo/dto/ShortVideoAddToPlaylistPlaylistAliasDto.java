package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoAddToPlaylistPlaylistAliasDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoAddToPlaylistPlaylistAliasDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoAddToPlaylistPlaylistAliasDto[] $VALUES;
    public static final Parcelable.Creator<ShortVideoAddToPlaylistPlaylistAliasDto> CREATOR;

    @pmi0("favorite")
    public static final ShortVideoAddToPlaylistPlaylistAliasDto FAVORITE;
    private final String value;

    /* compiled from: ShortVideoAddToPlaylistPlaylistAliasDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoAddToPlaylistPlaylistAliasDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoAddToPlaylistPlaylistAliasDto createFromParcel(Parcel parcel) {
            return ShortVideoAddToPlaylistPlaylistAliasDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoAddToPlaylistPlaylistAliasDto[] newArray(int i) {
            return new ShortVideoAddToPlaylistPlaylistAliasDto[i];
        }
    }

    static {
        ShortVideoAddToPlaylistPlaylistAliasDto shortVideoAddToPlaylistPlaylistAliasDto = new ShortVideoAddToPlaylistPlaylistAliasDto("FAVORITE", 0, "favorite");
        FAVORITE = shortVideoAddToPlaylistPlaylistAliasDto;
        ShortVideoAddToPlaylistPlaylistAliasDto[] shortVideoAddToPlaylistPlaylistAliasDtoArr = {shortVideoAddToPlaylistPlaylistAliasDto};
        $VALUES = shortVideoAddToPlaylistPlaylistAliasDtoArr;
        $ENTRIES = new asp(shortVideoAddToPlaylistPlaylistAliasDtoArr);
        CREATOR = new a();
    }

    private ShortVideoAddToPlaylistPlaylistAliasDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoAddToPlaylistPlaylistAliasDto valueOf(String str) {
        return (ShortVideoAddToPlaylistPlaylistAliasDto) Enum.valueOf(ShortVideoAddToPlaylistPlaylistAliasDto.class, str);
    }

    public static ShortVideoAddToPlaylistPlaylistAliasDto[] values() {
        return (ShortVideoAddToPlaylistPlaylistAliasDto[]) $VALUES.clone();
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
