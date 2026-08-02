package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: VkRunSeasonBoxCountersDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonBoxCountersDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonBoxCountersDto> CREATOR = new a();

    @pmi0("golden")
    private final int golden;

    @pmi0("golden_premium")
    private final int goldenPremium;

    @pmi0("lunar")
    private final int lunar;

    /* compiled from: VkRunSeasonBoxCountersDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonBoxCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonBoxCountersDto createFromParcel(Parcel parcel) {
            return new VkRunSeasonBoxCountersDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonBoxCountersDto[] newArray(int i) {
            return new VkRunSeasonBoxCountersDto[i];
        }
    }

    public VkRunSeasonBoxCountersDto(int i, int i2, int i3) {
        this.lunar = i;
        this.golden = i2;
        this.goldenPremium = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSeasonBoxCountersDto)) {
            return false;
        }
        VkRunSeasonBoxCountersDto vkRunSeasonBoxCountersDto = (VkRunSeasonBoxCountersDto) obj;
        return this.lunar == vkRunSeasonBoxCountersDto.lunar && this.golden == vkRunSeasonBoxCountersDto.golden && this.goldenPremium == vkRunSeasonBoxCountersDto.goldenPremium;
    }

    public final int hashCode() {
        return Integer.hashCode(this.goldenPremium) + shy.a(this.golden, Integer.hashCode(this.lunar) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunSeasonBoxCountersDto(lunar=");
        sb.append(this.lunar);
        sb.append(", golden=");
        sb.append(this.golden);
        sb.append(", goldenPremium=");
        return vu5.b(sb, this.goldenPremium, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.lunar);
        parcel.writeInt(this.golden);
        parcel.writeInt(this.goldenPremium);
    }
}
