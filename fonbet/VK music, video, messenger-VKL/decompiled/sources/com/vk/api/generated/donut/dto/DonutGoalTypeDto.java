package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingClient;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutGoalTypeDto.kt */
/* loaded from: classes14.dex */
public final class DonutGoalTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutGoalTypeDto[] $VALUES;
    public static final Parcelable.Creator<DonutGoalTypeDto> CREATOR;

    @pmi0("money_profit")
    public static final DonutGoalTypeDto MONEY_PROFIT;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    public static final DonutGoalTypeDto SUBSCRIPTIONS;
    private final String value;

    /* compiled from: DonutGoalTypeDto.kt */
    public static final class a implements Parcelable.Creator<DonutGoalTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGoalTypeDto createFromParcel(Parcel parcel) {
            return DonutGoalTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGoalTypeDto[] newArray(int i) {
            return new DonutGoalTypeDto[i];
        }
    }

    static {
        DonutGoalTypeDto donutGoalTypeDto = new DonutGoalTypeDto("MONEY_PROFIT", 0, "money_profit");
        MONEY_PROFIT = donutGoalTypeDto;
        DonutGoalTypeDto donutGoalTypeDto2 = new DonutGoalTypeDto("SUBSCRIPTIONS", 1, BillingClient.FeatureType.SUBSCRIPTIONS);
        SUBSCRIPTIONS = donutGoalTypeDto2;
        DonutGoalTypeDto[] donutGoalTypeDtoArr = {donutGoalTypeDto, donutGoalTypeDto2};
        $VALUES = donutGoalTypeDtoArr;
        $ENTRIES = new asp(donutGoalTypeDtoArr);
        CREATOR = new a();
    }

    private DonutGoalTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutGoalTypeDto valueOf(String str) {
        return (DonutGoalTypeDto) Enum.valueOf(DonutGoalTypeDto.class, str);
    }

    public static DonutGoalTypeDto[] values() {
        return (DonutGoalTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
