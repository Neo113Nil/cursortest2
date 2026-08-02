package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetStorefrontFieldsDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetStorefrontFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetStorefrontFieldsDto[] $VALUES;

    @pmi0("albums")
    public static final MarketGetStorefrontFieldsDto ALBUMS;

    @pmi0("bookmarks")
    public static final MarketGetStorefrontFieldsDto BOOKMARKS;
    public static final Parcelable.Creator<MarketGetStorefrontFieldsDto> CREATOR;

    @pmi0("filters")
    public static final MarketGetStorefrontFieldsDto FILTERS;

    @pmi0("friends")
    public static final MarketGetStorefrontFieldsDto FRIENDS;

    @pmi0("group")
    public static final MarketGetStorefrontFieldsDto GROUP;

    @pmi0("integration_settings")
    public static final MarketGetStorefrontFieldsDto INTEGRATION_SETTINGS;

    @pmi0("items")
    public static final MarketGetStorefrontFieldsDto ITEMS;

    @pmi0("sorting")
    public static final MarketGetStorefrontFieldsDto SORTING;

    @pmi0("viewed_products")
    public static final MarketGetStorefrontFieldsDto VIEWED_PRODUCTS;
    private final String value;

    /* compiled from: MarketGetStorefrontFieldsDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetStorefrontFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetStorefrontFieldsDto createFromParcel(Parcel parcel) {
            return MarketGetStorefrontFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetStorefrontFieldsDto[] newArray(int i) {
            return new MarketGetStorefrontFieldsDto[i];
        }
    }

    static {
        MarketGetStorefrontFieldsDto marketGetStorefrontFieldsDto = new MarketGetStorefrontFieldsDto("ALBUMS", 0, "albums");
        ALBUMS = marketGetStorefrontFieldsDto;
        MarketGetStorefrontFieldsDto marketGetStorefrontFieldsDto2 = new MarketGetStorefrontFieldsDto("BOOKMARKS", 1, "bookmarks");
        BOOKMARKS = marketGetStorefrontFieldsDto2;
        MarketGetStorefrontFieldsDto marketGetStorefrontFieldsDto3 = new MarketGetStorefrontFieldsDto("FILTERS", 2, "filters");
        FILTERS = marketGetStorefrontFieldsDto3;
        MarketGetStorefrontFieldsDto marketGetStorefrontFieldsDto4 = new MarketGetStorefrontFieldsDto(Privacy.FRIENDS, 3, "friends");
        FRIENDS = marketGetStorefrontFieldsDto4;
        MarketGetStorefrontFieldsDto marketGetStorefrontFieldsDto5 = new MarketGetStorefrontFieldsDto("GROUP", 4, "group");
        GROUP = marketGetStorefrontFieldsDto5;
        MarketGetStorefrontFieldsDto marketGetStorefrontFieldsDto6 = new MarketGetStorefrontFieldsDto("INTEGRATION_SETTINGS", 5, "integration_settings");
        INTEGRATION_SETTINGS = marketGetStorefrontFieldsDto6;
        MarketGetStorefrontFieldsDto marketGetStorefrontFieldsDto7 = new MarketGetStorefrontFieldsDto("ITEMS", 6, "items");
        ITEMS = marketGetStorefrontFieldsDto7;
        MarketGetStorefrontFieldsDto marketGetStorefrontFieldsDto8 = new MarketGetStorefrontFieldsDto("SORTING", 7, "sorting");
        SORTING = marketGetStorefrontFieldsDto8;
        MarketGetStorefrontFieldsDto marketGetStorefrontFieldsDto9 = new MarketGetStorefrontFieldsDto("VIEWED_PRODUCTS", 8, "viewed_products");
        VIEWED_PRODUCTS = marketGetStorefrontFieldsDto9;
        MarketGetStorefrontFieldsDto[] marketGetStorefrontFieldsDtoArr = {marketGetStorefrontFieldsDto, marketGetStorefrontFieldsDto2, marketGetStorefrontFieldsDto3, marketGetStorefrontFieldsDto4, marketGetStorefrontFieldsDto5, marketGetStorefrontFieldsDto6, marketGetStorefrontFieldsDto7, marketGetStorefrontFieldsDto8, marketGetStorefrontFieldsDto9};
        $VALUES = marketGetStorefrontFieldsDtoArr;
        $ENTRIES = new asp(marketGetStorefrontFieldsDtoArr);
        CREATOR = new a();
    }

    private MarketGetStorefrontFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetStorefrontFieldsDto valueOf(String str) {
        return (MarketGetStorefrontFieldsDto) Enum.valueOf(MarketGetStorefrontFieldsDto.class, str);
    }

    public static MarketGetStorefrontFieldsDto[] values() {
        return (MarketGetStorefrontFieldsDto[]) $VALUES.clone();
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
