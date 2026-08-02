package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;

/* compiled from: DonutGroupSettingsGoalLimitsDto.kt */
/* loaded from: classes14.dex */
public final class DonutGroupSettingsGoalLimitsDto implements Parcelable {
    public static final Parcelable.Creator<DonutGroupSettingsGoalLimitsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("description_typed")
    private final DonutGroupSettingsGoalLimitTypedDto descriptionTyped;

    @pmi0("in_banner_count")
    private final int inBannerCount;

    @pmi0("target_value")
    private final DonutGroupSettingsGoalLimitTypedDto targetValue;

    @pmi0("title")
    private final DonutGroupSettingsGoalLimitRangeDto title;

    /* compiled from: DonutGroupSettingsGoalLimitsDto.kt */
    public static final class a implements Parcelable.Creator<DonutGroupSettingsGoalLimitsDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsGoalLimitsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            DonutGroupSettingsGoalLimitRangeDto createFromParcel = DonutGroupSettingsGoalLimitRangeDto.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<DonutGroupSettingsGoalLimitTypedDto> creator = DonutGroupSettingsGoalLimitTypedDto.CREATOR;
            return new DonutGroupSettingsGoalLimitsDto(readInt, readInt2, createFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsGoalLimitsDto[] newArray(int i) {
            return new DonutGroupSettingsGoalLimitsDto[i];
        }
    }

    public DonutGroupSettingsGoalLimitsDto(int i, int i2, DonutGroupSettingsGoalLimitRangeDto donutGroupSettingsGoalLimitRangeDto, DonutGroupSettingsGoalLimitTypedDto donutGroupSettingsGoalLimitTypedDto, DonutGroupSettingsGoalLimitTypedDto donutGroupSettingsGoalLimitTypedDto2) {
        this.count = i;
        this.inBannerCount = i2;
        this.title = donutGroupSettingsGoalLimitRangeDto;
        this.descriptionTyped = donutGroupSettingsGoalLimitTypedDto;
        this.targetValue = donutGroupSettingsGoalLimitTypedDto2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGroupSettingsGoalLimitsDto)) {
            return false;
        }
        DonutGroupSettingsGoalLimitsDto donutGroupSettingsGoalLimitsDto = (DonutGroupSettingsGoalLimitsDto) obj;
        return this.count == donutGroupSettingsGoalLimitsDto.count && this.inBannerCount == donutGroupSettingsGoalLimitsDto.inBannerCount && epx.f(this.title, donutGroupSettingsGoalLimitsDto.title) && epx.f(this.descriptionTyped, donutGroupSettingsGoalLimitsDto.descriptionTyped) && epx.f(this.targetValue, donutGroupSettingsGoalLimitsDto.targetValue);
    }

    public final int hashCode() {
        return this.targetValue.hashCode() + ((this.descriptionTyped.hashCode() + ((this.title.hashCode() + shy.a(this.inBannerCount, Integer.hashCode(this.count) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DonutGroupSettingsGoalLimitsDto(count=" + this.count + ", inBannerCount=" + this.inBannerCount + ", title=" + this.title + ", descriptionTyped=" + this.descriptionTyped + ", targetValue=" + this.targetValue + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeInt(this.inBannerCount);
        this.title.writeToParcel(parcel, i);
        this.descriptionTyped.writeToParcel(parcel, i);
        this.targetValue.writeToParcel(parcel, i);
    }
}
