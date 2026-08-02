package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: DonutGroupSettingsLevelLimitDto.kt */
/* loaded from: classes14.dex */
public final class DonutGroupSettingsLevelLimitDto implements Parcelable {
    public static final Parcelable.Creator<DonutGroupSettingsLevelLimitDto> CREATOR = new a();

    @pmi0("description_max_length")
    private final int descriptionMaxLength;

    @pmi0("levels_max_count")
    private final int levelsMaxCount;

    @pmi0("price_max")
    private final int priceMax;

    @pmi0("price_min")
    private final int priceMin;

    @pmi0("title_max_length")
    private final int titleMaxLength;

    /* compiled from: DonutGroupSettingsLevelLimitDto.kt */
    public static final class a implements Parcelable.Creator<DonutGroupSettingsLevelLimitDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsLevelLimitDto createFromParcel(Parcel parcel) {
            return new DonutGroupSettingsLevelLimitDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsLevelLimitDto[] newArray(int i) {
            return new DonutGroupSettingsLevelLimitDto[i];
        }
    }

    public DonutGroupSettingsLevelLimitDto(int i, int i2, int i3, int i4, int i5) {
        this.titleMaxLength = i;
        this.descriptionMaxLength = i2;
        this.priceMin = i3;
        this.priceMax = i4;
        this.levelsMaxCount = i5;
    }

    public final int d() {
        return this.descriptionMaxLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.levelsMaxCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGroupSettingsLevelLimitDto)) {
            return false;
        }
        DonutGroupSettingsLevelLimitDto donutGroupSettingsLevelLimitDto = (DonutGroupSettingsLevelLimitDto) obj;
        return this.titleMaxLength == donutGroupSettingsLevelLimitDto.titleMaxLength && this.descriptionMaxLength == donutGroupSettingsLevelLimitDto.descriptionMaxLength && this.priceMin == donutGroupSettingsLevelLimitDto.priceMin && this.priceMax == donutGroupSettingsLevelLimitDto.priceMax && this.levelsMaxCount == donutGroupSettingsLevelLimitDto.levelsMaxCount;
    }

    public final int f() {
        return this.priceMax;
    }

    public final int g() {
        return this.priceMin;
    }

    public final int hashCode() {
        return Integer.hashCode(this.levelsMaxCount) + shy.a(this.priceMax, shy.a(this.priceMin, shy.a(this.descriptionMaxLength, Integer.hashCode(this.titleMaxLength) * 31, 31), 31), 31);
    }

    public final int i() {
        return this.titleMaxLength;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGroupSettingsLevelLimitDto(titleMaxLength=");
        sb.append(this.titleMaxLength);
        sb.append(", descriptionMaxLength=");
        sb.append(this.descriptionMaxLength);
        sb.append(", priceMin=");
        sb.append(this.priceMin);
        sb.append(", priceMax=");
        sb.append(this.priceMax);
        sb.append(", levelsMaxCount=");
        return vu5.b(sb, this.levelsMaxCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.titleMaxLength);
        parcel.writeInt(this.descriptionMaxLength);
        parcel.writeInt(this.priceMin);
        parcel.writeInt(this.priceMax);
        parcel.writeInt(this.levelsMaxCount);
    }
}
