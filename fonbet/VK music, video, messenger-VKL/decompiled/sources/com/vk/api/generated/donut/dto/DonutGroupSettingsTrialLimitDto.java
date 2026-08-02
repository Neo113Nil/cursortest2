package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: DonutGroupSettingsTrialLimitDto.kt */
/* loaded from: classes14.dex */
public final class DonutGroupSettingsTrialLimitDto implements Parcelable {
    public static final Parcelable.Creator<DonutGroupSettingsTrialLimitDto> CREATOR = new a();

    @pmi0("max_days_duration")
    private final int maxDaysDuration;

    @pmi0("max_subscribers")
    private final int maxSubscribers;

    @pmi0("min_subscribers")
    private final int minSubscribers;

    /* compiled from: DonutGroupSettingsTrialLimitDto.kt */
    public static final class a implements Parcelable.Creator<DonutGroupSettingsTrialLimitDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsTrialLimitDto createFromParcel(Parcel parcel) {
            return new DonutGroupSettingsTrialLimitDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsTrialLimitDto[] newArray(int i) {
            return new DonutGroupSettingsTrialLimitDto[i];
        }
    }

    public DonutGroupSettingsTrialLimitDto(int i, int i2, int i3) {
        this.maxDaysDuration = i;
        this.minSubscribers = i2;
        this.maxSubscribers = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGroupSettingsTrialLimitDto)) {
            return false;
        }
        DonutGroupSettingsTrialLimitDto donutGroupSettingsTrialLimitDto = (DonutGroupSettingsTrialLimitDto) obj;
        return this.maxDaysDuration == donutGroupSettingsTrialLimitDto.maxDaysDuration && this.minSubscribers == donutGroupSettingsTrialLimitDto.minSubscribers && this.maxSubscribers == donutGroupSettingsTrialLimitDto.maxSubscribers;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxSubscribers) + shy.a(this.minSubscribers, Integer.hashCode(this.maxDaysDuration) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGroupSettingsTrialLimitDto(maxDaysDuration=");
        sb.append(this.maxDaysDuration);
        sb.append(", minSubscribers=");
        sb.append(this.minSubscribers);
        sb.append(", maxSubscribers=");
        return vu5.b(sb, this.maxSubscribers, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxDaysDuration);
        parcel.writeInt(this.minSubscribers);
        parcel.writeInt(this.maxSubscribers);
    }
}
