package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;

/* compiled from: GroupsGroupPublicCategoryListDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupPublicCategoryListDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("subcategories")
    private final List<GroupsGroupCategoryTypeDto> subcategories;

    public GroupsGroupPublicCategoryListDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupPublicCategoryListDto)) {
            return false;
        }
        GroupsGroupPublicCategoryListDto groupsGroupPublicCategoryListDto = (GroupsGroupPublicCategoryListDto) obj;
        return epx.f(this.id, groupsGroupPublicCategoryListDto.id) && epx.f(this.name, groupsGroupPublicCategoryListDto.name) && epx.f(this.subcategories, groupsGroupPublicCategoryListDto.subcategories);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<GroupsGroupCategoryTypeDto> list = this.subcategories;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        String str = this.name;
        List<GroupsGroupCategoryTypeDto> list = this.subcategories;
        StringBuilder sb = new StringBuilder("GroupsGroupPublicCategoryListDto(id=");
        sb.append(num);
        sb.append(", name=");
        sb.append(str);
        sb.append(", subcategories=");
        return vp.b(")", sb, list);
    }

    public GroupsGroupPublicCategoryListDto(Integer num, String str, List<GroupsGroupCategoryTypeDto> list) {
        this.id = num;
        this.name = str;
        this.subcategories = list;
    }

    public /* synthetic */ GroupsGroupPublicCategoryListDto(Integer num, String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
