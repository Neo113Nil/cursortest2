package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Hb;
import com.ironsource.mediationsdk.logger.IronSourceError;
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
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.go9;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoOneOfVideoObjectsDto.kt */
/* loaded from: classes15.dex */
public abstract class VideoOneOfVideoObjectsDto implements Parcelable {

    /* compiled from: VideoOneOfVideoObjectsDto.kt */
    public static final class Deserializer implements a9y<VideoOneOfVideoObjectsDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE);
            if (epx.f(f, UcumUtils.UCUM_MINUTES)) {
                return (VideoOneOfVideoObjectsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VideoVideoDto.class);
            }
            if (epx.f(f, "full")) {
                return (VideoOneOfVideoObjectsDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VideoVideoFullDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: VideoOneOfVideoObjectsDto.kt */
    public static final class VideoVideoDto extends VideoOneOfVideoObjectsDto implements Parcelable {
        public static final Parcelable.Creator<VideoVideoDto> CREATOR = new a();

        @pmi0("access_info")
        private final VideoAccessInfoDto accessInfo;

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("added")
        private final BaseBoolIntDto added;

        @pmi0("adding_date")
        private final Integer addingDate;

        @pmi0("ads_info")
        private final VideoAdsInfoDto adsInfo;

        @pmi0("ads_stat_pixels")
        private final List<AdsItemBlockAdStatPixelDto> adsStatPixels;

        @pmi0("album_id")
        private final Integer albumId;

        @pmi0("archival_content_published_date")
        private final Integer archivalContentPublishedDate;

        @pmi0("balance")
        private final Integer balance;

        @pmi0("can_add")
        private final BaseBoolIntDto canAdd;

        @pmi0("can_add_to_faves")
        private final BaseBoolIntDto canAddToFaves;

        @pmi0("can_attach_link")
        private final BaseBoolIntDto canAttachLink;

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

        @pmi0("description")
        private final String description;

        @pmi0("donut")
        private final VideoDonutDto donut;

        @pmi0("donut_level_id")
        private final Integer donutLevelId;

        @pmi0("download")
        private final VideoVideoDownloadDto download;

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

        @pmi0("live_start_time")
        private final Integer liveStartTime;

        @pmi0("live_status")
        private final VideoLiveStatusDto liveStatus;

        @pmi0("local_views")
        private final Integer localViews;

        @pmi0("main_artists")
        private final List<AudioArtistDto> mainArtists;

        @pmi0("moderation_status")
        private final Integer moderationStatus;

        @pmi0("need_mute")
        private final BasePropertyExistsDto needMute;

        @pmi0("no_autoplay")
        private final BasePropertyExistsDto noAutoplay;

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

        @pmi0("processing")
        private final BasePropertyExistsDto processing;

        @pmi0("promo_post_hash")
        private final String promoPostHash;

        @pmi0("published_at")
        private final Integer publishedAt;

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

        @pmi0("should_stretch")
        private final Boolean shouldStretch;

        @pmi0("spectators")
        private final Integer spectators;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("thumb_hash")
        private final String thumbHash;

        @pmi0("title")
        private final String title;

        @pmi0("title_action")
        private final ActionLinksActionDto titleAction;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("tracking_info")
        private final VideoVideoTrackingInfoDto trackingInfo;

        @pmi0("type")
        private final VideoVideoTypeDto type;

        @pmi0("uma_track_id")
        private final Integer umaTrackId;

        @pmi0("user_id")
        private final UserId userId;

        @pmi0("uv_stats_place")
        private final String uvStatsPlace;

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

        @pmi0("wall_post_id")
        private final Integer wallPostId;

        @pmi0("width")
        private final Integer width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoOneOfVideoObjectsDto.kt */
        public static final class ResponseTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ResponseTypeDto[] $VALUES;
            public static final Parcelable.Creator<ResponseTypeDto> CREATOR;

            @pmi0("full")
            public static final ResponseTypeDto FULL;

            @pmi0(UcumUtils.UCUM_MINUTES)
            public static final ResponseTypeDto MIN;
            private final String value;

            /* compiled from: VideoOneOfVideoObjectsDto.kt */
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

        /* compiled from: VideoOneOfVideoObjectsDto.kt */
        public static final class a implements Parcelable.Creator<VideoVideoDto> {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v105, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v106 */
            /* JADX WARN: Type inference failed for: r2v107 */
            @Override // android.os.Parcelable.Creator
            public final VideoVideoDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ResponseTypeDto responseTypeDto;
                Boolean valueOf;
                BaseBoolIntDto baseBoolIntDto;
                Boolean bool;
                ArrayList arrayList2;
                Integer num;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Boolean valueOf5;
                VideoAccessInfoDto videoAccessInfoDto;
                Integer num2;
                ArrayList arrayList5;
                ResponseTypeDto responseTypeDto2;
                Boolean valueOf6;
                BaseBoolIntDto baseBoolIntDto2;
                ArrayList arrayList6;
                ArrayList arrayList7;
                ResponseTypeDto responseTypeDto3;
                ArrayList arrayList8;
                ArrayList arrayList9;
                Integer num3;
                ArrayList arrayList10;
                List arrayList11;
                Integer num4;
                ResponseTypeDto createFromParcel = parcel.readInt() == 0 ? null : ResponseTypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                VideoAdsInfoDto videoAdsInfoDto = (VideoAdsInfoDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                VideoVideoDownloadDto videoVideoDownloadDto = (VideoVideoDownloadDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    responseTypeDto = createFromParcel;
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    responseTypeDto = createFromParcel;
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(VideoVideoDto.class, parcel, arrayList, i, 1);
                        readInt = readInt;
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                ArrayList arrayList12 = arrayList;
                BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto = baseBoolIntDto17;
                    bool = valueOf;
                    num = valueOf10;
                    arrayList2 = null;
                } else {
                    baseBoolIntDto = baseBoolIntDto17;
                    int readInt2 = parcel.readInt();
                    bool = valueOf;
                    arrayList2 = new ArrayList(readInt2);
                    num = valueOf10;
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = bo.b(VideoVideoDto.class, parcel, arrayList2, i2, 1);
                        readInt2 = readInt2;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = arrayList2;
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt3);
                    arrayList4 = arrayList2;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = bo.b(VideoVideoDto.class, parcel, arrayList3, i3, 1);
                        readInt3 = readInt3;
                    }
                }
                Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                ArrayList arrayList13 = arrayList3;
                UserId userId = (UserId) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                UserId userId2 = (UserId) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString3 = parcel.readString();
                Integer num5 = valueOf11;
                Integer num6 = valueOf12;
                Integer num7 = valueOf13;
                ArrayList arrayList14 = arrayList4;
                Integer num8 = valueOf16;
                Boolean bool2 = valueOf2;
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BasePropertyExistsDto basePropertyExistsDto = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer num9 = num;
                Integer num10 = valueOf15;
                ResponseTypeDto responseTypeDto4 = responseTypeDto;
                BaseBoolIntDto baseBoolIntDto18 = baseBoolIntDto;
                String readString5 = parcel.readString();
                BasePropertyExistsDto basePropertyExistsDto2 = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                MediaRestrictionDto mediaRestrictionDto = (MediaRestrictionDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Boolean bool3 = valueOf3;
                String readString6 = parcel.readString();
                VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = (VideoVideoTrackingInfoDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BasePropertyExistsDto basePropertyExistsDto3 = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                String readString7 = parcel.readString();
                VideoVideoTypeDto videoVideoTypeDto = (VideoVideoTypeDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString8 = parcel.readString();
                Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString9 = parcel.readString();
                Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                VideoLiveStatusDto videoLiveStatusDto = (VideoLiveStatusDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString10 = parcel.readString();
                BaseLikesDto baseLikesDto = (BaseLikesDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseRepostsInfoDto baseRepostsInfoDto = (BaseRepostsInfoDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BasePropertyExistsDto basePropertyExistsDto4 = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf25 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString11 = parcel.readString();
                Integer num11 = valueOf17;
                Integer num12 = valueOf18;
                Integer num13 = valueOf19;
                Integer num14 = valueOf20;
                Integer num15 = valueOf21;
                Integer num16 = valueOf23;
                Integer num17 = valueOf24;
                Integer num18 = valueOf25;
                Integer num19 = valueOf26;
                String readString12 = parcel.readString();
                Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
                BaseBoolIntDto baseBoolIntDto24 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                ActionLinksActionDto actionLinksActionDto = (ActionLinksActionDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString13 = parcel.readString();
                VideoAccessInfoDto videoAccessInfoDto2 = (VideoAccessInfoDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    videoAccessInfoDto = videoAccessInfoDto2;
                    num2 = valueOf14;
                    responseTypeDto2 = responseTypeDto4;
                    arrayList5 = null;
                } else {
                    videoAccessInfoDto = videoAccessInfoDto2;
                    int readInt4 = parcel.readInt();
                    num2 = valueOf14;
                    arrayList5 = new ArrayList(readInt4);
                    responseTypeDto2 = responseTypeDto4;
                    int i4 = 0;
                    while (i4 != readInt4) {
                        i4 = bo.b(VideoVideoDto.class, parcel, arrayList5, i4, 1);
                        readInt4 = readInt4;
                    }
                }
                Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Boolean bool4 = bool;
                Integer num20 = num2;
                String readString14 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString15 = parcel.readString();
                ResponseTypeDto responseTypeDto5 = responseTypeDto2;
                Boolean bool5 = valueOf6;
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                Integer num21 = valueOf30;
                VideoDonutDto videoDonutDto = (VideoDonutDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto26 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto2 = baseBoolIntDto27;
                    arrayList6 = arrayList5;
                    responseTypeDto3 = responseTypeDto5;
                    arrayList7 = null;
                } else {
                    baseBoolIntDto2 = baseBoolIntDto27;
                    int readInt5 = parcel.readInt();
                    arrayList6 = arrayList5;
                    arrayList7 = new ArrayList(readInt5);
                    responseTypeDto3 = responseTypeDto5;
                    int i5 = 0;
                    while (i5 != readInt5) {
                        i5 = bo.b(VideoVideoDto.class, parcel, arrayList7, i5, 1);
                        readInt5 = readInt5;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList9 = arrayList7;
                    arrayList8 = null;
                    num3 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    arrayList8 = new ArrayList(readInt6);
                    arrayList9 = arrayList7;
                    int i6 = 0;
                    while (i6 != readInt6) {
                        i6 = bo.b(VideoVideoDto.class, parcel, arrayList8, i6, 1);
                        readInt6 = readInt6;
                    }
                    num3 = null;
                }
                Integer num22 = valueOf22;
                Integer num23 = valueOf29;
                ArrayList arrayList15 = arrayList6;
                String readString19 = parcel.readString();
                Integer valueOf31 = parcel.readInt() == 0 ? num3 : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList10 = arrayList8;
                    arrayList11 = num3;
                    num4 = valueOf31;
                } else {
                    int readInt7 = parcel.readInt();
                    arrayList10 = arrayList8;
                    arrayList11 = new ArrayList(readInt7);
                    num4 = valueOf31;
                    int i7 = 0;
                    while (i7 != readInt7) {
                        i7 = bo.b(VideoVideoDto.class, parcel, arrayList11, i7, 1);
                        readInt7 = readInt7;
                    }
                }
                return new VideoVideoDto(responseTypeDto3, readString, valueOf7, videoAdsInfoDto, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, valueOf8, baseBoolIntDto7, baseBoolIntDto8, baseBoolIntDto9, baseBoolIntDto10, baseBoolIntDto11, baseBoolIntDto12, valueOf9, baseBoolIntDto13, baseBoolIntDto14, videoVideoDownloadDto, arrayList12, bool4, num9, baseBoolIntDto15, baseBoolIntDto16, baseBoolIntDto18, num5, num6, readString2, num7, arrayList14, arrayList13, num20, num10, num8, userId, userId2, bool2, readString3, readString4, bool3, basePropertyExistsDto, readString5, basePropertyExistsDto2, baseBoolIntDto19, mediaRestrictionDto, baseBoolIntDto20, baseBoolIntDto21, readString6, videoVideoTrackingInfoDto, basePropertyExistsDto3, readString7, videoVideoTypeDto, num11, num12, num13, readString8, num14, readString9, num15, videoLiveStatusDto, num22, baseBoolIntDto22, num16, readString10, baseLikesDto, baseRepostsInfoDto, num17, basePropertyExistsDto4, baseBoolIntDto23, num18, num19, readString11, readString12, valueOf27, valueOf4, valueOf5, baseBoolIntDto24, actionLinksActionDto, valueOf28, readString13, videoAccessInfoDto, num23, arrayList15, num21, readString14, bool5, readString15, readString16, readString17, readString18, videoDonutDto, baseBoolIntDto25, baseBoolIntDto26, baseBoolIntDto2, arrayList9, arrayList10, readString19, num4, arrayList11);
            }

            @Override // android.os.Parcelable.Creator
            public final VideoVideoDto[] newArray(int i) {
                return new VideoVideoDto[i];
            }
        }

        public VideoVideoDto() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoVideoDto)) {
                return false;
            }
            VideoVideoDto videoVideoDto = (VideoVideoDto) obj;
            return this.responseType == videoVideoDto.responseType && epx.f(this.accessKey, videoVideoDto.accessKey) && epx.f(this.addingDate, videoVideoDto.addingDate) && epx.f(this.adsInfo, videoVideoDto.adsInfo) && this.canComment == videoVideoDto.canComment && this.canEdit == videoVideoDto.canEdit && this.canDelete == videoVideoDto.canDelete && this.canLike == videoVideoDto.canLike && epx.f(this.canRepost, videoVideoDto.canRepost) && this.canSubscribe == videoVideoDto.canSubscribe && this.canBePromoted == videoVideoDto.canBePromoted && this.canAddToFaves == videoVideoDto.canAddToFaves && this.canAdd == videoVideoDto.canAdd && this.canAttachLink == videoVideoDto.canAttachLink && this.canPlayInBackground == videoVideoDto.canPlayInBackground && epx.f(this.canDownload, videoVideoDto.canDownload) && this.canEditPrivacy == videoVideoDto.canEditPrivacy && this.canRemoveFromRecommendations == videoVideoDto.canRemoveFromRecommendations && epx.f(this.download, videoVideoDto.download) && epx.f(this.linkedToPlaylistMarks, videoVideoDto.linkedToPlaylistMarks) && epx.f(this.isArchivalContent, videoVideoDto.isArchivalContent) && epx.f(this.archivalContentPublishedDate, videoVideoDto.archivalContentPublishedDate) && this.isPrivate == videoVideoDto.isPrivate && this.isFromMessage == videoVideoDto.isFromMessage && this.isDraft == videoVideoDto.isDraft && epx.f(this.comments, videoVideoDto.comments) && epx.f(this.date, videoVideoDto.date) && epx.f(this.description, videoVideoDto.description) && epx.f(this.duration, videoVideoDto.duration) && epx.f(this.image, videoVideoDto.image) && epx.f(this.firstFrame, videoVideoDto.firstFrame) && epx.f(this.width, videoVideoDto.width) && epx.f(this.height, videoVideoDto.height) && epx.f(this.id, videoVideoDto.id) && epx.f(this.ownerId, videoVideoDto.ownerId) && epx.f(this.userId, videoVideoDto.userId) && epx.f(this.isAuthor, videoVideoDto.isAuthor) && epx.f(this.ovId, videoVideoDto.ovId) && epx.f(this.title, videoVideoDto.title) && epx.f(this.isFavorite, videoVideoDto.isFavorite) && this.noAutoplay == videoVideoDto.noAutoplay && epx.f(this.player, videoVideoDto.player) && this.processing == videoVideoDto.processing && this.converting == videoVideoDto.converting && epx.f(this.restriction, videoVideoDto.restriction) && this.added == videoVideoDto.added && this.isSubscribed == videoVideoDto.isSubscribed && epx.f(this.trackCode, videoVideoDto.trackCode) && epx.f(this.trackingInfo, videoVideoDto.trackingInfo) && this.repeat == videoVideoDto.repeat && epx.f(this.partnerText, videoVideoDto.partnerText) && this.type == videoVideoDto.type && epx.f(this.views, videoVideoDto.views) && epx.f(this.localViews, videoVideoDto.localViews) && epx.f(this.contentRestricted, videoVideoDto.contentRestricted) && epx.f(this.contentRestrictedMessage, videoVideoDto.contentRestrictedMessage) && epx.f(this.albumId, videoVideoDto.albumId) && epx.f(this.context, videoVideoDto.context) && epx.f(this.balance, videoVideoDto.balance) && this.liveStatus == videoVideoDto.liveStatus && epx.f(this.liveStartTime, videoVideoDto.liveStartTime) && this.liveNotify == videoVideoDto.liveNotify && epx.f(this.spectators, videoVideoDto.spectators) && epx.f(this.platform, videoVideoDto.platform) && epx.f(this.likes, videoVideoDto.likes) && epx.f(this.reposts, videoVideoDto.reposts) && epx.f(this.moderationStatus, videoVideoDto.moderationStatus) && this.needMute == videoVideoDto.needMute && this.isUnitedVideo == videoVideoDto.isUnitedVideo && epx.f(this.umaTrackId, videoVideoDto.umaTrackId) && epx.f(this.ovProviderId, videoVideoDto.ovProviderId) && epx.f(this.randomTag, videoVideoDto.randomTag) && epx.f(this.uvStatsPlace, videoVideoDto.uvStatsPlace) && epx.f(this.server, videoVideoDto.server) && epx.f(this.isMobileLive, videoVideoDto.isMobileLive) && epx.f(this.isSpherical, videoVideoDto.isSpherical) && this.canDislike == videoVideoDto.canDislike && epx.f(this.titleAction, videoVideoDto.titleAction) && epx.f(this.publishedAt, videoVideoDto.publishedAt) && epx.f(this.thumbHash, videoVideoDto.thumbHash) && epx.f(this.accessInfo, videoVideoDto.accessInfo) && epx.f(this.wallPostId, videoVideoDto.wallPostId) && epx.f(this.adsStatPixels, videoVideoDto.adsStatPixels) && epx.f(this.donutLevelId, videoVideoDto.donutLevelId) && epx.f(this.promoPostHash, videoVideoDto.promoPostHash) && epx.f(this.shouldStretch, videoVideoDto.shouldStretch) && epx.f(this.vkLiveChannelUrl, videoVideoDto.vkLiveChannelUrl) && epx.f(this.vkLiveChannelName, videoVideoDto.vkLiveChannelName) && epx.f(this.vkLiveVideoId, videoVideoDto.vkLiveVideoId) && epx.f(this.vkLiveSlotUrl, videoVideoDto.vkLiveSlotUrl) && epx.f(this.donut, videoVideoDto.donut) && this.canReport == videoVideoDto.canReport && this.canCutToShortVideo == videoVideoDto.canCutToShortVideo && this.isExplicit == videoVideoDto.isExplicit && epx.f(this.mainArtists, videoVideoDto.mainArtists) && epx.f(this.featuredArtists, videoVideoDto.featuredArtists) && epx.f(this.subtitle, videoVideoDto.subtitle) && epx.f(this.releaseDate, videoVideoDto.releaseDate) && epx.f(this.genres, videoVideoDto.genres);
        }

        public final int hashCode() {
            ResponseTypeDto responseTypeDto = this.responseType;
            int hashCode = (responseTypeDto == null ? 0 : responseTypeDto.hashCode()) * 31;
            String str = this.accessKey;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.addingDate;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            VideoAdsInfoDto videoAdsInfoDto = this.adsInfo;
            int hashCode4 = (hashCode3 + (videoAdsInfoDto == null ? 0 : videoAdsInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canEdit;
            int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canDelete;
            int hashCode7 = (hashCode6 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.canLike;
            int hashCode8 = (hashCode7 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            Integer num2 = this.canRepost;
            int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.canSubscribe;
            int hashCode10 = (hashCode9 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto6 = this.canBePromoted;
            int hashCode11 = (hashCode10 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto7 = this.canAddToFaves;
            int hashCode12 = (hashCode11 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto8 = this.canAdd;
            int hashCode13 = (hashCode12 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto9 = this.canAttachLink;
            int hashCode14 = (hashCode13 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto10 = this.canPlayInBackground;
            int hashCode15 = (hashCode14 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
            Integer num3 = this.canDownload;
            int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto11 = this.canEditPrivacy;
            int hashCode17 = (hashCode16 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto12 = this.canRemoveFromRecommendations;
            int hashCode18 = (hashCode17 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
            VideoVideoDownloadDto videoVideoDownloadDto = this.download;
            int hashCode19 = (hashCode18 + (videoVideoDownloadDto == null ? 0 : videoVideoDownloadDto.hashCode())) * 31;
            List<VideoLinkedToPlaylistMarkDto> list = this.linkedToPlaylistMarks;
            int hashCode20 = (hashCode19 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isArchivalContent;
            int hashCode21 = (hashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num4 = this.archivalContentPublishedDate;
            int hashCode22 = (hashCode21 + (num4 == null ? 0 : num4.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto13 = this.isPrivate;
            int hashCode23 = (hashCode22 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto14 = this.isFromMessage;
            int hashCode24 = (hashCode23 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto15 = this.isDraft;
            int hashCode25 = (hashCode24 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
            Integer num5 = this.comments;
            int hashCode26 = (hashCode25 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.date;
            int hashCode27 = (hashCode26 + (num6 == null ? 0 : num6.hashCode())) * 31;
            String str2 = this.description;
            int hashCode28 = (hashCode27 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num7 = this.duration;
            int hashCode29 = (hashCode28 + (num7 == null ? 0 : num7.hashCode())) * 31;
            List<VideoVideoImageDto> list2 = this.image;
            int hashCode30 = (hashCode29 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<VideoVideoImageDto> list3 = this.firstFrame;
            int hashCode31 = (hashCode30 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Integer num8 = this.width;
            int hashCode32 = (hashCode31 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.height;
            int hashCode33 = (hashCode32 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.id;
            int hashCode34 = (hashCode33 + (num10 == null ? 0 : num10.hashCode())) * 31;
            UserId userId = this.ownerId;
            int hashCode35 = (hashCode34 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            UserId userId2 = this.userId;
            int hashCode36 = (hashCode35 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            Boolean bool2 = this.isAuthor;
            int hashCode37 = (hashCode36 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str3 = this.ovId;
            int hashCode38 = (hashCode37 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.title;
            int hashCode39 = (hashCode38 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool3 = this.isFavorite;
            int hashCode40 = (hashCode39 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto = this.noAutoplay;
            int hashCode41 = (hashCode40 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
            String str5 = this.player;
            int hashCode42 = (hashCode41 + (str5 == null ? 0 : str5.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto2 = this.processing;
            int hashCode43 = (hashCode42 + (basePropertyExistsDto2 == null ? 0 : basePropertyExistsDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto16 = this.converting;
            int hashCode44 = (hashCode43 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
            MediaRestrictionDto mediaRestrictionDto = this.restriction;
            int hashCode45 = (hashCode44 + (mediaRestrictionDto == null ? 0 : mediaRestrictionDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto17 = this.added;
            int hashCode46 = (hashCode45 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto18 = this.isSubscribed;
            int hashCode47 = (hashCode46 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
            String str6 = this.trackCode;
            int hashCode48 = (hashCode47 + (str6 == null ? 0 : str6.hashCode())) * 31;
            VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = this.trackingInfo;
            int hashCode49 = (hashCode48 + (videoVideoTrackingInfoDto == null ? 0 : videoVideoTrackingInfoDto.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto3 = this.repeat;
            int hashCode50 = (hashCode49 + (basePropertyExistsDto3 == null ? 0 : basePropertyExistsDto3.hashCode())) * 31;
            String str7 = this.partnerText;
            int hashCode51 = (hashCode50 + (str7 == null ? 0 : str7.hashCode())) * 31;
            VideoVideoTypeDto videoVideoTypeDto = this.type;
            int hashCode52 = (hashCode51 + (videoVideoTypeDto == null ? 0 : videoVideoTypeDto.hashCode())) * 31;
            Integer num11 = this.views;
            int hashCode53 = (hashCode52 + (num11 == null ? 0 : num11.hashCode())) * 31;
            Integer num12 = this.localViews;
            int hashCode54 = (hashCode53 + (num12 == null ? 0 : num12.hashCode())) * 31;
            Integer num13 = this.contentRestricted;
            int hashCode55 = (hashCode54 + (num13 == null ? 0 : num13.hashCode())) * 31;
            String str8 = this.contentRestrictedMessage;
            int hashCode56 = (hashCode55 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num14 = this.albumId;
            int hashCode57 = (hashCode56 + (num14 == null ? 0 : num14.hashCode())) * 31;
            String str9 = this.context;
            int hashCode58 = (hashCode57 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Integer num15 = this.balance;
            int hashCode59 = (hashCode58 + (num15 == null ? 0 : num15.hashCode())) * 31;
            VideoLiveStatusDto videoLiveStatusDto = this.liveStatus;
            int hashCode60 = (hashCode59 + (videoLiveStatusDto == null ? 0 : videoLiveStatusDto.hashCode())) * 31;
            Integer num16 = this.liveStartTime;
            int hashCode61 = (hashCode60 + (num16 == null ? 0 : num16.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto19 = this.liveNotify;
            int hashCode62 = (hashCode61 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
            Integer num17 = this.spectators;
            int hashCode63 = (hashCode62 + (num17 == null ? 0 : num17.hashCode())) * 31;
            String str10 = this.platform;
            int hashCode64 = (hashCode63 + (str10 == null ? 0 : str10.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode65 = (hashCode64 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode66 = (hashCode65 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            Integer num18 = this.moderationStatus;
            int hashCode67 = (hashCode66 + (num18 == null ? 0 : num18.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto4 = this.needMute;
            int hashCode68 = (hashCode67 + (basePropertyExistsDto4 == null ? 0 : basePropertyExistsDto4.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto20 = this.isUnitedVideo;
            int hashCode69 = (hashCode68 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
            Integer num19 = this.umaTrackId;
            int hashCode70 = (hashCode69 + (num19 == null ? 0 : num19.hashCode())) * 31;
            Integer num20 = this.ovProviderId;
            int hashCode71 = (hashCode70 + (num20 == null ? 0 : num20.hashCode())) * 31;
            String str11 = this.randomTag;
            int hashCode72 = (hashCode71 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.uvStatsPlace;
            int hashCode73 = (hashCode72 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num21 = this.server;
            int hashCode74 = (hashCode73 + (num21 == null ? 0 : num21.hashCode())) * 31;
            Boolean bool4 = this.isMobileLive;
            int hashCode75 = (hashCode74 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isSpherical;
            int hashCode76 = (hashCode75 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto21 = this.canDislike;
            int hashCode77 = (hashCode76 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
            ActionLinksActionDto actionLinksActionDto = this.titleAction;
            int hashCode78 = (hashCode77 + (actionLinksActionDto == null ? 0 : actionLinksActionDto.hashCode())) * 31;
            Integer num22 = this.publishedAt;
            int hashCode79 = (hashCode78 + (num22 == null ? 0 : num22.hashCode())) * 31;
            String str13 = this.thumbHash;
            int hashCode80 = (hashCode79 + (str13 == null ? 0 : str13.hashCode())) * 31;
            VideoAccessInfoDto videoAccessInfoDto = this.accessInfo;
            int hashCode81 = (hashCode80 + (videoAccessInfoDto == null ? 0 : videoAccessInfoDto.hashCode())) * 31;
            Integer num23 = this.wallPostId;
            int hashCode82 = (hashCode81 + (num23 == null ? 0 : num23.hashCode())) * 31;
            List<AdsItemBlockAdStatPixelDto> list4 = this.adsStatPixels;
            int hashCode83 = (hashCode82 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Integer num24 = this.donutLevelId;
            int hashCode84 = (hashCode83 + (num24 == null ? 0 : num24.hashCode())) * 31;
            String str14 = this.promoPostHash;
            int hashCode85 = (hashCode84 + (str14 == null ? 0 : str14.hashCode())) * 31;
            Boolean bool6 = this.shouldStretch;
            int hashCode86 = (hashCode85 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str15 = this.vkLiveChannelUrl;
            int hashCode87 = (hashCode86 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.vkLiveChannelName;
            int hashCode88 = (hashCode87 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.vkLiveVideoId;
            int hashCode89 = (hashCode88 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.vkLiveSlotUrl;
            int hashCode90 = (hashCode89 + (str18 == null ? 0 : str18.hashCode())) * 31;
            VideoDonutDto videoDonutDto = this.donut;
            int hashCode91 = (hashCode90 + (videoDonutDto == null ? 0 : videoDonutDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto22 = this.canReport;
            int hashCode92 = (hashCode91 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto23 = this.canCutToShortVideo;
            int hashCode93 = (hashCode92 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto24 = this.isExplicit;
            int hashCode94 = (hashCode93 + (baseBoolIntDto24 == null ? 0 : baseBoolIntDto24.hashCode())) * 31;
            List<AudioArtistDto> list5 = this.mainArtists;
            int hashCode95 = (hashCode94 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<AudioArtistDto> list6 = this.featuredArtists;
            int hashCode96 = (hashCode95 + (list6 == null ? 0 : list6.hashCode())) * 31;
            String str19 = this.subtitle;
            int hashCode97 = (hashCode96 + (str19 == null ? 0 : str19.hashCode())) * 31;
            Integer num25 = this.releaseDate;
            int hashCode98 = (hashCode97 + (num25 == null ? 0 : num25.hashCode())) * 31;
            List<AudioGenreDto> list7 = this.genres;
            return hashCode98 + (list7 != null ? list7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoVideoDto(responseType=");
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
            ResponseTypeDto responseTypeDto = this.responseType;
            if (responseTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                responseTypeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.accessKey);
            Integer num = this.addingDate;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeParcelable(this.adsInfo, i);
            parcel.writeParcelable(this.canComment, i);
            parcel.writeParcelable(this.canEdit, i);
            parcel.writeParcelable(this.canDelete, i);
            parcel.writeParcelable(this.canLike, i);
            Integer num2 = this.canRepost;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeParcelable(this.canSubscribe, i);
            parcel.writeParcelable(this.canBePromoted, i);
            parcel.writeParcelable(this.canAddToFaves, i);
            parcel.writeParcelable(this.canAdd, i);
            parcel.writeParcelable(this.canAttachLink, i);
            parcel.writeParcelable(this.canPlayInBackground, i);
            Integer num3 = this.canDownload;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            parcel.writeParcelable(this.canEditPrivacy, i);
            parcel.writeParcelable(this.canRemoveFromRecommendations, i);
            parcel.writeParcelable(this.download, i);
            List<VideoLinkedToPlaylistMarkDto> list = this.linkedToPlaylistMarks;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            Boolean bool = this.isArchivalContent;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Integer num4 = this.archivalContentPublishedDate;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
            parcel.writeParcelable(this.isPrivate, i);
            parcel.writeParcelable(this.isFromMessage, i);
            parcel.writeParcelable(this.isDraft, i);
            Integer num5 = this.comments;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num5);
            }
            Integer num6 = this.date;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num6);
            }
            parcel.writeString(this.description);
            Integer num7 = this.duration;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num7);
            }
            List<VideoVideoImageDto> list2 = this.image;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list2, 1);
                while (f2.hasNext()) {
                    parcel.writeParcelable((Parcelable) f2.next(), i);
                }
            }
            List<VideoVideoImageDto> list3 = this.firstFrame;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f3 = dn.f(parcel, list3, 1);
                while (f3.hasNext()) {
                    parcel.writeParcelable((Parcelable) f3.next(), i);
                }
            }
            Integer num8 = this.width;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num8);
            }
            Integer num9 = this.height;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num9);
            }
            Integer num10 = this.id;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num10);
            }
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeParcelable(this.userId, i);
            Boolean bool2 = this.isAuthor;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.ovId);
            parcel.writeString(this.title);
            Boolean bool3 = this.isFavorite;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
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
            Integer num11 = this.views;
            if (num11 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num11);
            }
            Integer num12 = this.localViews;
            if (num12 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num12);
            }
            Integer num13 = this.contentRestricted;
            if (num13 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num13);
            }
            parcel.writeString(this.contentRestrictedMessage);
            Integer num14 = this.albumId;
            if (num14 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num14);
            }
            parcel.writeString(this.context);
            Integer num15 = this.balance;
            if (num15 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num15);
            }
            parcel.writeParcelable(this.liveStatus, i);
            Integer num16 = this.liveStartTime;
            if (num16 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num16);
            }
            parcel.writeParcelable(this.liveNotify, i);
            Integer num17 = this.spectators;
            if (num17 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num17);
            }
            parcel.writeString(this.platform);
            parcel.writeParcelable(this.likes, i);
            parcel.writeParcelable(this.reposts, i);
            Integer num18 = this.moderationStatus;
            if (num18 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num18);
            }
            parcel.writeParcelable(this.needMute, i);
            parcel.writeParcelable(this.isUnitedVideo, i);
            Integer num19 = this.umaTrackId;
            if (num19 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num19);
            }
            Integer num20 = this.ovProviderId;
            if (num20 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num20);
            }
            parcel.writeString(this.randomTag);
            parcel.writeString(this.uvStatsPlace);
            Integer num21 = this.server;
            if (num21 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num21);
            }
            Boolean bool4 = this.isMobileLive;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            Boolean bool5 = this.isSpherical;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool5);
            }
            parcel.writeParcelable(this.canDislike, i);
            parcel.writeParcelable(this.titleAction, i);
            Integer num22 = this.publishedAt;
            if (num22 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num22);
            }
            parcel.writeString(this.thumbHash);
            parcel.writeParcelable(this.accessInfo, i);
            Integer num23 = this.wallPostId;
            if (num23 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num23);
            }
            List<AdsItemBlockAdStatPixelDto> list4 = this.adsStatPixels;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f4 = dn.f(parcel, list4, 1);
                while (f4.hasNext()) {
                    parcel.writeParcelable((Parcelable) f4.next(), i);
                }
            }
            Integer num24 = this.donutLevelId;
            if (num24 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num24);
            }
            parcel.writeString(this.promoPostHash);
            Boolean bool6 = this.shouldStretch;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool6);
            }
            parcel.writeString(this.vkLiveChannelUrl);
            parcel.writeString(this.vkLiveChannelName);
            parcel.writeString(this.vkLiveVideoId);
            parcel.writeString(this.vkLiveSlotUrl);
            parcel.writeParcelable(this.donut, i);
            parcel.writeParcelable(this.canReport, i);
            parcel.writeParcelable(this.canCutToShortVideo, i);
            parcel.writeParcelable(this.isExplicit, i);
            List<AudioArtistDto> list5 = this.mainArtists;
            if (list5 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f5 = dn.f(parcel, list5, 1);
                while (f5.hasNext()) {
                    parcel.writeParcelable((Parcelable) f5.next(), i);
                }
            }
            List<AudioArtistDto> list6 = this.featuredArtists;
            if (list6 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f6 = dn.f(parcel, list6, 1);
                while (f6.hasNext()) {
                    parcel.writeParcelable((Parcelable) f6.next(), i);
                }
            }
            parcel.writeString(this.subtitle);
            Integer num25 = this.releaseDate;
            if (num25 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num25);
            }
            List<AudioGenreDto> list7 = this.genres;
            if (list7 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ VideoVideoDto(ResponseTypeDto responseTypeDto, String str, Integer num, VideoAdsInfoDto videoAdsInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num3, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, VideoVideoDownloadDto videoVideoDownloadDto, List list, Boolean bool, Integer num4, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, Integer num5, Integer num6, String str2, Integer num7, List list2, List list3, Integer num8, Integer num9, Integer num10, UserId userId, UserId userId2, Boolean bool2, String str3, String str4, Boolean bool3, BasePropertyExistsDto basePropertyExistsDto, String str5, BasePropertyExistsDto basePropertyExistsDto2, BaseBoolIntDto baseBoolIntDto16, MediaRestrictionDto mediaRestrictionDto, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, String str6, VideoVideoTrackingInfoDto videoVideoTrackingInfoDto, BasePropertyExistsDto basePropertyExistsDto3, String str7, VideoVideoTypeDto videoVideoTypeDto, Integer num11, Integer num12, Integer num13, String str8, Integer num14, String str9, Integer num15, VideoLiveStatusDto videoLiveStatusDto, Integer num16, BaseBoolIntDto baseBoolIntDto19, Integer num17, String str10, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num18, BasePropertyExistsDto basePropertyExistsDto4, BaseBoolIntDto baseBoolIntDto20, Integer num19, Integer num20, String str11, String str12, Integer num21, Boolean bool4, Boolean bool5, BaseBoolIntDto baseBoolIntDto21, ActionLinksActionDto actionLinksActionDto, Integer num22, String str13, VideoAccessInfoDto videoAccessInfoDto, Integer num23, List list4, Integer num24, String str14, Boolean bool6, String str15, String str16, String str17, String str18, VideoDonutDto videoDonutDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, List list5, List list6, String str19, Integer num25, List list7, int i, int i2, int i3, int i4, zcl zclVar) {
            this(r82, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r83, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i2 & 1) != 0 ? null : num9, (i2 & 2) != 0 ? null : num10, (i2 & 4) != 0 ? null : userId, (i2 & 8) != 0 ? null : userId2, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : basePropertyExistsDto, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : basePropertyExistsDto2, (i2 & 2048) != 0 ? null : baseBoolIntDto16, (i2 & 4096) != 0 ? null : mediaRestrictionDto, (i2 & 8192) != 0 ? null : baseBoolIntDto17, (i2 & 16384) != 0 ? null : baseBoolIntDto18, (i2 & 32768) != 0 ? null : str6, (i2 & 65536) != 0 ? null : videoVideoTrackingInfoDto, (i2 & 131072) != 0 ? null : basePropertyExistsDto3, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str7, (i2 & 524288) != 0 ? null : videoVideoTypeDto, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num11, (i2 & 2097152) != 0 ? null : num12, (i2 & 4194304) != 0 ? null : num13, (i2 & 8388608) != 0 ? null : str8, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num14, (i2 & 33554432) != 0 ? null : str9, (i2 & 67108864) != 0 ? null : num15, (i2 & 134217728) != 0 ? null : videoLiveStatusDto, (i2 & 268435456) != 0 ? null : num16, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto19, (i2 & 1073741824) != 0 ? null : num17, (i2 & Integer.MIN_VALUE) != 0 ? null : str10, (i3 & 1) != 0 ? null : baseLikesDto, (i3 & 2) != 0 ? null : baseRepostsInfoDto, (i3 & 4) != 0 ? null : num18, (i3 & 8) != 0 ? null : basePropertyExistsDto4, (i3 & 16) != 0 ? null : baseBoolIntDto20, (i3 & 32) != 0 ? null : num19, (i3 & 64) != 0 ? null : num20, (i3 & 128) != 0 ? null : str11, (i3 & 256) != 0 ? null : str12, (i3 & 512) != 0 ? null : num21, (i3 & 1024) != 0 ? null : bool4, (i3 & 2048) != 0 ? null : bool5, (i3 & 4096) != 0 ? null : baseBoolIntDto21, (i3 & 8192) != 0 ? null : actionLinksActionDto, (i3 & 16384) != 0 ? null : num22, (i3 & 32768) != 0 ? null : str13, (i3 & 65536) != 0 ? null : videoAccessInfoDto, (i3 & 131072) != 0 ? null : num23, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list4, (i3 & 524288) != 0 ? null : num24, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str14, (i3 & 2097152) != 0 ? null : bool6, (i3 & 4194304) != 0 ? null : str15, (i3 & 8388608) != 0 ? null : str16, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str17, (i3 & 33554432) != 0 ? null : str18, (i3 & 67108864) != 0 ? null : videoDonutDto, (i3 & 134217728) != 0 ? null : baseBoolIntDto22, (i3 & 268435456) != 0 ? null : baseBoolIntDto23, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto24, (i3 & 1073741824) != 0 ? null : list5, (i3 & Integer.MIN_VALUE) != 0 ? null : list6, (i4 & 1) != 0 ? null : str19, (i4 & 2) != 0 ? null : num25, (i4 & 4) != 0 ? null : list7);
            ResponseTypeDto responseTypeDto2 = (i & 1) != 0 ? null : responseTypeDto;
            String str20 = (i & 2) != 0 ? null : str;
            Integer num26 = (i & 4) != 0 ? null : num;
            VideoAdsInfoDto videoAdsInfoDto2 = (i & 8) != 0 ? null : videoAdsInfoDto;
            BaseBoolIntDto baseBoolIntDto25 = (i & 16) != 0 ? null : baseBoolIntDto;
            BaseBoolIntDto baseBoolIntDto26 = (i & 32) != 0 ? null : baseBoolIntDto2;
            BaseBoolIntDto baseBoolIntDto27 = (i & 64) != 0 ? null : baseBoolIntDto3;
            BaseBoolIntDto baseBoolIntDto28 = (i & 128) != 0 ? null : baseBoolIntDto4;
            Integer num27 = (i & 256) != 0 ? null : num2;
            BaseBoolIntDto baseBoolIntDto29 = (i & 512) != 0 ? null : baseBoolIntDto5;
            BaseBoolIntDto baseBoolIntDto30 = (i & 1024) != 0 ? null : baseBoolIntDto6;
            BaseBoolIntDto baseBoolIntDto31 = (i & 2048) != 0 ? null : baseBoolIntDto7;
            BaseBoolIntDto baseBoolIntDto32 = (i & 4096) != 0 ? null : baseBoolIntDto8;
            ResponseTypeDto responseTypeDto3 = responseTypeDto2;
            BaseBoolIntDto baseBoolIntDto33 = (i & 8192) != 0 ? null : baseBoolIntDto9;
            BaseBoolIntDto baseBoolIntDto34 = (i & 16384) != 0 ? null : baseBoolIntDto10;
            Integer num28 = (i & 32768) != 0 ? null : num3;
            BaseBoolIntDto baseBoolIntDto35 = (i & 65536) != 0 ? null : baseBoolIntDto11;
            BaseBoolIntDto baseBoolIntDto36 = (i & 131072) != 0 ? null : baseBoolIntDto12;
            VideoVideoDownloadDto videoVideoDownloadDto2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : videoVideoDownloadDto;
            List list8 = (i & 524288) != 0 ? null : list;
            Boolean bool7 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool;
            Integer num29 = (i & 2097152) != 0 ? null : num4;
            BaseBoolIntDto baseBoolIntDto37 = (i & 4194304) != 0 ? null : baseBoolIntDto13;
            BaseBoolIntDto baseBoolIntDto38 = (i & 8388608) != 0 ? null : baseBoolIntDto14;
            BaseBoolIntDto baseBoolIntDto39 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto15;
            Integer num30 = (i & 33554432) != 0 ? null : num5;
            Integer num31 = (i & 67108864) != 0 ? null : num6;
            String str21 = (i & 134217728) != 0 ? null : str2;
            Integer num32 = (i & 268435456) != 0 ? null : num7;
            List list9 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list2;
            List list10 = (i & 1073741824) != 0 ? null : list3;
            Integer num33 = (i & Integer.MIN_VALUE) != 0 ? null : num8;
        }

        public VideoVideoDto(ResponseTypeDto responseTypeDto, String str, Integer num, VideoAdsInfoDto videoAdsInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num3, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, VideoVideoDownloadDto videoVideoDownloadDto, List<VideoLinkedToPlaylistMarkDto> list, Boolean bool, Integer num4, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, Integer num5, Integer num6, String str2, Integer num7, List<VideoVideoImageDto> list2, List<VideoVideoImageDto> list3, Integer num8, Integer num9, Integer num10, UserId userId, UserId userId2, Boolean bool2, String str3, String str4, Boolean bool3, BasePropertyExistsDto basePropertyExistsDto, String str5, BasePropertyExistsDto basePropertyExistsDto2, BaseBoolIntDto baseBoolIntDto16, MediaRestrictionDto mediaRestrictionDto, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, String str6, VideoVideoTrackingInfoDto videoVideoTrackingInfoDto, BasePropertyExistsDto basePropertyExistsDto3, String str7, VideoVideoTypeDto videoVideoTypeDto, Integer num11, Integer num12, Integer num13, String str8, Integer num14, String str9, Integer num15, VideoLiveStatusDto videoLiveStatusDto, Integer num16, BaseBoolIntDto baseBoolIntDto19, Integer num17, String str10, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num18, BasePropertyExistsDto basePropertyExistsDto4, BaseBoolIntDto baseBoolIntDto20, Integer num19, Integer num20, String str11, String str12, Integer num21, Boolean bool4, Boolean bool5, BaseBoolIntDto baseBoolIntDto21, ActionLinksActionDto actionLinksActionDto, Integer num22, String str13, VideoAccessInfoDto videoAccessInfoDto, Integer num23, List<AdsItemBlockAdStatPixelDto> list4, Integer num24, String str14, Boolean bool6, String str15, String str16, String str17, String str18, VideoDonutDto videoDonutDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, List<AudioArtistDto> list5, List<AudioArtistDto> list6, String str19, Integer num25, List<AudioGenreDto> list7) {
            super(null);
            this.responseType = responseTypeDto;
            this.accessKey = str;
            this.addingDate = num;
            this.adsInfo = videoAdsInfoDto;
            this.canComment = baseBoolIntDto;
            this.canEdit = baseBoolIntDto2;
            this.canDelete = baseBoolIntDto3;
            this.canLike = baseBoolIntDto4;
            this.canRepost = num2;
            this.canSubscribe = baseBoolIntDto5;
            this.canBePromoted = baseBoolIntDto6;
            this.canAddToFaves = baseBoolIntDto7;
            this.canAdd = baseBoolIntDto8;
            this.canAttachLink = baseBoolIntDto9;
            this.canPlayInBackground = baseBoolIntDto10;
            this.canDownload = num3;
            this.canEditPrivacy = baseBoolIntDto11;
            this.canRemoveFromRecommendations = baseBoolIntDto12;
            this.download = videoVideoDownloadDto;
            this.linkedToPlaylistMarks = list;
            this.isArchivalContent = bool;
            this.archivalContentPublishedDate = num4;
            this.isPrivate = baseBoolIntDto13;
            this.isFromMessage = baseBoolIntDto14;
            this.isDraft = baseBoolIntDto15;
            this.comments = num5;
            this.date = num6;
            this.description = str2;
            this.duration = num7;
            this.image = list2;
            this.firstFrame = list3;
            this.width = num8;
            this.height = num9;
            this.id = num10;
            this.ownerId = userId;
            this.userId = userId2;
            this.isAuthor = bool2;
            this.ovId = str3;
            this.title = str4;
            this.isFavorite = bool3;
            this.noAutoplay = basePropertyExistsDto;
            this.player = str5;
            this.processing = basePropertyExistsDto2;
            this.converting = baseBoolIntDto16;
            this.restriction = mediaRestrictionDto;
            this.added = baseBoolIntDto17;
            this.isSubscribed = baseBoolIntDto18;
            this.trackCode = str6;
            this.trackingInfo = videoVideoTrackingInfoDto;
            this.repeat = basePropertyExistsDto3;
            this.partnerText = str7;
            this.type = videoVideoTypeDto;
            this.views = num11;
            this.localViews = num12;
            this.contentRestricted = num13;
            this.contentRestrictedMessage = str8;
            this.albumId = num14;
            this.context = str9;
            this.balance = num15;
            this.liveStatus = videoLiveStatusDto;
            this.liveStartTime = num16;
            this.liveNotify = baseBoolIntDto19;
            this.spectators = num17;
            this.platform = str10;
            this.likes = baseLikesDto;
            this.reposts = baseRepostsInfoDto;
            this.moderationStatus = num18;
            this.needMute = basePropertyExistsDto4;
            this.isUnitedVideo = baseBoolIntDto20;
            this.umaTrackId = num19;
            this.ovProviderId = num20;
            this.randomTag = str11;
            this.uvStatsPlace = str12;
            this.server = num21;
            this.isMobileLive = bool4;
            this.isSpherical = bool5;
            this.canDislike = baseBoolIntDto21;
            this.titleAction = actionLinksActionDto;
            this.publishedAt = num22;
            this.thumbHash = str13;
            this.accessInfo = videoAccessInfoDto;
            this.wallPostId = num23;
            this.adsStatPixels = list4;
            this.donutLevelId = num24;
            this.promoPostHash = str14;
            this.shouldStretch = bool6;
            this.vkLiveChannelUrl = str15;
            this.vkLiveChannelName = str16;
            this.vkLiveVideoId = str17;
            this.vkLiveSlotUrl = str18;
            this.donut = videoDonutDto;
            this.canReport = baseBoolIntDto22;
            this.canCutToShortVideo = baseBoolIntDto23;
            this.isExplicit = baseBoolIntDto24;
            this.mainArtists = list5;
            this.featuredArtists = list6;
            this.subtitle = str19;
            this.releaseDate = num25;
            this.genres = list7;
        }
    }

    /* compiled from: VideoOneOfVideoObjectsDto.kt */
    public static final class VideoVideoFullDto extends VideoOneOfVideoObjectsDto implements Parcelable {
        public static final Parcelable.Creator<VideoVideoFullDto> CREATOR = new a();

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
        private final List<com.vk.api.generated.video.dto.VideoVideoFullDto> attachedShortVideos;

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
        /* compiled from: VideoOneOfVideoObjectsDto.kt */
        public static final class ResponseTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ResponseTypeDto[] $VALUES;
            public static final Parcelable.Creator<ResponseTypeDto> CREATOR;

            @pmi0("full")
            public static final ResponseTypeDto FULL;

            @pmi0(UcumUtils.UCUM_MINUTES)
            public static final ResponseTypeDto MIN;
            private final String value;

            /* compiled from: VideoOneOfVideoObjectsDto.kt */
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
        /* compiled from: VideoOneOfVideoObjectsDto.kt */
        public static final class ServerEffectDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ServerEffectDto[] $VALUES;
            public static final Parcelable.Creator<ServerEffectDto> CREATOR;

            @pmi0("deepfake")
            public static final ServerEffectDto DEEPFAKE;
            private final String value;

            /* compiled from: VideoOneOfVideoObjectsDto.kt */
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
        /* compiled from: VideoOneOfVideoObjectsDto.kt */
        public static final class TargetDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TargetDto[] $VALUES;
            public static final Parcelable.Creator<TargetDto> CREATOR;

            @pmi0("discovery")
            public static final TargetDto DISCOVERY;

            @pmi0("video")
            public static final TargetDto VIDEO;
            private final String value;

            /* compiled from: VideoOneOfVideoObjectsDto.kt */
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

        /* compiled from: VideoOneOfVideoObjectsDto.kt */
        public static final class a implements Parcelable.Creator<VideoVideoFullDto> {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r140v2, types: [java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r2v213, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v214 */
            /* JADX WARN: Type inference failed for: r2v215, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v216 */
            /* JADX WARN: Type inference failed for: r2v217 */
            /* JADX WARN: Type inference failed for: r2v218 */
            /* JADX WARN: Type inference failed for: r3v23, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v24 */
            /* JADX WARN: Type inference failed for: r3v34 */
            @Override // android.os.Parcelable.Creator
            public final VideoVideoFullDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                Float f;
                ArrayList arrayList3;
                VideoVideoFilesDto videoVideoFilesDto;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Boolean valueOf5;
                ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto;
                String str;
                ArrayList arrayList4;
                Boolean bool;
                Boolean valueOf6;
                UserId userId;
                ServerEffectDto createFromParcel;
                ServerEffectDto serverEffectDto;
                TargetDto createFromParcel2;
                VideoOrdInfoDto videoOrdInfoDto;
                ArrayList arrayList5;
                ArrayList arrayList6;
                Integer num;
                VideoVideoDownloadDto videoVideoDownloadDto;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ResponseTypeDto responseTypeDto;
                Boolean valueOf7;
                BaseBoolIntDto baseBoolIntDto;
                ArrayList arrayList9;
                ArrayList arrayList10;
                Integer num2;
                ArrayList arrayList11;
                ArrayList arrayList12;
                Boolean valueOf8;
                Boolean valueOf9;
                Boolean valueOf10;
                Boolean valueOf11;
                VideoAccessInfoDto videoAccessInfoDto;
                Integer num3;
                ArrayList arrayList13;
                Integer num4;
                Integer valueOf12;
                Boolean bool2;
                Boolean valueOf13;
                BaseBoolIntDto baseBoolIntDto2;
                ArrayList arrayList14;
                ?? arrayList15;
                VideoVideoFilesDto videoVideoFilesDto2;
                ?? arrayList16;
                List list;
                List list2;
                List arrayList17;
                Object obj;
                VideoVideoFilesDto videoVideoFilesDto3 = (VideoVideoFilesDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                VideoVideoFilesDto videoVideoFilesDto4 = (VideoVideoFilesDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(VideoVideoFullDto.class, parcel, arrayList, i, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = bo.b(VideoVideoFullDto.class, parcel, arrayList2, i2, 1);
                    }
                }
                Float valueOf14 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                VideoLiveSettingsDto videoLiveSettingsDto = (VideoLiveSettingsDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BasePrivacyDto basePrivacyDto = (BasePrivacyDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BasePrivacyDto basePrivacyDto2 = (BasePrivacyDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto = (VideoPrivacyCutToShortVideoDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                VideoTimelineThumbsDto videoTimelineThumbsDto = (VideoTimelineThumbsDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                VideoAdsDto videoAdsDto = (VideoAdsDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                ActionLinksActionDto actionLinksActionDto = (ActionLinksActionDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BasePropertyExistsDto basePropertyExistsDto = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    f = valueOf14;
                    videoVideoFilesDto = videoVideoFilesDto3;
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    f = valueOf14;
                    arrayList3 = new ArrayList(readInt3);
                    videoVideoFilesDto = videoVideoFilesDto3;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = bo.b(VideoVideoFullDto.class, parcel, arrayList3, i3, 1);
                        readInt3 = readInt3;
                    }
                }
                String readString = parcel.readString();
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
                Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                ArrayList arrayList18 = arrayList3;
                ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto2 = (ShortVideoShortVideoInfoDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    shortVideoShortVideoInfoDto = shortVideoShortVideoInfoDto2;
                    str = readString;
                    bool = valueOf;
                    arrayList4 = null;
                } else {
                    shortVideoShortVideoInfoDto = shortVideoShortVideoInfoDto2;
                    int readInt4 = parcel.readInt();
                    str = readString;
                    arrayList4 = new ArrayList(readInt4);
                    bool = valueOf;
                    int i4 = 0;
                    while (i4 != readInt4) {
                        i4 = bo.b(VideoVideoFullDto.class, parcel, arrayList4, i4, 1);
                        readInt4 = readInt4;
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Boolean bool3 = valueOf6;
                VideoOriginalsInfoDto videoOriginalsInfoDto = (VideoOriginalsInfoDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                VideoDeduplicationOriginalDto videoDeduplicationOriginalDto = (VideoDeduplicationOriginalDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId2 = (UserId) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    userId = userId2;
                    createFromParcel = null;
                } else {
                    userId = userId2;
                    createFromParcel = ServerEffectDto.CREATOR.createFromParcel(parcel);
                }
                ServerEffectDto serverEffectDto2 = createFromParcel;
                ArrayList arrayList19 = arrayList2;
                ArrayList arrayList20 = arrayList;
                Float f2 = f;
                Boolean bool4 = bool;
                Integer num5 = valueOf17;
                UserId userId3 = userId;
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    serverEffectDto = serverEffectDto2;
                    createFromParcel2 = null;
                } else {
                    serverEffectDto = serverEffectDto2;
                    createFromParcel2 = TargetDto.CREATOR.createFromParcel(parcel);
                }
                TargetDto targetDto = createFromParcel2;
                VideoInteractiveInfoDto videoInteractiveInfoDto = (VideoInteractiveInfoDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                VideoOrdInfoDto videoOrdInfoDto2 = (VideoOrdInfoDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    videoOrdInfoDto = videoOrdInfoDto2;
                    arrayList5 = arrayList4;
                    num = valueOf16;
                    arrayList6 = null;
                } else {
                    videoOrdInfoDto = videoOrdInfoDto2;
                    int readInt5 = parcel.readInt();
                    arrayList5 = arrayList4;
                    arrayList6 = new ArrayList(readInt5);
                    num = valueOf16;
                    int i5 = 0;
                    while (i5 != readInt5) {
                        i5 = bo.b(VideoVideoFullDto.class, parcel, arrayList6, i5, 1);
                        readInt5 = readInt5;
                    }
                }
                Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                ArrayList arrayList21 = arrayList5;
                String readString4 = parcel.readString();
                String str2 = str;
                Integer num6 = num;
                String readString5 = parcel.readString();
                ResponseTypeDto createFromParcel3 = parcel.readInt() != 0 ? ResponseTypeDto.CREATOR.createFromParcel(parcel) : null;
                String readString6 = parcel.readString();
                Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer num7 = valueOf18;
                VideoAdsInfoDto videoAdsInfoDto = (VideoAdsInfoDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                VideoVideoDownloadDto videoVideoDownloadDto2 = (VideoVideoDownloadDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    videoVideoDownloadDto = videoVideoDownloadDto2;
                    arrayList7 = arrayList6;
                    responseTypeDto = createFromParcel3;
                    arrayList8 = null;
                } else {
                    videoVideoDownloadDto = videoVideoDownloadDto2;
                    int readInt6 = parcel.readInt();
                    arrayList7 = arrayList6;
                    arrayList8 = new ArrayList(readInt6);
                    responseTypeDto = createFromParcel3;
                    int i6 = 0;
                    while (i6 != readInt6) {
                        i6 = bo.b(VideoVideoFullDto.class, parcel, arrayList8, i6, 1);
                        readInt6 = readInt6;
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Boolean bool5 = valueOf7;
                BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString7 = parcel.readString();
                Integer valueOf25 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto = baseBoolIntDto17;
                    arrayList9 = arrayList8;
                    num2 = valueOf22;
                    arrayList10 = null;
                } else {
                    baseBoolIntDto = baseBoolIntDto17;
                    int readInt7 = parcel.readInt();
                    arrayList9 = arrayList8;
                    arrayList10 = new ArrayList(readInt7);
                    num2 = valueOf22;
                    int i7 = 0;
                    while (i7 != readInt7) {
                        i7 = bo.b(VideoVideoFullDto.class, parcel, arrayList10, i7, 1);
                        readInt7 = readInt7;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList12 = arrayList10;
                    arrayList11 = null;
                } else {
                    int readInt8 = parcel.readInt();
                    arrayList11 = new ArrayList(readInt8);
                    arrayList12 = arrayList10;
                    int i8 = 0;
                    while (i8 != readInt8) {
                        i8 = bo.b(VideoVideoFullDto.class, parcel, arrayList11, i8, 1);
                        readInt8 = readInt8;
                    }
                }
                Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                ArrayList arrayList22 = arrayList11;
                UserId userId4 = (UserId) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                UserId userId5 = (UserId) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString8 = parcel.readString();
                VideoOrdInfoDto videoOrdInfoDto3 = videoOrdInfoDto;
                Integer num8 = valueOf20;
                Integer num9 = valueOf21;
                VideoVideoDownloadDto videoVideoDownloadDto3 = videoVideoDownloadDto;
                Integer num10 = valueOf23;
                Integer num11 = valueOf24;
                Integer num12 = valueOf25;
                ArrayList arrayList23 = arrayList12;
                Integer num13 = valueOf28;
                Boolean bool6 = valueOf8;
                String readString9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BasePropertyExistsDto basePropertyExistsDto2 = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                ResponseTypeDto responseTypeDto2 = responseTypeDto;
                BaseBoolIntDto baseBoolIntDto18 = baseBoolIntDto;
                String readString10 = parcel.readString();
                BasePropertyExistsDto basePropertyExistsDto3 = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                MediaRestrictionDto mediaRestrictionDto = (MediaRestrictionDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Boolean bool7 = valueOf9;
                String readString11 = parcel.readString();
                VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = (VideoVideoTrackingInfoDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BasePropertyExistsDto basePropertyExistsDto4 = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                String readString12 = parcel.readString();
                VideoVideoTypeDto videoVideoTypeDto = (VideoVideoTypeDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf31 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString13 = parcel.readString();
                Integer valueOf32 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString14 = parcel.readString();
                Integer valueOf33 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                VideoLiveStatusDto videoLiveStatusDto = (VideoLiveStatusDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf34 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf35 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString15 = parcel.readString();
                BaseLikesDto baseLikesDto = (BaseLikesDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseRepostsInfoDto baseRepostsInfoDto = (BaseRepostsInfoDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf36 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BasePropertyExistsDto basePropertyExistsDto5 = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf37 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf38 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString16 = parcel.readString();
                Integer num14 = valueOf29;
                Integer num15 = valueOf30;
                Integer num16 = valueOf31;
                Integer num17 = valueOf32;
                Integer num18 = valueOf33;
                Integer num19 = valueOf35;
                Integer num20 = valueOf36;
                Integer num21 = valueOf37;
                Integer num22 = valueOf38;
                String readString17 = parcel.readString();
                Integer valueOf39 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
                BaseBoolIntDto baseBoolIntDto24 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                ActionLinksActionDto actionLinksActionDto2 = (ActionLinksActionDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf40 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString18 = parcel.readString();
                VideoAccessInfoDto videoAccessInfoDto2 = (VideoAccessInfoDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                Integer valueOf41 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    videoAccessInfoDto = videoAccessInfoDto2;
                    num3 = valueOf26;
                    num4 = valueOf27;
                    arrayList13 = null;
                } else {
                    videoAccessInfoDto = videoAccessInfoDto2;
                    int readInt9 = parcel.readInt();
                    num3 = valueOf26;
                    arrayList13 = new ArrayList(readInt9);
                    num4 = valueOf27;
                    int i9 = 0;
                    while (i9 != readInt9) {
                        i9 = bo.b(VideoVideoFullDto.class, parcel, arrayList13, i9, 1);
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
                Integer num23 = valueOf19;
                ArrayList arrayList24 = arrayList9;
                Integer num24 = num3;
                String readString19 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf13 = bool2;
                } else {
                    valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString20 = parcel.readString();
                Object obj2 = bool2;
                VideoVideoFilesDto videoVideoFilesDto5 = videoVideoFilesDto;
                Boolean bool8 = valueOf2;
                Boolean bool9 = valueOf3;
                Boolean bool10 = valueOf4;
                Boolean bool11 = valueOf5;
                Integer num25 = valueOf15;
                ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto3 = shortVideoShortVideoInfoDto;
                ServerEffectDto serverEffectDto3 = serverEffectDto;
                ArrayList arrayList25 = arrayList7;
                Integer num26 = num2;
                Integer num27 = num4;
                Boolean bool12 = valueOf13;
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                Integer num28 = valueOf12;
                VideoDonutDto videoDonutDto = (VideoDonutDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto26 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto2 = baseBoolIntDto27;
                    arrayList14 = arrayList13;
                    videoVideoFilesDto2 = videoVideoFilesDto5;
                    arrayList15 = obj2;
                } else {
                    baseBoolIntDto2 = baseBoolIntDto27;
                    int readInt10 = parcel.readInt();
                    arrayList14 = arrayList13;
                    arrayList15 = new ArrayList(readInt10);
                    videoVideoFilesDto2 = videoVideoFilesDto5;
                    int i10 = 0;
                    while (i10 != readInt10) {
                        i10 = bo.b(VideoVideoFullDto.class, parcel, arrayList15, i10, 1);
                        readInt10 = readInt10;
                    }
                }
                if (parcel.readInt() == 0) {
                    list = arrayList15;
                    arrayList16 = obj2;
                } else {
                    int readInt11 = parcel.readInt();
                    arrayList16 = new ArrayList(readInt11);
                    list = arrayList15;
                    int i11 = 0;
                    while (i11 != readInt11) {
                        i11 = bo.b(VideoVideoFullDto.class, parcel, arrayList16, i11, 1);
                        readInt11 = readInt11;
                    }
                }
                Integer num29 = valueOf34;
                Integer num30 = valueOf41;
                ArrayList arrayList26 = arrayList14;
                String readString24 = parcel.readString();
                Object valueOf42 = parcel.readInt() == 0 ? obj2 : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    list2 = arrayList16;
                    obj = valueOf42;
                    arrayList17 = obj2;
                } else {
                    int readInt12 = parcel.readInt();
                    list2 = arrayList16;
                    arrayList17 = new ArrayList(readInt12);
                    obj = valueOf42;
                    int i12 = 0;
                    while (i12 != readInt12) {
                        i12 = bo.b(VideoVideoFullDto.class, parcel, arrayList17, i12, 1);
                        readInt12 = readInt12;
                    }
                }
                return new VideoVideoFullDto(videoVideoFilesDto2, videoVideoFilesDto4, arrayList20, arrayList19, f2, videoLiveSettingsDto, basePrivacyDto, basePrivacyDto2, videoPrivacyCutToShortVideoDto, videoTimelineThumbsDto, videoAdsDto, actionLinksActionDto, basePropertyExistsDto, arrayList18, str2, bool4, bool8, bool9, bool10, bool11, num25, readString2, shortVideoShortVideoInfoDto3, arrayList21, bool3, num6, videoOriginalsInfoDto, videoDeduplicationOriginalDto, num5, userId3, serverEffectDto3, readString3, targetDto, videoInteractiveInfoDto, videoOrdInfoDto3, arrayList25, num7, readString4, readString5, responseTypeDto2, readString6, num23, videoAdsInfoDto, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, num8, baseBoolIntDto7, baseBoolIntDto8, baseBoolIntDto9, baseBoolIntDto10, baseBoolIntDto11, baseBoolIntDto12, num9, baseBoolIntDto13, baseBoolIntDto14, videoVideoDownloadDto3, arrayList24, bool5, num26, baseBoolIntDto15, baseBoolIntDto16, baseBoolIntDto18, num10, num11, readString7, num12, arrayList23, arrayList22, num24, num27, num13, userId4, userId5, bool6, readString8, readString9, bool7, basePropertyExistsDto2, readString10, basePropertyExistsDto3, baseBoolIntDto19, mediaRestrictionDto, baseBoolIntDto20, baseBoolIntDto21, readString11, videoVideoTrackingInfoDto, basePropertyExistsDto4, readString12, videoVideoTypeDto, num14, num15, num16, readString13, num17, readString14, num18, videoLiveStatusDto, num29, baseBoolIntDto22, num19, readString15, baseLikesDto, baseRepostsInfoDto, num20, basePropertyExistsDto5, baseBoolIntDto23, num21, num22, readString16, readString17, valueOf39, valueOf10, valueOf11, baseBoolIntDto24, actionLinksActionDto2, valueOf40, readString18, videoAccessInfoDto, num30, arrayList26, num28, readString19, bool12, readString20, readString21, readString22, readString23, videoDonutDto, baseBoolIntDto25, baseBoolIntDto26, baseBoolIntDto2, list, list2, readString24, obj, arrayList17);
            }

            @Override // android.os.Parcelable.Creator
            public final VideoVideoFullDto[] newArray(int i) {
                return new VideoVideoFullDto[i];
            }
        }

        public VideoVideoFullDto() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoVideoFullDto)) {
                return false;
            }
            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) obj;
            return epx.f(this.files, videoVideoFullDto.files) && epx.f(this.trailer, videoVideoFullDto.trailer) && epx.f(this.episodes, videoVideoFullDto.episodes) && epx.f(this.qualitiesInfo, videoVideoFullDto.qualitiesInfo) && epx.f(this.volumeMultiplier, videoVideoFullDto.volumeMultiplier) && epx.f(this.liveSettings, videoVideoFullDto.liveSettings) && epx.f(this.privacyView, videoVideoFullDto.privacyView) && epx.f(this.privacyComment, videoVideoFullDto.privacyComment) && this.privacyCutToShortVideo == videoVideoFullDto.privacyCutToShortVideo && epx.f(this.timelineThumbs, videoVideoFullDto.timelineThumbs) && epx.f(this.ads, videoVideoFullDto.ads) && epx.f(this.actionButton, videoVideoFullDto.actionButton) && this.hasSubtitles == videoVideoFullDto.hasSubtitles && epx.f(this.subtitles, videoVideoFullDto.subtitles) && epx.f(this.forceSubtitles, videoVideoFullDto.forceSubtitles) && epx.f(this.needMyTracker, videoVideoFullDto.needMyTracker) && epx.f(this.canSeeUma, videoVideoFullDto.canSeeUma) && epx.f(this.canBePinned, videoVideoFullDto.canBePinned) && epx.f(this.isPinned, videoVideoFullDto.isPinned) && epx.f(this.hasMarketItems, videoVideoFullDto.hasMarketItems) && epx.f(this.marketItemsCount, videoVideoFullDto.marketItemsCount) && epx.f(this.sourceFileName, videoVideoFullDto.sourceFileName) && epx.f(this.shortVideoInfo, videoVideoFullDto.shortVideoInfo) && epx.f(this.statsPixels, videoVideoFullDto.statsPixels) && epx.f(this.needMediascopeStat, videoVideoFullDto.needMediascopeStat) && epx.f(this.viewedDuration, videoVideoFullDto.viewedDuration) && epx.f(this.originalsInfo, videoVideoFullDto.originalsInfo) && epx.f(this.deduplicationOriginalInfo, videoVideoFullDto.deduplicationOriginalInfo) && epx.f(this.source, videoVideoFullDto.source) && epx.f(this.sourceOwner, videoVideoFullDto.sourceOwner) && this.serverEffect == videoVideoFullDto.serverEffect && epx.f(this.md5, videoVideoFullDto.md5) && this.target == videoVideoFullDto.target && epx.f(this.interactiveInfo, videoVideoFullDto.interactiveInfo) && epx.f(this.ordInfo, videoVideoFullDto.ordInfo) && epx.f(this.attachedShortVideos, videoVideoFullDto.attachedShortVideos) && epx.f(this.attachedShortVideosCounter, videoVideoFullDto.attachedShortVideosCounter) && epx.f(this.directUrl, videoVideoFullDto.directUrl) && epx.f(this.shareUrl, videoVideoFullDto.shareUrl) && this.responseType == videoVideoFullDto.responseType && epx.f(this.accessKey, videoVideoFullDto.accessKey) && epx.f(this.addingDate, videoVideoFullDto.addingDate) && epx.f(this.adsInfo, videoVideoFullDto.adsInfo) && this.canComment == videoVideoFullDto.canComment && this.canEdit == videoVideoFullDto.canEdit && this.canDelete == videoVideoFullDto.canDelete && this.canLike == videoVideoFullDto.canLike && epx.f(this.canRepost, videoVideoFullDto.canRepost) && this.canSubscribe == videoVideoFullDto.canSubscribe && this.canBePromoted == videoVideoFullDto.canBePromoted && this.canAddToFaves == videoVideoFullDto.canAddToFaves && this.canAdd == videoVideoFullDto.canAdd && this.canAttachLink == videoVideoFullDto.canAttachLink && this.canPlayInBackground == videoVideoFullDto.canPlayInBackground && epx.f(this.canDownload, videoVideoFullDto.canDownload) && this.canEditPrivacy == videoVideoFullDto.canEditPrivacy && this.canRemoveFromRecommendations == videoVideoFullDto.canRemoveFromRecommendations && epx.f(this.download, videoVideoFullDto.download) && epx.f(this.linkedToPlaylistMarks, videoVideoFullDto.linkedToPlaylistMarks) && epx.f(this.isArchivalContent, videoVideoFullDto.isArchivalContent) && epx.f(this.archivalContentPublishedDate, videoVideoFullDto.archivalContentPublishedDate) && this.isPrivate == videoVideoFullDto.isPrivate && this.isFromMessage == videoVideoFullDto.isFromMessage && this.isDraft == videoVideoFullDto.isDraft && epx.f(this.comments, videoVideoFullDto.comments) && epx.f(this.date, videoVideoFullDto.date) && epx.f(this.description, videoVideoFullDto.description) && epx.f(this.duration, videoVideoFullDto.duration) && epx.f(this.image, videoVideoFullDto.image) && epx.f(this.firstFrame, videoVideoFullDto.firstFrame) && epx.f(this.width, videoVideoFullDto.width) && epx.f(this.height, videoVideoFullDto.height) && epx.f(this.id, videoVideoFullDto.id) && epx.f(this.ownerId, videoVideoFullDto.ownerId) && epx.f(this.userId, videoVideoFullDto.userId) && epx.f(this.isAuthor, videoVideoFullDto.isAuthor) && epx.f(this.ovId, videoVideoFullDto.ovId) && epx.f(this.title, videoVideoFullDto.title) && epx.f(this.isFavorite, videoVideoFullDto.isFavorite) && this.noAutoplay == videoVideoFullDto.noAutoplay && epx.f(this.player, videoVideoFullDto.player) && this.processing == videoVideoFullDto.processing && this.converting == videoVideoFullDto.converting && epx.f(this.restriction, videoVideoFullDto.restriction) && this.added == videoVideoFullDto.added && this.isSubscribed == videoVideoFullDto.isSubscribed && epx.f(this.trackCode, videoVideoFullDto.trackCode) && epx.f(this.trackingInfo, videoVideoFullDto.trackingInfo) && this.repeat == videoVideoFullDto.repeat && epx.f(this.partnerText, videoVideoFullDto.partnerText) && this.type == videoVideoFullDto.type && epx.f(this.views, videoVideoFullDto.views) && epx.f(this.localViews, videoVideoFullDto.localViews) && epx.f(this.contentRestricted, videoVideoFullDto.contentRestricted) && epx.f(this.contentRestrictedMessage, videoVideoFullDto.contentRestrictedMessage) && epx.f(this.albumId, videoVideoFullDto.albumId) && epx.f(this.context, videoVideoFullDto.context) && epx.f(this.balance, videoVideoFullDto.balance) && this.liveStatus == videoVideoFullDto.liveStatus && epx.f(this.liveStartTime, videoVideoFullDto.liveStartTime) && this.liveNotify == videoVideoFullDto.liveNotify && epx.f(this.spectators, videoVideoFullDto.spectators) && epx.f(this.platform, videoVideoFullDto.platform) && epx.f(this.likes, videoVideoFullDto.likes) && epx.f(this.reposts, videoVideoFullDto.reposts) && epx.f(this.moderationStatus, videoVideoFullDto.moderationStatus) && this.needMute == videoVideoFullDto.needMute && this.isUnitedVideo == videoVideoFullDto.isUnitedVideo && epx.f(this.umaTrackId, videoVideoFullDto.umaTrackId) && epx.f(this.ovProviderId, videoVideoFullDto.ovProviderId) && epx.f(this.randomTag, videoVideoFullDto.randomTag) && epx.f(this.uvStatsPlace, videoVideoFullDto.uvStatsPlace) && epx.f(this.server, videoVideoFullDto.server) && epx.f(this.isMobileLive, videoVideoFullDto.isMobileLive) && epx.f(this.isSpherical, videoVideoFullDto.isSpherical) && this.canDislike == videoVideoFullDto.canDislike && epx.f(this.titleAction, videoVideoFullDto.titleAction) && epx.f(this.publishedAt, videoVideoFullDto.publishedAt) && epx.f(this.thumbHash, videoVideoFullDto.thumbHash) && epx.f(this.accessInfo, videoVideoFullDto.accessInfo) && epx.f(this.wallPostId, videoVideoFullDto.wallPostId) && epx.f(this.adsStatPixels, videoVideoFullDto.adsStatPixels) && epx.f(this.donutLevelId, videoVideoFullDto.donutLevelId) && epx.f(this.promoPostHash, videoVideoFullDto.promoPostHash) && epx.f(this.shouldStretch, videoVideoFullDto.shouldStretch) && epx.f(this.vkLiveChannelUrl, videoVideoFullDto.vkLiveChannelUrl) && epx.f(this.vkLiveChannelName, videoVideoFullDto.vkLiveChannelName) && epx.f(this.vkLiveVideoId, videoVideoFullDto.vkLiveVideoId) && epx.f(this.vkLiveSlotUrl, videoVideoFullDto.vkLiveSlotUrl) && epx.f(this.donut, videoVideoFullDto.donut) && this.canReport == videoVideoFullDto.canReport && this.canCutToShortVideo == videoVideoFullDto.canCutToShortVideo && this.isExplicit == videoVideoFullDto.isExplicit && epx.f(this.mainArtists, videoVideoFullDto.mainArtists) && epx.f(this.featuredArtists, videoVideoFullDto.featuredArtists) && epx.f(this.subtitle, videoVideoFullDto.subtitle) && epx.f(this.releaseDate, videoVideoFullDto.releaseDate) && epx.f(this.genres, videoVideoFullDto.genres);
        }

        public final int hashCode() {
            VideoVideoFilesDto videoVideoFilesDto = this.files;
            int hashCode = (videoVideoFilesDto == null ? 0 : videoVideoFilesDto.hashCode()) * 31;
            VideoVideoFilesDto videoVideoFilesDto2 = this.trailer;
            int hashCode2 = (hashCode + (videoVideoFilesDto2 == null ? 0 : videoVideoFilesDto2.hashCode())) * 31;
            List<VideoEpisodeDto> list = this.episodes;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<VideoQualityInfoDto> list2 = this.qualitiesInfo;
            int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Float f = this.volumeMultiplier;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            VideoLiveSettingsDto videoLiveSettingsDto = this.liveSettings;
            int hashCode6 = (hashCode5 + (videoLiveSettingsDto == null ? 0 : videoLiveSettingsDto.hashCode())) * 31;
            BasePrivacyDto basePrivacyDto = this.privacyView;
            int hashCode7 = (hashCode6 + (basePrivacyDto == null ? 0 : basePrivacyDto.hashCode())) * 31;
            BasePrivacyDto basePrivacyDto2 = this.privacyComment;
            int hashCode8 = (hashCode7 + (basePrivacyDto2 == null ? 0 : basePrivacyDto2.hashCode())) * 31;
            VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto = this.privacyCutToShortVideo;
            int hashCode9 = (hashCode8 + (videoPrivacyCutToShortVideoDto == null ? 0 : videoPrivacyCutToShortVideoDto.hashCode())) * 31;
            VideoTimelineThumbsDto videoTimelineThumbsDto = this.timelineThumbs;
            int hashCode10 = (hashCode9 + (videoTimelineThumbsDto == null ? 0 : videoTimelineThumbsDto.hashCode())) * 31;
            VideoAdsDto videoAdsDto = this.ads;
            int hashCode11 = (hashCode10 + (videoAdsDto == null ? 0 : videoAdsDto.hashCode())) * 31;
            ActionLinksActionDto actionLinksActionDto = this.actionButton;
            int hashCode12 = (hashCode11 + (actionLinksActionDto == null ? 0 : actionLinksActionDto.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto = this.hasSubtitles;
            int hashCode13 = (hashCode12 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
            List<VideoSubtitlesDto> list3 = this.subtitles;
            int hashCode14 = (hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
            String str = this.forceSubtitles;
            int hashCode15 = (hashCode14 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.needMyTracker;
            int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canSeeUma;
            int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.canBePinned;
            int hashCode18 = (hashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isPinned;
            int hashCode19 = (hashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.hasMarketItems;
            int hashCode20 = (hashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Integer num = this.marketItemsCount;
            int hashCode21 = (hashCode20 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.sourceFileName;
            int hashCode22 = (hashCode21 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto = this.shortVideoInfo;
            int hashCode23 = (hashCode22 + (shortVideoShortVideoInfoDto == null ? 0 : shortVideoShortVideoInfoDto.hashCode())) * 31;
            List<VideoStatsPixelDto> list4 = this.statsPixels;
            int hashCode24 = (hashCode23 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Boolean bool6 = this.needMediascopeStat;
            int hashCode25 = (hashCode24 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Integer num2 = this.viewedDuration;
            int hashCode26 = (hashCode25 + (num2 == null ? 0 : num2.hashCode())) * 31;
            VideoOriginalsInfoDto videoOriginalsInfoDto = this.originalsInfo;
            int hashCode27 = (hashCode26 + (videoOriginalsInfoDto == null ? 0 : videoOriginalsInfoDto.hashCode())) * 31;
            VideoDeduplicationOriginalDto videoDeduplicationOriginalDto = this.deduplicationOriginalInfo;
            int hashCode28 = (hashCode27 + (videoDeduplicationOriginalDto == null ? 0 : videoDeduplicationOriginalDto.hashCode())) * 31;
            Integer num3 = this.source;
            int hashCode29 = (hashCode28 + (num3 == null ? 0 : num3.hashCode())) * 31;
            UserId userId = this.sourceOwner;
            int hashCode30 = (hashCode29 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            ServerEffectDto serverEffectDto = this.serverEffect;
            int hashCode31 = (hashCode30 + (serverEffectDto == null ? 0 : serverEffectDto.hashCode())) * 31;
            String str3 = this.md5;
            int hashCode32 = (hashCode31 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TargetDto targetDto = this.target;
            int hashCode33 = (hashCode32 + (targetDto == null ? 0 : targetDto.hashCode())) * 31;
            VideoInteractiveInfoDto videoInteractiveInfoDto = this.interactiveInfo;
            int hashCode34 = (hashCode33 + (videoInteractiveInfoDto == null ? 0 : videoInteractiveInfoDto.hashCode())) * 31;
            VideoOrdInfoDto videoOrdInfoDto = this.ordInfo;
            int hashCode35 = (hashCode34 + (videoOrdInfoDto == null ? 0 : videoOrdInfoDto.hashCode())) * 31;
            List<com.vk.api.generated.video.dto.VideoVideoFullDto> list5 = this.attachedShortVideos;
            int hashCode36 = (hashCode35 + (list5 == null ? 0 : list5.hashCode())) * 31;
            Integer num4 = this.attachedShortVideosCounter;
            int hashCode37 = (hashCode36 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str4 = this.directUrl;
            int hashCode38 = (hashCode37 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.shareUrl;
            int hashCode39 = (hashCode38 + (str5 == null ? 0 : str5.hashCode())) * 31;
            ResponseTypeDto responseTypeDto = this.responseType;
            int hashCode40 = (hashCode39 + (responseTypeDto == null ? 0 : responseTypeDto.hashCode())) * 31;
            String str6 = this.accessKey;
            int hashCode41 = (hashCode40 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num5 = this.addingDate;
            int hashCode42 = (hashCode41 + (num5 == null ? 0 : num5.hashCode())) * 31;
            VideoAdsInfoDto videoAdsInfoDto = this.adsInfo;
            int hashCode43 = (hashCode42 + (videoAdsInfoDto == null ? 0 : videoAdsInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            int hashCode44 = (hashCode43 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canEdit;
            int hashCode45 = (hashCode44 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canDelete;
            int hashCode46 = (hashCode45 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.canLike;
            int hashCode47 = (hashCode46 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            Integer num6 = this.canRepost;
            int hashCode48 = (hashCode47 + (num6 == null ? 0 : num6.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.canSubscribe;
            int hashCode49 = (hashCode48 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto6 = this.canBePromoted;
            int hashCode50 = (hashCode49 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto7 = this.canAddToFaves;
            int hashCode51 = (hashCode50 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto8 = this.canAdd;
            int hashCode52 = (hashCode51 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto9 = this.canAttachLink;
            int hashCode53 = (hashCode52 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto10 = this.canPlayInBackground;
            int hashCode54 = (hashCode53 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
            Integer num7 = this.canDownload;
            int hashCode55 = (hashCode54 + (num7 == null ? 0 : num7.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto11 = this.canEditPrivacy;
            int hashCode56 = (hashCode55 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto12 = this.canRemoveFromRecommendations;
            int hashCode57 = (hashCode56 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
            VideoVideoDownloadDto videoVideoDownloadDto = this.download;
            int hashCode58 = (hashCode57 + (videoVideoDownloadDto == null ? 0 : videoVideoDownloadDto.hashCode())) * 31;
            List<VideoLinkedToPlaylistMarkDto> list6 = this.linkedToPlaylistMarks;
            int hashCode59 = (hashCode58 + (list6 == null ? 0 : list6.hashCode())) * 31;
            Boolean bool7 = this.isArchivalContent;
            int hashCode60 = (hashCode59 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Integer num8 = this.archivalContentPublishedDate;
            int hashCode61 = (hashCode60 + (num8 == null ? 0 : num8.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto13 = this.isPrivate;
            int hashCode62 = (hashCode61 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto14 = this.isFromMessage;
            int hashCode63 = (hashCode62 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto15 = this.isDraft;
            int hashCode64 = (hashCode63 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
            Integer num9 = this.comments;
            int hashCode65 = (hashCode64 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.date;
            int hashCode66 = (hashCode65 + (num10 == null ? 0 : num10.hashCode())) * 31;
            String str7 = this.description;
            int hashCode67 = (hashCode66 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num11 = this.duration;
            int hashCode68 = (hashCode67 + (num11 == null ? 0 : num11.hashCode())) * 31;
            List<VideoVideoImageDto> list7 = this.image;
            int hashCode69 = (hashCode68 + (list7 == null ? 0 : list7.hashCode())) * 31;
            List<VideoVideoImageDto> list8 = this.firstFrame;
            int hashCode70 = (hashCode69 + (list8 == null ? 0 : list8.hashCode())) * 31;
            Integer num12 = this.width;
            int hashCode71 = (hashCode70 + (num12 == null ? 0 : num12.hashCode())) * 31;
            Integer num13 = this.height;
            int hashCode72 = (hashCode71 + (num13 == null ? 0 : num13.hashCode())) * 31;
            Integer num14 = this.id;
            int hashCode73 = (hashCode72 + (num14 == null ? 0 : num14.hashCode())) * 31;
            UserId userId2 = this.ownerId;
            int hashCode74 = (hashCode73 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            UserId userId3 = this.userId;
            int hashCode75 = (hashCode74 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            Boolean bool8 = this.isAuthor;
            int hashCode76 = (hashCode75 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            String str8 = this.ovId;
            int hashCode77 = (hashCode76 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.title;
            int hashCode78 = (hashCode77 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool9 = this.isFavorite;
            int hashCode79 = (hashCode78 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto2 = this.noAutoplay;
            int hashCode80 = (hashCode79 + (basePropertyExistsDto2 == null ? 0 : basePropertyExistsDto2.hashCode())) * 31;
            String str10 = this.player;
            int hashCode81 = (hashCode80 + (str10 == null ? 0 : str10.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto3 = this.processing;
            int hashCode82 = (hashCode81 + (basePropertyExistsDto3 == null ? 0 : basePropertyExistsDto3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto16 = this.converting;
            int hashCode83 = (hashCode82 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
            MediaRestrictionDto mediaRestrictionDto = this.restriction;
            int hashCode84 = (hashCode83 + (mediaRestrictionDto == null ? 0 : mediaRestrictionDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto17 = this.added;
            int hashCode85 = (hashCode84 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto18 = this.isSubscribed;
            int hashCode86 = (hashCode85 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
            String str11 = this.trackCode;
            int hashCode87 = (hashCode86 + (str11 == null ? 0 : str11.hashCode())) * 31;
            VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = this.trackingInfo;
            int hashCode88 = (hashCode87 + (videoVideoTrackingInfoDto == null ? 0 : videoVideoTrackingInfoDto.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto4 = this.repeat;
            int hashCode89 = (hashCode88 + (basePropertyExistsDto4 == null ? 0 : basePropertyExistsDto4.hashCode())) * 31;
            String str12 = this.partnerText;
            int hashCode90 = (hashCode89 + (str12 == null ? 0 : str12.hashCode())) * 31;
            VideoVideoTypeDto videoVideoTypeDto = this.type;
            int hashCode91 = (hashCode90 + (videoVideoTypeDto == null ? 0 : videoVideoTypeDto.hashCode())) * 31;
            Integer num15 = this.views;
            int hashCode92 = (hashCode91 + (num15 == null ? 0 : num15.hashCode())) * 31;
            Integer num16 = this.localViews;
            int hashCode93 = (hashCode92 + (num16 == null ? 0 : num16.hashCode())) * 31;
            Integer num17 = this.contentRestricted;
            int hashCode94 = (hashCode93 + (num17 == null ? 0 : num17.hashCode())) * 31;
            String str13 = this.contentRestrictedMessage;
            int hashCode95 = (hashCode94 + (str13 == null ? 0 : str13.hashCode())) * 31;
            Integer num18 = this.albumId;
            int hashCode96 = (hashCode95 + (num18 == null ? 0 : num18.hashCode())) * 31;
            String str14 = this.context;
            int hashCode97 = (hashCode96 + (str14 == null ? 0 : str14.hashCode())) * 31;
            Integer num19 = this.balance;
            int hashCode98 = (hashCode97 + (num19 == null ? 0 : num19.hashCode())) * 31;
            VideoLiveStatusDto videoLiveStatusDto = this.liveStatus;
            int hashCode99 = (hashCode98 + (videoLiveStatusDto == null ? 0 : videoLiveStatusDto.hashCode())) * 31;
            Integer num20 = this.liveStartTime;
            int hashCode100 = (hashCode99 + (num20 == null ? 0 : num20.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto19 = this.liveNotify;
            int hashCode101 = (hashCode100 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
            Integer num21 = this.spectators;
            int hashCode102 = (hashCode101 + (num21 == null ? 0 : num21.hashCode())) * 31;
            String str15 = this.platform;
            int hashCode103 = (hashCode102 + (str15 == null ? 0 : str15.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode104 = (hashCode103 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode105 = (hashCode104 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            Integer num22 = this.moderationStatus;
            int hashCode106 = (hashCode105 + (num22 == null ? 0 : num22.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto5 = this.needMute;
            int hashCode107 = (hashCode106 + (basePropertyExistsDto5 == null ? 0 : basePropertyExistsDto5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto20 = this.isUnitedVideo;
            int hashCode108 = (hashCode107 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
            Integer num23 = this.umaTrackId;
            int hashCode109 = (hashCode108 + (num23 == null ? 0 : num23.hashCode())) * 31;
            Integer num24 = this.ovProviderId;
            int hashCode110 = (hashCode109 + (num24 == null ? 0 : num24.hashCode())) * 31;
            String str16 = this.randomTag;
            int hashCode111 = (hashCode110 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.uvStatsPlace;
            int hashCode112 = (hashCode111 + (str17 == null ? 0 : str17.hashCode())) * 31;
            Integer num25 = this.server;
            int hashCode113 = (hashCode112 + (num25 == null ? 0 : num25.hashCode())) * 31;
            Boolean bool10 = this.isMobileLive;
            int hashCode114 = (hashCode113 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.isSpherical;
            int hashCode115 = (hashCode114 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto21 = this.canDislike;
            int hashCode116 = (hashCode115 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
            ActionLinksActionDto actionLinksActionDto2 = this.titleAction;
            int hashCode117 = (hashCode116 + (actionLinksActionDto2 == null ? 0 : actionLinksActionDto2.hashCode())) * 31;
            Integer num26 = this.publishedAt;
            int hashCode118 = (hashCode117 + (num26 == null ? 0 : num26.hashCode())) * 31;
            String str18 = this.thumbHash;
            int hashCode119 = (hashCode118 + (str18 == null ? 0 : str18.hashCode())) * 31;
            VideoAccessInfoDto videoAccessInfoDto = this.accessInfo;
            int hashCode120 = (hashCode119 + (videoAccessInfoDto == null ? 0 : videoAccessInfoDto.hashCode())) * 31;
            Integer num27 = this.wallPostId;
            int hashCode121 = (hashCode120 + (num27 == null ? 0 : num27.hashCode())) * 31;
            List<AdsItemBlockAdStatPixelDto> list9 = this.adsStatPixels;
            int hashCode122 = (hashCode121 + (list9 == null ? 0 : list9.hashCode())) * 31;
            Integer num28 = this.donutLevelId;
            int hashCode123 = (hashCode122 + (num28 == null ? 0 : num28.hashCode())) * 31;
            String str19 = this.promoPostHash;
            int hashCode124 = (hashCode123 + (str19 == null ? 0 : str19.hashCode())) * 31;
            Boolean bool12 = this.shouldStretch;
            int hashCode125 = (hashCode124 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            String str20 = this.vkLiveChannelUrl;
            int hashCode126 = (hashCode125 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.vkLiveChannelName;
            int hashCode127 = (hashCode126 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.vkLiveVideoId;
            int hashCode128 = (hashCode127 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.vkLiveSlotUrl;
            int hashCode129 = (hashCode128 + (str23 == null ? 0 : str23.hashCode())) * 31;
            VideoDonutDto videoDonutDto = this.donut;
            int hashCode130 = (hashCode129 + (videoDonutDto == null ? 0 : videoDonutDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto22 = this.canReport;
            int hashCode131 = (hashCode130 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto23 = this.canCutToShortVideo;
            int hashCode132 = (hashCode131 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto24 = this.isExplicit;
            int hashCode133 = (hashCode132 + (baseBoolIntDto24 == null ? 0 : baseBoolIntDto24.hashCode())) * 31;
            List<AudioArtistDto> list10 = this.mainArtists;
            int hashCode134 = (hashCode133 + (list10 == null ? 0 : list10.hashCode())) * 31;
            List<AudioArtistDto> list11 = this.featuredArtists;
            int hashCode135 = (hashCode134 + (list11 == null ? 0 : list11.hashCode())) * 31;
            String str24 = this.subtitle;
            int hashCode136 = (hashCode135 + (str24 == null ? 0 : str24.hashCode())) * 31;
            Integer num29 = this.releaseDate;
            int hashCode137 = (hashCode136 + (num29 == null ? 0 : num29.hashCode())) * 31;
            List<AudioGenreDto> list12 = this.genres;
            return hashCode137 + (list12 != null ? list12.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoVideoFullDto(files=");
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
            Integer num = this.marketItemsCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
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
            Integer num2 = this.viewedDuration;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeParcelable(this.originalsInfo, i);
            parcel.writeParcelable(this.deduplicationOriginalInfo, i);
            Integer num3 = this.source;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
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
            List<com.vk.api.generated.video.dto.VideoVideoFullDto> list5 = this.attachedShortVideos;
            if (list5 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f6 = dn.f(parcel, list5, 1);
                while (f6.hasNext()) {
                    parcel.writeParcelable((Parcelable) f6.next(), i);
                }
            }
            Integer num4 = this.attachedShortVideosCounter;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
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
            Integer num5 = this.addingDate;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num5);
            }
            parcel.writeParcelable(this.adsInfo, i);
            parcel.writeParcelable(this.canComment, i);
            parcel.writeParcelable(this.canEdit, i);
            parcel.writeParcelable(this.canDelete, i);
            parcel.writeParcelable(this.canLike, i);
            Integer num6 = this.canRepost;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num6);
            }
            parcel.writeParcelable(this.canSubscribe, i);
            parcel.writeParcelable(this.canBePromoted, i);
            parcel.writeParcelable(this.canAddToFaves, i);
            parcel.writeParcelable(this.canAdd, i);
            parcel.writeParcelable(this.canAttachLink, i);
            parcel.writeParcelable(this.canPlayInBackground, i);
            Integer num7 = this.canDownload;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num7);
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
            Integer num8 = this.archivalContentPublishedDate;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num8);
            }
            parcel.writeParcelable(this.isPrivate, i);
            parcel.writeParcelable(this.isFromMessage, i);
            parcel.writeParcelable(this.isDraft, i);
            Integer num9 = this.comments;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num9);
            }
            Integer num10 = this.date;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num10);
            }
            parcel.writeString(this.description);
            Integer num11 = this.duration;
            if (num11 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num11);
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
            Integer num12 = this.width;
            if (num12 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num12);
            }
            Integer num13 = this.height;
            if (num13 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num13);
            }
            Integer num14 = this.id;
            if (num14 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num14);
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
            Integer num15 = this.views;
            if (num15 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num15);
            }
            Integer num16 = this.localViews;
            if (num16 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num16);
            }
            Integer num17 = this.contentRestricted;
            if (num17 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num17);
            }
            parcel.writeString(this.contentRestrictedMessage);
            Integer num18 = this.albumId;
            if (num18 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num18);
            }
            parcel.writeString(this.context);
            Integer num19 = this.balance;
            if (num19 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num19);
            }
            parcel.writeParcelable(this.liveStatus, i);
            Integer num20 = this.liveStartTime;
            if (num20 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num20);
            }
            parcel.writeParcelable(this.liveNotify, i);
            Integer num21 = this.spectators;
            if (num21 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num21);
            }
            parcel.writeString(this.platform);
            parcel.writeParcelable(this.likes, i);
            parcel.writeParcelable(this.reposts, i);
            Integer num22 = this.moderationStatus;
            if (num22 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num22);
            }
            parcel.writeParcelable(this.needMute, i);
            parcel.writeParcelable(this.isUnitedVideo, i);
            Integer num23 = this.umaTrackId;
            if (num23 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num23);
            }
            Integer num24 = this.ovProviderId;
            if (num24 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num24);
            }
            parcel.writeString(this.randomTag);
            parcel.writeString(this.uvStatsPlace);
            Integer num25 = this.server;
            if (num25 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num25);
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
            Integer num26 = this.publishedAt;
            if (num26 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num26);
            }
            parcel.writeString(this.thumbHash);
            parcel.writeParcelable(this.accessInfo, i);
            Integer num27 = this.wallPostId;
            if (num27 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num27);
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
            Integer num28 = this.donutLevelId;
            if (num28 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num28);
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
            Integer num29 = this.releaseDate;
            if (num29 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num29);
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

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ VideoVideoFullDto(VideoVideoFilesDto videoVideoFilesDto, VideoVideoFilesDto videoVideoFilesDto2, List list, List list2, Float f, VideoLiveSettingsDto videoLiveSettingsDto, BasePrivacyDto basePrivacyDto, BasePrivacyDto basePrivacyDto2, VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto, VideoTimelineThumbsDto videoTimelineThumbsDto, VideoAdsDto videoAdsDto, ActionLinksActionDto actionLinksActionDto, BasePropertyExistsDto basePropertyExistsDto, List list3, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, String str2, ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto, List list4, Boolean bool6, Integer num2, VideoOriginalsInfoDto videoOriginalsInfoDto, VideoDeduplicationOriginalDto videoDeduplicationOriginalDto, Integer num3, UserId userId, ServerEffectDto serverEffectDto, String str3, TargetDto targetDto, VideoInteractiveInfoDto videoInteractiveInfoDto, VideoOrdInfoDto videoOrdInfoDto, List list5, Integer num4, String str4, String str5, ResponseTypeDto responseTypeDto, String str6, Integer num5, VideoAdsInfoDto videoAdsInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num6, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num7, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, VideoVideoDownloadDto videoVideoDownloadDto, List list6, Boolean bool7, Integer num8, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, Integer num9, Integer num10, String str7, Integer num11, List list7, List list8, Integer num12, Integer num13, Integer num14, UserId userId2, UserId userId3, Boolean bool8, String str8, String str9, Boolean bool9, BasePropertyExistsDto basePropertyExistsDto2, String str10, BasePropertyExistsDto basePropertyExistsDto3, BaseBoolIntDto baseBoolIntDto16, MediaRestrictionDto mediaRestrictionDto, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, String str11, VideoVideoTrackingInfoDto videoVideoTrackingInfoDto, BasePropertyExistsDto basePropertyExistsDto4, String str12, VideoVideoTypeDto videoVideoTypeDto, Integer num15, Integer num16, Integer num17, String str13, Integer num18, String str14, Integer num19, VideoLiveStatusDto videoLiveStatusDto, Integer num20, BaseBoolIntDto baseBoolIntDto19, Integer num21, String str15, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num22, BasePropertyExistsDto basePropertyExistsDto5, BaseBoolIntDto baseBoolIntDto20, Integer num23, Integer num24, String str16, String str17, Integer num25, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto21, ActionLinksActionDto actionLinksActionDto2, Integer num26, String str18, VideoAccessInfoDto videoAccessInfoDto, Integer num27, List list9, Integer num28, String str19, Boolean bool12, String str20, String str21, String str22, String str23, VideoDonutDto videoDonutDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, List list10, List list11, String str24, Integer num29, List list12, int i, int i2, int i3, int i4, int i5, zcl zclVar) {
            this(r109, r7, r8, r9, r10, r11, r12, r13, r14, r15, r6, r110, r111, r112, r5, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r113, r38, r39, r40, r41, r42, r43, r44, r114, r115, r116, r117, r118, r119, r120, r121, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r1, r61, r62, r63, r64, r65, r66, r67, r122, r123, r124, r125, r126, r127, r128, r0, (i3 & 32768) != 0 ? null : basePropertyExistsDto2, (i3 & 65536) != 0 ? null : str10, (i3 & 131072) != 0 ? null : basePropertyExistsDto3, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto16, (i3 & 524288) != 0 ? null : mediaRestrictionDto, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto17, (i3 & 2097152) != 0 ? null : baseBoolIntDto18, (i3 & 4194304) != 0 ? null : str11, (i3 & 8388608) != 0 ? null : videoVideoTrackingInfoDto, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : basePropertyExistsDto4, (i3 & 33554432) != 0 ? null : str12, (i3 & 67108864) != 0 ? null : videoVideoTypeDto, (i3 & 134217728) != 0 ? null : num15, (i3 & 268435456) != 0 ? null : num16, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num17, (i3 & 1073741824) != 0 ? null : str13, (i3 & Integer.MIN_VALUE) != 0 ? null : num18, (i4 & 1) != 0 ? null : str14, (i4 & 2) != 0 ? null : num19, (i4 & 4) != 0 ? null : videoLiveStatusDto, (i4 & 8) != 0 ? null : num20, (i4 & 16) != 0 ? null : baseBoolIntDto19, (i4 & 32) != 0 ? null : num21, (i4 & 64) != 0 ? null : str15, (i4 & 128) != 0 ? null : baseLikesDto, (i4 & 256) != 0 ? null : baseRepostsInfoDto, (i4 & 512) != 0 ? null : num22, (i4 & 1024) != 0 ? null : basePropertyExistsDto5, (i4 & 2048) != 0 ? null : baseBoolIntDto20, (i4 & 4096) != 0 ? null : num23, (i4 & 8192) != 0 ? null : num24, (i4 & 16384) != 0 ? null : str16, (i4 & 32768) != 0 ? null : str17, (i4 & 65536) != 0 ? null : num25, (i4 & 131072) != 0 ? null : bool10, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool11, (i4 & 524288) != 0 ? null : baseBoolIntDto21, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : actionLinksActionDto2, (i4 & 2097152) != 0 ? null : num26, (i4 & 4194304) != 0 ? null : str18, (i4 & 8388608) != 0 ? null : videoAccessInfoDto, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num27, (i4 & 33554432) != 0 ? null : list9, (i4 & 67108864) != 0 ? null : num28, (i4 & 134217728) != 0 ? null : str19, (i4 & 268435456) != 0 ? null : bool12, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str20, (i4 & 1073741824) != 0 ? null : str21, (i4 & Integer.MIN_VALUE) != 0 ? null : str22, (i5 & 1) != 0 ? null : str23, (i5 & 2) != 0 ? null : videoDonutDto, (i5 & 4) != 0 ? null : baseBoolIntDto22, (i5 & 8) != 0 ? null : baseBoolIntDto23, (i5 & 16) != 0 ? null : baseBoolIntDto24, (i5 & 32) != 0 ? null : list10, (i5 & 64) != 0 ? null : list11, (i5 & 128) != 0 ? null : str24, (i5 & 256) != 0 ? null : num29, (i5 & 512) != 0 ? null : list12);
            VideoVideoFilesDto videoVideoFilesDto3 = (i & 1) != 0 ? null : videoVideoFilesDto;
            VideoVideoFilesDto videoVideoFilesDto4 = (i & 2) != 0 ? null : videoVideoFilesDto2;
            List list13 = (i & 4) != 0 ? null : list;
            List list14 = (i & 8) != 0 ? null : list2;
            Float f2 = (i & 16) != 0 ? null : f;
            VideoLiveSettingsDto videoLiveSettingsDto2 = (i & 32) != 0 ? null : videoLiveSettingsDto;
            BasePrivacyDto basePrivacyDto3 = (i & 64) != 0 ? null : basePrivacyDto;
            BasePrivacyDto basePrivacyDto4 = (i & 128) != 0 ? null : basePrivacyDto2;
            VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto2 = (i & 256) != 0 ? null : videoPrivacyCutToShortVideoDto;
            VideoTimelineThumbsDto videoTimelineThumbsDto2 = (i & 512) != 0 ? null : videoTimelineThumbsDto;
            VideoAdsDto videoAdsDto2 = (i & 1024) != 0 ? null : videoAdsDto;
            VideoVideoFilesDto videoVideoFilesDto5 = videoVideoFilesDto3;
            ActionLinksActionDto actionLinksActionDto3 = (i & 2048) != 0 ? null : actionLinksActionDto;
            BasePropertyExistsDto basePropertyExistsDto6 = (i & 4096) != 0 ? null : basePropertyExistsDto;
            List list15 = (i & 8192) != 0 ? null : list3;
            String str25 = (i & 16384) != 0 ? null : str;
            Boolean bool13 = (i & 32768) != 0 ? null : bool;
            Boolean bool14 = (i & 65536) != 0 ? null : bool2;
            Boolean bool15 = (i & 131072) != 0 ? null : bool3;
            Boolean bool16 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool4;
            Boolean bool17 = (i & 524288) != 0 ? null : bool5;
            Integer num30 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num;
            String str26 = (i & 2097152) != 0 ? null : str2;
            ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto2 = (i & 4194304) != 0 ? null : shortVideoShortVideoInfoDto;
            List list16 = (i & 8388608) != 0 ? null : list4;
            Boolean bool18 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool6;
            Integer num31 = (i & 33554432) != 0 ? null : num2;
            VideoOriginalsInfoDto videoOriginalsInfoDto2 = (i & 67108864) != 0 ? null : videoOriginalsInfoDto;
            VideoDeduplicationOriginalDto videoDeduplicationOriginalDto2 = (i & 134217728) != 0 ? null : videoDeduplicationOriginalDto;
            Integer num32 = (i & 268435456) != 0 ? null : num3;
            UserId userId4 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : userId;
            ServerEffectDto serverEffectDto2 = (i & 1073741824) != 0 ? null : serverEffectDto;
            String str27 = (i & Integer.MIN_VALUE) != 0 ? null : str3;
            TargetDto targetDto2 = (i2 & 1) != 0 ? null : targetDto;
            VideoInteractiveInfoDto videoInteractiveInfoDto2 = (i2 & 2) != 0 ? null : videoInteractiveInfoDto;
            VideoOrdInfoDto videoOrdInfoDto2 = (i2 & 4) != 0 ? null : videoOrdInfoDto;
            List list17 = (i2 & 8) != 0 ? null : list5;
            Integer num33 = (i2 & 16) != 0 ? null : num4;
            String str28 = (i2 & 32) != 0 ? null : str4;
            String str29 = (i2 & 64) != 0 ? null : str5;
            String str30 = str27;
            ResponseTypeDto responseTypeDto2 = (i2 & 128) != 0 ? null : responseTypeDto;
            String str31 = (i2 & 256) != 0 ? null : str6;
            Integer num34 = (i2 & 512) != 0 ? null : num5;
            VideoAdsInfoDto videoAdsInfoDto2 = (i2 & 1024) != 0 ? null : videoAdsInfoDto;
            BaseBoolIntDto baseBoolIntDto25 = (i2 & 2048) != 0 ? null : baseBoolIntDto;
            BaseBoolIntDto baseBoolIntDto26 = (i2 & 4096) != 0 ? null : baseBoolIntDto2;
            BaseBoolIntDto baseBoolIntDto27 = (i2 & 8192) != 0 ? null : baseBoolIntDto3;
            BaseBoolIntDto baseBoolIntDto28 = (i2 & 16384) != 0 ? null : baseBoolIntDto4;
            Integer num35 = (i2 & 32768) != 0 ? null : num6;
            BaseBoolIntDto baseBoolIntDto29 = (i2 & 65536) != 0 ? null : baseBoolIntDto5;
            BaseBoolIntDto baseBoolIntDto30 = (i2 & 131072) != 0 ? null : baseBoolIntDto6;
            BaseBoolIntDto baseBoolIntDto31 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto7;
            BaseBoolIntDto baseBoolIntDto32 = (i2 & 524288) != 0 ? null : baseBoolIntDto8;
            BaseBoolIntDto baseBoolIntDto33 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto9;
            BaseBoolIntDto baseBoolIntDto34 = (i2 & 2097152) != 0 ? null : baseBoolIntDto10;
            Integer num36 = (i2 & 4194304) != 0 ? null : num7;
            BaseBoolIntDto baseBoolIntDto35 = (i2 & 8388608) != 0 ? null : baseBoolIntDto11;
            BaseBoolIntDto baseBoolIntDto36 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto12;
            VideoVideoDownloadDto videoVideoDownloadDto2 = (i2 & 33554432) != 0 ? null : videoVideoDownloadDto;
            List list18 = (i2 & 67108864) != 0 ? null : list6;
            Boolean bool19 = (i2 & 134217728) != 0 ? null : bool7;
            Integer num37 = (i2 & 268435456) != 0 ? null : num8;
            BaseBoolIntDto baseBoolIntDto37 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto13;
            BaseBoolIntDto baseBoolIntDto38 = (i2 & 1073741824) != 0 ? null : baseBoolIntDto14;
            BaseBoolIntDto baseBoolIntDto39 = (i2 & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto15;
            Integer num38 = (i3 & 1) != 0 ? null : num9;
            Integer num39 = (i3 & 2) != 0 ? null : num10;
            String str32 = (i3 & 4) != 0 ? null : str7;
            Integer num40 = (i3 & 8) != 0 ? null : num11;
            List list19 = (i3 & 16) != 0 ? null : list7;
            List list20 = (i3 & 32) != 0 ? null : list8;
            Integer num41 = (i3 & 64) != 0 ? null : num12;
            BaseBoolIntDto baseBoolIntDto40 = baseBoolIntDto28;
            Integer num42 = (i3 & 128) != 0 ? null : num13;
            Integer num43 = (i3 & 256) != 0 ? null : num14;
            UserId userId5 = (i3 & 512) != 0 ? null : userId2;
            UserId userId6 = (i3 & 1024) != 0 ? null : userId3;
            Boolean bool20 = (i3 & 2048) != 0 ? null : bool8;
            String str33 = (i3 & 4096) != 0 ? null : str8;
            String str34 = (i3 & 8192) != 0 ? null : str9;
            Boolean bool21 = (i3 & 16384) != 0 ? null : bool9;
        }

        public VideoVideoFullDto(VideoVideoFilesDto videoVideoFilesDto, VideoVideoFilesDto videoVideoFilesDto2, List<VideoEpisodeDto> list, List<VideoQualityInfoDto> list2, Float f, VideoLiveSettingsDto videoLiveSettingsDto, BasePrivacyDto basePrivacyDto, BasePrivacyDto basePrivacyDto2, VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto, VideoTimelineThumbsDto videoTimelineThumbsDto, VideoAdsDto videoAdsDto, ActionLinksActionDto actionLinksActionDto, BasePropertyExistsDto basePropertyExistsDto, List<VideoSubtitlesDto> list3, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, String str2, ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto, List<VideoStatsPixelDto> list4, Boolean bool6, Integer num2, VideoOriginalsInfoDto videoOriginalsInfoDto, VideoDeduplicationOriginalDto videoDeduplicationOriginalDto, Integer num3, UserId userId, ServerEffectDto serverEffectDto, String str3, TargetDto targetDto, VideoInteractiveInfoDto videoInteractiveInfoDto, VideoOrdInfoDto videoOrdInfoDto, List<com.vk.api.generated.video.dto.VideoVideoFullDto> list5, Integer num4, String str4, String str5, ResponseTypeDto responseTypeDto, String str6, Integer num5, VideoAdsInfoDto videoAdsInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num6, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num7, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, VideoVideoDownloadDto videoVideoDownloadDto, List<VideoLinkedToPlaylistMarkDto> list6, Boolean bool7, Integer num8, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, Integer num9, Integer num10, String str7, Integer num11, List<VideoVideoImageDto> list7, List<VideoVideoImageDto> list8, Integer num12, Integer num13, Integer num14, UserId userId2, UserId userId3, Boolean bool8, String str8, String str9, Boolean bool9, BasePropertyExistsDto basePropertyExistsDto2, String str10, BasePropertyExistsDto basePropertyExistsDto3, BaseBoolIntDto baseBoolIntDto16, MediaRestrictionDto mediaRestrictionDto, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, String str11, VideoVideoTrackingInfoDto videoVideoTrackingInfoDto, BasePropertyExistsDto basePropertyExistsDto4, String str12, VideoVideoTypeDto videoVideoTypeDto, Integer num15, Integer num16, Integer num17, String str13, Integer num18, String str14, Integer num19, VideoLiveStatusDto videoLiveStatusDto, Integer num20, BaseBoolIntDto baseBoolIntDto19, Integer num21, String str15, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num22, BasePropertyExistsDto basePropertyExistsDto5, BaseBoolIntDto baseBoolIntDto20, Integer num23, Integer num24, String str16, String str17, Integer num25, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto21, ActionLinksActionDto actionLinksActionDto2, Integer num26, String str18, VideoAccessInfoDto videoAccessInfoDto, Integer num27, List<AdsItemBlockAdStatPixelDto> list9, Integer num28, String str19, Boolean bool12, String str20, String str21, String str22, String str23, VideoDonutDto videoDonutDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, List<AudioArtistDto> list10, List<AudioArtistDto> list11, String str24, Integer num29, List<AudioGenreDto> list12) {
            super(null);
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
            this.forceSubtitles = str;
            this.needMyTracker = bool;
            this.canSeeUma = bool2;
            this.canBePinned = bool3;
            this.isPinned = bool4;
            this.hasMarketItems = bool5;
            this.marketItemsCount = num;
            this.sourceFileName = str2;
            this.shortVideoInfo = shortVideoShortVideoInfoDto;
            this.statsPixels = list4;
            this.needMediascopeStat = bool6;
            this.viewedDuration = num2;
            this.originalsInfo = videoOriginalsInfoDto;
            this.deduplicationOriginalInfo = videoDeduplicationOriginalDto;
            this.source = num3;
            this.sourceOwner = userId;
            this.serverEffect = serverEffectDto;
            this.md5 = str3;
            this.target = targetDto;
            this.interactiveInfo = videoInteractiveInfoDto;
            this.ordInfo = videoOrdInfoDto;
            this.attachedShortVideos = list5;
            this.attachedShortVideosCounter = num4;
            this.directUrl = str4;
            this.shareUrl = str5;
            this.responseType = responseTypeDto;
            this.accessKey = str6;
            this.addingDate = num5;
            this.adsInfo = videoAdsInfoDto;
            this.canComment = baseBoolIntDto;
            this.canEdit = baseBoolIntDto2;
            this.canDelete = baseBoolIntDto3;
            this.canLike = baseBoolIntDto4;
            this.canRepost = num6;
            this.canSubscribe = baseBoolIntDto5;
            this.canBePromoted = baseBoolIntDto6;
            this.canAddToFaves = baseBoolIntDto7;
            this.canAdd = baseBoolIntDto8;
            this.canAttachLink = baseBoolIntDto9;
            this.canPlayInBackground = baseBoolIntDto10;
            this.canDownload = num7;
            this.canEditPrivacy = baseBoolIntDto11;
            this.canRemoveFromRecommendations = baseBoolIntDto12;
            this.download = videoVideoDownloadDto;
            this.linkedToPlaylistMarks = list6;
            this.isArchivalContent = bool7;
            this.archivalContentPublishedDate = num8;
            this.isPrivate = baseBoolIntDto13;
            this.isFromMessage = baseBoolIntDto14;
            this.isDraft = baseBoolIntDto15;
            this.comments = num9;
            this.date = num10;
            this.description = str7;
            this.duration = num11;
            this.image = list7;
            this.firstFrame = list8;
            this.width = num12;
            this.height = num13;
            this.id = num14;
            this.ownerId = userId2;
            this.userId = userId3;
            this.isAuthor = bool8;
            this.ovId = str8;
            this.title = str9;
            this.isFavorite = bool9;
            this.noAutoplay = basePropertyExistsDto2;
            this.player = str10;
            this.processing = basePropertyExistsDto3;
            this.converting = baseBoolIntDto16;
            this.restriction = mediaRestrictionDto;
            this.added = baseBoolIntDto17;
            this.isSubscribed = baseBoolIntDto18;
            this.trackCode = str11;
            this.trackingInfo = videoVideoTrackingInfoDto;
            this.repeat = basePropertyExistsDto4;
            this.partnerText = str12;
            this.type = videoVideoTypeDto;
            this.views = num15;
            this.localViews = num16;
            this.contentRestricted = num17;
            this.contentRestrictedMessage = str13;
            this.albumId = num18;
            this.context = str14;
            this.balance = num19;
            this.liveStatus = videoLiveStatusDto;
            this.liveStartTime = num20;
            this.liveNotify = baseBoolIntDto19;
            this.spectators = num21;
            this.platform = str15;
            this.likes = baseLikesDto;
            this.reposts = baseRepostsInfoDto;
            this.moderationStatus = num22;
            this.needMute = basePropertyExistsDto5;
            this.isUnitedVideo = baseBoolIntDto20;
            this.umaTrackId = num23;
            this.ovProviderId = num24;
            this.randomTag = str16;
            this.uvStatsPlace = str17;
            this.server = num25;
            this.isMobileLive = bool10;
            this.isSpherical = bool11;
            this.canDislike = baseBoolIntDto21;
            this.titleAction = actionLinksActionDto2;
            this.publishedAt = num26;
            this.thumbHash = str18;
            this.accessInfo = videoAccessInfoDto;
            this.wallPostId = num27;
            this.adsStatPixels = list9;
            this.donutLevelId = num28;
            this.promoPostHash = str19;
            this.shouldStretch = bool12;
            this.vkLiveChannelUrl = str20;
            this.vkLiveChannelName = str21;
            this.vkLiveVideoId = str22;
            this.vkLiveSlotUrl = str23;
            this.donut = videoDonutDto;
            this.canReport = baseBoolIntDto22;
            this.canCutToShortVideo = baseBoolIntDto23;
            this.isExplicit = baseBoolIntDto24;
            this.mainArtists = list10;
            this.featuredArtists = list11;
            this.subtitle = str24;
            this.releaseDate = num29;
            this.genres = list12;
        }
    }

    public /* synthetic */ VideoOneOfVideoObjectsDto(zcl zclVar) {
        this();
    }

    private VideoOneOfVideoObjectsDto() {
    }
}
