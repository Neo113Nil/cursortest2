package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VkRunDatePeriodDto.kt */
/* loaded from: classes15.dex */
public final class VkRunDatePeriodDto implements Parcelable {
    public static final Parcelable.Creator<VkRunDatePeriodDto> CREATOR = new a();

    @pmi0("days_total")
    private final Integer daysTotal;

    @pmi0("from")
    private final String from;

    @pmi0("to")
    private final String to;

    /* compiled from: VkRunDatePeriodDto.kt */
    public static final class a implements Parcelable.Creator<VkRunDatePeriodDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunDatePeriodDto createFromParcel(Parcel parcel) {
            return new VkRunDatePeriodDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunDatePeriodDto[] newArray(int i) {
            return new VkRunDatePeriodDto[i];
        }
    }

    public VkRunDatePeriodDto(String str, String str2, Integer num) {
        this.from = str;
        this.to = str2;
        this.daysTotal = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunDatePeriodDto)) {
            return false;
        }
        VkRunDatePeriodDto vkRunDatePeriodDto = (VkRunDatePeriodDto) obj;
        return epx.f(this.from, vkRunDatePeriodDto.from) && epx.f(this.to, vkRunDatePeriodDto.to) && epx.f(this.daysTotal, vkRunDatePeriodDto.daysTotal);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.from.hashCode() * 31, 31, this.to);
        Integer num = this.daysTotal;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunDatePeriodDto(from=");
        sb.append(this.from);
        sb.append(", to=");
        sb.append(this.to);
        sb.append(", daysTotal=");
        return uqi.b(sb, this.daysTotal, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        Integer num = this.daysTotal;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VkRunDatePeriodDto(String str, String str2, Integer num, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : num);
    }
}
