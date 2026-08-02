package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkRunCreateUserChallengeChallengeTypeDto.kt */
/* loaded from: classes15.dex */
public final class VkRunCreateUserChallengeChallengeTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkRunCreateUserChallengeChallengeTypeDto[] $VALUES;
    public static final Parcelable.Creator<VkRunCreateUserChallengeChallengeTypeDto> CREATOR;

    @pmi0("every_day_goal")
    public static final VkRunCreateUserChallengeChallengeTypeDto EVERY_DAY_GOAL;

    @pmi0("whole_range_days_goal")
    public static final VkRunCreateUserChallengeChallengeTypeDto WHOLE_RANGE_DAYS_GOAL;
    private final String value;

    /* compiled from: VkRunCreateUserChallengeChallengeTypeDto.kt */
    public static final class a implements Parcelable.Creator<VkRunCreateUserChallengeChallengeTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunCreateUserChallengeChallengeTypeDto createFromParcel(Parcel parcel) {
            return VkRunCreateUserChallengeChallengeTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunCreateUserChallengeChallengeTypeDto[] newArray(int i) {
            return new VkRunCreateUserChallengeChallengeTypeDto[i];
        }
    }

    static {
        VkRunCreateUserChallengeChallengeTypeDto vkRunCreateUserChallengeChallengeTypeDto = new VkRunCreateUserChallengeChallengeTypeDto("EVERY_DAY_GOAL", 0, "every_day_goal");
        EVERY_DAY_GOAL = vkRunCreateUserChallengeChallengeTypeDto;
        VkRunCreateUserChallengeChallengeTypeDto vkRunCreateUserChallengeChallengeTypeDto2 = new VkRunCreateUserChallengeChallengeTypeDto("WHOLE_RANGE_DAYS_GOAL", 1, "whole_range_days_goal");
        WHOLE_RANGE_DAYS_GOAL = vkRunCreateUserChallengeChallengeTypeDto2;
        VkRunCreateUserChallengeChallengeTypeDto[] vkRunCreateUserChallengeChallengeTypeDtoArr = {vkRunCreateUserChallengeChallengeTypeDto, vkRunCreateUserChallengeChallengeTypeDto2};
        $VALUES = vkRunCreateUserChallengeChallengeTypeDtoArr;
        $ENTRIES = new asp(vkRunCreateUserChallengeChallengeTypeDtoArr);
        CREATOR = new a();
    }

    private VkRunCreateUserChallengeChallengeTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkRunCreateUserChallengeChallengeTypeDto valueOf(String str) {
        return (VkRunCreateUserChallengeChallengeTypeDto) Enum.valueOf(VkRunCreateUserChallengeChallengeTypeDto.class, str);
    }

    public static VkRunCreateUserChallengeChallengeTypeDto[] values() {
        return (VkRunCreateUserChallengeChallengeTypeDto[]) $VALUES.clone();
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
