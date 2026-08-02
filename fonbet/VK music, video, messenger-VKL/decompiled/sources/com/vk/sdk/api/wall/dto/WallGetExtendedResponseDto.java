package com.vk.sdk.api.wall.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zn;

/* compiled from: WallGetExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallGetExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<WallWallItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* JADX WARN: Multi-variable type inference failed */
    public WallGetExtendedResponseDto(int i, List<? extends WallWallItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetExtendedResponseDto)) {
            return false;
        }
        WallGetExtendedResponseDto wallGetExtendedResponseDto = (WallGetExtendedResponseDto) obj;
        return this.count == wallGetExtendedResponseDto.count && epx.f(this.items, wallGetExtendedResponseDto.items) && epx.f(this.profiles, wallGetExtendedResponseDto.profiles) && epx.f(this.groups, wallGetExtendedResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles);
    }

    public final String toString() {
        int i = this.count;
        List<WallWallItemDto> list = this.items;
        return n.b(zn.c(i, "WallGetExtendedResponseDto(count=", ", items=", ", profiles=", list), this.profiles, ", groups=", this.groups, ")");
    }
}
