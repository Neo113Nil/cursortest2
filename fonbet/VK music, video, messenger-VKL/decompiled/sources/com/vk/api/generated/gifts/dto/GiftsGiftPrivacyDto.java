package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftsGiftPrivacyDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftsGiftPrivacyDto[] $VALUES;
    public static final Parcelable.Creator<GiftsGiftPrivacyDto> CREATOR;

    @pmi0("0")
    public static final GiftsGiftPrivacyDto NAME_AND_MESSAGE_FOR_ALL;

    @pmi0("2")
    public static final GiftsGiftPrivacyDto NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY;

    @pmi0("1")
    public static final GiftsGiftPrivacyDto NAME_FOR_ALL;
    private final int value;

    /* compiled from: GiftsGiftPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftPrivacyDto createFromParcel(Parcel parcel) {
            return GiftsGiftPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftPrivacyDto[] newArray(int i) {
            return new GiftsGiftPrivacyDto[i];
        }
    }

    static {
        GiftsGiftPrivacyDto giftsGiftPrivacyDto = new GiftsGiftPrivacyDto("NAME_AND_MESSAGE_FOR_ALL", 0, 0);
        NAME_AND_MESSAGE_FOR_ALL = giftsGiftPrivacyDto;
        GiftsGiftPrivacyDto giftsGiftPrivacyDto2 = new GiftsGiftPrivacyDto("NAME_FOR_ALL", 1, 1);
        NAME_FOR_ALL = giftsGiftPrivacyDto2;
        GiftsGiftPrivacyDto giftsGiftPrivacyDto3 = new GiftsGiftPrivacyDto("NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY", 2, 2);
        NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY = giftsGiftPrivacyDto3;
        GiftsGiftPrivacyDto[] giftsGiftPrivacyDtoArr = {giftsGiftPrivacyDto, giftsGiftPrivacyDto2, giftsGiftPrivacyDto3};
        $VALUES = giftsGiftPrivacyDtoArr;
        $ENTRIES = new asp(giftsGiftPrivacyDtoArr);
        CREATOR = new a();
    }

    private GiftsGiftPrivacyDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GiftsGiftPrivacyDto valueOf(String str) {
        return (GiftsGiftPrivacyDto) Enum.valueOf(GiftsGiftPrivacyDto.class, str);
    }

    public static GiftsGiftPrivacyDto[] values() {
        return (GiftsGiftPrivacyDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
