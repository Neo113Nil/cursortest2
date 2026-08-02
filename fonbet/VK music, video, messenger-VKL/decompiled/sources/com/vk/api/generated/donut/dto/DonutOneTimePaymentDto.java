package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: DonutOneTimePaymentDto.kt */
/* loaded from: classes14.dex */
public final class DonutOneTimePaymentDto implements Parcelable {
    public static final Parcelable.Creator<DonutOneTimePaymentDto> CREATOR = new a();

    @pmi0("amount")
    private final int amount;

    @pmi0("count")
    private final Integer count;

    @pmi0("sender_id")
    private final UserId senderId;

    /* compiled from: DonutOneTimePaymentDto.kt */
    public static final class a implements Parcelable.Creator<DonutOneTimePaymentDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutOneTimePaymentDto createFromParcel(Parcel parcel) {
            return new DonutOneTimePaymentDto((UserId) parcel.readParcelable(DonutOneTimePaymentDto.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutOneTimePaymentDto[] newArray(int i) {
            return new DonutOneTimePaymentDto[i];
        }
    }

    public DonutOneTimePaymentDto(UserId userId, int i, Integer num) {
        this.senderId = userId;
        this.amount = i;
        this.count = num;
    }

    public final int d() {
        return this.amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.senderId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutOneTimePaymentDto)) {
            return false;
        }
        DonutOneTimePaymentDto donutOneTimePaymentDto = (DonutOneTimePaymentDto) obj;
        return epx.f(this.senderId, donutOneTimePaymentDto.senderId) && this.amount == donutOneTimePaymentDto.amount && epx.f(this.count, donutOneTimePaymentDto.count);
    }

    public final int hashCode() {
        int a2 = shy.a(this.amount, Long.hashCode(this.senderId.b) * 31, 31);
        Integer num = this.count;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutOneTimePaymentDto(senderId=");
        sb.append(this.senderId);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.senderId, i);
        parcel.writeInt(this.amount);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ DonutOneTimePaymentDto(UserId userId, int i, Integer num, int i2, zcl zclVar) {
        this(userId, i, (i2 & 4) != 0 ? null : num);
    }
}
