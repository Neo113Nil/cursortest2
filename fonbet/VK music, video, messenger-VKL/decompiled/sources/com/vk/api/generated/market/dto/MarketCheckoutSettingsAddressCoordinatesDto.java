package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: MarketCheckoutSettingsAddressCoordinatesDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutSettingsAddressCoordinatesDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutSettingsAddressCoordinatesDto> CREATOR = new a();

    @pmi0(O6.s)
    private final Float lat;

    /* renamed from: long, reason: not valid java name */
    @pmi0("long")
    private final Float f8long;

    /* compiled from: MarketCheckoutSettingsAddressCoordinatesDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutSettingsAddressCoordinatesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsAddressCoordinatesDto createFromParcel(Parcel parcel) {
            return new MarketCheckoutSettingsAddressCoordinatesDto(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsAddressCoordinatesDto[] newArray(int i) {
            return new MarketCheckoutSettingsAddressCoordinatesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketCheckoutSettingsAddressCoordinatesDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Float d() {
        return this.lat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.f8long;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutSettingsAddressCoordinatesDto)) {
            return false;
        }
        MarketCheckoutSettingsAddressCoordinatesDto marketCheckoutSettingsAddressCoordinatesDto = (MarketCheckoutSettingsAddressCoordinatesDto) obj;
        return epx.f(this.lat, marketCheckoutSettingsAddressCoordinatesDto.lat) && epx.f(this.f8long, marketCheckoutSettingsAddressCoordinatesDto.f8long);
    }

    public final int hashCode() {
        Float f = this.lat;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.f8long;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutSettingsAddressCoordinatesDto(lat=");
        sb.append(this.lat);
        sb.append(", long=");
        return so.b(sb, this.f8long, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.lat;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.f8long;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
    }

    public MarketCheckoutSettingsAddressCoordinatesDto(Float f, Float f2) {
        this.lat = f;
        this.f8long = f2;
    }

    public /* synthetic */ MarketCheckoutSettingsAddressCoordinatesDto(Float f, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }
}
