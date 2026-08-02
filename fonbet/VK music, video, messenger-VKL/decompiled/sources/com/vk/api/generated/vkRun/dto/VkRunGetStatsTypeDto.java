package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkRunGetStatsTypeDto.kt */
/* loaded from: classes15.dex */
public final class VkRunGetStatsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkRunGetStatsTypeDto[] $VALUES;
    public static final Parcelable.Creator<VkRunGetStatsTypeDto> CREATOR;

    @pmi0("day")
    public static final VkRunGetStatsTypeDto DAY;

    @pmi0("month")
    public static final VkRunGetStatsTypeDto MONTH;

    @pmi0("week")
    public static final VkRunGetStatsTypeDto WEEK;
    private final String value;

    /* compiled from: VkRunGetStatsTypeDto.kt */
    public static final class a implements Parcelable.Creator<VkRunGetStatsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunGetStatsTypeDto createFromParcel(Parcel parcel) {
            return VkRunGetStatsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunGetStatsTypeDto[] newArray(int i) {
            return new VkRunGetStatsTypeDto[i];
        }
    }

    static {
        VkRunGetStatsTypeDto vkRunGetStatsTypeDto = new VkRunGetStatsTypeDto("DAY", 0, "day");
        DAY = vkRunGetStatsTypeDto;
        VkRunGetStatsTypeDto vkRunGetStatsTypeDto2 = new VkRunGetStatsTypeDto("MONTH", 1, "month");
        MONTH = vkRunGetStatsTypeDto2;
        VkRunGetStatsTypeDto vkRunGetStatsTypeDto3 = new VkRunGetStatsTypeDto("WEEK", 2, "week");
        WEEK = vkRunGetStatsTypeDto3;
        VkRunGetStatsTypeDto[] vkRunGetStatsTypeDtoArr = {vkRunGetStatsTypeDto, vkRunGetStatsTypeDto2, vkRunGetStatsTypeDto3};
        $VALUES = vkRunGetStatsTypeDtoArr;
        $ENTRIES = new asp(vkRunGetStatsTypeDtoArr);
        CREATOR = new a();
    }

    private VkRunGetStatsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkRunGetStatsTypeDto valueOf(String str) {
        return (VkRunGetStatsTypeDto) Enum.valueOf(VkRunGetStatsTypeDto.class, str);
    }

    public static VkRunGetStatsTypeDto[] values() {
        return (VkRunGetStatsTypeDto[]) $VALUES.clone();
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
