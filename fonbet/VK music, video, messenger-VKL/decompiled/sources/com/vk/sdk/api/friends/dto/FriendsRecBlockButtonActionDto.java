package com.vk.sdk.api.friends.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;

/* compiled from: FriendsRecBlockButtonActionDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecBlockButtonActionDto {

    @pmi0("type")
    private final FriendsRecBlockButtonActionTypeDto type;

    @pmi0("user_id")
    private final UserId userId;

    public FriendsRecBlockButtonActionDto(FriendsRecBlockButtonActionTypeDto friendsRecBlockButtonActionTypeDto, UserId userId) {
        this.type = friendsRecBlockButtonActionTypeDto;
        this.userId = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecBlockButtonActionDto)) {
            return false;
        }
        FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto = (FriendsRecBlockButtonActionDto) obj;
        return this.type == friendsRecBlockButtonActionDto.type && epx.f(this.userId, friendsRecBlockButtonActionDto.userId);
    }

    public final int hashCode() {
        return Long.hashCode(this.userId.b) + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "FriendsRecBlockButtonActionDto(type=" + this.type + ", userId=" + this.userId + ")";
    }
}
