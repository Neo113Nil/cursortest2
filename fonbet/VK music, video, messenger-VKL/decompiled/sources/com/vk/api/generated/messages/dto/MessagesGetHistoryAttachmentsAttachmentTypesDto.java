package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetHistoryAttachmentsAttachmentTypesDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetHistoryAttachmentsAttachmentTypesDto implements Parcelable {
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

    @pmi0("clip")
    public static final MessagesGetHistoryAttachmentsAttachmentTypesDto CLIP;
    public static final Parcelable.Creator<MessagesGetHistoryAttachmentsAttachmentTypesDto> CREATOR;

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

    /* compiled from: MessagesGetHistoryAttachmentsAttachmentTypesDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetHistoryAttachmentsAttachmentTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryAttachmentsAttachmentTypesDto createFromParcel(Parcel parcel) {
            return MessagesGetHistoryAttachmentsAttachmentTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryAttachmentsAttachmentTypesDto[] newArray(int i) {
            return new MessagesGetHistoryAttachmentsAttachmentTypesDto[i];
        }
    }

    static {
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto = new MessagesGetHistoryAttachmentsAttachmentTypesDto("APP_ACTION_GAMES", 0, "app_action_games");
        APP_ACTION_GAMES = messagesGetHistoryAttachmentsAttachmentTypesDto;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto2 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("APP_ACTION_MINI_APPS", 1, "app_action_mini_apps");
        APP_ACTION_MINI_APPS = messagesGetHistoryAttachmentsAttachmentTypesDto2;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto3 = new MessagesGetHistoryAttachmentsAttachmentTypesDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 2, "audio");
        AUDIO = messagesGetHistoryAttachmentsAttachmentTypesDto3;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto4 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("AUDIO_MESSAGE", 3, "audio_message");
        AUDIO_MESSAGE = messagesGetHistoryAttachmentsAttachmentTypesDto4;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto5 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("CLIP", 4, "clip");
        CLIP = messagesGetHistoryAttachmentsAttachmentTypesDto5;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto6 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("DOC", 5, "doc");
        DOC = messagesGetHistoryAttachmentsAttachmentTypesDto6;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto7 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("GRAFFITI", 6, "graffiti");
        GRAFFITI = messagesGetHistoryAttachmentsAttachmentTypesDto7;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto8 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("LINK", 7, "link");
        LINK = messagesGetHistoryAttachmentsAttachmentTypesDto8;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto9 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("MARKET", 8, "market");
        MARKET = messagesGetHistoryAttachmentsAttachmentTypesDto9;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto10 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("PHOTO", 9, "photo");
        PHOTO = messagesGetHistoryAttachmentsAttachmentTypesDto10;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto11 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("SHARE", 10, "share");
        SHARE = messagesGetHistoryAttachmentsAttachmentTypesDto11;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto12 = new MessagesGetHistoryAttachmentsAttachmentTypesDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 11, "video");
        VIDEO = messagesGetHistoryAttachmentsAttachmentTypesDto12;
        MessagesGetHistoryAttachmentsAttachmentTypesDto messagesGetHistoryAttachmentsAttachmentTypesDto13 = new MessagesGetHistoryAttachmentsAttachmentTypesDto("WALL", 12, "wall");
        WALL = messagesGetHistoryAttachmentsAttachmentTypesDto13;
        MessagesGetHistoryAttachmentsAttachmentTypesDto[] messagesGetHistoryAttachmentsAttachmentTypesDtoArr = {messagesGetHistoryAttachmentsAttachmentTypesDto, messagesGetHistoryAttachmentsAttachmentTypesDto2, messagesGetHistoryAttachmentsAttachmentTypesDto3, messagesGetHistoryAttachmentsAttachmentTypesDto4, messagesGetHistoryAttachmentsAttachmentTypesDto5, messagesGetHistoryAttachmentsAttachmentTypesDto6, messagesGetHistoryAttachmentsAttachmentTypesDto7, messagesGetHistoryAttachmentsAttachmentTypesDto8, messagesGetHistoryAttachmentsAttachmentTypesDto9, messagesGetHistoryAttachmentsAttachmentTypesDto10, messagesGetHistoryAttachmentsAttachmentTypesDto11, messagesGetHistoryAttachmentsAttachmentTypesDto12, messagesGetHistoryAttachmentsAttachmentTypesDto13};
        $VALUES = messagesGetHistoryAttachmentsAttachmentTypesDtoArr;
        $ENTRIES = new asp(messagesGetHistoryAttachmentsAttachmentTypesDtoArr);
        CREATOR = new a();
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
