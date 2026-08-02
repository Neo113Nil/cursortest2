package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: MarketGetServicesSectionResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetServicesSectionResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetServicesSectionResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("header")
    private final String header;

    @pmi0("is_skip_items_count")
    private final boolean isSkipItemsCount;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("total_count")
    private final int totalCount;

    @pmi0("view_type")
    private final MarketServicesViewTypeDto viewType;

    /* compiled from: MarketGetServicesSectionResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetServicesSectionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetServicesSectionResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (true) {
                if (i == readInt3) {
                    break;
                }
                i = bo.b(MarketGetServicesSectionResponseDto.class, parcel, arrayList, i, 1);
            }
            return new MarketGetServicesSectionResponseDto(readInt, readInt2, arrayList, parcel.readString(), MarketServicesViewTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetServicesSectionResponseDto[] newArray(int i) {
            return new MarketGetServicesSectionResponseDto[i];
        }
    }

    public MarketGetServicesSectionResponseDto(int i, int i2, List<MarketMarketItemDto> list, String str, MarketServicesViewTypeDto marketServicesViewTypeDto, boolean z) {
        this.totalCount = i;
        this.count = i2;
        this.items = list;
        this.header = str;
        this.viewType = marketServicesViewTypeDto;
        this.isSkipItemsCount = z;
    }

    public final String d() {
        return this.header;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketMarketItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetServicesSectionResponseDto)) {
            return false;
        }
        MarketGetServicesSectionResponseDto marketGetServicesSectionResponseDto = (MarketGetServicesSectionResponseDto) obj;
        return this.totalCount == marketGetServicesSectionResponseDto.totalCount && this.count == marketGetServicesSectionResponseDto.count && epx.f(this.items, marketGetServicesSectionResponseDto.items) && epx.f(this.header, marketGetServicesSectionResponseDto.header) && this.viewType == marketGetServicesSectionResponseDto.viewType && this.isSkipItemsCount == marketGetServicesSectionResponseDto.isSkipItemsCount;
    }

    public final MarketServicesViewTypeDto f() {
        return this.viewType;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSkipItemsCount) + ((this.viewType.hashCode() + urd0.a(fw3.a(shy.a(this.count, Integer.hashCode(this.totalCount) * 31, 31), 31, this.items), 31, this.header)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetServicesSectionResponseDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", viewType=");
        sb.append(this.viewType);
        sb.append(", isSkipItemsCount=");
        return q0.a(sb, this.isSkipItemsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.header);
        this.viewType.writeToParcel(parcel, i);
        parcel.writeInt(this.isSkipItemsCount ? 1 : 0);
    }
}
