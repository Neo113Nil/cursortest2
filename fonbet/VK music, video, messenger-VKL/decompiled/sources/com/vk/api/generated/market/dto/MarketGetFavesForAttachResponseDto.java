package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketGetFavesForAttachResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetFavesForAttachResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetFavesForAttachResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<MarketGroupForAttachDto> groups;

    @pmi0("market_items")
    private final List<MarketMarketItemDto> marketItems;

    @pmi0("next_from")
    private final Integer nextFrom;

    /* compiled from: MarketGetFavesForAttachResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetFavesForAttachResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetFavesForAttachResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(MarketGetFavesForAttachResponseDto.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MarketGroupForAttachDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new MarketGetFavesForAttachResponseDto(arrayList2, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetFavesForAttachResponseDto[] newArray(int i) {
            return new MarketGetFavesForAttachResponseDto[i];
        }
    }

    public MarketGetFavesForAttachResponseDto(List<MarketMarketItemDto> list, List<MarketGroupForAttachDto> list2, Integer num) {
        this.marketItems = list;
        this.groups = list2;
        this.nextFrom = num;
    }

    public final List<MarketGroupForAttachDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketMarketItemDto> e() {
        return this.marketItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetFavesForAttachResponseDto)) {
            return false;
        }
        MarketGetFavesForAttachResponseDto marketGetFavesForAttachResponseDto = (MarketGetFavesForAttachResponseDto) obj;
        return epx.f(this.marketItems, marketGetFavesForAttachResponseDto.marketItems) && epx.f(this.groups, marketGetFavesForAttachResponseDto.groups) && epx.f(this.nextFrom, marketGetFavesForAttachResponseDto.nextFrom);
    }

    public final Integer f() {
        return this.nextFrom;
    }

    public final int hashCode() {
        int hashCode = this.marketItems.hashCode() * 31;
        List<MarketGroupForAttachDto> list = this.groups;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.nextFrom;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetFavesForAttachResponseDto(marketItems=");
        sb.append(this.marketItems);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", nextFrom=");
        return uqi.b(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.marketItems);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<MarketGroupForAttachDto> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketGroupForAttachDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.nextFrom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MarketGetFavesForAttachResponseDto(List list, List list2, Integer num, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : num);
    }
}
