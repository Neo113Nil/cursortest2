package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoShortVideoAdsFlagDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoAdsFlagDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoShortVideoAdsFlagDto[] $VALUES;
    public static final Parcelable.Creator<ShortVideoShortVideoAdsFlagDto> CREATOR;

    @pmi0("1")
    public static final ShortVideoShortVideoAdsFlagDto HIDE_CLOSING_AD_BANNER;

    @pmi0("2")
    public static final ShortVideoShortVideoAdsFlagDto HIDE_FULLSCREEN_AD_BANNER;
    private final int value;

    /* compiled from: ShortVideoShortVideoAdsFlagDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoAdsFlagDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoAdsFlagDto createFromParcel(Parcel parcel) {
            return ShortVideoShortVideoAdsFlagDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoAdsFlagDto[] newArray(int i) {
            return new ShortVideoShortVideoAdsFlagDto[i];
        }
    }

    static {
        ShortVideoShortVideoAdsFlagDto shortVideoShortVideoAdsFlagDto = new ShortVideoShortVideoAdsFlagDto("HIDE_CLOSING_AD_BANNER", 0, 1);
        HIDE_CLOSING_AD_BANNER = shortVideoShortVideoAdsFlagDto;
        ShortVideoShortVideoAdsFlagDto shortVideoShortVideoAdsFlagDto2 = new ShortVideoShortVideoAdsFlagDto("HIDE_FULLSCREEN_AD_BANNER", 1, 2);
        HIDE_FULLSCREEN_AD_BANNER = shortVideoShortVideoAdsFlagDto2;
        ShortVideoShortVideoAdsFlagDto[] shortVideoShortVideoAdsFlagDtoArr = {shortVideoShortVideoAdsFlagDto, shortVideoShortVideoAdsFlagDto2};
        $VALUES = shortVideoShortVideoAdsFlagDtoArr;
        $ENTRIES = new asp(shortVideoShortVideoAdsFlagDtoArr);
        CREATOR = new a();
    }

    private ShortVideoShortVideoAdsFlagDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ShortVideoShortVideoAdsFlagDto valueOf(String str) {
        return (ShortVideoShortVideoAdsFlagDto) Enum.valueOf(ShortVideoShortVideoAdsFlagDto.class, str);
    }

    public static ShortVideoShortVideoAdsFlagDto[] values() {
        return (ShortVideoShortVideoAdsFlagDto[]) $VALUES.clone();
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
