package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetClassifiedsSortOptionIdDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetClassifiedsSortOptionIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetClassifiedsSortOptionIdDto[] $VALUES;

    @pmi0("classifieds.date.desc")
    public static final CatalogGetClassifiedsSortOptionIdDto CLASSIFIEDS_DATE_DESC;

    @pmi0("classifieds.default.desc")
    public static final CatalogGetClassifiedsSortOptionIdDto CLASSIFIEDS_DEFAULT_DESC;

    @pmi0("classifieds.distance.asc")
    public static final CatalogGetClassifiedsSortOptionIdDto CLASSIFIEDS_DISTANCE_ASC;

    @pmi0("classifieds.price.asc")
    public static final CatalogGetClassifiedsSortOptionIdDto CLASSIFIEDS_PRICE_ASC;

    @pmi0("classifieds.price.desc")
    public static final CatalogGetClassifiedsSortOptionIdDto CLASSIFIEDS_PRICE_DESC;
    public static final Parcelable.Creator<CatalogGetClassifiedsSortOptionIdDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final CatalogGetClassifiedsSortOptionIdDto DEFAULT;

    @pmi0("market.date.desc")
    public static final CatalogGetClassifiedsSortOptionIdDto MARKET_DATE_DESC;

    @pmi0("market.price.asc")
    public static final CatalogGetClassifiedsSortOptionIdDto MARKET_PRICE_ASC;

    @pmi0("market.price.desc")
    public static final CatalogGetClassifiedsSortOptionIdDto MARKET_PRICE_DESC;

    @pmi0("market.rating.desc")
    public static final CatalogGetClassifiedsSortOptionIdDto MARKET_RATING_DESC;

    @pmi0("market.relevance.desc")
    public static final CatalogGetClassifiedsSortOptionIdDto MARKET_RELEVANCE_DESC;
    private final String value;

    /* compiled from: CatalogGetClassifiedsSortOptionIdDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetClassifiedsSortOptionIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsSortOptionIdDto createFromParcel(Parcel parcel) {
            return CatalogGetClassifiedsSortOptionIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsSortOptionIdDto[] newArray(int i) {
            return new CatalogGetClassifiedsSortOptionIdDto[i];
        }
    }

    static {
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto = new CatalogGetClassifiedsSortOptionIdDto("CLASSIFIEDS_DATE_DESC", 0, "classifieds.date.desc");
        CLASSIFIEDS_DATE_DESC = catalogGetClassifiedsSortOptionIdDto;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto2 = new CatalogGetClassifiedsSortOptionIdDto("CLASSIFIEDS_DEFAULT_DESC", 1, "classifieds.default.desc");
        CLASSIFIEDS_DEFAULT_DESC = catalogGetClassifiedsSortOptionIdDto2;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto3 = new CatalogGetClassifiedsSortOptionIdDto("CLASSIFIEDS_DISTANCE_ASC", 2, "classifieds.distance.asc");
        CLASSIFIEDS_DISTANCE_ASC = catalogGetClassifiedsSortOptionIdDto3;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto4 = new CatalogGetClassifiedsSortOptionIdDto("CLASSIFIEDS_PRICE_ASC", 3, "classifieds.price.asc");
        CLASSIFIEDS_PRICE_ASC = catalogGetClassifiedsSortOptionIdDto4;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto5 = new CatalogGetClassifiedsSortOptionIdDto("CLASSIFIEDS_PRICE_DESC", 4, "classifieds.price.desc");
        CLASSIFIEDS_PRICE_DESC = catalogGetClassifiedsSortOptionIdDto5;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto6 = new CatalogGetClassifiedsSortOptionIdDto("DEFAULT", 5, BuildConfig.FLAVOR);
        DEFAULT = catalogGetClassifiedsSortOptionIdDto6;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto7 = new CatalogGetClassifiedsSortOptionIdDto("MARKET_DATE_DESC", 6, "market.date.desc");
        MARKET_DATE_DESC = catalogGetClassifiedsSortOptionIdDto7;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto8 = new CatalogGetClassifiedsSortOptionIdDto("MARKET_PRICE_ASC", 7, "market.price.asc");
        MARKET_PRICE_ASC = catalogGetClassifiedsSortOptionIdDto8;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto9 = new CatalogGetClassifiedsSortOptionIdDto("MARKET_PRICE_DESC", 8, "market.price.desc");
        MARKET_PRICE_DESC = catalogGetClassifiedsSortOptionIdDto9;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto10 = new CatalogGetClassifiedsSortOptionIdDto("MARKET_RATING_DESC", 9, "market.rating.desc");
        MARKET_RATING_DESC = catalogGetClassifiedsSortOptionIdDto10;
        CatalogGetClassifiedsSortOptionIdDto catalogGetClassifiedsSortOptionIdDto11 = new CatalogGetClassifiedsSortOptionIdDto("MARKET_RELEVANCE_DESC", 10, "market.relevance.desc");
        MARKET_RELEVANCE_DESC = catalogGetClassifiedsSortOptionIdDto11;
        CatalogGetClassifiedsSortOptionIdDto[] catalogGetClassifiedsSortOptionIdDtoArr = {catalogGetClassifiedsSortOptionIdDto, catalogGetClassifiedsSortOptionIdDto2, catalogGetClassifiedsSortOptionIdDto3, catalogGetClassifiedsSortOptionIdDto4, catalogGetClassifiedsSortOptionIdDto5, catalogGetClassifiedsSortOptionIdDto6, catalogGetClassifiedsSortOptionIdDto7, catalogGetClassifiedsSortOptionIdDto8, catalogGetClassifiedsSortOptionIdDto9, catalogGetClassifiedsSortOptionIdDto10, catalogGetClassifiedsSortOptionIdDto11};
        $VALUES = catalogGetClassifiedsSortOptionIdDtoArr;
        $ENTRIES = new asp(catalogGetClassifiedsSortOptionIdDtoArr);
        CREATOR = new a();
    }

    private CatalogGetClassifiedsSortOptionIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetClassifiedsSortOptionIdDto valueOf(String str) {
        return (CatalogGetClassifiedsSortOptionIdDto) Enum.valueOf(CatalogGetClassifiedsSortOptionIdDto.class, str);
    }

    public static CatalogGetClassifiedsSortOptionIdDto[] values() {
        return (CatalogGetClassifiedsSortOptionIdDto[]) $VALUES.clone();
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
