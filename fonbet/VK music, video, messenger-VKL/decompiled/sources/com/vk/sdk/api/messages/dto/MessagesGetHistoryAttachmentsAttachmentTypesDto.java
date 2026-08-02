package com.vk.sdk.api.messages.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetHistoryAttachmentsAttachmentTypesDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetHistoryAttachmentsAttachmentTypesDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetHistoryAttachmentsAttachmentTypesDto[] $VALUES;

    @pmi0("app_action_games")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto APP_ACTION_GAMES;

    @pmi0("app_action_mini_apps")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto APP_ACTION_MINI_APPS;

    @pmi0("audio")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto AUDIO;

    @pmi0("audio_message")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto AUDIO_MESSAGE;

    @pmi0("doc")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto DOC;

    @pmi0("graffiti")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto GRAFFITI;

    @pmi0("link")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto LINK;

    @pmi0("market")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto MARKET;

    @pmi0("photo")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto PHOTO;

    @pmi0("share")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto SHARE;

    @pmi0("video")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto VIDEO;

    @pmi0("wall")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto WALL;
    private final String value;

    static {
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto = new MessagesGetHistoryAttachmentsAttachmentTypesDto("APP_ACTION_GAMES", 0, "app_action_games");
        APP_ACTION_GAMES = messagesGetHistoryAttachmentsAttachmentTypesDto;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto2 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("APP_ACTION_MINI_APPS", 1, "app_action_mini_apps");
        APP_ACTION_MINI_APPS = messagesGetHistoryAttachmentsAttachmentTypesDto2;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto3 = new MessagesGetHistoryAttachmentsAttachmentTypesDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 2, "audio");
        AUDIO = messagesGetHistoryAttachmentsAttachmentTypesDto3;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto4 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("AUDIO_MESSAGE", 3, "audio_message");
        AUDIO_MESSAGE = messagesGetHistoryAttachmentsAttachmentTypesDto4;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto5 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("DOC", 4, "doc");
        DOC = messagesGetHistoryAttachmentsAttachmentTypesDto5;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto6 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("GRAFFITI", 5, "graffiti");
        GRAFFITI = messagesGetHistoryAttachmentsAttachmentTypesDto6;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto7 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("LINK", 6, "link");
        LINK = messagesGetHistoryAttachmentsAttachmentTypesDto7;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto8 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("MARKET", 7, "market");
        MARKET = messagesGetHistoryAttachmentsAttachmentTypesDto8;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto9 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("PHOTO", 8, "photo");
        PHOTO = messagesGetHistoryAttachmentsAttachmentTypesDto9;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto10 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("SHARE", 9, "share");
        SHARE = messagesGetHistoryAttachmentsAttachmentTypesDto10;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto11 = new MessagesGetHistoryAttachmentsAttachmentTypesDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 10, "video");
        VIDEO = messagesGetHistoryAttachmentsAttachmentTypesDto11;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto12 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("WALL", 11, "wall");
        WALL = messagesGetHistoryAttachmentsAttachmentTypesDto12;
        MessagesGetHistoryAttachmentsAttachmentTypesDto[] messagesGetHistoryAttachmentsAttachmentTypesDtoArr = {messagesGetHistoryAttachmentsAttachmentTypesDto, messagesGetHistoryAttachmentsAttachmentTypesDto2, messagesGetHistoryAttachmentsAttachmentTypesDto3, messagesGetHistoryAttachmentsAttachmentTypesDto4, messagesGetHistoryAttachmentsAttachmentTypesDto5, messagesGetHistoryAttachmentsAttachmentTypesDto6, messagesGetHistoryAttachmentsAttachmentTypesDto7, messagesGetHistoryAttachmentsAttachmentTypesDto8, messagesGetHistoryAttachmentsAttachmentTypesDto9, messagesGetHistoryAttachmentsAttachmentTypesDto10, messagesGetHistoryAttachmentsAttachmentTypesDto11, messagesGetHistoryAttachmentsAttachmentTypesDto12};
        $VALUES = messagesGetHistoryAttachmentsAttachmentTypesDtoArr;
        $ENTRIES = new asp(messagesGetHistoryAttachmentsAttachmentTypesDtoArr);
    }

    private MessagesGetHistoryAttachmentsAttachmentTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetHistoryAttachmentsAttachmentTypesDto valueOf(String str) {
        return (MessagesGetHistoryAttachmentsAttachmentTypesDto) Enum.valueOf(MessagesGetHistoryAttachmentsAttachmentTypesDto.class, str);
    }

    public static MessagesGetHistoryAttachmentsAttachmentTypesDto[] values() {
        return (MessagesGetHistoryAttachmentsAttachmentTypesDto[]) $VALUES.clone();
    }
}
