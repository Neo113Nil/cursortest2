package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketItemPropertyValueDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemPropertyValueDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemPropertyValueDto> CREATOR = new a();

    @pmi0("property_name")
    private final String propertyName;

    @pmi0("variant_id")
    private final int variantId;

    @pmi0("variant_name")
    private final String variantName;

    /* compiled from: MarketItemPropertyValueDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemPropertyValueDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemPropertyValueDto createFromParcel(Parcel parcel) {
            return new MarketItemPropertyValueDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemPropertyValueDto[] newArray(int i) {
            return new MarketItemPropertyValueDto[i];
        }
    }

    public MarketItemPropertyValueDto(int i, String str, String str2) {
        this.variantId = i;
        this.variantName = str;
        this.propertyName = str2;
    }

    public final String d() {
        return this.variantName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.propertyName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemPropertyValueDto)) {
            return false;
        }
        MarketItemPropertyValueDto marketItemPropertyValueDto = (MarketItemPropertyValueDto) obj;
        return this.variantId == marketItemPropertyValueDto.variantId && epx.f(this.variantName, marketItemPropertyValueDto.variantName) && epx.f(this.propertyName, marketItemPropertyValueDto.propertyName);
    }

    public final String f() {
        return this.propertyName;
    }

    public final String g() {
        return this.variantName;
    }

    public final int hashCode() {
        return this.propertyName.hashCode() + urd0.a(Integer.hashCode(this.variantId) * 31, 31, this.variantName);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemPropertyValueDto(variantId=");
        sb.append(this.variantId);
        sb.append(", variantName=");
        sb.append(this.variantName);
        sb.append(", propertyName=");
        return ho8.a(sb, this.propertyName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.variantId);
        parcel.writeString(this.variantName);
        parcel.writeString(this.propertyName);
    }
}
