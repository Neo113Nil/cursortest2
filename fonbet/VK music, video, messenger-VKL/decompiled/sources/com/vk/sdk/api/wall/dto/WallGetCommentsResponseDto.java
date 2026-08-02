package com.vk.sdk.api.wall.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.rq;
import xsna.zcl;
import xsna.zn;

/* compiled from: WallGetCommentsResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallGetCommentsResponseDto {

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("count")
    private final int count;

    @pmi0("current_level_count")
    private final Integer currentLevelCount;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    public WallGetCommentsResponseDto(int i, List<WallWallCommentDto> list, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        this.count = i;
        this.items = list;
        this.currentLevelCount = num;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetCommentsResponseDto)) {
            return false;
        }
        WallGetCommentsResponseDto wallGetCommentsResponseDto = (WallGetCommentsResponseDto) obj;
        return this.count == wallGetCommentsResponseDto.count && epx.f(this.items, wallGetCommentsResponseDto.items) && epx.f(this.currentLevelCount, wallGetCommentsResponseDto.currentLevelCount) && epx.f(this.canPost, wallGetCommentsResponseDto.canPost) && epx.f(this.showReplyButton, wallGetCommentsResponseDto.showReplyButton) && epx.f(this.groupsCanPost, wallGetCommentsResponseDto.groupsCanPost);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.currentLevelCount;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canPost;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showReplyButton;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupsCanPost;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<WallWallCommentDto> list = this.items;
        Integer num = this.currentLevelCount;
        Boolean bool = this.canPost;
        Boolean bool2 = this.showReplyButton;
        Boolean bool3 = this.groupsCanPost;
        StringBuilder c = zn.c(i, "WallGetCommentsResponseDto(count=", ", items=", ", currentLevelCount=", list);
        rq.h(c, num, ", canPost=", bool, ", showReplyButton=");
        c.append(bool2);
        c.append(", groupsCanPost=");
        c.append(bool3);
        c.append(")");
        return c.toString();
    }

    public /* synthetic */ WallGetCommentsResponseDto(int i, List list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : bool3);
    }
}
