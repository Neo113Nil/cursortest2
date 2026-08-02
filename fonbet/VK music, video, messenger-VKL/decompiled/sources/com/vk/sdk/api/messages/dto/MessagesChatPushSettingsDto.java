package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesChatPushSettingsDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatPushSettingsDto {

    @pmi0("disabled_until")
    private final Integer disabledUntil;

    @pmi0("sound")
    private final BaseBoolIntDto sound;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesChatPushSettingsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatPushSettingsDto)) {
            return false;
        }
        MessagesChatPushSettingsDto messagesChatPushSettingsDto = (MessagesChatPushSettingsDto) obj;
        return epx.f(this.disabledUntil, messagesChatPushSettingsDto.disabledUntil) && this.sound == messagesChatPushSettingsDto.sound;
    }

    public final int hashCode() {
        Integer num = this.disabledUntil;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto = this.sound;
        return hashCode + (baseBoolIntDto != null ? baseBoolIntDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesChatPushSettingsDto(disabledUntil=" + this.disabledUntil + ", sound=" + this.sound + ")";
    }

    public MessagesChatPushSettingsDto(Integer num, BaseBoolIntDto baseBoolIntDto) {
        this.disabledUntil = num;
        this.sound = baseBoolIntDto;
    }

    public /* synthetic */ MessagesChatPushSettingsDto(Integer num, BaseBoolIntDto baseBoolIntDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : baseBoolIntDto);
    }
}
