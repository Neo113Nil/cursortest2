package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;

/* compiled from: GroupsLiveCoversDto.kt */
/* loaded from: classes5.dex */
public final class GroupsLiveCoversDto {

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("is_scalable")
    private final Boolean isScalable;

    @pmi0("story_ids")
    private final List<String> storyIds;

    public GroupsLiveCoversDto(boolean z, Boolean bool, List<String> list) {
        this.isEnabled = z;
        this.isScalable = bool;
        this.storyIds = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLiveCoversDto)) {
            return false;
        }
        GroupsLiveCoversDto groupsLiveCoversDto = (GroupsLiveCoversDto) obj;
        return this.isEnabled == groupsLiveCoversDto.isEnabled && epx.f(this.isScalable, groupsLiveCoversDto.isScalable) && epx.f(this.storyIds, groupsLiveCoversDto.storyIds);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Boolean bool = this.isScalable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.storyIds;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.isEnabled;
        Boolean bool = this.isScalable;
        List<String> list = this.storyIds;
        StringBuilder sb = new StringBuilder("GroupsLiveCoversDto(isEnabled=");
        sb.append(z);
        sb.append(", isScalable=");
        sb.append(bool);
        sb.append(", storyIds=");
        return vp.b(")", sb, list);
    }

    public /* synthetic */ GroupsLiveCoversDto(boolean z, Boolean bool, List list, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list);
    }
}
