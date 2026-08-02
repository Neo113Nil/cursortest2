package com.vk.api.generated.rewardedAds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: RewardedAdsLimitsConfigDto.kt */
/* loaded from: classes15.dex */
public final class RewardedAdsLimitsConfigDto implements Parcelable {
    public static final Parcelable.Creator<RewardedAdsLimitsConfigDto> CREATOR = new a();

    @pmi0("current")
    private final int current;

    @pmi0(X3.i.l)
    private final int total;

    @pmi0("ttl")
    private final int ttl;

    /* compiled from: RewardedAdsLimitsConfigDto.kt */
    public static final class a implements Parcelable.Creator<RewardedAdsLimitsConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final RewardedAdsLimitsConfigDto createFromParcel(Parcel parcel) {
            return new RewardedAdsLimitsConfigDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardedAdsLimitsConfigDto[] newArray(int i) {
            return new RewardedAdsLimitsConfigDto[i];
        }
    }

    public RewardedAdsLimitsConfigDto(int i, int i2, int i3) {
        this.total = i;
        this.current = i2;
        this.ttl = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardedAdsLimitsConfigDto)) {
            return false;
        }
        RewardedAdsLimitsConfigDto rewardedAdsLimitsConfigDto = (RewardedAdsLimitsConfigDto) obj;
        return this.total == rewardedAdsLimitsConfigDto.total && this.current == rewardedAdsLimitsConfigDto.current && this.ttl == rewardedAdsLimitsConfigDto.ttl;
    }

    public final int hashCode() {
        return Integer.hashCode(this.ttl) + shy.a(this.current, Integer.hashCode(this.total) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardedAdsLimitsConfigDto(total=");
        sb.append(this.total);
        sb.append(", current=");
        sb.append(this.current);
        sb.append(", ttl=");
        return vu5.b(sb, this.ttl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.total);
        parcel.writeInt(this.current);
        parcel.writeInt(this.ttl);
    }
}
