package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingClient;
import xsna.epx;
import xsna.pmi0;

/* compiled from: DonutGroupSettingsGoalLimitTypedDto.kt */
/* loaded from: classes14.dex */
public final class DonutGroupSettingsGoalLimitTypedDto implements Parcelable {
    public static final Parcelable.Creator<DonutGroupSettingsGoalLimitTypedDto> CREATOR = new a();

    @pmi0("money_profit")
    private final DonutGroupSettingsGoalLimitRangeDto moneyProfit;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    private final DonutGroupSettingsGoalLimitRangeDto subscriptions;

    /* compiled from: DonutGroupSettingsGoalLimitTypedDto.kt */
    public static final class a implements Parcelable.Creator<DonutGroupSettingsGoalLimitTypedDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsGoalLimitTypedDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<DonutGroupSettingsGoalLimitRangeDto> creator = DonutGroupSettingsGoalLimitRangeDto.CREATOR;
            return new DonutGroupSettingsGoalLimitTypedDto(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsGoalLimitTypedDto[] newArray(int i) {
            return new DonutGroupSettingsGoalLimitTypedDto[i];
        }
    }

    public DonutGroupSettingsGoalLimitTypedDto(DonutGroupSettingsGoalLimitRangeDto donutGroupSettingsGoalLimitRangeDto, DonutGroupSettingsGoalLimitRangeDto donutGroupSettingsGoalLimitRangeDto2) {
        this.subscriptions = donutGroupSettingsGoalLimitRangeDto;
        this.moneyProfit = donutGroupSettingsGoalLimitRangeDto2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGroupSettingsGoalLimitTypedDto)) {
            return false;
        }
        DonutGroupSettingsGoalLimitTypedDto donutGroupSettingsGoalLimitTypedDto = (DonutGroupSettingsGoalLimitTypedDto) obj;
        return epx.f(this.subscriptions, donutGroupSettingsGoalLimitTypedDto.subscriptions) && epx.f(this.moneyProfit, donutGroupSettingsGoalLimitTypedDto.moneyProfit);
    }

    public final int hashCode() {
        return this.moneyProfit.hashCode() + (this.subscriptions.hashCode() * 31);
    }

    public final String toString() {
        return "DonutGroupSettingsGoalLimitTypedDto(subscriptions=" + this.subscriptions + ", moneyProfit=" + this.moneyProfit + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.subscriptions.writeToParcel(parcel, i);
        this.moneyProfit.writeToParcel(parcel, i);
    }
}
