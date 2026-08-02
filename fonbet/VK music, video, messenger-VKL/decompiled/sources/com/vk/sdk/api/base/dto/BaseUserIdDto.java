package com.vk.sdk.api.base.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseUserIdDto.kt */
/* loaded from: classes5.dex */
public final class BaseUserIdDto {

    @pmi0("user_id")
    private final UserId userId;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseUserIdDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseUserIdDto) && epx.f(this.userId, ((BaseUserIdDto) obj).userId);
    }

    public final int hashCode() {
        UserId userId = this.userId;
        if (userId == null) {
            return 0;
        }
        return Long.hashCode(userId.b);
    }

    public final String toString() {
        return "BaseUserIdDto(userId=" + this.userId + ")";
    }

    public BaseUserIdDto(UserId userId) {
        this.userId = userId;
    }

    public /* synthetic */ BaseUserIdDto(UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId);
    }
}
