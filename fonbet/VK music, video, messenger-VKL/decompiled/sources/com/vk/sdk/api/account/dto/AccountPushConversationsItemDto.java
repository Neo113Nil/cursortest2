package com.vk.sdk.api.account.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.to;
import xsna.vp;
import xsna.zcl;

/* compiled from: AccountPushConversationsItemDto.kt */
/* loaded from: classes5.dex */
public final class AccountPushConversationsItemDto {

    @pmi0("disabled_mass_mentions")
    private final BaseBoolIntDto disabledMassMentions;

    @pmi0("disabled_mentions")
    private final BaseBoolIntDto disabledMentions;

    @pmi0("disabled_until")
    private final int disabledUntil;

    @pmi0("peer_id")
    private final int peerId;

    @pmi0("sound")
    private final BaseBoolIntDto sound;

    public AccountPushConversationsItemDto(int i, int i2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3) {
        this.disabledUntil = i;
        this.peerId = i2;
        this.sound = baseBoolIntDto;
        this.disabledMentions = baseBoolIntDto2;
        this.disabledMassMentions = baseBoolIntDto3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPushConversationsItemDto)) {
            return false;
        }
        AccountPushConversationsItemDto accountPushConversationsItemDto = (AccountPushConversationsItemDto) obj;
        return this.disabledUntil == accountPushConversationsItemDto.disabledUntil && this.peerId == accountPushConversationsItemDto.peerId && this.sound == accountPushConversationsItemDto.sound && this.disabledMentions == accountPushConversationsItemDto.disabledMentions && this.disabledMassMentions == accountPushConversationsItemDto.disabledMassMentions;
    }

    public final int hashCode() {
        int a = vp.a(this.sound, shy.a(this.peerId, Integer.hashCode(this.disabledUntil) * 31, 31), 31);
        BaseBoolIntDto baseBoolIntDto = this.disabledMentions;
        int hashCode = (a + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.disabledMassMentions;
        return hashCode + (baseBoolIntDto2 != null ? baseBoolIntDto2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.disabledUntil;
        int i2 = this.peerId;
        BaseBoolIntDto baseBoolIntDto = this.sound;
        BaseBoolIntDto baseBoolIntDto2 = this.disabledMentions;
        BaseBoolIntDto baseBoolIntDto3 = this.disabledMassMentions;
        StringBuilder a = odj.a(i, i2, "AccountPushConversationsItemDto(disabledUntil=", ", peerId=", ", sound=");
        to.b(a, baseBoolIntDto, ", disabledMentions=", baseBoolIntDto2, ", disabledMassMentions=");
        a.append(baseBoolIntDto3);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ AccountPushConversationsItemDto(int i, int i2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, int i3, zcl zclVar) {
        this(i, i2, baseBoolIntDto, (i3 & 8) != 0 ? null : baseBoolIntDto2, (i3 & 16) != 0 ? null : baseBoolIntDto3);
    }
}
