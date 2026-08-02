package com.vk.sdk.api.fave.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FavePageDto.kt */
/* loaded from: classes5.dex */
public final class FavePageDto {

    @pmi0("description")
    private final String description;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("tags")
    private final List<FaveTagDto> tags;

    @pmi0("type")
    private final FavePageTypeDto type;

    @pmi0("updated_date")
    private final Integer updatedDate;

    @pmi0("user")
    private final UsersUserFullDto user;

    public FavePageDto(String str, List<FaveTagDto> list, FavePageTypeDto favePageTypeDto, GroupsGroupFullDto groupsGroupFullDto, Integer num, UsersUserFullDto usersUserFullDto) {
        this.description = str;
        this.tags = list;
        this.type = favePageTypeDto;
        this.group = groupsGroupFullDto;
        this.updatedDate = num;
        this.user = usersUserFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavePageDto)) {
            return false;
        }
        FavePageDto favePageDto = (FavePageDto) obj;
        return epx.f(this.description, favePageDto.description) && epx.f(this.tags, favePageDto.tags) && this.type == favePageDto.type && epx.f(this.group, favePageDto.group) && epx.f(this.updatedDate, favePageDto.updatedDate) && epx.f(this.user, favePageDto.user);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + fw3.a(this.description.hashCode() * 31, 31, this.tags)) * 31;
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode2 = (hashCode + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        Integer num = this.updatedDate;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.user;
        return hashCode3 + (usersUserFullDto != null ? usersUserFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "FavePageDto(description=" + this.description + ", tags=" + this.tags + ", type=" + this.type + ", group=" + this.group + ", updatedDate=" + this.updatedDate + ", user=" + this.user + ")";
    }

    public /* synthetic */ FavePageDto(String str, List list, FavePageTypeDto favePageTypeDto, GroupsGroupFullDto groupsGroupFullDto, Integer num, UsersUserFullDto usersUserFullDto, int i, zcl zclVar) {
        this(str, list, favePageTypeDto, (i & 8) != 0 ? null : groupsGroupFullDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : usersUserFullDto);
    }
}
