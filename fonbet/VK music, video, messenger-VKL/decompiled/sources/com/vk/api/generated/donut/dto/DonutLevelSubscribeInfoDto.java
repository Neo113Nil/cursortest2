package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: DonutLevelSubscribeInfoDto.kt */
/* loaded from: classes14.dex */
public final class DonutLevelSubscribeInfoDto implements Parcelable {
    public static final Parcelable.Creator<DonutLevelSubscribeInfoDto> CREATOR = new a();

    @pmi0("month_amount")
    private final int monthAmount;

    @pmi0("month_next_payment_date")
    private final int monthNextPaymentDate;

    @pmi0("month_payment")
    private final int monthPayment;

    @pmi0("year_amount")
    private final int yearAmount;

    @pmi0("year_next_payment_date")
    private final int yearNextPaymentDate;

    @pmi0("year_payment")
    private final int yearPayment;

    /* compiled from: DonutLevelSubscribeInfoDto.kt */
    public static final class a implements Parcelable.Creator<DonutLevelSubscribeInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutLevelSubscribeInfoDto createFromParcel(Parcel parcel) {
            return new DonutLevelSubscribeInfoDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutLevelSubscribeInfoDto[] newArray(int i) {
            return new DonutLevelSubscribeInfoDto[i];
        }
    }

    public DonutLevelSubscribeInfoDto(int i, int i2, int i3, int i4, int i5, int i6) {
        this.monthPayment = i;
        this.monthAmount = i2;
        this.monthNextPaymentDate = i3;
        this.yearPayment = i4;
        this.yearAmount = i5;
        this.yearNextPaymentDate = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutLevelSubscribeInfoDto)) {
            return false;
        }
        DonutLevelSubscribeInfoDto donutLevelSubscribeInfoDto = (DonutLevelSubscribeInfoDto) obj;
        return this.monthPayment == donutLevelSubscribeInfoDto.monthPayment && this.monthAmount == donutLevelSubscribeInfoDto.monthAmount && this.monthNextPaymentDate == donutLevelSubscribeInfoDto.monthNextPaymentDate && this.yearPayment == donutLevelSubscribeInfoDto.yearPayment && this.yearAmount == donutLevelSubscribeInfoDto.yearAmount && this.yearNextPaymentDate == donutLevelSubscribeInfoDto.yearNextPaymentDate;
    }

    public final int hashCode() {
        return Integer.hashCode(this.yearNextPaymentDate) + shy.a(this.yearAmount, shy.a(this.yearPayment, shy.a(this.monthNextPaymentDate, shy.a(this.monthAmount, Integer.hashCode(this.monthPayment) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutLevelSubscribeInfoDto(monthPayment=");
        sb.append(this.monthPayment);
        sb.append(", monthAmount=");
        sb.append(this.monthAmount);
        sb.append(", monthNextPaymentDate=");
        sb.append(this.monthNextPaymentDate);
        sb.append(", yearPayment=");
        sb.append(this.yearPayment);
        sb.append(", yearAmount=");
        sb.append(this.yearAmount);
        sb.append(", yearNextPaymentDate=");
        return vu5.b(sb, this.yearNextPaymentDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.monthPayment);
        parcel.writeInt(this.monthAmount);
        parcel.writeInt(this.monthNextPaymentDate);
        parcel.writeInt(this.yearPayment);
        parcel.writeInt(this.yearAmount);
        parcel.writeInt(this.yearNextPaymentDate);
    }
}
