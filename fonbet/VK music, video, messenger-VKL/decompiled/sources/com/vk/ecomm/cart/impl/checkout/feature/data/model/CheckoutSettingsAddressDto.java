package com.vk.ecomm.cart.impl.checkout.feature.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Y3;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: CheckoutSettingsAddressDto.kt */
/* loaded from: classes18.dex */
public final class CheckoutSettingsAddressDto implements Parcelable {
    public static final Parcelable.Creator<CheckoutSettingsAddressDto> CREATOR = new a();

    @pmi0(Y3.f)
    private final CheckoutSettingsCoordinatesDto coordinates;

    @pmi0("is_custom")
    private final boolean isCustom;

    @pmi0("title")
    private final String title;

    /* compiled from: CheckoutSettingsAddressDto.kt */
    public static final class a implements Parcelable.Creator<CheckoutSettingsAddressDto> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutSettingsAddressDto createFromParcel(Parcel parcel) {
            return new CheckoutSettingsAddressDto(parcel.readString(), parcel.readInt() == 0 ? null : CheckoutSettingsCoordinatesDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutSettingsAddressDto[] newArray(int i) {
            return new CheckoutSettingsAddressDto[i];
        }
    }

    public CheckoutSettingsAddressDto(String str, CheckoutSettingsCoordinatesDto checkoutSettingsCoordinatesDto, boolean z) {
        this.title = str;
        this.coordinates = checkoutSettingsCoordinatesDto;
        this.isCustom = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutSettingsAddressDto)) {
            return false;
        }
        CheckoutSettingsAddressDto checkoutSettingsAddressDto = (CheckoutSettingsAddressDto) obj;
        return epx.f(this.title, checkoutSettingsAddressDto.title) && epx.f(this.coordinates, checkoutSettingsAddressDto.coordinates) && this.isCustom == checkoutSettingsAddressDto.isCustom;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        CheckoutSettingsCoordinatesDto checkoutSettingsCoordinatesDto = this.coordinates;
        return Boolean.hashCode(this.isCustom) + ((hashCode + (checkoutSettingsCoordinatesDto == null ? 0 : checkoutSettingsCoordinatesDto.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutSettingsAddressDto(title=");
        sb.append(this.title);
        sb.append(", coordinates=");
        sb.append(this.coordinates);
        sb.append(", isCustom=");
        return q0.a(sb, this.isCustom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        CheckoutSettingsCoordinatesDto checkoutSettingsCoordinatesDto = this.coordinates;
        if (checkoutSettingsCoordinatesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            checkoutSettingsCoordinatesDto.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isCustom ? 1 : 0);
    }
}
