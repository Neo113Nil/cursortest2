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

/* compiled from: MarketGetItemCardQuickMessagesResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemCardQuickMessagesResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetItemCardQuickMessagesResponseObjectDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketItemCardQuickMessageDto> items;

    /* compiled from: MarketGetItemCardQuickMessagesResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemCardQuickMessagesResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemCardQuickMessagesResponseObjectDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketItemCardQuickMessageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetItemCardQuickMessagesResponseObjectDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemCardQuickMessagesResponseObjectDto[] newArray(int i) {
            return new MarketGetItemCardQuickMessagesResponseObjectDto[i];
        }
    }

    public MarketGetItemCardQuickMessagesResponseObjectDto(List<MarketItemCardQuickMessageDto> list) {
        this.items = list;
    }

    public final List<MarketItemCardQuickMessageDto> d() {
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
        return (obj instanceof MarketGetItemCardQuickMessagesResponseObjectDto) && epx.f(this.items, ((MarketGetItemCardQuickMessagesResponseObjectDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarketGetItemCardQuickMessagesResponseObjectDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketItemCardQuickMessageDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
