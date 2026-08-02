package com.vk.ecomm.cart.impl.checkout.feature.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.pmi0;
import xsna.xq;

/* compiled from: CheckoutSettingsAddressDto.kt */
/* loaded from: classes18.dex */
public final class CheckoutSettingsCoordinatesDto implements Parcelable {
    public static final Parcelable.Creator<CheckoutSettingsCoordinatesDto> CREATOR = new a();

    @pmi0(O6.s)
    private final float lat;

    /* renamed from: long, reason: not valid java name */
    @pmi0("long")
    private final float f32long;

    /* compiled from: CheckoutSettingsAddressDto.kt */
    public static final class a implements Parcelable.Creator<CheckoutSettingsCoordinatesDto> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutSettingsCoordinatesDto createFromParcel(Parcel parcel) {
            return new CheckoutSettingsCoordinatesDto(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutSettingsCoordinatesDto[] newArray(int i) {
            return new CheckoutSettingsCoordinatesDto[i];
        }
    }

    public CheckoutSettingsCoordinatesDto(float f, float f2) {
        this.lat = f;
        this.f32long = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutSettingsCoordinatesDto)) {
            return false;
        }
        CheckoutSettingsCoordinatesDto checkoutSettingsCoordinatesDto = (CheckoutSettingsCoordinatesDto) obj;
        return Float.compare(this.lat, checkoutSettingsCoordinatesDto.lat) == 0 && Float.compare(this.f32long, checkoutSettingsCoordinatesDto.f32long) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32long) + (Float.hashCode(this.lat) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutSettingsCoordinatesDto(lat=");
        sb.append(this.lat);
        sb.append(", long=");
        return xq.c(')', this.f32long, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.lat);
        parcel.writeFloat(this.f32long);
    }
}
