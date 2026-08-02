package com.vk.api.generated.vkStart.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStartGetStatsAggregationTypeDto.kt */
/* loaded from: classes15.dex */
public final class VkStartGetStatsAggregationTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStartGetStatsAggregationTypeDto[] $VALUES;
    public static final Parcelable.Creator<VkStartGetStatsAggregationTypeDto> CREATOR;

    @pmi0("day")
    public static final VkStartGetStatsAggregationTypeDto DAY;

    @pmi0("month")
    public static final VkStartGetStatsAggregationTypeDto MONTH;

    @pmi0("week")
    public static final VkStartGetStatsAggregationTypeDto WEEK;
    private final String value;

    /* compiled from: VkStartGetStatsAggregationTypeDto.kt */
    public static final class a implements Parcelable.Creator<VkStartGetStatsAggregationTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VkStartGetStatsAggregationTypeDto createFromParcel(Parcel parcel) {
            return VkStartGetStatsAggregationTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkStartGetStatsAggregationTypeDto[] newArray(int i) {
            return new VkStartGetStatsAggregationTypeDto[i];
        }
    }

    static {
        VkStartGetStatsAggregationTypeDto vkStartGetStatsAggregationTypeDto = new VkStartGetStatsAggregationTypeDto("DAY", 0, "day");
        DAY = vkStartGetStatsAggregationTypeDto;
        VkStartGetStatsAggregationTypeDto vkStartGetStatsAggregationTypeDto2 = new VkStartGetStatsAggregationTypeDto("MONTH", 1, "month");
        MONTH = vkStartGetStatsAggregationTypeDto2;
        VkStartGetStatsAggregationTypeDto vkStartGetStatsAggregationTypeDto3 = new VkStartGetStatsAggregationTypeDto("WEEK", 2, "week");
        WEEK = vkStartGetStatsAggregationTypeDto3;
        VkStartGetStatsAggregationTypeDto[] vkStartGetStatsAggregationTypeDtoArr = {vkStartGetStatsAggregationTypeDto, vkStartGetStatsAggregationTypeDto2, vkStartGetStatsAggregationTypeDto3};
        $VALUES = vkStartGetStatsAggregationTypeDtoArr;
        $ENTRIES = new asp(vkStartGetStatsAggregationTypeDtoArr);
        CREATOR = new a();
    }

    private VkStartGetStatsAggregationTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkStartGetStatsAggregationTypeDto valueOf(String str) {
        return (VkStartGetStatsAggregationTypeDto) Enum.valueOf(VkStartGetStatsAggregationTypeDto.class, str);
    }

    public static VkStartGetStatsAggregationTypeDto[] values() {
        return (VkStartGetStatsAggregationTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
