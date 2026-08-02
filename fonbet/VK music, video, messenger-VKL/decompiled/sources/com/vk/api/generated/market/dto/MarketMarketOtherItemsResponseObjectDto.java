package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketMarketOtherItemsResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketOtherItemsResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketOtherItemsResponseObjectDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    /* compiled from: MarketMarketOtherItemsResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketOtherItemsResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketOtherItemsResponseObjectDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketMarketOtherItemsResponseObjectDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketMarketOtherItemsResponseObjectDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketOtherItemsResponseObjectDto[] newArray(int i) {
            return new MarketMarketOtherItemsResponseObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketMarketOtherItemsResponseObjectDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<MarketMarketItemDto> d() {
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
        return (obj instanceof MarketMarketOtherItemsResponseObjectDto) && epx.f(this.items, ((MarketMarketOtherItemsResponseObjectDto) obj).items);
    }

    public final int hashCode() {
        List<MarketMarketItemDto> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarketMarketOtherItemsResponseObjectDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MarketMarketItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public MarketMarketOtherItemsResponseObjectDto(List<MarketMarketItemDto> list) {
        this.items = list;
    }

    public /* synthetic */ MarketMarketOtherItemsResponseObjectDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
