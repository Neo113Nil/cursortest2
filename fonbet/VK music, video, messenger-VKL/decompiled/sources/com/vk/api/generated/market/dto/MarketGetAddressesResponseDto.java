package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarketGetAddressesResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetAddressesResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetAddressesResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsAddressDto> items;

    /* compiled from: MarketGetAddressesResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetAddressesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetAddressesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(MarketGetAddressesResponseDto.class, parcel, arrayList, i, 1);
            }
            return new MarketGetAddressesResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetAddressesResponseDto[] newArray(int i) {
            return new MarketGetAddressesResponseDto[i];
        }
    }

    public MarketGetAddressesResponseDto(int i, List<GroupsAddressDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<GroupsAddressDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetAddressesResponseDto)) {
            return false;
        }
        MarketGetAddressesResponseDto marketGetAddressesResponseDto = (MarketGetAddressesResponseDto) obj;
        return this.count == marketGetAddressesResponseDto.count && epx.f(this.items, marketGetAddressesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetAddressesResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
