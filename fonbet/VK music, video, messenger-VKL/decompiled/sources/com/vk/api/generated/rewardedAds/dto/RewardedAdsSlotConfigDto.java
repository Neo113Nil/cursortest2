package com.vk.api.generated.rewardedAds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: RewardedAdsSlotConfigDto.kt */
/* loaded from: classes15.dex */
public final class RewardedAdsSlotConfigDto implements Parcelable {
    public static final Parcelable.Creator<RewardedAdsSlotConfigDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("type_id")
    private final TypeIdDto typeId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RewardedAdsSlotConfigDto.kt */
    public static final class TypeIdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeIdDto[] $VALUES;
        public static final Parcelable.Creator<TypeIdDto> CREATOR;

        @pmi0("interstitial")
        public static final TypeIdDto INTERSTITIAL;

        @pmi0("rewarded")
        public static final TypeIdDto REWARDED;
        private final String value;

        /* compiled from: RewardedAdsSlotConfigDto.kt */
        public static final class a implements Parcelable.Creator<TypeIdDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeIdDto createFromParcel(Parcel parcel) {
                return TypeIdDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeIdDto[] newArray(int i) {
                return new TypeIdDto[i];
            }
        }

        static {
            TypeIdDto typeIdDto = new TypeIdDto("REWARDED", 0, "rewarded");
            REWARDED = typeIdDto;
            TypeIdDto typeIdDto2 = new TypeIdDto("INTERSTITIAL", 1, "interstitial");
            INTERSTITIAL = typeIdDto2;
            TypeIdDto[] typeIdDtoArr = {typeIdDto, typeIdDto2};
            $VALUES = typeIdDtoArr;
            $ENTRIES = new asp(typeIdDtoArr);
            CREATOR = new a();
        }

        private TypeIdDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeIdDto valueOf(String str) {
            return (TypeIdDto) Enum.valueOf(TypeIdDto.class, str);
        }

        public static TypeIdDto[] values() {
            return (TypeIdDto[]) $VALUES.clone();
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

    /* compiled from: RewardedAdsSlotConfigDto.kt */
    public static final class a implements Parcelable.Creator<RewardedAdsSlotConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final RewardedAdsSlotConfigDto createFromParcel(Parcel parcel) {
            return new RewardedAdsSlotConfigDto(parcel.readInt(), TypeIdDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RewardedAdsSlotConfigDto[] newArray(int i) {
            return new RewardedAdsSlotConfigDto[i];
        }
    }

    public RewardedAdsSlotConfigDto(int i, TypeIdDto typeIdDto) {
        this.id = i;
        this.typeId = typeIdDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardedAdsSlotConfigDto)) {
            return false;
        }
        RewardedAdsSlotConfigDto rewardedAdsSlotConfigDto = (RewardedAdsSlotConfigDto) obj;
        return this.id == rewardedAdsSlotConfigDto.id && this.typeId == rewardedAdsSlotConfigDto.typeId;
    }

    public final int hashCode() {
        return this.typeId.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return "RewardedAdsSlotConfigDto(id=" + this.id + ", typeId=" + this.typeId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        this.typeId.writeToParcel(parcel, i);
    }
}
