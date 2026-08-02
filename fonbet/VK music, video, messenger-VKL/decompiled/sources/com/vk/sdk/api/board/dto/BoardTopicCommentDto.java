package com.vk.sdk.api.board.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseLikesInfoDto;
import com.vk.sdk.api.wall.dto.WallCommentAttachmentDto;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.jax0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BoardTopicCommentDto.kt */
/* loaded from: classes5.dex */
public final class BoardTopicCommentDto {

    @pmi0("attachments")
    private final List<WallCommentAttachmentDto> attachments;

    @pmi0("can_edit")
    private final BaseBoolIntDto canEdit;

    @pmi0("date")
    private final int date;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("id")
    private final int id;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("text")
    private final String text;

    public BoardTopicCommentDto(int i, UserId userId, int i2, String str, List<WallCommentAttachmentDto> list, Integer num, BaseBoolIntDto baseBoolIntDto, BaseLikesInfoDto baseLikesInfoDto) {
        this.date = i;
        this.fromId = userId;
        this.id = i2;
        this.text = str;
        this.attachments = list;
        this.realOffset = num;
        this.canEdit = baseBoolIntDto;
        this.likes = baseLikesInfoDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardTopicCommentDto)) {
            return false;
        }
        BoardTopicCommentDto boardTopicCommentDto = (BoardTopicCommentDto) obj;
        return this.date == boardTopicCommentDto.date && epx.f(this.fromId, boardTopicCommentDto.fromId) && this.id == boardTopicCommentDto.id && epx.f(this.text, boardTopicCommentDto.text) && epx.f(this.attachments, boardTopicCommentDto.attachments) && epx.f(this.realOffset, boardTopicCommentDto.realOffset) && this.canEdit == boardTopicCommentDto.canEdit && epx.f(this.likes, boardTopicCommentDto.likes);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.id, bh10.a(Integer.hashCode(this.date) * 31, 31, this.fromId.b), 31), 31, this.text);
        List<WallCommentAttachmentDto> list = this.attachments;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.realOffset;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        return hashCode3 + (baseLikesInfoDto != null ? baseLikesInfoDto.hashCode() : 0);
    }

    public final String toString() {
        int i = this.date;
        UserId userId = this.fromId;
        int i2 = this.id;
        String str = this.text;
        List<WallCommentAttachmentDto> list = this.attachments;
        Integer num = this.realOffset;
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        StringBuilder sb = new StringBuilder("BoardTopicCommentDto(date=");
        sb.append(i);
        sb.append(", fromId=");
        sb.append(userId);
        sb.append(", id=");
        jax0.a(i2, ", text=", str, ", attachments=", sb);
        sb.append(list);
        sb.append(", realOffset=");
        sb.append(num);
        sb.append(", canEdit=");
        sb.append(baseBoolIntDto);
        sb.append(", likes=");
        sb.append(baseLikesInfoDto);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ BoardTopicCommentDto(int i, UserId userId, int i2, String str, List list, Integer num, BaseBoolIntDto baseBoolIntDto, BaseLikesInfoDto baseLikesInfoDto, int i3, zcl zclVar) {
        this(i, userId, i2, str, (i3 & 16) != 0 ? null : list, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : baseBoolIntDto, (i3 & 128) != 0 ? null : baseLikesInfoDto);
    }
}
