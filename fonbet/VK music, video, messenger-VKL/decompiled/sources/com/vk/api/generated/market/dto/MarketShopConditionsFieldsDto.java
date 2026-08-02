package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4572u;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MarketShopConditionsFieldsDto.kt */
/* loaded from: classes15.dex */
public final class MarketShopConditionsFieldsDto implements Parcelable {
    public static final Parcelable.Creator<MarketShopConditionsFieldsDto> CREATOR = new a();

    @pmi0(C4572u.g)
    private final MarketTextWithTitleDto delivery;

    @pmi0("payment")
    private final MarketTextWithTitleDto payment;

    @pmi0("refund")
    private final MarketTextWithTitleDto refund;

    /* compiled from: MarketShopConditionsFieldsDto.kt */
    public static final class a implements Parcelable.Creator<MarketShopConditionsFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketShopConditionsFieldsDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<MarketTextWithTitleDto> creator = MarketTextWithTitleDto.CREATOR;
            return new MarketShopConditionsFieldsDto(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketShopConditionsFieldsDto[] newArray(int i) {
            return new MarketShopConditionsFieldsDto[i];
        }
    }

    public MarketShopConditionsFieldsDto(MarketTextWithTitleDto marketTextWithTitleDto, MarketTextWithTitleDto marketTextWithTitleDto2, MarketTextWithTitleDto marketTextWithTitleDto3) {
        this.delivery = marketTextWithTitleDto;
        this.payment = marketTextWithTitleDto2;
        this.refund = marketTextWithTitleDto3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketShopConditionsFieldsDto)) {
            return false;
        }
        MarketShopConditionsFieldsDto marketShopConditionsFieldsDto = (MarketShopConditionsFieldsDto) obj;
        return epx.f(this.delivery, marketShopConditionsFieldsDto.delivery) && epx.f(this.payment, marketShopConditionsFieldsDto.payment) && epx.f(this.refund, marketShopConditionsFieldsDto.refund);
    }

    public final int hashCode() {
        return this.refund.hashCode() + ((this.payment.hashCode() + (this.delivery.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MarketShopConditionsFieldsDto(delivery=" + this.delivery + ", payment=" + this.payment + ", refund=" + this.refund + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.delivery.writeToParcel(parcel, i);
        this.payment.writeToParcel(parcel, i);
        this.refund.writeToParcel(parcel, i);
    }
}
