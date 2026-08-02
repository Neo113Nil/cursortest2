package com.vk.sdk.api.groups.dto;

import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsGetTokenPermissionsResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetTokenPermissionsResponseDto {

    @pmi0("mask")
    private final int mask;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final List<GroupsTokenPermissionSettingDto> permissions;

    public GroupsGetTokenPermissionsResponseDto(int i, List<GroupsTokenPermissionSettingDto> list) {
        this.mask = i;
        this.permissions = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetTokenPermissionsResponseDto)) {
            return false;
        }
        GroupsGetTokenPermissionsResponseDto groupsGetTokenPermissionsResponseDto = (GroupsGetTokenPermissionsResponseDto) obj;
        return this.mask == groupsGetTokenPermissionsResponseDto.mask && epx.f(this.permissions, groupsGetTokenPermissionsResponseDto.permissions);
    }

    public final int hashCode() {
        return this.permissions.hashCode() + (Integer.hashCode(this.mask) * 31);
    }

    public final String toString() {
        return pn.c(this.mask, "GroupsGetTokenPermissionsResponseDto(mask=", ", permissions=", ")", this.permissions);
    }
}
