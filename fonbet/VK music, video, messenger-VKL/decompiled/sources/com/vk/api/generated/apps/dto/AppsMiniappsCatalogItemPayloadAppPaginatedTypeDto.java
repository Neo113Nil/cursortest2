package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto[] $VALUES;

    @pmi0("apps_paginated")
    public static final AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto APPS_PAGINATED;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto> CREATOR;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto appsMiniappsCatalogItemPayloadAppPaginatedTypeDto = new AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto("APPS_PAGINATED", 0, "apps_paginated");
        APPS_PAGINATED = appsMiniappsCatalogItemPayloadAppPaginatedTypeDto;
        AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto[] appsMiniappsCatalogItemPayloadAppPaginatedTypeDtoArr = {appsMiniappsCatalogItemPayloadAppPaginatedTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadAppPaginatedTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadAppPaginatedTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadAppPaginatedTypeDto[]) $VALUES.clone();
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
