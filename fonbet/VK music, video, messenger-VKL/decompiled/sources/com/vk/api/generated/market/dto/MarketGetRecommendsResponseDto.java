package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetRecommendsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetRecommendsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetRecommendsResponseDto> CREATOR = new a();

    @pmi0("block_data")
    private final MarketBlockDataDto blockData;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("variants")
    private final List<MarketMarketItemDto> variants;

    /* compiled from: MarketGetRecommendsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetRecommendsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetRecommendsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(MarketGetRecommendsResponseDto.class, parcel, arrayList3, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MarketGetRecommendsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MarketGetRecommendsResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new MarketGetRecommendsResponseDto(readInt, arrayList3, arrayList, arrayList2, parcel.readInt() != 0 ? MarketBlockDataDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetRecommendsResponseDto[] newArray(int i) {
            return new MarketGetRecommendsResponseDto[i];
        }
    }

    public MarketGetRecommendsResponseDto(int i, List<MarketMarketItemDto> list, List<MarketMarketItemDto> list2, List<GroupsGroupFullDto> list3, MarketBlockDataDto marketBlockDataDto) {
        this.count = i;
        this.items = list;
        this.variants = list2;
        this.groups = list3;
        this.blockData = marketBlockDataDto;
    }

    public final MarketBlockDataDto d() {
        return this.blockData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupFullDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetRecommendsResponseDto)) {
            return false;
        }
        MarketGetRecommendsResponseDto marketGetRecommendsResponseDto = (MarketGetRecommendsResponseDto) obj;
        return this.count == marketGetRecommendsResponseDto.count && epx.f(this.items, marketGetRecommendsResponseDto.items) && epx.f(this.variants, marketGetRecommendsResponseDto.variants) && epx.f(this.groups, marketGetRecommendsResponseDto.groups) && epx.f(this.blockData, marketGetRecommendsResponseDto.blockData);
    }

    public final List<MarketMarketItemDto> f() {
        return this.items;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<MarketMarketItemDto> list = this.variants;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        MarketBlockDataDto marketBlockDataDto = this.blockData;
        return hashCode2 + (marketBlockDataDto != null ? marketBlockDataDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketGetRecommendsResponseDto(count=" + this.count + ", items=" + this.items + ", variants=" + this.variants + ", groups=" + this.groups + ", blockData=" + this.blockData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<MarketMarketItemDto> list = this.variants;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        MarketBlockDataDto marketBlockDataDto = this.blockData;
        if (marketBlockDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketBlockDataDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketGetRecommendsResponseDto(int i, List list, List list2, List list3, MarketBlockDataDto marketBlockDataDto, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : marketBlockDataDto);
    }
}
