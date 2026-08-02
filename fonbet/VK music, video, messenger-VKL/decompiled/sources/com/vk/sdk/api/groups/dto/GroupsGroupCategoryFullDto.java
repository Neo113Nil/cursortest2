package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.kh10;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: GroupsGroupCategoryFullDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupCategoryFullDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("page_count")
    private final int pageCount;

    @pmi0("page_previews")
    private final List<GroupsGroupDto> pagePreviews;

    @pmi0("subcategories")
    private final List<GroupsGroupCategoryDto> subcategories;

    public GroupsGroupCategoryFullDto(int i, String str, int i2, List<GroupsGroupDto> list, List<GroupsGroupCategoryDto> list2) {
        this.id = i;
        this.name = str;
        this.pageCount = i2;
        this.pagePreviews = list;
        this.subcategories = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupCategoryFullDto)) {
            return false;
        }
        GroupsGroupCategoryFullDto groupsGroupCategoryFullDto = (GroupsGroupCategoryFullDto) obj;
        return this.id == groupsGroupCategoryFullDto.id && epx.f(this.name, groupsGroupCategoryFullDto.name) && this.pageCount == groupsGroupCategoryFullDto.pageCount && epx.f(this.pagePreviews, groupsGroupCategoryFullDto.pagePreviews) && epx.f(this.subcategories, groupsGroupCategoryFullDto.subcategories);
    }

    public final int hashCode() {
        int a = fw3.a(shy.a(this.pageCount, urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31), 31, this.pagePreviews);
        List<GroupsGroupCategoryDto> list = this.subcategories;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        int i2 = this.pageCount;
        List<GroupsGroupDto> list = this.pagePreviews;
        List<GroupsGroupCategoryDto> list2 = this.subcategories;
        StringBuilder a = kh10.a(i, "GroupsGroupCategoryFullDto(id=", ", name=", str, ", pageCount=");
        a.append(i2);
        a.append(", pagePreviews=");
        a.append(list);
        a.append(", subcategories=");
        return vp.b(")", a, list2);
    }

    public /* synthetic */ GroupsGroupCategoryFullDto(int i, String str, int i2, List list, List list2, int i3, zcl zclVar) {
        this(i, str, i2, list, (i3 & 16) != 0 ? null : list2);
    }
}
