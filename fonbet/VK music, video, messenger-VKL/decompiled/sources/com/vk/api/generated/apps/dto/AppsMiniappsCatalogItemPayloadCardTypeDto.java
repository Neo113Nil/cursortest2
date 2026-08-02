package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadCardTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadCardTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadCardTypeDto[] $VALUES;

    @pmi0("app_card")
    public static final AppsMiniappsCatalogItemPayloadCardTypeDto APP_CARD;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardTypeDto> CREATOR;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadCardTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCardTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadCardTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCardTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadCardTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadCardTypeDto appsMiniappsCatalogItemPayloadCardTypeDto = new AppsMiniappsCatalogItemPayloadCardTypeDto("APP_CARD", 0, "app_card");
        APP_CARD = appsMiniappsCatalogItemPayloadCardTypeDto;
        AppsMiniappsCatalogItemPayloadCardTypeDto[] appsMiniappsCatalogItemPayloadCardTypeDtoArr = {appsMiniappsCatalogItemPayloadCardTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadCardTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadCardTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadCardTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadCardTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadCardTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadCardTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadCardTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadCardTypeDto[]) $VALUES.clone();
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
