package com.vk.sdk.api.notifications.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsNotificationDto.kt */
/* loaded from: classes5.dex */
public final class NotificationsNotificationDto {

    @pmi0("date")
    private final Integer date;

    @pmi0("feedback")
    private final NotificationsFeedbackDto feedback;

    @pmi0("parent")
    private final NotificationsNotificationDto parent;

    @pmi0("reply")
    private final NotificationsReplyDto reply;

    @pmi0("type")
    private final String type;

    public NotificationsNotificationDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationDto)) {
            return false;
        }
        NotificationsNotificationDto notificationsNotificationDto = (NotificationsNotificationDto) obj;
        return epx.f(this.date, notificationsNotificationDto.date) && epx.f(this.feedback, notificationsNotificationDto.feedback) && epx.f(this.parent, notificationsNotificationDto.parent) && epx.f(this.reply, notificationsNotificationDto.reply) && epx.f(this.type, notificationsNotificationDto.type);
    }

    public final int hashCode() {
        Integer num = this.date;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        NotificationsFeedbackDto notificationsFeedbackDto = this.feedback;
        int hashCode2 = (hashCode + (notificationsFeedbackDto == null ? 0 : notificationsFeedbackDto.hashCode())) * 31;
        NotificationsNotificationDto notificationsNotificationDto = this.parent;
        int hashCode3 = (hashCode2 + (notificationsNotificationDto == null ? 0 : notificationsNotificationDto.hashCode())) * 31;
        NotificationsReplyDto notificationsReplyDto = this.reply;
        int hashCode4 = (hashCode3 + (notificationsReplyDto == null ? 0 : notificationsReplyDto.hashCode())) * 31;
        String str = this.type;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.date;
        NotificationsFeedbackDto notificationsFeedbackDto = this.feedback;
        NotificationsNotificationDto notificationsNotificationDto = this.parent;
        NotificationsReplyDto notificationsReplyDto = this.reply;
        String str = this.type;
        StringBuilder sb = new StringBuilder("NotificationsNotificationDto(date=");
        sb.append(num);
        sb.append(", feedback=");
        sb.append(notificationsFeedbackDto);
        sb.append(", parent=");
        sb.append(notificationsNotificationDto);
        sb.append(", reply=");
        sb.append(notificationsReplyDto);
        sb.append(", type=");
        return i5s.a(sb, str, ")");
    }

    public NotificationsNotificationDto(Integer num, NotificationsFeedbackDto notificationsFeedbackDto, NotificationsNotificationDto notificationsNotificationDto, NotificationsReplyDto notificationsReplyDto, String str) {
        this.date = num;
        this.feedback = notificationsFeedbackDto;
        this.parent = notificationsNotificationDto;
        this.reply = notificationsReplyDto;
        this.type = str;
    }

    public /* synthetic */ NotificationsNotificationDto(Integer num, NotificationsFeedbackDto notificationsFeedbackDto, NotificationsNotificationDto notificationsNotificationDto, NotificationsReplyDto notificationsReplyDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : notificationsFeedbackDto, (i & 4) != 0 ? null : notificationsNotificationDto, (i & 8) != 0 ? null : notificationsReplyDto, (i & 16) != 0 ? null : str);
    }
}
