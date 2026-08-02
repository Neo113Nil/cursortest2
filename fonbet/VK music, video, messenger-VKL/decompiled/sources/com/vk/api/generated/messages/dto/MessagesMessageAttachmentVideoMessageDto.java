package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioGenreDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoInfoDto;
import com.vk.api.generated.video.dto.VideoAccessInfoDto;
import com.vk.api.generated.video.dto.VideoAdsDto;
import com.vk.api.generated.video.dto.VideoAdsInfoDto;
import com.vk.api.generated.video.dto.VideoDeduplicationOriginalDto;
import com.vk.api.generated.video.dto.VideoDonutDto;
import com.vk.api.generated.video.dto.VideoEpisodeDto;
import com.vk.api.generated.video.dto.VideoInteractiveInfoDto;
import com.vk.api.generated.video.dto.VideoLinkedToPlaylistMarkDto;
import com.vk.api.generated.video.dto.VideoLiveSettingsDto;
import com.vk.api.generated.video.dto.VideoLiveStatusDto;
import com.vk.api.generated.video.dto.VideoOrdInfoDto;
import com.vk.api.generated.video.dto.VideoOriginalsInfoDto;
import com.vk.api.generated.video.dto.VideoPrivacyCutToShortVideoDto;
import com.vk.api.generated.video.dto.VideoQualityInfoDto;
import com.vk.api.generated.video.dto.VideoStatsPixelDto;
import com.vk.api.generated.video.dto.VideoSubtitlesDto;
import com.vk.api.generated.video.dto.VideoTimelineThumbsDto;
import com.vk.api.generated.video.dto.VideoVideoDownloadDto;
import com.vk.api.generated.video.dto.VideoVideoFilesDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.api.generated.video.dto.VideoVideoTrackingInfoDto;
import com.vk.api.generated.video.dto.VideoVideoTypeDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageAttachmentVideoMessageDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageAttachmentVideoMessageDto> CREATOR = new a();

    @pmi0("access_info")
    private final VideoAccessInfoDto accessInfo;

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("action_button")
    private final ActionLinksActionDto actionButton;

    @pmi0("added")
    private final BaseBoolIntDto added;

    @pmi0("adding_date")
    private final Integer addingDate;

    @pmi0(b.JSON_KEY_ADS)
    private final VideoAdsDto ads;

    @pmi0("ads_info")
    private final VideoAdsInfoDto adsInfo;

    @pmi0("ads_stat_pixels")
    private final List<AdsItemBlockAdStatPixelDto> adsStatPixels;

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("archival_content_published_date")
    private final Integer archivalContentPublishedDate;

    @pmi0("attached_short_videos")
    private final List<VideoVideoFullDto> attachedShortVideos;

    @pmi0("attached_short_videos_counter")
    private final Integer attachedShortVideosCounter;

    @pmi0("balance")
    private final Integer balance;

    @pmi0("can_add")
    private final BaseBoolIntDto canAdd;

    @pmi0("can_add_to_faves")
    private final BaseBoolIntDto canAddToFaves;

    @pmi0("can_attach_link")
    private final BaseBoolIntDto canAttachLink;

    @pmi0("can_be_pinned")
    private final Boolean canBePinned;

    @pmi0("can_be_promoted")
    private final BaseBoolIntDto canBePromoted;

    @pmi0("can_comment")
    private final BaseBoolIntDto canComment;

    @pmi0("can_cut_to_short_video")
    private final BaseBoolIntDto canCutToShortVideo;

    @pmi0("can_delete")
    private final BaseBoolIntDto canDelete;

    @pmi0("can_dislike")
    private final BaseBoolIntDto canDislike;

    @pmi0("can_download")
    private final Integer canDownload;

    @pmi0("can_edit")
    private final BaseBoolIntDto canEdit;

    @pmi0("can_edit_privacy")
    private final BaseBoolIntDto canEditPrivacy;

    @pmi0("can_like")
    private final BaseBoolIntDto canLike;

    @pmi0("can_play_in_background")
    private final BaseBoolIntDto canPlayInBackground;

    @pmi0("can_remove_from_recommendations")
    private final BaseBoolIntDto canRemoveFromRecommendations;

    @pmi0("can_report")
    private final BaseBoolIntDto canReport;

    @pmi0("can_repost")
    private final Integer canRepost;

    @pmi0("can_see_uma")
    private final Boolean canSeeUma;

    @pmi0("can_subscribe")
    private final BaseBoolIntDto canSubscribe;

    @pmi0("comments")
    private final Integer comments;

    @pmi0("content_restricted")
    private final Integer contentRestricted;

    @pmi0("content_restricted_message")
    private final String contentRestrictedMessage;

    @pmi0("context")
    private final String context;

    @pmi0("converting")
    private final BaseBoolIntDto converting;

    @pmi0("date")
    private final Integer date;

    @pmi0("deduplication_original_info")
    private final VideoDeduplicationOriginalDto deduplicationOriginalInfo;

    @pmi0("description")
    private final String description;

    @pmi0("direct_url")
    private final String directUrl;

    @pmi0("donut")
    private final VideoDonutDto donut;

    @pmi0("donut_level_id")
    private final Integer donutLevelId;

    @pmi0("download")
    private final VideoVideoDownloadDto download;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("episodes")
    private final List<VideoEpisodeDto> episodes;

    @pmi0("featured_artists")
    private final List<AudioArtistDto> featuredArtists;

    @pmi0("files")
    private final VideoVideoFilesDto files;

    @pmi0("first_frame")
    private final List<VideoVideoImageDto> firstFrame;

    @pmi0("force_subtitles")
    private final String forceSubtitles;

    @pmi0("genres")
    private final List<AudioGenreDto> genres;

    @pmi0("has_market_items")
    private final Boolean hasMarketItems;

    @pmi0("has_subtitles")
    private final BasePropertyExistsDto hasSubtitles;

    @pmi0("height")
    private final Integer height;

    @pmi0("id")
    private final Integer id;

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("interactive_info")
    private final VideoInteractiveInfoDto interactiveInfo;

    @pmi0("is_archival_content")
    private final Boolean isArchivalContent;

    @pmi0("is_author")
    private final Boolean isAuthor;

    @pmi0("is_draft")
    private final BaseBoolIntDto isDraft;

    @pmi0("is_explicit")
    private final BaseBoolIntDto isExplicit;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_from_message")
    private final BaseBoolIntDto isFromMessage;

    @pmi0("is_mobile_live")
    private final Boolean isMobileLive;

    @pmi0("is_pinned")
    private final Boolean isPinned;

    @pmi0("is_private")
    private final BaseBoolIntDto isPrivate;

    @pmi0("is_spherical")
    private final Boolean isSpherical;

    @pmi0("is_subscribed")
    private final BaseBoolIntDto isSubscribed;

    @pmi0("is_united_video")
    private final BaseBoolIntDto isUnitedVideo;

    @pmi0("likes")
    private final BaseLikesDto likes;

    @pmi0("linked_to_playlist_marks")
    private final List<VideoLinkedToPlaylistMarkDto> linkedToPlaylistMarks;

    @pmi0("live_notify")
    private final BaseBoolIntDto liveNotify;

    @pmi0("live_settings")
    private final VideoLiveSettingsDto liveSettings;

    @pmi0("live_start_time")
    private final Integer liveStartTime;

    @pmi0("live_status")
    private final VideoLiveStatusDto liveStatus;

    @pmi0("local_views")
    private final Integer localViews;

    @pmi0("main_artists")
    private final List<AudioArtistDto> mainArtists;

    @pmi0("market_items_count")
    private final Integer marketItemsCount;

    @pmi0("md5")
    private final String md5;

    @pmi0("moderation_status")
    private final Integer moderationStatus;

    @pmi0("need_mediascope_stat")
    private final Boolean needMediascopeStat;

    @pmi0("need_mute")
    private final BasePropertyExistsDto needMute;

    @pmi0("need_my_tracker")
    private final Boolean needMyTracker;

    @pmi0("no_autoplay")
    private final BasePropertyExistsDto noAutoplay;

    @pmi0("ord_info")
    private final VideoOrdInfoDto ordInfo;

    @pmi0("originals_info")
    private final VideoOriginalsInfoDto originalsInfo;

    @pmi0("ov_id")
    private final String ovId;

    @pmi0("ov_provider_id")
    private final Integer ovProviderId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("partner_text")
    private final String partnerText;

    @pmi0("platform")
    private final String platform;

    @pmi0("player")
    private final String player;

    @pmi0("privacy_comment")
    private final BasePrivacyDto privacyComment;

    @pmi0("privacy_cut_to_short_video")
    private final VideoPrivacyCutToShortVideoDto privacyCutToShortVideo;

    @pmi0("privacy_view")
    private final BasePrivacyDto privacyView;

    @pmi0("processing")
    private final BasePropertyExistsDto processing;

    @pmi0("promo_post_hash")
    private final String promoPostHash;

    @pmi0("published_at")
    private final Integer publishedAt;

    @pmi0("qualities_info")
    private final List<VideoQualityInfoDto> qualitiesInfo;

    @pmi0("random_tag")
    private final String randomTag;

    @pmi0("release_date")
    private final Integer releaseDate;

    @pmi0("repeat")
    private final BasePropertyExistsDto repeat;

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE)
    private final ResponseTypeDto responseType;

    @pmi0("restriction")
    private final MediaRestrictionDto restriction;

    @pmi0(Hb.a)
    private final Integer server;

    @pmi0("server_effect")
    private final ServerEffectDto serverEffect;

    @pmi0("shape_id")
    private final Integer shapeId;

    @pmi0("share_url")
    private final String shareUrl;

    @pmi0("short_video_info")
    private final ShortVideoShortVideoInfoDto shortVideoInfo;

    @pmi0("should_stretch")
    private final Boolean shouldStretch;

    @pmi0("source")
    private final Integer source;

    @pmi0("source_file_name")
    private final String sourceFileName;

    @pmi0("source_owner")
    private final UserId sourceOwner;

    @pmi0("spectators")
    private final Integer spectators;

    @pmi0("stats_pixels")
    private final List<VideoStatsPixelDto> statsPixels;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("subtitles")
    private final List<VideoSubtitlesDto> subtitles;

    @pmi0("target")
    private final TargetDto target;

    @pmi0("thumb_hash")
    private final String thumbHash;

    @pmi0("timeline_thumbs")
    private final VideoTimelineThumbsDto timelineThumbs;

    @pmi0("title")
    private final String title;

    @pmi0("title_action")
    private final ActionLinksActionDto titleAction;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("tracking_info")
    private final VideoVideoTrackingInfoDto trackingInfo;

    @pmi0("trailer")
    private final VideoVideoFilesDto trailer;

    @pmi0("transcript")
    private final String transcript;

    @pmi0("transcript_error")
    private final Integer transcriptError;

    @pmi0("transcript_state")
    private final TranscriptStateDto transcriptState;

    @pmi0("transcript_update_time")
    private final Integer transcriptUpdateTime;

    @pmi0("type")
    private final VideoVideoTypeDto type;

    @pmi0("uma_track_id")
    private final Integer umaTrackId;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("uv_stats_place")
    private final String uvStatsPlace;

    @pmi0("viewed_duration")
    private final Integer viewedDuration;

    @pmi0("views")
    private final Integer views;

    @pmi0("vk_live_channel_name")
    private final String vkLiveChannelName;

    @pmi0("vk_live_channel_url")
    private final String vkLiveChannelUrl;

    @pmi0("vk_live_slot_url")
    private final String vkLiveSlotUrl;

    @pmi0("vk_live_video_id")
    private final String vkLiveVideoId;

    @pmi0("volume_multiplier")
    private final Float volumeMultiplier;

    @pmi0("wall_post_id")
    private final Integer wallPostId;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
    public static final class ResponseTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResponseTypeDto[] $VALUES;
        public static final Parcelable.Creator<ResponseTypeDto> CREATOR;

        @pmi0("full")
        public static final ResponseTypeDto FULL;

        @pmi0(UcumUtils.UCUM_MINUTES)
        public static final ResponseTypeDto MIN;
        private final String value;

        /* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
        public static final class a implements Parcelable.Creator<ResponseTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ResponseTypeDto createFromParcel(Parcel parcel) {
                return ResponseTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ResponseTypeDto[] newArray(int i) {
                return new ResponseTypeDto[i];
            }
        }

        static {
            ResponseTypeDto responseTypeDto = new ResponseTypeDto("MIN", 0, UcumUtils.UCUM_MINUTES);
            MIN = responseTypeDto;
            ResponseTypeDto responseTypeDto2 = new ResponseTypeDto("FULL", 1, "full");
            FULL = responseTypeDto2;
            ResponseTypeDto[] responseTypeDtoArr = {responseTypeDto, responseTypeDto2};
            $VALUES = responseTypeDtoArr;
            $ENTRIES = new asp(responseTypeDtoArr);
            CREATOR = new a();
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
    public static final class ServerEffectDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ServerEffectDto[] $VALUES;
        public static final Parcelable.Creator<ServerEffectDto> CREATOR;

        @pmi0("deepfake")
        public static final ServerEffectDto DEEPFAKE;
        private final String value;

        /* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
        public static final class a implements Parcelable.Creator<ServerEffectDto> {
            @Override // android.os.Parcelable.Creator
            public final ServerEffectDto createFromParcel(Parcel parcel) {
                return ServerEffectDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ServerEffectDto[] newArray(int i) {
                return new ServerEffectDto[i];
            }
        }

        static {
            ServerEffectDto serverEffectDto = new ServerEffectDto("DEEPFAKE", 0, "deepfake");
            DEEPFAKE = serverEffectDto;
            ServerEffectDto[] serverEffectDtoArr = {serverEffectDto};
            $VALUES = serverEffectDtoArr;
            $ENTRIES = new asp(serverEffectDtoArr);
            CREATOR = new a();
        }

        private ServerEffectDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ServerEffectDto valueOf(String str) {
            return (ServerEffectDto) Enum.valueOf(ServerEffectDto.class, str);
        }

        public static ServerEffectDto[] values() {
            return (ServerEffectDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
    public static final class TargetDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TargetDto[] $VALUES;
        public static final Parcelable.Creator<TargetDto> CREATOR;

        @pmi0("discovery")
        public static final TargetDto DISCOVERY;

        @pmi0("video")
        public static final TargetDto VIDEO;
        private final String value;

        /* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
        public static final class a implements Parcelable.Creator<TargetDto> {
            @Override // android.os.Parcelable.Creator
            public final TargetDto createFromParcel(Parcel parcel) {
                return TargetDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TargetDto[] newArray(int i) {
                return new TargetDto[i];
            }
        }

        static {
            TargetDto targetDto = new TargetDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
            VIDEO = targetDto;
            TargetDto targetDto2 = new TargetDto("DISCOVERY", 1, "discovery");
            DISCOVERY = targetDto2;
            TargetDto[] targetDtoArr = {targetDto, targetDto2};
            $VALUES = targetDtoArr;
            $ENTRIES = new asp(targetDtoArr);
            CREATOR = new a();
        }

        private TargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TargetDto valueOf(String str) {
            return (TargetDto) Enum.valueOf(TargetDto.class, str);
        }

        public static TargetDto[] values() {
            return (TargetDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
    public static final class TranscriptStateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TranscriptStateDto[] $VALUES;
        public static final Parcelable.Creator<TranscriptStateDto> CREATOR;

        @pmi0("done")
        public static final TranscriptStateDto DONE;

        @pmi0("error")
        public static final TranscriptStateDto ERROR;

        @pmi0("in_progress")
        public static final TranscriptStateDto IN_PROGRESS;

        @pmi0("uninitialized")
        public static final TranscriptStateDto UNINITIALIZED;
        private final String value;

        /* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
        public static final class a implements Parcelable.Creator<TranscriptStateDto> {
            @Override // android.os.Parcelable.Creator
            public final TranscriptStateDto createFromParcel(Parcel parcel) {
                return TranscriptStateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TranscriptStateDto[] newArray(int i) {
                return new TranscriptStateDto[i];
            }
        }

        static {
            TranscriptStateDto transcriptStateDto = new TranscriptStateDto("UNINITIALIZED", 0, "uninitialized");
            UNINITIALIZED = transcriptStateDto;
            TranscriptStateDto transcriptStateDto2 = new TranscriptStateDto("IN_PROGRESS", 1, "in_progress");
            IN_PROGRESS = transcriptStateDto2;
            TranscriptStateDto transcriptStateDto3 = new TranscriptStateDto("ERROR", 2, "error");
            ERROR = transcriptStateDto3;
            TranscriptStateDto transcriptStateDto4 = new TranscriptStateDto("DONE", 3, "done");
            DONE = transcriptStateDto4;
            TranscriptStateDto[] transcriptStateDtoArr = {transcriptStateDto, transcriptStateDto2, transcriptStateDto3, transcriptStateDto4};
            $VALUES = transcriptStateDtoArr;
            $ENTRIES = new asp(transcriptStateDtoArr);
            CREATOR = new a();
        }

        private TranscriptStateDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TranscriptStateDto valueOf(String str) {
            return (TranscriptStateDto) Enum.valueOf(TranscriptStateDto.class, str);
        }

        public static TranscriptStateDto[] values() {
            return (TranscriptStateDto[]) $VALUES.clone();
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

    /* compiled from: MessagesMessageAttachmentVideoMessageDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageAttachmentVideoMessageDto> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r145v2, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v220, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v221 */
        /* JADX WARN: Type inference failed for: r2v222, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v223 */
        /* JADX WARN: Type inference failed for: r2v224 */
        /* JADX WARN: Type inference failed for: r2v225 */
        /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v32 */
        /* JADX WARN: Type inference failed for: r3v42 */
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentVideoMessageDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Float f;
            ArrayList arrayList3;
            Integer num;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean bool;
            Boolean valueOf6;
            UserId userId;
            ServerEffectDto createFromParcel;
            ServerEffectDto serverEffectDto;
            TargetDto createFromParcel2;
            VideoOrdInfoDto videoOrdInfoDto;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Integer num2;
            VideoVideoDownloadDto videoVideoDownloadDto;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ResponseTypeDto responseTypeDto;
            Boolean valueOf7;
            BaseBoolIntDto baseBoolIntDto;
            ArrayList arrayList10;
            ArrayList arrayList11;
            Integer num3;
            ArrayList arrayList12;
            ArrayList arrayList13;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            VideoAccessInfoDto videoAccessInfoDto;
            Integer num4;
            ArrayList arrayList14;
            Integer num5;
            Integer valueOf12;
            Boolean bool2;
            Boolean valueOf13;
            BaseBoolIntDto baseBoolIntDto2;
            ArrayList arrayList15;
            ?? arrayList16;
            Integer num6;
            ?? arrayList17;
            List list;
            List list2;
            List arrayList18;
            Object obj;
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            TranscriptStateDto createFromParcel3 = parcel.readInt() == 0 ? null : TranscriptStateDto.CREATOR.createFromParcel(parcel);
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            VideoVideoFilesDto videoVideoFilesDto = (VideoVideoFilesDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            VideoVideoFilesDto videoVideoFilesDto2 = (VideoVideoFilesDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList2, i2, 1);
                }
            }
            Float valueOf17 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            VideoLiveSettingsDto videoLiveSettingsDto = (VideoLiveSettingsDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BasePrivacyDto basePrivacyDto = (BasePrivacyDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BasePrivacyDto basePrivacyDto2 = (BasePrivacyDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto = (VideoPrivacyCutToShortVideoDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            VideoTimelineThumbsDto videoTimelineThumbsDto = (VideoTimelineThumbsDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            VideoAdsDto videoAdsDto = (VideoAdsDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            ActionLinksActionDto actionLinksActionDto = (ActionLinksActionDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BasePropertyExistsDto basePropertyExistsDto = (BasePropertyExistsDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                f = valueOf17;
                num = valueOf14;
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                f = valueOf17;
                arrayList3 = new ArrayList(readInt3);
                num = valueOf14;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList3, i3, 1);
                    readInt3 = readInt3;
                }
                basePropertyExistsDto = basePropertyExistsDto;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            BasePropertyExistsDto basePropertyExistsDto2 = basePropertyExistsDto;
            ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto2 = (ShortVideoShortVideoInfoDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                shortVideoShortVideoInfoDto = shortVideoShortVideoInfoDto2;
                arrayList4 = arrayList3;
                bool = valueOf;
                arrayList5 = null;
            } else {
                shortVideoShortVideoInfoDto = shortVideoShortVideoInfoDto2;
                int readInt4 = parcel.readInt();
                arrayList4 = arrayList3;
                arrayList5 = new ArrayList(readInt4);
                bool = valueOf;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList5, i4, 1);
                    readInt4 = readInt4;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean bool3 = valueOf6;
            VideoOriginalsInfoDto videoOriginalsInfoDto = (VideoOriginalsInfoDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            VideoDeduplicationOriginalDto videoDeduplicationOriginalDto = (VideoDeduplicationOriginalDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId2 = (UserId) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                userId = userId2;
                createFromParcel = null;
            } else {
                userId = userId2;
                createFromParcel = ServerEffectDto.CREATOR.createFromParcel(parcel);
            }
            ServerEffectDto serverEffectDto2 = createFromParcel;
            ArrayList arrayList19 = arrayList;
            Float f2 = f;
            Boolean bool4 = bool;
            Integer num7 = valueOf20;
            UserId userId3 = userId;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                serverEffectDto = serverEffectDto2;
                createFromParcel2 = null;
            } else {
                serverEffectDto = serverEffectDto2;
                createFromParcel2 = TargetDto.CREATOR.createFromParcel(parcel);
            }
            TargetDto targetDto = createFromParcel2;
            VideoInteractiveInfoDto videoInteractiveInfoDto = (VideoInteractiveInfoDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            VideoOrdInfoDto videoOrdInfoDto2 = (VideoOrdInfoDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                videoOrdInfoDto = videoOrdInfoDto2;
                arrayList6 = arrayList5;
                num2 = valueOf19;
                arrayList7 = null;
            } else {
                videoOrdInfoDto = videoOrdInfoDto2;
                int readInt5 = parcel.readInt();
                arrayList6 = arrayList5;
                arrayList7 = new ArrayList(readInt5);
                num2 = valueOf19;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList7, i5, 1);
                    readInt5 = readInt5;
                }
            }
            Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList20 = arrayList2;
            ArrayList arrayList21 = arrayList6;
            String readString5 = parcel.readString();
            ArrayList arrayList22 = arrayList4;
            Integer num8 = num2;
            String readString6 = parcel.readString();
            ResponseTypeDto createFromParcel4 = parcel.readInt() != 0 ? ResponseTypeDto.CREATOR.createFromParcel(parcel) : null;
            String readString7 = parcel.readString();
            Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num9 = valueOf21;
            VideoAdsInfoDto videoAdsInfoDto = (VideoAdsInfoDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            VideoVideoDownloadDto videoVideoDownloadDto2 = (VideoVideoDownloadDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                videoVideoDownloadDto = videoVideoDownloadDto2;
                arrayList8 = arrayList7;
                responseTypeDto = createFromParcel4;
                arrayList9 = null;
            } else {
                videoVideoDownloadDto = videoVideoDownloadDto2;
                int readInt6 = parcel.readInt();
                arrayList8 = arrayList7;
                arrayList9 = new ArrayList(readInt6);
                responseTypeDto = createFromParcel4;
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList9, i6, 1);
                    readInt6 = readInt6;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf25 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean bool5 = valueOf7;
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
            Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto17;
                arrayList10 = arrayList9;
                num3 = valueOf25;
                arrayList11 = null;
            } else {
                baseBoolIntDto = baseBoolIntDto17;
                int readInt7 = parcel.readInt();
                arrayList10 = arrayList9;
                arrayList11 = new ArrayList(readInt7);
                num3 = valueOf25;
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList11, i7, 1);
                    readInt7 = readInt7;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList13 = arrayList11;
                arrayList12 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList12 = new ArrayList(readInt8);
                arrayList13 = arrayList11;
                int i8 = 0;
                while (i8 != readInt8) {
                    i8 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList12, i8, 1);
                    readInt8 = readInt8;
                }
            }
            Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf31 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList23 = arrayList12;
            UserId userId4 = (UserId) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            UserId userId5 = (UserId) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString9 = parcel.readString();
            VideoOrdInfoDto videoOrdInfoDto3 = videoOrdInfoDto;
            Integer num10 = valueOf23;
            Integer num11 = valueOf24;
            VideoVideoDownloadDto videoVideoDownloadDto3 = videoVideoDownloadDto;
            Integer num12 = valueOf26;
            Integer num13 = valueOf27;
            Integer num14 = valueOf28;
            ArrayList arrayList24 = arrayList13;
            Integer num15 = valueOf31;
            Boolean bool6 = valueOf8;
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BasePropertyExistsDto basePropertyExistsDto3 = (BasePropertyExistsDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            ResponseTypeDto responseTypeDto2 = responseTypeDto;
            BaseBoolIntDto baseBoolIntDto18 = baseBoolIntDto;
            String readString11 = parcel.readString();
            BasePropertyExistsDto basePropertyExistsDto4 = (BasePropertyExistsDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            MediaRestrictionDto mediaRestrictionDto = (MediaRestrictionDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Boolean bool7 = valueOf9;
            String readString12 = parcel.readString();
            VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = (VideoVideoTrackingInfoDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BasePropertyExistsDto basePropertyExistsDto5 = (BasePropertyExistsDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            String readString13 = parcel.readString();
            VideoVideoTypeDto videoVideoTypeDto = (VideoVideoTypeDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf32 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf33 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf34 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString14 = parcel.readString();
            Integer valueOf35 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString15 = parcel.readString();
            Integer valueOf36 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            VideoLiveStatusDto videoLiveStatusDto = (VideoLiveStatusDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf37 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf38 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString16 = parcel.readString();
            BaseLikesDto baseLikesDto = (BaseLikesDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseRepostsInfoDto baseRepostsInfoDto = (BaseRepostsInfoDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf39 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BasePropertyExistsDto basePropertyExistsDto6 = (BasePropertyExistsDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf40 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf41 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString17 = parcel.readString();
            Integer num16 = valueOf32;
            Integer num17 = valueOf33;
            Integer num18 = valueOf34;
            Integer num19 = valueOf35;
            Integer num20 = valueOf36;
            Integer num21 = valueOf38;
            Integer num22 = valueOf39;
            Integer num23 = valueOf40;
            Integer num24 = valueOf41;
            String readString18 = parcel.readString();
            Integer valueOf42 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto24 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            ActionLinksActionDto actionLinksActionDto2 = (ActionLinksActionDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf43 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString19 = parcel.readString();
            VideoAccessInfoDto videoAccessInfoDto2 = (VideoAccessInfoDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            Integer valueOf44 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                videoAccessInfoDto = videoAccessInfoDto2;
                num4 = valueOf29;
                num5 = valueOf30;
                arrayList14 = null;
            } else {
                videoAccessInfoDto = videoAccessInfoDto2;
                int readInt9 = parcel.readInt();
                num4 = valueOf29;
                arrayList14 = new ArrayList(readInt9);
                num5 = valueOf30;
                int i9 = 0;
                while (i9 != readInt9) {
                    i9 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList14, i9, 1);
                    readInt9 = readInt9;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf12 = null;
                bool2 = null;
            } else {
                valueOf12 = Integer.valueOf(parcel.readInt());
                bool2 = null;
            }
            Integer num25 = valueOf22;
            ArrayList arrayList25 = arrayList10;
            Integer num26 = num4;
            String readString20 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf13 = bool2;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString21 = parcel.readString();
            Object obj2 = bool2;
            Integer num27 = num;
            Boolean bool8 = valueOf2;
            Boolean bool9 = valueOf3;
            Boolean bool10 = valueOf4;
            Boolean bool11 = valueOf5;
            Integer num28 = valueOf18;
            ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto3 = shortVideoShortVideoInfoDto;
            ServerEffectDto serverEffectDto3 = serverEffectDto;
            ArrayList arrayList26 = arrayList8;
            Integer num29 = num3;
            Integer num30 = num5;
            Boolean bool12 = valueOf13;
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            Integer num31 = valueOf12;
            VideoDonutDto videoDonutDto = (VideoDonutDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto26 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(MessagesMessageAttachmentVideoMessageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto27;
                arrayList15 = arrayList14;
                num6 = num27;
                arrayList16 = obj2;
            } else {
                baseBoolIntDto2 = baseBoolIntDto27;
                int readInt10 = parcel.readInt();
                arrayList15 = arrayList14;
                arrayList16 = new ArrayList(readInt10);
                num6 = num27;
                int i10 = 0;
                while (i10 != readInt10) {
                    i10 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList16, i10, 1);
                    readInt10 = readInt10;
                }
            }
            if (parcel.readInt() == 0) {
                list = arrayList16;
                arrayList17 = obj2;
            } else {
                int readInt11 = parcel.readInt();
                arrayList17 = new ArrayList(readInt11);
                list = arrayList16;
                int i11 = 0;
                while (i11 != readInt11) {
                    i11 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList17, i11, 1);
                    readInt11 = readInt11;
                }
            }
            Integer num32 = valueOf37;
            Integer num33 = valueOf44;
            ArrayList arrayList27 = arrayList15;
            String readString25 = parcel.readString();
            Object valueOf45 = parcel.readInt() == 0 ? obj2 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                list2 = arrayList17;
                obj = valueOf45;
                arrayList18 = obj2;
            } else {
                int readInt12 = parcel.readInt();
                list2 = arrayList17;
                arrayList18 = new ArrayList(readInt12);
                obj = valueOf45;
                int i12 = 0;
                while (i12 != readInt12) {
                    i12 = bo.b(MessagesMessageAttachmentVideoMessageDto.class, parcel, arrayList18, i12, 1);
                    readInt12 = readInt12;
                }
            }
            return new MessagesMessageAttachmentVideoMessageDto(num6, readString, createFromParcel3, valueOf15, valueOf16, videoVideoFilesDto, videoVideoFilesDto2, arrayList19, arrayList20, f2, videoLiveSettingsDto, basePrivacyDto, basePrivacyDto2, videoPrivacyCutToShortVideoDto, videoTimelineThumbsDto, videoAdsDto, actionLinksActionDto, basePropertyExistsDto2, arrayList22, readString2, bool4, bool8, bool9, bool10, bool11, num28, readString3, shortVideoShortVideoInfoDto3, arrayList21, bool3, num8, videoOriginalsInfoDto, videoDeduplicationOriginalDto, num7, userId3, serverEffectDto3, readString4, targetDto, videoInteractiveInfoDto, videoOrdInfoDto3, arrayList26, num9, readString5, readString6, responseTypeDto2, readString7, num25, videoAdsInfoDto, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, num10, baseBoolIntDto7, baseBoolIntDto8, baseBoolIntDto9, baseBoolIntDto10, baseBoolIntDto11, baseBoolIntDto12, num11, baseBoolIntDto13, baseBoolIntDto14, videoVideoDownloadDto3, arrayList25, bool5, num29, baseBoolIntDto15, baseBoolIntDto16, baseBoolIntDto18, num12, num13, readString8, num14, arrayList24, arrayList23, num26, num30, num15, userId4, userId5, bool6, readString9, readString10, bool7, basePropertyExistsDto3, readString11, basePropertyExistsDto4, baseBoolIntDto19, mediaRestrictionDto, baseBoolIntDto20, baseBoolIntDto21, readString12, videoVideoTrackingInfoDto, basePropertyExistsDto5, readString13, videoVideoTypeDto, num16, num17, num18, readString14, num19, readString15, num20, videoLiveStatusDto, num32, baseBoolIntDto22, num21, readString16, baseLikesDto, baseRepostsInfoDto, num22, basePropertyExistsDto6, baseBoolIntDto23, num23, num24, readString17, readString18, valueOf42, valueOf10, valueOf11, baseBoolIntDto24, actionLinksActionDto2, valueOf43, readString19, videoAccessInfoDto, num33, arrayList27, num31, readString20, bool12, readString21, readString22, readString23, readString24, videoDonutDto, baseBoolIntDto25, baseBoolIntDto26, baseBoolIntDto2, list, list2, readString25, obj, arrayList18);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentVideoMessageDto[] newArray(int i) {
            return new MessagesMessageAttachmentVideoMessageDto[i];
        }
    }

    public MessagesMessageAttachmentVideoMessageDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAttachmentVideoMessageDto)) {
            return false;
        }
        MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto = (MessagesMessageAttachmentVideoMessageDto) obj;
        return epx.f(this.shapeId, messagesMessageAttachmentVideoMessageDto.shapeId) && epx.f(this.transcript, messagesMessageAttachmentVideoMessageDto.transcript) && this.transcriptState == messagesMessageAttachmentVideoMessageDto.transcriptState && epx.f(this.transcriptError, messagesMessageAttachmentVideoMessageDto.transcriptError) && epx.f(this.transcriptUpdateTime, messagesMessageAttachmentVideoMessageDto.transcriptUpdateTime) && epx.f(this.files, messagesMessageAttachmentVideoMessageDto.files) && epx.f(this.trailer, messagesMessageAttachmentVideoMessageDto.trailer) && epx.f(this.episodes, messagesMessageAttachmentVideoMessageDto.episodes) && epx.f(this.qualitiesInfo, messagesMessageAttachmentVideoMessageDto.qualitiesInfo) && epx.f(this.volumeMultiplier, messagesMessageAttachmentVideoMessageDto.volumeMultiplier) && epx.f(this.liveSettings, messagesMessageAttachmentVideoMessageDto.liveSettings) && epx.f(this.privacyView, messagesMessageAttachmentVideoMessageDto.privacyView) && epx.f(this.privacyComment, messagesMessageAttachmentVideoMessageDto.privacyComment) && this.privacyCutToShortVideo == messagesMessageAttachmentVideoMessageDto.privacyCutToShortVideo && epx.f(this.timelineThumbs, messagesMessageAttachmentVideoMessageDto.timelineThumbs) && epx.f(this.ads, messagesMessageAttachmentVideoMessageDto.ads) && epx.f(this.actionButton, messagesMessageAttachmentVideoMessageDto.actionButton) && this.hasSubtitles == messagesMessageAttachmentVideoMessageDto.hasSubtitles && epx.f(this.subtitles, messagesMessageAttachmentVideoMessageDto.subtitles) && epx.f(this.forceSubtitles, messagesMessageAttachmentVideoMessageDto.forceSubtitles) && epx.f(this.needMyTracker, messagesMessageAttachmentVideoMessageDto.needMyTracker) && epx.f(this.canSeeUma, messagesMessageAttachmentVideoMessageDto.canSeeUma) && epx.f(this.canBePinned, messagesMessageAttachmentVideoMessageDto.canBePinned) && epx.f(this.isPinned, messagesMessageAttachmentVideoMessageDto.isPinned) && epx.f(this.hasMarketItems, messagesMessageAttachmentVideoMessageDto.hasMarketItems) && epx.f(this.marketItemsCount, messagesMessageAttachmentVideoMessageDto.marketItemsCount) && epx.f(this.sourceFileName, messagesMessageAttachmentVideoMessageDto.sourceFileName) && epx.f(this.shortVideoInfo, messagesMessageAttachmentVideoMessageDto.shortVideoInfo) && epx.f(this.statsPixels, messagesMessageAttachmentVideoMessageDto.statsPixels) && epx.f(this.needMediascopeStat, messagesMessageAttachmentVideoMessageDto.needMediascopeStat) && epx.f(this.viewedDuration, messagesMessageAttachmentVideoMessageDto.viewedDuration) && epx.f(this.originalsInfo, messagesMessageAttachmentVideoMessageDto.originalsInfo) && epx.f(this.deduplicationOriginalInfo, messagesMessageAttachmentVideoMessageDto.deduplicationOriginalInfo) && epx.f(this.source, messagesMessageAttachmentVideoMessageDto.source) && epx.f(this.sourceOwner, messagesMessageAttachmentVideoMessageDto.sourceOwner) && this.serverEffect == messagesMessageAttachmentVideoMessageDto.serverEffect && epx.f(this.md5, messagesMessageAttachmentVideoMessageDto.md5) && this.target == messagesMessageAttachmentVideoMessageDto.target && epx.f(this.interactiveInfo, messagesMessageAttachmentVideoMessageDto.interactiveInfo) && epx.f(this.ordInfo, messagesMessageAttachmentVideoMessageDto.ordInfo) && epx.f(this.attachedShortVideos, messagesMessageAttachmentVideoMessageDto.attachedShortVideos) && epx.f(this.attachedShortVideosCounter, messagesMessageAttachmentVideoMessageDto.attachedShortVideosCounter) && epx.f(this.directUrl, messagesMessageAttachmentVideoMessageDto.directUrl) && epx.f(this.shareUrl, messagesMessageAttachmentVideoMessageDto.shareUrl) && this.responseType == messagesMessageAttachmentVideoMessageDto.responseType && epx.f(this.accessKey, messagesMessageAttachmentVideoMessageDto.accessKey) && epx.f(this.addingDate, messagesMessageAttachmentVideoMessageDto.addingDate) && epx.f(this.adsInfo, messagesMessageAttachmentVideoMessageDto.adsInfo) && this.canComment == messagesMessageAttachmentVideoMessageDto.canComment && this.canEdit == messagesMessageAttachmentVideoMessageDto.canEdit && this.canDelete == messagesMessageAttachmentVideoMessageDto.canDelete && this.canLike == messagesMessageAttachmentVideoMessageDto.canLike && epx.f(this.canRepost, messagesMessageAttachmentVideoMessageDto.canRepost) && this.canSubscribe == messagesMessageAttachmentVideoMessageDto.canSubscribe && this.canBePromoted == messagesMessageAttachmentVideoMessageDto.canBePromoted && this.canAddToFaves == messagesMessageAttachmentVideoMessageDto.canAddToFaves && this.canAdd == messagesMessageAttachmentVideoMessageDto.canAdd && this.canAttachLink == messagesMessageAttachmentVideoMessageDto.canAttachLink && this.canPlayInBackground == messagesMessageAttachmentVideoMessageDto.canPlayInBackground && epx.f(this.canDownload, messagesMessageAttachmentVideoMessageDto.canDownload) && this.canEditPrivacy == messagesMessageAttachmentVideoMessageDto.canEditPrivacy && this.canRemoveFromRecommendations == messagesMessageAttachmentVideoMessageDto.canRemoveFromRecommendations && epx.f(this.download, messagesMessageAttachmentVideoMessageDto.download) && epx.f(this.linkedToPlaylistMarks, messagesMessageAttachmentVideoMessageDto.linkedToPlaylistMarks) && epx.f(this.isArchivalContent, messagesMessageAttachmentVideoMessageDto.isArchivalContent) && epx.f(this.archivalContentPublishedDate, messagesMessageAttachmentVideoMessageDto.archivalContentPublishedDate) && this.isPrivate == messagesMessageAttachmentVideoMessageDto.isPrivate && this.isFromMessage == messagesMessageAttachmentVideoMessageDto.isFromMessage && this.isDraft == messagesMessageAttachmentVideoMessageDto.isDraft && epx.f(this.comments, messagesMessageAttachmentVideoMessageDto.comments) && epx.f(this.date, messagesMessageAttachmentVideoMessageDto.date) && epx.f(this.description, messagesMessageAttachmentVideoMessageDto.description) && epx.f(this.duration, messagesMessageAttachmentVideoMessageDto.duration) && epx.f(this.image, messagesMessageAttachmentVideoMessageDto.image) && epx.f(this.firstFrame, messagesMessageAttachmentVideoMessageDto.firstFrame) && epx.f(this.width, messagesMessageAttachmentVideoMessageDto.width) && epx.f(this.height, messagesMessageAttachmentVideoMessageDto.height) && epx.f(this.id, messagesMessageAttachmentVideoMessageDto.id) && epx.f(this.ownerId, messagesMessageAttachmentVideoMessageDto.ownerId) && epx.f(this.userId, messagesMessageAttachmentVideoMessageDto.userId) && epx.f(this.isAuthor, messagesMessageAttachmentVideoMessageDto.isAuthor) && epx.f(this.ovId, messagesMessageAttachmentVideoMessageDto.ovId) && epx.f(this.title, messagesMessageAttachmentVideoMessageDto.title) && epx.f(this.isFavorite, messagesMessageAttachmentVideoMessageDto.isFavorite) && this.noAutoplay == messagesMessageAttachmentVideoMessageDto.noAutoplay && epx.f(this.player, messagesMessageAttachmentVideoMessageDto.player) && this.processing == messagesMessageAttachmentVideoMessageDto.processing && this.converting == messagesMessageAttachmentVideoMessageDto.converting && epx.f(this.restriction, messagesMessageAttachmentVideoMessageDto.restriction) && this.added == messagesMessageAttachmentVideoMessageDto.added && this.isSubscribed == messagesMessageAttachmentVideoMessageDto.isSubscribed && epx.f(this.trackCode, messagesMessageAttachmentVideoMessageDto.trackCode) && epx.f(this.trackingInfo, messagesMessageAttachmentVideoMessageDto.trackingInfo) && this.repeat == messagesMessageAttachmentVideoMessageDto.repeat && epx.f(this.partnerText, messagesMessageAttachmentVideoMessageDto.partnerText) && this.type == messagesMessageAttachmentVideoMessageDto.type && epx.f(this.views, messagesMessageAttachmentVideoMessageDto.views) && epx.f(this.localViews, messagesMessageAttachmentVideoMessageDto.localViews) && epx.f(this.contentRestricted, messagesMessageAttachmentVideoMessageDto.contentRestricted) && epx.f(this.contentRestrictedMessage, messagesMessageAttachmentVideoMessageDto.contentRestrictedMessage) && epx.f(this.albumId, messagesMessageAttachmentVideoMessageDto.albumId) && epx.f(this.context, messagesMessageAttachmentVideoMessageDto.context) && epx.f(this.balance, messagesMessageAttachmentVideoMessageDto.balance) && this.liveStatus == messagesMessageAttachmentVideoMessageDto.liveStatus && epx.f(this.liveStartTime, messagesMessageAttachmentVideoMessageDto.liveStartTime) && this.liveNotify == messagesMessageAttachmentVideoMessageDto.liveNotify && epx.f(this.spectators, messagesMessageAttachmentVideoMessageDto.spectators) && epx.f(this.platform, messagesMessageAttachmentVideoMessageDto.platform) && epx.f(this.likes, messagesMessageAttachmentVideoMessageDto.likes) && epx.f(this.reposts, messagesMessageAttachmentVideoMessageDto.reposts) && epx.f(this.moderationStatus, messagesMessageAttachmentVideoMessageDto.moderationStatus) && this.needMute == messagesMessageAttachmentVideoMessageDto.needMute && this.isUnitedVideo == messagesMessageAttachmentVideoMessageDto.isUnitedVideo && epx.f(this.umaTrackId, messagesMessageAttachmentVideoMessageDto.umaTrackId) && epx.f(this.ovProviderId, messagesMessageAttachmentVideoMessageDto.ovProviderId) && epx.f(this.randomTag, messagesMessageAttachmentVideoMessageDto.randomTag) && epx.f(this.uvStatsPlace, messagesMessageAttachmentVideoMessageDto.uvStatsPlace) && epx.f(this.server, messagesMessageAttachmentVideoMessageDto.server) && epx.f(this.isMobileLive, messagesMessageAttachmentVideoMessageDto.isMobileLive) && epx.f(this.isSpherical, messagesMessageAttachmentVideoMessageDto.isSpherical) && this.canDislike == messagesMessageAttachmentVideoMessageDto.canDislike && epx.f(this.titleAction, messagesMessageAttachmentVideoMessageDto.titleAction) && epx.f(this.publishedAt, messagesMessageAttachmentVideoMessageDto.publishedAt) && epx.f(this.thumbHash, messagesMessageAttachmentVideoMessageDto.thumbHash) && epx.f(this.accessInfo, messagesMessageAttachmentVideoMessageDto.accessInfo) && epx.f(this.wallPostId, messagesMessageAttachmentVideoMessageDto.wallPostId) && epx.f(this.adsStatPixels, messagesMessageAttachmentVideoMessageDto.adsStatPixels) && epx.f(this.donutLevelId, messagesMessageAttachmentVideoMessageDto.donutLevelId) && epx.f(this.promoPostHash, messagesMessageAttachmentVideoMessageDto.promoPostHash) && epx.f(this.shouldStretch, messagesMessageAttachmentVideoMessageDto.shouldStretch) && epx.f(this.vkLiveChannelUrl, messagesMessageAttachmentVideoMessageDto.vkLiveChannelUrl) && epx.f(this.vkLiveChannelName, messagesMessageAttachmentVideoMessageDto.vkLiveChannelName) && epx.f(this.vkLiveVideoId, messagesMessageAttachmentVideoMessageDto.vkLiveVideoId) && epx.f(this.vkLiveSlotUrl, messagesMessageAttachmentVideoMessageDto.vkLiveSlotUrl) && epx.f(this.donut, messagesMessageAttachmentVideoMessageDto.donut) && this.canReport == messagesMessageAttachmentVideoMessageDto.canReport && this.canCutToShortVideo == messagesMessageAttachmentVideoMessageDto.canCutToShortVideo && this.isExplicit == messagesMessageAttachmentVideoMessageDto.isExplicit && epx.f(this.mainArtists, messagesMessageAttachmentVideoMessageDto.mainArtists) && epx.f(this.featuredArtists, messagesMessageAttachmentVideoMessageDto.featuredArtists) && epx.f(this.subtitle, messagesMessageAttachmentVideoMessageDto.subtitle) && epx.f(this.releaseDate, messagesMessageAttachmentVideoMessageDto.releaseDate) && epx.f(this.genres, messagesMessageAttachmentVideoMessageDto.genres);
    }

    public final int hashCode() {
        Integer num = this.shapeId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.transcript;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TranscriptStateDto transcriptStateDto = this.transcriptState;
        int hashCode3 = (hashCode2 + (transcriptStateDto == null ? 0 : transcriptStateDto.hashCode())) * 31;
        Integer num2 = this.transcriptError;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.transcriptUpdateTime;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        VideoVideoFilesDto videoVideoFilesDto = this.files;
        int hashCode6 = (hashCode5 + (videoVideoFilesDto == null ? 0 : videoVideoFilesDto.hashCode())) * 31;
        VideoVideoFilesDto videoVideoFilesDto2 = this.trailer;
        int hashCode7 = (hashCode6 + (videoVideoFilesDto2 == null ? 0 : videoVideoFilesDto2.hashCode())) * 31;
        List<VideoEpisodeDto> list = this.episodes;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoQualityInfoDto> list2 = this.qualitiesInfo;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Float f = this.volumeMultiplier;
        int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        VideoLiveSettingsDto videoLiveSettingsDto = this.liveSettings;
        int hashCode11 = (hashCode10 + (videoLiveSettingsDto == null ? 0 : videoLiveSettingsDto.hashCode())) * 31;
        BasePrivacyDto basePrivacyDto = this.privacyView;
        int hashCode12 = (hashCode11 + (basePrivacyDto == null ? 0 : basePrivacyDto.hashCode())) * 31;
        BasePrivacyDto basePrivacyDto2 = this.privacyComment;
        int hashCode13 = (hashCode12 + (basePrivacyDto2 == null ? 0 : basePrivacyDto2.hashCode())) * 31;
        VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto = this.privacyCutToShortVideo;
        int hashCode14 = (hashCode13 + (videoPrivacyCutToShortVideoDto == null ? 0 : videoPrivacyCutToShortVideoDto.hashCode())) * 31;
        VideoTimelineThumbsDto videoTimelineThumbsDto = this.timelineThumbs;
        int hashCode15 = (hashCode14 + (videoTimelineThumbsDto == null ? 0 : videoTimelineThumbsDto.hashCode())) * 31;
        VideoAdsDto videoAdsDto = this.ads;
        int hashCode16 = (hashCode15 + (videoAdsDto == null ? 0 : videoAdsDto.hashCode())) * 31;
        ActionLinksActionDto actionLinksActionDto = this.actionButton;
        int hashCode17 = (hashCode16 + (actionLinksActionDto == null ? 0 : actionLinksActionDto.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.hasSubtitles;
        int hashCode18 = (hashCode17 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        List<VideoSubtitlesDto> list3 = this.subtitles;
        int hashCode19 = (hashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.forceSubtitles;
        int hashCode20 = (hashCode19 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.needMyTracker;
        int hashCode21 = (hashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canSeeUma;
        int hashCode22 = (hashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canBePinned;
        int hashCode23 = (hashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isPinned;
        int hashCode24 = (hashCode23 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasMarketItems;
        int hashCode25 = (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.marketItemsCount;
        int hashCode26 = (hashCode25 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.sourceFileName;
        int hashCode27 = (hashCode26 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto = this.shortVideoInfo;
        int hashCode28 = (hashCode27 + (shortVideoShortVideoInfoDto == null ? 0 : shortVideoShortVideoInfoDto.hashCode())) * 31;
        List<VideoStatsPixelDto> list4 = this.statsPixels;
        int hashCode29 = (hashCode28 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool6 = this.needMediascopeStat;
        int hashCode30 = (hashCode29 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num5 = this.viewedDuration;
        int hashCode31 = (hashCode30 + (num5 == null ? 0 : num5.hashCode())) * 31;
        VideoOriginalsInfoDto videoOriginalsInfoDto = this.originalsInfo;
        int hashCode32 = (hashCode31 + (videoOriginalsInfoDto == null ? 0 : videoOriginalsInfoDto.hashCode())) * 31;
        VideoDeduplicationOriginalDto videoDeduplicationOriginalDto = this.deduplicationOriginalInfo;
        int hashCode33 = (hashCode32 + (videoDeduplicationOriginalDto == null ? 0 : videoDeduplicationOriginalDto.hashCode())) * 31;
        Integer num6 = this.source;
        int hashCode34 = (hashCode33 + (num6 == null ? 0 : num6.hashCode())) * 31;
        UserId userId = this.sourceOwner;
        int hashCode35 = (hashCode34 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        ServerEffectDto serverEffectDto = this.serverEffect;
        int hashCode36 = (hashCode35 + (serverEffectDto == null ? 0 : serverEffectDto.hashCode())) * 31;
        String str4 = this.md5;
        int hashCode37 = (hashCode36 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TargetDto targetDto = this.target;
        int hashCode38 = (hashCode37 + (targetDto == null ? 0 : targetDto.hashCode())) * 31;
        VideoInteractiveInfoDto videoInteractiveInfoDto = this.interactiveInfo;
        int hashCode39 = (hashCode38 + (videoInteractiveInfoDto == null ? 0 : videoInteractiveInfoDto.hashCode())) * 31;
        VideoOrdInfoDto videoOrdInfoDto = this.ordInfo;
        int hashCode40 = (hashCode39 + (videoOrdInfoDto == null ? 0 : videoOrdInfoDto.hashCode())) * 31;
        List<VideoVideoFullDto> list5 = this.attachedShortVideos;
        int hashCode41 = (hashCode40 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num7 = this.attachedShortVideosCounter;
        int hashCode42 = (hashCode41 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str5 = this.directUrl;
        int hashCode43 = (hashCode42 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.shareUrl;
        int hashCode44 = (hashCode43 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ResponseTypeDto responseTypeDto = this.responseType;
        int hashCode45 = (hashCode44 + (responseTypeDto == null ? 0 : responseTypeDto.hashCode())) * 31;
        String str7 = this.accessKey;
        int hashCode46 = (hashCode45 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num8 = this.addingDate;
        int hashCode47 = (hashCode46 + (num8 == null ? 0 : num8.hashCode())) * 31;
        VideoAdsInfoDto videoAdsInfoDto = this.adsInfo;
        int hashCode48 = (hashCode47 + (videoAdsInfoDto == null ? 0 : videoAdsInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        int hashCode49 = (hashCode48 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canEdit;
        int hashCode50 = (hashCode49 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canDelete;
        int hashCode51 = (hashCode50 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canLike;
        int hashCode52 = (hashCode51 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        Integer num9 = this.canRepost;
        int hashCode53 = (hashCode52 + (num9 == null ? 0 : num9.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canSubscribe;
        int hashCode54 = (hashCode53 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canBePromoted;
        int hashCode55 = (hashCode54 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canAddToFaves;
        int hashCode56 = (hashCode55 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.canAdd;
        int hashCode57 = (hashCode56 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.canAttachLink;
        int hashCode58 = (hashCode57 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.canPlayInBackground;
        int hashCode59 = (hashCode58 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        Integer num10 = this.canDownload;
        int hashCode60 = (hashCode59 + (num10 == null ? 0 : num10.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.canEditPrivacy;
        int hashCode61 = (hashCode60 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canRemoveFromRecommendations;
        int hashCode62 = (hashCode61 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        VideoVideoDownloadDto videoVideoDownloadDto = this.download;
        int hashCode63 = (hashCode62 + (videoVideoDownloadDto == null ? 0 : videoVideoDownloadDto.hashCode())) * 31;
        List<VideoLinkedToPlaylistMarkDto> list6 = this.linkedToPlaylistMarks;
        int hashCode64 = (hashCode63 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Boolean bool7 = this.isArchivalContent;
        int hashCode65 = (hashCode64 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num11 = this.archivalContentPublishedDate;
        int hashCode66 = (hashCode65 + (num11 == null ? 0 : num11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.isPrivate;
        int hashCode67 = (hashCode66 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.isFromMessage;
        int hashCode68 = (hashCode67 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.isDraft;
        int hashCode69 = (hashCode68 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        Integer num12 = this.comments;
        int hashCode70 = (hashCode69 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.date;
        int hashCode71 = (hashCode70 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str8 = this.description;
        int hashCode72 = (hashCode71 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num14 = this.duration;
        int hashCode73 = (hashCode72 + (num14 == null ? 0 : num14.hashCode())) * 31;
        List<VideoVideoImageDto> list7 = this.image;
        int hashCode74 = (hashCode73 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<VideoVideoImageDto> list8 = this.firstFrame;
        int hashCode75 = (hashCode74 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Integer num15 = this.width;
        int hashCode76 = (hashCode75 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.height;
        int hashCode77 = (hashCode76 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.id;
        int hashCode78 = (hashCode77 + (num17 == null ? 0 : num17.hashCode())) * 31;
        UserId userId2 = this.ownerId;
        int hashCode79 = (hashCode78 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        UserId userId3 = this.userId;
        int hashCode80 = (hashCode79 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
        Boolean bool8 = this.isAuthor;
        int hashCode81 = (hashCode80 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str9 = this.ovId;
        int hashCode82 = (hashCode81 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.title;
        int hashCode83 = (hashCode82 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool9 = this.isFavorite;
        int hashCode84 = (hashCode83 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto2 = this.noAutoplay;
        int hashCode85 = (hashCode84 + (basePropertyExistsDto2 == null ? 0 : basePropertyExistsDto2.hashCode())) * 31;
        String str11 = this.player;
        int hashCode86 = (hashCode85 + (str11 == null ? 0 : str11.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto3 = this.processing;
        int hashCode87 = (hashCode86 + (basePropertyExistsDto3 == null ? 0 : basePropertyExistsDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.converting;
        int hashCode88 = (hashCode87 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        MediaRestrictionDto mediaRestrictionDto = this.restriction;
        int hashCode89 = (hashCode88 + (mediaRestrictionDto == null ? 0 : mediaRestrictionDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.added;
        int hashCode90 = (hashCode89 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.isSubscribed;
        int hashCode91 = (hashCode90 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        String str12 = this.trackCode;
        int hashCode92 = (hashCode91 + (str12 == null ? 0 : str12.hashCode())) * 31;
        VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = this.trackingInfo;
        int hashCode93 = (hashCode92 + (videoVideoTrackingInfoDto == null ? 0 : videoVideoTrackingInfoDto.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto4 = this.repeat;
        int hashCode94 = (hashCode93 + (basePropertyExistsDto4 == null ? 0 : basePropertyExistsDto4.hashCode())) * 31;
        String str13 = this.partnerText;
        int hashCode95 = (hashCode94 + (str13 == null ? 0 : str13.hashCode())) * 31;
        VideoVideoTypeDto videoVideoTypeDto = this.type;
        int hashCode96 = (hashCode95 + (videoVideoTypeDto == null ? 0 : videoVideoTypeDto.hashCode())) * 31;
        Integer num18 = this.views;
        int hashCode97 = (hashCode96 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.localViews;
        int hashCode98 = (hashCode97 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.contentRestricted;
        int hashCode99 = (hashCode98 + (num20 == null ? 0 : num20.hashCode())) * 31;
        String str14 = this.contentRestrictedMessage;
        int hashCode100 = (hashCode99 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num21 = this.albumId;
        int hashCode101 = (hashCode100 + (num21 == null ? 0 : num21.hashCode())) * 31;
        String str15 = this.context;
        int hashCode102 = (hashCode101 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num22 = this.balance;
        int hashCode103 = (hashCode102 + (num22 == null ? 0 : num22.hashCode())) * 31;
        VideoLiveStatusDto videoLiveStatusDto = this.liveStatus;
        int hashCode104 = (hashCode103 + (videoLiveStatusDto == null ? 0 : videoLiveStatusDto.hashCode())) * 31;
        Integer num23 = this.liveStartTime;
        int hashCode105 = (hashCode104 + (num23 == null ? 0 : num23.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.liveNotify;
        int hashCode106 = (hashCode105 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        Integer num24 = this.spectators;
        int hashCode107 = (hashCode106 + (num24 == null ? 0 : num24.hashCode())) * 31;
        String str16 = this.platform;
        int hashCode108 = (hashCode107 + (str16 == null ? 0 : str16.hashCode())) * 31;
        BaseLikesDto baseLikesDto = this.likes;
        int hashCode109 = (hashCode108 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode110 = (hashCode109 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        Integer num25 = this.moderationStatus;
        int hashCode111 = (hashCode110 + (num25 == null ? 0 : num25.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto5 = this.needMute;
        int hashCode112 = (hashCode111 + (basePropertyExistsDto5 == null ? 0 : basePropertyExistsDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.isUnitedVideo;
        int hashCode113 = (hashCode112 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        Integer num26 = this.umaTrackId;
        int hashCode114 = (hashCode113 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.ovProviderId;
        int hashCode115 = (hashCode114 + (num27 == null ? 0 : num27.hashCode())) * 31;
        String str17 = this.randomTag;
        int hashCode116 = (hashCode115 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.uvStatsPlace;
        int hashCode117 = (hashCode116 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Integer num28 = this.server;
        int hashCode118 = (hashCode117 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Boolean bool10 = this.isMobileLive;
        int hashCode119 = (hashCode118 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isSpherical;
        int hashCode120 = (hashCode119 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.canDislike;
        int hashCode121 = (hashCode120 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        ActionLinksActionDto actionLinksActionDto2 = this.titleAction;
        int hashCode122 = (hashCode121 + (actionLinksActionDto2 == null ? 0 : actionLinksActionDto2.hashCode())) * 31;
        Integer num29 = this.publishedAt;
        int hashCode123 = (hashCode122 + (num29 == null ? 0 : num29.hashCode())) * 31;
        String str19 = this.thumbHash;
        int hashCode124 = (hashCode123 + (str19 == null ? 0 : str19.hashCode())) * 31;
        VideoAccessInfoDto videoAccessInfoDto = this.accessInfo;
        int hashCode125 = (hashCode124 + (videoAccessInfoDto == null ? 0 : videoAccessInfoDto.hashCode())) * 31;
        Integer num30 = this.wallPostId;
        int hashCode126 = (hashCode125 + (num30 == null ? 0 : num30.hashCode())) * 31;
        List<AdsItemBlockAdStatPixelDto> list9 = this.adsStatPixels;
        int hashCode127 = (hashCode126 + (list9 == null ? 0 : list9.hashCode())) * 31;
        Integer num31 = this.donutLevelId;
        int hashCode128 = (hashCode127 + (num31 == null ? 0 : num31.hashCode())) * 31;
        String str20 = this.promoPostHash;
        int hashCode129 = (hashCode128 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Boolean bool12 = this.shouldStretch;
        int hashCode130 = (hashCode129 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str21 = this.vkLiveChannelUrl;
        int hashCode131 = (hashCode130 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.vkLiveChannelName;
        int hashCode132 = (hashCode131 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.vkLiveVideoId;
        int hashCode133 = (hashCode132 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.vkLiveSlotUrl;
        int hashCode134 = (hashCode133 + (str24 == null ? 0 : str24.hashCode())) * 31;
        VideoDonutDto videoDonutDto = this.donut;
        int hashCode135 = (hashCode134 + (videoDonutDto == null ? 0 : videoDonutDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto22 = this.canReport;
        int hashCode136 = (hashCode135 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto23 = this.canCutToShortVideo;
        int hashCode137 = (hashCode136 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto24 = this.isExplicit;
        int hashCode138 = (hashCode137 + (baseBoolIntDto24 == null ? 0 : baseBoolIntDto24.hashCode())) * 31;
        List<AudioArtistDto> list10 = this.mainArtists;
        int hashCode139 = (hashCode138 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<AudioArtistDto> list11 = this.featuredArtists;
        int hashCode140 = (hashCode139 + (list11 == null ? 0 : list11.hashCode())) * 31;
        String str25 = this.subtitle;
        int hashCode141 = (hashCode140 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Integer num32 = this.releaseDate;
        int hashCode142 = (hashCode141 + (num32 == null ? 0 : num32.hashCode())) * 31;
        List<AudioGenreDto> list12 = this.genres;
        return hashCode142 + (list12 != null ? list12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageAttachmentVideoMessageDto(shapeId=");
        sb.append(this.shapeId);
        sb.append(", transcript=");
        sb.append(this.transcript);
        sb.append(", transcriptState=");
        sb.append(this.transcriptState);
        sb.append(", transcriptError=");
        sb.append(this.transcriptError);
        sb.append(", transcriptUpdateTime=");
        sb.append(this.transcriptUpdateTime);
        sb.append(", files=");
        sb.append(this.files);
        sb.append(", trailer=");
        sb.append(this.trailer);
        sb.append(", episodes=");
        sb.append(this.episodes);
        sb.append(", qualitiesInfo=");
        sb.append(this.qualitiesInfo);
        sb.append(", volumeMultiplier=");
        sb.append(this.volumeMultiplier);
        sb.append(", liveSettings=");
        sb.append(this.liveSettings);
        sb.append(", privacyView=");
        sb.append(this.privacyView);
        sb.append(", privacyComment=");
        sb.append(this.privacyComment);
        sb.append(", privacyCutToShortVideo=");
        sb.append(this.privacyCutToShortVideo);
        sb.append(", timelineThumbs=");
        sb.append(this.timelineThumbs);
        sb.append(", ads=");
        sb.append(this.ads);
        sb.append(", actionButton=");
        sb.append(this.actionButton);
        sb.append(", hasSubtitles=");
        sb.append(this.hasSubtitles);
        sb.append(", subtitles=");
        sb.append(this.subtitles);
        sb.append(", forceSubtitles=");
        sb.append(this.forceSubtitles);
        sb.append(", needMyTracker=");
        sb.append(this.needMyTracker);
        sb.append(", canSeeUma=");
        sb.append(this.canSeeUma);
        sb.append(", canBePinned=");
        sb.append(this.canBePinned);
        sb.append(", isPinned=");
        sb.append(this.isPinned);
        sb.append(", hasMarketItems=");
        sb.append(this.hasMarketItems);
        sb.append(", marketItemsCount=");
        sb.append(this.marketItemsCount);
        sb.append(", sourceFileName=");
        sb.append(this.sourceFileName);
        sb.append(", shortVideoInfo=");
        sb.append(this.shortVideoInfo);
        sb.append(", statsPixels=");
        sb.append(this.statsPixels);
        sb.append(", needMediascopeStat=");
        sb.append(this.needMediascopeStat);
        sb.append(", viewedDuration=");
        sb.append(this.viewedDuration);
        sb.append(", originalsInfo=");
        sb.append(this.originalsInfo);
        sb.append(", deduplicationOriginalInfo=");
        sb.append(this.deduplicationOriginalInfo);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", sourceOwner=");
        sb.append(this.sourceOwner);
        sb.append(", serverEffect=");
        sb.append(this.serverEffect);
        sb.append(", md5=");
        sb.append(this.md5);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", interactiveInfo=");
        sb.append(this.interactiveInfo);
        sb.append(", ordInfo=");
        sb.append(this.ordInfo);
        sb.append(", attachedShortVideos=");
        sb.append(this.attachedShortVideos);
        sb.append(", attachedShortVideosCounter=");
        sb.append(this.attachedShortVideosCounter);
        sb.append(", directUrl=");
        sb.append(this.directUrl);
        sb.append(", shareUrl=");
        sb.append(this.shareUrl);
        sb.append(", responseType=");
        sb.append(this.responseType);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", addingDate=");
        sb.append(this.addingDate);
        sb.append(", adsInfo=");
        sb.append(this.adsInfo);
        sb.append(", canComment=");
        sb.append(this.canComment);
        sb.append(", canEdit=");
        sb.append(this.canEdit);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", canLike=");
        sb.append(this.canLike);
        sb.append(", canRepost=");
        sb.append(this.canRepost);
        sb.append(", canSubscribe=");
        sb.append(this.canSubscribe);
        sb.append(", canBePromoted=");
        sb.append(this.canBePromoted);
        sb.append(", canAddToFaves=");
        sb.append(this.canAddToFaves);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", canAttachLink=");
        sb.append(this.canAttachLink);
        sb.append(", canPlayInBackground=");
        sb.append(this.canPlayInBackground);
        sb.append(", canDownload=");
        sb.append(this.canDownload);
        sb.append(", canEditPrivacy=");
        sb.append(this.canEditPrivacy);
        sb.append(", canRemoveFromRecommendations=");
        sb.append(this.canRemoveFromRecommendations);
        sb.append(", download=");
        sb.append(this.download);
        sb.append(", linkedToPlaylistMarks=");
        sb.append(this.linkedToPlaylistMarks);
        sb.append(", isArchivalContent=");
        sb.append(this.isArchivalContent);
        sb.append(", archivalContentPublishedDate=");
        sb.append(this.archivalContentPublishedDate);
        sb.append(", isPrivate=");
        sb.append(this.isPrivate);
        sb.append(", isFromMessage=");
        sb.append(this.isFromMessage);
        sb.append(", isDraft=");
        sb.append(this.isDraft);
        sb.append(", comments=");
        sb.append(this.comments);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", firstFrame=");
        sb.append(this.firstFrame);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", isAuthor=");
        sb.append(this.isAuthor);
        sb.append(", ovId=");
        sb.append(this.ovId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", noAutoplay=");
        sb.append(this.noAutoplay);
        sb.append(", player=");
        sb.append(this.player);
        sb.append(", processing=");
        sb.append(this.processing);
        sb.append(", converting=");
        sb.append(this.converting);
        sb.append(", restriction=");
        sb.append(this.restriction);
        sb.append(", added=");
        sb.append(this.added);
        sb.append(", isSubscribed=");
        sb.append(this.isSubscribed);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", trackingInfo=");
        sb.append(this.trackingInfo);
        sb.append(", repeat=");
        sb.append(this.repeat);
        sb.append(", partnerText=");
        sb.append(this.partnerText);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", views=");
        sb.append(this.views);
        sb.append(", localViews=");
        sb.append(this.localViews);
        sb.append(", contentRestricted=");
        sb.append(this.contentRestricted);
        sb.append(", contentRestrictedMessage=");
        sb.append(this.contentRestrictedMessage);
        sb.append(", albumId=");
        sb.append(this.albumId);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", liveStatus=");
        sb.append(this.liveStatus);
        sb.append(", liveStartTime=");
        sb.append(this.liveStartTime);
        sb.append(", liveNotify=");
        sb.append(this.liveNotify);
        sb.append(", spectators=");
        sb.append(this.spectators);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", likes=");
        sb.append(this.likes);
        sb.append(", reposts=");
        sb.append(this.reposts);
        sb.append(", moderationStatus=");
        sb.append(this.moderationStatus);
        sb.append(", needMute=");
        sb.append(this.needMute);
        sb.append(", isUnitedVideo=");
        sb.append(this.isUnitedVideo);
        sb.append(", umaTrackId=");
        sb.append(this.umaTrackId);
        sb.append(", ovProviderId=");
        sb.append(this.ovProviderId);
        sb.append(", randomTag=");
        sb.append(this.randomTag);
        sb.append(", uvStatsPlace=");
        sb.append(this.uvStatsPlace);
        sb.append(", server=");
        sb.append(this.server);
        sb.append(", isMobileLive=");
        sb.append(this.isMobileLive);
        sb.append(", isSpherical=");
        sb.append(this.isSpherical);
        sb.append(", canDislike=");
        sb.append(this.canDislike);
        sb.append(", titleAction=");
        sb.append(this.titleAction);
        sb.append(", publishedAt=");
        sb.append(this.publishedAt);
        sb.append(", thumbHash=");
        sb.append(this.thumbHash);
        sb.append(", accessInfo=");
        sb.append(this.accessInfo);
        sb.append(", wallPostId=");
        sb.append(this.wallPostId);
        sb.append(", adsStatPixels=");
        sb.append(this.adsStatPixels);
        sb.append(", donutLevelId=");
        sb.append(this.donutLevelId);
        sb.append(", promoPostHash=");
        sb.append(this.promoPostHash);
        sb.append(", shouldStretch=");
        sb.append(this.shouldStretch);
        sb.append(", vkLiveChannelUrl=");
        sb.append(this.vkLiveChannelUrl);
        sb.append(", vkLiveChannelName=");
        sb.append(this.vkLiveChannelName);
        sb.append(", vkLiveVideoId=");
        sb.append(this.vkLiveVideoId);
        sb.append(", vkLiveSlotUrl=");
        sb.append(this.vkLiveSlotUrl);
        sb.append(", donut=");
        sb.append(this.donut);
        sb.append(", canReport=");
        sb.append(this.canReport);
        sb.append(", canCutToShortVideo=");
        sb.append(this.canCutToShortVideo);
        sb.append(", isExplicit=");
        sb.append(this.isExplicit);
        sb.append(", mainArtists=");
        sb.append(this.mainArtists);
        sb.append(", featuredArtists=");
        sb.append(this.featuredArtists);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", releaseDate=");
        sb.append(this.releaseDate);
        sb.append(", genres=");
        return ms9.a(')', sb, this.genres);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.shapeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.transcript);
        TranscriptStateDto transcriptStateDto = this.transcriptState;
        if (transcriptStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transcriptStateDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.transcriptError;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.transcriptUpdateTime;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.files, i);
        parcel.writeParcelable(this.trailer, i);
        List<VideoEpisodeDto> list = this.episodes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<VideoQualityInfoDto> list2 = this.qualitiesInfo;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Float f3 = this.volumeMultiplier;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.d(parcel, 1, f3);
        }
        parcel.writeParcelable(this.liveSettings, i);
        parcel.writeParcelable(this.privacyView, i);
        parcel.writeParcelable(this.privacyComment, i);
        parcel.writeParcelable(this.privacyCutToShortVideo, i);
        parcel.writeParcelable(this.timelineThumbs, i);
        parcel.writeParcelable(this.ads, i);
        parcel.writeParcelable(this.actionButton, i);
        parcel.writeParcelable(this.hasSubtitles, i);
        List<VideoSubtitlesDto> list3 = this.subtitles;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list3, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        parcel.writeString(this.forceSubtitles);
        Boolean bool = this.needMyTracker;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canSeeUma;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canBePinned;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isPinned;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.hasMarketItems;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Integer num4 = this.marketItemsCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.sourceFileName);
        parcel.writeParcelable(this.shortVideoInfo, i);
        List<VideoStatsPixelDto> list4 = this.statsPixels;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list4, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        Boolean bool6 = this.needMediascopeStat;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Integer num5 = this.viewedDuration;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeParcelable(this.originalsInfo, i);
        parcel.writeParcelable(this.deduplicationOriginalInfo, i);
        Integer num6 = this.source;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeParcelable(this.sourceOwner, i);
        ServerEffectDto serverEffectDto = this.serverEffect;
        if (serverEffectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serverEffectDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.md5);
        TargetDto targetDto = this.target;
        if (targetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            targetDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.interactiveInfo, i);
        parcel.writeParcelable(this.ordInfo, i);
        List<VideoVideoFullDto> list5 = this.attachedShortVideos;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list5, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        Integer num7 = this.attachedShortVideosCounter;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeString(this.directUrl);
        parcel.writeString(this.shareUrl);
        ResponseTypeDto responseTypeDto = this.responseType;
        if (responseTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            responseTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.accessKey);
        Integer num8 = this.addingDate;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeParcelable(this.adsInfo, i);
        parcel.writeParcelable(this.canComment, i);
        parcel.writeParcelable(this.canEdit, i);
        parcel.writeParcelable(this.canDelete, i);
        parcel.writeParcelable(this.canLike, i);
        Integer num9 = this.canRepost;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        parcel.writeParcelable(this.canSubscribe, i);
        parcel.writeParcelable(this.canBePromoted, i);
        parcel.writeParcelable(this.canAddToFaves, i);
        parcel.writeParcelable(this.canAdd, i);
        parcel.writeParcelable(this.canAttachLink, i);
        parcel.writeParcelable(this.canPlayInBackground, i);
        Integer num10 = this.canDownload;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        parcel.writeParcelable(this.canEditPrivacy, i);
        parcel.writeParcelable(this.canRemoveFromRecommendations, i);
        parcel.writeParcelable(this.download, i);
        List<VideoLinkedToPlaylistMarkDto> list6 = this.linkedToPlaylistMarks;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list6, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        Boolean bool7 = this.isArchivalContent;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Integer num11 = this.archivalContentPublishedDate;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        parcel.writeParcelable(this.isPrivate, i);
        parcel.writeParcelable(this.isFromMessage, i);
        parcel.writeParcelable(this.isDraft, i);
        Integer num12 = this.comments;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        Integer num13 = this.date;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
        parcel.writeString(this.description);
        Integer num14 = this.duration;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num14);
        }
        List<VideoVideoImageDto> list7 = this.image;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list7, 1);
            while (f8.hasNext()) {
                parcel.writeParcelable((Parcelable) f8.next(), i);
            }
        }
        List<VideoVideoImageDto> list8 = this.firstFrame;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list8, 1);
            while (f9.hasNext()) {
                parcel.writeParcelable((Parcelable) f9.next(), i);
            }
        }
        Integer num15 = this.width;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num15);
        }
        Integer num16 = this.height;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num16);
        }
        Integer num17 = this.id;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.userId, i);
        Boolean bool8 = this.isAuthor;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        parcel.writeString(this.ovId);
        parcel.writeString(this.title);
        Boolean bool9 = this.isFavorite;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        parcel.writeParcelable(this.noAutoplay, i);
        parcel.writeString(this.player);
        parcel.writeParcelable(this.processing, i);
        parcel.writeParcelable(this.converting, i);
        parcel.writeParcelable(this.restriction, i);
        parcel.writeParcelable(this.added, i);
        parcel.writeParcelable(this.isSubscribed, i);
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.trackingInfo, i);
        parcel.writeParcelable(this.repeat, i);
        parcel.writeString(this.partnerText);
        parcel.writeParcelable(this.type, i);
        Integer num18 = this.views;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num18);
        }
        Integer num19 = this.localViews;
        if (num19 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num19);
        }
        Integer num20 = this.contentRestricted;
        if (num20 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num20);
        }
        parcel.writeString(this.contentRestrictedMessage);
        Integer num21 = this.albumId;
        if (num21 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num21);
        }
        parcel.writeString(this.context);
        Integer num22 = this.balance;
        if (num22 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num22);
        }
        parcel.writeParcelable(this.liveStatus, i);
        Integer num23 = this.liveStartTime;
        if (num23 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num23);
        }
        parcel.writeParcelable(this.liveNotify, i);
        Integer num24 = this.spectators;
        if (num24 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num24);
        }
        parcel.writeString(this.platform);
        parcel.writeParcelable(this.likes, i);
        parcel.writeParcelable(this.reposts, i);
        Integer num25 = this.moderationStatus;
        if (num25 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num25);
        }
        parcel.writeParcelable(this.needMute, i);
        parcel.writeParcelable(this.isUnitedVideo, i);
        Integer num26 = this.umaTrackId;
        if (num26 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num26);
        }
        Integer num27 = this.ovProviderId;
        if (num27 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num27);
        }
        parcel.writeString(this.randomTag);
        parcel.writeString(this.uvStatsPlace);
        Integer num28 = this.server;
        if (num28 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num28);
        }
        Boolean bool10 = this.isMobileLive;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.isSpherical;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        parcel.writeParcelable(this.canDislike, i);
        parcel.writeParcelable(this.titleAction, i);
        Integer num29 = this.publishedAt;
        if (num29 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num29);
        }
        parcel.writeString(this.thumbHash);
        parcel.writeParcelable(this.accessInfo, i);
        Integer num30 = this.wallPostId;
        if (num30 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num30);
        }
        List<AdsItemBlockAdStatPixelDto> list9 = this.adsStatPixels;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list9, 1);
            while (f10.hasNext()) {
                parcel.writeParcelable((Parcelable) f10.next(), i);
            }
        }
        Integer num31 = this.donutLevelId;
        if (num31 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num31);
        }
        parcel.writeString(this.promoPostHash);
        Boolean bool12 = this.shouldStretch;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        parcel.writeString(this.vkLiveChannelUrl);
        parcel.writeString(this.vkLiveChannelName);
        parcel.writeString(this.vkLiveVideoId);
        parcel.writeString(this.vkLiveSlotUrl);
        parcel.writeParcelable(this.donut, i);
        parcel.writeParcelable(this.canReport, i);
        parcel.writeParcelable(this.canCutToShortVideo, i);
        parcel.writeParcelable(this.isExplicit, i);
        List<AudioArtistDto> list10 = this.mainArtists;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list10, 1);
            while (f11.hasNext()) {
                parcel.writeParcelable((Parcelable) f11.next(), i);
            }
        }
        List<AudioArtistDto> list11 = this.featuredArtists;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list11, 1);
            while (f12.hasNext()) {
                parcel.writeParcelable((Parcelable) f12.next(), i);
            }
        }
        parcel.writeString(this.subtitle);
        Integer num32 = this.releaseDate;
        if (num32 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num32);
        }
        List<AudioGenreDto> list12 = this.genres;
        if (list12 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f13 = dn.f(parcel, list12, 1);
        while (f13.hasNext()) {
            parcel.writeParcelable((Parcelable) f13.next(), i);
        }
    }

    public MessagesMessageAttachmentVideoMessageDto(Integer num, String str, TranscriptStateDto transcriptStateDto, Integer num2, Integer num3, VideoVideoFilesDto videoVideoFilesDto, VideoVideoFilesDto videoVideoFilesDto2, List<VideoEpisodeDto> list, List<VideoQualityInfoDto> list2, Float f, VideoLiveSettingsDto videoLiveSettingsDto, BasePrivacyDto basePrivacyDto, BasePrivacyDto basePrivacyDto2, VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto, VideoTimelineThumbsDto videoTimelineThumbsDto, VideoAdsDto videoAdsDto, ActionLinksActionDto actionLinksActionDto, BasePropertyExistsDto basePropertyExistsDto, List<VideoSubtitlesDto> list3, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num4, String str3, ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto, List<VideoStatsPixelDto> list4, Boolean bool6, Integer num5, VideoOriginalsInfoDto videoOriginalsInfoDto, VideoDeduplicationOriginalDto videoDeduplicationOriginalDto, Integer num6, UserId userId, ServerEffectDto serverEffectDto, String str4, TargetDto targetDto, VideoInteractiveInfoDto videoInteractiveInfoDto, VideoOrdInfoDto videoOrdInfoDto, List<VideoVideoFullDto> list5, Integer num7, String str5, String str6, ResponseTypeDto responseTypeDto, String str7, Integer num8, VideoAdsInfoDto videoAdsInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num9, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, VideoVideoDownloadDto videoVideoDownloadDto, List<VideoLinkedToPlaylistMarkDto> list6, Boolean bool7, Integer num11, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, Integer num12, Integer num13, String str8, Integer num14, List<VideoVideoImageDto> list7, List<VideoVideoImageDto> list8, Integer num15, Integer num16, Integer num17, UserId userId2, UserId userId3, Boolean bool8, String str9, String str10, Boolean bool9, BasePropertyExistsDto basePropertyExistsDto2, String str11, BasePropertyExistsDto basePropertyExistsDto3, BaseBoolIntDto baseBoolIntDto16, MediaRestrictionDto mediaRestrictionDto, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, String str12, VideoVideoTrackingInfoDto videoVideoTrackingInfoDto, BasePropertyExistsDto basePropertyExistsDto4, String str13, VideoVideoTypeDto videoVideoTypeDto, Integer num18, Integer num19, Integer num20, String str14, Integer num21, String str15, Integer num22, VideoLiveStatusDto videoLiveStatusDto, Integer num23, BaseBoolIntDto baseBoolIntDto19, Integer num24, String str16, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num25, BasePropertyExistsDto basePropertyExistsDto5, BaseBoolIntDto baseBoolIntDto20, Integer num26, Integer num27, String str17, String str18, Integer num28, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto21, ActionLinksActionDto actionLinksActionDto2, Integer num29, String str19, VideoAccessInfoDto videoAccessInfoDto, Integer num30, List<AdsItemBlockAdStatPixelDto> list9, Integer num31, String str20, Boolean bool12, String str21, String str22, String str23, String str24, VideoDonutDto videoDonutDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, List<AudioArtistDto> list10, List<AudioArtistDto> list11, String str25, Integer num32, List<AudioGenreDto> list12) {
        this.shapeId = num;
        this.transcript = str;
        this.transcriptState = transcriptStateDto;
        this.transcriptError = num2;
        this.transcriptUpdateTime = num3;
        this.files = videoVideoFilesDto;
        this.trailer = videoVideoFilesDto2;
        this.episodes = list;
        this.qualitiesInfo = list2;
        this.volumeMultiplier = f;
        this.liveSettings = videoLiveSettingsDto;
        this.privacyView = basePrivacyDto;
        this.privacyComment = basePrivacyDto2;
        this.privacyCutToShortVideo = videoPrivacyCutToShortVideoDto;
        this.timelineThumbs = videoTimelineThumbsDto;
        this.ads = videoAdsDto;
        this.actionButton = actionLinksActionDto;
        this.hasSubtitles = basePropertyExistsDto;
        this.subtitles = list3;
        this.forceSubtitles = str2;
        this.needMyTracker = bool;
        this.canSeeUma = bool2;
        this.canBePinned = bool3;
        this.isPinned = bool4;
        this.hasMarketItems = bool5;
        this.marketItemsCount = num4;
        this.sourceFileName = str3;
        this.shortVideoInfo = shortVideoShortVideoInfoDto;
        this.statsPixels = list4;
        this.needMediascopeStat = bool6;
        this.viewedDuration = num5;
        this.originalsInfo = videoOriginalsInfoDto;
        this.deduplicationOriginalInfo = videoDeduplicationOriginalDto;
        this.source = num6;
        this.sourceOwner = userId;
        this.serverEffect = serverEffectDto;
        this.md5 = str4;
        this.target = targetDto;
        this.interactiveInfo = videoInteractiveInfoDto;
        this.ordInfo = videoOrdInfoDto;
        this.attachedShortVideos = list5;
        this.attachedShortVideosCounter = num7;
        this.directUrl = str5;
        this.shareUrl = str6;
        this.responseType = responseTypeDto;
        this.accessKey = str7;
        this.addingDate = num8;
        this.adsInfo = videoAdsInfoDto;
        this.canComment = baseBoolIntDto;
        this.canEdit = baseBoolIntDto2;
        this.canDelete = baseBoolIntDto3;
        this.canLike = baseBoolIntDto4;
        this.canRepost = num9;
        this.canSubscribe = baseBoolIntDto5;
        this.canBePromoted = baseBoolIntDto6;
        this.canAddToFaves = baseBoolIntDto7;
        this.canAdd = baseBoolIntDto8;
        this.canAttachLink = baseBoolIntDto9;
        this.canPlayInBackground = baseBoolIntDto10;
        this.canDownload = num10;
        this.canEditPrivacy = baseBoolIntDto11;
        this.canRemoveFromRecommendations = baseBoolIntDto12;
        this.download = videoVideoDownloadDto;
        this.linkedToPlaylistMarks = list6;
        this.isArchivalContent = bool7;
        this.archivalContentPublishedDate = num11;
        this.isPrivate = baseBoolIntDto13;
        this.isFromMessage = baseBoolIntDto14;
        this.isDraft = baseBoolIntDto15;
        this.comments = num12;
        this.date = num13;
        this.description = str8;
        this.duration = num14;
        this.image = list7;
        this.firstFrame = list8;
        this.width = num15;
        this.height = num16;
        this.id = num17;
        this.ownerId = userId2;
        this.userId = userId3;
        this.isAuthor = bool8;
        this.ovId = str9;
        this.title = str10;
        this.isFavorite = bool9;
        this.noAutoplay = basePropertyExistsDto2;
        this.player = str11;
        this.processing = basePropertyExistsDto3;
        this.converting = baseBoolIntDto16;
        this.restriction = mediaRestrictionDto;
        this.added = baseBoolIntDto17;
        this.isSubscribed = baseBoolIntDto18;
        this.trackCode = str12;
        this.trackingInfo = videoVideoTrackingInfoDto;
        this.repeat = basePropertyExistsDto4;
        this.partnerText = str13;
        this.type = videoVideoTypeDto;
        this.views = num18;
        this.localViews = num19;
        this.contentRestricted = num20;
        this.contentRestrictedMessage = str14;
        this.albumId = num21;
        this.context = str15;
        this.balance = num22;
        this.liveStatus = videoLiveStatusDto;
        this.liveStartTime = num23;
        this.liveNotify = baseBoolIntDto19;
        this.spectators = num24;
        this.platform = str16;
        this.likes = baseLikesDto;
        this.reposts = baseRepostsInfoDto;
        this.moderationStatus = num25;
        this.needMute = basePropertyExistsDto5;
        this.isUnitedVideo = baseBoolIntDto20;
        this.umaTrackId = num26;
        this.ovProviderId = num27;
        this.randomTag = str17;
        this.uvStatsPlace = str18;
        this.server = num28;
        this.isMobileLive = bool10;
        this.isSpherical = bool11;
        this.canDislike = baseBoolIntDto21;
        this.titleAction = actionLinksActionDto2;
        this.publishedAt = num29;
        this.thumbHash = str19;
        this.accessInfo = videoAccessInfoDto;
        this.wallPostId = num30;
        this.adsStatPixels = list9;
        this.donutLevelId = num31;
        this.promoPostHash = str20;
        this.shouldStretch = bool12;
        this.vkLiveChannelUrl = str21;
        this.vkLiveChannelName = str22;
        this.vkLiveVideoId = str23;
        this.vkLiveSlotUrl = str24;
        this.donut = videoDonutDto;
        this.canReport = baseBoolIntDto22;
        this.canCutToShortVideo = baseBoolIntDto23;
        this.isExplicit = baseBoolIntDto24;
        this.mainArtists = list10;
        this.featuredArtists = list11;
        this.subtitle = str25;
        this.releaseDate = num32;
        this.genres = list12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MessagesMessageAttachmentVideoMessageDto(Integer num, String str, TranscriptStateDto transcriptStateDto, Integer num2, Integer num3, VideoVideoFilesDto videoVideoFilesDto, VideoVideoFilesDto videoVideoFilesDto2, List list, List list2, Float f, VideoLiveSettingsDto videoLiveSettingsDto, BasePrivacyDto basePrivacyDto, BasePrivacyDto basePrivacyDto2, VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto, VideoTimelineThumbsDto videoTimelineThumbsDto, VideoAdsDto videoAdsDto, ActionLinksActionDto actionLinksActionDto, BasePropertyExistsDto basePropertyExistsDto, List list3, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num4, String str3, ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto, List list4, Boolean bool6, Integer num5, VideoOriginalsInfoDto videoOriginalsInfoDto, VideoDeduplicationOriginalDto videoDeduplicationOriginalDto, Integer num6, UserId userId, ServerEffectDto serverEffectDto, String str4, TargetDto targetDto, VideoInteractiveInfoDto videoInteractiveInfoDto, VideoOrdInfoDto videoOrdInfoDto, List list5, Integer num7, String str5, String str6, ResponseTypeDto responseTypeDto, String str7, Integer num8, VideoAdsInfoDto videoAdsInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num9, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, VideoVideoDownloadDto videoVideoDownloadDto, List list6, Boolean bool7, Integer num11, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, Integer num12, Integer num13, String str8, Integer num14, List list7, List list8, Integer num15, Integer num16, Integer num17, UserId userId2, UserId userId3, Boolean bool8, String str9, String str10, Boolean bool9, BasePropertyExistsDto basePropertyExistsDto2, String str11, BasePropertyExistsDto basePropertyExistsDto3, BaseBoolIntDto baseBoolIntDto16, MediaRestrictionDto mediaRestrictionDto, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, String str12, VideoVideoTrackingInfoDto videoVideoTrackingInfoDto, BasePropertyExistsDto basePropertyExistsDto4, String str13, VideoVideoTypeDto videoVideoTypeDto, Integer num18, Integer num19, Integer num20, String str14, Integer num21, String str15, Integer num22, VideoLiveStatusDto videoLiveStatusDto, Integer num23, BaseBoolIntDto baseBoolIntDto19, Integer num24, String str16, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num25, BasePropertyExistsDto basePropertyExistsDto5, BaseBoolIntDto baseBoolIntDto20, Integer num26, Integer num27, String str17, String str18, Integer num28, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto21, ActionLinksActionDto actionLinksActionDto2, Integer num29, String str19, VideoAccessInfoDto videoAccessInfoDto, Integer num30, List list9, Integer num31, String str20, Boolean bool12, String str21, String str22, String str23, String str24, VideoDonutDto videoDonutDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, List list10, List list11, String str25, Integer num32, List list12, int i, int i2, int i3, int i4, int i5, zcl zclVar) {
        this(r109, r7, r8, r9, r10, r11, r12, r13, r14, r15, r6, r110, r111, r112, r5, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r113, r38, r39, r40, r41, r42, r43, r44, r114, r115, r116, r117, r118, r119, r120, r121, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r1, r61, r62, r63, r64, r65, r66, r67, r122, r123, r124, r125, r126, r127, r128, r0, (i3 & 32768) != 0 ? null : userId3, (i3 & 65536) != 0 ? null : bool8, (i3 & 131072) != 0 ? null : str9, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str10, (i3 & 524288) != 0 ? null : bool9, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : basePropertyExistsDto2, (i3 & 2097152) != 0 ? null : str11, (i3 & 4194304) != 0 ? null : basePropertyExistsDto3, (i3 & 8388608) != 0 ? null : baseBoolIntDto16, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mediaRestrictionDto, (i3 & 33554432) != 0 ? null : baseBoolIntDto17, (i3 & 67108864) != 0 ? null : baseBoolIntDto18, (i3 & 134217728) != 0 ? null : str12, (i3 & 268435456) != 0 ? null : videoVideoTrackingInfoDto, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : basePropertyExistsDto4, (i3 & 1073741824) != 0 ? null : str13, (i3 & Integer.MIN_VALUE) != 0 ? null : videoVideoTypeDto, (i4 & 1) != 0 ? null : num18, (i4 & 2) != 0 ? null : num19, (i4 & 4) != 0 ? null : num20, (i4 & 8) != 0 ? null : str14, (i4 & 16) != 0 ? null : num21, (i4 & 32) != 0 ? null : str15, (i4 & 64) != 0 ? null : num22, (i4 & 128) != 0 ? null : videoLiveStatusDto, (i4 & 256) != 0 ? null : num23, (i4 & 512) != 0 ? null : baseBoolIntDto19, (i4 & 1024) != 0 ? null : num24, (i4 & 2048) != 0 ? null : str16, (i4 & 4096) != 0 ? null : baseLikesDto, (i4 & 8192) != 0 ? null : baseRepostsInfoDto, (i4 & 16384) != 0 ? null : num25, (i4 & 32768) != 0 ? null : basePropertyExistsDto5, (i4 & 65536) != 0 ? null : baseBoolIntDto20, (i4 & 131072) != 0 ? null : num26, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num27, (i4 & 524288) != 0 ? null : str17, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str18, (i4 & 2097152) != 0 ? null : num28, (i4 & 4194304) != 0 ? null : bool10, (i4 & 8388608) != 0 ? null : bool11, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto21, (i4 & 33554432) != 0 ? null : actionLinksActionDto2, (i4 & 67108864) != 0 ? null : num29, (i4 & 134217728) != 0 ? null : str19, (i4 & 268435456) != 0 ? null : videoAccessInfoDto, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num30, (i4 & 1073741824) != 0 ? null : list9, (i4 & Integer.MIN_VALUE) != 0 ? null : num31, (i5 & 1) != 0 ? null : str20, (i5 & 2) != 0 ? null : bool12, (i5 & 4) != 0 ? null : str21, (i5 & 8) != 0 ? null : str22, (i5 & 16) != 0 ? null : str23, (i5 & 32) != 0 ? null : str24, (i5 & 64) != 0 ? null : videoDonutDto, (i5 & 128) != 0 ? null : baseBoolIntDto22, (i5 & 256) != 0 ? null : baseBoolIntDto23, (i5 & 512) != 0 ? null : baseBoolIntDto24, (i5 & 1024) != 0 ? null : list10, (i5 & 2048) != 0 ? null : list11, (i5 & 4096) != 0 ? null : str25, (i5 & 8192) != 0 ? null : num32, (i5 & 16384) != 0 ? null : list12);
        Integer num33 = (i & 1) != 0 ? null : num;
        String str26 = (i & 2) != 0 ? null : str;
        TranscriptStateDto transcriptStateDto2 = (i & 4) != 0 ? null : transcriptStateDto;
        Integer num34 = (i & 8) != 0 ? null : num2;
        Integer num35 = (i & 16) != 0 ? null : num3;
        VideoVideoFilesDto videoVideoFilesDto3 = (i & 32) != 0 ? null : videoVideoFilesDto;
        VideoVideoFilesDto videoVideoFilesDto4 = (i & 64) != 0 ? null : videoVideoFilesDto2;
        List list13 = (i & 128) != 0 ? null : list;
        List list14 = (i & 256) != 0 ? null : list2;
        Float f2 = (i & 512) != 0 ? null : f;
        VideoLiveSettingsDto videoLiveSettingsDto2 = (i & 1024) != 0 ? null : videoLiveSettingsDto;
        Integer num36 = num33;
        BasePrivacyDto basePrivacyDto3 = (i & 2048) != 0 ? null : basePrivacyDto;
        BasePrivacyDto basePrivacyDto4 = (i & 4096) != 0 ? null : basePrivacyDto2;
        VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto2 = (i & 8192) != 0 ? null : videoPrivacyCutToShortVideoDto;
        VideoTimelineThumbsDto videoTimelineThumbsDto2 = (i & 16384) != 0 ? null : videoTimelineThumbsDto;
        VideoAdsDto videoAdsDto2 = (i & 32768) != 0 ? null : videoAdsDto;
        ActionLinksActionDto actionLinksActionDto3 = (i & 65536) != 0 ? null : actionLinksActionDto;
        BasePropertyExistsDto basePropertyExistsDto6 = (i & 131072) != 0 ? null : basePropertyExistsDto;
        List list15 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list3;
        String str27 = (i & 524288) != 0 ? null : str2;
        Boolean bool13 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool;
        Boolean bool14 = (i & 2097152) != 0 ? null : bool2;
        Boolean bool15 = (i & 4194304) != 0 ? null : bool3;
        Boolean bool16 = (i & 8388608) != 0 ? null : bool4;
        Boolean bool17 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool5;
        Integer num37 = (i & 33554432) != 0 ? null : num4;
        String str28 = (i & 67108864) != 0 ? null : str3;
        ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto2 = (i & 134217728) != 0 ? null : shortVideoShortVideoInfoDto;
        List list16 = (i & 268435456) != 0 ? null : list4;
        Boolean bool18 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool6;
        Integer num38 = (i & 1073741824) != 0 ? null : num5;
        VideoOriginalsInfoDto videoOriginalsInfoDto2 = (i & Integer.MIN_VALUE) != 0 ? null : videoOriginalsInfoDto;
        VideoDeduplicationOriginalDto videoDeduplicationOriginalDto2 = (i2 & 1) != 0 ? null : videoDeduplicationOriginalDto;
        Integer num39 = (i2 & 2) != 0 ? null : num6;
        UserId userId4 = (i2 & 4) != 0 ? null : userId;
        ServerEffectDto serverEffectDto2 = (i2 & 8) != 0 ? null : serverEffectDto;
        String str29 = (i2 & 16) != 0 ? null : str4;
        TargetDto targetDto2 = (i2 & 32) != 0 ? null : targetDto;
        VideoInteractiveInfoDto videoInteractiveInfoDto2 = (i2 & 64) != 0 ? null : videoInteractiveInfoDto;
        VideoOriginalsInfoDto videoOriginalsInfoDto3 = videoOriginalsInfoDto2;
        VideoOrdInfoDto videoOrdInfoDto2 = (i2 & 128) != 0 ? null : videoOrdInfoDto;
        List list17 = (i2 & 256) != 0 ? null : list5;
        Integer num40 = (i2 & 512) != 0 ? null : num7;
        String str30 = (i2 & 1024) != 0 ? null : str5;
        String str31 = (i2 & 2048) != 0 ? null : str6;
        ResponseTypeDto responseTypeDto2 = (i2 & 4096) != 0 ? null : responseTypeDto;
        String str32 = (i2 & 8192) != 0 ? null : str7;
        Integer num41 = (i2 & 16384) != 0 ? null : num8;
        VideoAdsInfoDto videoAdsInfoDto2 = (i2 & 32768) != 0 ? null : videoAdsInfoDto;
        BaseBoolIntDto baseBoolIntDto25 = (i2 & 65536) != 0 ? null : baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto26 = (i2 & 131072) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto27 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto3;
        BaseBoolIntDto baseBoolIntDto28 = (i2 & 524288) != 0 ? null : baseBoolIntDto4;
        Integer num42 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num9;
        BaseBoolIntDto baseBoolIntDto29 = (i2 & 2097152) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto30 = (i2 & 4194304) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto31 = (i2 & 8388608) != 0 ? null : baseBoolIntDto7;
        BaseBoolIntDto baseBoolIntDto32 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto8;
        BaseBoolIntDto baseBoolIntDto33 = (i2 & 33554432) != 0 ? null : baseBoolIntDto9;
        BaseBoolIntDto baseBoolIntDto34 = (i2 & 67108864) != 0 ? null : baseBoolIntDto10;
        Integer num43 = (i2 & 134217728) != 0 ? null : num10;
        BaseBoolIntDto baseBoolIntDto35 = (i2 & 268435456) != 0 ? null : baseBoolIntDto11;
        BaseBoolIntDto baseBoolIntDto36 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto12;
        VideoVideoDownloadDto videoVideoDownloadDto2 = (i2 & 1073741824) != 0 ? null : videoVideoDownloadDto;
        List list18 = (i2 & Integer.MIN_VALUE) != 0 ? null : list6;
        Boolean bool19 = (i3 & 1) != 0 ? null : bool7;
        Integer num44 = (i3 & 2) != 0 ? null : num11;
        BaseBoolIntDto baseBoolIntDto37 = (i3 & 4) != 0 ? null : baseBoolIntDto13;
        BaseBoolIntDto baseBoolIntDto38 = (i3 & 8) != 0 ? null : baseBoolIntDto14;
        BaseBoolIntDto baseBoolIntDto39 = (i3 & 16) != 0 ? null : baseBoolIntDto15;
        Integer num45 = (i3 & 32) != 0 ? null : num12;
        Integer num46 = (i3 & 64) != 0 ? null : num13;
        Integer num47 = num41;
        String str33 = (i3 & 128) != 0 ? null : str8;
        Integer num48 = (i3 & 256) != 0 ? null : num14;
        List list19 = (i3 & 512) != 0 ? null : list7;
        List list20 = (i3 & 1024) != 0 ? null : list8;
        Integer num49 = (i3 & 2048) != 0 ? null : num15;
        Integer num50 = (i3 & 4096) != 0 ? null : num16;
        Integer num51 = (i3 & 8192) != 0 ? null : num17;
        UserId userId5 = (i3 & 16384) != 0 ? null : userId2;
    }
}
