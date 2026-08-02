package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedGetBannedExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedGetBannedExtendedResponseDto {

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGetBannedExtendedResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetBannedExtendedResponseDto)) {
            return false;
        }
        NewsfeedGetBannedExtendedResponseDto newsfeedGetBannedExtendedResponseDto = (NewsfeedGetBannedExtendedResponseDto) obj;
        return epx.f(this.profiles, newsfeedGetBannedExtendedResponseDto.profiles) && epx.f(this.groups, newsfeedGetBannedExtendedResponseDto.groups);
    }

    public final int hashCode() {
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedGetBannedExtendedResponseDto(profiles=" + this.profiles + ", groups=" + this.groups + ")";
    }

    public NewsfeedGetBannedExtendedResponseDto(List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2) {
        this.profiles = list;
        this.groups = list2;
    }

    public /* synthetic */ NewsfeedGetBannedExtendedResponseDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
