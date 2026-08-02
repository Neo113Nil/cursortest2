package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4572u;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCommunityConditionsDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityConditionsDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityConditionsDto> CREATOR = new a();

    @pmi0(C4572u.g)
    private final MarketTextWithTitleDto delivery;

    @pmi0("integration_summary")
    private final MarketTextWithTitleDto integrationSummary;

    @pmi0("ozon_integration_summary")
    private final MarketTextWithTitleDto ozonIntegrationSummary;

    @pmi0("payment")
    private final MarketTextWithTitleDto payment;

    @pmi0("refund")
    private final MarketTextWithTitleDto refund;

    /* compiled from: MarketCommunityConditionsDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityConditionsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityConditionsDto createFromParcel(Parcel parcel) {
            return new MarketCommunityConditionsDto((MarketTextWithTitleDto) parcel.readParcelable(MarketCommunityConditionsDto.class.getClassLoader()), (MarketTextWithTitleDto) parcel.readParcelable(MarketCommunityConditionsDto.class.getClassLoader()), (MarketTextWithTitleDto) parcel.readParcelable(MarketCommunityConditionsDto.class.getClassLoader()), (MarketTextWithTitleDto) parcel.readParcelable(MarketCommunityConditionsDto.class.getClassLoader()), (MarketTextWithTitleDto) parcel.readParcelable(MarketCommunityConditionsDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityConditionsDto[] newArray(int i) {
            return new MarketCommunityConditionsDto[i];
        }
    }

    public MarketCommunityConditionsDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final MarketTextWithTitleDto d() {
        return this.delivery;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketTextWithTitleDto e() {
        return this.integrationSummary;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCommunityConditionsDto)) {
            return false;
        }
        MarketCommunityConditionsDto marketCommunityConditionsDto = (MarketCommunityConditionsDto) obj;
        return epx.f(this.delivery, marketCommunityConditionsDto.delivery) && epx.f(this.payment, marketCommunityConditionsDto.payment) && epx.f(this.refund, marketCommunityConditionsDto.refund) && epx.f(this.ozonIntegrationSummary, marketCommunityConditionsDto.ozonIntegrationSummary) && epx.f(this.integrationSummary, marketCommunityConditionsDto.integrationSummary);
    }

    public final MarketTextWithTitleDto f() {
        return this.ozonIntegrationSummary;
    }

    public final MarketTextWithTitleDto g() {
        return this.payment;
    }

    public final int hashCode() {
        MarketTextWithTitleDto marketTextWithTitleDto = this.delivery;
        int hashCode = (marketTextWithTitleDto == null ? 0 : marketTextWithTitleDto.hashCode()) * 31;
        MarketTextWithTitleDto marketTextWithTitleDto2 = this.payment;
        int hashCode2 = (hashCode + (marketTextWithTitleDto2 == null ? 0 : marketTextWithTitleDto2.hashCode())) * 31;
        MarketTextWithTitleDto marketTextWithTitleDto3 = this.refund;
        int hashCode3 = (hashCode2 + (marketTextWithTitleDto3 == null ? 0 : marketTextWithTitleDto3.hashCode())) * 31;
        MarketTextWithTitleDto marketTextWithTitleDto4 = this.ozonIntegrationSummary;
        int hashCode4 = (hashCode3 + (marketTextWithTitleDto4 == null ? 0 : marketTextWithTitleDto4.hashCode())) * 31;
        MarketTextWithTitleDto marketTextWithTitleDto5 = this.integrationSummary;
        return hashCode4 + (marketTextWithTitleDto5 != null ? marketTextWithTitleDto5.hashCode() : 0);
    }

    public final MarketTextWithTitleDto i() {
        return this.refund;
    }

    public final String toString() {
        return "MarketCommunityConditionsDto(delivery=" + this.delivery + ", payment=" + this.payment + ", refund=" + this.refund + ", ozonIntegrationSummary=" + this.ozonIntegrationSummary + ", integrationSummary=" + this.integrationSummary + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.delivery, i);
        parcel.writeParcelable(this.payment, i);
        parcel.writeParcelable(this.refund, i);
        parcel.writeParcelable(this.ozonIntegrationSummary, i);
        parcel.writeParcelable(this.integrationSummary, i);
    }

    public MarketCommunityConditionsDto(MarketTextWithTitleDto marketTextWithTitleDto, MarketTextWithTitleDto marketTextWithTitleDto2, MarketTextWithTitleDto marketTextWithTitleDto3, MarketTextWithTitleDto marketTextWithTitleDto4, MarketTextWithTitleDto marketTextWithTitleDto5) {
        this.delivery = marketTextWithTitleDto;
        this.payment = marketTextWithTitleDto2;
        this.refund = marketTextWithTitleDto3;
        this.ozonIntegrationSummary = marketTextWithTitleDto4;
        this.integrationSummary = marketTextWithTitleDto5;
    }

    public /* synthetic */ MarketCommunityConditionsDto(MarketTextWithTitleDto marketTextWithTitleDto, MarketTextWithTitleDto marketTextWithTitleDto2, MarketTextWithTitleDto marketTextWithTitleDto3, MarketTextWithTitleDto marketTextWithTitleDto4, MarketTextWithTitleDto marketTextWithTitleDto5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketTextWithTitleDto, (i & 2) != 0 ? null : marketTextWithTitleDto2, (i & 4) != 0 ? null : marketTextWithTitleDto3, (i & 8) != 0 ? null : marketTextWithTitleDto4, (i & 16) != 0 ? null : marketTextWithTitleDto5);
    }
}
