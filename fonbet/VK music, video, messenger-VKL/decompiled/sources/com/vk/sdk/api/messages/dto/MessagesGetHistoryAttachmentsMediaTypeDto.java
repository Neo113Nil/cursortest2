package com.vk.sdk.api.messages.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetHistoryAttachmentsMediaTypeDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetHistoryAttachmentsMediaTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetHistoryAttachmentsMediaTypeDto[] $VALUES;

    @pmi0("app_action_games")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto APP_ACTION_GAMES;

    @pmi0("app_action_mini_apps")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto APP_ACTION_MINI_APPS;

    @pmi0("audio")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto AUDIO;

    @pmi0("audio_message")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto AUDIO_MESSAGE;

    @pmi0("doc")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto DOC;

    @pmi0("graffiti")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto GRAFFITI;

    @pmi0("link")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto LINK;

    @pmi0("market")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto MARKET;

    @pmi0("photo")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto PHOTO;

    @pmi0("share")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto SHARE;

    @pmi0("video")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto VIDEO;

    @pmi0("wall")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto WALL;
    private final String value;

    static {
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto = new MessagesGetHistoryAttachmentsMediaTypeDto("APP_ACTION_GAMES", 0, "app_action_games");
        APP_ACTION_GAMES = messagesGetHistoryAttachmentsMediaTypeDto;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto2 = new MessagesGetHistoryAttachmentsMediaTypeDto("APP_ACTION_MINI_APPS", 1, "app_action_mini_apps");
        APP_ACTION_MINI_APPS = messagesGetHistoryAttachmentsMediaTypeDto2;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto3 = new MessagesGetHistoryAttachmentsMediaTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 2, "audio");
        AUDIO = messagesGetHistoryAttachmentsMediaTypeDto3;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto4 = new MessagesGetHistoryAttachmentsMediaTypeDto("AUDIO_MESSAGE", 3, "audio_message");
        AUDIO_MESSAGE = messagesGetHistoryAttachmentsMediaTypeDto4;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto5 = new MessagesGetHistoryAttachmentsMediaTypeDto("DOC", 4, "doc");
        DOC = messagesGetHistoryAttachmentsMediaTypeDto5;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto6 = new MessagesGetHistoryAttachmentsMediaTypeDto("GRAFFITI", 5, "graffiti");
        GRAFFITI = messagesGetHistoryAttachmentsMediaTypeDto6;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto7 = new MessagesGetHistoryAttachmentsMediaTypeDto("LINK", 6, "link");
        LINK = messagesGetHistoryAttachmentsMediaTypeDto7;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto8 = new MessagesGetHistoryAttachmentsMediaTypeDto("MARKET", 7, "market");
        MARKET = messagesGetHistoryAttachmentsMediaTypeDto8;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto9 = new MessagesGetHistoryAttachmentsMediaTypeDto("PHOTO", 8, "photo");
        PHOTO = messagesGetHistoryAttachmentsMediaTypeDto9;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto10 = new MessagesGetHistoryAttachmentsMediaTypeDto("SHARE", 9, "share");
        SHARE = messagesGetHistoryAttachmentsMediaTypeDto10;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto11 = new MessagesGetHistoryAttachmentsMediaTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 10, "video");
        VIDEO = messagesGetHistoryAttachmentsMediaTypeDto11;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto12 = new MessagesGetHistoryAttachmentsMediaTypeDto("WALL", 11, "wall");
        WALL = messagesGetHistoryAttachmentsMediaTypeDto12;
        MessagesGetHistoryAttachmentsMediaTypeDto[] messagesGetHistoryAttachmentsMediaTypeDtoArr = {messagesGetHistoryAttachmentsMediaTypeDto, messagesGetHistoryAttachmentsMediaTypeDto2, messagesGetHistoryAttachmentsMediaTypeDto3, messagesGetHistoryAttachmentsMediaTypeDto4, messagesGetHistoryAttachmentsMediaTypeDto5, messagesGetHistoryAttachmentsMediaTypeDto6, messagesGetHistoryAttachmentsMediaTypeDto7, messagesGetHistoryAttachmentsMediaTypeDto8, messagesGetHistoryAttachmentsMediaTypeDto9, messagesGetHistoryAttachmentsMediaTypeDto10, messagesGetHistoryAttachmentsMediaTypeDto11, messagesGetHistoryAttachmentsMediaTypeDto12};
        $VALUES = messagesGetHistoryAttachmentsMediaTypeDtoArr;
        $ENTRIES = new asp(messagesGetHistoryAttachmentsMediaTypeDtoArr);
    }

    private MessagesGetHistoryAttachmentsMediaTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetHistoryAttachmentsMediaTypeDto valueOf(String str) {
        return (MessagesGetHistoryAttachmentsMediaTypeDto) Enum.valueOf(MessagesGetHistoryAttachmentsMediaTypeDto.class, str);
    }

    public static MessagesGetHistoryAttachmentsMediaTypeDto[] values() {
        return (MessagesGetHistoryAttachmentsMediaTypeDto[]) $VALUES.clone();
    }
}
