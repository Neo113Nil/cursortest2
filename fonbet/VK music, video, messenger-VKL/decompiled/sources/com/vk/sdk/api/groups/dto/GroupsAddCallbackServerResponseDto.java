package com.vk.sdk.api.groups.dto;

import com.unity3d.ads.metadata.PlayerMetaData;
import xsna.pmi0;
import xsna.tgw;

/* compiled from: GroupsAddCallbackServerResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsAddCallbackServerResponseDto {

    @pmi0(PlayerMetaData.KEY_SERVER_ID)
    private final int serverId;

    public GroupsAddCallbackServerResponseDto(int i) {
        this.serverId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsAddCallbackServerResponseDto) && this.serverId == ((GroupsAddCallbackServerResponseDto) obj).serverId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.serverId);
    }

    public final String toString() {
        return tgw.b(this.serverId, "GroupsAddCallbackServerResponseDto(serverId=", ")");
    }
}
