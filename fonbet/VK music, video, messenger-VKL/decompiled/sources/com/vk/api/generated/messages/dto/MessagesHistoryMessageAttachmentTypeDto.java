package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesHistoryMessageAttachmentTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesHistoryMessageAttachmentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesHistoryMessageAttachmentTypeDto[] $VALUES;

    @pmi0("app_action")
    public static final MessagesHistoryMessageAttachmentTypeDto APP_ACTION;

    @pmi0("audio")
    public static final MessagesHistoryMessageAttachmentTypeDto AUDIO;

    @pmi0("audio_message")
    public static final MessagesHistoryMessageAttachmentTypeDto AUDIO_MESSAGE;
    public static final Parcelable.Creator<MessagesHistoryMessageAttachmentTypeDto> CREATOR;

    @pmi0("doc")
    public static final MessagesHistoryMessageAttachmentTypeDto DOC;

    @pmi0("graffiti")
    public static final MessagesHistoryMessageAttachmentTypeDto GRAFFITI;

    @pmi0("link")
    public static final MessagesHistoryMessageAttachmentTypeDto LINK;

    @pmi0("market")
    public static final MessagesHistoryMessageAttachmentTypeDto MARKET;

    @pmi0("market_order")
    public static final MessagesHistoryMessageAttachmentTypeDto MARKET_ORDER;

    @pmi0("mini_app")
    public static final MessagesHistoryMessageAttachmentTypeDto MINI_APP;

    @pmi0("photo")
    public static final MessagesHistoryMessageAttachmentTypeDto PHOTO;

    @pmi0("video")
    public static final MessagesHistoryMessageAttachmentTypeDto VIDEO;

    @pmi0("video_message")
    public static final MessagesHistoryMessageAttachmentTypeDto VIDEO_MESSAGE;

    @pmi0("video_playlist")
    public static final MessagesHistoryMessageAttachmentTypeDto VIDEO_PLAYLIST;

    @pmi0("wall")
    public static final MessagesHistoryMessageAttachmentTypeDto WALL;
    private final String value;

    /* compiled from: MessagesHistoryMessageAttachmentTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesHistoryMessageAttachmentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesHistoryMessageAttachmentTypeDto createFromParcel(Parcel parcel) {
            return MessagesHistoryMessageAttachmentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesHistoryMessageAttachmentTypeDto[] newArray(int i) {
            return new MessagesHistoryMessageAttachmentTypeDto[i];
        }
    }

    static {
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto = new MessagesHistoryMessageAttachmentTypeDto("APP_ACTION", 0, "app_action");
        APP_ACTION = messagesHistoryMessageAttachmentTypeDto;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto2 = new MessagesHistoryMessageAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 1, "audio");
        AUDIO = messagesHistoryMessageAttachmentTypeDto2;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto3 = new MessagesHistoryMessageAttachmentTypeDto("DOC", 2, "doc");
        DOC = messagesHistoryMessageAttachmentTypeDto3;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto4 = new MessagesHistoryMessageAttachmentTypeDto("LINK", 3, "link");
        LINK = messagesHistoryMessageAttachmentTypeDto4;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto5 = new MessagesHistoryMessageAttachmentTypeDto("MARKET", 4, "market");
        MARKET = messagesHistoryMessageAttachmentTypeDto5;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto6 = new MessagesHistoryMessageAttachmentTypeDto("MINI_APP", 5, "mini_app");
        MINI_APP = messagesHistoryMessageAttachmentTypeDto6;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto7 = new MessagesHistoryMessageAttachmentTypeDto("PHOTO", 6, "photo");
        PHOTO = messagesHistoryMessageAttachmentTypeDto7;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto8 = new MessagesHistoryMessageAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 7, "video");
        VIDEO = messagesHistoryMessageAttachmentTypeDto8;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto9 = new MessagesHistoryMessageAttachmentTypeDto("VIDEO_MESSAGE", 8, "video_message");
        VIDEO_MESSAGE = messagesHistoryMessageAttachmentTypeDto9;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto10 = new MessagesHistoryMessageAttachmentTypeDto("VIDEO_PLAYLIST", 9, "video_playlist");
        VIDEO_PLAYLIST = messagesHistoryMessageAttachmentTypeDto10;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto11 = new MessagesHistoryMessageAttachmentTypeDto("WALL", 10, "wall");
        WALL = messagesHistoryMessageAttachmentTypeDto11;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto12 = new MessagesHistoryMessageAttachmentTypeDto("GRAFFITI", 11, "graffiti");
        GRAFFITI = messagesHistoryMessageAttachmentTypeDto12;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto13 = new MessagesHistoryMessageAttachmentTypeDto("AUDIO_MESSAGE", 12, "audio_message");
        AUDIO_MESSAGE = messagesHistoryMessageAttachmentTypeDto13;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto14 = new MessagesHistoryMessageAttachmentTypeDto("MARKET_ORDER", 13, "market_order");
        MARKET_ORDER = messagesHistoryMessageAttachmentTypeDto14;
        MessagesHistoryMessageAttachmentTypeDto[] messagesHistoryMessageAttachmentTypeDtoArr = {messagesHistoryMessageAttachmentTypeDto, messagesHistoryMessageAttachmentTypeDto2, messagesHistoryMessageAttachmentTypeDto3, messagesHistoryMessageAttachmentTypeDto4, messagesHistoryMessageAttachmentTypeDto5, messagesHistoryMessageAttachmentTypeDto6, messagesHistoryMessageAttachmentTypeDto7, messagesHistoryMessageAttachmentTypeDto8, messagesHistoryMessageAttachmentTypeDto9, messagesHistoryMessageAttachmentTypeDto10, messagesHistoryMessageAttachmentTypeDto11, messagesHistoryMessageAttachmentTypeDto12, messagesHistoryMessageAttachmentTypeDto13, messagesHistoryMessageAttachmentTypeDto14};
        $VALUES = messagesHistoryMessageAttachmentTypeDtoArr;
        $ENTRIES = new asp(messagesHistoryMessageAttachmentTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesHistoryMessageAttachmentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesHistoryMessageAttachmentTypeDto valueOf(String str) {
        return (MessagesHistoryMessageAttachmentTypeDto) Enum.valueOf(MessagesHistoryMessageAttachmentTypeDto.class, str);
    }

    public static MessagesHistoryMessageAttachmentTypeDto[] values() {
        return (MessagesHistoryMessageAttachmentTypeDto[]) $VALUES.clone();
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
