package com.vk.sdk.api.polls.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;

/* compiled from: PollsFriendDto.kt */
/* loaded from: classes5.dex */
public final class PollsFriendDto {

    @pmi0("id")
    private final UserId id;

    public PollsFriendDto(UserId userId) {
        this.id = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PollsFriendDto) && epx.f(this.id, ((PollsFriendDto) obj).id);
    }

    public final int hashCode() {
        return Long.hashCode(this.id.b);
    }

    public final String toString() {
        return "PollsFriendDto(id=" + this.id + ")";
    }
}
