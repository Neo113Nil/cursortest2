package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesTypeDto.kt */
/* loaded from: classes14.dex */
public final class LikesTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesTypeDto[] $VALUES;

    @pmi0("audio")
    public static final LikesTypeDto AUDIO;

    @pmi0("clip")
    public static final LikesTypeDto CLIP;

    @pmi0("comment")
    public static final LikesTypeDto COMMENT;

    @pmi0("community_review")
    public static final LikesTypeDto COMMUNITY_REVIEW;
    public static final Parcelable.Creator<LikesTypeDto> CREATOR;

    @pmi0("group_like")
    public static final LikesTypeDto GROUP_LIKE;

    @pmi0("market")
    public static final LikesTypeDto MARKET;

    @pmi0("market_comment")
    public static final LikesTypeDto MARKET_COMMENT;

    @pmi0("note")
    public static final LikesTypeDto NOTE;

    @pmi0("photo")
    public static final LikesTypeDto PHOTO;

    @pmi0("photo_comment")
    public static final LikesTypeDto PHOTO_COMMENT;

    @pmi0("post")
    public static final LikesTypeDto POST;

    @pmi0("sitepage")
    public static final LikesTypeDto SITEPAGE;

    @pmi0("story")
    public static final LikesTypeDto STORY;

    @pmi0("textpost")
    public static final LikesTypeDto TEXTPOST;

    @pmi0("topic_comment")
    public static final LikesTypeDto TOPIC_COMMENT;

    @pmi0("video")
    public static final LikesTypeDto VIDEO;

    @pmi0("video_comment")
    public static final LikesTypeDto VIDEO_COMMENT;
    private final String value;

    /* compiled from: LikesTypeDto.kt */
    public static final class a implements Parcelable.Creator<LikesTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesTypeDto createFromParcel(Parcel parcel) {
            return LikesTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesTypeDto[] newArray(int i) {
            return new LikesTypeDto[i];
        }
    }

    static {
        LikesTypeDto likesTypeDto = new LikesTypeDto("POST", 0, "post");
        POST = likesTypeDto;
        LikesTypeDto likesTypeDto2 = new LikesTypeDto("COMMENT", 1, "comment");
        COMMENT = likesTypeDto2;
        LikesTypeDto likesTypeDto3 = new LikesTypeDto("PHOTO", 2, "photo");
        PHOTO = likesTypeDto3;
        LikesTypeDto likesTypeDto4 = new LikesTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 3, "audio");
        AUDIO = likesTypeDto4;
        LikesTypeDto likesTypeDto5 = new LikesTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 4, "video");
        VIDEO = likesTypeDto5;
        LikesTypeDto likesTypeDto6 = new LikesTypeDto("NOTE", 5, "note");
        NOTE = likesTypeDto6;
        LikesTypeDto likesTypeDto7 = new LikesTypeDto("MARKET", 6, "market");
        MARKET = likesTypeDto7;
        LikesTypeDto likesTypeDto8 = new LikesTypeDto("PHOTO_COMMENT", 7, "photo_comment");
        PHOTO_COMMENT = likesTypeDto8;
        LikesTypeDto likesTypeDto9 = new LikesTypeDto("VIDEO_COMMENT", 8, "video_comment");
        VIDEO_COMMENT = likesTypeDto9;
        LikesTypeDto likesTypeDto10 = new LikesTypeDto("TOPIC_COMMENT", 9, "topic_comment");
        TOPIC_COMMENT = likesTypeDto10;
        LikesTypeDto likesTypeDto11 = new LikesTypeDto("MARKET_COMMENT", 10, "market_comment");
        MARKET_COMMENT = likesTypeDto11;
        LikesTypeDto likesTypeDto12 = new LikesTypeDto("SITEPAGE", 11, "sitepage");
        SITEPAGE = likesTypeDto12;
        LikesTypeDto likesTypeDto13 = new LikesTypeDto("TEXTPOST", 12, "textpost");
        TEXTPOST = likesTypeDto13;
        LikesTypeDto likesTypeDto14 = new LikesTypeDto("COMMUNITY_REVIEW", 13, "community_review");
        COMMUNITY_REVIEW = likesTypeDto14;
        LikesTypeDto likesTypeDto15 = new LikesTypeDto("STORY", 14, "story");
        STORY = likesTypeDto15;
        LikesTypeDto likesTypeDto16 = new LikesTypeDto("GROUP_LIKE", 15, "group_like");
        GROUP_LIKE = likesTypeDto16;
        LikesTypeDto likesTypeDto17 = new LikesTypeDto("CLIP", 16, "clip");
        CLIP = likesTypeDto17;
        LikesTypeDto[] likesTypeDtoArr = {likesTypeDto, likesTypeDto2, likesTypeDto3, likesTypeDto4, likesTypeDto5, likesTypeDto6, likesTypeDto7, likesTypeDto8, likesTypeDto9, likesTypeDto10, likesTypeDto11, likesTypeDto12, likesTypeDto13, likesTypeDto14, likesTypeDto15, likesTypeDto16, likesTypeDto17};
        $VALUES = likesTypeDtoArr;
        $ENTRIES = new asp(likesTypeDtoArr);
        CREATOR = new a();
    }

    private LikesTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<LikesTypeDto> i() {
        return $ENTRIES;
    }

    public static LikesTypeDto valueOf(String str) {
        return (LikesTypeDto) Enum.valueOf(LikesTypeDto.class, str);
    }

    public static LikesTypeDto[] values() {
        return (LikesTypeDto[]) $VALUES.clone();
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
