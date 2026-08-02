package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarketGetCheckoutDeliveryPointsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCheckoutDeliveryPointsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCheckoutDeliveryPointsResponseDto> CREATOR = new a();

    @pmi0("city_geo_position")
    private final MarketDeliveryCityCoordinatesDto cityGeoPosition;

    @pmi0("count")
    private final int count;

    @pmi0("filters")
    private final List<MarketDeliveryFiltersDto> filters;

    @pmi0("items")
    private final List<MarketDeliveryPointWithGroupDto> items;

    /* compiled from: MarketGetCheckoutDeliveryPointsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCheckoutDeliveryPointsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCheckoutDeliveryPointsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(MarketDeliveryPointWithGroupDto.CREATOR, parcel, arrayList, i2, 1);
            }
            MarketDeliveryCityCoordinatesDto createFromParcel = MarketDeliveryCityCoordinatesDto.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = en.a(MarketDeliveryFiltersDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new MarketGetCheckoutDeliveryPointsResponseDto(readInt, arrayList, createFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCheckoutDeliveryPointsResponseDto[] newArray(int i) {
            return new MarketGetCheckoutDeliveryPointsResponseDto[i];
        }
    }

    public MarketGetCheckoutDeliveryPointsResponseDto(int i, List<MarketDeliveryPointWithGroupDto> list, MarketDeliveryCityCoordinatesDto marketDeliveryCityCoordinatesDto, List<MarketDeliveryFiltersDto> list2) {
        this.count = i;
        this.items = list;
        this.cityGeoPosition = marketDeliveryCityCoordinatesDto;
        this.filters = list2;
    }

    public final MarketDeliveryCityCoordinatesDto d() {
        return this.cityGeoPosition;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketDeliveryFiltersDto> e() {
        return this.filters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCheckoutDeliveryPointsResponseDto)) {
            return false;
        }
        MarketGetCheckoutDeliveryPointsResponseDto marketGetCheckoutDeliveryPointsResponseDto = (MarketGetCheckoutDeliveryPointsResponseDto) obj;
        return this.count == marketGetCheckoutDeliveryPointsResponseDto.count && epx.f(this.items, marketGetCheckoutDeliveryPointsResponseDto.items) && epx.f(this.cityGeoPosition, marketGetCheckoutDeliveryPointsResponseDto.cityGeoPosition) && epx.f(this.filters, marketGetCheckoutDeliveryPointsResponseDto.filters);
    }

    public final List<MarketDeliveryPointWithGroupDto> f() {
        return this.items;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.filters.hashCode() + ((this.cityGeoPosition.hashCode() + fw3.a(Integer.hashCode(this.count) * 31, 31, this.items)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetCheckoutDeliveryPointsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", cityGeoPosition=");
        sb.append(this.cityGeoPosition);
        sb.append(", filters=");
        return ms9.a(')', sb, this.filters);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketDeliveryPointWithGroupDto) a2.next()).writeToParcel(parcel, i);
        }
        this.cityGeoPosition.writeToParcel(parcel, i);
        Iterator a3 = ao.a(parcel, this.filters);
        while (a3.hasNext()) {
            ((MarketDeliveryFiltersDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
