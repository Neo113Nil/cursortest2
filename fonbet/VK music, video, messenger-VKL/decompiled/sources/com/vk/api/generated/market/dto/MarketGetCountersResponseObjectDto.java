package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketGetCountersResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCountersResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCountersResponseObjectDto> CREATOR = new a();

    @pmi0("bookmark_items_count")
    private final Integer bookmarkItemsCount;

    @pmi0("single_cart_items_count")
    private final Integer singleCartItemsCount;

    /* compiled from: MarketGetCountersResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCountersResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCountersResponseObjectDto createFromParcel(Parcel parcel) {
            return new MarketGetCountersResponseObjectDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCountersResponseObjectDto[] newArray(int i) {
            return new MarketGetCountersResponseObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetCountersResponseObjectDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCountersResponseObjectDto)) {
            return false;
        }
        MarketGetCountersResponseObjectDto marketGetCountersResponseObjectDto = (MarketGetCountersResponseObjectDto) obj;
        return epx.f(this.singleCartItemsCount, marketGetCountersResponseObjectDto.singleCartItemsCount) && epx.f(this.bookmarkItemsCount, marketGetCountersResponseObjectDto.bookmarkItemsCount);
    }

    public final int hashCode() {
        Integer num = this.singleCartItemsCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.bookmarkItemsCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetCountersResponseObjectDto(singleCartItemsCount=");
        sb.append(this.singleCartItemsCount);
        sb.append(", bookmarkItemsCount=");
        return uqi.b(sb, this.bookmarkItemsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.singleCartItemsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.bookmarkItemsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public MarketGetCountersResponseObjectDto(Integer num, Integer num2) {
        this.singleCartItemsCount = num;
        this.bookmarkItemsCount = num2;
    }

    public /* synthetic */ MarketGetCountersResponseObjectDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
