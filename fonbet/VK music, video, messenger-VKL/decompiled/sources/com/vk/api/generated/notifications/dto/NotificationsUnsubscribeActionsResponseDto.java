package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: NotificationsUnsubscribeActionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsUnsubscribeActionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsUnsubscribeActionsResponseDto> CREATOR = new a();

    @pmi0("hint")
    private final String hint;

    /* compiled from: NotificationsUnsubscribeActionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsUnsubscribeActionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsUnsubscribeActionsResponseDto createFromParcel(Parcel parcel) {
            return new NotificationsUnsubscribeActionsResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsUnsubscribeActionsResponseDto[] newArray(int i) {
            return new NotificationsUnsubscribeActionsResponseDto[i];
        }
    }

    public NotificationsUnsubscribeActionsResponseDto(String str) {
        this.hint = str;
    }

    public final String d() {
        return this.hint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationsUnsubscribeActionsResponseDto) && epx.f(this.hint, ((NotificationsUnsubscribeActionsResponseDto) obj).hint);
    }

    public final int hashCode() {
        return this.hint.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NotificationsUnsubscribeActionsResponseDto(hint="), this.hint, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hint);
    }
}
