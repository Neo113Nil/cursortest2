package com.vk.sdk.api.messages.dto;

import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesSetActivityTypeDto.kt */
/* loaded from: classes5.dex */
public final class MessagesSetActivityTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesSetActivityTypeDto[] $VALUES;

    @pmi0("audiomessage")
    public static final MessagesSetActivityTypeDto AUDIOMESSAGE;

    @pmi0(X3.i.b)
    public static final MessagesSetActivityTypeDto FILE;

    @pmi0("photo")
    public static final MessagesSetActivityTypeDto PHOTO;

    @pmi0("typing")
    public static final MessagesSetActivityTypeDto TYPING;

    @pmi0("video")
    public static final MessagesSetActivityTypeDto VIDEO;

    @pmi0("videomessage")
    public static final MessagesSetActivityTypeDto VIDEOMESSAGE;
    private final String value;

    static {
        MessagesSetActivityTypeDto messagesSetActivityTypeDto = new MessagesSetActivityTypeDto("AUDIOMESSAGE", 0, "audiomessage");
        AUDIOMESSAGE = messagesSetActivityTypeDto;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto2 = new MessagesSetActivityTypeDto("FILE", 1, X3.i.b);
        FILE = messagesSetActivityTypeDto2;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto3 = new MessagesSetActivityTypeDto("PHOTO", 2, "photo");
        PHOTO = messagesSetActivityTypeDto3;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto4 = new MessagesSetActivityTypeDto("TYPING", 3, "typing");
        TYPING = messagesSetActivityTypeDto4;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto5 = new MessagesSetActivityTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 4, "video");
        VIDEO = messagesSetActivityTypeDto5;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto6 = new MessagesSetActivityTypeDto("VIDEOMESSAGE", 5, "videomessage");
        VIDEOMESSAGE = messagesSetActivityTypeDto6;
        MessagesSetActivityTypeDto[] messagesSetActivityTypeDtoArr = {messagesSetActivityTypeDto, messagesSetActivityTypeDto2, messagesSetActivityTypeDto3, messagesSetActivityTypeDto4, messagesSetActivityTypeDto5, messagesSetActivityTypeDto6};
        $VALUES = messagesSetActivityTypeDtoArr;
        $ENTRIES = new asp(messagesSetActivityTypeDtoArr);
    }

    private MessagesSetActivityTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesSetActivityTypeDto valueOf(String str) {
        return (MessagesSetActivityTypeDto) Enum.valueOf(MessagesSetActivityTypeDto.class, str);
    }

    public static MessagesSetActivityTypeDto[] values() {
        return (MessagesSetActivityTypeDto[]) $VALUES.clone();
    }
}
