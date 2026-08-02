package com.vk.sdk.api.prettyCards.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PrettyCardsDeleteResponseDto.kt */
/* loaded from: classes5.dex */
public final class PrettyCardsDeleteResponseDto {

    @pmi0("card_id")
    private final String cardId;

    @pmi0("error")
    private final String error;

    @pmi0("owner_id")
    private final UserId ownerId;

    public PrettyCardsDeleteResponseDto(UserId userId, String str, String str2) {
        this.ownerId = userId;
        this.cardId = str;
        this.error = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsDeleteResponseDto)) {
            return false;
        }
        PrettyCardsDeleteResponseDto prettyCardsDeleteResponseDto = (PrettyCardsDeleteResponseDto) obj;
        return epx.f(this.ownerId, prettyCardsDeleteResponseDto.ownerId) && epx.f(this.cardId, prettyCardsDeleteResponseDto.cardId) && epx.f(this.error, prettyCardsDeleteResponseDto.error);
    }

    public final int hashCode() {
        int a = urd0.a(Long.hashCode(this.ownerId.b) * 31, 31, this.cardId);
        String str = this.error;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        UserId userId = this.ownerId;
        String str = this.cardId;
        String str2 = this.error;
        StringBuilder sb = new StringBuilder("PrettyCardsDeleteResponseDto(ownerId=");
        sb.append(userId);
        sb.append(", cardId=");
        sb.append(str);
        sb.append(", error=");
        return i5s.a(sb, str2, ")");
    }

    public /* synthetic */ PrettyCardsDeleteResponseDto(UserId userId, String str, String str2, int i, zcl zclVar) {
        this(userId, str, (i & 4) != 0 ? null : str2);
    }
}
