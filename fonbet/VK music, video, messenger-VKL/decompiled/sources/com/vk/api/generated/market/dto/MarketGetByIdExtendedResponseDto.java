package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarketGetByIdExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetByIdExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetByIdExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemFullDto> items;

    /* compiled from: MarketGetByIdExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetByIdExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetByIdExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetByIdExtendedResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetByIdExtendedResponseDto[] newArray(int i) {
            return new MarketGetByIdExtendedResponseDto[i];
        }
    }

    public MarketGetByIdExtendedResponseDto(int i, List<MarketMarketItemFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<MarketMarketItemFullDto> d() {
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
        if (!(obj instanceof MarketGetByIdExtendedResponseDto)) {
            return false;
        }
        MarketGetByIdExtendedResponseDto marketGetByIdExtendedResponseDto = (MarketGetByIdExtendedResponseDto) obj;
        return this.count == marketGetByIdExtendedResponseDto.count && epx.f(this.items, marketGetByIdExtendedResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetByIdExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketMarketItemFullDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
