package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketOrderPaymentDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderPaymentDto implements Parcelable {
    public static final Parcelable.Creator<MarketOrderPaymentDto> CREATOR = new a();

    @pmi0("payment_status")
    private final String paymentStatus;

    @pmi0("receipt_link")
    private final String receiptLink;

    @pmi0("status")
    private final String status;

    /* compiled from: MarketOrderPaymentDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderPaymentDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderPaymentDto createFromParcel(Parcel parcel) {
            return new MarketOrderPaymentDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderPaymentDto[] newArray(int i) {
            return new MarketOrderPaymentDto[i];
        }
    }

    public MarketOrderPaymentDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.receiptLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderPaymentDto)) {
            return false;
        }
        MarketOrderPaymentDto marketOrderPaymentDto = (MarketOrderPaymentDto) obj;
        return epx.f(this.status, marketOrderPaymentDto.status) && epx.f(this.receiptLink, marketOrderPaymentDto.receiptLink) && epx.f(this.paymentStatus, marketOrderPaymentDto.paymentStatus);
    }

    public final int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.receiptLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentStatus;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketOrderPaymentDto(status=");
        sb.append(this.status);
        sb.append(", receiptLink=");
        sb.append(this.receiptLink);
        sb.append(", paymentStatus=");
        return ho8.a(sb, this.paymentStatus, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.status);
        parcel.writeString(this.receiptLink);
        parcel.writeString(this.paymentStatus);
    }

    public MarketOrderPaymentDto(String str, String str2, String str3) {
        this.status = str;
        this.receiptLink = str2;
        this.paymentStatus = str3;
    }

    public /* synthetic */ MarketOrderPaymentDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
