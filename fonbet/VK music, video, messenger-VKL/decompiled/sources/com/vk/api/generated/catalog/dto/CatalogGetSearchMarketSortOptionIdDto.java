package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchMarketSortOptionIdDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchMarketSortOptionIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchMarketSortOptionIdDto[] $VALUES;

    @pmi0("classifieds.date.desc")
    public static final CatalogGetSearchMarketSortOptionIdDto CLASSIFIEDS_DATE_DESC;

    @pmi0("classifieds.default.desc")
    public static final CatalogGetSearchMarketSortOptionIdDto CLASSIFIEDS_DEFAULT_DESC;

    @pmi0("classifieds.distance.asc")
    public static final CatalogGetSearchMarketSortOptionIdDto CLASSIFIEDS_DISTANCE_ASC;

    @pmi0("classifieds.price.asc")
    public static final CatalogGetSearchMarketSortOptionIdDto CLASSIFIEDS_PRICE_ASC;

    @pmi0("classifieds.price.desc")
    public static final CatalogGetSearchMarketSortOptionIdDto CLASSIFIEDS_PRICE_DESC;
    public static final Parcelable.Creator<CatalogGetSearchMarketSortOptionIdDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final CatalogGetSearchMarketSortOptionIdDto DEFAULT;

    @pmi0("market.date.desc")
    public static final CatalogGetSearchMarketSortOptionIdDto MARKET_DATE_DESC;

    @pmi0("market.price.asc")
    public static final CatalogGetSearchMarketSortOptionIdDto MARKET_PRICE_ASC;

    @pmi0("market.price.desc")
    public static final CatalogGetSearchMarketSortOptionIdDto MARKET_PRICE_DESC;

    @pmi0("market.rating.desc")
    public static final CatalogGetSearchMarketSortOptionIdDto MARKET_RATING_DESC;

    @pmi0("market.relevance.desc")
    public static final CatalogGetSearchMarketSortOptionIdDto MARKET_RELEVANCE_DESC;
    private final String value;

    /* compiled from: CatalogGetSearchMarketSortOptionIdDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchMarketSortOptionIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketSortOptionIdDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchMarketSortOptionIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchMarketSortOptionIdDto[] newArray(int i) {
            return new CatalogGetSearchMarketSortOptionIdDto[i];
        }
    }

    static {
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto = new CatalogGetSearchMarketSortOptionIdDto("CLASSIFIEDS_DATE_DESC", 0, "classifieds.date.desc");
        CLASSIFIEDS_DATE_DESC = catalogGetSearchMarketSortOptionIdDto;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto2 = new CatalogGetSearchMarketSortOptionIdDto("CLASSIFIEDS_DEFAULT_DESC", 1, "classifieds.default.desc");
        CLASSIFIEDS_DEFAULT_DESC = catalogGetSearchMarketSortOptionIdDto2;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto3 = new CatalogGetSearchMarketSortOptionIdDto("CLASSIFIEDS_DISTANCE_ASC", 2, "classifieds.distance.asc");
        CLASSIFIEDS_DISTANCE_ASC = catalogGetSearchMarketSortOptionIdDto3;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto4 = new CatalogGetSearchMarketSortOptionIdDto("CLASSIFIEDS_PRICE_ASC", 3, "classifieds.price.asc");
        CLASSIFIEDS_PRICE_ASC = catalogGetSearchMarketSortOptionIdDto4;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto5 = new CatalogGetSearchMarketSortOptionIdDto("CLASSIFIEDS_PRICE_DESC", 4, "classifieds.price.desc");
        CLASSIFIEDS_PRICE_DESC = catalogGetSearchMarketSortOptionIdDto5;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto6 = new CatalogGetSearchMarketSortOptionIdDto("DEFAULT", 5, BuildConfig.FLAVOR);
        DEFAULT = catalogGetSearchMarketSortOptionIdDto6;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto7 = new CatalogGetSearchMarketSortOptionIdDto("MARKET_DATE_DESC", 6, "market.date.desc");
        MARKET_DATE_DESC = catalogGetSearchMarketSortOptionIdDto7;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto8 = new CatalogGetSearchMarketSortOptionIdDto("MARKET_PRICE_ASC", 7, "market.price.asc");
        MARKET_PRICE_ASC = catalogGetSearchMarketSortOptionIdDto8;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto9 = new CatalogGetSearchMarketSortOptionIdDto("MARKET_PRICE_DESC", 8, "market.price.desc");
        MARKET_PRICE_DESC = catalogGetSearchMarketSortOptionIdDto9;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto10 = new CatalogGetSearchMarketSortOptionIdDto("MARKET_RATING_DESC", 9, "market.rating.desc");
        MARKET_RATING_DESC = catalogGetSearchMarketSortOptionIdDto10;
        CatalogGetSearchMarketSortOptionIdDto catalogGetSearchMarketSortOptionIdDto11 = new CatalogGetSearchMarketSortOptionIdDto("MARKET_RELEVANCE_DESC", 10, "market.relevance.desc");
        MARKET_RELEVANCE_DESC = catalogGetSearchMarketSortOptionIdDto11;
        CatalogGetSearchMarketSortOptionIdDto[] catalogGetSearchMarketSortOptionIdDtoArr = {catalogGetSearchMarketSortOptionIdDto, catalogGetSearchMarketSortOptionIdDto2, catalogGetSearchMarketSortOptionIdDto3, catalogGetSearchMarketSortOptionIdDto4, catalogGetSearchMarketSortOptionIdDto5, catalogGetSearchMarketSortOptionIdDto6, catalogGetSearchMarketSortOptionIdDto7, catalogGetSearchMarketSortOptionIdDto8, catalogGetSearchMarketSortOptionIdDto9, catalogGetSearchMarketSortOptionIdDto10, catalogGetSearchMarketSortOptionIdDto11};
        $VALUES = catalogGetSearchMarketSortOptionIdDtoArr;
        $ENTRIES = new asp(catalogGetSearchMarketSortOptionIdDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchMarketSortOptionIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchMarketSortOptionIdDto valueOf(String str) {
        return (CatalogGetSearchMarketSortOptionIdDto) Enum.valueOf(CatalogGetSearchMarketSortOptionIdDto.class, str);
    }

    public static CatalogGetSearchMarketSortOptionIdDto[] values() {
        return (CatalogGetSearchMarketSortOptionIdDto[]) $VALUES.clone();
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
