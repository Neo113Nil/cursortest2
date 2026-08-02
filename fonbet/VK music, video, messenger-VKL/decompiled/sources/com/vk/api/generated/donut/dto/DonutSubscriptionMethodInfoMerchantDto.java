package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: DonutSubscriptionMethodInfoMerchantDto.kt */
/* loaded from: classes14.dex */
public final class DonutSubscriptionMethodInfoMerchantDto implements Parcelable {
    public static final Parcelable.Creator<DonutSubscriptionMethodInfoMerchantDto> CREATOR = new a();

    @pmi0("data")
    private final String data;

    @pmi0("id")
    private final int id;

    @pmi0("sign")
    private final String sign;

    /* compiled from: DonutSubscriptionMethodInfoMerchantDto.kt */
    public static final class a implements Parcelable.Creator<DonutSubscriptionMethodInfoMerchantDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutSubscriptionMethodInfoMerchantDto createFromParcel(Parcel parcel) {
            return new DonutSubscriptionMethodInfoMerchantDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutSubscriptionMethodInfoMerchantDto[] newArray(int i) {
            return new DonutSubscriptionMethodInfoMerchantDto[i];
        }
    }

    public DonutSubscriptionMethodInfoMerchantDto(int i, String str, String str2) {
        this.id = i;
        this.data = str;
        this.sign = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutSubscriptionMethodInfoMerchantDto)) {
            return false;
        }
        DonutSubscriptionMethodInfoMerchantDto donutSubscriptionMethodInfoMerchantDto = (DonutSubscriptionMethodInfoMerchantDto) obj;
        return this.id == donutSubscriptionMethodInfoMerchantDto.id && epx.f(this.data, donutSubscriptionMethodInfoMerchantDto.data) && epx.f(this.sign, donutSubscriptionMethodInfoMerchantDto.sign);
    }

    public final int hashCode() {
        return this.sign.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.data);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutSubscriptionMethodInfoMerchantDto(id=");
        sb.append(this.id);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", sign=");
        return ho8.a(sb, this.sign, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.data);
        parcel.writeString(this.sign);
    }
}
