package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketCountersFilterDto.kt */
/* loaded from: classes15.dex */
public final class MarketCountersFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketCountersFilterDto[] $VALUES;

    @pmi0("bookmark_items_count")
    public static final MarketCountersFilterDto BOOKMARK_ITEMS_COUNT;
    public static final Parcelable.Creator<MarketCountersFilterDto> CREATOR;

    @pmi0("single_cart_items_count")
    public static final MarketCountersFilterDto SINGLE_CART_ITEMS_COUNT;
    private final String value;

    /* compiled from: MarketCountersFilterDto.kt */
    public static final class a implements Parcelable.Creator<MarketCountersFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCountersFilterDto createFromParcel(Parcel parcel) {
            return MarketCountersFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCountersFilterDto[] newArray(int i) {
            return new MarketCountersFilterDto[i];
        }
    }

    static {
        MarketCountersFilterDto marketCountersFilterDto = new MarketCountersFilterDto("SINGLE_CART_ITEMS_COUNT", 0, "single_cart_items_count");
        SINGLE_CART_ITEMS_COUNT = marketCountersFilterDto;
        MarketCountersFilterDto marketCountersFilterDto2 = new MarketCountersFilterDto("BOOKMARK_ITEMS_COUNT", 1, "bookmark_items_count");
        BOOKMARK_ITEMS_COUNT = marketCountersFilterDto2;
        MarketCountersFilterDto[] marketCountersFilterDtoArr = {marketCountersFilterDto, marketCountersFilterDto2};
        $VALUES = marketCountersFilterDtoArr;
        $ENTRIES = new asp(marketCountersFilterDtoArr);
        CREATOR = new a();
    }

    private MarketCountersFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketCountersFilterDto valueOf(String str) {
        return (MarketCountersFilterDto) Enum.valueOf(MarketCountersFilterDto.class, str);
    }

    public static MarketCountersFilterDto[] values() {
        return (MarketCountersFilterDto[]) $VALUES.clone();
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
