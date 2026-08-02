package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketGetCountersResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCountersResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCountersResponseDto> CREATOR = new a();

    @pmi0("bookmark_items_count")
    private final Integer bookmarkItemsCount;

    @pmi0("single_cart_items_count")
    private final Integer singleCartItemsCount;

    /* compiled from: MarketGetCountersResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCountersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCountersResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetCountersResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCountersResponseDto[] newArray(int i) {
            return new MarketGetCountersResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetCountersResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.bookmarkItemsCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.singleCartItemsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCountersResponseDto)) {
            return false;
        }
        MarketGetCountersResponseDto marketGetCountersResponseDto = (MarketGetCountersResponseDto) obj;
        return epx.f(this.singleCartItemsCount, marketGetCountersResponseDto.singleCartItemsCount) && epx.f(this.bookmarkItemsCount, marketGetCountersResponseDto.bookmarkItemsCount);
    }

    public final int hashCode() {
        Integer num = this.singleCartItemsCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.bookmarkItemsCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetCountersResponseDto(singleCartItemsCount=");
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

    public MarketGetCountersResponseDto(Integer num, Integer num2) {
        this.singleCartItemsCount = num;
        this.bookmarkItemsCount = num2;
    }

    public /* synthetic */ MarketGetCountersResponseDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
