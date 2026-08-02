package com.vk.sdk.api.newsfeed.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedGenericResponseDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedGenericResponseDto {

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<NewsfeedNewsfeedItemDto> items;

    @pmi0("lives_items")
    private final List<NewsfeedNewsfeedItemDto> livesItems;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGenericResponseDto(List<? extends NewsfeedNewsfeedItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<? extends NewsfeedNewsfeedItemDto> list4) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.livesItems = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGenericResponseDto)) {
            return false;
        }
        NewsfeedGenericResponseDto newsfeedGenericResponseDto = (NewsfeedGenericResponseDto) obj;
        return epx.f(this.items, newsfeedGenericResponseDto.items) && epx.f(this.profiles, newsfeedGenericResponseDto.profiles) && epx.f(this.groups, newsfeedGenericResponseDto.groups) && epx.f(this.livesItems, newsfeedGenericResponseDto.livesItems);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(this.items.hashCode() * 31, 31, this.profiles), 31, this.groups);
        List<NewsfeedNewsfeedItemDto> list = this.livesItems;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        List<NewsfeedNewsfeedItemDto> list = this.items;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        List<NewsfeedNewsfeedItemDto> list4 = this.livesItems;
        StringBuilder sb = new StringBuilder("NewsfeedGenericResponseDto(items=");
        sb.append(list);
        sb.append(", profiles=");
        sb.append(list2);
        sb.append(", groups=");
        return n.b(sb, list3, ", livesItems=", list4, ")");
    }

    public /* synthetic */ NewsfeedGenericResponseDto(List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(list, list2, list3, (i & 8) != 0 ? null : list4);
    }
}
