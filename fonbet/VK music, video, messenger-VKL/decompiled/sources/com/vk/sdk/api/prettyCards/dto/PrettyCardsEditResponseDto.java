package com.vk.sdk.api.prettyCards.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;

/* compiled from: PrettyCardsEditResponseDto.kt */
/* loaded from: classes5.dex */
public final class PrettyCardsEditResponseDto {

    @pmi0("card_id")
    private final String cardId;

    @pmi0("owner_id")
    private final UserId ownerId;

    public PrettyCardsEditResponseDto(UserId userId, String str) {
        this.ownerId = userId;
        this.cardId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsEditResponseDto)) {
            return false;
        }
        PrettyCardsEditResponseDto prettyCardsEditResponseDto = (PrettyCardsEditResponseDto) obj;
        return epx.f(this.ownerId, prettyCardsEditResponseDto.ownerId) && epx.f(this.cardId, prettyCardsEditResponseDto.cardId);
    }

    public final int hashCode() {
        return this.cardId.hashCode() + (Long.hashCode(this.ownerId.b) * 31);
    }

    public final String toString() {
        return "PrettyCardsEditResponseDto(ownerId=" + this.ownerId + ", cardId=" + this.cardId + ")";
    }
}
