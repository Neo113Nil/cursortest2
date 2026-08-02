package com.vk.api.generated.rewardedAds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: RewardedAdsSlotsConfigDto.kt */
/* loaded from: classes15.dex */
public final class RewardedAdsSlotsConfigDto implements Parcelable {
    public static final Parcelable.Creator<RewardedAdsSlotsConfigDto> CREATOR = new a();

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("slots")
    private final List<RewardedAdsSlotConfigDto> slots;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RewardedAdsSlotsConfigDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("rewardedAds_slots_config_new")
        public static final InnerTypeDto REWARDEDADS_SLOTS_CONFIG_NEW;
        private final String value;

        /* compiled from: RewardedAdsSlotsConfigDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("REWARDEDADS_SLOTS_CONFIG_NEW", 0, "rewardedAds_slots_config_new");
            REWARDEDADS_SLOTS_CONFIG_NEW = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
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

    /* compiled from: RewardedAdsSlotsConfigDto.kt */
    public static final class a implements Parcelable.Creator<RewardedAdsSlotsConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final RewardedAdsSlotsConfigDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(RewardedAdsSlotConfigDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new RewardedAdsSlotsConfigDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RewardedAdsSlotsConfigDto[] newArray(int i) {
            return new RewardedAdsSlotsConfigDto[i];
        }
    }

    public RewardedAdsSlotsConfigDto(InnerTypeDto innerTypeDto, List<RewardedAdsSlotConfigDto> list) {
        this.innerType = innerTypeDto;
        this.slots = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardedAdsSlotsConfigDto)) {
            return false;
        }
        RewardedAdsSlotsConfigDto rewardedAdsSlotsConfigDto = (RewardedAdsSlotsConfigDto) obj;
        return this.innerType == rewardedAdsSlotsConfigDto.innerType && epx.f(this.slots, rewardedAdsSlotsConfigDto.slots);
    }

    public final int hashCode() {
        int hashCode = this.innerType.hashCode() * 31;
        List<RewardedAdsSlotConfigDto> list = this.slots;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardedAdsSlotsConfigDto(innerType=");
        sb.append(this.innerType);
        sb.append(", slots=");
        return ms9.a(')', sb, this.slots);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.innerType.writeToParcel(parcel, i);
        List<RewardedAdsSlotConfigDto> list = this.slots;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((RewardedAdsSlotConfigDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ RewardedAdsSlotsConfigDto(InnerTypeDto innerTypeDto, List list, int i, zcl zclVar) {
        this(innerTypeDto, (i & 2) != 0 ? null : list);
    }
}
