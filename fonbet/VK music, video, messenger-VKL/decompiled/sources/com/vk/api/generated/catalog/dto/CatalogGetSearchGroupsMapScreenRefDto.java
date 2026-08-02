package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchGroupsMapScreenRefDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchGroupsMapScreenRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchGroupsMapScreenRefDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchGroupsMapScreenRefDto> CREATOR;

    @pmi0("groups_list_search_map")
    public static final CatalogGetSearchGroupsMapScreenRefDto GROUPS_LIST_SEARCH_MAP;

    @pmi0("search_groups_map")
    public static final CatalogGetSearchGroupsMapScreenRefDto SEARCH_GROUPS_MAP;
    private final String value;

    /* compiled from: CatalogGetSearchGroupsMapScreenRefDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchGroupsMapScreenRefDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsMapScreenRefDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchGroupsMapScreenRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsMapScreenRefDto[] newArray(int i) {
            return new CatalogGetSearchGroupsMapScreenRefDto[i];
        }
    }

    static {
        CatalogGetSearchGroupsMapScreenRefDto catalogGetSearchGroupsMapScreenRefDto = new CatalogGetSearchGroupsMapScreenRefDto("GROUPS_LIST_SEARCH_MAP", 0, "groups_list_search_map");
        GROUPS_LIST_SEARCH_MAP = catalogGetSearchGroupsMapScreenRefDto;
        CatalogGetSearchGroupsMapScreenRefDto catalogGetSearchGroupsMapScreenRefDto2 = new CatalogGetSearchGroupsMapScreenRefDto("SEARCH_GROUPS_MAP", 1, "search_groups_map");
        SEARCH_GROUPS_MAP = catalogGetSearchGroupsMapScreenRefDto2;
        CatalogGetSearchGroupsMapScreenRefDto[] catalogGetSearchGroupsMapScreenRefDtoArr = {catalogGetSearchGroupsMapScreenRefDto, catalogGetSearchGroupsMapScreenRefDto2};
        $VALUES = catalogGetSearchGroupsMapScreenRefDtoArr;
        $ENTRIES = new asp(catalogGetSearchGroupsMapScreenRefDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchGroupsMapScreenRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<CatalogGetSearchGroupsMapScreenRefDto> i() {
        return $ENTRIES;
    }

    public static CatalogGetSearchGroupsMapScreenRefDto valueOf(String str) {
        return (CatalogGetSearchGroupsMapScreenRefDto) Enum.valueOf(CatalogGetSearchGroupsMapScreenRefDto.class, str);
    }

    public static CatalogGetSearchGroupsMapScreenRefDto[] values() {
        return (CatalogGetSearchGroupsMapScreenRefDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
