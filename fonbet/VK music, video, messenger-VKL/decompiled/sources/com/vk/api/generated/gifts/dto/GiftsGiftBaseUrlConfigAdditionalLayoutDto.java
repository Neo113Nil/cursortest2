package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftsGiftBaseUrlConfigAdditionalLayoutDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftBaseUrlConfigAdditionalLayoutDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftsGiftBaseUrlConfigAdditionalLayoutDto[] $VALUES;
    public static final Parcelable.Creator<GiftsGiftBaseUrlConfigAdditionalLayoutDto> CREATOR;

    @pmi0("rectangle")
    public static final GiftsGiftBaseUrlConfigAdditionalLayoutDto RECTANGLE;
    private final String value;

    /* compiled from: GiftsGiftBaseUrlConfigAdditionalLayoutDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftBaseUrlConfigAdditionalLayoutDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftBaseUrlConfigAdditionalLayoutDto createFromParcel(Parcel parcel) {
            return GiftsGiftBaseUrlConfigAdditionalLayoutDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftBaseUrlConfigAdditionalLayoutDto[] newArray(int i) {
            return new GiftsGiftBaseUrlConfigAdditionalLayoutDto[i];
        }
    }

    static {
        GiftsGiftBaseUrlConfigAdditionalLayoutDto giftsGiftBaseUrlConfigAdditionalLayoutDto = new GiftsGiftBaseUrlConfigAdditionalLayoutDto("RECTANGLE", 0, "rectangle");
        RECTANGLE = giftsGiftBaseUrlConfigAdditionalLayoutDto;
        GiftsGiftBaseUrlConfigAdditionalLayoutDto[] giftsGiftBaseUrlConfigAdditionalLayoutDtoArr = {giftsGiftBaseUrlConfigAdditionalLayoutDto};
        $VALUES = giftsGiftBaseUrlConfigAdditionalLayoutDtoArr;
        $ENTRIES = new asp(giftsGiftBaseUrlConfigAdditionalLayoutDtoArr);
        CREATOR = new a();
    }

    private GiftsGiftBaseUrlConfigAdditionalLayoutDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GiftsGiftBaseUrlConfigAdditionalLayoutDto valueOf(String str) {
        return (GiftsGiftBaseUrlConfigAdditionalLayoutDto) Enum.valueOf(GiftsGiftBaseUrlConfigAdditionalLayoutDto.class, str);
    }

    public static GiftsGiftBaseUrlConfigAdditionalLayoutDto[] values() {
        return (GiftsGiftBaseUrlConfigAdditionalLayoutDto[]) $VALUES.clone();
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
