package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetHistoryAttachmentsMediaTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetHistoryAttachmentsMediaTypeDto implements Parcelable {
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

    @pmi0("clip")
    public static final MessagesGetHistoryAttachmentsMediaTypeDto CLIP;
    public static final Parcelable.Creator<MessagesGetHistoryAttachmentsMediaTypeDto> CREATOR;

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

    /* compiled from: MessagesGetHistoryAttachmentsMediaTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetHistoryAttachmentsMediaTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryAttachmentsMediaTypeDto createFromParcel(Parcel parcel) {
            return MessagesGetHistoryAttachmentsMediaTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryAttachmentsMediaTypeDto[] newArray(int i) {
            return new MessagesGetHistoryAttachmentsMediaTypeDto[i];
        }
    }

    static {
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto = new MessagesGetHistoryAttachmentsMediaTypeDto("APP_ACTION_GAMES", 0, "app_action_games");
        APP_ACTION_GAMES = messagesGetHistoryAttachmentsMediaTypeDto;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto2 = new MessagesGetHistoryAttachmentsMediaTypeDto("APP_ACTION_MINI_APPS", 1, "app_action_mini_apps");
        APP_ACTION_MINI_APPS = messagesGetHistoryAttachmentsMediaTypeDto2;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto3 = new MessagesGetHistoryAttachmentsMediaTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 2, "audio");
        AUDIO = messagesGetHistoryAttachmentsMediaTypeDto3;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto4 = new MessagesGetHistoryAttachmentsMediaTypeDto("AUDIO_MESSAGE", 3, "audio_message");
        AUDIO_MESSAGE = messagesGetHistoryAttachmentsMediaTypeDto4;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto5 = new MessagesGetHistoryAttachmentsMediaTypeDto("CLIP", 4, "clip");
        CLIP = messagesGetHistoryAttachmentsMediaTypeDto5;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto6 = new MessagesGetHistoryAttachmentsMediaTypeDto("DOC", 5, "doc");
        DOC = messagesGetHistoryAttachmentsMediaTypeDto6;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto7 = new MessagesGetHistoryAttachmentsMediaTypeDto("GRAFFITI", 6, "graffiti");
        GRAFFITI = messagesGetHistoryAttachmentsMediaTypeDto7;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto8 = new MessagesGetHistoryAttachmentsMediaTypeDto("LINK", 7, "link");
        LINK = messagesGetHistoryAttachmentsMediaTypeDto8;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto9 = new MessagesGetHistoryAttachmentsMediaTypeDto("MARKET", 8, "market");
        MARKET = messagesGetHistoryAttachmentsMediaTypeDto9;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto10 = new MessagesGetHistoryAttachmentsMediaTypeDto("PHOTO", 9, "photo");
        PHOTO = messagesGetHistoryAttachmentsMediaTypeDto10;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto11 = new MessagesGetHistoryAttachmentsMediaTypeDto("SHARE", 10, "share");
        SHARE = messagesGetHistoryAttachmentsMediaTypeDto11;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto12 = new MessagesGetHistoryAttachmentsMediaTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 11, "video");
        VIDEO = messagesGetHistoryAttachmentsMediaTypeDto12;
        MessagesGetHistoryAttachmentsMediaTypeDto messagesGetHistoryAttachmentsMediaTypeDto13 = new MessagesGetHistoryAttachmentsMediaTypeDto("WALL", 12, "wall");
        WALL = messagesGetHistoryAttachmentsMediaTypeDto13;
        MessagesGetHistoryAttachmentsMediaTypeDto[] messagesGetHistoryAttachmentsMediaTypeDtoArr = {messagesGetHistoryAttachmentsMediaTypeDto, messagesGetHistoryAttachmentsMediaTypeDto2, messagesGetHistoryAttachmentsMediaTypeDto3, messagesGetHistoryAttachmentsMediaTypeDto4, messagesGetHistoryAttachmentsMediaTypeDto5, messagesGetHistoryAttachmentsMediaTypeDto6, messagesGetHistoryAttachmentsMediaTypeDto7, messagesGetHistoryAttachmentsMediaTypeDto8, messagesGetHistoryAttachmentsMediaTypeDto9, messagesGetHistoryAttachmentsMediaTypeDto10, messagesGetHistoryAttachmentsMediaTypeDto11, messagesGetHistoryAttachmentsMediaTypeDto12, messagesGetHistoryAttachmentsMediaTypeDto13};
        $VALUES = messagesGetHistoryAttachmentsMediaTypeDtoArr;
        $ENTRIES = new asp(messagesGetHistoryAttachmentsMediaTypeDtoArr);
        CREATOR = new a();
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
