package com.vk.sdk.api.wall.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;

/* compiled from: WallGetByIdExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallGetByIdExtendedResponseDto {

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<WallWallItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* JADX WARN: Multi-variable type inference failed */
    public WallGetByIdExtendedResponseDto(List<? extends WallWallItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetByIdExtendedResponseDto)) {
            return false;
        }
        WallGetByIdExtendedResponseDto wallGetByIdExtendedResponseDto = (WallGetByIdExtendedResponseDto) obj;
        return epx.f(this.items, wallGetByIdExtendedResponseDto.items) && epx.f(this.profiles, wallGetByIdExtendedResponseDto.profiles) && epx.f(this.groups, wallGetByIdExtendedResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(this.items.hashCode() * 31, 31, this.profiles);
    }

    public final String toString() {
        List<WallWallItemDto> list = this.items;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        StringBuilder sb = new StringBuilder("WallGetByIdExtendedResponseDto(items=");
        sb.append(list);
        sb.append(", profiles=");
        sb.append(list2);
        sb.append(", groups=");
        return vp.b(")", sb, list3);
    }
}
