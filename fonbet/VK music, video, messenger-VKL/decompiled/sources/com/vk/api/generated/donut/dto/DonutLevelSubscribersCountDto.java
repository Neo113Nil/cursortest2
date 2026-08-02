package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: DonutLevelSubscribersCountDto.kt */
/* loaded from: classes14.dex */
public final class DonutLevelSubscribersCountDto implements Parcelable {
    public static final Parcelable.Creator<DonutLevelSubscribersCountDto> CREATOR = new a();

    @pmi0("paid_subscribers_count")
    private final int paidSubscribersCount;

    @pmi0("trial_subscribers_count")
    private final int trialSubscribersCount;

    /* compiled from: DonutLevelSubscribersCountDto.kt */
    public static final class a implements Parcelable.Creator<DonutLevelSubscribersCountDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutLevelSubscribersCountDto createFromParcel(Parcel parcel) {
            return new DonutLevelSubscribersCountDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutLevelSubscribersCountDto[] newArray(int i) {
            return new DonutLevelSubscribersCountDto[i];
        }
    }

    public DonutLevelSubscribersCountDto(int i, int i2) {
        this.trialSubscribersCount = i;
        this.paidSubscribersCount = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutLevelSubscribersCountDto)) {
            return false;
        }
        DonutLevelSubscribersCountDto donutLevelSubscribersCountDto = (DonutLevelSubscribersCountDto) obj;
        return this.trialSubscribersCount == donutLevelSubscribersCountDto.trialSubscribersCount && this.paidSubscribersCount == donutLevelSubscribersCountDto.paidSubscribersCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.paidSubscribersCount) + (Integer.hashCode(this.trialSubscribersCount) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutLevelSubscribersCountDto(trialSubscribersCount=");
        sb.append(this.trialSubscribersCount);
        sb.append(", paidSubscribersCount=");
        return vu5.b(sb, this.paidSubscribersCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.trialSubscribersCount);
        parcel.writeInt(this.paidSubscribersCount);
    }
}
