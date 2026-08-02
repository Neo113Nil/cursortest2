package com.vk.sdk.api.widgets.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WidgetsCommentRepliesDto.kt */
/* loaded from: classes5.dex */
public final class WidgetsCommentRepliesDto {

    @pmi0("can_post")
    private final BaseBoolIntDto canPost;

    @pmi0("can_view")
    private final BaseBoolIntDto canView;

    @pmi0("count")
    private final Integer count;

    @pmi0("groups_can_post")
    private final BaseBoolIntDto groupsCanPost;

    @pmi0("replies")
    private final List<WidgetsCommentRepliesItemDto> replies;

    public WidgetsCommentRepliesDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsCommentRepliesDto)) {
            return false;
        }
        WidgetsCommentRepliesDto widgetsCommentRepliesDto = (WidgetsCommentRepliesDto) obj;
        return this.canPost == widgetsCommentRepliesDto.canPost && epx.f(this.count, widgetsCommentRepliesDto.count) && epx.f(this.replies, widgetsCommentRepliesDto.replies) && this.groupsCanPost == widgetsCommentRepliesDto.groupsCanPost && this.canView == widgetsCommentRepliesDto.canView;
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.canPost;
        int hashCode = (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode()) * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<WidgetsCommentRepliesItemDto> list = this.replies;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.groupsCanPost;
        int hashCode4 = (hashCode3 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canView;
        return hashCode4 + (baseBoolIntDto3 != null ? baseBoolIntDto3.hashCode() : 0);
    }

    public final String toString() {
        return "WidgetsCommentRepliesDto(canPost=" + this.canPost + ", count=" + this.count + ", replies=" + this.replies + ", groupsCanPost=" + this.groupsCanPost + ", canView=" + this.canView + ")";
    }

    public WidgetsCommentRepliesDto(BaseBoolIntDto baseBoolIntDto, Integer num, List<WidgetsCommentRepliesItemDto> list, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3) {
        this.canPost = baseBoolIntDto;
        this.count = num;
        this.replies = list;
        this.groupsCanPost = baseBoolIntDto2;
        this.canView = baseBoolIntDto3;
    }

    public /* synthetic */ WidgetsCommentRepliesDto(BaseBoolIntDto baseBoolIntDto, Integer num, List list, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseBoolIntDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : baseBoolIntDto2, (i & 16) != 0 ? null : baseBoolIntDto3);
    }
}
