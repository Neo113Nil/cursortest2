package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutAllowedSubscriptionPeriodEnumDto.kt */
/* loaded from: classes14.dex */
public final class DonutAllowedSubscriptionPeriodEnumDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutAllowedSubscriptionPeriodEnumDto[] $VALUES;
    public static final Parcelable.Creator<DonutAllowedSubscriptionPeriodEnumDto> CREATOR;

    @pmi0("1")
    public static final DonutAllowedSubscriptionPeriodEnumDto MONTH;

    @pmi0("12")
    public static final DonutAllowedSubscriptionPeriodEnumDto YEAR;
    private final int value;

    /* compiled from: DonutAllowedSubscriptionPeriodEnumDto.kt */
    public static final class a implements Parcelable.Creator<DonutAllowedSubscriptionPeriodEnumDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutAllowedSubscriptionPeriodEnumDto createFromParcel(Parcel parcel) {
            return DonutAllowedSubscriptionPeriodEnumDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutAllowedSubscriptionPeriodEnumDto[] newArray(int i) {
            return new DonutAllowedSubscriptionPeriodEnumDto[i];
        }
    }

    static {
        DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto = new DonutAllowedSubscriptionPeriodEnumDto("MONTH", 0, 1);
        MONTH = donutAllowedSubscriptionPeriodEnumDto;
        DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto2 = new DonutAllowedSubscriptionPeriodEnumDto("YEAR", 1, 12);
        YEAR = donutAllowedSubscriptionPeriodEnumDto2;
        DonutAllowedSubscriptionPeriodEnumDto[] donutAllowedSubscriptionPeriodEnumDtoArr = {donutAllowedSubscriptionPeriodEnumDto, donutAllowedSubscriptionPeriodEnumDto2};
        $VALUES = donutAllowedSubscriptionPeriodEnumDtoArr;
        $ENTRIES = new asp(donutAllowedSubscriptionPeriodEnumDtoArr);
        CREATOR = new a();
    }

    private DonutAllowedSubscriptionPeriodEnumDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static DonutAllowedSubscriptionPeriodEnumDto valueOf(String str) {
        return (DonutAllowedSubscriptionPeriodEnumDto) Enum.valueOf(DonutAllowedSubscriptionPeriodEnumDto.class, str);
    }

    public static DonutAllowedSubscriptionPeriodEnumDto[] values() {
        return (DonutAllowedSubscriptionPeriodEnumDto[]) $VALUES.clone();
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
