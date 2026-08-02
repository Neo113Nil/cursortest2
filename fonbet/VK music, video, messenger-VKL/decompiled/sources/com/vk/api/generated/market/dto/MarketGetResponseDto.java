package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("variants")
    private final List<MarketMarketItemDto> variants;

    /* compiled from: MarketGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(MarketGetResponseDto.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(MarketGetResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new MarketGetResponseDto(readInt, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetResponseDto[] newArray(int i) {
            return new MarketGetResponseDto[i];
        }
    }

    public MarketGetResponseDto(int i, List<MarketMarketItemDto> list, List<MarketMarketItemDto> list2) {
        this.count = i;
        this.items = list;
        this.variants = list2;
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
        if (!(obj instanceof MarketGetResponseDto)) {
            return false;
        }
        MarketGetResponseDto marketGetResponseDto = (MarketGetResponseDto) obj;
        return this.count == marketGetResponseDto.count && epx.f(this.items, marketGetResponseDto.items) && epx.f(this.variants, marketGetResponseDto.variants);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<MarketMarketItemDto> list = this.variants;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", variants=");
        return ms9.a(')', sb, this.variants);
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
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MarketGetResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
