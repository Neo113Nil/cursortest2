package com.vk.sdk.api.video.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import com.vk.sdk.api.wall.dto.WallWallCommentDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.oq;
import xsna.pmi0;
import xsna.rq;
import xsna.tq;
import xsna.vq;
import xsna.zcl;
import xsna.zn;

/* compiled from: VideoGetCommentsExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class VideoGetCommentsExtendedResponseDto {

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("count")
    private final int count;

    @pmi0("current_level_count")
    private final Integer currentLevelCount;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    public VideoGetCommentsExtendedResponseDto(int i, List<WallWallCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
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
        if (!(obj instanceof VideoGetCommentsExtendedResponseDto)) {
            return false;
        }
        VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto = (VideoGetCommentsExtendedResponseDto) obj;
        return this.count == videoGetCommentsExtendedResponseDto.count && epx.f(this.items, videoGetCommentsExtendedResponseDto.items) && epx.f(this.profiles, videoGetCommentsExtendedResponseDto.profiles) && epx.f(this.groups, videoGetCommentsExtendedResponseDto.groups) && epx.f(this.currentLevelCount, videoGetCommentsExtendedResponseDto.currentLevelCount) && epx.f(this.canPost, videoGetCommentsExtendedResponseDto.canPost) && epx.f(this.showReplyButton, videoGetCommentsExtendedResponseDto.showReplyButton) && epx.f(this.groupsCanPost, videoGetCommentsExtendedResponseDto.groupsCanPost) && epx.f(this.realOffset, videoGetCommentsExtendedResponseDto.realOffset);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles), 31, this.groups);
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
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        Integer num = this.currentLevelCount;
        Boolean bool = this.canPost;
        Boolean bool2 = this.showReplyButton;
        Boolean bool3 = this.groupsCanPost;
        Integer num2 = this.realOffset;
        StringBuilder c = zn.c(i, "VideoGetCommentsExtendedResponseDto(count=", ", items=", ", profiles=", list);
        vq.d(c, list2, ", groups=", list3, ", currentLevelCount=");
        rq.h(c, num, ", canPost=", bool, ", showReplyButton=");
        tq.i(c, bool2, ", groupsCanPost=", bool3, ", realOffset=");
        return oq.b(c, num2, ")");
    }

    public /* synthetic */ VideoGetCommentsExtendedResponseDto(int i, List list, List list2, List list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : num2);
    }
}
