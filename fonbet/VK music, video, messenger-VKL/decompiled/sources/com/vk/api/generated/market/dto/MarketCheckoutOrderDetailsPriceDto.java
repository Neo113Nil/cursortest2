package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCheckoutOrderDetailsPriceDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutOrderDetailsPriceDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutOrderDetailsPriceDto> CREATOR = new a();

    @pmi0("is_accent")
    private final Boolean isAccent;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: MarketCheckoutOrderDetailsPriceDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutOrderDetailsPriceDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderDetailsPriceDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MarketCheckoutOrderDetailsPriceDto.class.getClassLoader());
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketCheckoutOrderDetailsPriceDto(readString, readString2, marketPriceDto, readString3, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderDetailsPriceDto[] newArray(int i) {
            return new MarketCheckoutOrderDetailsPriceDto[i];
        }
    }

    public MarketCheckoutOrderDetailsPriceDto(String str, String str2, MarketPriceDto marketPriceDto, String str3, Boolean bool) {
        this.title = str;
        this.type = str2;
        this.price = marketPriceDto;
        this.subtitle = str3;
        this.isAccent = bool;
    }

    public final MarketPriceDto d() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutOrderDetailsPriceDto)) {
            return false;
        }
        MarketCheckoutOrderDetailsPriceDto marketCheckoutOrderDetailsPriceDto = (MarketCheckoutOrderDetailsPriceDto) obj;
        return epx.f(this.title, marketCheckoutOrderDetailsPriceDto.title) && epx.f(this.type, marketCheckoutOrderDetailsPriceDto.type) && epx.f(this.price, marketCheckoutOrderDetailsPriceDto.price) && epx.f(this.subtitle, marketCheckoutOrderDetailsPriceDto.subtitle) && epx.f(this.isAccent, marketCheckoutOrderDetailsPriceDto.isAccent);
    }

    public final Boolean f() {
        return this.isAccent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = (this.price.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.type)) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isAccent;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutOrderDetailsPriceDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", isAccent=");
        return tn.a(sb, this.isAccent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.price, i);
        parcel.writeString(this.subtitle);
        Boolean bool = this.isAccent;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketCheckoutOrderDetailsPriceDto(String str, String str2, MarketPriceDto marketPriceDto, String str3, Boolean bool, int i, zcl zclVar) {
        this(str, str2, marketPriceDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool);
    }
}
