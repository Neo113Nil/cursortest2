package com.vk.sdk.api.board.dto;

import com.vk.sdk.api.polls.dto.PollsPollDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: BoardGetCommentsResponseDto.kt */
/* loaded from: classes5.dex */
public final class BoardGetCommentsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<BoardTopicCommentDto> items;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("real_offset")
    private final Integer realOffset;

    public BoardGetCommentsResponseDto(int i, List<BoardTopicCommentDto> list, PollsPollDto pollsPollDto, Integer num) {
        this.count = i;
        this.items = list;
        this.poll = pollsPollDto;
        this.realOffset = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetCommentsResponseDto)) {
            return false;
        }
        BoardGetCommentsResponseDto boardGetCommentsResponseDto = (BoardGetCommentsResponseDto) obj;
        return this.count == boardGetCommentsResponseDto.count && epx.f(this.items, boardGetCommentsResponseDto.items) && epx.f(this.poll, boardGetCommentsResponseDto.poll) && epx.f(this.realOffset, boardGetCommentsResponseDto.realOffset);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        PollsPollDto pollsPollDto = this.poll;
        int hashCode = (a + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        Integer num = this.realOffset;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<BoardTopicCommentDto> list = this.items;
        PollsPollDto pollsPollDto = this.poll;
        Integer num = this.realOffset;
        StringBuilder c = zn.c(i, "BoardGetCommentsResponseDto(count=", ", items=", ", poll=", list);
        c.append(pollsPollDto);
        c.append(", realOffset=");
        c.append(num);
        c.append(")");
        return c.toString();
    }

    public /* synthetic */ BoardGetCommentsResponseDto(int i, List list, PollsPollDto pollsPollDto, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : pollsPollDto, (i2 & 8) != 0 ? null : num);
    }
}
