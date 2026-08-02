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
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetRecommendsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetRecommendsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetRecommendsExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MarketMarketItemFullDto> items;

    @pmi0("variants")
    private final List<MarketMarketItemFullDto> variants;

    /* compiled from: MarketGetRecommendsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetRecommendsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetRecommendsExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MarketGetRecommendsExtendedResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new MarketGetRecommendsExtendedResponseDto(readInt, arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetRecommendsExtendedResponseDto[] newArray(int i) {
            return new MarketGetRecommendsExtendedResponseDto[i];
        }
    }

    public MarketGetRecommendsExtendedResponseDto(int i, List<MarketMarketItemFullDto> list, List<MarketMarketItemFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.variants = list2;
        this.groups = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetRecommendsExtendedResponseDto)) {
            return false;
        }
        MarketGetRecommendsExtendedResponseDto marketGetRecommendsExtendedResponseDto = (MarketGetRecommendsExtendedResponseDto) obj;
        return this.count == marketGetRecommendsExtendedResponseDto.count && epx.f(this.items, marketGetRecommendsExtendedResponseDto.items) && epx.f(this.variants, marketGetRecommendsExtendedResponseDto.variants) && epx.f(this.groups, marketGetRecommendsExtendedResponseDto.groups);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<MarketMarketItemFullDto> list = this.variants;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetRecommendsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", variants=");
        sb.append(this.variants);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketMarketItemFullDto) a2.next()).writeToParcel(parcel, i);
        }
        List<MarketMarketItemFullDto> list = this.variants;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketMarketItemFullDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ MarketGetRecommendsExtendedResponseDto(int i, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
