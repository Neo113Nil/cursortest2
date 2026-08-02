package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketMarketOrderDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketOrderDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketOrderDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketMarketOrderItemDto> items;

    @pmi0("order_cta")
    private final MarketMarketOrderCtaDto orderCta;

    /* compiled from: MarketMarketOrderDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketOrderDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketMarketOrderItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new MarketMarketOrderDto(arrayList, parcel.readInt() != 0 ? MarketMarketOrderCtaDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketOrderDto[] newArray(int i) {
            return new MarketMarketOrderDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketMarketOrderDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketOrderDto)) {
            return false;
        }
        MarketMarketOrderDto marketMarketOrderDto = (MarketMarketOrderDto) obj;
        return epx.f(this.items, marketMarketOrderDto.items) && epx.f(this.orderCta, marketMarketOrderDto.orderCta);
    }

    public final int hashCode() {
        List<MarketMarketOrderItemDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        MarketMarketOrderCtaDto marketMarketOrderCtaDto = this.orderCta;
        return hashCode + (marketMarketOrderCtaDto != null ? marketMarketOrderCtaDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketMarketOrderDto(items=" + this.items + ", orderCta=" + this.orderCta + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MarketMarketOrderItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketMarketOrderItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        MarketMarketOrderCtaDto marketMarketOrderCtaDto = this.orderCta;
        if (marketMarketOrderCtaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketOrderCtaDto.writeToParcel(parcel, i);
        }
    }

    public MarketMarketOrderDto(List<MarketMarketOrderItemDto> list, MarketMarketOrderCtaDto marketMarketOrderCtaDto) {
        this.items = list;
        this.orderCta = marketMarketOrderCtaDto;
    }

    public /* synthetic */ MarketMarketOrderDto(List list, MarketMarketOrderCtaDto marketMarketOrderCtaDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : marketMarketOrderCtaDto);
    }
}
