package com.vk.sdk.api.messages.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesChatSettingsStateDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatSettingsStateDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesChatSettingsStateDto[] $VALUES;

    @pmi0("in")
    public static final MessagesChatSettingsStateDto IN;

    @pmi0("kicked")
    public static final MessagesChatSettingsStateDto KICKED;

    @pmi0(TtmlNode.LEFT)
    public static final MessagesChatSettingsStateDto LEFT;
    private final String value;

    static {
        MessagesChatSettingsStateDto messagesChatSettingsStateDto = new MessagesChatSettingsStateDto("IN", 0, "in");
        IN = messagesChatSettingsStateDto;
        MessagesChatSettingsStateDto messagesChatSettingsStateDto2 = new MessagesChatSettingsStateDto("KICKED", 1, "kicked");
        KICKED = messagesChatSettingsStateDto2;
        MessagesChatSettingsStateDto messagesChatSettingsStateDto3 = new MessagesChatSettingsStateDto("LEFT", 2, TtmlNode.LEFT);
        LEFT = messagesChatSettingsStateDto3;
        MessagesChatSettingsStateDto[] messagesChatSettingsStateDtoArr = {messagesChatSettingsStateDto, messagesChatSettingsStateDto2, messagesChatSettingsStateDto3};
        $VALUES = messagesChatSettingsStateDtoArr;
        $ENTRIES = new asp(messagesChatSettingsStateDtoArr);
    }

    private MessagesChatSettingsStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesChatSettingsStateDto valueOf(String str) {
        return (MessagesChatSettingsStateDto) Enum.valueOf(MessagesChatSettingsStateDto.class, str);
    }

    public static MessagesChatSettingsStateDto[] values() {
        return (MessagesChatSettingsStateDto[]) $VALUES.clone();
    }
}
