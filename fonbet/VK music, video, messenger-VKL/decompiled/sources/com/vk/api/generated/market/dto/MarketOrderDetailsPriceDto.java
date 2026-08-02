package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketOrderDetailsPriceDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderDetailsPriceDto implements Parcelable {
    public static final Parcelable.Creator<MarketOrderDetailsPriceDto> CREATOR = new a();

    @pmi0("is_accent")
    private final Boolean isAccent;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: MarketOrderDetailsPriceDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderDetailsPriceDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderDetailsPriceDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MarketOrderDetailsPriceDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketOrderDetailsPriceDto(readString, readString2, marketPriceDto, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderDetailsPriceDto[] newArray(int i) {
            return new MarketOrderDetailsPriceDto[i];
        }
    }

    public MarketOrderDetailsPriceDto(String str, String str2, MarketPriceDto marketPriceDto, Boolean bool) {
        this.title = str;
        this.type = str2;
        this.price = marketPriceDto;
        this.isAccent = bool;
    }

    public final MarketPriceDto d() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isAccent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderDetailsPriceDto)) {
            return false;
        }
        MarketOrderDetailsPriceDto marketOrderDetailsPriceDto = (MarketOrderDetailsPriceDto) obj;
        return epx.f(this.title, marketOrderDetailsPriceDto.title) && epx.f(this.type, marketOrderDetailsPriceDto.type) && epx.f(this.price, marketOrderDetailsPriceDto.price) && epx.f(this.isAccent, marketOrderDetailsPriceDto.isAccent);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = (this.price.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.type)) * 31;
        Boolean bool = this.isAccent;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketOrderDetailsPriceDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", isAccent=");
        return tn.a(sb, this.isAccent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.price, i);
        Boolean bool = this.isAccent;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketOrderDetailsPriceDto(String str, String str2, MarketPriceDto marketPriceDto, Boolean bool, int i, zcl zclVar) {
        this(str, str2, marketPriceDto, (i & 8) != 0 ? null : bool);
    }
}
