package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadCardsTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadCardsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadCardsTypeDto[] $VALUES;

    @pmi0("app_cards_horizontal_list")
    public static final AppsMiniappsCatalogItemPayloadCardsTypeDto APP_CARDS_HORIZONTAL_LIST;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardsTypeDto> CREATOR;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadCardsTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCardsTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadCardsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCardsTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadCardsTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadCardsTypeDto appsMiniappsCatalogItemPayloadCardsTypeDto = new AppsMiniappsCatalogItemPayloadCardsTypeDto("APP_CARDS_HORIZONTAL_LIST", 0, "app_cards_horizontal_list");
        APP_CARDS_HORIZONTAL_LIST = appsMiniappsCatalogItemPayloadCardsTypeDto;
        AppsMiniappsCatalogItemPayloadCardsTypeDto[] appsMiniappsCatalogItemPayloadCardsTypeDtoArr = {appsMiniappsCatalogItemPayloadCardsTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadCardsTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadCardsTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadCardsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadCardsTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadCardsTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadCardsTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadCardsTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadCardsTypeDto[]) $VALUES.clone();
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
