package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: GroupsGroupCategoryTypeDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupCategoryTypeDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public GroupsGroupCategoryTypeDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupCategoryTypeDto)) {
            return false;
        }
        GroupsGroupCategoryTypeDto groupsGroupCategoryTypeDto = (GroupsGroupCategoryTypeDto) obj;
        return this.id == groupsGroupCategoryTypeDto.id && epx.f(this.name, groupsGroupCategoryTypeDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "GroupsGroupCategoryTypeDto(id=", ", name=", this.name, ")");
    }
}
