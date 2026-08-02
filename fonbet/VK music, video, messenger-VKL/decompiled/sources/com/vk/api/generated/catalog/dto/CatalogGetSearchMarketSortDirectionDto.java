package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchMarketSortDirectionDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchMarketSortDirectionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchMarketSortDirectionDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchMarketSortDirectionDto> CREATOR;

    @pmi0("0")
    public static final CatalogGetSearchMarketSortDirectionDto TYPE_0;

    @pmi0("1")
    public static final CatalogGetSearchMarketSortDirectionDto TYPE_1;
    private final int value;

    /* compiled from: CatalogGetSearchMarketSortDirectionDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchMarketSortDirectionDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketSortDirectionDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchMarketSortDirectionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketSortDirectionDto[] newArray(int i) {
            return new CatalogGetSearchMarketSortDirectionDto[i];
        }
    }

    static {
        CatalogGetSearchMarketSortDirectionDto catalogGetSearchMarketSortDirectionDto = new CatalogGetSearchMarketSortDirectionDto("TYPE_0", 0, 0);
        TYPE_0 = catalogGetSearchMarketSortDirectionDto;
        CatalogGetSearchMarketSortDirectionDto catalogGetSearchMarketSortDirectionDto2 = new CatalogGetSearchMarketSortDirectionDto("TYPE_1", 1, 1);
        TYPE_1 = catalogGetSearchMarketSortDirectionDto2;
        CatalogGetSearchMarketSortDirectionDto[] catalogGetSearchMarketSortDirectionDtoArr = {catalogGetSearchMarketSortDirectionDto, catalogGetSearchMarketSortDirectionDto2};
        $VALUES = catalogGetSearchMarketSortDirectionDtoArr;
        $ENTRIES = new asp(catalogGetSearchMarketSortDirectionDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchMarketSortDirectionDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static CatalogGetSearchMarketSortDirectionDto valueOf(String str) {
        return (CatalogGetSearchMarketSortDirectionDto) Enum.valueOf(CatalogGetSearchMarketSortDirectionDto.class, str);
    }

    public static CatalogGetSearchMarketSortDirectionDto[] values() {
        return (CatalogGetSearchMarketSortDirectionDto[]) $VALUES.clone();
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
