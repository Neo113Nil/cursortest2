package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: GroupsSubjectItemDto.kt */
/* loaded from: classes5.dex */
public final class GroupsSubjectItemDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public GroupsSubjectItemDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSubjectItemDto)) {
            return false;
        }
        GroupsSubjectItemDto groupsSubjectItemDto = (GroupsSubjectItemDto) obj;
        return this.id == groupsSubjectItemDto.id && epx.f(this.name, groupsSubjectItemDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "GroupsSubjectItemDto(id=", ", name=", this.name, ")");
    }
}
