package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import ru.ok.android.sdk.util.OkScope;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportsGetReasonsSourceDto.kt */
/* loaded from: classes15.dex */
public final class ReportsGetReasonsSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReportsGetReasonsSourceDto[] $VALUES;

    @pmi0("ad")
    public static final ReportsGetReasonsSourceDto AD;

    @pmi0("add_to_chat")
    public static final ReportsGetReasonsSourceDto ADD_TO_CHAT;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final ReportsGetReasonsSourceDto APP;

    @pmi0("app_invite")
    public static final ReportsGetReasonsSourceDto APP_INVITE;

    @pmi0("article")
    public static final ReportsGetReasonsSourceDto ARTICLE;

    @pmi0("authors_marketplace_offer")
    public static final ReportsGetReasonsSourceDto AUTHORS_MARKETPLACE_OFFER;

    @pmi0("board_poll")
    public static final ReportsGetReasonsSourceDto BOARD_POLL;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    public static final ReportsGetReasonsSourceDto CALL;

    @pmi0("channel")
    public static final ReportsGetReasonsSourceDto CHANNEL;

    @pmi0("channel_comment")
    public static final ReportsGetReasonsSourceDto CHANNEL_COMMENT;

    @pmi0("chat")
    public static final ReportsGetReasonsSourceDto CHAT;

    @pmi0("clip")
    public static final ReportsGetReasonsSourceDto CLIP;

    @pmi0("clip_comment")
    public static final ReportsGetReasonsSourceDto CLIP_COMMENT;

    @pmi0("comment")
    public static final ReportsGetReasonsSourceDto COMMENT;

    @pmi0("community")
    public static final ReportsGetReasonsSourceDto COMMUNITY;

    @pmi0("community_channel")
    public static final ReportsGetReasonsSourceDto COMMUNITY_CHANNEL;

    @pmi0("community_review")
    public static final ReportsGetReasonsSourceDto COMMUNITY_REVIEW;
    public static final Parcelable.Creator<ReportsGetReasonsSourceDto> CREATOR;

    @pmi0("dialogue")
    public static final ReportsGetReasonsSourceDto DIALOGUE;

    @pmi0("dialogue_not_friends")
    public static final ReportsGetReasonsSourceDto DIALOGUE_NOT_FRIENDS;

    @pmi0("friend_request")
    public static final ReportsGetReasonsSourceDto FRIEND_REQUEST;

    @pmi0("game")
    public static final ReportsGetReasonsSourceDto GAME;

    @pmi0("group_invite")
    public static final ReportsGetReasonsSourceDto GROUP_INVITE;

    @pmi0("item_review")
    public static final ReportsGetReasonsSourceDto ITEM_REVIEW;

    @pmi0("live_comment")
    public static final ReportsGetReasonsSourceDto LIVE_COMMENT;

    @pmi0("market")
    public static final ReportsGetReasonsSourceDto MARKET;

    @pmi0("market_comment")
    public static final ReportsGetReasonsSourceDto MARKET_COMMENT;

    @pmi0("message")
    public static final ReportsGetReasonsSourceDto MESSAGE;

    @pmi0("message_request")
    public static final ReportsGetReasonsSourceDto MESSAGE_REQUEST;

    @pmi0("narrative")
    public static final ReportsGetReasonsSourceDto NARRATIVE;

    @pmi0("nft")
    public static final ReportsGetReasonsSourceDto NFT;

    @pmi0("note")
    public static final ReportsGetReasonsSourceDto NOTE;

    @pmi0("photo")
    public static final ReportsGetReasonsSourceDto PHOTO;

    @pmi0("photo_comment")
    public static final ReportsGetReasonsSourceDto PHOTO_COMMENT;

    @pmi0("poll")
    public static final ReportsGetReasonsSourceDto POLL;

    @pmi0("post")
    public static final ReportsGetReasonsSourceDto POST;

    @pmi0("profile_story_question")
    public static final ReportsGetReasonsSourceDto PROFILE_STORY_QUESTION;

    @pmi0("situational_post")
    public static final ReportsGetReasonsSourceDto SITUATIONAL_POST;

    @pmi0("story")
    public static final ReportsGetReasonsSourceDto STORY;

    @pmi0("story_question")
    public static final ReportsGetReasonsSourceDto STORY_QUESTION;

    @pmi0("textlive")
    public static final ReportsGetReasonsSourceDto TEXTLIVE;

    @pmi0("textpost")
    public static final ReportsGetReasonsSourceDto TEXTPOST;

    @pmi0("topic_comment")
    public static final ReportsGetReasonsSourceDto TOPIC_COMMENT;

    @pmi0("ugc_sticker")
    public static final ReportsGetReasonsSourceDto UGC_STICKER;

    @pmi0("ugc_sticker_pack")
    public static final ReportsGetReasonsSourceDto UGC_STICKER_PACK;

    @pmi0("user")
    public static final ReportsGetReasonsSourceDto USER;

    @pmi0("user_channel_comment")
    public static final ReportsGetReasonsSourceDto USER_CHANNEL_COMMENT;

    @pmi0("user_channel_post")
    public static final ReportsGetReasonsSourceDto USER_CHANNEL_POST;

    @pmi0("video")
    public static final ReportsGetReasonsSourceDto VIDEO;

    @pmi0("video_comment")
    public static final ReportsGetReasonsSourceDto VIDEO_COMMENT;

    @pmi0("vkpl_stream")
    public static final ReportsGetReasonsSourceDto VKPL_STREAM;

    @pmi0("wall")
    public static final ReportsGetReasonsSourceDto WALL;

    @pmi0("wall_comment")
    public static final ReportsGetReasonsSourceDto WALL_COMMENT;
    private final String value;

    /* compiled from: ReportsGetReasonsSourceDto.kt */
    public static final class a implements Parcelable.Creator<ReportsGetReasonsSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsGetReasonsSourceDto createFromParcel(Parcel parcel) {
            return ReportsGetReasonsSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsGetReasonsSourceDto[] newArray(int i) {
            return new ReportsGetReasonsSourceDto[i];
        }
    }

    static {
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto = new ReportsGetReasonsSourceDto("AD", 0, "ad");
        AD = reportsGetReasonsSourceDto;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto2 = new ReportsGetReasonsSourceDto("ADD_TO_CHAT", 1, "add_to_chat");
        ADD_TO_CHAT = reportsGetReasonsSourceDto2;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto3 = new ReportsGetReasonsSourceDto("APP", 2, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = reportsGetReasonsSourceDto3;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto4 = new ReportsGetReasonsSourceDto(OkScope.APP_INVITE, 3, "app_invite");
        APP_INVITE = reportsGetReasonsSourceDto4;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto5 = new ReportsGetReasonsSourceDto("ARTICLE", 4, "article");
        ARTICLE = reportsGetReasonsSourceDto5;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto6 = new ReportsGetReasonsSourceDto("AUTHORS_MARKETPLACE_OFFER", 5, "authors_marketplace_offer");
        AUTHORS_MARKETPLACE_OFFER = reportsGetReasonsSourceDto6;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto7 = new ReportsGetReasonsSourceDto("BOARD_POLL", 6, "board_poll");
        BOARD_POLL = reportsGetReasonsSourceDto7;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto8 = new ReportsGetReasonsSourceDto("CALL", 7, NotificationCompat.CATEGORY_CALL);
        CALL = reportsGetReasonsSourceDto8;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto9 = new ReportsGetReasonsSourceDto("CHANNEL", 8, "channel");
        CHANNEL = reportsGetReasonsSourceDto9;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto10 = new ReportsGetReasonsSourceDto("CHANNEL_COMMENT", 9, "channel_comment");
        CHANNEL_COMMENT = reportsGetReasonsSourceDto10;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto11 = new ReportsGetReasonsSourceDto("CHAT", 10, "chat");
        CHAT = reportsGetReasonsSourceDto11;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto12 = new ReportsGetReasonsSourceDto("CLIP", 11, "clip");
        CLIP = reportsGetReasonsSourceDto12;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto13 = new ReportsGetReasonsSourceDto("CLIP_COMMENT", 12, "clip_comment");
        CLIP_COMMENT = reportsGetReasonsSourceDto13;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto14 = new ReportsGetReasonsSourceDto("COMMENT", 13, "comment");
        COMMENT = reportsGetReasonsSourceDto14;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto15 = new ReportsGetReasonsSourceDto("COMMUNITY", 14, "community");
        COMMUNITY = reportsGetReasonsSourceDto15;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto16 = new ReportsGetReasonsSourceDto("COMMUNITY_CHANNEL", 15, "community_channel");
        COMMUNITY_CHANNEL = reportsGetReasonsSourceDto16;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto17 = new ReportsGetReasonsSourceDto("COMMUNITY_REVIEW", 16, "community_review");
        COMMUNITY_REVIEW = reportsGetReasonsSourceDto17;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto18 = new ReportsGetReasonsSourceDto("DIALOGUE", 17, "dialogue");
        DIALOGUE = reportsGetReasonsSourceDto18;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto19 = new ReportsGetReasonsSourceDto("DIALOGUE_NOT_FRIENDS", 18, "dialogue_not_friends");
        DIALOGUE_NOT_FRIENDS = reportsGetReasonsSourceDto19;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto20 = new ReportsGetReasonsSourceDto("FRIEND_REQUEST", 19, "friend_request");
        FRIEND_REQUEST = reportsGetReasonsSourceDto20;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto21 = new ReportsGetReasonsSourceDto("GAME", 20, "game");
        GAME = reportsGetReasonsSourceDto21;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto22 = new ReportsGetReasonsSourceDto("GROUP_INVITE", 21, "group_invite");
        GROUP_INVITE = reportsGetReasonsSourceDto22;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto23 = new ReportsGetReasonsSourceDto("ITEM_REVIEW", 22, "item_review");
        ITEM_REVIEW = reportsGetReasonsSourceDto23;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto24 = new ReportsGetReasonsSourceDto("LIVE_COMMENT", 23, "live_comment");
        LIVE_COMMENT = reportsGetReasonsSourceDto24;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto25 = new ReportsGetReasonsSourceDto("MARKET", 24, "market");
        MARKET = reportsGetReasonsSourceDto25;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto26 = new ReportsGetReasonsSourceDto("MARKET_COMMENT", 25, "market_comment");
        MARKET_COMMENT = reportsGetReasonsSourceDto26;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto27 = new ReportsGetReasonsSourceDto("MESSAGE", 26, "message");
        MESSAGE = reportsGetReasonsSourceDto27;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto28 = new ReportsGetReasonsSourceDto("MESSAGE_REQUEST", 27, "message_request");
        MESSAGE_REQUEST = reportsGetReasonsSourceDto28;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto29 = new ReportsGetReasonsSourceDto("NARRATIVE", 28, "narrative");
        NARRATIVE = reportsGetReasonsSourceDto29;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto30 = new ReportsGetReasonsSourceDto("NFT", 29, "nft");
        NFT = reportsGetReasonsSourceDto30;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto31 = new ReportsGetReasonsSourceDto("NOTE", 30, "note");
        NOTE = reportsGetReasonsSourceDto31;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto32 = new ReportsGetReasonsSourceDto("PHOTO", 31, "photo");
        PHOTO = reportsGetReasonsSourceDto32;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto33 = new ReportsGetReasonsSourceDto("PHOTO_COMMENT", 32, "photo_comment");
        PHOTO_COMMENT = reportsGetReasonsSourceDto33;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto34 = new ReportsGetReasonsSourceDto("POLL", 33, "poll");
        POLL = reportsGetReasonsSourceDto34;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto35 = new ReportsGetReasonsSourceDto("POST", 34, "post");
        POST = reportsGetReasonsSourceDto35;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto36 = new ReportsGetReasonsSourceDto("PROFILE_STORY_QUESTION", 35, "profile_story_question");
        PROFILE_STORY_QUESTION = reportsGetReasonsSourceDto36;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto37 = new ReportsGetReasonsSourceDto("SITUATIONAL_POST", 36, "situational_post");
        SITUATIONAL_POST = reportsGetReasonsSourceDto37;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto38 = new ReportsGetReasonsSourceDto("STORY", 37, "story");
        STORY = reportsGetReasonsSourceDto38;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto39 = new ReportsGetReasonsSourceDto("STORY_QUESTION", 38, "story_question");
        STORY_QUESTION = reportsGetReasonsSourceDto39;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto40 = new ReportsGetReasonsSourceDto("TEXTLIVE", 39, "textlive");
        TEXTLIVE = reportsGetReasonsSourceDto40;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto41 = new ReportsGetReasonsSourceDto("TEXTPOST", 40, "textpost");
        TEXTPOST = reportsGetReasonsSourceDto41;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto42 = new ReportsGetReasonsSourceDto("TOPIC_COMMENT", 41, "topic_comment");
        TOPIC_COMMENT = reportsGetReasonsSourceDto42;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto43 = new ReportsGetReasonsSourceDto("UGC_STICKER", 42, "ugc_sticker");
        UGC_STICKER = reportsGetReasonsSourceDto43;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto44 = new ReportsGetReasonsSourceDto("UGC_STICKER_PACK", 43, "ugc_sticker_pack");
        UGC_STICKER_PACK = reportsGetReasonsSourceDto44;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto45 = new ReportsGetReasonsSourceDto("USER", 44, "user");
        USER = reportsGetReasonsSourceDto45;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto46 = new ReportsGetReasonsSourceDto("USER_CHANNEL_COMMENT", 45, "user_channel_comment");
        USER_CHANNEL_COMMENT = reportsGetReasonsSourceDto46;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto47 = new ReportsGetReasonsSourceDto("USER_CHANNEL_POST", 46, "user_channel_post");
        USER_CHANNEL_POST = reportsGetReasonsSourceDto47;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto48 = new ReportsGetReasonsSourceDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 47, "video");
        VIDEO = reportsGetReasonsSourceDto48;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto49 = new ReportsGetReasonsSourceDto("VIDEO_COMMENT", 48, "video_comment");
        VIDEO_COMMENT = reportsGetReasonsSourceDto49;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto50 = new ReportsGetReasonsSourceDto("VKPL_STREAM", 49, "vkpl_stream");
        VKPL_STREAM = reportsGetReasonsSourceDto50;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto51 = new ReportsGetReasonsSourceDto("WALL", 50, "wall");
        WALL = reportsGetReasonsSourceDto51;
        ReportsGetReasonsSourceDto reportsGetReasonsSourceDto52 = new ReportsGetReasonsSourceDto("WALL_COMMENT", 51, "wall_comment");
        WALL_COMMENT = reportsGetReasonsSourceDto52;
        ReportsGetReasonsSourceDto[] reportsGetReasonsSourceDtoArr = {reportsGetReasonsSourceDto, reportsGetReasonsSourceDto2, reportsGetReasonsSourceDto3, reportsGetReasonsSourceDto4, reportsGetReasonsSourceDto5, reportsGetReasonsSourceDto6, reportsGetReasonsSourceDto7, reportsGetReasonsSourceDto8, reportsGetReasonsSourceDto9, reportsGetReasonsSourceDto10, reportsGetReasonsSourceDto11, reportsGetReasonsSourceDto12, reportsGetReasonsSourceDto13, reportsGetReasonsSourceDto14, reportsGetReasonsSourceDto15, reportsGetReasonsSourceDto16, reportsGetReasonsSourceDto17, reportsGetReasonsSourceDto18, reportsGetReasonsSourceDto19, reportsGetReasonsSourceDto20, reportsGetReasonsSourceDto21, reportsGetReasonsSourceDto22, reportsGetReasonsSourceDto23, reportsGetReasonsSourceDto24, reportsGetReasonsSourceDto25, reportsGetReasonsSourceDto26, reportsGetReasonsSourceDto27, reportsGetReasonsSourceDto28, reportsGetReasonsSourceDto29, reportsGetReasonsSourceDto30, reportsGetReasonsSourceDto31, reportsGetReasonsSourceDto32, reportsGetReasonsSourceDto33, reportsGetReasonsSourceDto34, reportsGetReasonsSourceDto35, reportsGetReasonsSourceDto36, reportsGetReasonsSourceDto37, reportsGetReasonsSourceDto38, reportsGetReasonsSourceDto39, reportsGetReasonsSourceDto40, reportsGetReasonsSourceDto41, reportsGetReasonsSourceDto42, reportsGetReasonsSourceDto43, reportsGetReasonsSourceDto44, reportsGetReasonsSourceDto45, reportsGetReasonsSourceDto46, reportsGetReasonsSourceDto47, reportsGetReasonsSourceDto48, reportsGetReasonsSourceDto49, reportsGetReasonsSourceDto50, reportsGetReasonsSourceDto51, reportsGetReasonsSourceDto52};
        $VALUES = reportsGetReasonsSourceDtoArr;
        $ENTRIES = new asp(reportsGetReasonsSourceDtoArr);
        CREATOR = new a();
    }

    private ReportsGetReasonsSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ReportsGetReasonsSourceDto valueOf(String str) {
        return (ReportsGetReasonsSourceDto) Enum.valueOf(ReportsGetReasonsSourceDto.class, str);
    }

    public static ReportsGetReasonsSourceDto[] values() {
        return (ReportsGetReasonsSourceDto[]) $VALUES.clone();
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
