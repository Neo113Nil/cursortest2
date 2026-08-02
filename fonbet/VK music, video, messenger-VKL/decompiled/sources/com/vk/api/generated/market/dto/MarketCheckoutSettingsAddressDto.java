package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Y3;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketCheckoutSettingsAddressDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutSettingsAddressDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutSettingsAddressDto> CREATOR = new a();

    @pmi0(Y3.f)
    private final MarketCheckoutSettingsAddressCoordinatesDto coordinates;

    @pmi0("is_custom")
    private final Boolean isCustom;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCheckoutSettingsAddressDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutSettingsAddressDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsAddressDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Boolean bool = null;
            MarketCheckoutSettingsAddressCoordinatesDto createFromParcel = parcel.readInt() == 0 ? null : MarketCheckoutSettingsAddressCoordinatesDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketCheckoutSettingsAddressDto(readString, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsAddressDto[] newArray(int i) {
            return new MarketCheckoutSettingsAddressDto[i];
        }
    }

    public MarketCheckoutSettingsAddressDto() {
        this(null, null, null, 7, null);
    }

    public final MarketCheckoutSettingsAddressCoordinatesDto d() {
        return this.coordinates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isCustom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutSettingsAddressDto)) {
            return false;
        }
        MarketCheckoutSettingsAddressDto marketCheckoutSettingsAddressDto = (MarketCheckoutSettingsAddressDto) obj;
        return epx.f(this.title, marketCheckoutSettingsAddressDto.title) && epx.f(this.coordinates, marketCheckoutSettingsAddressDto.coordinates) && epx.f(this.isCustom, marketCheckoutSettingsAddressDto.isCustom);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        MarketCheckoutSettingsAddressCoordinatesDto marketCheckoutSettingsAddressCoordinatesDto = this.coordinates;
        int hashCode2 = (hashCode + (marketCheckoutSettingsAddressCoordinatesDto == null ? 0 : marketCheckoutSettingsAddressCoordinatesDto.hashCode())) * 31;
        Boolean bool = this.isCustom;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutSettingsAddressDto(title=");
        sb.append(this.title);
        sb.append(", coordinates=");
        sb.append(this.coordinates);
        sb.append(", isCustom=");
        return tn.a(sb, this.isCustom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        MarketCheckoutSettingsAddressCoordinatesDto marketCheckoutSettingsAddressCoordinatesDto = this.coordinates;
        if (marketCheckoutSettingsAddressCoordinatesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCheckoutSettingsAddressCoordinatesDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isCustom;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public MarketCheckoutSettingsAddressDto(String str, MarketCheckoutSettingsAddressCoordinatesDto marketCheckoutSettingsAddressCoordinatesDto, Boolean bool) {
        this.title = str;
        this.coordinates = marketCheckoutSettingsAddressCoordinatesDto;
        this.isCustom = bool;
    }

    public /* synthetic */ MarketCheckoutSettingsAddressDto(String str, MarketCheckoutSettingsAddressCoordinatesDto marketCheckoutSettingsAddressCoordinatesDto, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : marketCheckoutSettingsAddressCoordinatesDto, (i & 4) != 0 ? null : bool);
    }
}
