package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: WallActionButtonProgressDto.kt */
/* loaded from: classes15.dex */
public final class WallActionButtonProgressDto implements Parcelable {
    public static final Parcelable.Creator<WallActionButtonProgressDto> CREATOR = new a();

    @pmi0("percentage")
    private final int percentage;

    /* compiled from: WallActionButtonProgressDto.kt */
    public static final class a implements Parcelable.Creator<WallActionButtonProgressDto> {
        @Override // android.os.Parcelable.Creator
        public final WallActionButtonProgressDto createFromParcel(Parcel parcel) {
            return new WallActionButtonProgressDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallActionButtonProgressDto[] newArray(int i) {
            return new WallActionButtonProgressDto[i];
        }
    }

    public WallActionButtonProgressDto(int i) {
        this.percentage = i;
    }

    public final int d() {
        return this.percentage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallActionButtonProgressDto) && this.percentage == ((WallActionButtonProgressDto) obj).percentage;
    }

    public final int hashCode() {
        return Integer.hashCode(this.percentage);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("WallActionButtonProgressDto(percentage="), this.percentage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.percentage);
    }
}
