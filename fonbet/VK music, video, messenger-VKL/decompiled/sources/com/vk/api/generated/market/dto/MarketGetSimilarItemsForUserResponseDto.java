package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketGetSimilarItemsForUserResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetSimilarItemsForUserResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetSimilarItemsForUserResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketMarketItemFullDto> items;

    @pmi0("next_from")
    private final Integer nextFrom;

    /* compiled from: MarketGetSimilarItemsForUserResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetSimilarItemsForUserResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetSimilarItemsForUserResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetSimilarItemsForUserResponseDto(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetSimilarItemsForUserResponseDto[] newArray(int i) {
            return new MarketGetSimilarItemsForUserResponseDto[i];
        }
    }

    public MarketGetSimilarItemsForUserResponseDto(List<MarketMarketItemFullDto> list, Integer num) {
        this.items = list;
        this.nextFrom = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetSimilarItemsForUserResponseDto)) {
            return false;
        }
        MarketGetSimilarItemsForUserResponseDto marketGetSimilarItemsForUserResponseDto = (MarketGetSimilarItemsForUserResponseDto) obj;
        return epx.f(this.items, marketGetSimilarItemsForUserResponseDto.items) && epx.f(this.nextFrom, marketGetSimilarItemsForUserResponseDto.nextFrom);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Integer num = this.nextFrom;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetSimilarItemsForUserResponseDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        return uqi.b(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketMarketItemFullDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.nextFrom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MarketGetSimilarItemsForUserResponseDto(List list, Integer num, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num);
    }
}
