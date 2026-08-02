package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadListTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadListTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadListTypeDto[] $VALUES;

    @pmi0("categories_vertical_list")
    public static final AppsMiniappsCatalogItemPayloadListTypeDto CATEGORIES_VERTICAL_LIST;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadListTypeDto> CREATOR;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadListTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadListTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadListTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadListTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadListTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadListTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadListTypeDto appsMiniappsCatalogItemPayloadListTypeDto = new AppsMiniappsCatalogItemPayloadListTypeDto("CATEGORIES_VERTICAL_LIST", 0, "categories_vertical_list");
        CATEGORIES_VERTICAL_LIST = appsMiniappsCatalogItemPayloadListTypeDto;
        AppsMiniappsCatalogItemPayloadListTypeDto[] appsMiniappsCatalogItemPayloadListTypeDtoArr = {appsMiniappsCatalogItemPayloadListTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadListTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadListTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadListTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadListTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadListTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadListTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadListTypeDto[]) $VALUES.clone();
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
