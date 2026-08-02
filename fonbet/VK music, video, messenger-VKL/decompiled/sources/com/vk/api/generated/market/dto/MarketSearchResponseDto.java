package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: MarketSearchResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketSearchResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("filters")
    private final MarketGlobalSearchFiltersDto filters;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("is_skip_items_count")
    private final boolean isSkipItemsCount;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("query_id")
    private final Long queryId;

    @pmi0("variants")
    private final List<MarketMarketItemDto> variants;

    @pmi0("view_type")
    private final MarketServicesViewTypeDto viewType;

    /* compiled from: MarketSearchResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchResponseDto createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            MarketServicesViewTypeDto createFromParcel = MarketServicesViewTypeDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            boolean z = false;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(MarketSearchResponseDto.class, parcel, arrayList3, i2, 1);
            }
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i3 = i;
                while (i3 != readInt3) {
                    i3 = bo.b(MarketSearchResponseDto.class, parcel, arrayList4, i3, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MarketSearchResponseDto.class, parcel, arrayList5, i, 1);
                }
                arrayList2 = arrayList5;
            }
            return new MarketSearchResponseDto(readInt, createFromParcel, arrayList3, z, arrayList, arrayList2, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? MarketGlobalSearchFiltersDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchResponseDto[] newArray(int i) {
            return new MarketSearchResponseDto[i];
        }
    }

    public MarketSearchResponseDto(int i, MarketServicesViewTypeDto marketServicesViewTypeDto, List<MarketMarketItemDto> list, boolean z, List<MarketMarketItemDto> list2, List<GroupsGroupFullDto> list3, Long l, MarketGlobalSearchFiltersDto marketGlobalSearchFiltersDto) {
        this.count = i;
        this.viewType = marketServicesViewTypeDto;
        this.items = list;
        this.isSkipItemsCount = z;
        this.variants = list2;
        this.groups = list3;
        this.queryId = l;
        this.filters = marketGlobalSearchFiltersDto;
    }

    public final List<MarketMarketItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketServicesViewTypeDto e() {
        return this.viewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSearchResponseDto)) {
            return false;
        }
        MarketSearchResponseDto marketSearchResponseDto = (MarketSearchResponseDto) obj;
        return this.count == marketSearchResponseDto.count && this.viewType == marketSearchResponseDto.viewType && epx.f(this.items, marketSearchResponseDto.items) && this.isSkipItemsCount == marketSearchResponseDto.isSkipItemsCount && epx.f(this.variants, marketSearchResponseDto.variants) && epx.f(this.groups, marketSearchResponseDto.groups) && epx.f(this.queryId, marketSearchResponseDto.queryId) && epx.f(this.filters, marketSearchResponseDto.filters);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a((this.viewType.hashCode() + (Integer.hashCode(this.count) * 31)) * 31, 31, this.items), 31, this.isSkipItemsCount);
        List<MarketMarketItemDto> list = this.variants;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.queryId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        MarketGlobalSearchFiltersDto marketGlobalSearchFiltersDto = this.filters;
        return hashCode3 + (marketGlobalSearchFiltersDto != null ? marketGlobalSearchFiltersDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketSearchResponseDto(count=" + this.count + ", viewType=" + this.viewType + ", items=" + this.items + ", isSkipItemsCount=" + this.isSkipItemsCount + ", variants=" + this.variants + ", groups=" + this.groups + ", queryId=" + this.queryId + ", filters=" + this.filters + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        this.viewType.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.isSkipItemsCount ? 1 : 0);
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
        Long l = this.queryId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        MarketGlobalSearchFiltersDto marketGlobalSearchFiltersDto = this.filters;
        if (marketGlobalSearchFiltersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGlobalSearchFiltersDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketSearchResponseDto(int i, MarketServicesViewTypeDto marketServicesViewTypeDto, List list, boolean z, List list2, List list3, Long l, MarketGlobalSearchFiltersDto marketGlobalSearchFiltersDto, int i2, zcl zclVar) {
        this(i, marketServicesViewTypeDto, list, z, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : list3, (i2 & 64) != 0 ? null : l, (i2 & 128) != 0 ? null : marketGlobalSearchFiltersDto);
    }
}
