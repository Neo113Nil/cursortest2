package com.vk.api.generated.rewardedAds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RewardedAdsGetSlotsConfigAliasTypeIdDto.kt */
/* loaded from: classes15.dex */
public final class RewardedAdsGetSlotsConfigAliasTypeIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RewardedAdsGetSlotsConfigAliasTypeIdDto[] $VALUES;
    public static final Parcelable.Creator<RewardedAdsGetSlotsConfigAliasTypeIdDto> CREATOR;

    @pmi0("gifts")
    public static final RewardedAdsGetSlotsConfigAliasTypeIdDto GIFTS;
    private final String value;

    /* compiled from: RewardedAdsGetSlotsConfigAliasTypeIdDto.kt */
    public static final class a implements Parcelable.Creator<RewardedAdsGetSlotsConfigAliasTypeIdDto> {
        @Override // android.os.Parcelable.Creator
        public final RewardedAdsGetSlotsConfigAliasTypeIdDto createFromParcel(Parcel parcel) {
            return RewardedAdsGetSlotsConfigAliasTypeIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardedAdsGetSlotsConfigAliasTypeIdDto[] newArray(int i) {
            return new RewardedAdsGetSlotsConfigAliasTypeIdDto[i];
        }
    }

    static {
        RewardedAdsGetSlotsConfigAliasTypeIdDto rewardedAdsGetSlotsConfigAliasTypeIdDto = new RewardedAdsGetSlotsConfigAliasTypeIdDto("GIFTS", 0, "gifts");
        GIFTS = rewardedAdsGetSlotsConfigAliasTypeIdDto;
        RewardedAdsGetSlotsConfigAliasTypeIdDto[] rewardedAdsGetSlotsConfigAliasTypeIdDtoArr = {rewardedAdsGetSlotsConfigAliasTypeIdDto};
        $VALUES = rewardedAdsGetSlotsConfigAliasTypeIdDtoArr;
        $ENTRIES = new asp(rewardedAdsGetSlotsConfigAliasTypeIdDtoArr);
        CREATOR = new a();
    }

    private RewardedAdsGetSlotsConfigAliasTypeIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static RewardedAdsGetSlotsConfigAliasTypeIdDto valueOf(String str) {
        return (RewardedAdsGetSlotsConfigAliasTypeIdDto) Enum.valueOf(RewardedAdsGetSlotsConfigAliasTypeIdDto.class, str);
    }

    public static RewardedAdsGetSlotsConfigAliasTypeIdDto[] values() {
        return (RewardedAdsGetSlotsConfigAliasTypeIdDto[]) $VALUES.clone();
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
