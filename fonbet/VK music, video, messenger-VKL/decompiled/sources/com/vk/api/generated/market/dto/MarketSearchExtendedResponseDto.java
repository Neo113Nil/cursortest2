package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: MarketSearchExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketSearchExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("is_skip_items_count")
    private final boolean isSkipItemsCount;

    @pmi0("items")
    private final List<MarketMarketItemFullDto> items;

    @pmi0("variants")
    private final List<MarketMarketItemFullDto> variants;

    @pmi0("view_type")
    private final MarketServicesViewTypeDto viewType;

    /* compiled from: MarketSearchExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedResponseDto createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            MarketServicesViewTypeDto createFromParcel = MarketServicesViewTypeDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            boolean z = false;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList2, i2, 1);
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
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new MarketSearchExtendedResponseDto(readInt, createFromParcel, arrayList2, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchExtendedResponseDto[] newArray(int i) {
            return new MarketSearchExtendedResponseDto[i];
        }
    }

    public MarketSearchExtendedResponseDto(int i, MarketServicesViewTypeDto marketServicesViewTypeDto, List<MarketMarketItemFullDto> list, boolean z, List<MarketMarketItemFullDto> list2) {
        this.count = i;
        this.viewType = marketServicesViewTypeDto;
        this.items = list;
        this.isSkipItemsCount = z;
        this.variants = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSearchExtendedResponseDto)) {
            return false;
        }
        MarketSearchExtendedResponseDto marketSearchExtendedResponseDto = (MarketSearchExtendedResponseDto) obj;
        return this.count == marketSearchExtendedResponseDto.count && this.viewType == marketSearchExtendedResponseDto.viewType && epx.f(this.items, marketSearchExtendedResponseDto.items) && this.isSkipItemsCount == marketSearchExtendedResponseDto.isSkipItemsCount && epx.f(this.variants, marketSearchExtendedResponseDto.variants);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a((this.viewType.hashCode() + (Integer.hashCode(this.count) * 31)) * 31, 31, this.items), 31, this.isSkipItemsCount);
        List<MarketMarketItemFullDto> list = this.variants;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSearchExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", viewType=");
        sb.append(this.viewType);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", isSkipItemsCount=");
        sb.append(this.isSkipItemsCount);
        sb.append(", variants=");
        return ms9.a(')', sb, this.variants);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        this.viewType.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketMarketItemFullDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isSkipItemsCount ? 1 : 0);
        List<MarketMarketItemFullDto> list = this.variants;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketMarketItemFullDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketSearchExtendedResponseDto(int i, MarketServicesViewTypeDto marketServicesViewTypeDto, List list, boolean z, List list2, int i2, zcl zclVar) {
        this(i, marketServicesViewTypeDto, list, z, (i2 & 16) != 0 ? null : list2);
    }
}
