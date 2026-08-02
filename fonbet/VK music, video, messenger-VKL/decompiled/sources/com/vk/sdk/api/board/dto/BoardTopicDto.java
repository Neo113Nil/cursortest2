package com.vk.sdk.api.board.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.i5s;
import xsna.kr;
import xsna.pmi0;
import xsna.to;
import xsna.wr;
import xsna.zcl;

/* compiled from: BoardTopicDto.kt */
/* loaded from: classes5.dex */
public final class BoardTopicDto {

    @pmi0("comments")
    private final Integer comments;

    @pmi0("created")
    private final Integer created;

    @pmi0("created_by")
    private final UserId createdBy;

    @pmi0("first_comment")
    private final String firstComment;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_closed")
    private final BaseBoolIntDto isClosed;

    @pmi0("is_fixed")
    private final BaseBoolIntDto isFixed;

    @pmi0("last_comment")
    private final String lastComment;

    @pmi0("title")
    private final String title;

    @pmi0("updated")
    private final Integer updated;

    @pmi0("updated_by")
    private final UserId updatedBy;

    public BoardTopicDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardTopicDto)) {
            return false;
        }
        BoardTopicDto boardTopicDto = (BoardTopicDto) obj;
        return epx.f(this.comments, boardTopicDto.comments) && epx.f(this.created, boardTopicDto.created) && epx.f(this.createdBy, boardTopicDto.createdBy) && epx.f(this.id, boardTopicDto.id) && this.isClosed == boardTopicDto.isClosed && this.isFixed == boardTopicDto.isFixed && epx.f(this.title, boardTopicDto.title) && epx.f(this.updated, boardTopicDto.updated) && epx.f(this.updatedBy, boardTopicDto.updatedBy) && epx.f(this.firstComment, boardTopicDto.firstComment) && epx.f(this.lastComment, boardTopicDto.lastComment);
    }

    public final int hashCode() {
        Integer num = this.comments;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.created;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.createdBy;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num3 = this.id;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isClosed;
        int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isFixed;
        int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        String str = this.title;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.updated;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        UserId userId2 = this.updatedBy;
        int hashCode9 = (hashCode8 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str2 = this.firstComment;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastComment;
        return hashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.comments;
        Integer num2 = this.created;
        UserId userId = this.createdBy;
        Integer num3 = this.id;
        BaseBoolIntDto baseBoolIntDto = this.isClosed;
        BaseBoolIntDto baseBoolIntDto2 = this.isFixed;
        String str = this.title;
        Integer num4 = this.updated;
        UserId userId2 = this.updatedBy;
        String str2 = this.firstComment;
        String str3 = this.lastComment;
        StringBuilder a = wr.a(num, "BoardTopicDto(comments=", num2, ", created=", ", createdBy=");
        a.append(userId);
        a.append(", id=");
        a.append(num3);
        a.append(", isClosed=");
        to.b(a, baseBoolIntDto, ", isFixed=", baseBoolIntDto2, ", title=");
        kr.b(num4, str, ", updated=", ", updatedBy=", a);
        a.append(userId2);
        a.append(", firstComment=");
        a.append(str2);
        a.append(", lastComment=");
        return i5s.a(a, str3, ")");
    }

    public BoardTopicDto(Integer num, Integer num2, UserId userId, Integer num3, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, String str, Integer num4, UserId userId2, String str2, String str3) {
        this.comments = num;
        this.created = num2;
        this.createdBy = userId;
        this.id = num3;
        this.isClosed = baseBoolIntDto;
        this.isFixed = baseBoolIntDto2;
        this.title = str;
        this.updated = num4;
        this.updatedBy = userId2;
        this.firstComment = str2;
        this.lastComment = str3;
    }

    public /* synthetic */ BoardTopicDto(Integer num, Integer num2, UserId userId, Integer num3, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, String str, Integer num4, UserId userId2, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : baseBoolIntDto, (i & 32) != 0 ? null : baseBoolIntDto2, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : userId2, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3);
    }
}
