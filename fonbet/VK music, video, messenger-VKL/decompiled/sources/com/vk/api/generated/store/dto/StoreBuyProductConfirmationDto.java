package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoreBuyProductConfirmationDto.kt */
/* loaded from: classes15.dex */
public final class StoreBuyProductConfirmationDto implements Parcelable {
    public static final Parcelable.Creator<StoreBuyProductConfirmationDto> CREATOR = new a();

    @pmi0("balance")
    private final Integer balance;

    @pmi0("price")
    private final Integer price;

    /* compiled from: StoreBuyProductConfirmationDto.kt */
    public static final class a implements Parcelable.Creator<StoreBuyProductConfirmationDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreBuyProductConfirmationDto createFromParcel(Parcel parcel) {
            return new StoreBuyProductConfirmationDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreBuyProductConfirmationDto[] newArray(int i) {
            return new StoreBuyProductConfirmationDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoreBuyProductConfirmationDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreBuyProductConfirmationDto)) {
            return false;
        }
        StoreBuyProductConfirmationDto storeBuyProductConfirmationDto = (StoreBuyProductConfirmationDto) obj;
        return epx.f(this.price, storeBuyProductConfirmationDto.price) && epx.f(this.balance, storeBuyProductConfirmationDto.balance);
    }

    public final int hashCode() {
        Integer num = this.price;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.balance;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreBuyProductConfirmationDto(price=");
        sb.append(this.price);
        sb.append(", balance=");
        return uqi.b(sb, this.balance, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.price;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.balance;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public StoreBuyProductConfirmationDto(Integer num, Integer num2) {
        this.price = num;
        this.balance = num2;
    }

    public /* synthetic */ StoreBuyProductConfirmationDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
