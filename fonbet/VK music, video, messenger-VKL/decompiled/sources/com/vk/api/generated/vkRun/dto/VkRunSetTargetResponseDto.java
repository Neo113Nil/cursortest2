package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: VkRunSetTargetResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSetTargetResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSetTargetResponseDto> CREATOR = new a();

    @pmi0("steps")
    private final int steps;

    @pmi0("strike")
    private final int strike;

    /* compiled from: VkRunSetTargetResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSetTargetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSetTargetResponseDto createFromParcel(Parcel parcel) {
            return new VkRunSetTargetResponseDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSetTargetResponseDto[] newArray(int i) {
            return new VkRunSetTargetResponseDto[i];
        }
    }

    public VkRunSetTargetResponseDto(int i, int i2) {
        this.steps = i;
        this.strike = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSetTargetResponseDto)) {
            return false;
        }
        VkRunSetTargetResponseDto vkRunSetTargetResponseDto = (VkRunSetTargetResponseDto) obj;
        return this.steps == vkRunSetTargetResponseDto.steps && this.strike == vkRunSetTargetResponseDto.strike;
    }

    public final int hashCode() {
        return Integer.hashCode(this.strike) + (Integer.hashCode(this.steps) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunSetTargetResponseDto(steps=");
        sb.append(this.steps);
        sb.append(", strike=");
        return vu5.b(sb, this.strike, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.steps);
        parcel.writeInt(this.strike);
    }
}
