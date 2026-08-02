package com.vk.api.generated.yoga.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;

/* compiled from: YogaValueDto.kt */
/* loaded from: classes15.dex */
public final class YogaValueDto implements Parcelable {
    public static final Parcelable.Creator<YogaValueDto> CREATOR = new a();

    @pmi0("unit")
    private final YogaUnitDto unit;

    @pmi0("value")
    private final float value;

    /* compiled from: YogaValueDto.kt */
    public static final class a implements Parcelable.Creator<YogaValueDto> {
        @Override // android.os.Parcelable.Creator
        public final YogaValueDto createFromParcel(Parcel parcel) {
            return new YogaValueDto(parcel.readFloat(), YogaUnitDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final YogaValueDto[] newArray(int i) {
            return new YogaValueDto[i];
        }
    }

    public YogaValueDto(float f, YogaUnitDto yogaUnitDto) {
        this.value = f;
        this.unit = yogaUnitDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YogaValueDto)) {
            return false;
        }
        YogaValueDto yogaValueDto = (YogaValueDto) obj;
        return Float.compare(this.value, yogaValueDto.value) == 0 && this.unit == yogaValueDto.unit;
    }

    public final int hashCode() {
        return this.unit.hashCode() + (Float.hashCode(this.value) * 31);
    }

    public final String toString() {
        return "YogaValueDto(value=" + this.value + ", unit=" + this.unit + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.value);
        this.unit.writeToParcel(parcel, i);
    }
}
