package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AppsAddToMainScreenDeviceShownResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsAddToMainScreenDeviceShownResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsAddToMainScreenDeviceShownResponseDto> CREATOR = new a();

    @pmi0("success")
    private final Boolean success;

    /* compiled from: AppsAddToMainScreenDeviceShownResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsAddToMainScreenDeviceShownResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAddToMainScreenDeviceShownResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsAddToMainScreenDeviceShownResponseDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAddToMainScreenDeviceShownResponseDto[] newArray(int i) {
            return new AppsAddToMainScreenDeviceShownResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsAddToMainScreenDeviceShownResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsAddToMainScreenDeviceShownResponseDto) && epx.f(this.success, ((AppsAddToMainScreenDeviceShownResponseDto) obj).success);
    }

    public final int hashCode() {
        Boolean bool = this.success;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("AppsAddToMainScreenDeviceShownResponseDto(success="), this.success, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.success;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public AppsAddToMainScreenDeviceShownResponseDto(Boolean bool) {
        this.success = bool;
    }

    public /* synthetic */ AppsAddToMainScreenDeviceShownResponseDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
