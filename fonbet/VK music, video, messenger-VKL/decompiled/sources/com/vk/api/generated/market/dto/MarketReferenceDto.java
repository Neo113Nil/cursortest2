package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketReferenceDto.kt */
/* loaded from: classes15.dex */
public final class MarketReferenceDto implements Parcelable {
    public static final Parcelable.Creator<MarketReferenceDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("address_details")
    private final MarketAddressDetailsDto addressDetails;

    @pmi0("location")
    private final MarketLocationDto location;

    /* compiled from: MarketReferenceDto.kt */
    public static final class a implements Parcelable.Creator<MarketReferenceDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketReferenceDto createFromParcel(Parcel parcel) {
            return new MarketReferenceDto(MarketLocationDto.CREATOR.createFromParcel(parcel), parcel.readString(), MarketAddressDetailsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketReferenceDto[] newArray(int i) {
            return new MarketReferenceDto[i];
        }
    }

    public MarketReferenceDto(MarketLocationDto marketLocationDto, String str, MarketAddressDetailsDto marketAddressDetailsDto) {
        this.location = marketLocationDto;
        this.address = str;
        this.addressDetails = marketAddressDetailsDto;
    }

    public final String d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketAddressDetailsDto e() {
        return this.addressDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketReferenceDto)) {
            return false;
        }
        MarketReferenceDto marketReferenceDto = (MarketReferenceDto) obj;
        return epx.f(this.location, marketReferenceDto.location) && epx.f(this.address, marketReferenceDto.address) && epx.f(this.addressDetails, marketReferenceDto.addressDetails);
    }

    public final MarketLocationDto f() {
        return this.location;
    }

    public final int hashCode() {
        return this.addressDetails.hashCode() + urd0.a(this.location.hashCode() * 31, 31, this.address);
    }

    public final String toString() {
        return "MarketReferenceDto(location=" + this.location + ", address=" + this.address + ", addressDetails=" + this.addressDetails + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.location.writeToParcel(parcel, i);
        parcel.writeString(this.address);
        this.addressDetails.writeToParcel(parcel, i);
    }
}
