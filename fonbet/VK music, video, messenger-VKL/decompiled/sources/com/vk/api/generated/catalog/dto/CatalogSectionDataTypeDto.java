package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogSectionDataTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogSectionDataTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogSectionDataTypeDto[] $VALUES;
    public static final Parcelable.Creator<CatalogSectionDataTypeDto> CREATOR;

    @pmi0("custom_feed")
    public static final CatalogSectionDataTypeDto CUSTOM_FEED;

    @pmi0("favorites")
    public static final CatalogSectionDataTypeDto FAVORITES;

    @pmi0("inline_groups")
    public static final CatalogSectionDataTypeDto INLINE_GROUPS;

    @pmi0("videos")
    public static final CatalogSectionDataTypeDto VIDEOS;

    @pmi0("wall")
    public static final CatalogSectionDataTypeDto WALL;
    private final String value;

    /* compiled from: CatalogSectionDataTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionDataTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionDataTypeDto createFromParcel(Parcel parcel) {
            return CatalogSectionDataTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionDataTypeDto[] newArray(int i) {
            return new CatalogSectionDataTypeDto[i];
        }
    }

    static {
        CatalogSectionDataTypeDto catalogSectionDataTypeDto = new CatalogSectionDataTypeDto("CUSTOM_FEED", 0, "custom_feed");
        CUSTOM_FEED = catalogSectionDataTypeDto;
        CatalogSectionDataTypeDto catalogSectionDataTypeDto2 = new CatalogSectionDataTypeDto("FAVORITES", 1, "favorites");
        FAVORITES = catalogSectionDataTypeDto2;
        CatalogSectionDataTypeDto catalogSectionDataTypeDto3 = new CatalogSectionDataTypeDto("INLINE_GROUPS", 2, "inline_groups");
        INLINE_GROUPS = catalogSectionDataTypeDto3;
        CatalogSectionDataTypeDto catalogSectionDataTypeDto4 = new CatalogSectionDataTypeDto("WALL", 3, "wall");
        WALL = catalogSectionDataTypeDto4;
        CatalogSectionDataTypeDto catalogSectionDataTypeDto5 = new CatalogSectionDataTypeDto("VIDEOS", 4, "videos");
        VIDEOS = catalogSectionDataTypeDto5;
        CatalogSectionDataTypeDto[] catalogSectionDataTypeDtoArr = {catalogSectionDataTypeDto, catalogSectionDataTypeDto2, catalogSectionDataTypeDto3, catalogSectionDataTypeDto4, catalogSectionDataTypeDto5};
        $VALUES = catalogSectionDataTypeDtoArr;
        $ENTRIES = new asp(catalogSectionDataTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogSectionDataTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogSectionDataTypeDto valueOf(String str) {
        return (CatalogSectionDataTypeDto) Enum.valueOf(CatalogSectionDataTypeDto.class, str);
    }

    public static CatalogSectionDataTypeDto[] values() {
        return (CatalogSectionDataTypeDto[]) $VALUES.clone();
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
