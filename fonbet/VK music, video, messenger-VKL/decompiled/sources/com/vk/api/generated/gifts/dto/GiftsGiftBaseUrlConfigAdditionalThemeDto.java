package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftsGiftBaseUrlConfigAdditionalThemeDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftBaseUrlConfigAdditionalThemeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftsGiftBaseUrlConfigAdditionalThemeDto[] $VALUES;
    public static final Parcelable.Creator<GiftsGiftBaseUrlConfigAdditionalThemeDto> CREATOR;

    @pmi0("dark")
    public static final GiftsGiftBaseUrlConfigAdditionalThemeDto DARK;
    private final String value;

    /* compiled from: GiftsGiftBaseUrlConfigAdditionalThemeDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftBaseUrlConfigAdditionalThemeDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftBaseUrlConfigAdditionalThemeDto createFromParcel(Parcel parcel) {
            return GiftsGiftBaseUrlConfigAdditionalThemeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftBaseUrlConfigAdditionalThemeDto[] newArray(int i) {
            return new GiftsGiftBaseUrlConfigAdditionalThemeDto[i];
        }
    }

    static {
        GiftsGiftBaseUrlConfigAdditionalThemeDto giftsGiftBaseUrlConfigAdditionalThemeDto = new GiftsGiftBaseUrlConfigAdditionalThemeDto("DARK", 0, "dark");
        DARK = giftsGiftBaseUrlConfigAdditionalThemeDto;
        GiftsGiftBaseUrlConfigAdditionalThemeDto[] giftsGiftBaseUrlConfigAdditionalThemeDtoArr = {giftsGiftBaseUrlConfigAdditionalThemeDto};
        $VALUES = giftsGiftBaseUrlConfigAdditionalThemeDtoArr;
        $ENTRIES = new asp(giftsGiftBaseUrlConfigAdditionalThemeDtoArr);
        CREATOR = new a();
    }

    private GiftsGiftBaseUrlConfigAdditionalThemeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GiftsGiftBaseUrlConfigAdditionalThemeDto valueOf(String str) {
        return (GiftsGiftBaseUrlConfigAdditionalThemeDto) Enum.valueOf(GiftsGiftBaseUrlConfigAdditionalThemeDto.class, str);
    }

    public static GiftsGiftBaseUrlConfigAdditionalThemeDto[] values() {
        return (GiftsGiftBaseUrlConfigAdditionalThemeDto[]) $VALUES.clone();
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
