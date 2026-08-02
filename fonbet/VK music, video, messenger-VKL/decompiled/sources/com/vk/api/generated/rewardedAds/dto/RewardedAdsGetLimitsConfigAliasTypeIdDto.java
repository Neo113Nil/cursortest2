package com.vk.api.generated.rewardedAds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RewardedAdsGetLimitsConfigAliasTypeIdDto.kt */
/* loaded from: classes15.dex */
public final class RewardedAdsGetLimitsConfigAliasTypeIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RewardedAdsGetLimitsConfigAliasTypeIdDto[] $VALUES;
    public static final Parcelable.Creator<RewardedAdsGetLimitsConfigAliasTypeIdDto> CREATOR;

    @pmi0("gifts")
    public static final RewardedAdsGetLimitsConfigAliasTypeIdDto GIFTS;
    private final String value;

    /* compiled from: RewardedAdsGetLimitsConfigAliasTypeIdDto.kt */
    public static final class a implements Parcelable.Creator<RewardedAdsGetLimitsConfigAliasTypeIdDto> {
        @Override // android.os.Parcelable.Creator
        public final RewardedAdsGetLimitsConfigAliasTypeIdDto createFromParcel(Parcel parcel) {
            return RewardedAdsGetLimitsConfigAliasTypeIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardedAdsGetLimitsConfigAliasTypeIdDto[] newArray(int i) {
            return new RewardedAdsGetLimitsConfigAliasTypeIdDto[i];
        }
    }

    static {
        RewardedAdsGetLimitsConfigAliasTypeIdDto rewardedAdsGetLimitsConfigAliasTypeIdDto = new RewardedAdsGetLimitsConfigAliasTypeIdDto("GIFTS", 0, "gifts");
        GIFTS = rewardedAdsGetLimitsConfigAliasTypeIdDto;
        RewardedAdsGetLimitsConfigAliasTypeIdDto[] rewardedAdsGetLimitsConfigAliasTypeIdDtoArr = {rewardedAdsGetLimitsConfigAliasTypeIdDto};
        $VALUES = rewardedAdsGetLimitsConfigAliasTypeIdDtoArr;
        $ENTRIES = new asp(rewardedAdsGetLimitsConfigAliasTypeIdDtoArr);
        CREATOR = new a();
    }

    private RewardedAdsGetLimitsConfigAliasTypeIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static RewardedAdsGetLimitsConfigAliasTypeIdDto valueOf(String str) {
        return (RewardedAdsGetLimitsConfigAliasTypeIdDto) Enum.valueOf(RewardedAdsGetLimitsConfigAliasTypeIdDto.class, str);
    }

    public static RewardedAdsGetLimitsConfigAliasTypeIdDto[] values() {
        return (RewardedAdsGetLimitsConfigAliasTypeIdDto[]) $VALUES.clone();
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
