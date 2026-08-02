package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MoneyCardDto.kt */
/* loaded from: classes15.dex */
public final class MoneyCardDto implements Parcelable {
    public static final Parcelable.Creator<MoneyCardDto> CREATOR = new a();

    @pmi0("fee")
    private final MoneyCardFeeDto fee;

    @pmi0("id")
    private final String id;

    @pmi0("number")
    private final String number;

    @pmi0("p2p_fee")
    private final MoneyCardFeeDto p2pFee;

    @pmi0("type")
    private final String type;

    @pmi0("vkpay_fee")
    private final MoneyCardFeeDto vkpayFee;

    /* compiled from: MoneyCardDto.kt */
    public static final class a implements Parcelable.Creator<MoneyCardDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyCardDto createFromParcel(Parcel parcel) {
            return new MoneyCardDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MoneyCardFeeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MoneyCardFeeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MoneyCardFeeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyCardDto[] newArray(int i) {
            return new MoneyCardDto[i];
        }
    }

    public MoneyCardDto(String str, String str2, String str3, MoneyCardFeeDto moneyCardFeeDto, MoneyCardFeeDto moneyCardFeeDto2, MoneyCardFeeDto moneyCardFeeDto3) {
        this.id = str;
        this.number = str2;
        this.type = str3;
        this.fee = moneyCardFeeDto;
        this.p2pFee = moneyCardFeeDto2;
        this.vkpayFee = moneyCardFeeDto3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyCardDto)) {
            return false;
        }
        MoneyCardDto moneyCardDto = (MoneyCardDto) obj;
        return epx.f(this.id, moneyCardDto.id) && epx.f(this.number, moneyCardDto.number) && epx.f(this.type, moneyCardDto.type) && epx.f(this.fee, moneyCardDto.fee) && epx.f(this.p2pFee, moneyCardDto.p2pFee) && epx.f(this.vkpayFee, moneyCardDto.vkpayFee);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.number), 31, this.type);
        MoneyCardFeeDto moneyCardFeeDto = this.fee;
        int hashCode = (a2 + (moneyCardFeeDto == null ? 0 : moneyCardFeeDto.hashCode())) * 31;
        MoneyCardFeeDto moneyCardFeeDto2 = this.p2pFee;
        int hashCode2 = (hashCode + (moneyCardFeeDto2 == null ? 0 : moneyCardFeeDto2.hashCode())) * 31;
        MoneyCardFeeDto moneyCardFeeDto3 = this.vkpayFee;
        return hashCode2 + (moneyCardFeeDto3 != null ? moneyCardFeeDto3.hashCode() : 0);
    }

    public final String toString() {
        return "MoneyCardDto(id=" + this.id + ", number=" + this.number + ", type=" + this.type + ", fee=" + this.fee + ", p2pFee=" + this.p2pFee + ", vkpayFee=" + this.vkpayFee + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.number);
        parcel.writeString(this.type);
        MoneyCardFeeDto moneyCardFeeDto = this.fee;
        if (moneyCardFeeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moneyCardFeeDto.writeToParcel(parcel, i);
        }
        MoneyCardFeeDto moneyCardFeeDto2 = this.p2pFee;
        if (moneyCardFeeDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moneyCardFeeDto2.writeToParcel(parcel, i);
        }
        MoneyCardFeeDto moneyCardFeeDto3 = this.vkpayFee;
        if (moneyCardFeeDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moneyCardFeeDto3.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MoneyCardDto(String str, String str2, String str3, MoneyCardFeeDto moneyCardFeeDto, MoneyCardFeeDto moneyCardFeeDto2, MoneyCardFeeDto moneyCardFeeDto3, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : moneyCardFeeDto, (i & 16) != 0 ? null : moneyCardFeeDto2, (i & 32) != 0 ? null : moneyCardFeeDto3);
    }
}
