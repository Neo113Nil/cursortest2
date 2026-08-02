package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.iq;
import xsna.pmi0;

/* compiled from: GroupsTokenPermissionSettingDto.kt */
/* loaded from: classes5.dex */
public final class GroupsTokenPermissionSettingDto {

    @pmi0("name")
    private final String name;

    @pmi0("setting")
    private final int setting;

    public GroupsTokenPermissionSettingDto(String str, int i) {
        this.name = str;
        this.setting = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTokenPermissionSettingDto)) {
            return false;
        }
        GroupsTokenPermissionSettingDto groupsTokenPermissionSettingDto = (GroupsTokenPermissionSettingDto) obj;
        return epx.f(this.name, groupsTokenPermissionSettingDto.name) && this.setting == groupsTokenPermissionSettingDto.setting;
    }

    public final int hashCode() {
        return Integer.hashCode(this.setting) + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return iq.a(this.setting, "GroupsTokenPermissionSettingDto(name=", this.name, ", setting=", ")");
    }
}
