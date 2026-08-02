package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadAppsTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadAppsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadAppsTypeDto[] $VALUES;

    @pmi0("apps_cards_grid")
    public static final AppsMiniappsCatalogItemPayloadAppsTypeDto APPS_CARDS_GRID;

    @pmi0("apps_cards_vertical_list")
    public static final AppsMiniappsCatalogItemPayloadAppsTypeDto APPS_CARDS_VERTICAL_LIST;

    @pmi0("apps_horizontal_cell_list")
    public static final AppsMiniappsCatalogItemPayloadAppsTypeDto APPS_HORIZONTAL_CELL_LIST;

    @pmi0("apps_horizontal_compact_list")
    public static final AppsMiniappsCatalogItemPayloadAppsTypeDto APPS_HORIZONTAL_COMPACT_LIST;

    @pmi0("apps_horizontal_list")
    public static final AppsMiniappsCatalogItemPayloadAppsTypeDto APPS_HORIZONTAL_LIST;

    @pmi0("community_apps_cards_grid")
    public static final AppsMiniappsCatalogItemPayloadAppsTypeDto COMMUNITY_APPS_CARDS_GRID;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsTypeDto> CREATOR;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadAppsTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadAppsTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadAppsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadAppsTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadAppsTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto = new AppsMiniappsCatalogItemPayloadAppsTypeDto("APPS_HORIZONTAL_LIST", 0, "apps_horizontal_list");
        APPS_HORIZONTAL_LIST = appsMiniappsCatalogItemPayloadAppsTypeDto;
        AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto2 = new AppsMiniappsCatalogItemPayloadAppsTypeDto("APPS_HORIZONTAL_COMPACT_LIST", 1, "apps_horizontal_compact_list");
        APPS_HORIZONTAL_COMPACT_LIST = appsMiniappsCatalogItemPayloadAppsTypeDto2;
        AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto3 = new AppsMiniappsCatalogItemPayloadAppsTypeDto("APPS_HORIZONTAL_CELL_LIST", 2, "apps_horizontal_cell_list");
        APPS_HORIZONTAL_CELL_LIST = appsMiniappsCatalogItemPayloadAppsTypeDto3;
        AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto4 = new AppsMiniappsCatalogItemPayloadAppsTypeDto("COMMUNITY_APPS_CARDS_GRID", 3, "community_apps_cards_grid");
        COMMUNITY_APPS_CARDS_GRID = appsMiniappsCatalogItemPayloadAppsTypeDto4;
        AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto5 = new AppsMiniappsCatalogItemPayloadAppsTypeDto("APPS_CARDS_GRID", 4, "apps_cards_grid");
        APPS_CARDS_GRID = appsMiniappsCatalogItemPayloadAppsTypeDto5;
        AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto6 = new AppsMiniappsCatalogItemPayloadAppsTypeDto("APPS_CARDS_VERTICAL_LIST", 5, "apps_cards_vertical_list");
        APPS_CARDS_VERTICAL_LIST = appsMiniappsCatalogItemPayloadAppsTypeDto6;
        AppsMiniappsCatalogItemPayloadAppsTypeDto[] appsMiniappsCatalogItemPayloadAppsTypeDtoArr = {appsMiniappsCatalogItemPayloadAppsTypeDto, appsMiniappsCatalogItemPayloadAppsTypeDto2, appsMiniappsCatalogItemPayloadAppsTypeDto3, appsMiniappsCatalogItemPayloadAppsTypeDto4, appsMiniappsCatalogItemPayloadAppsTypeDto5, appsMiniappsCatalogItemPayloadAppsTypeDto6};
        $VALUES = appsMiniappsCatalogItemPayloadAppsTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadAppsTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadAppsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadAppsTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadAppsTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadAppsTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadAppsTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadAppsTypeDto[]) $VALUES.clone();
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
