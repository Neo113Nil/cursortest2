package com.vk.sdk.api.apps.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AppsCreatedGroupResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppsCreatedGroupResponseDto {

    @pmi0("group_id")
    private final UserId groupId;

    public AppsCreatedGroupResponseDto(UserId userId) {
        this.groupId = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsCreatedGroupResponseDto) && epx.f(this.groupId, ((AppsCreatedGroupResponseDto) obj).groupId);
    }

    public final int hashCode() {
        return Long.hashCode(this.groupId.b);
    }

    public final String toString() {
        return "AppsCreatedGroupResponseDto(groupId=" + this.groupId + ")";
    }
}
