package com.vk.sdk.api.notifications.dto;

import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.wr;
import xsna.zcl;

/* compiled from: NotificationsReplyDto.kt */
/* loaded from: classes5.dex */
public final class NotificationsReplyDto {

    @pmi0("date")
    private final Integer date;

    @pmi0("id")
    private final Integer id;

    @pmi0("text")
    private final Integer text;

    public NotificationsReplyDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsReplyDto)) {
            return false;
        }
        NotificationsReplyDto notificationsReplyDto = (NotificationsReplyDto) obj;
        return epx.f(this.date, notificationsReplyDto.date) && epx.f(this.id, notificationsReplyDto.id) && epx.f(this.text, notificationsReplyDto.text);
    }

    public final int hashCode() {
        Integer num = this.date;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.id;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.text;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.date;
        Integer num2 = this.id;
        return oq.b(wr.a(num, "NotificationsReplyDto(date=", num2, ", id=", ", text="), this.text, ")");
    }

    public NotificationsReplyDto(Integer num, Integer num2, Integer num3) {
        this.date = num;
        this.id = num2;
        this.text = num3;
    }

    public /* synthetic */ NotificationsReplyDto(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
