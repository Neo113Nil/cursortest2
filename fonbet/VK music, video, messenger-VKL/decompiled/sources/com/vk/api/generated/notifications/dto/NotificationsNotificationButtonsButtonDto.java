package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: NotificationsNotificationButtonsButtonDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationButtonsButtonDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationButtonsButtonDto> CREATOR = new a();

    @pmi0("action")
    private final NotificationsActionDto action;

    @pmi0("label")
    private final String label;

    /* compiled from: NotificationsNotificationButtonsButtonDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationButtonsButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationButtonsButtonDto createFromParcel(Parcel parcel) {
            return new NotificationsNotificationButtonsButtonDto(parcel.readString(), (NotificationsActionDto) parcel.readParcelable(NotificationsNotificationButtonsButtonDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationButtonsButtonDto[] newArray(int i) {
            return new NotificationsNotificationButtonsButtonDto[i];
        }
    }

    public NotificationsNotificationButtonsButtonDto(String str, NotificationsActionDto notificationsActionDto) {
        this.label = str;
        this.action = notificationsActionDto;
    }

    public final NotificationsActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationButtonsButtonDto)) {
            return false;
        }
        NotificationsNotificationButtonsButtonDto notificationsNotificationButtonsButtonDto = (NotificationsNotificationButtonsButtonDto) obj;
        return epx.f(this.label, notificationsNotificationButtonsButtonDto.label) && epx.f(this.action, notificationsNotificationButtonsButtonDto.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.label.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationsNotificationButtonsButtonDto(label=" + this.label + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        parcel.writeParcelable(this.action, i);
    }
}
