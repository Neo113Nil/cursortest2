package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VmojiProductPriceDto.kt */
/* loaded from: classes15.dex */
public final class VmojiProductPriceDto implements Parcelable {
    public static final Parcelable.Creator<VmojiProductPriceDto> CREATOR = new a();

    @pmi0("current")
    private final int current;

    @pmi0("discount")
    private final Integer discount;

    @pmi0("regular")
    private final Integer regular;

    /* compiled from: VmojiProductPriceDto.kt */
    public static final class a implements Parcelable.Creator<VmojiProductPriceDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiProductPriceDto createFromParcel(Parcel parcel) {
            return new VmojiProductPriceDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiProductPriceDto[] newArray(int i) {
            return new VmojiProductPriceDto[i];
        }
    }

    public VmojiProductPriceDto(int i, Integer num, Integer num2) {
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
        return this.regular;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiProductPriceDto)) {
            return false;
        }
        VmojiProductPriceDto vmojiProductPriceDto = (VmojiProductPriceDto) obj;
        return this.current == vmojiProductPriceDto.current && epx.f(this.regular, vmojiProductPriceDto.regular) && epx.f(this.discount, vmojiProductPriceDto.discount);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.current) * 31;
        Integer num = this.regular;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discount;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiProductPriceDto(current=");
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

    public /* synthetic */ VmojiProductPriceDto(int i, Integer num, Integer num2, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
    }
}
