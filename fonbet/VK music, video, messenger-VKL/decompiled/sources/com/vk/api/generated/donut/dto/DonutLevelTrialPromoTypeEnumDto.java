package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutLevelTrialPromoTypeEnumDto.kt */
/* loaded from: classes14.dex */
public final class DonutLevelTrialPromoTypeEnumDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutLevelTrialPromoTypeEnumDto[] $VALUES;
    public static final Parcelable.Creator<DonutLevelTrialPromoTypeEnumDto> CREATOR;

    @pmi0("promo_month")
    public static final DonutLevelTrialPromoTypeEnumDto PROMO_MONTH;

    @pmi0("promo_year")
    public static final DonutLevelTrialPromoTypeEnumDto PROMO_YEAR;

    @pmi0("trial")
    public static final DonutLevelTrialPromoTypeEnumDto TRIAL;
    private final String value;

    /* compiled from: DonutLevelTrialPromoTypeEnumDto.kt */
    public static final class a implements Parcelable.Creator<DonutLevelTrialPromoTypeEnumDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutLevelTrialPromoTypeEnumDto createFromParcel(Parcel parcel) {
            return DonutLevelTrialPromoTypeEnumDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutLevelTrialPromoTypeEnumDto[] newArray(int i) {
            return new DonutLevelTrialPromoTypeEnumDto[i];
        }
    }

    static {
        DonutLevelTrialPromoTypeEnumDto donutLevelTrialPromoTypeEnumDto = new DonutLevelTrialPromoTypeEnumDto("TRIAL", 0, "trial");
        TRIAL = donutLevelTrialPromoTypeEnumDto;
        DonutLevelTrialPromoTypeEnumDto donutLevelTrialPromoTypeEnumDto2 = new DonutLevelTrialPromoTypeEnumDto("PROMO_MONTH", 1, "promo_month");
        PROMO_MONTH = donutLevelTrialPromoTypeEnumDto2;
        DonutLevelTrialPromoTypeEnumDto donutLevelTrialPromoTypeEnumDto3 = new DonutLevelTrialPromoTypeEnumDto("PROMO_YEAR", 2, "promo_year");
        PROMO_YEAR = donutLevelTrialPromoTypeEnumDto3;
        DonutLevelTrialPromoTypeEnumDto[] donutLevelTrialPromoTypeEnumDtoArr = {donutLevelTrialPromoTypeEnumDto, donutLevelTrialPromoTypeEnumDto2, donutLevelTrialPromoTypeEnumDto3};
        $VALUES = donutLevelTrialPromoTypeEnumDtoArr;
        $ENTRIES = new asp(donutLevelTrialPromoTypeEnumDtoArr);
        CREATOR = new a();
    }

    private DonutLevelTrialPromoTypeEnumDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutLevelTrialPromoTypeEnumDto valueOf(String str) {
        return (DonutLevelTrialPromoTypeEnumDto) Enum.valueOf(DonutLevelTrialPromoTypeEnumDto.class, str);
    }

    public static DonutLevelTrialPromoTypeEnumDto[] values() {
        return (DonutLevelTrialPromoTypeEnumDto[]) $VALUES.clone();
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
