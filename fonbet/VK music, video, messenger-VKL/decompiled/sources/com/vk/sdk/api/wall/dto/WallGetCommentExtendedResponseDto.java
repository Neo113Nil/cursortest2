package com.vk.sdk.api.wall.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallGetCommentExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallGetCommentExtendedResponseDto {

    @pmi0("can_post")
    private final Boolean canPost;

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

    public WallGetCommentExtendedResponseDto(List<WallWallCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetCommentExtendedResponseDto)) {
            return false;
        }
        WallGetCommentExtendedResponseDto wallGetCommentExtendedResponseDto = (WallGetCommentExtendedResponseDto) obj;
        return epx.f(this.items, wallGetCommentExtendedResponseDto.items) && epx.f(this.profiles, wallGetCommentExtendedResponseDto.profiles) && epx.f(this.groups, wallGetCommentExtendedResponseDto.groups) && epx.f(this.canPost, wallGetCommentExtendedResponseDto.canPost) && epx.f(this.showReplyButton, wallGetCommentExtendedResponseDto.showReplyButton) && epx.f(this.groupsCanPost, wallGetCommentExtendedResponseDto.groupsCanPost);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(this.items.hashCode() * 31, 31, this.profiles), 31, this.groups);
        Boolean bool = this.canPost;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showReplyButton;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupsCanPost;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "WallGetCommentExtendedResponseDto(items=" + this.items + ", profiles=" + this.profiles + ", groups=" + this.groups + ", canPost=" + this.canPost + ", showReplyButton=" + this.showReplyButton + ", groupsCanPost=" + this.groupsCanPost + ")";
    }

    public /* synthetic */ WallGetCommentExtendedResponseDto(List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(list, list2, list3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3);
    }
}
