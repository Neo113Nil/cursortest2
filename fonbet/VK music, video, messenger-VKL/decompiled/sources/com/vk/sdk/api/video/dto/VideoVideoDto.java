package com.vk.sdk.api.video.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.audio.dto.AudioArtistDto;
import com.vk.sdk.api.audio.dto.AudioGenreDto;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseLikesDto;
import com.vk.sdk.api.base.dto.BasePropertyExistsDto;
import com.vk.sdk.api.base.dto.BaseRepostsInfoDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.epx;
import xsna.kr;
import xsna.l4;
import xsna.mq;
import xsna.pmi0;
import xsna.sq;
import xsna.to;
import xsna.vq;
import xsna.vr;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoVideoDto.kt */
/* loaded from: classes5.dex */
public final class VideoVideoDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("added")
    private final BaseBoolIntDto added;

    @pmi0("adding_date")
    private final Integer addingDate;

    @pmi0("balance")
    private final Integer balance;

    @pmi0("can_add")
    private final BaseBoolIntDto canAdd;

    @pmi0("can_add_to_faves")
    private final BaseBoolIntDto canAddToFaves;

    @pmi0("can_attach_link")
    private final BaseBoolIntDto canAttachLink;

    @pmi0("can_comment")
    private final BaseBoolIntDto canComment;

    @pmi0("can_delete")
    private final BaseBoolIntDto canDelete;

    @pmi0("can_edit")
    private final BaseBoolIntDto canEdit;

    @pmi0("can_edit_privacy")
    private final BaseBoolIntDto canEditPrivacy;

    @pmi0("can_like")
    private final BaseBoolIntDto canLike;

    @pmi0("can_repost")
    private final Integer canRepost;

    @pmi0("can_subscribe")
    private final BaseBoolIntDto canSubscribe;

    @pmi0("comments")
    private final Integer comments;

    @pmi0("content_restricted")
    private final Integer contentRestricted;

    @pmi0("content_restricted_message")
    private final String contentRestrictedMessage;

    @pmi0("converting")
    private final BaseBoolIntDto converting;

    @pmi0("date")
    private final Integer date;

    @pmi0("description")
    private final String description;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("featured_artists")
    private final List<AudioArtistDto> featuredArtists;

    @pmi0("first_frame")
    private final List<VideoVideoImageDto> firstFrame;

    @pmi0("genres")
    private final List<AudioGenreDto> genres;

    @pmi0("height")
    private final Integer height;

    @pmi0("id")
    private final Integer id;

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("is_explicit")
    private final BaseBoolIntDto isExplicit;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_private")
    private final BaseBoolIntDto isPrivate;

    @pmi0("is_subscribed")
    private final BaseBoolIntDto isSubscribed;

    @pmi0("likes")
    private final BaseLikesDto likes;

    @pmi0("live")
    private final BasePropertyExistsDto live;

    @pmi0("live_notify")
    private final BaseBoolIntDto liveNotify;

    @pmi0("live_start_time")
    private final Integer liveStartTime;

    @pmi0("local_views")
    private final Integer localViews;

    @pmi0("main_artists")
    private final List<AudioArtistDto> mainArtists;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("platform")
    private final String platform;

    @pmi0("player")
    private final String player;

    @pmi0("processing")
    private final BasePropertyExistsDto processing;

    @pmi0("release_date")
    private final Integer releaseDate;

    @pmi0("repeat")
    private final BasePropertyExistsDto repeat;

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE)
    private final ResponseTypeDto responseType;

    @pmi0("spectators")
    private final Integer spectators;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("upcoming")
    private final BasePropertyExistsDto upcoming;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("views")
    private final Integer views;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoVideoDto.kt */
    public static final class ResponseTypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResponseTypeDto[] $VALUES;

        @pmi0("full")
        public static final ResponseTypeDto FULL;

        @pmi0(UcumUtils.UCUM_MINUTES)
        public static final ResponseTypeDto MIN;
        private final String value;

        static {
            ResponseTypeDto responseTypeDto = new ResponseTypeDto("MIN", 0, UcumUtils.UCUM_MINUTES);
            MIN = responseTypeDto;
            ResponseTypeDto responseTypeDto2 = new ResponseTypeDto("FULL", 1, "full");
            FULL = responseTypeDto2;
            ResponseTypeDto[] responseTypeDtoArr = {responseTypeDto, responseTypeDto2};
            $VALUES = responseTypeDtoArr;
            $ENTRIES = new asp(responseTypeDtoArr);
        }

        private ResponseTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ResponseTypeDto valueOf(String str) {
            return (ResponseTypeDto) Enum.valueOf(ResponseTypeDto.class, str);
        }

        public static ResponseTypeDto[] values() {
            return (ResponseTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoVideoDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("live")
        public static final TypeDto LIVE;

        @pmi0("movie")
        public static final TypeDto MOVIE;

        @pmi0("music_video")
        public static final TypeDto MUSIC_VIDEO;

        @pmi0("short_video")
        public static final TypeDto SHORT_VIDEO;

        @pmi0("video")
        public static final TypeDto VIDEO;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
            VIDEO = typeDto;
            TypeDto typeDto2 = new TypeDto("MUSIC_VIDEO", 1, "music_video");
            MUSIC_VIDEO = typeDto2;
            TypeDto typeDto3 = new TypeDto(SignalingProtocol.KEY_STREAM_TYPE_MOVIE, 2, "movie");
            MOVIE = typeDto3;
            TypeDto typeDto4 = new TypeDto("LIVE", 3, "live");
            LIVE = typeDto4;
            TypeDto typeDto5 = new TypeDto("SHORT_VIDEO", 4, "short_video");
            SHORT_VIDEO = typeDto5;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    public VideoVideoDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4194303, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoDto)) {
            return false;
        }
        VideoVideoDto videoVideoDto = (VideoVideoDto) obj;
        return this.responseType == videoVideoDto.responseType && epx.f(this.accessKey, videoVideoDto.accessKey) && epx.f(this.addingDate, videoVideoDto.addingDate) && this.canComment == videoVideoDto.canComment && this.canEdit == videoVideoDto.canEdit && this.canDelete == videoVideoDto.canDelete && this.canLike == videoVideoDto.canLike && epx.f(this.canRepost, videoVideoDto.canRepost) && this.canSubscribe == videoVideoDto.canSubscribe && this.canAddToFaves == videoVideoDto.canAddToFaves && this.canAdd == videoVideoDto.canAdd && this.canAttachLink == videoVideoDto.canAttachLink && this.canEditPrivacy == videoVideoDto.canEditPrivacy && this.isPrivate == videoVideoDto.isPrivate && epx.f(this.comments, videoVideoDto.comments) && epx.f(this.date, videoVideoDto.date) && epx.f(this.description, videoVideoDto.description) && epx.f(this.duration, videoVideoDto.duration) && epx.f(this.image, videoVideoDto.image) && epx.f(this.firstFrame, videoVideoDto.firstFrame) && epx.f(this.width, videoVideoDto.width) && epx.f(this.height, videoVideoDto.height) && epx.f(this.id, videoVideoDto.id) && epx.f(this.ownerId, videoVideoDto.ownerId) && epx.f(this.userId, videoVideoDto.userId) && epx.f(this.title, videoVideoDto.title) && epx.f(this.isFavorite, videoVideoDto.isFavorite) && epx.f(this.player, videoVideoDto.player) && this.processing == videoVideoDto.processing && this.converting == videoVideoDto.converting && this.added == videoVideoDto.added && this.isSubscribed == videoVideoDto.isSubscribed && epx.f(this.trackCode, videoVideoDto.trackCode) && this.repeat == videoVideoDto.repeat && this.type == videoVideoDto.type && epx.f(this.views, videoVideoDto.views) && epx.f(this.localViews, videoVideoDto.localViews) && epx.f(this.contentRestricted, videoVideoDto.contentRestricted) && epx.f(this.contentRestrictedMessage, videoVideoDto.contentRestrictedMessage) && epx.f(this.balance, videoVideoDto.balance) && this.live == videoVideoDto.live && this.upcoming == videoVideoDto.upcoming && epx.f(this.liveStartTime, videoVideoDto.liveStartTime) && this.liveNotify == videoVideoDto.liveNotify && epx.f(this.spectators, videoVideoDto.spectators) && epx.f(this.platform, videoVideoDto.platform) && epx.f(this.likes, videoVideoDto.likes) && epx.f(this.reposts, videoVideoDto.reposts) && this.isExplicit == videoVideoDto.isExplicit && epx.f(this.mainArtists, videoVideoDto.mainArtists) && epx.f(this.featuredArtists, videoVideoDto.featuredArtists) && epx.f(this.subtitle, videoVideoDto.subtitle) && epx.f(this.releaseDate, videoVideoDto.releaseDate) && epx.f(this.genres, videoVideoDto.genres);
    }

    public final int hashCode() {
        ResponseTypeDto responseTypeDto = this.responseType;
        int hashCode = (responseTypeDto == null ? 0 : responseTypeDto.hashCode()) * 31;
        String str = this.accessKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.addingDate;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        int hashCode4 = (hashCode3 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canEdit;
        int hashCode5 = (hashCode4 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canDelete;
        int hashCode6 = (hashCode5 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canLike;
        int hashCode7 = (hashCode6 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        Integer num2 = this.canRepost;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canSubscribe;
        int hashCode9 = (hashCode8 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canAddToFaves;
        int hashCode10 = (hashCode9 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canAdd;
        int hashCode11 = (hashCode10 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.canAttachLink;
        int hashCode12 = (hashCode11 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.canEditPrivacy;
        int hashCode13 = (hashCode12 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.isPrivate;
        int hashCode14 = (hashCode13 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        Integer num3 = this.comments;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.date;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.description;
        int hashCode17 = (hashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.duration;
        int hashCode18 = (hashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<VideoVideoImageDto> list = this.image;
        int hashCode19 = (hashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoVideoImageDto> list2 = this.firstFrame;
        int hashCode20 = (hashCode19 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num6 = this.width;
        int hashCode21 = (hashCode20 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.height;
        int hashCode22 = (hashCode21 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.id;
        int hashCode23 = (hashCode22 + (num8 == null ? 0 : num8.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode24 = (hashCode23 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.userId;
        int hashCode25 = (hashCode24 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str3 = this.title;
        int hashCode26 = (hashCode25 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode27 = (hashCode26 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.player;
        int hashCode28 = (hashCode27 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.processing;
        int hashCode29 = (hashCode28 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.converting;
        int hashCode30 = (hashCode29 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.added;
        int hashCode31 = (hashCode30 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.isSubscribed;
        int hashCode32 = (hashCode31 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        String str5 = this.trackCode;
        int hashCode33 = (hashCode32 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto2 = this.repeat;
        int hashCode34 = (hashCode33 + (basePropertyExistsDto2 == null ? 0 : basePropertyExistsDto2.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode35 = (hashCode34 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        Integer num9 = this.views;
        int hashCode36 = (hashCode35 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.localViews;
        int hashCode37 = (hashCode36 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.contentRestricted;
        int hashCode38 = (hashCode37 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str6 = this.contentRestrictedMessage;
        int hashCode39 = (hashCode38 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num12 = this.balance;
        int hashCode40 = (hashCode39 + (num12 == null ? 0 : num12.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto3 = this.live;
        int hashCode41 = (hashCode40 + (basePropertyExistsDto3 == null ? 0 : basePropertyExistsDto3.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto4 = this.upcoming;
        int hashCode42 = (hashCode41 + (basePropertyExistsDto4 == null ? 0 : basePropertyExistsDto4.hashCode())) * 31;
        Integer num13 = this.liveStartTime;
        int hashCode43 = (hashCode42 + (num13 == null ? 0 : num13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.liveNotify;
        int hashCode44 = (hashCode43 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        Integer num14 = this.spectators;
        int hashCode45 = (hashCode44 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str7 = this.platform;
        int hashCode46 = (hashCode45 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BaseLikesDto baseLikesDto = this.likes;
        int hashCode47 = (hashCode46 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode48 = (hashCode47 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.isExplicit;
        int hashCode49 = (hashCode48 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        List<AudioArtistDto> list3 = this.mainArtists;
        int hashCode50 = (hashCode49 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AudioArtistDto> list4 = this.featuredArtists;
        int hashCode51 = (hashCode50 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str8 = this.subtitle;
        int hashCode52 = (hashCode51 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num15 = this.releaseDate;
        int hashCode53 = (hashCode52 + (num15 == null ? 0 : num15.hashCode())) * 31;
        List<AudioGenreDto> list5 = this.genres;
        return hashCode53 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        ResponseTypeDto responseTypeDto = this.responseType;
        String str = this.accessKey;
        Integer num = this.addingDate;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        BaseBoolIntDto baseBoolIntDto2 = this.canEdit;
        BaseBoolIntDto baseBoolIntDto3 = this.canDelete;
        BaseBoolIntDto baseBoolIntDto4 = this.canLike;
        Integer num2 = this.canRepost;
        BaseBoolIntDto baseBoolIntDto5 = this.canSubscribe;
        BaseBoolIntDto baseBoolIntDto6 = this.canAddToFaves;
        BaseBoolIntDto baseBoolIntDto7 = this.canAdd;
        BaseBoolIntDto baseBoolIntDto8 = this.canAttachLink;
        BaseBoolIntDto baseBoolIntDto9 = this.canEditPrivacy;
        BaseBoolIntDto baseBoolIntDto10 = this.isPrivate;
        Integer num3 = this.comments;
        Integer num4 = this.date;
        String str2 = this.description;
        Integer num5 = this.duration;
        List<VideoVideoImageDto> list = this.image;
        List<VideoVideoImageDto> list2 = this.firstFrame;
        Integer num6 = this.width;
        Integer num7 = this.height;
        Integer num8 = this.id;
        UserId userId = this.ownerId;
        UserId userId2 = this.userId;
        String str3 = this.title;
        Boolean bool = this.isFavorite;
        String str4 = this.player;
        BasePropertyExistsDto basePropertyExistsDto = this.processing;
        BaseBoolIntDto baseBoolIntDto11 = this.converting;
        BaseBoolIntDto baseBoolIntDto12 = this.added;
        BaseBoolIntDto baseBoolIntDto13 = this.isSubscribed;
        String str5 = this.trackCode;
        BasePropertyExistsDto basePropertyExistsDto2 = this.repeat;
        TypeDto typeDto = this.type;
        Integer num9 = this.views;
        Integer num10 = this.localViews;
        Integer num11 = this.contentRestricted;
        String str6 = this.contentRestrictedMessage;
        Integer num12 = this.balance;
        BasePropertyExistsDto basePropertyExistsDto3 = this.live;
        BasePropertyExistsDto basePropertyExistsDto4 = this.upcoming;
        Integer num13 = this.liveStartTime;
        BaseBoolIntDto baseBoolIntDto14 = this.liveNotify;
        Integer num14 = this.spectators;
        String str7 = this.platform;
        BaseLikesDto baseLikesDto = this.likes;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        BaseBoolIntDto baseBoolIntDto15 = this.isExplicit;
        List<AudioArtistDto> list3 = this.mainArtists;
        List<AudioArtistDto> list4 = this.featuredArtists;
        String str8 = this.subtitle;
        Integer num15 = this.releaseDate;
        List<AudioGenreDto> list5 = this.genres;
        StringBuilder sb = new StringBuilder("VideoVideoDto(responseType=");
        sb.append(responseTypeDto);
        sb.append(", accessKey=");
        sb.append(str);
        sb.append(", addingDate=");
        sb.append(num);
        sb.append(", canComment=");
        sb.append(baseBoolIntDto);
        sb.append(", canEdit=");
        to.b(sb, baseBoolIntDto2, ", canDelete=", baseBoolIntDto3, ", canLike=");
        sb.append(baseBoolIntDto4);
        sb.append(", canRepost=");
        sb.append(num2);
        sb.append(", canSubscribe=");
        to.b(sb, baseBoolIntDto5, ", canAddToFaves=", baseBoolIntDto6, ", canAdd=");
        to.b(sb, baseBoolIntDto7, ", canAttachLink=", baseBoolIntDto8, ", canEditPrivacy=");
        to.b(sb, baseBoolIntDto9, ", isPrivate=", baseBoolIntDto10, ", comments=");
        sq.b(sb, num3, ", date=", num4, ", description=");
        kr.b(num5, str2, ", duration=", ", image=", sb);
        vq.d(sb, list, ", firstFrame=", list2, ", width=");
        sq.b(sb, num6, ", height=", num7, ", id=");
        sb.append(num8);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", userId=");
        sb.append(userId2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", isFavorite=");
        l4.i(bool, ", player=", str4, ", processing=", sb);
        sb.append(basePropertyExistsDto);
        sb.append(", converting=");
        sb.append(baseBoolIntDto11);
        sb.append(", added=");
        to.b(sb, baseBoolIntDto12, ", isSubscribed=", baseBoolIntDto13, ", trackCode=");
        sb.append(str5);
        sb.append(", repeat=");
        sb.append(basePropertyExistsDto2);
        sb.append(", type=");
        sb.append(typeDto);
        sb.append(", views=");
        sb.append(num9);
        sb.append(", localViews=");
        sq.b(sb, num10, ", contentRestricted=", num11, ", contentRestrictedMessage=");
        kr.b(num12, str6, ", balance=", ", live=", sb);
        sb.append(basePropertyExistsDto3);
        sb.append(", upcoming=");
        sb.append(basePropertyExistsDto4);
        sb.append(", liveStartTime=");
        sb.append(num13);
        sb.append(", liveNotify=");
        sb.append(baseBoolIntDto14);
        sb.append(", spectators=");
        mq.b(num14, ", platform=", str7, ", likes=", sb);
        sb.append(baseLikesDto);
        sb.append(", reposts=");
        sb.append(baseRepostsInfoDto);
        sb.append(", isExplicit=");
        sb.append(baseBoolIntDto15);
        sb.append(", mainArtists=");
        sb.append(list3);
        sb.append(", featuredArtists=");
        vr.c(", subtitle=", str8, ", releaseDate=", sb, list4);
        sb.append(num15);
        sb.append(", genres=");
        sb.append(list5);
        sb.append(")");
        return sb.toString();
    }

    public VideoVideoDto(ResponseTypeDto responseTypeDto, String str, Integer num, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num3, Integer num4, String str2, Integer num5, List<VideoVideoImageDto> list, List<VideoVideoImageDto> list2, Integer num6, Integer num7, Integer num8, UserId userId, UserId userId2, String str3, Boolean bool, String str4, BasePropertyExistsDto basePropertyExistsDto, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str5, BasePropertyExistsDto basePropertyExistsDto2, TypeDto typeDto, Integer num9, Integer num10, Integer num11, String str6, Integer num12, BasePropertyExistsDto basePropertyExistsDto3, BasePropertyExistsDto basePropertyExistsDto4, Integer num13, BaseBoolIntDto baseBoolIntDto14, Integer num14, String str7, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, BaseBoolIntDto baseBoolIntDto15, List<AudioArtistDto> list3, List<AudioArtistDto> list4, String str8, Integer num15, List<AudioGenreDto> list5) {
        this.responseType = responseTypeDto;
        this.accessKey = str;
        this.addingDate = num;
        this.canComment = baseBoolIntDto;
        this.canEdit = baseBoolIntDto2;
        this.canDelete = baseBoolIntDto3;
        this.canLike = baseBoolIntDto4;
        this.canRepost = num2;
        this.canSubscribe = baseBoolIntDto5;
        this.canAddToFaves = baseBoolIntDto6;
        this.canAdd = baseBoolIntDto7;
        this.canAttachLink = baseBoolIntDto8;
        this.canEditPrivacy = baseBoolIntDto9;
        this.isPrivate = baseBoolIntDto10;
        this.comments = num3;
        this.date = num4;
        this.description = str2;
        this.duration = num5;
        this.image = list;
        this.firstFrame = list2;
        this.width = num6;
        this.height = num7;
        this.id = num8;
        this.ownerId = userId;
        this.userId = userId2;
        this.title = str3;
        this.isFavorite = bool;
        this.player = str4;
        this.processing = basePropertyExistsDto;
        this.converting = baseBoolIntDto11;
        this.added = baseBoolIntDto12;
        this.isSubscribed = baseBoolIntDto13;
        this.trackCode = str5;
        this.repeat = basePropertyExistsDto2;
        this.type = typeDto;
        this.views = num9;
        this.localViews = num10;
        this.contentRestricted = num11;
        this.contentRestrictedMessage = str6;
        this.balance = num12;
        this.live = basePropertyExistsDto3;
        this.upcoming = basePropertyExistsDto4;
        this.liveStartTime = num13;
        this.liveNotify = baseBoolIntDto14;
        this.spectators = num14;
        this.platform = str7;
        this.likes = baseLikesDto;
        this.reposts = baseRepostsInfoDto;
        this.isExplicit = baseBoolIntDto15;
        this.mainArtists = list3;
        this.featuredArtists = list4;
        this.subtitle = str8;
        this.releaseDate = num15;
        this.genres = list5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ VideoVideoDto(ResponseTypeDto responseTypeDto, String str, Integer num, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num3, Integer num4, String str2, Integer num5, List list, List list2, Integer num6, Integer num7, Integer num8, UserId userId, UserId userId2, String str3, Boolean bool, String str4, BasePropertyExistsDto basePropertyExistsDto, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str5, BasePropertyExistsDto basePropertyExistsDto2, TypeDto typeDto, Integer num9, Integer num10, Integer num11, String str6, Integer num12, BasePropertyExistsDto basePropertyExistsDto3, BasePropertyExistsDto basePropertyExistsDto4, Integer num13, BaseBoolIntDto baseBoolIntDto14, Integer num14, String str7, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, BaseBoolIntDto baseBoolIntDto15, List list3, List list4, String str8, Integer num15, List list5, int i, int i2, zcl zclVar) {
        this(r2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : baseBoolIntDto, (i & 16) != 0 ? null : baseBoolIntDto2, (i & 32) != 0 ? null : baseBoolIntDto3, (i & 64) != 0 ? null : baseBoolIntDto4, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : baseBoolIntDto5, (i & 512) != 0 ? null : baseBoolIntDto6, (i & 1024) != 0 ? null : baseBoolIntDto7, (i & 2048) != 0 ? null : baseBoolIntDto8, (i & 4096) != 0 ? null : baseBoolIntDto9, (i & 8192) != 0 ? null : baseBoolIntDto10, (i & 16384) != 0 ? null : num3, (i & 32768) != 0 ? null : num4, (i & 65536) != 0 ? null : str2, (i & 131072) != 0 ? null : num5, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list, (i & 524288) != 0 ? null : list2, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num6, (i & 2097152) != 0 ? null : num7, (i & 4194304) != 0 ? null : num8, (i & 8388608) != 0 ? null : userId, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : userId2, (i & 33554432) != 0 ? null : str3, (i & 67108864) != 0 ? null : bool, (i & 134217728) != 0 ? null : str4, (i & 268435456) != 0 ? null : basePropertyExistsDto, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto11, (i & 1073741824) != 0 ? null : baseBoolIntDto12, (i & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto13, (i2 & 1) != 0 ? null : str5, (i2 & 2) != 0 ? null : basePropertyExistsDto2, (i2 & 4) != 0 ? null : typeDto, (i2 & 8) != 0 ? null : num9, (i2 & 16) != 0 ? null : num10, (i2 & 32) != 0 ? null : num11, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : num12, (i2 & 256) != 0 ? null : basePropertyExistsDto3, (i2 & 512) != 0 ? null : basePropertyExistsDto4, (i2 & 1024) != 0 ? null : num13, (i2 & 2048) != 0 ? null : baseBoolIntDto14, (i2 & 4096) != 0 ? null : num14, (i2 & 8192) != 0 ? null : str7, (i2 & 16384) != 0 ? null : baseLikesDto, (i2 & 32768) != 0 ? null : baseRepostsInfoDto, (i2 & 65536) != 0 ? null : baseBoolIntDto15, (i2 & 131072) != 0 ? null : list3, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list4, (i2 & 524288) != 0 ? null : str8, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num15, (i2 & 2097152) != 0 ? null : list5);
        ResponseTypeDto responseTypeDto2 = (i & 1) != 0 ? null : responseTypeDto;
    }
}
