package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.kh10;
import xsna.n23;
import xsna.nyh0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: GroupsGroupAttachDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupAttachDto {

    @pmi0("id")
    private final int id;

    @pmi0("is_favorite")
    private final boolean isFavorite;

    @pmi0("size")
    private final int size;

    @pmi0("status")
    private final String status;

    @pmi0("text")
    private final String text;

    public GroupsGroupAttachDto(int i, String str, String str2, int i2, boolean z) {
        this.id = i;
        this.text = str;
        this.status = str2;
        this.size = i2;
        this.isFavorite = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupAttachDto)) {
            return false;
        }
        GroupsGroupAttachDto groupsGroupAttachDto = (GroupsGroupAttachDto) obj;
        return this.id == groupsGroupAttachDto.id && epx.f(this.text, groupsGroupAttachDto.text) && epx.f(this.status, groupsGroupAttachDto.status) && this.size == groupsGroupAttachDto.size && this.isFavorite == groupsGroupAttachDto.isFavorite;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isFavorite) + shy.a(this.size, urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.text), 31, this.status), 31);
    }

    public final String toString() {
        int i = this.id;
        String str = this.text;
        String str2 = this.status;
        int i2 = this.size;
        boolean z = this.isFavorite;
        StringBuilder a = kh10.a(i, "GroupsGroupAttachDto(id=", ", text=", str, ", status=");
        nyh0.a(i2, str2, ", size=", ", isFavorite=", a);
        return n23.b(a, z, ")");
    }
}
