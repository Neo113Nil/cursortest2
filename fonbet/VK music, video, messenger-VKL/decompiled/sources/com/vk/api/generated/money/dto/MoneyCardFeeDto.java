package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MoneyCardFeeDto.kt */
/* loaded from: classes15.dex */
public final class MoneyCardFeeDto implements Parcelable {
    public static final Parcelable.Creator<MoneyCardFeeDto> CREATOR = new a();

    @pmi0("add_amount")
    private final int addAmount;

    @pmi0("free_amount_min")
    private final Integer freeAmountMin;

    @pmi0("free_amount_rest")
    private final Integer freeAmountRest;

    @pmi0("min_amount")
    private final int minAmount;

    @pmi0("percent")
    private final float percent;

    /* compiled from: MoneyCardFeeDto.kt */
    public static final class a implements Parcelable.Creator<MoneyCardFeeDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyCardFeeDto createFromParcel(Parcel parcel) {
            return new MoneyCardFeeDto(parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyCardFeeDto[] newArray(int i) {
            return new MoneyCardFeeDto[i];
        }
    }

    public MoneyCardFeeDto(float f, int i, int i2, Integer num, Integer num2) {
        this.percent = f;
        this.minAmount = i;
        this.addAmount = i2;
        this.freeAmountMin = num;
        this.freeAmountRest = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyCardFeeDto)) {
            return false;
        }
        MoneyCardFeeDto moneyCardFeeDto = (MoneyCardFeeDto) obj;
        return Float.compare(this.percent, moneyCardFeeDto.percent) == 0 && this.minAmount == moneyCardFeeDto.minAmount && this.addAmount == moneyCardFeeDto.addAmount && epx.f(this.freeAmountMin, moneyCardFeeDto.freeAmountMin) && epx.f(this.freeAmountRest, moneyCardFeeDto.freeAmountRest);
    }

    public final int hashCode() {
        int a2 = shy.a(this.addAmount, shy.a(this.minAmount, Float.hashCode(this.percent) * 31, 31), 31);
        Integer num = this.freeAmountMin;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.freeAmountRest;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyCardFeeDto(percent=");
        sb.append(this.percent);
        sb.append(", minAmount=");
        sb.append(this.minAmount);
        sb.append(", addAmount=");
        sb.append(this.addAmount);
        sb.append(", freeAmountMin=");
        sb.append(this.freeAmountMin);
        sb.append(", freeAmountRest=");
        return uqi.b(sb, this.freeAmountRest, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.percent);
        parcel.writeInt(this.minAmount);
        parcel.writeInt(this.addAmount);
        Integer num = this.freeAmountMin;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.freeAmountRest;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ MoneyCardFeeDto(float f, int i, int i2, Integer num, Integer num2, int i3, zcl zclVar) {
        this(f, i, i2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2);
    }
}
