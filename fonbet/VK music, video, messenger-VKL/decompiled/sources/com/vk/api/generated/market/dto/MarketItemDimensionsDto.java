package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: MarketItemDimensionsDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemDimensionsDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemDimensionsDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("length")
    private final int length;

    @pmi0("width")
    private final int width;

    /* compiled from: MarketItemDimensionsDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemDimensionsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemDimensionsDto createFromParcel(Parcel parcel) {
            return new MarketItemDimensionsDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemDimensionsDto[] newArray(int i) {
            return new MarketItemDimensionsDto[i];
        }
    }

    public MarketItemDimensionsDto(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.length = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemDimensionsDto)) {
            return false;
        }
        MarketItemDimensionsDto marketItemDimensionsDto = (MarketItemDimensionsDto) obj;
        return this.width == marketItemDimensionsDto.width && this.height == marketItemDimensionsDto.height && this.length == marketItemDimensionsDto.length;
    }

    public final int hashCode() {
        return Integer.hashCode(this.length) + shy.a(this.height, Integer.hashCode(this.width) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemDimensionsDto(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", length=");
        return vu5.b(sb, this.length, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.length);
    }
}
