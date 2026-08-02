package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsNotificationSettingOptionsItemDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationSettingOptionsItemDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationSettingOptionsItemDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("label")
    private final String label;

    /* compiled from: NotificationsNotificationSettingOptionsItemDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationSettingOptionsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingOptionsItemDto createFromParcel(Parcel parcel) {
            return new NotificationsNotificationSettingOptionsItemDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingOptionsItemDto[] newArray(int i) {
            return new NotificationsNotificationSettingOptionsItemDto[i];
        }
    }

    public NotificationsNotificationSettingOptionsItemDto(String str, String str2) {
        this.label = str;
        this.id = str2;
    }

    public final String d() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationSettingOptionsItemDto)) {
            return false;
        }
        NotificationsNotificationSettingOptionsItemDto notificationsNotificationSettingOptionsItemDto = (NotificationsNotificationSettingOptionsItemDto) obj;
        return epx.f(this.label, notificationsNotificationSettingOptionsItemDto.label) && epx.f(this.id, notificationsNotificationSettingOptionsItemDto.id);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = this.label.hashCode() * 31;
        String str = this.id;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsNotificationSettingOptionsItemDto(label=");
        sb.append(this.label);
        sb.append(", id=");
        return ho8.a(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        parcel.writeString(this.id);
    }

    public /* synthetic */ NotificationsNotificationSettingOptionsItemDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
