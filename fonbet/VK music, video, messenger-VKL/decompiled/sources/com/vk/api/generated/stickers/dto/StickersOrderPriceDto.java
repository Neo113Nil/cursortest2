package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StickersOrderPriceDto.kt */
/* loaded from: classes15.dex */
public final class StickersOrderPriceDto implements Parcelable {
    public static final Parcelable.Creator<StickersOrderPriceDto> CREATOR = new a();

    @pmi0("current")
    private final int current;

    @pmi0("discount")
    private final Integer discount;

    @pmi0("regular")
    private final Integer regular;

    /* compiled from: StickersOrderPriceDto.kt */
    public static final class a implements Parcelable.Creator<StickersOrderPriceDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersOrderPriceDto createFromParcel(Parcel parcel) {
            return new StickersOrderPriceDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersOrderPriceDto[] newArray(int i) {
            return new StickersOrderPriceDto[i];
        }
    }

    public StickersOrderPriceDto(int i, Integer num, Integer num2) {
        this.current = i;
        this.regular = num;
        this.discount = num2;
    }

    public final int d() {
        return this.current;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.discount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersOrderPriceDto)) {
            return false;
        }
        StickersOrderPriceDto stickersOrderPriceDto = (StickersOrderPriceDto) obj;
        return this.current == stickersOrderPriceDto.current && epx.f(this.regular, stickersOrderPriceDto.regular) && epx.f(this.discount, stickersOrderPriceDto.discount);
    }

    public final Integer f() {
        return this.regular;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.current) * 31;
        Integer num = this.regular;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discount;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersOrderPriceDto(current=");
        sb.append(this.current);
        sb.append(", regular=");
        sb.append(this.regular);
        sb.append(", discount=");
        return uqi.b(sb, this.discount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.current);
        Integer num = this.regular;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.discount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ StickersOrderPriceDto(int i, Integer num, Integer num2, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
    }
}
