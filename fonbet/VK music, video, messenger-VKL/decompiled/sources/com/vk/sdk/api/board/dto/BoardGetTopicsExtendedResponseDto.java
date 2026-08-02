package com.vk.sdk.api.board.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zn;

/* compiled from: BoardGetTopicsExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class BoardGetTopicsExtendedResponseDto {

    @pmi0("can_add_topics")
    private final BaseBoolIntDto canAddTopics;

    @pmi0("count")
    private final int count;

    @pmi0("default_order")
    private final BoardDefaultOrderDto defaultOrder;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<BoardTopicDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public BoardGetTopicsExtendedResponseDto(int i, List<BoardTopicDto> list, BoardDefaultOrderDto boardDefaultOrderDto, BaseBoolIntDto baseBoolIntDto, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.defaultOrder = boardDefaultOrderDto;
        this.canAddTopics = baseBoolIntDto;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetTopicsExtendedResponseDto)) {
            return false;
        }
        BoardGetTopicsExtendedResponseDto boardGetTopicsExtendedResponseDto = (BoardGetTopicsExtendedResponseDto) obj;
        return this.count == boardGetTopicsExtendedResponseDto.count && epx.f(this.items, boardGetTopicsExtendedResponseDto.items) && this.defaultOrder == boardGetTopicsExtendedResponseDto.defaultOrder && this.canAddTopics == boardGetTopicsExtendedResponseDto.canAddTopics && epx.f(this.profiles, boardGetTopicsExtendedResponseDto.profiles) && epx.f(this.groups, boardGetTopicsExtendedResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(vp.a(this.canAddTopics, (this.defaultOrder.hashCode() + fw3.a(Integer.hashCode(this.count) * 31, 31, this.items)) * 31, 31), 31, this.profiles);
    }

    public final String toString() {
        int i = this.count;
        List<BoardTopicDto> list = this.items;
        BoardDefaultOrderDto boardDefaultOrderDto = this.defaultOrder;
        BaseBoolIntDto baseBoolIntDto = this.canAddTopics;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        StringBuilder c = zn.c(i, "BoardGetTopicsExtendedResponseDto(count=", ", items=", ", defaultOrder=", list);
        c.append(boardDefaultOrderDto);
        c.append(", canAddTopics=");
        c.append(baseBoolIntDto);
        c.append(", profiles=");
        return n.b(c, list2, ", groups=", list3, ")");
    }
}
