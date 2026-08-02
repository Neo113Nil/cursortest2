package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.qoy;
import xsna.rq;
import xsna.xq;
import xsna.zcl;

/* compiled from: MessagesPushSettingsDto.kt */
/* loaded from: classes5.dex */
public final class MessagesPushSettingsDto {

    @pmi0("disabled_forever")
    private final boolean disabledForever;

    @pmi0("disabled_mass_mentions")
    private final Boolean disabledMassMentions;

    @pmi0("disabled_mentions")
    private final Boolean disabledMentions;

    @pmi0("disabled_until")
    private final Integer disabledUntil;

    @pmi0("no_sound")
    private final boolean noSound;

    public MessagesPushSettingsDto(boolean z, boolean z2, Integer num, Boolean bool, Boolean bool2) {
        this.disabledForever = z;
        this.noSound = z2;
        this.disabledUntil = num;
        this.disabledMentions = bool;
        this.disabledMassMentions = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesPushSettingsDto)) {
            return false;
        }
        MessagesPushSettingsDto messagesPushSettingsDto = (MessagesPushSettingsDto) obj;
        return this.disabledForever == messagesPushSettingsDto.disabledForever && this.noSound == messagesPushSettingsDto.noSound && epx.f(this.disabledUntil, messagesPushSettingsDto.disabledUntil) && epx.f(this.disabledMentions, messagesPushSettingsDto.disabledMentions) && epx.f(this.disabledMassMentions, messagesPushSettingsDto.disabledMassMentions);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.disabledForever) * 31, 31, this.noSound);
        Integer num = this.disabledUntil;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.disabledMentions;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disabledMassMentions;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.disabledForever;
        boolean z2 = this.noSound;
        Integer num = this.disabledUntil;
        Boolean bool = this.disabledMentions;
        Boolean bool2 = this.disabledMassMentions;
        StringBuilder c = gp.c("MessagesPushSettingsDto(disabledForever=", ", noSound=", ", disabledUntil=", z, z2);
        rq.h(c, num, ", disabledMentions=", bool, ", disabledMassMentions=");
        return xq.d(c, bool2, ")");
    }

    public /* synthetic */ MessagesPushSettingsDto(boolean z, boolean z2, Integer num, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(z, z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
    }
}
