package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto[] $VALUES;

    @pmi0("categories_horizontal_list")
    public static final AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto CATEGORIES_HORIZONTAL_LIST;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto> CREATOR;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto = new AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto("CATEGORIES_HORIZONTAL_LIST", 0, "categories_horizontal_list");
        CATEGORIES_HORIZONTAL_LIST = appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto;
        AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto[] appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDtoArr = {appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadCategoriesHorizontalListTypeDto[]) $VALUES.clone();
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
