package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: DonutGroupSettingsGoalLimitRangeDto.kt */
/* loaded from: classes14.dex */
public final class DonutGroupSettingsGoalLimitRangeDto implements Parcelable {
    public static final Parcelable.Creator<DonutGroupSettingsGoalLimitRangeDto> CREATOR = new a();

    @pmi0(InneractiveMediationNameConsts.MAX)
    private final int max;

    @pmi0(UcumUtils.UCUM_MINUTES)
    private final int min;

    /* compiled from: DonutGroupSettingsGoalLimitRangeDto.kt */
    public static final class a implements Parcelable.Creator<DonutGroupSettingsGoalLimitRangeDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsGoalLimitRangeDto createFromParcel(Parcel parcel) {
            return new DonutGroupSettingsGoalLimitRangeDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsGoalLimitRangeDto[] newArray(int i) {
            return new DonutGroupSettingsGoalLimitRangeDto[i];
        }
    }

    public DonutGroupSettingsGoalLimitRangeDto(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGroupSettingsGoalLimitRangeDto)) {
            return false;
        }
        DonutGroupSettingsGoalLimitRangeDto donutGroupSettingsGoalLimitRangeDto = (DonutGroupSettingsGoalLimitRangeDto) obj;
        return this.min == donutGroupSettingsGoalLimitRangeDto.min && this.max == donutGroupSettingsGoalLimitRangeDto.max;
    }

    public final int hashCode() {
        return Integer.hashCode(this.max) + (Integer.hashCode(this.min) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGroupSettingsGoalLimitRangeDto(min=");
        sb.append(this.min);
        sb.append(", max=");
        return vu5.b(sb, this.max, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.min);
        parcel.writeInt(this.max);
    }
}
