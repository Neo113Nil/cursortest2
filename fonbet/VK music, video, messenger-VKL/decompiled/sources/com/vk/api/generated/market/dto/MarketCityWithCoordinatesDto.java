package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Y3;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCityWithCoordinatesDto.kt */
/* loaded from: classes15.dex */
public final class MarketCityWithCoordinatesDto implements Parcelable {
    public static final Parcelable.Creator<MarketCityWithCoordinatesDto> CREATOR = new a();

    @pmi0(Y3.f)
    private final MarketCheckoutSettingsAddressCoordinatesDto coordinates;

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCityWithCoordinatesDto.kt */
    public static final class a implements Parcelable.Creator<MarketCityWithCoordinatesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCityWithCoordinatesDto createFromParcel(Parcel parcel) {
            return new MarketCityWithCoordinatesDto(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : MarketCheckoutSettingsAddressCoordinatesDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCityWithCoordinatesDto[] newArray(int i) {
            return new MarketCityWithCoordinatesDto[i];
        }
    }

    public MarketCityWithCoordinatesDto(int i, String str, MarketCheckoutSettingsAddressCoordinatesDto marketCheckoutSettingsAddressCoordinatesDto) {
        this.id = i;
        this.title = str;
        this.coordinates = marketCheckoutSettingsAddressCoordinatesDto;
    }

    public final MarketCheckoutSettingsAddressCoordinatesDto d() {
        return this.coordinates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCityWithCoordinatesDto)) {
            return false;
        }
        MarketCityWithCoordinatesDto marketCityWithCoordinatesDto = (MarketCityWithCoordinatesDto) obj;
        return this.id == marketCityWithCoordinatesDto.id && epx.f(this.title, marketCityWithCoordinatesDto.title) && epx.f(this.coordinates, marketCityWithCoordinatesDto.coordinates);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        MarketCheckoutSettingsAddressCoordinatesDto marketCheckoutSettingsAddressCoordinatesDto = this.coordinates;
        return a2 + (marketCheckoutSettingsAddressCoordinatesDto == null ? 0 : marketCheckoutSettingsAddressCoordinatesDto.hashCode());
    }

    public final String toString() {
        return "MarketCityWithCoordinatesDto(id=" + this.id + ", title=" + this.title + ", coordinates=" + this.coordinates + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        MarketCheckoutSettingsAddressCoordinatesDto marketCheckoutSettingsAddressCoordinatesDto = this.coordinates;
        if (marketCheckoutSettingsAddressCoordinatesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCheckoutSettingsAddressCoordinatesDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketCityWithCoordinatesDto(int i, String str, MarketCheckoutSettingsAddressCoordinatesDto marketCheckoutSettingsAddressCoordinatesDto, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : marketCheckoutSettingsAddressCoordinatesDto);
    }
}
