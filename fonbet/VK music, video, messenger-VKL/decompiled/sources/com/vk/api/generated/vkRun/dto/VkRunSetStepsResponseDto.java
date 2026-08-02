package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: VkRunSetStepsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSetStepsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSetStepsResponseDto> CREATOR = new a();

    @pmi0("distance")
    private final int distance;

    @pmi0("steps")
    private final int steps;

    /* compiled from: VkRunSetStepsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSetStepsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSetStepsResponseDto createFromParcel(Parcel parcel) {
            return new VkRunSetStepsResponseDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSetStepsResponseDto[] newArray(int i) {
            return new VkRunSetStepsResponseDto[i];
        }
    }

    public VkRunSetStepsResponseDto(int i, int i2) {
        this.steps = i;
        this.distance = i2;
    }

    public final int d() {
        return this.distance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.steps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSetStepsResponseDto)) {
            return false;
        }
        VkRunSetStepsResponseDto vkRunSetStepsResponseDto = (VkRunSetStepsResponseDto) obj;
        return this.steps == vkRunSetStepsResponseDto.steps && this.distance == vkRunSetStepsResponseDto.distance;
    }

    public final int hashCode() {
        return Integer.hashCode(this.distance) + (Integer.hashCode(this.steps) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunSetStepsResponseDto(steps=");
        sb.append(this.steps);
        sb.append(", distance=");
        return vu5.b(sb, this.distance, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.steps);
        parcel.writeInt(this.distance);
    }
}
