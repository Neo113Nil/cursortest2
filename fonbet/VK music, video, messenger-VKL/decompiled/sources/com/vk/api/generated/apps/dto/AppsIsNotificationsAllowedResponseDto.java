package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: AppsIsNotificationsAllowedResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsIsNotificationsAllowedResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsIsNotificationsAllowedResponseDto> CREATOR = new a();

    @pmi0("is_allowed")
    private final boolean isAllowed;

    /* compiled from: AppsIsNotificationsAllowedResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsIsNotificationsAllowedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsIsNotificationsAllowedResponseDto createFromParcel(Parcel parcel) {
            return new AppsIsNotificationsAllowedResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsIsNotificationsAllowedResponseDto[] newArray(int i) {
            return new AppsIsNotificationsAllowedResponseDto[i];
        }
    }

    public AppsIsNotificationsAllowedResponseDto(boolean z) {
        this.isAllowed = z;
    }

    public final boolean d() {
        return this.isAllowed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsIsNotificationsAllowedResponseDto) && this.isAllowed == ((AppsIsNotificationsAllowedResponseDto) obj).isAllowed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isAllowed);
    }

    public final String toString() {
        return q0.a(new StringBuilder("AppsIsNotificationsAllowedResponseDto(isAllowed="), this.isAllowed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAllowed ? 1 : 0);
    }
}
