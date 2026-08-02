package com.vk.sdk.api.video.dto;

import com.vk.sdk.api.wall.dto.WallWallCommentDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.oq;
import xsna.pmi0;
import xsna.rq;
import xsna.tq;
import xsna.zcl;
import xsna.zn;

/* compiled from: VideoGetCommentsResponseDto.kt */
/* loaded from: classes5.dex */
public final class VideoGetCommentsResponseDto {

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

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    public VideoGetCommentsResponseDto(int i, List<WallWallCommentDto> list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2) {
        this.count = i;
        this.items = list;
        this.currentLevelCount = num;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
        this.realOffset = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetCommentsResponseDto)) {
            return false;
        }
        VideoGetCommentsResponseDto videoGetCommentsResponseDto = (VideoGetCommentsResponseDto) obj;
        return this.count == videoGetCommentsResponseDto.count && epx.f(this.items, videoGetCommentsResponseDto.items) && epx.f(this.currentLevelCount, videoGetCommentsResponseDto.currentLevelCount) && epx.f(this.canPost, videoGetCommentsResponseDto.canPost) && epx.f(this.showReplyButton, videoGetCommentsResponseDto.showReplyButton) && epx.f(this.groupsCanPost, videoGetCommentsResponseDto.groupsCanPost) && epx.f(this.realOffset, videoGetCommentsResponseDto.realOffset);
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
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.realOffset;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<WallWallCommentDto> list = this.items;
        Integer num = this.currentLevelCount;
        Boolean bool = this.canPost;
        Boolean bool2 = this.showReplyButton;
        Boolean bool3 = this.groupsCanPost;
        Integer num2 = this.realOffset;
        StringBuilder c = zn.c(i, "VideoGetCommentsResponseDto(count=", ", items=", ", currentLevelCount=", list);
        rq.h(c, num, ", canPost=", bool, ", showReplyButton=");
        tq.i(c, bool2, ", groupsCanPost=", bool3, ", realOffset=");
        return oq.b(c, num2, ")");
    }

    public /* synthetic */ VideoGetCommentsResponseDto(int i, List list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : bool3, (i2 & 64) != 0 ? null : num2);
    }
}
