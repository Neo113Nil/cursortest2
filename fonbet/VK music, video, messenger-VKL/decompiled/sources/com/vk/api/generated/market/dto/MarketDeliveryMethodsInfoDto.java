package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MarketDeliveryMethodsInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryMethodsInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryMethodsInfoDto> CREATOR = new a();

    @pmi0("delivery_methods")
    private final List<MarketDeliveryMethodCostDto> deliveryMethods;

    @pmi0("is_user_in_primary_city")
    private final Boolean isUserInPrimaryCity;

    @pmi0("user_city")
    private final MarketCityWithCoordinatesDto userCity;

    /* compiled from: MarketDeliveryMethodsInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryMethodsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryMethodsInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList = null;
            MarketCityWithCoordinatesDto createFromParcel = parcel.readInt() == 0 ? null : MarketCityWithCoordinatesDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(MarketDeliveryMethodCostDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketDeliveryMethodsInfoDto(createFromParcel, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryMethodsInfoDto[] newArray(int i) {
            return new MarketDeliveryMethodsInfoDto[i];
        }
    }

    public MarketDeliveryMethodsInfoDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDeliveryMethodsInfoDto)) {
            return false;
        }
        MarketDeliveryMethodsInfoDto marketDeliveryMethodsInfoDto = (MarketDeliveryMethodsInfoDto) obj;
        return epx.f(this.userCity, marketDeliveryMethodsInfoDto.userCity) && epx.f(this.isUserInPrimaryCity, marketDeliveryMethodsInfoDto.isUserInPrimaryCity) && epx.f(this.deliveryMethods, marketDeliveryMethodsInfoDto.deliveryMethods);
    }

    public final int hashCode() {
        MarketCityWithCoordinatesDto marketCityWithCoordinatesDto = this.userCity;
        int hashCode = (marketCityWithCoordinatesDto == null ? 0 : marketCityWithCoordinatesDto.hashCode()) * 31;
        Boolean bool = this.isUserInPrimaryCity;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MarketDeliveryMethodCostDto> list = this.deliveryMethods;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketDeliveryMethodsInfoDto(userCity=");
        sb.append(this.userCity);
        sb.append(", isUserInPrimaryCity=");
        sb.append(this.isUserInPrimaryCity);
        sb.append(", deliveryMethods=");
        return ms9.a(')', sb, this.deliveryMethods);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketCityWithCoordinatesDto marketCityWithCoordinatesDto = this.userCity;
        if (marketCityWithCoordinatesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCityWithCoordinatesDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isUserInPrimaryCity;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<MarketDeliveryMethodCostDto> list = this.deliveryMethods;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketDeliveryMethodCostDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MarketDeliveryMethodsInfoDto(MarketCityWithCoordinatesDto marketCityWithCoordinatesDto, Boolean bool, List<MarketDeliveryMethodCostDto> list) {
        this.userCity = marketCityWithCoordinatesDto;
        this.isUserInPrimaryCity = bool;
        this.deliveryMethods = list;
    }

    public /* synthetic */ MarketDeliveryMethodsInfoDto(MarketCityWithCoordinatesDto marketCityWithCoordinatesDto, Boolean bool, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketCityWithCoordinatesDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list);
    }
}
