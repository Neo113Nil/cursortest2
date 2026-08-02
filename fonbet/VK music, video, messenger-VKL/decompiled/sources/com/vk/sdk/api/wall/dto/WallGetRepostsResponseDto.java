package com.vk.sdk.api.wall.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;

/* compiled from: WallGetRepostsResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallGetRepostsResponseDto {

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<WallWallpostFullDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public WallGetRepostsResponseDto(List<WallWallpostFullDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetRepostsResponseDto)) {
            return false;
        }
        WallGetRepostsResponseDto wallGetRepostsResponseDto = (WallGetRepostsResponseDto) obj;
        return epx.f(this.items, wallGetRepostsResponseDto.items) && epx.f(this.profiles, wallGetRepostsResponseDto.profiles) && epx.f(this.groups, wallGetRepostsResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(this.items.hashCode() * 31, 31, this.profiles);
    }

    public final String toString() {
        List<WallWallpostFullDto> list = this.items;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        StringBuilder sb = new StringBuilder("WallGetRepostsResponseDto(items=");
        sb.append(list);
        sb.append(", profiles=");
        sb.append(list2);
        sb.append(", groups=");
        return vp.b(")", sb, list3);
    }
}
