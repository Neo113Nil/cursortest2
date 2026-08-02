package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoAlbumSortAlbumDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoAlbumSortAlbumDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoAlbumSortAlbumDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetVideoAlbumSortAlbumDto> CREATOR;

    @pmi0("0")
    public static final CatalogGetVideoAlbumSortAlbumDto TYPE_0;

    @pmi0("1")
    public static final CatalogGetVideoAlbumSortAlbumDto TYPE_1;
    private final int value;

    /* compiled from: CatalogGetVideoAlbumSortAlbumDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoAlbumSortAlbumDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoAlbumSortAlbumDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoAlbumSortAlbumDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoAlbumSortAlbumDto[] newArray(int i) {
            return new CatalogGetVideoAlbumSortAlbumDto[i];
        }
    }

    static {
        CatalogGetVideoAlbumSortAlbumDto catalogGetVideoAlbumSortAlbumDto = new CatalogGetVideoAlbumSortAlbumDto("TYPE_0", 0, 0);
        TYPE_0 = catalogGetVideoAlbumSortAlbumDto;
        CatalogGetVideoAlbumSortAlbumDto catalogGetVideoAlbumSortAlbumDto2 = new CatalogGetVideoAlbumSortAlbumDto("TYPE_1", 1, 1);
        TYPE_1 = catalogGetVideoAlbumSortAlbumDto2;
        CatalogGetVideoAlbumSortAlbumDto[] catalogGetVideoAlbumSortAlbumDtoArr = {catalogGetVideoAlbumSortAlbumDto, catalogGetVideoAlbumSortAlbumDto2};
        $VALUES = catalogGetVideoAlbumSortAlbumDtoArr;
        $ENTRIES = new asp(catalogGetVideoAlbumSortAlbumDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoAlbumSortAlbumDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static CatalogGetVideoAlbumSortAlbumDto valueOf(String str) {
        return (CatalogGetVideoAlbumSortAlbumDto) Enum.valueOf(CatalogGetVideoAlbumSortAlbumDto.class, str);
    }

    public static CatalogGetVideoAlbumSortAlbumDto[] values() {
        return (CatalogGetVideoAlbumSortAlbumDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
