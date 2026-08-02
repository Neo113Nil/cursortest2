package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedGetCommentsResponseDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedGetCommentsResponseDto {

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<NewsfeedCommentsItemDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGetCommentsResponseDto(List<? extends NewsfeedCommentsItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, String str) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.nextFrom = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetCommentsResponseDto)) {
            return false;
        }
        NewsfeedGetCommentsResponseDto newsfeedGetCommentsResponseDto = (NewsfeedGetCommentsResponseDto) obj;
        return epx.f(this.items, newsfeedGetCommentsResponseDto.items) && epx.f(this.profiles, newsfeedGetCommentsResponseDto.profiles) && epx.f(this.groups, newsfeedGetCommentsResponseDto.groups) && epx.f(this.nextFrom, newsfeedGetCommentsResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(this.items.hashCode() * 31, 31, this.profiles), 31, this.groups);
        String str = this.nextFrom;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NewsfeedGetCommentsResponseDto(items=" + this.items + ", profiles=" + this.profiles + ", groups=" + this.groups + ", nextFrom=" + this.nextFrom + ")";
    }

    public /* synthetic */ NewsfeedGetCommentsResponseDto(List list, List list2, List list3, String str, int i, zcl zclVar) {
        this(list, list2, list3, (i & 8) != 0 ? null : str);
    }
}
