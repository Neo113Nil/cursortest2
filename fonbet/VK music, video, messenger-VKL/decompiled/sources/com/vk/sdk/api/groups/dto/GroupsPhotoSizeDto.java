package com.vk.sdk.api.groups.dto;

import xsna.pmi0;
import xsna.sl9;

/* compiled from: GroupsPhotoSizeDto.kt */
/* loaded from: classes5.dex */
public final class GroupsPhotoSizeDto {

    @pmi0("height")
    private final int height;

    @pmi0("width")
    private final int width;

    public GroupsPhotoSizeDto(int i, int i2) {
        this.height = i;
        this.width = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsPhotoSizeDto)) {
            return false;
        }
        GroupsPhotoSizeDto groupsPhotoSizeDto = (GroupsPhotoSizeDto) obj;
        return this.height == groupsPhotoSizeDto.height && this.width == groupsPhotoSizeDto.width;
    }

    public final int hashCode() {
        return Integer.hashCode(this.width) + (Integer.hashCode(this.height) * 31);
    }

    public final String toString() {
        return sl9.c(this.height, this.width, "GroupsPhotoSizeDto(height=", ", width=", ")");
    }
}
