package com.vk.sdk.api.video.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zn;

/* compiled from: VideoSearchExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class VideoSearchExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    public VideoSearchExtendedResponseDto(int i, List<VideoVideoFullDto> list, List<UsersUserDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSearchExtendedResponseDto)) {
            return false;
        }
        VideoSearchExtendedResponseDto videoSearchExtendedResponseDto = (VideoSearchExtendedResponseDto) obj;
        return this.count == videoSearchExtendedResponseDto.count && epx.f(this.items, videoSearchExtendedResponseDto.items) && epx.f(this.profiles, videoSearchExtendedResponseDto.profiles) && epx.f(this.groups, videoSearchExtendedResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles);
    }

    public final String toString() {
        int i = this.count;
        List<VideoVideoFullDto> list = this.items;
        return n.b(zn.c(i, "VideoSearchExtendedResponseDto(count=", ", items=", ", profiles=", list), this.profiles, ", groups=", this.groups, ")");
    }
}
