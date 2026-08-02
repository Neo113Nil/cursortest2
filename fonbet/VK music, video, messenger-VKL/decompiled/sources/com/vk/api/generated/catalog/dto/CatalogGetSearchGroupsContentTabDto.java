package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchGroupsContentTabDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchGroupsContentTabDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchGroupsContentTabDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchGroupsContentTabDto> CREATOR;

    @pmi0("market")
    public static final CatalogGetSearchGroupsContentTabDto MARKET;

    @pmi0("photos")
    public static final CatalogGetSearchGroupsContentTabDto PHOTOS;

    @pmi0("short_videos")
    public static final CatalogGetSearchGroupsContentTabDto SHORT_VIDEOS;

    @pmi0("videos")
    public static final CatalogGetSearchGroupsContentTabDto VIDEOS;

    @pmi0("wall")
    public static final CatalogGetSearchGroupsContentTabDto WALL;
    private final String value;

    /* compiled from: CatalogGetSearchGroupsContentTabDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchGroupsContentTabDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsContentTabDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchGroupsContentTabDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsContentTabDto[] newArray(int i) {
            return new CatalogGetSearchGroupsContentTabDto[i];
        }
    }

    static {
        CatalogGetSearchGroupsContentTabDto catalogGetSearchGroupsContentTabDto = new CatalogGetSearchGroupsContentTabDto("MARKET", 0, "market");
        MARKET = catalogGetSearchGroupsContentTabDto;
        CatalogGetSearchGroupsContentTabDto catalogGetSearchGroupsContentTabDto2 = new CatalogGetSearchGroupsContentTabDto("PHOTOS", 1, "photos");
        PHOTOS = catalogGetSearchGroupsContentTabDto2;
        CatalogGetSearchGroupsContentTabDto catalogGetSearchGroupsContentTabDto3 = new CatalogGetSearchGroupsContentTabDto("SHORT_VIDEOS", 2, "short_videos");
        SHORT_VIDEOS = catalogGetSearchGroupsContentTabDto3;
        CatalogGetSearchGroupsContentTabDto catalogGetSearchGroupsContentTabDto4 = new CatalogGetSearchGroupsContentTabDto("VIDEOS", 3, "videos");
        VIDEOS = catalogGetSearchGroupsContentTabDto4;
        CatalogGetSearchGroupsContentTabDto catalogGetSearchGroupsContentTabDto5 = new CatalogGetSearchGroupsContentTabDto("WALL", 4, "wall");
        WALL = catalogGetSearchGroupsContentTabDto5;
        CatalogGetSearchGroupsContentTabDto[] catalogGetSearchGroupsContentTabDtoArr = {catalogGetSearchGroupsContentTabDto, catalogGetSearchGroupsContentTabDto2, catalogGetSearchGroupsContentTabDto3, catalogGetSearchGroupsContentTabDto4, catalogGetSearchGroupsContentTabDto5};
        $VALUES = catalogGetSearchGroupsContentTabDtoArr;
        $ENTRIES = new asp(catalogGetSearchGroupsContentTabDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchGroupsContentTabDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchGroupsContentTabDto valueOf(String str) {
        return (CatalogGetSearchGroupsContentTabDto) Enum.valueOf(CatalogGetSearchGroupsContentTabDto.class, str);
    }

    public static CatalogGetSearchGroupsContentTabDto[] values() {
        return (CatalogGetSearchGroupsContentTabDto[]) $VALUES.clone();
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
