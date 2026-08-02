package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsNotificationItemDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationItemDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationItemDto> CREATOR = new a();

    @pmi0("date")
    private final Integer date;

    @pmi0("feedback")
    private final NotificationsFeedbackDto feedback;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("parent")
    private final NotificationsNotificationDto parent;

    @pmi0("reply")
    private final NotificationsReplyDto reply;

    @pmi0("type")
    private final String type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsNotificationItemDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("notifications_notification")
        public static final InnerTypeDto NOTIFICATIONS_NOTIFICATION;
        private final String value;

        /* compiled from: NotificationsNotificationItemDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("NOTIFICATIONS_NOTIFICATION", 0, "notifications_notification");
            NOTIFICATIONS_NOTIFICATION = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: NotificationsNotificationItemDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationItemDto createFromParcel(Parcel parcel) {
            return new NotificationsNotificationItemDto(InnerTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : NotificationsFeedbackDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NotificationsNotificationDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NotificationsReplyDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationItemDto[] newArray(int i) {
            return new NotificationsNotificationItemDto[i];
        }
    }

    public NotificationsNotificationItemDto(InnerTypeDto innerTypeDto, Integer num, NotificationsFeedbackDto notificationsFeedbackDto, NotificationsNotificationDto notificationsNotificationDto, NotificationsReplyDto notificationsReplyDto, String str) {
        this.innerType = innerTypeDto;
        this.date = num;
        this.feedback = notificationsFeedbackDto;
        this.parent = notificationsNotificationDto;
        this.reply = notificationsReplyDto;
        this.type = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationItemDto)) {
            return false;
        }
        NotificationsNotificationItemDto notificationsNotificationItemDto = (NotificationsNotificationItemDto) obj;
        return this.innerType == notificationsNotificationItemDto.innerType && epx.f(this.date, notificationsNotificationItemDto.date) && epx.f(this.feedback, notificationsNotificationItemDto.feedback) && epx.f(this.parent, notificationsNotificationItemDto.parent) && epx.f(this.reply, notificationsNotificationItemDto.reply) && epx.f(this.type, notificationsNotificationItemDto.type);
    }

    public final int hashCode() {
        int hashCode = this.innerType.hashCode() * 31;
        Integer num = this.date;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        NotificationsFeedbackDto notificationsFeedbackDto = this.feedback;
        int hashCode3 = (hashCode2 + (notificationsFeedbackDto == null ? 0 : notificationsFeedbackDto.hashCode())) * 31;
        NotificationsNotificationDto notificationsNotificationDto = this.parent;
        int hashCode4 = (hashCode3 + (notificationsNotificationDto == null ? 0 : notificationsNotificationDto.hashCode())) * 31;
        NotificationsReplyDto notificationsReplyDto = this.reply;
        int hashCode5 = (hashCode4 + (notificationsReplyDto == null ? 0 : notificationsReplyDto.hashCode())) * 31;
        String str = this.type;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsNotificationItemDto(innerType=");
        sb.append(this.innerType);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", feedback=");
        sb.append(this.feedback);
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", reply=");
        sb.append(this.reply);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.innerType.writeToParcel(parcel, i);
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        NotificationsFeedbackDto notificationsFeedbackDto = this.feedback;
        if (notificationsFeedbackDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsFeedbackDto.writeToParcel(parcel, i);
        }
        NotificationsNotificationDto notificationsNotificationDto = this.parent;
        if (notificationsNotificationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationDto.writeToParcel(parcel, i);
        }
        NotificationsReplyDto notificationsReplyDto = this.reply;
        if (notificationsReplyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsReplyDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.type);
    }

    public /* synthetic */ NotificationsNotificationItemDto(InnerTypeDto innerTypeDto, Integer num, NotificationsFeedbackDto notificationsFeedbackDto, NotificationsNotificationDto notificationsNotificationDto, NotificationsReplyDto notificationsReplyDto, String str, int i, zcl zclVar) {
        this(innerTypeDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : notificationsFeedbackDto, (i & 8) != 0 ? null : notificationsNotificationDto, (i & 16) != 0 ? null : notificationsReplyDto, (i & 32) != 0 ? null : str);
    }
}
