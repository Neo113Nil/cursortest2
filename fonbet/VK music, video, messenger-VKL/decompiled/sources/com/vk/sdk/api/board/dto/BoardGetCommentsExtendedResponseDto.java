package com.vk.sdk.api.board.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.polls.dto.PollsPollDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vq;
import xsna.zcl;
import xsna.zn;

/* compiled from: BoardGetCommentsExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class BoardGetCommentsExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<BoardTopicCommentDto> items;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("real_offset")
    private final Integer realOffset;

    public BoardGetCommentsExtendedResponseDto(int i, List<BoardTopicCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, PollsPollDto pollsPollDto, Integer num) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.poll = pollsPollDto;
        this.realOffset = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetCommentsExtendedResponseDto)) {
            return false;
        }
        BoardGetCommentsExtendedResponseDto boardGetCommentsExtendedResponseDto = (BoardGetCommentsExtendedResponseDto) obj;
        return this.count == boardGetCommentsExtendedResponseDto.count && epx.f(this.items, boardGetCommentsExtendedResponseDto.items) && epx.f(this.profiles, boardGetCommentsExtendedResponseDto.profiles) && epx.f(this.groups, boardGetCommentsExtendedResponseDto.groups) && epx.f(this.poll, boardGetCommentsExtendedResponseDto.poll) && epx.f(this.realOffset, boardGetCommentsExtendedResponseDto.realOffset);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles), 31, this.groups);
        PollsPollDto pollsPollDto = this.poll;
        int hashCode = (a + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        Integer num = this.realOffset;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<BoardTopicCommentDto> list = this.items;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        PollsPollDto pollsPollDto = this.poll;
        Integer num = this.realOffset;
        StringBuilder c = zn.c(i, "BoardGetCommentsExtendedResponseDto(count=", ", items=", ", profiles=", list);
        vq.d(c, list2, ", groups=", list3, ", poll=");
        c.append(pollsPollDto);
        c.append(", realOffset=");
        c.append(num);
        c.append(")");
        return c.toString();
    }

    public /* synthetic */ BoardGetCommentsExtendedResponseDto(int i, List list, List list2, List list3, PollsPollDto pollsPollDto, Integer num, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : pollsPollDto, (i2 & 32) != 0 ? null : num);
    }
}
