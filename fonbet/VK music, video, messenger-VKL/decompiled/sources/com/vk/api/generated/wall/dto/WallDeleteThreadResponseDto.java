package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: WallDeleteThreadResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallDeleteThreadResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallDeleteThreadResponseDto> CREATOR = new a();

    @pmi0("success")
    private final boolean success;

    /* compiled from: WallDeleteThreadResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallDeleteThreadResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallDeleteThreadResponseDto createFromParcel(Parcel parcel) {
            return new WallDeleteThreadResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WallDeleteThreadResponseDto[] newArray(int i) {
            return new WallDeleteThreadResponseDto[i];
        }
    }

    public WallDeleteThreadResponseDto(boolean z) {
        this.success = z;
    }

    public final boolean d() {
        return this.success;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallDeleteThreadResponseDto) && this.success == ((WallDeleteThreadResponseDto) obj).success;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.success);
    }

    public final String toString() {
        return q0.a(new StringBuilder("WallDeleteThreadResponseDto(success="), this.success, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success ? 1 : 0);
    }
}
