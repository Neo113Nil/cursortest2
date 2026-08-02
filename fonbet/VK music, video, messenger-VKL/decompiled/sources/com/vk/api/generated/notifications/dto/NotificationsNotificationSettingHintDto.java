package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsNotificationSettingHintDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationSettingHintDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationSettingHintDto> CREATOR = new a();

    @pmi0("label")
    private final String label;

    @pmi0("notification")
    private final NotificationsUnifiedNotificationDto notification;

    @pmi0("notification_redesign")
    private final NotificationsNotificationRedesignDto notificationRedesign;

    /* compiled from: NotificationsNotificationSettingHintDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationSettingHintDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingHintDto createFromParcel(Parcel parcel) {
            return new NotificationsNotificationSettingHintDto(parcel.readString(), parcel.readInt() == 0 ? null : NotificationsUnifiedNotificationDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NotificationsNotificationRedesignDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingHintDto[] newArray(int i) {
            return new NotificationsNotificationSettingHintDto[i];
        }
    }

    public NotificationsNotificationSettingHintDto(String str, NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto, NotificationsNotificationRedesignDto notificationsNotificationRedesignDto) {
        this.label = str;
        this.notification = notificationsUnifiedNotificationDto;
        this.notificationRedesign = notificationsNotificationRedesignDto;
    }

    public static NotificationsNotificationSettingHintDto a(NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto, NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto) {
        return new NotificationsNotificationSettingHintDto(notificationsNotificationSettingHintDto.label, notificationsUnifiedNotificationDto, notificationsNotificationSettingHintDto.notificationRedesign);
    }

    public final String d() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NotificationsUnifiedNotificationDto e() {
        return this.notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationSettingHintDto)) {
            return false;
        }
        NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto = (NotificationsNotificationSettingHintDto) obj;
        return epx.f(this.label, notificationsNotificationSettingHintDto.label) && epx.f(this.notification, notificationsNotificationSettingHintDto.notification) && epx.f(this.notificationRedesign, notificationsNotificationSettingHintDto.notificationRedesign);
    }

    public final NotificationsNotificationRedesignDto f() {
        return this.notificationRedesign;
    }

    public final int hashCode() {
        int hashCode = this.label.hashCode() * 31;
        NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto = this.notification;
        int hashCode2 = (hashCode + (notificationsUnifiedNotificationDto == null ? 0 : notificationsUnifiedNotificationDto.hashCode())) * 31;
        NotificationsNotificationRedesignDto notificationsNotificationRedesignDto = this.notificationRedesign;
        return hashCode2 + (notificationsNotificationRedesignDto != null ? notificationsNotificationRedesignDto.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationsNotificationSettingHintDto(label=" + this.label + ", notification=" + this.notification + ", notificationRedesign=" + this.notificationRedesign + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto = this.notification;
        if (notificationsUnifiedNotificationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsUnifiedNotificationDto.writeToParcel(parcel, i);
        }
        NotificationsNotificationRedesignDto notificationsNotificationRedesignDto = this.notificationRedesign;
        if (notificationsNotificationRedesignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationRedesignDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NotificationsNotificationSettingHintDto(String str, NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto, NotificationsNotificationRedesignDto notificationsNotificationRedesignDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : notificationsUnifiedNotificationDto, (i & 4) != 0 ? null : notificationsNotificationRedesignDto);
    }
}
