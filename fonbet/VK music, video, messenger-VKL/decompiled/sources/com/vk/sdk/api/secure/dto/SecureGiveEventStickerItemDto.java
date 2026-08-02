package com.vk.sdk.api.secure.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SecureGiveEventStickerItemDto.kt */
/* loaded from: classes5.dex */
public final class SecureGiveEventStickerItemDto {

    @pmi0("status")
    private final String status;

    @pmi0("user_id")
    private final UserId userId;

    /* JADX WARN: Multi-variable type inference failed */
    public SecureGiveEventStickerItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureGiveEventStickerItemDto)) {
            return false;
        }
        SecureGiveEventStickerItemDto secureGiveEventStickerItemDto = (SecureGiveEventStickerItemDto) obj;
        return epx.f(this.userId, secureGiveEventStickerItemDto.userId) && epx.f(this.status, secureGiveEventStickerItemDto.status);
    }

    public final int hashCode() {
        UserId userId = this.userId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.status;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SecureGiveEventStickerItemDto(userId=" + this.userId + ", status=" + this.status + ")";
    }

    public SecureGiveEventStickerItemDto(UserId userId, String str) {
        this.userId = userId;
        this.status = str;
    }

    public /* synthetic */ SecureGiveEventStickerItemDto(UserId userId, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str);
    }
}
