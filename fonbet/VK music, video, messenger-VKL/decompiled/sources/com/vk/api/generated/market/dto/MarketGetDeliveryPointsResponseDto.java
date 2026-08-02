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

/* compiled from: MarketGetDeliveryPointsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetDeliveryPointsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetDeliveryPointsResponseDto> CREATOR = new a();

    @pmi0("city_geo_position")
    private final MarketDeliveryCityCoordinatesDto cityGeoPosition;

    @pmi0("count")
    private final int count;

    @pmi0("filters")
    private final List<MarketDeliveryFiltersDto> filters;

    @pmi0("items")
    private final List<MarketDeliveryPointWithGroupDto> items;

    /* compiled from: MarketGetDeliveryPointsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetDeliveryPointsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetDeliveryPointsResponseDto createFromParcel(Parcel parcel) {
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
            return new MarketGetDeliveryPointsResponseDto(readInt, arrayList, createFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetDeliveryPointsResponseDto[] newArray(int i) {
            return new MarketGetDeliveryPointsResponseDto[i];
        }
    }

    public MarketGetDeliveryPointsResponseDto(int i, List<MarketDeliveryPointWithGroupDto> list, MarketDeliveryCityCoordinatesDto marketDeliveryCityCoordinatesDto, List<MarketDeliveryFiltersDto> list2) {
        this.count = i;
        this.items = list;
        this.cityGeoPosition = marketDeliveryCityCoordinatesDto;
        this.filters = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetDeliveryPointsResponseDto)) {
            return false;
        }
        MarketGetDeliveryPointsResponseDto marketGetDeliveryPointsResponseDto = (MarketGetDeliveryPointsResponseDto) obj;
        return this.count == marketGetDeliveryPointsResponseDto.count && epx.f(this.items, marketGetDeliveryPointsResponseDto.items) && epx.f(this.cityGeoPosition, marketGetDeliveryPointsResponseDto.cityGeoPosition) && epx.f(this.filters, marketGetDeliveryPointsResponseDto.filters);
    }

    public final int hashCode() {
        return this.filters.hashCode() + ((this.cityGeoPosition.hashCode() + fw3.a(Integer.hashCode(this.count) * 31, 31, this.items)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetDeliveryPointsResponseDto(count=");
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
