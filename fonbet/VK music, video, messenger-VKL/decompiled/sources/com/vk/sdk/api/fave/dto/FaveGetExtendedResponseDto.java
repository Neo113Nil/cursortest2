package com.vk.sdk.api.fave.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.groups.dto.GroupsGroupDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: FaveGetExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class FaveGetExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    @pmi0("items")
    private final List<FaveBookmarkDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public FaveGetExtendedResponseDto(int i, List<FaveBookmarkDto> list, List<UsersUserFullDto> list2, List<GroupsGroupDto> list3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveGetExtendedResponseDto)) {
            return false;
        }
        FaveGetExtendedResponseDto faveGetExtendedResponseDto = (FaveGetExtendedResponseDto) obj;
        return this.count == faveGetExtendedResponseDto.count && epx.f(this.items, faveGetExtendedResponseDto.items) && epx.f(this.profiles, faveGetExtendedResponseDto.profiles) && epx.f(this.groups, faveGetExtendedResponseDto.groups);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<FaveBookmarkDto> list = this.items;
        return n.b(zn.c(i, "FaveGetExtendedResponseDto(count=", ", items=", ", profiles=", list), this.profiles, ", groups=", this.groups, ")");
    }

    public /* synthetic */ FaveGetExtendedResponseDto(int i, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
