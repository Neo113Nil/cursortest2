package com.vk.sdk.api.groups.dto;

import com.vk.sdk.api.base.dto.BaseObjectWithNameDto;
import java.util.List;
import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: GroupsGroupSubcategoryDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupSubcategoryDto {

    @pmi0("genders")
    private final List<BaseObjectWithNameDto> genders;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public GroupsGroupSubcategoryDto(int i, String str, List<BaseObjectWithNameDto> list) {
        this.id = i;
        this.name = str;
        this.genders = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupSubcategoryDto)) {
            return false;
        }
        GroupsGroupSubcategoryDto groupsGroupSubcategoryDto = (GroupsGroupSubcategoryDto) obj;
        return this.id == groupsGroupSubcategoryDto.id && epx.f(this.name, groupsGroupSubcategoryDto.name) && epx.f(this.genders, groupsGroupSubcategoryDto.genders);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        List<BaseObjectWithNameDto> list = this.genders;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        return vp.b(")", kh10.a(i, "GroupsGroupSubcategoryDto(id=", ", name=", str, ", genders="), this.genders);
    }

    public /* synthetic */ GroupsGroupSubcategoryDto(int i, String str, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }
}
