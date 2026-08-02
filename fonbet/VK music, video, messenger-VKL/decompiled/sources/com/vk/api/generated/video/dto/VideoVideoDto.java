package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Hb;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioGenreDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoVideoDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoDto implements Parcelable {
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
    /* compiled from: VideoVideoDto.kt */
    public static final class ResponseTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResponseTypeDto[] $VALUES;
        public static final Parcelable.Creator<ResponseTypeDto> CREATOR;

        @pmi0("full")
        public static final ResponseTypeDto FULL;

        @pmi0(UcumUtils.UCUM_MINUTES)
        public static final ResponseTypeDto MIN;
        private final String value;

        /* compiled from: VideoVideoDto.kt */
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

    /* compiled from: VideoVideoDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean bool;
            BaseBoolIntDto createFromParcel;
            BaseBoolIntDto baseBoolIntDto;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Integer num;
            ArrayList arrayList4;
            Boolean valueOf2;
            Boolean valueOf3;
            UserId userId;
            BasePropertyExistsDto createFromParcel2;
            BasePropertyExistsDto basePropertyExistsDto;
            BasePropertyExistsDto createFromParcel3;
            BasePropertyExistsDto basePropertyExistsDto2;
            BaseBoolIntDto createFromParcel4;
            BaseBoolIntDto baseBoolIntDto2;
            MediaRestrictionDto createFromParcel5;
            MediaRestrictionDto mediaRestrictionDto;
            BaseBoolIntDto createFromParcel6;
            BaseBoolIntDto baseBoolIntDto3;
            BaseBoolIntDto createFromParcel7;
            BaseBoolIntDto baseBoolIntDto4;
            VideoVideoTrackingInfoDto createFromParcel8;
            VideoVideoTrackingInfoDto videoVideoTrackingInfoDto;
            BasePropertyExistsDto createFromParcel9;
            BasePropertyExistsDto basePropertyExistsDto3;
            VideoVideoTypeDto createFromParcel10;
            VideoVideoTypeDto videoVideoTypeDto;
            VideoLiveStatusDto createFromParcel11;
            VideoLiveStatusDto videoLiveStatusDto;
            BaseBoolIntDto createFromParcel12;
            BaseBoolIntDto baseBoolIntDto5;
            BaseLikesDto createFromParcel13;
            BaseLikesDto baseLikesDto;
            BaseRepostsInfoDto createFromParcel14;
            BaseRepostsInfoDto baseRepostsInfoDto;
            BasePropertyExistsDto createFromParcel15;
            BasePropertyExistsDto basePropertyExistsDto4;
            BaseBoolIntDto createFromParcel16;
            Boolean valueOf4;
            Boolean valueOf5;
            BaseBoolIntDto baseBoolIntDto6;
            BaseBoolIntDto createFromParcel17;
            BaseBoolIntDto baseBoolIntDto7;
            ActionLinksActionDto createFromParcel18;
            ActionLinksActionDto actionLinksActionDto;
            VideoAccessInfoDto createFromParcel19;
            VideoAccessInfoDto videoAccessInfoDto;
            Integer num2;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Boolean valueOf6;
            Integer num3;
            BaseBoolIntDto createFromParcel20;
            BaseBoolIntDto baseBoolIntDto8;
            BaseBoolIntDto createFromParcel21;
            BaseBoolIntDto baseBoolIntDto9;
            BaseBoolIntDto createFromParcel22;
            BaseBoolIntDto baseBoolIntDto10;
            ArrayList arrayList7;
            ArrayList arrayList8;
            VideoDonutDto videoDonutDto;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ResponseTypeDto createFromParcel23 = parcel.readInt() == 0 ? null : ResponseTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            VideoAdsInfoDto createFromParcel24 = parcel.readInt() == 0 ? null : VideoAdsInfoDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel25 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel26 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel27 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel28 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto createFromParcel29 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel30 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel31 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel32 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel33 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel34 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto createFromParcel35 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel36 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            VideoVideoDownloadDto createFromParcel37 = parcel.readInt() == 0 ? null : VideoVideoDownloadDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoLinkedToPlaylistMarkDto.CREATOR, parcel, arrayList, i, 1);
                    readInt = readInt;
                    createFromParcel23 = createFromParcel23;
                }
            }
            ResponseTypeDto responseTypeDto = createFromParcel23;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto createFromParcel38 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel39 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                bool = valueOf;
                createFromParcel = null;
            } else {
                bool = valueOf;
                createFromParcel = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto11 = createFromParcel;
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto11;
                arrayList2 = arrayList;
                num = valueOf10;
                arrayList3 = null;
            } else {
                baseBoolIntDto = baseBoolIntDto11;
                int readInt2 = parcel.readInt();
                arrayList2 = arrayList;
                arrayList3 = new ArrayList(readInt2);
                num = valueOf10;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(VideoVideoImageDto.CREATOR, parcel, arrayList3, i2, 1);
                    readInt2 = readInt2;
                    createFromParcel39 = createFromParcel39;
                }
            }
            BaseBoolIntDto baseBoolIntDto12 = createFromParcel39;
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList4 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(VideoVideoImageDto.CREATOR, parcel, arrayList4, i3, 1);
                    readInt3 = readInt3;
                    arrayList3 = arrayList3;
                }
            }
            ArrayList arrayList11 = arrayList3;
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num4 = valueOf14;
            UserId userId2 = (UserId) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
            UserId userId3 = (UserId) parcel.readParcelable(VideoVideoDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                userId = userId2;
                createFromParcel2 = null;
            } else {
                userId = userId2;
                createFromParcel2 = BasePropertyExistsDto.CREATOR.createFromParcel(parcel);
            }
            BasePropertyExistsDto basePropertyExistsDto5 = createFromParcel2;
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                basePropertyExistsDto = basePropertyExistsDto5;
                createFromParcel3 = null;
            } else {
                basePropertyExistsDto = basePropertyExistsDto5;
                createFromParcel3 = BasePropertyExistsDto.CREATOR.createFromParcel(parcel);
            }
            BasePropertyExistsDto basePropertyExistsDto6 = createFromParcel3;
            if (parcel.readInt() == 0) {
                basePropertyExistsDto2 = basePropertyExistsDto6;
                createFromParcel4 = null;
            } else {
                basePropertyExistsDto2 = basePropertyExistsDto6;
                createFromParcel4 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto13 = createFromParcel4;
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto13;
                createFromParcel5 = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto13;
                createFromParcel5 = MediaRestrictionDto.CREATOR.createFromParcel(parcel);
            }
            MediaRestrictionDto mediaRestrictionDto2 = createFromParcel5;
            if (parcel.readInt() == 0) {
                mediaRestrictionDto = mediaRestrictionDto2;
                createFromParcel6 = null;
            } else {
                mediaRestrictionDto = mediaRestrictionDto2;
                createFromParcel6 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto14 = createFromParcel6;
            if (parcel.readInt() == 0) {
                baseBoolIntDto3 = baseBoolIntDto14;
                createFromParcel7 = null;
            } else {
                baseBoolIntDto3 = baseBoolIntDto14;
                createFromParcel7 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto15 = createFromParcel7;
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseBoolIntDto4 = baseBoolIntDto15;
                createFromParcel8 = null;
            } else {
                baseBoolIntDto4 = baseBoolIntDto15;
                createFromParcel8 = VideoVideoTrackingInfoDto.CREATOR.createFromParcel(parcel);
            }
            VideoVideoTrackingInfoDto videoVideoTrackingInfoDto2 = createFromParcel8;
            if (parcel.readInt() == 0) {
                videoVideoTrackingInfoDto = videoVideoTrackingInfoDto2;
                createFromParcel9 = null;
            } else {
                videoVideoTrackingInfoDto = videoVideoTrackingInfoDto2;
                createFromParcel9 = BasePropertyExistsDto.CREATOR.createFromParcel(parcel);
            }
            BasePropertyExistsDto basePropertyExistsDto7 = createFromParcel9;
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                basePropertyExistsDto3 = basePropertyExistsDto7;
                createFromParcel10 = null;
            } else {
                basePropertyExistsDto3 = basePropertyExistsDto7;
                createFromParcel10 = VideoVideoTypeDto.CREATOR.createFromParcel(parcel);
            }
            VideoVideoTypeDto videoVideoTypeDto2 = createFromParcel10;
            Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
            Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString9 = parcel.readString();
            Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                videoVideoTypeDto = videoVideoTypeDto2;
                createFromParcel11 = null;
            } else {
                videoVideoTypeDto = videoVideoTypeDto2;
                createFromParcel11 = VideoLiveStatusDto.CREATOR.createFromParcel(parcel);
            }
            VideoLiveStatusDto videoLiveStatusDto2 = createFromParcel11;
            Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                videoLiveStatusDto = videoLiveStatusDto2;
                createFromParcel12 = null;
            } else {
                videoLiveStatusDto = videoLiveStatusDto2;
                createFromParcel12 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto16 = createFromParcel12;
            Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseBoolIntDto5 = baseBoolIntDto16;
                createFromParcel13 = null;
            } else {
                baseBoolIntDto5 = baseBoolIntDto16;
                createFromParcel13 = BaseLikesDto.CREATOR.createFromParcel(parcel);
            }
            BaseLikesDto baseLikesDto2 = createFromParcel13;
            if (parcel.readInt() == 0) {
                baseLikesDto = baseLikesDto2;
                createFromParcel14 = null;
            } else {
                baseLikesDto = baseLikesDto2;
                createFromParcel14 = BaseRepostsInfoDto.CREATOR.createFromParcel(parcel);
            }
            BaseRepostsInfoDto baseRepostsInfoDto2 = createFromParcel14;
            Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseRepostsInfoDto = baseRepostsInfoDto2;
                createFromParcel15 = null;
            } else {
                baseRepostsInfoDto = baseRepostsInfoDto2;
                createFromParcel15 = BasePropertyExistsDto.CREATOR.createFromParcel(parcel);
            }
            BasePropertyExistsDto basePropertyExistsDto8 = createFromParcel15;
            if (parcel.readInt() == 0) {
                basePropertyExistsDto4 = basePropertyExistsDto8;
                createFromParcel16 = null;
            } else {
                basePropertyExistsDto4 = basePropertyExistsDto8;
                createFromParcel16 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto17 = createFromParcel16;
            Integer valueOf25 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString11 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                baseBoolIntDto6 = baseBoolIntDto17;
                createFromParcel17 = null;
            } else {
                baseBoolIntDto6 = baseBoolIntDto17;
                createFromParcel17 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto18 = createFromParcel17;
            if (parcel.readInt() == 0) {
                baseBoolIntDto7 = baseBoolIntDto18;
                createFromParcel18 = null;
            } else {
                baseBoolIntDto7 = baseBoolIntDto18;
                createFromParcel18 = ActionLinksActionDto.CREATOR.createFromParcel(parcel);
            }
            ActionLinksActionDto actionLinksActionDto2 = createFromParcel18;
            Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                actionLinksActionDto = actionLinksActionDto2;
                createFromParcel19 = null;
            } else {
                actionLinksActionDto = actionLinksActionDto2;
                createFromParcel19 = VideoAccessInfoDto.CREATOR.createFromParcel(parcel);
            }
            VideoAccessInfoDto videoAccessInfoDto2 = createFromParcel19;
            Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                videoAccessInfoDto = videoAccessInfoDto2;
                num2 = valueOf16;
                arrayList6 = arrayList4;
                arrayList5 = null;
            } else {
                videoAccessInfoDto = videoAccessInfoDto2;
                int readInt4 = parcel.readInt();
                num2 = valueOf16;
                arrayList5 = new ArrayList(readInt4);
                arrayList6 = arrayList4;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(AdsItemBlockAdStatPixelDto.CREATOR, parcel, arrayList5, i4, 1);
                    readInt4 = readInt4;
                    userId3 = userId3;
                }
            }
            UserId userId4 = userId3;
            Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList12 = arrayList2;
            ArrayList arrayList13 = arrayList6;
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UserId userId5 = userId4;
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            VideoDonutDto createFromParcel40 = parcel.readInt() == 0 ? null : VideoDonutDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                num3 = valueOf30;
                createFromParcel20 = null;
            } else {
                num3 = valueOf30;
                createFromParcel20 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto19 = createFromParcel20;
            if (parcel.readInt() == 0) {
                baseBoolIntDto8 = baseBoolIntDto19;
                createFromParcel21 = null;
            } else {
                baseBoolIntDto8 = baseBoolIntDto19;
                createFromParcel21 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto20 = createFromParcel21;
            if (parcel.readInt() == 0) {
                baseBoolIntDto9 = baseBoolIntDto20;
                createFromParcel22 = null;
            } else {
                baseBoolIntDto9 = baseBoolIntDto20;
                createFromParcel22 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto21 = createFromParcel22;
            if (parcel.readInt() == 0) {
                baseBoolIntDto10 = baseBoolIntDto21;
                arrayList7 = arrayList5;
                videoDonutDto = createFromParcel40;
                arrayList8 = null;
            } else {
                baseBoolIntDto10 = baseBoolIntDto21;
                int readInt5 = parcel.readInt();
                arrayList7 = arrayList5;
                arrayList8 = new ArrayList(readInt5);
                videoDonutDto = createFromParcel40;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(AudioArtistDto.CREATOR, parcel, arrayList8, i5, 1);
                    readInt5 = readInt5;
                    userId5 = userId5;
                }
            }
            UserId userId6 = userId5;
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList9 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = en.a(AudioArtistDto.CREATOR, parcel, arrayList9, i6, 1);
                    readInt6 = readInt6;
                    arrayList8 = arrayList8;
                }
            }
            ArrayList arrayList14 = arrayList8;
            VideoDonutDto videoDonutDto2 = videoDonutDto;
            int i7 = 0;
            String readString19 = parcel.readString();
            Integer valueOf31 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int readInt7 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(readInt7);
                while (i7 != readInt7) {
                    i7 = en.a(AudioGenreDto.CREATOR, parcel, arrayList15, i7, 1);
                    readInt7 = readInt7;
                    arrayList9 = arrayList9;
                }
                arrayList10 = arrayList15;
            }
            return new VideoVideoDto(responseTypeDto, readString, valueOf7, createFromParcel24, createFromParcel25, createFromParcel26, createFromParcel27, createFromParcel28, valueOf8, createFromParcel29, createFromParcel30, createFromParcel31, createFromParcel32, createFromParcel33, createFromParcel34, valueOf9, createFromParcel35, createFromParcel36, createFromParcel37, arrayList12, bool, num, createFromParcel38, baseBoolIntDto12, baseBoolIntDto, valueOf11, valueOf12, readString2, valueOf13, arrayList11, arrayList13, num4, valueOf15, num2, userId, userId6, valueOf2, readString3, readString4, valueOf3, basePropertyExistsDto, readString5, basePropertyExistsDto2, baseBoolIntDto2, mediaRestrictionDto, baseBoolIntDto3, baseBoolIntDto4, readString6, videoVideoTrackingInfoDto, basePropertyExistsDto3, readString7, videoVideoTypeDto, valueOf17, valueOf18, valueOf19, readString8, valueOf20, readString9, valueOf21, videoLiveStatusDto, valueOf22, baseBoolIntDto5, valueOf23, readString10, baseLikesDto, baseRepostsInfoDto, valueOf24, basePropertyExistsDto4, baseBoolIntDto6, valueOf25, valueOf26, readString11, readString12, valueOf27, valueOf4, valueOf5, baseBoolIntDto7, actionLinksActionDto, valueOf28, readString13, videoAccessInfoDto, valueOf29, arrayList7, num3, readString14, valueOf6, readString15, readString16, readString17, readString18, videoDonutDto2, baseBoolIntDto8, baseBoolIntDto9, baseBoolIntDto10, arrayList14, arrayList9, readString19, valueOf31, arrayList10);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoDto[] newArray(int i) {
            return new VideoVideoDto[i];
        }
    }

    public VideoVideoDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 7, null);
    }

    public final BaseBoolIntDto B() {
        return this.canEditPrivacy;
    }

    public final Boolean B1() {
        return this.isFavorite;
    }

    public final BaseBoolIntDto C() {
        return this.canLike;
    }

    public final BaseBoolIntDto D() {
        return this.canPlayInBackground;
    }

    public final BaseLikesDto D0() {
        return this.likes;
    }

    public final BaseBoolIntDto D1() {
        return this.isFromMessage;
    }

    public final Boolean E1() {
        return this.isMobileLive;
    }

    public final BaseBoolIntDto F() {
        return this.canRemoveFromRecommendations;
    }

    public final BaseBoolIntDto F0() {
        return this.liveNotify;
    }

    public final String F5() {
        return this.thumbHash;
    }

    public final Integer G() {
        return this.canRepost;
    }

    public final Integer H0() {
        return this.liveStartTime;
    }

    public final BaseBoolIntDto K() {
        return this.canSubscribe;
    }

    public final VideoLiveStatusDto K0() {
        return this.liveStatus;
    }

    public final BaseBoolIntDto L1() {
        return this.isPrivate;
    }

    public final Integer M() {
        return this.comments;
    }

    public final BasePropertyExistsDto N0() {
        return this.needMute;
    }

    public final BaseBoolIntDto N1() {
        return this.isSubscribed;
    }

    public final BasePropertyExistsDto P0() {
        return this.noAutoplay;
    }

    public final Integer R() {
        return this.contentRestricted;
    }

    public final String S0() {
        return this.ovId;
    }

    public final String T() {
        return this.contentRestrictedMessage;
    }

    public final BasePropertyExistsDto U0() {
        return this.processing;
    }

    public final BasePropertyExistsDto V0() {
        return this.repeat;
    }

    public final BaseBoolIntDto W() {
        return this.converting;
    }

    public final Integer Z() {
        return this.date;
    }

    public final Integer a0() {
        return this.duration;
    }

    public final BaseRepostsInfoDto b1() {
        return this.reposts;
    }

    public final String d() {
        return this.accessKey;
    }

    public final MediaRestrictionDto d1() {
        return this.restriction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.added;
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

    public final VideoAdsInfoDto f() {
        return this.adsInfo;
    }

    public final Integer g() {
        return this.archivalContentPublishedDate;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UserId getUserId() {
        return this.userId;
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

    public final Integer i() {
        return this.balance;
    }

    public final BaseBoolIntDto j() {
        return this.canAdd;
    }

    public final BaseBoolIntDto k() {
        return this.canAddToFaves;
    }

    public final BaseBoolIntDto l() {
        return this.canAttachLink;
    }

    public final List<VideoVideoImageDto> l0() {
        return this.firstFrame;
    }

    public final BaseBoolIntDto n() {
        return this.canComment;
    }

    public final Integer n1() {
        return this.spectators;
    }

    public final BaseBoolIntDto o() {
        return this.canDislike;
    }

    public final ActionLinksActionDto o1() {
        return this.titleAction;
    }

    public final Integer p() {
        return this.canDownload;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final VideoVideoTrackingInfoDto s1() {
        return this.trackingInfo;
    }

    public final VideoVideoTypeDto t1() {
        return this.type;
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

    public final BaseBoolIntDto u() {
        return this.canEdit;
    }

    public final Integer v0() {
        return this.height;
    }

    public final Integer w0() {
        return this.id;
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
        VideoAdsInfoDto videoAdsInfoDto = this.adsInfo;
        if (videoAdsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAdsInfoDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto2 = this.canEdit;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto3 = this.canDelete;
        if (baseBoolIntDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto3.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto4 = this.canLike;
        if (baseBoolIntDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto4.writeToParcel(parcel, i);
        }
        Integer num2 = this.canRepost;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        BaseBoolIntDto baseBoolIntDto5 = this.canSubscribe;
        if (baseBoolIntDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto5.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto6 = this.canBePromoted;
        if (baseBoolIntDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto6.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto7 = this.canAddToFaves;
        if (baseBoolIntDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto7.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto8 = this.canAdd;
        if (baseBoolIntDto8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto8.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto9 = this.canAttachLink;
        if (baseBoolIntDto9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto9.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto10 = this.canPlayInBackground;
        if (baseBoolIntDto10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto10.writeToParcel(parcel, i);
        }
        Integer num3 = this.canDownload;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        BaseBoolIntDto baseBoolIntDto11 = this.canEditPrivacy;
        if (baseBoolIntDto11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto11.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto12 = this.canRemoveFromRecommendations;
        if (baseBoolIntDto12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto12.writeToParcel(parcel, i);
        }
        VideoVideoDownloadDto videoVideoDownloadDto = this.download;
        if (videoVideoDownloadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoDownloadDto.writeToParcel(parcel, i);
        }
        List<VideoLinkedToPlaylistMarkDto> list = this.linkedToPlaylistMarks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VideoLinkedToPlaylistMarkDto) f.next()).writeToParcel(parcel, i);
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
        BaseBoolIntDto baseBoolIntDto13 = this.isPrivate;
        if (baseBoolIntDto13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto13.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto14 = this.isFromMessage;
        if (baseBoolIntDto14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto14.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto15 = this.isDraft;
        if (baseBoolIntDto15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto15.writeToParcel(parcel, i);
        }
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
                ((VideoVideoImageDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoVideoImageDto> list3 = this.firstFrame;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((VideoVideoImageDto) f3.next()).writeToParcel(parcel, i);
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
        BasePropertyExistsDto basePropertyExistsDto = this.noAutoplay;
        if (basePropertyExistsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basePropertyExistsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.player);
        BasePropertyExistsDto basePropertyExistsDto2 = this.processing;
        if (basePropertyExistsDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basePropertyExistsDto2.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto16 = this.converting;
        if (baseBoolIntDto16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto16.writeToParcel(parcel, i);
        }
        MediaRestrictionDto mediaRestrictionDto = this.restriction;
        if (mediaRestrictionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaRestrictionDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto17 = this.added;
        if (baseBoolIntDto17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto17.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto18 = this.isSubscribed;
        if (baseBoolIntDto18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto18.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = this.trackingInfo;
        if (videoVideoTrackingInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoTrackingInfoDto.writeToParcel(parcel, i);
        }
        BasePropertyExistsDto basePropertyExistsDto3 = this.repeat;
        if (basePropertyExistsDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basePropertyExistsDto3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.partnerText);
        VideoVideoTypeDto videoVideoTypeDto = this.type;
        if (videoVideoTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoTypeDto.writeToParcel(parcel, i);
        }
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
        VideoLiveStatusDto videoLiveStatusDto = this.liveStatus;
        if (videoLiveStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoLiveStatusDto.writeToParcel(parcel, i);
        }
        Integer num16 = this.liveStartTime;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num16);
        }
        BaseBoolIntDto baseBoolIntDto19 = this.liveNotify;
        if (baseBoolIntDto19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto19.writeToParcel(parcel, i);
        }
        Integer num17 = this.spectators;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
        }
        parcel.writeString(this.platform);
        BaseLikesDto baseLikesDto = this.likes;
        if (baseLikesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLikesDto.writeToParcel(parcel, i);
        }
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        if (baseRepostsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseRepostsInfoDto.writeToParcel(parcel, i);
        }
        Integer num18 = this.moderationStatus;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num18);
        }
        BasePropertyExistsDto basePropertyExistsDto4 = this.needMute;
        if (basePropertyExistsDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basePropertyExistsDto4.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto20 = this.isUnitedVideo;
        if (baseBoolIntDto20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto20.writeToParcel(parcel, i);
        }
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
        BaseBoolIntDto baseBoolIntDto21 = this.canDislike;
        if (baseBoolIntDto21 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto21.writeToParcel(parcel, i);
        }
        ActionLinksActionDto actionLinksActionDto = this.titleAction;
        if (actionLinksActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionLinksActionDto.writeToParcel(parcel, i);
        }
        Integer num22 = this.publishedAt;
        if (num22 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num22);
        }
        parcel.writeString(this.thumbHash);
        VideoAccessInfoDto videoAccessInfoDto = this.accessInfo;
        if (videoAccessInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAccessInfoDto.writeToParcel(parcel, i);
        }
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
                ((AdsItemBlockAdStatPixelDto) f4.next()).writeToParcel(parcel, i);
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
        VideoDonutDto videoDonutDto = this.donut;
        if (videoDonutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDonutDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto22 = this.canReport;
        if (baseBoolIntDto22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto22.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto23 = this.canCutToShortVideo;
        if (baseBoolIntDto23 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto23.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto24 = this.isExplicit;
        if (baseBoolIntDto24 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto24.writeToParcel(parcel, i);
        }
        List<AudioArtistDto> list5 = this.mainArtists;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((AudioArtistDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioArtistDto> list6 = this.featuredArtists;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                ((AudioArtistDto) f6.next()).writeToParcel(parcel, i);
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
            ((AudioGenreDto) f7.next()).writeToParcel(parcel, i);
        }
    }

    public final Integer x1() {
        return this.views;
    }

    public final List<VideoVideoImageDto> y0() {
        return this.image;
    }

    public final Integer y1() {
        return this.width;
    }

    public final Boolean z1() {
        return this.isArchivalContent;
    }

    public VideoVideoDto(ResponseTypeDto responseTypeDto, String str, Integer num, VideoAdsInfoDto videoAdsInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num3, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, VideoVideoDownloadDto videoVideoDownloadDto, List<VideoLinkedToPlaylistMarkDto> list, Boolean bool, Integer num4, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, Integer num5, Integer num6, String str2, Integer num7, List<VideoVideoImageDto> list2, List<VideoVideoImageDto> list3, Integer num8, Integer num9, Integer num10, UserId userId, UserId userId2, Boolean bool2, String str3, String str4, Boolean bool3, BasePropertyExistsDto basePropertyExistsDto, String str5, BasePropertyExistsDto basePropertyExistsDto2, BaseBoolIntDto baseBoolIntDto16, MediaRestrictionDto mediaRestrictionDto, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, String str6, VideoVideoTrackingInfoDto videoVideoTrackingInfoDto, BasePropertyExistsDto basePropertyExistsDto3, String str7, VideoVideoTypeDto videoVideoTypeDto, Integer num11, Integer num12, Integer num13, String str8, Integer num14, String str9, Integer num15, VideoLiveStatusDto videoLiveStatusDto, Integer num16, BaseBoolIntDto baseBoolIntDto19, Integer num17, String str10, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num18, BasePropertyExistsDto basePropertyExistsDto4, BaseBoolIntDto baseBoolIntDto20, Integer num19, Integer num20, String str11, String str12, Integer num21, Boolean bool4, Boolean bool5, BaseBoolIntDto baseBoolIntDto21, ActionLinksActionDto actionLinksActionDto, Integer num22, String str13, VideoAccessInfoDto videoAccessInfoDto, Integer num23, List<AdsItemBlockAdStatPixelDto> list4, Integer num24, String str14, Boolean bool6, String str15, String str16, String str17, String str18, VideoDonutDto videoDonutDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, List<AudioArtistDto> list5, List<AudioArtistDto> list6, String str19, Integer num25, List<AudioGenreDto> list7) {
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
}
