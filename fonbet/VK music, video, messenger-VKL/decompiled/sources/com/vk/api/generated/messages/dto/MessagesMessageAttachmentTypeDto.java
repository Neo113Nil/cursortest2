package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesMessageAttachmentTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageAttachmentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesMessageAttachmentTypeDto[] $VALUES;

    @pmi0("album")
    public static final MessagesMessageAttachmentTypeDto ALBUM;

    @pmi0("app_action")
    public static final MessagesMessageAttachmentTypeDto APP_ACTION;

    @pmi0("article")
    public static final MessagesMessageAttachmentTypeDto ARTICLE;

    @pmi0("artist")
    public static final MessagesMessageAttachmentTypeDto ARTIST;

    @pmi0("audio")
    public static final MessagesMessageAttachmentTypeDto AUDIO;

    @pmi0("audio_message")
    public static final MessagesMessageAttachmentTypeDto AUDIO_MESSAGE;

    @pmi0("audio_playlist")
    public static final MessagesMessageAttachmentTypeDto AUDIO_PLAYLIST;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    public static final MessagesMessageAttachmentTypeDto CALL;

    @pmi0("channel_message")
    public static final MessagesMessageAttachmentTypeDto CHANNEL_MESSAGE;
    public static final Parcelable.Creator<MessagesMessageAttachmentTypeDto> CREATOR;

    @pmi0("curator")
    public static final MessagesMessageAttachmentTypeDto CURATOR;

    @pmi0("doc")
    public static final MessagesMessageAttachmentTypeDto DOC;

    @pmi0("donut_link")
    public static final MessagesMessageAttachmentTypeDto DONUT_LINK;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final MessagesMessageAttachmentTypeDto EVENT;

    @pmi0("gift")
    public static final MessagesMessageAttachmentTypeDto GIFT;

    @pmi0("graffiti")
    public static final MessagesMessageAttachmentTypeDto GRAFFITI;

    @pmi0("group")
    public static final MessagesMessageAttachmentTypeDto GROUP;

    @pmi0("group_call_in_progress")
    public static final MessagesMessageAttachmentTypeDto GROUP_CALL_IN_PROGRESS;

    @pmi0("link")
    public static final MessagesMessageAttachmentTypeDto LINK;

    @pmi0("link_curator")
    public static final MessagesMessageAttachmentTypeDto LINK_CURATOR;

    @pmi0("market")
    public static final MessagesMessageAttachmentTypeDto MARKET;

    @pmi0("market_album")
    public static final MessagesMessageAttachmentTypeDto MARKET_ALBUM;

    @pmi0("market_order")
    public static final MessagesMessageAttachmentTypeDto MARKET_ORDER;

    @pmi0("mini_app")
    public static final MessagesMessageAttachmentTypeDto MINI_APP;

    @pmi0("money_request")
    public static final MessagesMessageAttachmentTypeDto MONEY_REQUEST;

    @pmi0("money_transfer")
    public static final MessagesMessageAttachmentTypeDto MONEY_TRANSFER;

    @pmi0("narrative")
    public static final MessagesMessageAttachmentTypeDto NARRATIVE;

    @pmi0("photo")
    public static final MessagesMessageAttachmentTypeDto PHOTO;

    @pmi0("podcast")
    public static final MessagesMessageAttachmentTypeDto PODCAST;

    @pmi0("podcasts")
    public static final MessagesMessageAttachmentTypeDto PODCASTS;

    @pmi0("poll")
    public static final MessagesMessageAttachmentTypeDto POLL;

    @pmi0("question")
    public static final MessagesMessageAttachmentTypeDto QUESTION;

    @pmi0("sticker")
    public static final MessagesMessageAttachmentTypeDto STICKER;

    @pmi0("sticker_pack_preview")
    public static final MessagesMessageAttachmentTypeDto STICKER_PACK_PREVIEW;

    @pmi0("story")
    public static final MessagesMessageAttachmentTypeDto STORY;

    @pmi0("ugc_sticker")
    public static final MessagesMessageAttachmentTypeDto UGC_STICKER;

    @pmi0("video")
    public static final MessagesMessageAttachmentTypeDto VIDEO;

    @pmi0("video_message")
    public static final MessagesMessageAttachmentTypeDto VIDEO_MESSAGE;

    @pmi0("video_playlist")
    public static final MessagesMessageAttachmentTypeDto VIDEO_PLAYLIST;

    @pmi0("vkpay")
    public static final MessagesMessageAttachmentTypeDto VKPAY;

    @pmi0("wall")
    public static final MessagesMessageAttachmentTypeDto WALL;

    @pmi0("wall_reply")
    public static final MessagesMessageAttachmentTypeDto WALL_REPLY;

    @pmi0("widget")
    public static final MessagesMessageAttachmentTypeDto WIDGET;
    private final String value;

    /* compiled from: MessagesMessageAttachmentTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageAttachmentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentTypeDto createFromParcel(Parcel parcel) {
            return MessagesMessageAttachmentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentTypeDto[] newArray(int i) {
            return new MessagesMessageAttachmentTypeDto[i];
        }
    }

    static {
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto = new MessagesMessageAttachmentTypeDto("PHOTO", 0, "photo");
        PHOTO = messagesMessageAttachmentTypeDto;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto2 = new MessagesMessageAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 1, "audio");
        AUDIO = messagesMessageAttachmentTypeDto2;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto3 = new MessagesMessageAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = messagesMessageAttachmentTypeDto3;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto4 = new MessagesMessageAttachmentTypeDto("VIDEO_PLAYLIST", 3, "video_playlist");
        VIDEO_PLAYLIST = messagesMessageAttachmentTypeDto4;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto5 = new MessagesMessageAttachmentTypeDto("VIDEO_MESSAGE", 4, "video_message");
        VIDEO_MESSAGE = messagesMessageAttachmentTypeDto5;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto6 = new MessagesMessageAttachmentTypeDto("DOC", 5, "doc");
        DOC = messagesMessageAttachmentTypeDto6;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto7 = new MessagesMessageAttachmentTypeDto("LINK", 6, "link");
        LINK = messagesMessageAttachmentTypeDto7;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto8 = new MessagesMessageAttachmentTypeDto("MARKET", 7, "market");
        MARKET = messagesMessageAttachmentTypeDto8;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto9 = new MessagesMessageAttachmentTypeDto("GIFT", 8, "gift");
        GIFT = messagesMessageAttachmentTypeDto9;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto10 = new MessagesMessageAttachmentTypeDto("STICKER", 9, "sticker");
        STICKER = messagesMessageAttachmentTypeDto10;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto11 = new MessagesMessageAttachmentTypeDto("WALL", 10, "wall");
        WALL = messagesMessageAttachmentTypeDto11;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto12 = new MessagesMessageAttachmentTypeDto("WALL_REPLY", 11, "wall_reply");
        WALL_REPLY = messagesMessageAttachmentTypeDto12;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto13 = new MessagesMessageAttachmentTypeDto("CHANNEL_MESSAGE", 12, "channel_message");
        CHANNEL_MESSAGE = messagesMessageAttachmentTypeDto13;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto14 = new MessagesMessageAttachmentTypeDto("MONEY_TRANSFER", 13, "money_transfer");
        MONEY_TRANSFER = messagesMessageAttachmentTypeDto14;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto15 = new MessagesMessageAttachmentTypeDto("MONEY_REQUEST", 14, "money_request");
        MONEY_REQUEST = messagesMessageAttachmentTypeDto15;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto16 = new MessagesMessageAttachmentTypeDto("STORY", 15, "story");
        STORY = messagesMessageAttachmentTypeDto16;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto17 = new MessagesMessageAttachmentTypeDto("ARTICLE", 16, "article");
        ARTICLE = messagesMessageAttachmentTypeDto17;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto18 = new MessagesMessageAttachmentTypeDto("POLL", 17, "poll");
        POLL = messagesMessageAttachmentTypeDto18;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto19 = new MessagesMessageAttachmentTypeDto("AUDIO_PLAYLIST", 18, "audio_playlist");
        AUDIO_PLAYLIST = messagesMessageAttachmentTypeDto19;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto20 = new MessagesMessageAttachmentTypeDto("PODCAST", 19, "podcast");
        PODCAST = messagesMessageAttachmentTypeDto20;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto21 = new MessagesMessageAttachmentTypeDto("PODCASTS", 20, "podcasts");
        PODCASTS = messagesMessageAttachmentTypeDto21;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto22 = new MessagesMessageAttachmentTypeDto("GROUP", 21, "group");
        GROUP = messagesMessageAttachmentTypeDto22;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto23 = new MessagesMessageAttachmentTypeDto("CURATOR", 22, "curator");
        CURATOR = messagesMessageAttachmentTypeDto23;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto24 = new MessagesMessageAttachmentTypeDto("WIDGET", 23, "widget");
        WIDGET = messagesMessageAttachmentTypeDto24;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto25 = new MessagesMessageAttachmentTypeDto("LINK_CURATOR", 24, "link_curator");
        LINK_CURATOR = messagesMessageAttachmentTypeDto25;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto26 = new MessagesMessageAttachmentTypeDto("VKPAY", 25, "vkpay");
        VKPAY = messagesMessageAttachmentTypeDto26;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto27 = new MessagesMessageAttachmentTypeDto("UGC_STICKER", 26, "ugc_sticker");
        UGC_STICKER = messagesMessageAttachmentTypeDto27;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto28 = new MessagesMessageAttachmentTypeDto("ALBUM", 27, "album");
        ALBUM = messagesMessageAttachmentTypeDto28;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto29 = new MessagesMessageAttachmentTypeDto("MARKET_ALBUM", 28, "market_album");
        MARKET_ALBUM = messagesMessageAttachmentTypeDto29;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto30 = new MessagesMessageAttachmentTypeDto("CALL", 29, NotificationCompat.CATEGORY_CALL);
        CALL = messagesMessageAttachmentTypeDto30;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto31 = new MessagesMessageAttachmentTypeDto("GRAFFITI", 30, "graffiti");
        GRAFFITI = messagesMessageAttachmentTypeDto31;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto32 = new MessagesMessageAttachmentTypeDto("AUDIO_MESSAGE", 31, "audio_message");
        AUDIO_MESSAGE = messagesMessageAttachmentTypeDto32;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto33 = new MessagesMessageAttachmentTypeDto("ARTIST", 32, "artist");
        ARTIST = messagesMessageAttachmentTypeDto33;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto34 = new MessagesMessageAttachmentTypeDto("EVENT", 33, NotificationCompat.CATEGORY_EVENT);
        EVENT = messagesMessageAttachmentTypeDto34;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto35 = new MessagesMessageAttachmentTypeDto("MINI_APP", 34, "mini_app");
        MINI_APP = messagesMessageAttachmentTypeDto35;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto36 = new MessagesMessageAttachmentTypeDto("GROUP_CALL_IN_PROGRESS", 35, "group_call_in_progress");
        GROUP_CALL_IN_PROGRESS = messagesMessageAttachmentTypeDto36;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto37 = new MessagesMessageAttachmentTypeDto("DONUT_LINK", 36, "donut_link");
        DONUT_LINK = messagesMessageAttachmentTypeDto37;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto38 = new MessagesMessageAttachmentTypeDto("NARRATIVE", 37, "narrative");
        NARRATIVE = messagesMessageAttachmentTypeDto38;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto39 = new MessagesMessageAttachmentTypeDto("APP_ACTION", 38, "app_action");
        APP_ACTION = messagesMessageAttachmentTypeDto39;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto40 = new MessagesMessageAttachmentTypeDto("QUESTION", 39, "question");
        QUESTION = messagesMessageAttachmentTypeDto40;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto41 = new MessagesMessageAttachmentTypeDto("STICKER_PACK_PREVIEW", 40, "sticker_pack_preview");
        STICKER_PACK_PREVIEW = messagesMessageAttachmentTypeDto41;
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto42 = new MessagesMessageAttachmentTypeDto("MARKET_ORDER", 41, "market_order");
        MARKET_ORDER = messagesMessageAttachmentTypeDto42;
        MessagesMessageAttachmentTypeDto[] messagesMessageAttachmentTypeDtoArr = {messagesMessageAttachmentTypeDto, messagesMessageAttachmentTypeDto2, messagesMessageAttachmentTypeDto3, messagesMessageAttachmentTypeDto4, messagesMessageAttachmentTypeDto5, messagesMessageAttachmentTypeDto6, messagesMessageAttachmentTypeDto7, messagesMessageAttachmentTypeDto8, messagesMessageAttachmentTypeDto9, messagesMessageAttachmentTypeDto10, messagesMessageAttachmentTypeDto11, messagesMessageAttachmentTypeDto12, messagesMessageAttachmentTypeDto13, messagesMessageAttachmentTypeDto14, messagesMessageAttachmentTypeDto15, messagesMessageAttachmentTypeDto16, messagesMessageAttachmentTypeDto17, messagesMessageAttachmentTypeDto18, messagesMessageAttachmentTypeDto19, messagesMessageAttachmentTypeDto20, messagesMessageAttachmentTypeDto21, messagesMessageAttachmentTypeDto22, messagesMessageAttachmentTypeDto23, messagesMessageAttachmentTypeDto24, messagesMessageAttachmentTypeDto25, messagesMessageAttachmentTypeDto26, messagesMessageAttachmentTypeDto27, messagesMessageAttachmentTypeDto28, messagesMessageAttachmentTypeDto29, messagesMessageAttachmentTypeDto30, messagesMessageAttachmentTypeDto31, messagesMessageAttachmentTypeDto32, messagesMessageAttachmentTypeDto33, messagesMessageAttachmentTypeDto34, messagesMessageAttachmentTypeDto35, messagesMessageAttachmentTypeDto36, messagesMessageAttachmentTypeDto37, messagesMessageAttachmentTypeDto38, messagesMessageAttachmentTypeDto39, messagesMessageAttachmentTypeDto40, messagesMessageAttachmentTypeDto41, messagesMessageAttachmentTypeDto42};
        $VALUES = messagesMessageAttachmentTypeDtoArr;
        $ENTRIES = new asp(messagesMessageAttachmentTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesMessageAttachmentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesMessageAttachmentTypeDto valueOf(String str) {
        return (MessagesMessageAttachmentTypeDto) Enum.valueOf(MessagesMessageAttachmentTypeDto.class, str);
    }

    public static MessagesMessageAttachmentTypeDto[] values() {
        return (MessagesMessageAttachmentTypeDto[]) $VALUES.clone();
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
