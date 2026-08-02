package com.vk.sdk.api.notifications.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsSendMessageItemDto.kt */
/* loaded from: classes5.dex */
public final class NotificationsSendMessageItemDto {

    @pmi0("error")
    private final NotificationsSendMessageErrorDto error;

    @pmi0("status")
    private final Boolean status;

    @pmi0("user_id")
    private final UserId userId;

    public NotificationsSendMessageItemDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSendMessageItemDto)) {
            return false;
        }
        NotificationsSendMessageItemDto notificationsSendMessageItemDto = (NotificationsSendMessageItemDto) obj;
        return epx.f(this.userId, notificationsSendMessageItemDto.userId) && epx.f(this.status, notificationsSendMessageItemDto.status) && epx.f(this.error, notificationsSendMessageItemDto.error);
    }

    public final int hashCode() {
        UserId userId = this.userId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Boolean bool = this.status;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NotificationsSendMessageErrorDto notificationsSendMessageErrorDto = this.error;
        return hashCode2 + (notificationsSendMessageErrorDto != null ? notificationsSendMessageErrorDto.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationsSendMessageItemDto(userId=" + this.userId + ", status=" + this.status + ", error=" + this.error + ")";
    }

    public NotificationsSendMessageItemDto(UserId userId, Boolean bool, NotificationsSendMessageErrorDto notificationsSendMessageErrorDto) {
        this.userId = userId;
        this.status = bool;
        this.error = notificationsSendMessageErrorDto;
    }

    public /* synthetic */ NotificationsSendMessageItemDto(UserId userId, Boolean bool, NotificationsSendMessageErrorDto notificationsSendMessageErrorDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : notificationsSendMessageErrorDto);
    }
}
