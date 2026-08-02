package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto> CREATOR;

    @pmi0("custom_collection_horizontal_list")
    public static final AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto CUSTOM_COLLECTION_HORIZONTAL_LIST;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto appsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto = new AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto("CUSTOM_COLLECTION_HORIZONTAL_LIST", 0, "custom_collection_horizontal_list");
        CUSTOM_COLLECTION_HORIZONTAL_LIST = appsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto;
        AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto[] appsMiniappsCatalogItemPayloadGamesListWithFooterTypeDtoArr = {appsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadGamesListWithFooterTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadGamesListWithFooterTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadGamesListWithFooterTypeDto[]) $VALUES.clone();
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
