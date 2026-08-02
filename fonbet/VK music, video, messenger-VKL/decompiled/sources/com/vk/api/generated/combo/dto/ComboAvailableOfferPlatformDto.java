package com.vk.api.generated.combo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ComboAvailableOfferPlatformDto.kt */
/* loaded from: classes14.dex */
public final class ComboAvailableOfferPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ComboAvailableOfferPlatformDto[] $VALUES;

    @pmi0("android")
    public static final ComboAvailableOfferPlatformDto ANDROID;
    public static final Parcelable.Creator<ComboAvailableOfferPlatformDto> CREATOR;

    @pmi0("ios")
    public static final ComboAvailableOfferPlatformDto IOS;
    private final String value;

    /* compiled from: ComboAvailableOfferPlatformDto.kt */
    public static final class a implements Parcelable.Creator<ComboAvailableOfferPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final ComboAvailableOfferPlatformDto createFromParcel(Parcel parcel) {
            return ComboAvailableOfferPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ComboAvailableOfferPlatformDto[] newArray(int i) {
            return new ComboAvailableOfferPlatformDto[i];
        }
    }

    static {
        ComboAvailableOfferPlatformDto comboAvailableOfferPlatformDto = new ComboAvailableOfferPlatformDto("ANDROID", 0, "android");
        ANDROID = comboAvailableOfferPlatformDto;
        ComboAvailableOfferPlatformDto comboAvailableOfferPlatformDto2 = new ComboAvailableOfferPlatformDto("IOS", 1, "ios");
        IOS = comboAvailableOfferPlatformDto2;
        ComboAvailableOfferPlatformDto[] comboAvailableOfferPlatformDtoArr = {comboAvailableOfferPlatformDto, comboAvailableOfferPlatformDto2};
        $VALUES = comboAvailableOfferPlatformDtoArr;
        $ENTRIES = new asp(comboAvailableOfferPlatformDtoArr);
        CREATOR = new a();
    }

    private ComboAvailableOfferPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ComboAvailableOfferPlatformDto valueOf(String str) {
        return (ComboAvailableOfferPlatformDto) Enum.valueOf(ComboAvailableOfferPlatformDto.class, str);
    }

    public static ComboAvailableOfferPlatformDto[] values() {
        return (ComboAvailableOfferPlatformDto[]) $VALUES.clone();
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
