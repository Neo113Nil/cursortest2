package com.vk.api.generated.splashscreensAdmin.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: SplashscreensAdminSuccessResponseDto.kt */
/* loaded from: classes15.dex */
public final class SplashscreensAdminSuccessResponseDto implements Parcelable {
    public static final Parcelable.Creator<SplashscreensAdminSuccessResponseDto> CREATOR = new a();

    @pmi0("success")
    private final boolean success;

    /* compiled from: SplashscreensAdminSuccessResponseDto.kt */
    public static final class a implements Parcelable.Creator<SplashscreensAdminSuccessResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SplashscreensAdminSuccessResponseDto createFromParcel(Parcel parcel) {
            return new SplashscreensAdminSuccessResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SplashscreensAdminSuccessResponseDto[] newArray(int i) {
            return new SplashscreensAdminSuccessResponseDto[i];
        }
    }

    public SplashscreensAdminSuccessResponseDto(boolean z) {
        this.success = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SplashscreensAdminSuccessResponseDto) && this.success == ((SplashscreensAdminSuccessResponseDto) obj).success;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.success);
    }

    public final String toString() {
        return q0.a(new StringBuilder("SplashscreensAdminSuccessResponseDto(success="), this.success, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success ? 1 : 0);
    }
}
