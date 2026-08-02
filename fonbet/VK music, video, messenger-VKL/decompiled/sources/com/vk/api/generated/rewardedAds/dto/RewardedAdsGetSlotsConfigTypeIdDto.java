package com.vk.api.generated.rewardedAds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RewardedAdsGetSlotsConfigTypeIdDto.kt */
/* loaded from: classes15.dex */
public final class RewardedAdsGetSlotsConfigTypeIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RewardedAdsGetSlotsConfigTypeIdDto[] $VALUES;
    public static final Parcelable.Creator<RewardedAdsGetSlotsConfigTypeIdDto> CREATOR;

    @pmi0("gifts")
    public static final RewardedAdsGetSlotsConfigTypeIdDto GIFTS;
    private final String value;

    /* compiled from: RewardedAdsGetSlotsConfigTypeIdDto.kt */
    public static final class a implements Parcelable.Creator<RewardedAdsGetSlotsConfigTypeIdDto> {
        @Override // android.os.Parcelable.Creator
        public final RewardedAdsGetSlotsConfigTypeIdDto createFromParcel(Parcel parcel) {
            return RewardedAdsGetSlotsConfigTypeIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardedAdsGetSlotsConfigTypeIdDto[] newArray(int i) {
            return new RewardedAdsGetSlotsConfigTypeIdDto[i];
        }
    }

    static {
        RewardedAdsGetSlotsConfigTypeIdDto rewardedAdsGetSlotsConfigTypeIdDto = new RewardedAdsGetSlotsConfigTypeIdDto("GIFTS", 0, "gifts");
        GIFTS = rewardedAdsGetSlotsConfigTypeIdDto;
        RewardedAdsGetSlotsConfigTypeIdDto[] rewardedAdsGetSlotsConfigTypeIdDtoArr = {rewardedAdsGetSlotsConfigTypeIdDto};
        $VALUES = rewardedAdsGetSlotsConfigTypeIdDtoArr;
        $ENTRIES = new asp(rewardedAdsGetSlotsConfigTypeIdDtoArr);
        CREATOR = new a();
    }

    private RewardedAdsGetSlotsConfigTypeIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static RewardedAdsGetSlotsConfigTypeIdDto valueOf(String str) {
        return (RewardedAdsGetSlotsConfigTypeIdDto) Enum.valueOf(RewardedAdsGetSlotsConfigTypeIdDto.class, str);
    }

    public static RewardedAdsGetSlotsConfigTypeIdDto[] values() {
        return (RewardedAdsGetSlotsConfigTypeIdDto[]) $VALUES.clone();
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
