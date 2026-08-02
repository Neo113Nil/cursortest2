package com.vk.sdk.api.stories.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zn;

/* compiled from: StoriesGetByIdExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoriesGetByIdExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<StoriesStoryDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public StoriesGetByIdExtendedResponseDto(int i, List<StoriesStoryDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetByIdExtendedResponseDto)) {
            return false;
        }
        StoriesGetByIdExtendedResponseDto storiesGetByIdExtendedResponseDto = (StoriesGetByIdExtendedResponseDto) obj;
        return this.count == storiesGetByIdExtendedResponseDto.count && epx.f(this.items, storiesGetByIdExtendedResponseDto.items) && epx.f(this.profiles, storiesGetByIdExtendedResponseDto.profiles) && epx.f(this.groups, storiesGetByIdExtendedResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles);
    }

    public final String toString() {
        int i = this.count;
        List<StoriesStoryDto> list = this.items;
        return n.b(zn.c(i, "StoriesGetByIdExtendedResponseDto(count=", ", items=", ", profiles=", list), this.profiles, ", groups=", this.groups, ")");
    }
}
