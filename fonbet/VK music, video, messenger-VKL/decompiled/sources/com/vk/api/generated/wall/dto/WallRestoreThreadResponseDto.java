package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: WallRestoreThreadResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallRestoreThreadResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallRestoreThreadResponseDto> CREATOR = new a();

    @pmi0("success")
    private final boolean success;

    /* compiled from: WallRestoreThreadResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallRestoreThreadResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallRestoreThreadResponseDto createFromParcel(Parcel parcel) {
            return new WallRestoreThreadResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WallRestoreThreadResponseDto[] newArray(int i) {
            return new WallRestoreThreadResponseDto[i];
        }
    }

    public WallRestoreThreadResponseDto(boolean z) {
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
        return (obj instanceof WallRestoreThreadResponseDto) && this.success == ((WallRestoreThreadResponseDto) obj).success;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.success);
    }

    public final String toString() {
        return q0.a(new StringBuilder("WallRestoreThreadResponseDto(success="), this.success, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success ? 1 : 0);
    }
}
