package com.vk.sdk.api.wall.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallGetCommentResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallGetCommentResponseDto {

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    public WallGetCommentResponseDto(List<WallWallCommentDto> list, Boolean bool, Boolean bool2, Boolean bool3) {
        this.items = list;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetCommentResponseDto)) {
            return false;
        }
        WallGetCommentResponseDto wallGetCommentResponseDto = (WallGetCommentResponseDto) obj;
        return epx.f(this.items, wallGetCommentResponseDto.items) && epx.f(this.canPost, wallGetCommentResponseDto.canPost) && epx.f(this.showReplyButton, wallGetCommentResponseDto.showReplyButton) && epx.f(this.groupsCanPost, wallGetCommentResponseDto.groupsCanPost);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Boolean bool = this.canPost;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showReplyButton;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupsCanPost;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "WallGetCommentResponseDto(items=" + this.items + ", canPost=" + this.canPost + ", showReplyButton=" + this.showReplyButton + ", groupsCanPost=" + this.groupsCanPost + ")";
    }

    public /* synthetic */ WallGetCommentResponseDto(List list, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3);
    }
}
