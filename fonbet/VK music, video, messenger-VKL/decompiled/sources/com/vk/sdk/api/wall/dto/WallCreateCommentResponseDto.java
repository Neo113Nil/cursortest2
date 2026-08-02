package com.vk.sdk.api.wall.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;
import xsna.zcl;

/* compiled from: WallCreateCommentResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallCreateCommentResponseDto {

    @pmi0("comment_id")
    private final int commentId;

    @pmi0("parents_stack")
    private final List<Integer> parentsStack;

    public WallCreateCommentResponseDto(int i, List<Integer> list) {
        this.commentId = i;
        this.parentsStack = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallCreateCommentResponseDto)) {
            return false;
        }
        WallCreateCommentResponseDto wallCreateCommentResponseDto = (WallCreateCommentResponseDto) obj;
        return this.commentId == wallCreateCommentResponseDto.commentId && epx.f(this.parentsStack, wallCreateCommentResponseDto.parentsStack);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.commentId) * 31;
        List<Integer> list = this.parentsStack;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return pn.c(this.commentId, "WallCreateCommentResponseDto(commentId=", ", parentsStack=", ")", this.parentsStack);
    }

    public /* synthetic */ WallCreateCommentResponseDto(int i, List list, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list);
    }
}
