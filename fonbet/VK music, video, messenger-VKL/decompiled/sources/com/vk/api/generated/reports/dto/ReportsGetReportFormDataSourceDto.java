package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportsGetReportFormDataSourceDto.kt */
/* loaded from: classes15.dex */
public final class ReportsGetReportFormDataSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReportsGetReportFormDataSourceDto[] $VALUES;

    @pmi0("add_to_chat")
    public static final ReportsGetReportFormDataSourceDto ADD_TO_CHAT;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final ReportsGetReportFormDataSourceDto APP;

    @pmi0("article")
    public static final ReportsGetReportFormDataSourceDto ARTICLE;

    @pmi0("authors_marketplace_offer")
    public static final ReportsGetReportFormDataSourceDto AUTHORS_MARKETPLACE_OFFER;

    @pmi0("board_poll")
    public static final ReportsGetReportFormDataSourceDto BOARD_POLL;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    public static final ReportsGetReportFormDataSourceDto CALL;

    @pmi0("channel")
    public static final ReportsGetReportFormDataSourceDto CHANNEL;

    @pmi0("channel_comment")
    public static final ReportsGetReportFormDataSourceDto CHANNEL_COMMENT;

    @pmi0("clip")
    public static final ReportsGetReportFormDataSourceDto CLIP;

    @pmi0("clip_comment")
    public static final ReportsGetReportFormDataSourceDto CLIP_COMMENT;

    @pmi0("comment")
    public static final ReportsGetReportFormDataSourceDto COMMENT;

    @pmi0("community")
    public static final ReportsGetReportFormDataSourceDto COMMUNITY;

    @pmi0("community_channel")
    public static final ReportsGetReportFormDataSourceDto COMMUNITY_CHANNEL;

    @pmi0("community_review")
    public static final ReportsGetReportFormDataSourceDto COMMUNITY_REVIEW;
    public static final Parcelable.Creator<ReportsGetReportFormDataSourceDto> CREATOR;

    @pmi0("dialogue_not_friends")
    public static final ReportsGetReportFormDataSourceDto DIALOGUE_NOT_FRIENDS;

    @pmi0("game")
    public static final ReportsGetReportFormDataSourceDto GAME;

    @pmi0("item_review")
    public static final ReportsGetReportFormDataSourceDto ITEM_REVIEW;

    @pmi0("live_comment")
    public static final ReportsGetReportFormDataSourceDto LIVE_COMMENT;

    @pmi0("market")
    public static final ReportsGetReportFormDataSourceDto MARKET;

    @pmi0("market_comment")
    public static final ReportsGetReportFormDataSourceDto MARKET_COMMENT;

    @pmi0("message")
    public static final ReportsGetReportFormDataSourceDto MESSAGE;

    @pmi0("narrative")
    public static final ReportsGetReportFormDataSourceDto NARRATIVE;

    @pmi0("nft")
    public static final ReportsGetReportFormDataSourceDto NFT;

    @pmi0("note")
    public static final ReportsGetReportFormDataSourceDto NOTE;

    @pmi0("photo")
    public static final ReportsGetReportFormDataSourceDto PHOTO;

    @pmi0("photo_comment")
    public static final ReportsGetReportFormDataSourceDto PHOTO_COMMENT;

    @pmi0("poll")
    public static final ReportsGetReportFormDataSourceDto POLL;

    @pmi0("post")
    public static final ReportsGetReportFormDataSourceDto POST;

    @pmi0("profile_story_question")
    public static final ReportsGetReportFormDataSourceDto PROFILE_STORY_QUESTION;

    @pmi0("situational_post")
    public static final ReportsGetReportFormDataSourceDto SITUATIONAL_POST;

    @pmi0("story")
    public static final ReportsGetReportFormDataSourceDto STORY;

    @pmi0("story_question")
    public static final ReportsGetReportFormDataSourceDto STORY_QUESTION;

    @pmi0("textlive")
    public static final ReportsGetReportFormDataSourceDto TEXTLIVE;

    @pmi0("textpost")
    public static final ReportsGetReportFormDataSourceDto TEXTPOST;

    @pmi0("topic_comment")
    public static final ReportsGetReportFormDataSourceDto TOPIC_COMMENT;

    @pmi0("ugc_sticker")
    public static final ReportsGetReportFormDataSourceDto UGC_STICKER;

    @pmi0("ugc_sticker_pack")
    public static final ReportsGetReportFormDataSourceDto UGC_STICKER_PACK;

    @pmi0("user")
    public static final ReportsGetReportFormDataSourceDto USER;

    @pmi0("user_channel_comment")
    public static final ReportsGetReportFormDataSourceDto USER_CHANNEL_COMMENT;

    @pmi0("user_channel_post")
    public static final ReportsGetReportFormDataSourceDto USER_CHANNEL_POST;

    @pmi0("video")
    public static final ReportsGetReportFormDataSourceDto VIDEO;

    @pmi0("video_comment")
    public static final ReportsGetReportFormDataSourceDto VIDEO_COMMENT;

    @pmi0("vkpl_stream")
    public static final ReportsGetReportFormDataSourceDto VKPL_STREAM;

    @pmi0("wall")
    public static final ReportsGetReportFormDataSourceDto WALL;

    @pmi0("wall_comment")
    public static final ReportsGetReportFormDataSourceDto WALL_COMMENT;
    private final String value;

    /* compiled from: ReportsGetReportFormDataSourceDto.kt */
    public static final class a implements Parcelable.Creator<ReportsGetReportFormDataSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsGetReportFormDataSourceDto createFromParcel(Parcel parcel) {
            return ReportsGetReportFormDataSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsGetReportFormDataSourceDto[] newArray(int i) {
            return new ReportsGetReportFormDataSourceDto[i];
        }
    }

    static {
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto = new ReportsGetReportFormDataSourceDto("ADD_TO_CHAT", 0, "add_to_chat");
        ADD_TO_CHAT = reportsGetReportFormDataSourceDto;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto2 = new ReportsGetReportFormDataSourceDto("APP", 1, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = reportsGetReportFormDataSourceDto2;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto3 = new ReportsGetReportFormDataSourceDto("ARTICLE", 2, "article");
        ARTICLE = reportsGetReportFormDataSourceDto3;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto4 = new ReportsGetReportFormDataSourceDto("AUTHORS_MARKETPLACE_OFFER", 3, "authors_marketplace_offer");
        AUTHORS_MARKETPLACE_OFFER = reportsGetReportFormDataSourceDto4;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto5 = new ReportsGetReportFormDataSourceDto("BOARD_POLL", 4, "board_poll");
        BOARD_POLL = reportsGetReportFormDataSourceDto5;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto6 = new ReportsGetReportFormDataSourceDto("CALL", 5, NotificationCompat.CATEGORY_CALL);
        CALL = reportsGetReportFormDataSourceDto6;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto7 = new ReportsGetReportFormDataSourceDto("CHANNEL", 6, "channel");
        CHANNEL = reportsGetReportFormDataSourceDto7;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto8 = new ReportsGetReportFormDataSourceDto("CHANNEL_COMMENT", 7, "channel_comment");
        CHANNEL_COMMENT = reportsGetReportFormDataSourceDto8;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto9 = new ReportsGetReportFormDataSourceDto("CLIP", 8, "clip");
        CLIP = reportsGetReportFormDataSourceDto9;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto10 = new ReportsGetReportFormDataSourceDto("CLIP_COMMENT", 9, "clip_comment");
        CLIP_COMMENT = reportsGetReportFormDataSourceDto10;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto11 = new ReportsGetReportFormDataSourceDto("COMMENT", 10, "comment");
        COMMENT = reportsGetReportFormDataSourceDto11;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto12 = new ReportsGetReportFormDataSourceDto("COMMUNITY", 11, "community");
        COMMUNITY = reportsGetReportFormDataSourceDto12;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto13 = new ReportsGetReportFormDataSourceDto("COMMUNITY_CHANNEL", 12, "community_channel");
        COMMUNITY_CHANNEL = reportsGetReportFormDataSourceDto13;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto14 = new ReportsGetReportFormDataSourceDto("COMMUNITY_REVIEW", 13, "community_review");
        COMMUNITY_REVIEW = reportsGetReportFormDataSourceDto14;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto15 = new ReportsGetReportFormDataSourceDto("DIALOGUE_NOT_FRIENDS", 14, "dialogue_not_friends");
        DIALOGUE_NOT_FRIENDS = reportsGetReportFormDataSourceDto15;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto16 = new ReportsGetReportFormDataSourceDto("GAME", 15, "game");
        GAME = reportsGetReportFormDataSourceDto16;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto17 = new ReportsGetReportFormDataSourceDto("ITEM_REVIEW", 16, "item_review");
        ITEM_REVIEW = reportsGetReportFormDataSourceDto17;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto18 = new ReportsGetReportFormDataSourceDto("LIVE_COMMENT", 17, "live_comment");
        LIVE_COMMENT = reportsGetReportFormDataSourceDto18;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto19 = new ReportsGetReportFormDataSourceDto("MARKET", 18, "market");
        MARKET = reportsGetReportFormDataSourceDto19;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto20 = new ReportsGetReportFormDataSourceDto("MARKET_COMMENT", 19, "market_comment");
        MARKET_COMMENT = reportsGetReportFormDataSourceDto20;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto21 = new ReportsGetReportFormDataSourceDto("MESSAGE", 20, "message");
        MESSAGE = reportsGetReportFormDataSourceDto21;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto22 = new ReportsGetReportFormDataSourceDto("NARRATIVE", 21, "narrative");
        NARRATIVE = reportsGetReportFormDataSourceDto22;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto23 = new ReportsGetReportFormDataSourceDto("NFT", 22, "nft");
        NFT = reportsGetReportFormDataSourceDto23;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto24 = new ReportsGetReportFormDataSourceDto("NOTE", 23, "note");
        NOTE = reportsGetReportFormDataSourceDto24;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto25 = new ReportsGetReportFormDataSourceDto("PHOTO", 24, "photo");
        PHOTO = reportsGetReportFormDataSourceDto25;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto26 = new ReportsGetReportFormDataSourceDto("PHOTO_COMMENT", 25, "photo_comment");
        PHOTO_COMMENT = reportsGetReportFormDataSourceDto26;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto27 = new ReportsGetReportFormDataSourceDto("POLL", 26, "poll");
        POLL = reportsGetReportFormDataSourceDto27;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto28 = new ReportsGetReportFormDataSourceDto("POST", 27, "post");
        POST = reportsGetReportFormDataSourceDto28;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto29 = new ReportsGetReportFormDataSourceDto("PROFILE_STORY_QUESTION", 28, "profile_story_question");
        PROFILE_STORY_QUESTION = reportsGetReportFormDataSourceDto29;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto30 = new ReportsGetReportFormDataSourceDto("SITUATIONAL_POST", 29, "situational_post");
        SITUATIONAL_POST = reportsGetReportFormDataSourceDto30;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto31 = new ReportsGetReportFormDataSourceDto("STORY", 30, "story");
        STORY = reportsGetReportFormDataSourceDto31;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto32 = new ReportsGetReportFormDataSourceDto("STORY_QUESTION", 31, "story_question");
        STORY_QUESTION = reportsGetReportFormDataSourceDto32;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto33 = new ReportsGetReportFormDataSourceDto("TEXTLIVE", 32, "textlive");
        TEXTLIVE = reportsGetReportFormDataSourceDto33;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto34 = new ReportsGetReportFormDataSourceDto("TEXTPOST", 33, "textpost");
        TEXTPOST = reportsGetReportFormDataSourceDto34;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto35 = new ReportsGetReportFormDataSourceDto("TOPIC_COMMENT", 34, "topic_comment");
        TOPIC_COMMENT = reportsGetReportFormDataSourceDto35;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto36 = new ReportsGetReportFormDataSourceDto("UGC_STICKER", 35, "ugc_sticker");
        UGC_STICKER = reportsGetReportFormDataSourceDto36;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto37 = new ReportsGetReportFormDataSourceDto("UGC_STICKER_PACK", 36, "ugc_sticker_pack");
        UGC_STICKER_PACK = reportsGetReportFormDataSourceDto37;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto38 = new ReportsGetReportFormDataSourceDto("USER", 37, "user");
        USER = reportsGetReportFormDataSourceDto38;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto39 = new ReportsGetReportFormDataSourceDto("USER_CHANNEL_COMMENT", 38, "user_channel_comment");
        USER_CHANNEL_COMMENT = reportsGetReportFormDataSourceDto39;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto40 = new ReportsGetReportFormDataSourceDto("USER_CHANNEL_POST", 39, "user_channel_post");
        USER_CHANNEL_POST = reportsGetReportFormDataSourceDto40;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto41 = new ReportsGetReportFormDataSourceDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 40, "video");
        VIDEO = reportsGetReportFormDataSourceDto41;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto42 = new ReportsGetReportFormDataSourceDto("VIDEO_COMMENT", 41, "video_comment");
        VIDEO_COMMENT = reportsGetReportFormDataSourceDto42;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto43 = new ReportsGetReportFormDataSourceDto("VKPL_STREAM", 42, "vkpl_stream");
        VKPL_STREAM = reportsGetReportFormDataSourceDto43;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto44 = new ReportsGetReportFormDataSourceDto("WALL", 43, "wall");
        WALL = reportsGetReportFormDataSourceDto44;
        ReportsGetReportFormDataSourceDto reportsGetReportFormDataSourceDto45 = new ReportsGetReportFormDataSourceDto("WALL_COMMENT", 44, "wall_comment");
        WALL_COMMENT = reportsGetReportFormDataSourceDto45;
        ReportsGetReportFormDataSourceDto[] reportsGetReportFormDataSourceDtoArr = {reportsGetReportFormDataSourceDto, reportsGetReportFormDataSourceDto2, reportsGetReportFormDataSourceDto3, reportsGetReportFormDataSourceDto4, reportsGetReportFormDataSourceDto5, reportsGetReportFormDataSourceDto6, reportsGetReportFormDataSourceDto7, reportsGetReportFormDataSourceDto8, reportsGetReportFormDataSourceDto9, reportsGetReportFormDataSourceDto10, reportsGetReportFormDataSourceDto11, reportsGetReportFormDataSourceDto12, reportsGetReportFormDataSourceDto13, reportsGetReportFormDataSourceDto14, reportsGetReportFormDataSourceDto15, reportsGetReportFormDataSourceDto16, reportsGetReportFormDataSourceDto17, reportsGetReportFormDataSourceDto18, reportsGetReportFormDataSourceDto19, reportsGetReportFormDataSourceDto20, reportsGetReportFormDataSourceDto21, reportsGetReportFormDataSourceDto22, reportsGetReportFormDataSourceDto23, reportsGetReportFormDataSourceDto24, reportsGetReportFormDataSourceDto25, reportsGetReportFormDataSourceDto26, reportsGetReportFormDataSourceDto27, reportsGetReportFormDataSourceDto28, reportsGetReportFormDataSourceDto29, reportsGetReportFormDataSourceDto30, reportsGetReportFormDataSourceDto31, reportsGetReportFormDataSourceDto32, reportsGetReportFormDataSourceDto33, reportsGetReportFormDataSourceDto34, reportsGetReportFormDataSourceDto35, reportsGetReportFormDataSourceDto36, reportsGetReportFormDataSourceDto37, reportsGetReportFormDataSourceDto38, reportsGetReportFormDataSourceDto39, reportsGetReportFormDataSourceDto40, reportsGetReportFormDataSourceDto41, reportsGetReportFormDataSourceDto42, reportsGetReportFormDataSourceDto43, reportsGetReportFormDataSourceDto44, reportsGetReportFormDataSourceDto45};
        $VALUES = reportsGetReportFormDataSourceDtoArr;
        $ENTRIES = new asp(reportsGetReportFormDataSourceDtoArr);
        CREATOR = new a();
    }

    private ReportsGetReportFormDataSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ReportsGetReportFormDataSourceDto valueOf(String str) {
        return (ReportsGetReportFormDataSourceDto) Enum.valueOf(ReportsGetReportFormDataSourceDto.class, str);
    }

    public static ReportsGetReportFormDataSourceDto[] values() {
        return (ReportsGetReportFormDataSourceDto[]) $VALUES.clone();
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
