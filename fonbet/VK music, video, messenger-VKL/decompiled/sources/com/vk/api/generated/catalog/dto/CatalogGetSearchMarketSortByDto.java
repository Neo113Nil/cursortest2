package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchMarketSortByDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchMarketSortByDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchMarketSortByDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchMarketSortByDto> CREATOR;

    @pmi0("1")
    public static final CatalogGetSearchMarketSortByDto TYPE_1;

    @pmi0("2")
    public static final CatalogGetSearchMarketSortByDto TYPE_2;

    @pmi0("3")
    public static final CatalogGetSearchMarketSortByDto TYPE_3;

    @pmi0(Gc.e)
    public static final CatalogGetSearchMarketSortByDto TYPE_7;
    private final int value;

    /* compiled from: CatalogGetSearchMarketSortByDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchMarketSortByDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketSortByDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchMarketSortByDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketSortByDto[] newArray(int i) {
            return new CatalogGetSearchMarketSortByDto[i];
        }
    }

    static {
        CatalogGetSearchMarketSortByDto catalogGetSearchMarketSortByDto = new CatalogGetSearchMarketSortByDto("TYPE_1", 0, 1);
        TYPE_1 = catalogGetSearchMarketSortByDto;
        CatalogGetSearchMarketSortByDto catalogGetSearchMarketSortByDto2 = new CatalogGetSearchMarketSortByDto("TYPE_2", 1, 2);
        TYPE_2 = catalogGetSearchMarketSortByDto2;
        CatalogGetSearchMarketSortByDto catalogGetSearchMarketSortByDto3 = new CatalogGetSearchMarketSortByDto("TYPE_3", 2, 3);
        TYPE_3 = catalogGetSearchMarketSortByDto3;
        CatalogGetSearchMarketSortByDto catalogGetSearchMarketSortByDto4 = new CatalogGetSearchMarketSortByDto("TYPE_7", 3, 7);
        TYPE_7 = catalogGetSearchMarketSortByDto4;
        CatalogGetSearchMarketSortByDto[] catalogGetSearchMarketSortByDtoArr = {catalogGetSearchMarketSortByDto, catalogGetSearchMarketSortByDto2, catalogGetSearchMarketSortByDto3, catalogGetSearchMarketSortByDto4};
        $VALUES = catalogGetSearchMarketSortByDtoArr;
        $ENTRIES = new asp(catalogGetSearchMarketSortByDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchMarketSortByDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static CatalogGetSearchMarketSortByDto valueOf(String str) {
        return (CatalogGetSearchMarketSortByDto) Enum.valueOf(CatalogGetSearchMarketSortByDto.class, str);
    }

    public static CatalogGetSearchMarketSortByDto[] values() {
        return (CatalogGetSearchMarketSortByDto[]) $VALUES.clone();
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
