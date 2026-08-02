package com.vk.sdk.api.bugtracker.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BugtrackerCreateCommentResponseDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerCreateCommentResponseDto {

    @pmi0("comment")
    private final BugtrackerCommentDto comment;

    @pmi0("comment_flood")
    private final Boolean commentFlood;

    @pmi0("subscribe_state")
    private final BugtrackerBugreportSubscribeStateDto subscribeState;

    public BugtrackerCreateCommentResponseDto(BugtrackerCommentDto bugtrackerCommentDto, Boolean bool, BugtrackerBugreportSubscribeStateDto bugtrackerBugreportSubscribeStateDto) {
        this.comment = bugtrackerCommentDto;
        this.commentFlood = bool;
        this.subscribeState = bugtrackerBugreportSubscribeStateDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerCreateCommentResponseDto)) {
            return false;
        }
        BugtrackerCreateCommentResponseDto bugtrackerCreateCommentResponseDto = (BugtrackerCreateCommentResponseDto) obj;
        return epx.f(this.comment, bugtrackerCreateCommentResponseDto.comment) && epx.f(this.commentFlood, bugtrackerCreateCommentResponseDto.commentFlood) && epx.f(this.subscribeState, bugtrackerCreateCommentResponseDto.subscribeState);
    }

    public final int hashCode() {
        int hashCode = this.comment.hashCode() * 31;
        Boolean bool = this.commentFlood;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BugtrackerBugreportSubscribeStateDto bugtrackerBugreportSubscribeStateDto = this.subscribeState;
        return hashCode2 + (bugtrackerBugreportSubscribeStateDto != null ? bugtrackerBugreportSubscribeStateDto.hashCode() : 0);
    }

    public final String toString() {
        return "BugtrackerCreateCommentResponseDto(comment=" + this.comment + ", commentFlood=" + this.commentFlood + ", subscribeState=" + this.subscribeState + ")";
    }

    public /* synthetic */ BugtrackerCreateCommentResponseDto(BugtrackerCommentDto bugtrackerCommentDto, Boolean bool, BugtrackerBugreportSubscribeStateDto bugtrackerBugreportSubscribeStateDto, int i, zcl zclVar) {
        this(bugtrackerCommentDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bugtrackerBugreportSubscribeStateDto);
    }
}
