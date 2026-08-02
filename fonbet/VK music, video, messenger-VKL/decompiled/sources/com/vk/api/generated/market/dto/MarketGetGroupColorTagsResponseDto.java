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

/* compiled from: MarketGetGroupColorTagsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetGroupColorTagsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetGroupColorTagsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketOrderTagDto> items;

    /* compiled from: MarketGetGroupColorTagsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetGroupColorTagsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetGroupColorTagsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketOrderTagDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetGroupColorTagsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetGroupColorTagsResponseDto[] newArray(int i) {
            return new MarketGetGroupColorTagsResponseDto[i];
        }
    }

    public MarketGetGroupColorTagsResponseDto(List<MarketOrderTagDto> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetGroupColorTagsResponseDto) && epx.f(this.items, ((MarketGetGroupColorTagsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarketGetGroupColorTagsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketOrderTagDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
