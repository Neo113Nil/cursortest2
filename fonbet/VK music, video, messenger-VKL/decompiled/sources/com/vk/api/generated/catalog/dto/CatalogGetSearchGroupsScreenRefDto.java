package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchGroupsScreenRefDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchGroupsScreenRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchGroupsScreenRefDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchGroupsScreenRefDto> CREATOR;

    @pmi0("friend_groups_list_search")
    public static final CatalogGetSearchGroupsScreenRefDto FRIEND_GROUPS_LIST_SEARCH;

    @pmi0("groups_list_search")
    public static final CatalogGetSearchGroupsScreenRefDto GROUPS_LIST_SEARCH;

    @pmi0("search_groups")
    public static final CatalogGetSearchGroupsScreenRefDto SEARCH_GROUPS;
    private final String value;

    /* compiled from: CatalogGetSearchGroupsScreenRefDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchGroupsScreenRefDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsScreenRefDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchGroupsScreenRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsScreenRefDto[] newArray(int i) {
            return new CatalogGetSearchGroupsScreenRefDto[i];
        }
    }

    static {
        CatalogGetSearchGroupsScreenRefDto catalogGetSearchGroupsScreenRefDto = new CatalogGetSearchGroupsScreenRefDto("FRIEND_GROUPS_LIST_SEARCH", 0, "friend_groups_list_search");
        FRIEND_GROUPS_LIST_SEARCH = catalogGetSearchGroupsScreenRefDto;
        CatalogGetSearchGroupsScreenRefDto catalogGetSearchGroupsScreenRefDto2 = new CatalogGetSearchGroupsScreenRefDto("GROUPS_LIST_SEARCH", 1, "groups_list_search");
        GROUPS_LIST_SEARCH = catalogGetSearchGroupsScreenRefDto2;
        CatalogGetSearchGroupsScreenRefDto catalogGetSearchGroupsScreenRefDto3 = new CatalogGetSearchGroupsScreenRefDto("SEARCH_GROUPS", 2, "search_groups");
        SEARCH_GROUPS = catalogGetSearchGroupsScreenRefDto3;
        CatalogGetSearchGroupsScreenRefDto[] catalogGetSearchGroupsScreenRefDtoArr = {catalogGetSearchGroupsScreenRefDto, catalogGetSearchGroupsScreenRefDto2, catalogGetSearchGroupsScreenRefDto3};
        $VALUES = catalogGetSearchGroupsScreenRefDtoArr;
        $ENTRIES = new asp(catalogGetSearchGroupsScreenRefDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchGroupsScreenRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<CatalogGetSearchGroupsScreenRefDto> i() {
        return $ENTRIES;
    }

    public static CatalogGetSearchGroupsScreenRefDto valueOf(String str) {
        return (CatalogGetSearchGroupsScreenRefDto) Enum.valueOf(CatalogGetSearchGroupsScreenRefDto.class, str);
    }

    public static CatalogGetSearchGroupsScreenRefDto[] values() {
        return (CatalogGetSearchGroupsScreenRefDto[]) $VALUES.clone();
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
