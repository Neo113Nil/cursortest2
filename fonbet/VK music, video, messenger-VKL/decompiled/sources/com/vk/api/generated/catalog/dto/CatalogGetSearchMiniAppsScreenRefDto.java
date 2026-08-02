package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchMiniAppsScreenRefDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchMiniAppsScreenRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchMiniAppsScreenRefDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchMiniAppsScreenRefDto> CREATOR;

    @pmi0("search_mini_apps")
    public static final CatalogGetSearchMiniAppsScreenRefDto SEARCH_MINI_APPS;

    @pmi0("search_mini_apps_service")
    public static final CatalogGetSearchMiniAppsScreenRefDto SEARCH_MINI_APPS_SERVICE;
    private final String value;

    /* compiled from: CatalogGetSearchMiniAppsScreenRefDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchMiniAppsScreenRefDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMiniAppsScreenRefDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchMiniAppsScreenRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMiniAppsScreenRefDto[] newArray(int i) {
            return new CatalogGetSearchMiniAppsScreenRefDto[i];
        }
    }

    static {
        CatalogGetSearchMiniAppsScreenRefDto catalogGetSearchMiniAppsScreenRefDto = new CatalogGetSearchMiniAppsScreenRefDto("SEARCH_MINI_APPS", 0, "search_mini_apps");
        SEARCH_MINI_APPS = catalogGetSearchMiniAppsScreenRefDto;
        CatalogGetSearchMiniAppsScreenRefDto catalogGetSearchMiniAppsScreenRefDto2 = new CatalogGetSearchMiniAppsScreenRefDto("SEARCH_MINI_APPS_SERVICE", 1, "search_mini_apps_service");
        SEARCH_MINI_APPS_SERVICE = catalogGetSearchMiniAppsScreenRefDto2;
        CatalogGetSearchMiniAppsScreenRefDto[] catalogGetSearchMiniAppsScreenRefDtoArr = {catalogGetSearchMiniAppsScreenRefDto, catalogGetSearchMiniAppsScreenRefDto2};
        $VALUES = catalogGetSearchMiniAppsScreenRefDtoArr;
        $ENTRIES = new asp(catalogGetSearchMiniAppsScreenRefDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchMiniAppsScreenRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchMiniAppsScreenRefDto valueOf(String str) {
        return (CatalogGetSearchMiniAppsScreenRefDto) Enum.valueOf(CatalogGetSearchMiniAppsScreenRefDto.class, str);
    }

    public static CatalogGetSearchMiniAppsScreenRefDto[] values() {
        return (CatalogGetSearchMiniAppsScreenRefDto[]) $VALUES.clone();
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
