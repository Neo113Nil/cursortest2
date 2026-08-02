package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketSettingsDeliveryPostDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsDeliveryPostDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsDeliveryPostDto> CREATOR = new a();

    @pmi0("days")
    private final Integer days;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("price")
    private final MarketPriceDto price;

    /* compiled from: MarketSettingsDeliveryPostDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsDeliveryPostDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsDeliveryPostDto createFromParcel(Parcel parcel) {
            return new MarketSettingsDeliveryPostDto(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (MarketPriceDto) parcel.readParcelable(MarketSettingsDeliveryPostDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsDeliveryPostDto[] newArray(int i) {
            return new MarketSettingsDeliveryPostDto[i];
        }
    }

    public MarketSettingsDeliveryPostDto(boolean z, Integer num, MarketPriceDto marketPriceDto) {
        this.isEnabled = z;
        this.days = num;
        this.price = marketPriceDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSettingsDeliveryPostDto)) {
            return false;
        }
        MarketSettingsDeliveryPostDto marketSettingsDeliveryPostDto = (MarketSettingsDeliveryPostDto) obj;
        return this.isEnabled == marketSettingsDeliveryPostDto.isEnabled && epx.f(this.days, marketSettingsDeliveryPostDto.days) && epx.f(this.price, marketSettingsDeliveryPostDto.price);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Integer num = this.days;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.price;
        return hashCode2 + (marketPriceDto != null ? marketPriceDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketSettingsDeliveryPostDto(isEnabled=" + this.isEnabled + ", days=" + this.days + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        Integer num = this.days;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.price, i);
    }

    public /* synthetic */ MarketSettingsDeliveryPostDto(boolean z, Integer num, MarketPriceDto marketPriceDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : marketPriceDto);
    }
}
