package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: MarketGetItemsForAttachResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemsForAttachResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetItemsForAttachResponseDto> CREATOR = new a();

    @pmi0("fave_items")
    private final List<MarketMarketItemDto> faveItems;

    @pmi0("group_items")
    private final List<MarketMarketItemDto> groupItems;

    @pmi0("groups")
    private final List<MarketItemsForAttachGroupDto> groups;

    @pmi0("has_fave_items")
    private final boolean hasFaveItems;

    /* compiled from: MarketGetItemsForAttachResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemsForAttachResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemsForAttachResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(MarketItemsForAttachGroupDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = bo.b(MarketGetItemsForAttachResponseDto.class, parcel, arrayList2, i3, 1);
            }
            boolean z = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = bo.b(MarketGetItemsForAttachResponseDto.class, parcel, arrayList3, i, 1);
            }
            return new MarketGetItemsForAttachResponseDto(arrayList, arrayList2, z, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemsForAttachResponseDto[] newArray(int i) {
            return new MarketGetItemsForAttachResponseDto[i];
        }
    }

    public MarketGetItemsForAttachResponseDto(List<MarketItemsForAttachGroupDto> list, List<MarketMarketItemDto> list2, boolean z, List<MarketMarketItemDto> list3) {
        this.groups = list;
        this.groupItems = list2;
        this.hasFaveItems = z;
        this.faveItems = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetItemsForAttachResponseDto)) {
            return false;
        }
        MarketGetItemsForAttachResponseDto marketGetItemsForAttachResponseDto = (MarketGetItemsForAttachResponseDto) obj;
        return epx.f(this.groups, marketGetItemsForAttachResponseDto.groups) && epx.f(this.groupItems, marketGetItemsForAttachResponseDto.groupItems) && this.hasFaveItems == marketGetItemsForAttachResponseDto.hasFaveItems && epx.f(this.faveItems, marketGetItemsForAttachResponseDto.faveItems);
    }

    public final int hashCode() {
        return this.faveItems.hashCode() + qoy.b(fw3.a(this.groups.hashCode() * 31, 31, this.groupItems), 31, this.hasFaveItems);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetItemsForAttachResponseDto(groups=");
        sb.append(this.groups);
        sb.append(", groupItems=");
        sb.append(this.groupItems);
        sb.append(", hasFaveItems=");
        sb.append(this.hasFaveItems);
        sb.append(", faveItems=");
        return ms9.a(')', sb, this.faveItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.groups);
        while (a2.hasNext()) {
            ((MarketItemsForAttachGroupDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.groupItems);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        parcel.writeInt(this.hasFaveItems ? 1 : 0);
        Iterator a4 = ao.a(parcel, this.faveItems);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
    }
}
