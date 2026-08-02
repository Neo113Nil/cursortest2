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
/* compiled from: ReportsAddTypeDto.kt */
/* loaded from: classes15.dex */
public final class ReportsAddTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReportsAddTypeDto[] $VALUES;

    @pmi0("ad")
    public static final ReportsAddTypeDto AD;

    @pmi0("add_to_chat")
    public static final ReportsAddTypeDto ADD_TO_CHAT;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final ReportsAddTypeDto APP;

    @pmi0("app_invite")
    public static final ReportsAddTypeDto APP_INVITE;

    @pmi0("article")
    public static final ReportsAddTypeDto ARTICLE;

    @pmi0("authors_marketplace_offer")
    public static final ReportsAddTypeDto AUTHORS_MARKETPLACE_OFFER;

    @pmi0("board_poll")
    public static final ReportsAddTypeDto BOARD_POLL;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    public static final ReportsAddTypeDto CALL;

    @pmi0("channel")
    public static final ReportsAddTypeDto CHANNEL;

    @pmi0("channel_comment")
    public static final ReportsAddTypeDto CHANNEL_COMMENT;

    @pmi0("chat")
    public static final ReportsAddTypeDto CHAT;

    @pmi0("clip")
    public static final ReportsAddTypeDto CLIP;

    @pmi0("clip_comment")
    public static final ReportsAddTypeDto CLIP_COMMENT;

    @pmi0("comment")
    public static final ReportsAddTypeDto COMMENT;

    @pmi0("community")
    public static final ReportsAddTypeDto COMMUNITY;

    @pmi0("community_channel")
    public static final ReportsAddTypeDto COMMUNITY_CHANNEL;

    @pmi0("community_review")
    public static final ReportsAddTypeDto COMMUNITY_REVIEW;
    public static final Parcelable.Creator<ReportsAddTypeDto> CREATOR;

    @pmi0("dialogue")
    public static final ReportsAddTypeDto DIALOGUE;

    @pmi0("dialogue_not_friends")
    public static final ReportsAddTypeDto DIALOGUE_NOT_FRIENDS;

    @pmi0("friend_request")
    public static final ReportsAddTypeDto FRIEND_REQUEST;

    @pmi0("game")
    public static final ReportsAddTypeDto GAME;

    @pmi0("group_invite")
    public static final ReportsAddTypeDto GROUP_INVITE;

    @pmi0("item_review")
    public static final ReportsAddTypeDto ITEM_REVIEW;

    @pmi0("live_comment")
    public static final ReportsAddTypeDto LIVE_COMMENT;

    @pmi0("market")
    public static final ReportsAddTypeDto MARKET;

    @pmi0("market_comment")
    public static final ReportsAddTypeDto MARKET_COMMENT;

    @pmi0("message")
    public static final ReportsAddTypeDto MESSAGE;

    @pmi0("message_request")
    public static final ReportsAddTypeDto MESSAGE_REQUEST;

    @pmi0("narrative")
    public static final ReportsAddTypeDto NARRATIVE;

    @pmi0("nft")
    public static final ReportsAddTypeDto NFT;

    @pmi0("note")
    public static final ReportsAddTypeDto NOTE;

    @pmi0("photo")
    public static final ReportsAddTypeDto PHOTO;

    @pmi0("photo_comment")
    public static final ReportsAddTypeDto PHOTO_COMMENT;

    @pmi0("poll")
    public static final ReportsAddTypeDto POLL;

    @pmi0("post")
    public static final ReportsAddTypeDto POST;

    @pmi0("profile_story_question")
    public static final ReportsAddTypeDto PROFILE_STORY_QUESTION;

    @pmi0("situational_post")
    public static final ReportsAddTypeDto SITUATIONAL_POST;

    @pmi0("story")
    public static final ReportsAddTypeDto STORY;

    @pmi0("story_question")
    public static final ReportsAddTypeDto STORY_QUESTION;

    @pmi0("textlive")
    public static final ReportsAddTypeDto TEXTLIVE;

    @pmi0("textpost")
    public static final ReportsAddTypeDto TEXTPOST;

    @pmi0("topic_comment")
    public static final ReportsAddTypeDto TOPIC_COMMENT;

    @pmi0("ugc_sticker")
    public static final ReportsAddTypeDto UGC_STICKER;

    @pmi0("ugc_sticker_pack")
    public static final ReportsAddTypeDto UGC_STICKER_PACK;

    @pmi0("user")
    public static final ReportsAddTypeDto USER;

    @pmi0("user_channel_comment")
    public static final ReportsAddTypeDto USER_CHANNEL_COMMENT;

    @pmi0("user_channel_post")
    public static final ReportsAddTypeDto USER_CHANNEL_POST;

    @pmi0("video")
    public static final ReportsAddTypeDto VIDEO;

    @pmi0("video_comment")
    public static final ReportsAddTypeDto VIDEO_COMMENT;

    @pmi0("vkpl_stream")
    public static final ReportsAddTypeDto VKPL_STREAM;

    @pmi0("wall")
    public static final ReportsAddTypeDto WALL;

    @pmi0("wall_comment")
    public static final ReportsAddTypeDto WALL_COMMENT;
    private final String value;

    /* compiled from: ReportsAddTypeDto.kt */
    public static final class a implements Parcelable.Creator<ReportsAddTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsAddTypeDto createFromParcel(Parcel parcel) {
            return ReportsAddTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsAddTypeDto[] newArray(int i) {
            return new ReportsAddTypeDto[i];
        }
    }

    static {
        ReportsAddTypeDto reportsAddTypeDto = new ReportsAddTypeDto("AD", 0, "ad");
        AD = reportsAddTypeDto;
        ReportsAddTypeDto reportsAddTypeDto2 = new ReportsAddTypeDto("ADD_TO_CHAT", 1, "add_to_chat");
        ADD_TO_CHAT = reportsAddTypeDto2;
        ReportsAddTypeDto reportsAddTypeDto3 = new ReportsAddTypeDto("APP", 2, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = reportsAddTypeDto3;
        ReportsAddTypeDto reportsAddTypeDto4 = new ReportsAddTypeDto(OkScope.APP_INVITE, 3, "app_invite");
        APP_INVITE = reportsAddTypeDto4;
        ReportsAddTypeDto reportsAddTypeDto5 = new ReportsAddTypeDto("ARTICLE", 4, "article");
        ARTICLE = reportsAddTypeDto5;
        ReportsAddTypeDto reportsAddTypeDto6 = new ReportsAddTypeDto("AUTHORS_MARKETPLACE_OFFER", 5, "authors_marketplace_offer");
        AUTHORS_MARKETPLACE_OFFER = reportsAddTypeDto6;
        ReportsAddTypeDto reportsAddTypeDto7 = new ReportsAddTypeDto("BOARD_POLL", 6, "board_poll");
        BOARD_POLL = reportsAddTypeDto7;
        ReportsAddTypeDto reportsAddTypeDto8 = new ReportsAddTypeDto("CALL", 7, NotificationCompat.CATEGORY_CALL);
        CALL = reportsAddTypeDto8;
        ReportsAddTypeDto reportsAddTypeDto9 = new ReportsAddTypeDto("CHAT", 8, "chat");
        CHAT = reportsAddTypeDto9;
        ReportsAddTypeDto reportsAddTypeDto10 = new ReportsAddTypeDto("CHANNEL", 9, "channel");
        CHANNEL = reportsAddTypeDto10;
        ReportsAddTypeDto reportsAddTypeDto11 = new ReportsAddTypeDto("CHANNEL_COMMENT", 10, "channel_comment");
        CHANNEL_COMMENT = reportsAddTypeDto11;
        ReportsAddTypeDto reportsAddTypeDto12 = new ReportsAddTypeDto("CLIP", 11, "clip");
        CLIP = reportsAddTypeDto12;
        ReportsAddTypeDto reportsAddTypeDto13 = new ReportsAddTypeDto("CLIP_COMMENT", 12, "clip_comment");
        CLIP_COMMENT = reportsAddTypeDto13;
        ReportsAddTypeDto reportsAddTypeDto14 = new ReportsAddTypeDto("COMMENT", 13, "comment");
        COMMENT = reportsAddTypeDto14;
        ReportsAddTypeDto reportsAddTypeDto15 = new ReportsAddTypeDto("COMMUNITY", 14, "community");
        COMMUNITY = reportsAddTypeDto15;
        ReportsAddTypeDto reportsAddTypeDto16 = new ReportsAddTypeDto("COMMUNITY_CHANNEL", 15, "community_channel");
        COMMUNITY_CHANNEL = reportsAddTypeDto16;
        ReportsAddTypeDto reportsAddTypeDto17 = new ReportsAddTypeDto("COMMUNITY_REVIEW", 16, "community_review");
        COMMUNITY_REVIEW = reportsAddTypeDto17;
        ReportsAddTypeDto reportsAddTypeDto18 = new ReportsAddTypeDto("DIALOGUE", 17, "dialogue");
        DIALOGUE = reportsAddTypeDto18;
        ReportsAddTypeDto reportsAddTypeDto19 = new ReportsAddTypeDto("DIALOGUE_NOT_FRIENDS", 18, "dialogue_not_friends");
        DIALOGUE_NOT_FRIENDS = reportsAddTypeDto19;
        ReportsAddTypeDto reportsAddTypeDto20 = new ReportsAddTypeDto("FRIEND_REQUEST", 19, "friend_request");
        FRIEND_REQUEST = reportsAddTypeDto20;
        ReportsAddTypeDto reportsAddTypeDto21 = new ReportsAddTypeDto("GAME", 20, "game");
        GAME = reportsAddTypeDto21;
        ReportsAddTypeDto reportsAddTypeDto22 = new ReportsAddTypeDto("GROUP_INVITE", 21, "group_invite");
        GROUP_INVITE = reportsAddTypeDto22;
        ReportsAddTypeDto reportsAddTypeDto23 = new ReportsAddTypeDto("ITEM_REVIEW", 22, "item_review");
        ITEM_REVIEW = reportsAddTypeDto23;
        ReportsAddTypeDto reportsAddTypeDto24 = new ReportsAddTypeDto("LIVE_COMMENT", 23, "live_comment");
        LIVE_COMMENT = reportsAddTypeDto24;
        ReportsAddTypeDto reportsAddTypeDto25 = new ReportsAddTypeDto("MARKET", 24, "market");
        MARKET = reportsAddTypeDto25;
        ReportsAddTypeDto reportsAddTypeDto26 = new ReportsAddTypeDto("MARKET_COMMENT", 25, "market_comment");
        MARKET_COMMENT = reportsAddTypeDto26;
        ReportsAddTypeDto reportsAddTypeDto27 = new ReportsAddTypeDto("MESSAGE", 26, "message");
        MESSAGE = reportsAddTypeDto27;
        ReportsAddTypeDto reportsAddTypeDto28 = new ReportsAddTypeDto("MESSAGE_REQUEST", 27, "message_request");
        MESSAGE_REQUEST = reportsAddTypeDto28;
        ReportsAddTypeDto reportsAddTypeDto29 = new ReportsAddTypeDto("NARRATIVE", 28, "narrative");
        NARRATIVE = reportsAddTypeDto29;
        ReportsAddTypeDto reportsAddTypeDto30 = new ReportsAddTypeDto("NFT", 29, "nft");
        NFT = reportsAddTypeDto30;
        ReportsAddTypeDto reportsAddTypeDto31 = new ReportsAddTypeDto("NOTE", 30, "note");
        NOTE = reportsAddTypeDto31;
        ReportsAddTypeDto reportsAddTypeDto32 = new ReportsAddTypeDto("PHOTO", 31, "photo");
        PHOTO = reportsAddTypeDto32;
        ReportsAddTypeDto reportsAddTypeDto33 = new ReportsAddTypeDto("PHOTO_COMMENT", 32, "photo_comment");
        PHOTO_COMMENT = reportsAddTypeDto33;
        ReportsAddTypeDto reportsAddTypeDto34 = new ReportsAddTypeDto("POLL", 33, "poll");
        POLL = reportsAddTypeDto34;
        ReportsAddTypeDto reportsAddTypeDto35 = new ReportsAddTypeDto("POST", 34, "post");
        POST = reportsAddTypeDto35;
        ReportsAddTypeDto reportsAddTypeDto36 = new ReportsAddTypeDto("PROFILE_STORY_QUESTION", 35, "profile_story_question");
        PROFILE_STORY_QUESTION = reportsAddTypeDto36;
        ReportsAddTypeDto reportsAddTypeDto37 = new ReportsAddTypeDto("SITUATIONAL_POST", 36, "situational_post");
        SITUATIONAL_POST = reportsAddTypeDto37;
        ReportsAddTypeDto reportsAddTypeDto38 = new ReportsAddTypeDto("STORY", 37, "story");
        STORY = reportsAddTypeDto38;
        ReportsAddTypeDto reportsAddTypeDto39 = new ReportsAddTypeDto("STORY_QUESTION", 38, "story_question");
        STORY_QUESTION = reportsAddTypeDto39;
        ReportsAddTypeDto reportsAddTypeDto40 = new ReportsAddTypeDto("TEXTLIVE", 39, "textlive");
        TEXTLIVE = reportsAddTypeDto40;
        ReportsAddTypeDto reportsAddTypeDto41 = new ReportsAddTypeDto("TEXTPOST", 40, "textpost");
        TEXTPOST = reportsAddTypeDto41;
        ReportsAddTypeDto reportsAddTypeDto42 = new ReportsAddTypeDto("TOPIC_COMMENT", 41, "topic_comment");
        TOPIC_COMMENT = reportsAddTypeDto42;
        ReportsAddTypeDto reportsAddTypeDto43 = new ReportsAddTypeDto("UGC_STICKER", 42, "ugc_sticker");
        UGC_STICKER = reportsAddTypeDto43;
        ReportsAddTypeDto reportsAddTypeDto44 = new ReportsAddTypeDto("UGC_STICKER_PACK", 43, "ugc_sticker_pack");
        UGC_STICKER_PACK = reportsAddTypeDto44;
        ReportsAddTypeDto reportsAddTypeDto45 = new ReportsAddTypeDto("USER", 44, "user");
        USER = reportsAddTypeDto45;
        ReportsAddTypeDto reportsAddTypeDto46 = new ReportsAddTypeDto("USER_CHANNEL_COMMENT", 45, "user_channel_comment");
        USER_CHANNEL_COMMENT = reportsAddTypeDto46;
        ReportsAddTypeDto reportsAddTypeDto47 = new ReportsAddTypeDto("USER_CHANNEL_POST", 46, "user_channel_post");
        USER_CHANNEL_POST = reportsAddTypeDto47;
        ReportsAddTypeDto reportsAddTypeDto48 = new ReportsAddTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 47, "video");
        VIDEO = reportsAddTypeDto48;
        ReportsAddTypeDto reportsAddTypeDto49 = new ReportsAddTypeDto("VIDEO_COMMENT", 48, "video_comment");
        VIDEO_COMMENT = reportsAddTypeDto49;
        ReportsAddTypeDto reportsAddTypeDto50 = new ReportsAddTypeDto("WALL", 49, "wall");
        WALL = reportsAddTypeDto50;
        ReportsAddTypeDto reportsAddTypeDto51 = new ReportsAddTypeDto("WALL_COMMENT", 50, "wall_comment");
        WALL_COMMENT = reportsAddTypeDto51;
        ReportsAddTypeDto reportsAddTypeDto52 = new ReportsAddTypeDto("VKPL_STREAM", 51, "vkpl_stream");
        VKPL_STREAM = reportsAddTypeDto52;
        ReportsAddTypeDto[] reportsAddTypeDtoArr = {reportsAddTypeDto, reportsAddTypeDto2, reportsAddTypeDto3, reportsAddTypeDto4, reportsAddTypeDto5, reportsAddTypeDto6, reportsAddTypeDto7, reportsAddTypeDto8, reportsAddTypeDto9, reportsAddTypeDto10, reportsAddTypeDto11, reportsAddTypeDto12, reportsAddTypeDto13, reportsAddTypeDto14, reportsAddTypeDto15, reportsAddTypeDto16, reportsAddTypeDto17, reportsAddTypeDto18, reportsAddTypeDto19, reportsAddTypeDto20, reportsAddTypeDto21, reportsAddTypeDto22, reportsAddTypeDto23, reportsAddTypeDto24, reportsAddTypeDto25, reportsAddTypeDto26, reportsAddTypeDto27, reportsAddTypeDto28, reportsAddTypeDto29, reportsAddTypeDto30, reportsAddTypeDto31, reportsAddTypeDto32, reportsAddTypeDto33, reportsAddTypeDto34, reportsAddTypeDto35, reportsAddTypeDto36, reportsAddTypeDto37, reportsAddTypeDto38, reportsAddTypeDto39, reportsAddTypeDto40, reportsAddTypeDto41, reportsAddTypeDto42, reportsAddTypeDto43, reportsAddTypeDto44, reportsAddTypeDto45, reportsAddTypeDto46, reportsAddTypeDto47, reportsAddTypeDto48, reportsAddTypeDto49, reportsAddTypeDto50, reportsAddTypeDto51, reportsAddTypeDto52};
        $VALUES = reportsAddTypeDtoArr;
        $ENTRIES = new asp(reportsAddTypeDtoArr);
        CREATOR = new a();
    }

    private ReportsAddTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<ReportsAddTypeDto> i() {
        return $ENTRIES;
    }

    public static ReportsAddTypeDto valueOf(String str) {
        return (ReportsAddTypeDto) Enum.valueOf(ReportsAddTypeDto.class, str);
    }

    public static ReportsAddTypeDto[] values() {
        return (ReportsAddTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
