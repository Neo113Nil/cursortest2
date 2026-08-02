package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: GroupsGroupCategoryDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupCategoryDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("subcategories")
    private final List<GroupsGroupSubcategoryDto> subcategories;

    public GroupsGroupCategoryDto(int i, String str, List<GroupsGroupSubcategoryDto> list) {
        this.id = i;
        this.name = str;
        this.subcategories = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupCategoryDto)) {
            return false;
        }
        GroupsGroupCategoryDto groupsGroupCategoryDto = (GroupsGroupCategoryDto) obj;
        return this.id == groupsGroupCategoryDto.id && epx.f(this.name, groupsGroupCategoryDto.name) && epx.f(this.subcategories, groupsGroupCategoryDto.subcategories);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        List<GroupsGroupSubcategoryDto> list = this.subcategories;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        return vp.b(")", kh10.a(i, "GroupsGroupCategoryDto(id=", ", name=", str, ", subcategories="), this.subcategories);
    }

    public /* synthetic */ GroupsGroupCategoryDto(int i, String str, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }
}
