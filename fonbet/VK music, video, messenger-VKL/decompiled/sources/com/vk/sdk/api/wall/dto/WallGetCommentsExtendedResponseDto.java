package com.vk.sdk.api.wall.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.rq;
import xsna.vq;
import xsna.zcl;
import xsna.zn;

/* compiled from: WallGetCommentsExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallGetCommentsExtendedResponseDto {

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

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    public WallGetCommentsExtendedResponseDto(int i, List<WallWallCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.currentLevelCount = num;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetCommentsExtendedResponseDto)) {
            return false;
        }
        WallGetCommentsExtendedResponseDto wallGetCommentsExtendedResponseDto = (WallGetCommentsExtendedResponseDto) obj;
        return this.count == wallGetCommentsExtendedResponseDto.count && epx.f(this.items, wallGetCommentsExtendedResponseDto.items) && epx.f(this.profiles, wallGetCommentsExtendedResponseDto.profiles) && epx.f(this.groups, wallGetCommentsExtendedResponseDto.groups) && epx.f(this.currentLevelCount, wallGetCommentsExtendedResponseDto.currentLevelCount) && epx.f(this.canPost, wallGetCommentsExtendedResponseDto.canPost) && epx.f(this.showReplyButton, wallGetCommentsExtendedResponseDto.showReplyButton) && epx.f(this.groupsCanPost, wallGetCommentsExtendedResponseDto.groupsCanPost);
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
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
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
        StringBuilder c = zn.c(i, "WallGetCommentsExtendedResponseDto(count=", ", items=", ", profiles=", list);
        vq.d(c, list2, ", groups=", list3, ", currentLevelCount=");
        rq.h(c, num, ", canPost=", bool, ", showReplyButton=");
        c.append(bool2);
        c.append(", groupsCanPost=");
        c.append(bool3);
        c.append(")");
        return c.toString();
    }

    public /* synthetic */ WallGetCommentsExtendedResponseDto(int i, List list, List list2, List list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : bool3);
    }
}
