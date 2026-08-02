package com.vk.api.generated.vkStart.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.hihealth.HiHealthActivities;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStartGetStatsActivityTypeDto.kt */
/* loaded from: classes15.dex */
public final class VkStartGetStatsActivityTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStartGetStatsActivityTypeDto[] $VALUES;
    public static final Parcelable.Creator<VkStartGetStatsActivityTypeDto> CREATOR;

    @pmi0(HiHealthActivities.RUNNING)
    public static final VkStartGetStatsActivityTypeDto RUNNING;
    private final String value;

    /* compiled from: VkStartGetStatsActivityTypeDto.kt */
    public static final class a implements Parcelable.Creator<VkStartGetStatsActivityTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VkStartGetStatsActivityTypeDto createFromParcel(Parcel parcel) {
            return VkStartGetStatsActivityTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkStartGetStatsActivityTypeDto[] newArray(int i) {
            return new VkStartGetStatsActivityTypeDto[i];
        }
    }

    static {
        VkStartGetStatsActivityTypeDto vkStartGetStatsActivityTypeDto = new VkStartGetStatsActivityTypeDto("RUNNING", 0, HiHealthActivities.RUNNING);
        RUNNING = vkStartGetStatsActivityTypeDto;
        VkStartGetStatsActivityTypeDto[] vkStartGetStatsActivityTypeDtoArr = {vkStartGetStatsActivityTypeDto};
        $VALUES = vkStartGetStatsActivityTypeDtoArr;
        $ENTRIES = new asp(vkStartGetStatsActivityTypeDtoArr);
        CREATOR = new a();
    }

    private VkStartGetStatsActivityTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkStartGetStatsActivityTypeDto valueOf(String str) {
        return (VkStartGetStatsActivityTypeDto) Enum.valueOf(VkStartGetStatsActivityTypeDto.class, str);
    }

    public static VkStartGetStatsActivityTypeDto[] values() {
        return (VkStartGetStatsActivityTypeDto[]) $VALUES.clone();
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
