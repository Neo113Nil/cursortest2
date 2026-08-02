package com.vk.api.generated.rewardedAds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RewardedAdsGetLimitsConfigTypeIdDto.kt */
/* loaded from: classes15.dex */
public final class RewardedAdsGetLimitsConfigTypeIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RewardedAdsGetLimitsConfigTypeIdDto[] $VALUES;
    public static final Parcelable.Creator<RewardedAdsGetLimitsConfigTypeIdDto> CREATOR;

    @pmi0("gifts")
    public static final RewardedAdsGetLimitsConfigTypeIdDto GIFTS;
    private final String value;

    /* compiled from: RewardedAdsGetLimitsConfigTypeIdDto.kt */
    public static final class a implements Parcelable.Creator<RewardedAdsGetLimitsConfigTypeIdDto> {
        @Override // android.os.Parcelable.Creator
        public final RewardedAdsGetLimitsConfigTypeIdDto createFromParcel(Parcel parcel) {
            return RewardedAdsGetLimitsConfigTypeIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardedAdsGetLimitsConfigTypeIdDto[] newArray(int i) {
            return new RewardedAdsGetLimitsConfigTypeIdDto[i];
        }
    }

    static {
        RewardedAdsGetLimitsConfigTypeIdDto rewardedAdsGetLimitsConfigTypeIdDto = new RewardedAdsGetLimitsConfigTypeIdDto("GIFTS", 0, "gifts");
        GIFTS = rewardedAdsGetLimitsConfigTypeIdDto;
        RewardedAdsGetLimitsConfigTypeIdDto[] rewardedAdsGetLimitsConfigTypeIdDtoArr = {rewardedAdsGetLimitsConfigTypeIdDto};
        $VALUES = rewardedAdsGetLimitsConfigTypeIdDtoArr;
        $ENTRIES = new asp(rewardedAdsGetLimitsConfigTypeIdDtoArr);
        CREATOR = new a();
    }

    private RewardedAdsGetLimitsConfigTypeIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static RewardedAdsGetLimitsConfigTypeIdDto valueOf(String str) {
        return (RewardedAdsGetLimitsConfigTypeIdDto) Enum.valueOf(RewardedAdsGetLimitsConfigTypeIdDto.class, str);
    }

    public static RewardedAdsGetLimitsConfigTypeIdDto[] values() {
        return (RewardedAdsGetLimitsConfigTypeIdDto[]) $VALUES.clone();
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
