package com.vk.sdk.api.notifications.dto;

import com.vk.sdk.api.base.dto.BaseGeoDto;
import com.vk.sdk.api.base.dto.BaseLikesInfoDto;
import com.vk.sdk.api.wall.dto.WallWallpostAttachmentDto;
import java.util.List;
import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsFeedbackDto.kt */
/* loaded from: classes5.dex */
public final class NotificationsFeedbackDto {

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("from_id")
    private final Integer fromId;

    @pmi0("geo")
    private final BaseGeoDto geo;

    @pmi0("id")
    private final Integer id;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

    @pmi0("text")
    private final String text;

    @pmi0("to_id")
    private final Integer toId;

    public NotificationsFeedbackDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsFeedbackDto)) {
            return false;
        }
        NotificationsFeedbackDto notificationsFeedbackDto = (NotificationsFeedbackDto) obj;
        return epx.f(this.attachments, notificationsFeedbackDto.attachments) && epx.f(this.fromId, notificationsFeedbackDto.fromId) && epx.f(this.geo, notificationsFeedbackDto.geo) && epx.f(this.id, notificationsFeedbackDto.id) && epx.f(this.likes, notificationsFeedbackDto.likes) && epx.f(this.text, notificationsFeedbackDto.text) && epx.f(this.toId, notificationsFeedbackDto.toId);
    }

    public final int hashCode() {
        List<WallWallpostAttachmentDto> list = this.attachments;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.fromId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseGeoDto baseGeoDto = this.geo;
        int hashCode3 = (hashCode2 + (baseGeoDto == null ? 0 : baseGeoDto.hashCode())) * 31;
        Integer num2 = this.id;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        int hashCode5 = (hashCode4 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
        String str = this.text;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.toId;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        List<WallWallpostAttachmentDto> list = this.attachments;
        Integer num = this.fromId;
        BaseGeoDto baseGeoDto = this.geo;
        Integer num2 = this.id;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        String str = this.text;
        Integer num3 = this.toId;
        StringBuilder sb = new StringBuilder("NotificationsFeedbackDto(attachments=");
        sb.append(list);
        sb.append(", fromId=");
        sb.append(num);
        sb.append(", geo=");
        sb.append(baseGeoDto);
        sb.append(", id=");
        sb.append(num2);
        sb.append(", likes=");
        sb.append(baseLikesInfoDto);
        sb.append(", text=");
        sb.append(str);
        sb.append(", toId=");
        return oq.b(sb, num3, ")");
    }

    public NotificationsFeedbackDto(List<WallWallpostAttachmentDto> list, Integer num, BaseGeoDto baseGeoDto, Integer num2, BaseLikesInfoDto baseLikesInfoDto, String str, Integer num3) {
        this.attachments = list;
        this.fromId = num;
        this.geo = baseGeoDto;
        this.id = num2;
        this.likes = baseLikesInfoDto;
        this.text = str;
        this.toId = num3;
    }

    public /* synthetic */ NotificationsFeedbackDto(List list, Integer num, BaseGeoDto baseGeoDto, Integer num2, BaseLikesInfoDto baseLikesInfoDto, String str, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : baseGeoDto, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : baseLikesInfoDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num3);
    }
}
