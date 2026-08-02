package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StoreAdditionalViewPriceDto.kt */
/* loaded from: classes15.dex */
public final class StoreAdditionalViewPriceDto implements Parcelable {
    public static final Parcelable.Creator<StoreAdditionalViewPriceDto> CREATOR = new a();

    @pmi0("price_str")
    private final String priceStr;

    /* compiled from: StoreAdditionalViewPriceDto.kt */
    public static final class a implements Parcelable.Creator<StoreAdditionalViewPriceDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreAdditionalViewPriceDto createFromParcel(Parcel parcel) {
            return new StoreAdditionalViewPriceDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreAdditionalViewPriceDto[] newArray(int i) {
            return new StoreAdditionalViewPriceDto[i];
        }
    }

    public StoreAdditionalViewPriceDto(String str) {
        this.priceStr = str;
    }

    public final String d() {
        return this.priceStr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreAdditionalViewPriceDto) && epx.f(this.priceStr, ((StoreAdditionalViewPriceDto) obj).priceStr);
    }

    public final int hashCode() {
        return this.priceStr.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("StoreAdditionalViewPriceDto(priceStr="), this.priceStr, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.priceStr);
    }
}
