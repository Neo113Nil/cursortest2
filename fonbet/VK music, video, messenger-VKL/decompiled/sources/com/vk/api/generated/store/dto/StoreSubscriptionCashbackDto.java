package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoreSubscriptionCashbackDto.kt */
/* loaded from: classes15.dex */
public final class StoreSubscriptionCashbackDto implements Parcelable {
    public static final Parcelable.Creator<StoreSubscriptionCashbackDto> CREATOR = new a();

    @pmi0("amount")
    private final StorePriceDto amount;

    @pmi0("amount_percent")
    private final Integer amountPercent;

    @pmi0("months")
    private final Integer months;

    /* compiled from: StoreSubscriptionCashbackDto.kt */
    public static final class a implements Parcelable.Creator<StoreSubscriptionCashbackDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreSubscriptionCashbackDto createFromParcel(Parcel parcel) {
            return new StoreSubscriptionCashbackDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : StorePriceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreSubscriptionCashbackDto[] newArray(int i) {
            return new StoreSubscriptionCashbackDto[i];
        }
    }

    public StoreSubscriptionCashbackDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreSubscriptionCashbackDto)) {
            return false;
        }
        StoreSubscriptionCashbackDto storeSubscriptionCashbackDto = (StoreSubscriptionCashbackDto) obj;
        return epx.f(this.amountPercent, storeSubscriptionCashbackDto.amountPercent) && epx.f(this.amount, storeSubscriptionCashbackDto.amount) && epx.f(this.months, storeSubscriptionCashbackDto.months);
    }

    public final int hashCode() {
        Integer num = this.amountPercent;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        StorePriceDto storePriceDto = this.amount;
        int hashCode2 = (hashCode + (storePriceDto == null ? 0 : storePriceDto.hashCode())) * 31;
        Integer num2 = this.months;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreSubscriptionCashbackDto(amountPercent=");
        sb.append(this.amountPercent);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", months=");
        return uqi.b(sb, this.months, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.amountPercent;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        StorePriceDto storePriceDto = this.amount;
        if (storePriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storePriceDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.months;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public StoreSubscriptionCashbackDto(Integer num, StorePriceDto storePriceDto, Integer num2) {
        this.amountPercent = num;
        this.amount = storePriceDto;
        this.months = num2;
    }

    public /* synthetic */ StoreSubscriptionCashbackDto(Integer num, StorePriceDto storePriceDto, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : storePriceDto, (i & 4) != 0 ? null : num2);
    }
}
