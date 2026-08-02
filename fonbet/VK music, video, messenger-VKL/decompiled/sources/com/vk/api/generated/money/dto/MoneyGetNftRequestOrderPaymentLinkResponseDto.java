package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MoneyGetNftRequestOrderPaymentLinkResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetNftRequestOrderPaymentLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetNftRequestOrderPaymentLinkResponseDto> CREATOR = new a();

    @pmi0("payment_link")
    private final String paymentLink;

    /* compiled from: MoneyGetNftRequestOrderPaymentLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetNftRequestOrderPaymentLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetNftRequestOrderPaymentLinkResponseDto createFromParcel(Parcel parcel) {
            return new MoneyGetNftRequestOrderPaymentLinkResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetNftRequestOrderPaymentLinkResponseDto[] newArray(int i) {
            return new MoneyGetNftRequestOrderPaymentLinkResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoneyGetNftRequestOrderPaymentLinkResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneyGetNftRequestOrderPaymentLinkResponseDto) && epx.f(this.paymentLink, ((MoneyGetNftRequestOrderPaymentLinkResponseDto) obj).paymentLink);
    }

    public final int hashCode() {
        String str = this.paymentLink;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MoneyGetNftRequestOrderPaymentLinkResponseDto(paymentLink="), this.paymentLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.paymentLink);
    }

    public MoneyGetNftRequestOrderPaymentLinkResponseDto(String str) {
        this.paymentLink = str;
    }

    public /* synthetic */ MoneyGetNftRequestOrderPaymentLinkResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
