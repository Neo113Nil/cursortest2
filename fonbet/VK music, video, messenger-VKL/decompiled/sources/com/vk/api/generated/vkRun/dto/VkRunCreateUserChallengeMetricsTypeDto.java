package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkRunCreateUserChallengeMetricsTypeDto.kt */
/* loaded from: classes15.dex */
public final class VkRunCreateUserChallengeMetricsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkRunCreateUserChallengeMetricsTypeDto[] $VALUES;
    public static final Parcelable.Creator<VkRunCreateUserChallengeMetricsTypeDto> CREATOR;

    @pmi0("meters")
    public static final VkRunCreateUserChallengeMetricsTypeDto METERS;

    @pmi0("steps")
    public static final VkRunCreateUserChallengeMetricsTypeDto STEPS;
    private final String value;

    /* compiled from: VkRunCreateUserChallengeMetricsTypeDto.kt */
    public static final class a implements Parcelable.Creator<VkRunCreateUserChallengeMetricsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunCreateUserChallengeMetricsTypeDto createFromParcel(Parcel parcel) {
            return VkRunCreateUserChallengeMetricsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunCreateUserChallengeMetricsTypeDto[] newArray(int i) {
            return new VkRunCreateUserChallengeMetricsTypeDto[i];
        }
    }

    static {
        VkRunCreateUserChallengeMetricsTypeDto vkRunCreateUserChallengeMetricsTypeDto = new VkRunCreateUserChallengeMetricsTypeDto("METERS", 0, "meters");
        METERS = vkRunCreateUserChallengeMetricsTypeDto;
        VkRunCreateUserChallengeMetricsTypeDto vkRunCreateUserChallengeMetricsTypeDto2 = new VkRunCreateUserChallengeMetricsTypeDto("STEPS", 1, "steps");
        STEPS = vkRunCreateUserChallengeMetricsTypeDto2;
        VkRunCreateUserChallengeMetricsTypeDto[] vkRunCreateUserChallengeMetricsTypeDtoArr = {vkRunCreateUserChallengeMetricsTypeDto, vkRunCreateUserChallengeMetricsTypeDto2};
        $VALUES = vkRunCreateUserChallengeMetricsTypeDtoArr;
        $ENTRIES = new asp(vkRunCreateUserChallengeMetricsTypeDtoArr);
        CREATOR = new a();
    }

    private VkRunCreateUserChallengeMetricsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkRunCreateUserChallengeMetricsTypeDto valueOf(String str) {
        return (VkRunCreateUserChallengeMetricsTypeDto) Enum.valueOf(VkRunCreateUserChallengeMetricsTypeDto.class, str);
    }

    public static VkRunCreateUserChallengeMetricsTypeDto[] values() {
        return (VkRunCreateUserChallengeMetricsTypeDto[]) $VALUES.clone();
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
