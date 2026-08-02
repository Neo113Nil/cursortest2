package com.vk.sdk.api.comment.dto;

import com.vk.sdk.api.wall.dto.WallWallCommentDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.tq;
import xsna.xq;
import xsna.zcl;
import xsna.zn;

/* compiled from: CommentThreadDto.kt */
/* loaded from: classes5.dex */
public final class CommentThreadDto {

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("count")
    private final int count;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    public CommentThreadDto(int i, List<WallWallCommentDto> list, Boolean bool, Boolean bool2, Boolean bool3) {
        this.count = i;
        this.items = list;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentThreadDto)) {
            return false;
        }
        CommentThreadDto commentThreadDto = (CommentThreadDto) obj;
        return this.count == commentThreadDto.count && epx.f(this.items, commentThreadDto.items) && epx.f(this.canPost, commentThreadDto.canPost) && epx.f(this.showReplyButton, commentThreadDto.showReplyButton) && epx.f(this.groupsCanPost, commentThreadDto.groupsCanPost);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        List<WallWallCommentDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.canPost;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showReplyButton;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupsCanPost;
        return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<WallWallCommentDto> list = this.items;
        Boolean bool = this.canPost;
        Boolean bool2 = this.showReplyButton;
        Boolean bool3 = this.groupsCanPost;
        StringBuilder c = zn.c(i, "CommentThreadDto(count=", ", items=", ", canPost=", list);
        tq.i(c, bool, ", showReplyButton=", bool2, ", groupsCanPost=");
        return xq.d(c, bool3, ")");
    }

    public /* synthetic */ CommentThreadDto(int i, List list, Boolean bool, Boolean bool2, Boolean bool3, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : bool3);
    }
}
