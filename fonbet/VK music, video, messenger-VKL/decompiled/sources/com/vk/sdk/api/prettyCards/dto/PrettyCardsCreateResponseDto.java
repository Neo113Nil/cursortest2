package com.vk.sdk.api.prettyCards.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;

/* compiled from: PrettyCardsCreateResponseDto.kt */
/* loaded from: classes5.dex */
public final class PrettyCardsCreateResponseDto {

    @pmi0("card_id")
    private final String cardId;

    @pmi0("owner_id")
    private final UserId ownerId;

    public PrettyCardsCreateResponseDto(UserId userId, String str) {
        this.ownerId = userId;
        this.cardId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsCreateResponseDto)) {
            return false;
        }
        PrettyCardsCreateResponseDto prettyCardsCreateResponseDto = (PrettyCardsCreateResponseDto) obj;
        return epx.f(this.ownerId, prettyCardsCreateResponseDto.ownerId) && epx.f(this.cardId, prettyCardsCreateResponseDto.cardId);
    }

    public final int hashCode() {
        return this.cardId.hashCode() + (Long.hashCode(this.ownerId.b) * 31);
    }

    public final String toString() {
        return "PrettyCardsCreateResponseDto(ownerId=" + this.ownerId + ", cardId=" + this.cardId + ")";
    }
}
