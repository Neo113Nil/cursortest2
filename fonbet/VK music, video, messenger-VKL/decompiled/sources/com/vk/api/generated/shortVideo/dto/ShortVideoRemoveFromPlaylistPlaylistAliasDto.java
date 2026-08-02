package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoRemoveFromPlaylistPlaylistAliasDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoRemoveFromPlaylistPlaylistAliasDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoRemoveFromPlaylistPlaylistAliasDto[] $VALUES;
    public static final Parcelable.Creator<ShortVideoRemoveFromPlaylistPlaylistAliasDto> CREATOR;

    @pmi0("favorite")
    public static final ShortVideoRemoveFromPlaylistPlaylistAliasDto FAVORITE;
    private final String value;

    /* compiled from: ShortVideoRemoveFromPlaylistPlaylistAliasDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoRemoveFromPlaylistPlaylistAliasDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoRemoveFromPlaylistPlaylistAliasDto createFromParcel(Parcel parcel) {
            return ShortVideoRemoveFromPlaylistPlaylistAliasDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoRemoveFromPlaylistPlaylistAliasDto[] newArray(int i) {
            return new ShortVideoRemoveFromPlaylistPlaylistAliasDto[i];
        }
    }

    static {
        ShortVideoRemoveFromPlaylistPlaylistAliasDto shortVideoRemoveFromPlaylistPlaylistAliasDto = new ShortVideoRemoveFromPlaylistPlaylistAliasDto("FAVORITE", 0, "favorite");
        FAVORITE = shortVideoRemoveFromPlaylistPlaylistAliasDto;
        ShortVideoRemoveFromPlaylistPlaylistAliasDto[] shortVideoRemoveFromPlaylistPlaylistAliasDtoArr = {shortVideoRemoveFromPlaylistPlaylistAliasDto};
        $VALUES = shortVideoRemoveFromPlaylistPlaylistAliasDtoArr;
        $ENTRIES = new asp(shortVideoRemoveFromPlaylistPlaylistAliasDtoArr);
        CREATOR = new a();
    }

    private ShortVideoRemoveFromPlaylistPlaylistAliasDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoRemoveFromPlaylistPlaylistAliasDto valueOf(String str) {
        return (ShortVideoRemoveFromPlaylistPlaylistAliasDto) Enum.valueOf(ShortVideoRemoveFromPlaylistPlaylistAliasDto.class, str);
    }

    public static ShortVideoRemoveFromPlaylistPlaylistAliasDto[] values() {
        return (ShortVideoRemoveFromPlaylistPlaylistAliasDto[]) $VALUES.clone();
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
