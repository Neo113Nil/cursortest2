package com.vk.sdk.api.board.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zn;

/* compiled from: BoardGetTopicsResponseDto.kt */
/* loaded from: classes5.dex */
public final class BoardGetTopicsResponseDto {

    @pmi0("can_add_topics")
    private final BaseBoolIntDto canAddTopics;

    @pmi0("count")
    private final int count;

    @pmi0("default_order")
    private final BoardDefaultOrderDto defaultOrder;

    @pmi0("items")
    private final List<BoardTopicDto> items;

    public BoardGetTopicsResponseDto(int i, List<BoardTopicDto> list, BoardDefaultOrderDto boardDefaultOrderDto, BaseBoolIntDto baseBoolIntDto) {
        this.count = i;
        this.items = list;
        this.defaultOrder = boardDefaultOrderDto;
        this.canAddTopics = baseBoolIntDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetTopicsResponseDto)) {
            return false;
        }
        BoardGetTopicsResponseDto boardGetTopicsResponseDto = (BoardGetTopicsResponseDto) obj;
        return this.count == boardGetTopicsResponseDto.count && epx.f(this.items, boardGetTopicsResponseDto.items) && this.defaultOrder == boardGetTopicsResponseDto.defaultOrder && this.canAddTopics == boardGetTopicsResponseDto.canAddTopics;
    }

    public final int hashCode() {
        return this.canAddTopics.hashCode() + ((this.defaultOrder.hashCode() + fw3.a(Integer.hashCode(this.count) * 31, 31, this.items)) * 31);
    }

    public final String toString() {
        int i = this.count;
        List<BoardTopicDto> list = this.items;
        BoardDefaultOrderDto boardDefaultOrderDto = this.defaultOrder;
        BaseBoolIntDto baseBoolIntDto = this.canAddTopics;
        StringBuilder c = zn.c(i, "BoardGetTopicsResponseDto(count=", ", items=", ", defaultOrder=", list);
        c.append(boardDefaultOrderDto);
        c.append(", canAddTopics=");
        c.append(baseBoolIntDto);
        c.append(")");
        return c.toString();
    }
}
