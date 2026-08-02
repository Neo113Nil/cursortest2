package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.account.dto.AccountPrivacyValueDto;
import com.vk.api.generated.ads.dto.AdsCatchUpLinkDto;
import com.vk.api.generated.ads.dto.AdsMobileAppOpenDto;
import com.vk.api.generated.ads.dto.AdsSkadDto;
import com.vk.api.generated.ads.dto.AdsStatisticsPixelDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesStoryDto.kt */
/* loaded from: classes15.dex */
public final class StoriesStoryDto implements Parcelable {
    public static final Parcelable.Creator<StoriesStoryDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("ad_data")
    private final String adData;

    @pmi0("ad_data_impression")
    private final String adDataImpression;

    @pmi0("ad_marker")
    private final String adMarker;

    @pmi0("ads_statistics")
    private final List<AdsStatisticsPixelDto> adsStatistics;

    @pmi0("advertiser_info_url")
    private final String advertiserInfoUrl;

    @pmi0("also_subscribed")
    private final StoriesStoryAlsoSubscribedDto alsoSubscribed;

    @pmi0("android_app")
    private final AdsMobileAppOpenDto androidApp;

    @pmi0("answers_count")
    private final Integer answersCount;

    @pmi0("blurred_preview")
    private final String blurredPreview;

    @pmi0("can_ask")
    private final BaseBoolIntDto canAsk;

    @pmi0("can_ask_anonymous")
    private final BaseBoolIntDto canAskAnonymous;

    @pmi0("can_comment")
    private final BaseBoolIntDto canComment;

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_delete_with_reason")
    private final Boolean canDeleteWithReason;

    @pmi0("can_hide")
    private final BaseBoolIntDto canHide;

    @pmi0("can_like")
    private final Boolean canLike;

    @pmi0("can_reply")
    private final BaseBoolIntDto canReply;

    @pmi0("can_see")
    private final BaseBoolIntDto canSee;

    @pmi0("can_share")
    private final BaseBoolIntDto canShare;

    @pmi0("can_use_in_narrative")
    private final Boolean canUseInNarrative;

    @pmi0("caption")
    private final String caption;

    @pmi0("clickable_stickers")
    private final StoriesClickableStickersDto clickableStickers;

    @pmi0("content_scale_type")
    private final ContentScaleTypeDto contentScaleType;

    @pmi0("date")
    private final Integer date;

    @pmi0("expires_at")
    private final Integer expiresAt;

    @pmi0("first_narrative_id")
    private final Integer firstNarrativeId;

    @pmi0("first_narrative_title")
    private final String firstNarrativeTitle;

    @pmi0("format")
    private final FormatDto format;

    @pmi0("from_memories")
    private final Boolean fromMemories;

    @pmi0("have_old_privacy")
    private final Boolean haveOldPrivacy;

    @pmi0("header_catch_up_link")
    private final AdsCatchUpLinkDto headerCatchUpLink;

    @pmi0("id")
    private final int id;

    @pmi0("ios_app")
    private final AdsMobileAppOpenDto iosApp;

    @pmi0("is_ads")
    private final Boolean isAds;

    @pmi0("is_authors_ads")
    private final Boolean isAuthorsAds;

    @pmi0("is_best_friends_privacy")
    private final Boolean isBestFriendsPrivacy;

    @pmi0("is_deleted")
    private final Boolean isDeleted;

    @pmi0("is_expired")
    private final Boolean isExpired;

    @pmi0("is_from_message")
    private final Boolean isFromMessage;

    @pmi0("is_gen_memories")
    private final Boolean isGenMemories;

    @pmi0("is_liked")
    private final Boolean isLiked;

    @pmi0("is_music_cover")
    private final Boolean isMusicCover;

    @pmi0("is_one_time")
    private final Boolean isOneTime;

    @pmi0("is_profile_question")
    private final Boolean isProfileQuestion;

    @pmi0("is_promo")
    private final Boolean isPromo;

    @pmi0("is_restricted")
    private final Boolean isRestricted;

    @pmi0("likes_count")
    private final Integer likesCount;

    @pmi0("link")
    private final StoriesStoryLinkDto link;

    @pmi0("mask")
    private final MasksMaskDto mask;

    @pmi0("mask_id")
    private final String maskId;

    @pmi0("memory_date")
    private final String memoryDate;

    @pmi0("memory_type")
    private final MemoryTypeDto memoryType;

    @pmi0("mute_reply")
    private final Boolean muteReply;

    @pmi0("narrative_id")
    private final Integer narrativeId;

    @pmi0("narratives_count")
    private final Integer narrativesCount;

    @pmi0("need_mute")
    private final Boolean needMute;

    @pmi0("need_show_empty_stats")
    private final Boolean needShowEmptyStats;

    @pmi0("new_reactions")
    private final List<StoriesNewReactionDto> newReactions;

    @pmi0("no_sound")
    private final Boolean noSound;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("parent_story")
    private final StoriesStoryDto parentStory;

    @pmi0("parent_story_access_key")
    private final String parentStoryAccessKey;

    @pmi0("parent_story_id")
    private final Integer parentStoryId;

    @pmi0("parent_story_owner_id")
    private final Integer parentStoryOwnerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("photo_icon")
    private final List<BaseImageDto> photoIcon;

    @pmi0("preloading_enabled")
    private final Boolean preloadingEnabled;

    @pmi0("privacy")
    private final AccountPrivacyValueDto privacy;

    @pmi0("questions")
    private final StoriesQuestionsDto questions;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("replies")
    private final StoriesRepliesDto replies;

    @pmi0("research")
    private final StoriesMediascopeResearchDto research;

    @pmi0("sdk_source")
    private final String sdkSource;

    @pmi0("seen")
    private final BaseBoolIntDto seen;

    @pmi0("seen_progress")
    private final Integer seenProgress;

    @pmi0("skad")
    private final AdsSkadDto skad;

    @pmi0("template_id")
    private final TemplateIdDto templateId;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final StoriesStoryTypeDto type;

    @pmi0("user_reaction_id")
    private final Integer userReactionId;

    @pmi0("video")
    private final VideoVideoFullDto video;

    @pmi0("views")
    private final Integer views;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesStoryDto.kt */
    public static final class ContentScaleTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentScaleTypeDto[] $VALUES;
        public static final Parcelable.Creator<ContentScaleTypeDto> CREATOR;

        @pmi0("fill")
        public static final ContentScaleTypeDto FILL;

        @pmi0("fit")
        public static final ContentScaleTypeDto FIT;
        private final String value;

        /* compiled from: StoriesStoryDto.kt */
        public static final class a implements Parcelable.Creator<ContentScaleTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ContentScaleTypeDto createFromParcel(Parcel parcel) {
                return ContentScaleTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ContentScaleTypeDto[] newArray(int i) {
                return new ContentScaleTypeDto[i];
            }
        }

        static {
            ContentScaleTypeDto contentScaleTypeDto = new ContentScaleTypeDto("FIT", 0, "fit");
            FIT = contentScaleTypeDto;
            ContentScaleTypeDto contentScaleTypeDto2 = new ContentScaleTypeDto("FILL", 1, "fill");
            FILL = contentScaleTypeDto2;
            ContentScaleTypeDto[] contentScaleTypeDtoArr = {contentScaleTypeDto, contentScaleTypeDto2};
            $VALUES = contentScaleTypeDtoArr;
            $ENTRIES = new asp(contentScaleTypeDtoArr);
            CREATOR = new a();
        }

        private ContentScaleTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ContentScaleTypeDto valueOf(String str) {
            return (ContentScaleTypeDto) Enum.valueOf(ContentScaleTypeDto.class, str);
        }

        public static ContentScaleTypeDto[] values() {
            return (ContentScaleTypeDto[]) $VALUES.clone();
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
    /* compiled from: StoriesStoryDto.kt */
    public static final class FormatDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FormatDto[] $VALUES;
        public static final Parcelable.Creator<FormatDto> CREATOR;

        @pmi0("html5")
        public static final FormatDto HTML5;

        @pmi0("post")
        public static final FormatDto POST;

        @pmi0("static")
        public static final FormatDto STATIC;

        @pmi0("video")
        public static final FormatDto VIDEO;
        private final String value;

        /* compiled from: StoriesStoryDto.kt */
        public static final class a implements Parcelable.Creator<FormatDto> {
            @Override // android.os.Parcelable.Creator
            public final FormatDto createFromParcel(Parcel parcel) {
                return FormatDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FormatDto[] newArray(int i) {
                return new FormatDto[i];
            }
        }

        static {
            FormatDto formatDto = new FormatDto("STATIC", 0, "static");
            STATIC = formatDto;
            FormatDto formatDto2 = new FormatDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
            VIDEO = formatDto2;
            FormatDto formatDto3 = new FormatDto("POST", 2, "post");
            POST = formatDto3;
            FormatDto formatDto4 = new FormatDto("HTML5", 3, "html5");
            HTML5 = formatDto4;
            FormatDto[] formatDtoArr = {formatDto, formatDto2, formatDto3, formatDto4};
            $VALUES = formatDtoArr;
            $ENTRIES = new asp(formatDtoArr);
            CREATOR = new a();
        }

        private FormatDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static FormatDto valueOf(String str) {
            return (FormatDto) Enum.valueOf(FormatDto.class, str);
        }

        public static FormatDto[] values() {
            return (FormatDto[]) $VALUES.clone();
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
    /* compiled from: StoriesStoryDto.kt */
    public static final class MemoryTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MemoryTypeDto[] $VALUES;

        @pmi0("album")
        public static final MemoryTypeDto ALBUM;

        @pmi0("avatar")
        public static final MemoryTypeDto AVATAR;

        @pmi0("birthday")
        public static final MemoryTypeDto BIRTHDAY;
        public static final Parcelable.Creator<MemoryTypeDto> CREATOR;

        @pmi0("first_audio")
        public static final MemoryTypeDto FIRST_AUDIO;

        @pmi0("first_avatar")
        public static final MemoryTypeDto FIRST_AVATAR;

        @pmi0("first_post")
        public static final MemoryTypeDto FIRST_POST;

        @pmi0("first_story")
        public static final MemoryTypeDto FIRST_STORY;

        @pmi0("friendship")
        public static final MemoryTypeDto FRIENDSHIP;

        @pmi0("gallery")
        public static final MemoryTypeDto GALLERY;

        @pmi0("my_top_track")
        public static final MemoryTypeDto MY_TOP_TRACK;

        @pmi0("photo")
        public static final MemoryTypeDto PHOTO;

        @pmi0("post")
        public static final MemoryTypeDto POST;

        @pmi0("story")
        public static final MemoryTypeDto STORY;

        @pmi0("year_summary")
        public static final MemoryTypeDto YEAR_SUMMARY;
        private final String value;

        /* compiled from: StoriesStoryDto.kt */
        public static final class a implements Parcelable.Creator<MemoryTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final MemoryTypeDto createFromParcel(Parcel parcel) {
                return MemoryTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MemoryTypeDto[] newArray(int i) {
                return new MemoryTypeDto[i];
            }
        }

        static {
            MemoryTypeDto memoryTypeDto = new MemoryTypeDto("ALBUM", 0, "album");
            ALBUM = memoryTypeDto;
            MemoryTypeDto memoryTypeDto2 = new MemoryTypeDto("AVATAR", 1, "avatar");
            AVATAR = memoryTypeDto2;
            MemoryTypeDto memoryTypeDto3 = new MemoryTypeDto("FRIENDSHIP", 2, "friendship");
            FRIENDSHIP = memoryTypeDto3;
            MemoryTypeDto memoryTypeDto4 = new MemoryTypeDto("PHOTO", 3, "photo");
            PHOTO = memoryTypeDto4;
            MemoryTypeDto memoryTypeDto5 = new MemoryTypeDto("POST", 4, "post");
            POST = memoryTypeDto5;
            MemoryTypeDto memoryTypeDto6 = new MemoryTypeDto("STORY", 5, "story");
            STORY = memoryTypeDto6;
            MemoryTypeDto memoryTypeDto7 = new MemoryTypeDto("YEAR_SUMMARY", 6, "year_summary");
            YEAR_SUMMARY = memoryTypeDto7;
            MemoryTypeDto memoryTypeDto8 = new MemoryTypeDto("FIRST_STORY", 7, "first_story");
            FIRST_STORY = memoryTypeDto8;
            MemoryTypeDto memoryTypeDto9 = new MemoryTypeDto("FIRST_AVATAR", 8, "first_avatar");
            FIRST_AVATAR = memoryTypeDto9;
            MemoryTypeDto memoryTypeDto10 = new MemoryTypeDto("FIRST_POST", 9, "first_post");
            FIRST_POST = memoryTypeDto10;
            MemoryTypeDto memoryTypeDto11 = new MemoryTypeDto("FIRST_AUDIO", 10, "first_audio");
            FIRST_AUDIO = memoryTypeDto11;
            MemoryTypeDto memoryTypeDto12 = new MemoryTypeDto("MY_TOP_TRACK", 11, "my_top_track");
            MY_TOP_TRACK = memoryTypeDto12;
            MemoryTypeDto memoryTypeDto13 = new MemoryTypeDto("BIRTHDAY", 12, "birthday");
            BIRTHDAY = memoryTypeDto13;
            MemoryTypeDto memoryTypeDto14 = new MemoryTypeDto("GALLERY", 13, "gallery");
            GALLERY = memoryTypeDto14;
            MemoryTypeDto[] memoryTypeDtoArr = {memoryTypeDto, memoryTypeDto2, memoryTypeDto3, memoryTypeDto4, memoryTypeDto5, memoryTypeDto6, memoryTypeDto7, memoryTypeDto8, memoryTypeDto9, memoryTypeDto10, memoryTypeDto11, memoryTypeDto12, memoryTypeDto13, memoryTypeDto14};
            $VALUES = memoryTypeDtoArr;
            $ENTRIES = new asp(memoryTypeDtoArr);
            CREATOR = new a();
        }

        private MemoryTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static MemoryTypeDto valueOf(String str) {
            return (MemoryTypeDto) Enum.valueOf(MemoryTypeDto.class, str);
        }

        public static MemoryTypeDto[] values() {
            return (MemoryTypeDto[]) $VALUES.clone();
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
    /* compiled from: StoriesStoryDto.kt */
    public static final class TemplateIdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TemplateIdDto[] $VALUES;

        @pmi0("app_sdk")
        public static final TemplateIdDto APP_SDK;

        @pmi0("app_slider_sdk")
        public static final TemplateIdDto APP_SLIDER_SDK;

        @pmi0("app_video_sdk")
        public static final TemplateIdDto APP_VIDEO_SDK;
        public static final Parcelable.Creator<TemplateIdDto> CREATOR;

        @pmi0("lead_form_photo_sdk")
        public static final TemplateIdDto LEAD_FORM_PHOTO_SDK;

        @pmi0("lead_form_video_sdk")
        public static final TemplateIdDto LEAD_FORM_VIDEO_SDK;

        @pmi0("mob_sdk")
        public static final TemplateIdDto MOB_SDK;

        @pmi0("site_sdk")
        public static final TemplateIdDto SITE_SDK;

        @pmi0("site_slider_sdk")
        public static final TemplateIdDto SITE_SLIDER_SDK;

        @pmi0("site_video_sdk")
        public static final TemplateIdDto SITE_VIDEO_SDK;

        @pmi0("survey_photo_sdk")
        public static final TemplateIdDto SURVEY_PHOTO_SDK;

        @pmi0("survey_video_sdk")
        public static final TemplateIdDto SURVEY_VIDEO_SDK;

        @pmi0("vk_miniapp_sdk")
        public static final TemplateIdDto VK_MINIAPP_SDK;

        @pmi0("vk_miniapp_video_sdk")
        public static final TemplateIdDto VK_MINIAPP_VIDEO_SDK;

        @pmi0("vk_user_sdk")
        public static final TemplateIdDto VK_USER_SDK;

        @pmi0("vk_user_video_sdk")
        public static final TemplateIdDto VK_USER_VIDEO_SDK;
        private final String value;

        /* compiled from: StoriesStoryDto.kt */
        public static final class a implements Parcelable.Creator<TemplateIdDto> {
            @Override // android.os.Parcelable.Creator
            public final TemplateIdDto createFromParcel(Parcel parcel) {
                return TemplateIdDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TemplateIdDto[] newArray(int i) {
                return new TemplateIdDto[i];
            }
        }

        static {
            TemplateIdDto templateIdDto = new TemplateIdDto("SITE_SDK", 0, "site_sdk");
            SITE_SDK = templateIdDto;
            TemplateIdDto templateIdDto2 = new TemplateIdDto("SITE_SLIDER_SDK", 1, "site_slider_sdk");
            SITE_SLIDER_SDK = templateIdDto2;
            TemplateIdDto templateIdDto3 = new TemplateIdDto("SITE_VIDEO_SDK", 2, "site_video_sdk");
            SITE_VIDEO_SDK = templateIdDto3;
            TemplateIdDto templateIdDto4 = new TemplateIdDto("APP_SDK", 3, "app_sdk");
            APP_SDK = templateIdDto4;
            TemplateIdDto templateIdDto5 = new TemplateIdDto("APP_SLIDER_SDK", 4, "app_slider_sdk");
            APP_SLIDER_SDK = templateIdDto5;
            TemplateIdDto templateIdDto6 = new TemplateIdDto("APP_VIDEO_SDK", 5, "app_video_sdk");
            APP_VIDEO_SDK = templateIdDto6;
            TemplateIdDto templateIdDto7 = new TemplateIdDto("LEAD_FORM_PHOTO_SDK", 6, "lead_form_photo_sdk");
            LEAD_FORM_PHOTO_SDK = templateIdDto7;
            TemplateIdDto templateIdDto8 = new TemplateIdDto("LEAD_FORM_VIDEO_SDK", 7, "lead_form_video_sdk");
            LEAD_FORM_VIDEO_SDK = templateIdDto8;
            TemplateIdDto templateIdDto9 = new TemplateIdDto("SURVEY_PHOTO_SDK", 8, "survey_photo_sdk");
            SURVEY_PHOTO_SDK = templateIdDto9;
            TemplateIdDto templateIdDto10 = new TemplateIdDto("SURVEY_VIDEO_SDK", 9, "survey_video_sdk");
            SURVEY_VIDEO_SDK = templateIdDto10;
            TemplateIdDto templateIdDto11 = new TemplateIdDto("VK_MINIAPP_SDK", 10, "vk_miniapp_sdk");
            VK_MINIAPP_SDK = templateIdDto11;
            TemplateIdDto templateIdDto12 = new TemplateIdDto("VK_MINIAPP_VIDEO_SDK", 11, "vk_miniapp_video_sdk");
            VK_MINIAPP_VIDEO_SDK = templateIdDto12;
            TemplateIdDto templateIdDto13 = new TemplateIdDto("VK_USER_SDK", 12, "vk_user_sdk");
            VK_USER_SDK = templateIdDto13;
            TemplateIdDto templateIdDto14 = new TemplateIdDto("VK_USER_VIDEO_SDK", 13, "vk_user_video_sdk");
            VK_USER_VIDEO_SDK = templateIdDto14;
            TemplateIdDto templateIdDto15 = new TemplateIdDto("MOB_SDK", 14, "mob_sdk");
            MOB_SDK = templateIdDto15;
            TemplateIdDto[] templateIdDtoArr = {templateIdDto, templateIdDto2, templateIdDto3, templateIdDto4, templateIdDto5, templateIdDto6, templateIdDto7, templateIdDto8, templateIdDto9, templateIdDto10, templateIdDto11, templateIdDto12, templateIdDto13, templateIdDto14, templateIdDto15};
            $VALUES = templateIdDtoArr;
            $ENTRIES = new asp(templateIdDtoArr);
            CREATOR = new a();
        }

        private TemplateIdDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TemplateIdDto valueOf(String str) {
            return (TemplateIdDto) Enum.valueOf(TemplateIdDto.class, str);
        }

        public static TemplateIdDto[] values() {
            return (TemplateIdDto[]) $VALUES.clone();
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

    /* compiled from: StoriesStoryDto.kt */
    public static final class a implements Parcelable.Creator<StoriesStoryDto> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r60v2, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r61v4, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r62v3, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r65v8, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r66v2, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r67v5, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r68v0, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r71v4, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r72v4, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r73v4, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r75v7, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r76v7, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r77v3, types: [java.lang.Boolean] */
        @Override // android.os.Parcelable.Creator
        public final StoriesStoryDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            AdsSkadDto adsSkadDto;
            AdsMobileAppOpenDto createFromParcel;
            AdsMobileAppOpenDto adsMobileAppOpenDto;
            AdsMobileAppOpenDto createFromParcel2;
            AdsMobileAppOpenDto adsMobileAppOpenDto2;
            String str;
            ArrayList arrayList;
            UserId userId;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean bool;
            String str2;
            ArrayList arrayList2;
            BaseBoolIntDto baseBoolIntDto;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            int i;
            AdsCatchUpLinkDto createFromParcel3;
            Boolean valueOf8;
            Boolean valueOf9;
            AdsCatchUpLinkDto adsCatchUpLinkDto;
            StoriesStoryLinkDto createFromParcel4;
            MasksMaskDto masksMaskDto;
            StoriesStoryDto createFromParcel5;
            PhotosPhotoDto photosPhotoDto;
            StoriesQuestionsDto createFromParcel6;
            StoriesQuestionsDto storiesQuestionsDto;
            StoriesRepliesDto createFromParcel7;
            Boolean valueOf10;
            Boolean valueOf11;
            BaseBoolIntDto baseBoolIntDto2;
            StoriesStoryTypeDto createFromParcel8;
            StoriesStoryTypeDto storiesStoryTypeDto;
            StoriesClickableStickersDto createFromParcel9;
            Integer valueOf12;
            Integer num;
            VideoVideoFullDto videoVideoFullDto;
            UserId userId2;
            List arrayList3;
            String str3;
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            Object obj9;
            Object obj10;
            BaseBoolIntDto baseBoolIntDto3;
            Object createFromParcel10;
            Object obj11;
            Object obj12;
            Object obj13;
            StoriesStoryAlsoSubscribedDto storiesStoryAlsoSubscribedDto;
            Object createFromParcel11;
            AccountPrivacyValueDto accountPrivacyValueDto;
            Object createFromParcel12;
            TemplateIdDto templateIdDto;
            Object createFromParcel13;
            FormatDto formatDto;
            Object createFromParcel14;
            int readInt = parcel.readInt();
            UserId userId3 = (UserId) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            String readString = parcel.readString();
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            MemoryTypeDto createFromParcel15 = parcel.readInt() == 0 ? null : MemoryTypeDto.CREATOR.createFromParcel(parcel);
            Integer num2 = valueOf13;
            Integer num3 = valueOf14;
            String readString3 = parcel.readString();
            ContentScaleTypeDto createFromParcel16 = parcel.readInt() == 0 ? null : ContentScaleTypeDto.CREATOR.createFromParcel(parcel);
            AdsSkadDto adsSkadDto2 = (AdsSkadDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                adsSkadDto = adsSkadDto2;
                createFromParcel = null;
            } else {
                adsSkadDto = adsSkadDto2;
                createFromParcel = AdsMobileAppOpenDto.CREATOR.createFromParcel(parcel);
            }
            AdsMobileAppOpenDto adsMobileAppOpenDto3 = createFromParcel;
            if (parcel.readInt() == 0) {
                adsMobileAppOpenDto = adsMobileAppOpenDto3;
                createFromParcel2 = null;
            } else {
                adsMobileAppOpenDto = adsMobileAppOpenDto3;
                createFromParcel2 = AdsMobileAppOpenDto.CREATOR.createFromParcel(parcel);
            }
            AdsMobileAppOpenDto adsMobileAppOpenDto4 = createFromParcel2;
            if (parcel.readInt() == 0) {
                adsMobileAppOpenDto2 = adsMobileAppOpenDto4;
                str = readString;
                userId = userId3;
                arrayList = null;
            } else {
                adsMobileAppOpenDto2 = adsMobileAppOpenDto4;
                int readInt2 = parcel.readInt();
                str = readString;
                arrayList = new ArrayList(readInt2);
                userId = userId3;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(StoriesStoryDto.class, parcel, arrayList, i2, 1);
                    readInt2 = readInt2;
                }
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
            AdsSkadDto adsSkadDto3 = adsSkadDto;
            Boolean bool2 = valueOf3;
            Boolean bool3 = valueOf;
            Integer num4 = valueOf15;
            AdsMobileAppOpenDto adsMobileAppOpenDto5 = adsMobileAppOpenDto2;
            String readString4 = parcel.readString();
            ArrayList arrayList4 = arrayList;
            String str4 = str;
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = valueOf2;
                str2 = str4;
                baseBoolIntDto = baseBoolIntDto4;
                arrayList2 = null;
            } else {
                bool = valueOf2;
                int readInt3 = parcel.readInt();
                str2 = str4;
                arrayList2 = new ArrayList(readInt3);
                baseBoolIntDto = baseBoolIntDto4;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(StoriesStoryDto.class, parcel, arrayList2, i3, 1);
                    readInt3 = readInt3;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            AdsMobileAppOpenDto adsMobileAppOpenDto6 = adsMobileAppOpenDto;
            Boolean bool4 = valueOf4;
            Boolean bool5 = valueOf5;
            Boolean bool6 = bool;
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                i = readInt;
                createFromParcel3 = null;
            } else {
                i = readInt;
                createFromParcel3 = AdsCatchUpLinkDto.CREATOR.createFromParcel(parcel);
            }
            AdsCatchUpLinkDto adsCatchUpLinkDto2 = createFromParcel3;
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                adsCatchUpLinkDto = adsCatchUpLinkDto2;
                createFromParcel4 = null;
            } else {
                adsCatchUpLinkDto = adsCatchUpLinkDto2;
                createFromParcel4 = StoriesStoryLinkDto.CREATOR.createFromParcel(parcel);
            }
            StoriesStoryLinkDto storiesStoryLinkDto = createFromParcel4;
            int i4 = i;
            String readString7 = parcel.readString();
            MasksMaskDto masksMaskDto2 = (MasksMaskDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                masksMaskDto = masksMaskDto2;
                createFromParcel5 = null;
            } else {
                masksMaskDto = masksMaskDto2;
                createFromParcel5 = StoriesStoryDto.CREATOR.createFromParcel(parcel);
            }
            StoriesStoryDto storiesStoryDto = createFromParcel5;
            UserId userId4 = userId;
            ArrayList arrayList5 = arrayList2;
            String str5 = str2;
            AdsCatchUpLinkDto adsCatchUpLinkDto3 = adsCatchUpLinkDto;
            String readString8 = parcel.readString();
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            String readString9 = parcel.readString();
            Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                photosPhotoDto = photosPhotoDto2;
                createFromParcel6 = null;
            } else {
                photosPhotoDto = photosPhotoDto2;
                createFromParcel6 = StoriesQuestionsDto.CREATOR.createFromParcel(parcel);
            }
            StoriesQuestionsDto storiesQuestionsDto2 = createFromParcel6;
            if (parcel.readInt() == 0) {
                storiesQuestionsDto = storiesQuestionsDto2;
                createFromParcel7 = null;
            } else {
                storiesQuestionsDto = storiesQuestionsDto2;
                createFromParcel7 = StoriesRepliesDto.CREATOR.createFromParcel(parcel);
            }
            StoriesRepliesDto storiesRepliesDto = createFromParcel7;
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool7 = valueOf7;
            Boolean bool8 = valueOf9;
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto9;
                createFromParcel8 = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto9;
                createFromParcel8 = StoriesStoryTypeDto.CREATOR.createFromParcel(parcel);
            }
            StoriesStoryTypeDto storiesStoryTypeDto2 = createFromParcel8;
            if (parcel.readInt() == 0) {
                storiesStoryTypeDto = storiesStoryTypeDto2;
                createFromParcel9 = null;
            } else {
                storiesStoryTypeDto = storiesStoryTypeDto2;
                createFromParcel9 = StoriesClickableStickersDto.CREATOR.createFromParcel(parcel);
            }
            StoriesClickableStickersDto storiesClickableStickersDto = createFromParcel9;
            VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf12 = null;
                num = null;
            } else {
                valueOf12 = Integer.valueOf(parcel.readInt());
                num = null;
            }
            Integer num5 = valueOf16;
            Integer num6 = valueOf18;
            Boolean bool9 = valueOf10;
            StoriesStoryTypeDto storiesStoryTypeDto3 = storiesStoryTypeDto;
            String readString11 = parcel.readString();
            Integer valueOf21 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                videoVideoFullDto = videoVideoFullDto2;
                userId2 = userId4;
                str3 = str5;
                arrayList3 = num;
            } else {
                videoVideoFullDto = videoVideoFullDto2;
                int readInt4 = parcel.readInt();
                userId2 = userId4;
                arrayList3 = new ArrayList(readInt4);
                str3 = str5;
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(StoriesNewReactionDto.CREATOR, parcel, arrayList3, i5, 1);
                    readInt4 = readInt4;
                    valueOf6 = valueOf6;
                }
            }
            Boolean bool10 = valueOf6;
            if (parcel.readInt() == 0) {
                obj = num;
            } else {
                obj = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj2 = num;
            } else {
                obj2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj3 = num;
            } else {
                obj3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj4 = num;
            } else {
                obj4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            ?? r68 = obj;
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(StoriesStoryDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                obj5 = num;
            } else {
                obj5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj6 = num;
            } else {
                obj6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj7 = num;
            } else {
                obj7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf22 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            ?? r66 = obj6;
            String readString12 = parcel.readString();
            Integer valueOf23 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                obj8 = num;
            } else {
                obj8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj9 = num;
            } else {
                obj9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj10 = num;
            } else {
                obj10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                baseBoolIntDto3 = baseBoolIntDto11;
                createFromParcel10 = num;
            } else {
                baseBoolIntDto3 = baseBoolIntDto11;
                createFromParcel10 = StoriesStoryAlsoSubscribedDto.CREATOR.createFromParcel(parcel);
            }
            StoriesStoryAlsoSubscribedDto storiesStoryAlsoSubscribedDto2 = (StoriesStoryAlsoSubscribedDto) createFromParcel10;
            if (parcel.readInt() == 0) {
                obj11 = num;
            } else {
                obj11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj12 = num;
            } else {
                obj12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj13 = num;
            } else {
                obj13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                storiesStoryAlsoSubscribedDto = storiesStoryAlsoSubscribedDto2;
                createFromParcel11 = num;
            } else {
                storiesStoryAlsoSubscribedDto = storiesStoryAlsoSubscribedDto2;
                createFromParcel11 = AccountPrivacyValueDto.CREATOR.createFromParcel(parcel);
            }
            AccountPrivacyValueDto accountPrivacyValueDto2 = (AccountPrivacyValueDto) createFromParcel11;
            Object obj14 = num;
            ?? r60 = obj2;
            String str6 = str3;
            BaseBoolIntDto baseBoolIntDto12 = baseBoolIntDto3;
            ?? r77 = obj13;
            ?? r67 = obj7;
            Integer num7 = valueOf23;
            ?? r73 = obj10;
            ?? r76 = obj12;
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                accountPrivacyValueDto = accountPrivacyValueDto2;
                createFromParcel12 = obj14;
            } else {
                accountPrivacyValueDto = accountPrivacyValueDto2;
                createFromParcel12 = TemplateIdDto.CREATOR.createFromParcel(parcel);
            }
            TemplateIdDto templateIdDto2 = (TemplateIdDto) createFromParcel12;
            if (parcel.readInt() == 0) {
                templateIdDto = templateIdDto2;
                createFromParcel13 = obj14;
            } else {
                templateIdDto = templateIdDto2;
                createFromParcel13 = FormatDto.CREATOR.createFromParcel(parcel);
            }
            FormatDto formatDto2 = (FormatDto) createFromParcel13;
            TemplateIdDto templateIdDto3 = templateIdDto;
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel14 = obj14;
                formatDto = formatDto2;
            } else {
                formatDto = formatDto2;
                createFromParcel14 = StoriesMediascopeResearchDto.CREATOR.createFromParcel(parcel);
            }
            return new StoriesStoryDto(i4, userId2, str6, baseBoolIntDto, baseBoolIntDto5, baseBoolIntDto6, bool3, baseBoolIntDto7, baseBoolIntDto8, num2, num3, num4, readString2, createFromParcel15, readString3, createFromParcel16, adsSkadDto3, adsMobileAppOpenDto6, adsMobileAppOpenDto5, arrayList4, bool6, bool2, bool4, readString4, readString5, arrayList5, bool5, bool10, bool7, readString6, adsCatchUpLinkDto3, valueOf8, bool8, storiesStoryLinkDto, readString7, masksMaskDto, storiesStoryDto, readString8, num5, valueOf17, photosPhotoDto, readString9, num6, storiesQuestionsDto, storiesRepliesDto, baseBoolIntDto2, bool9, valueOf19, valueOf11, readString10, storiesStoryTypeDto3, storiesClickableStickersDto, videoVideoFullDto, valueOf20, valueOf12, readString11, valueOf21, arrayList3, r68, r60, obj3, obj4, baseBoolIntDto10, baseBoolIntDto12, obj5, r66, r67, valueOf22, readString12, num7, obj8, obj9, r73, storiesStoryAlsoSubscribedDto, obj11, r76, r77, accountPrivacyValueDto, readString13, templateIdDto3, formatDto, readString14, readString15, (StoriesMediascopeResearchDto) createFromParcel14);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesStoryDto[] newArray(int i) {
            return new StoriesStoryDto[i];
        }
    }

    public StoriesStoryDto(int i, UserId userId, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, Integer num, Integer num2, Integer num3, String str2, MemoryTypeDto memoryTypeDto, String str3, ContentScaleTypeDto contentScaleTypeDto, AdsSkadDto adsSkadDto, AdsMobileAppOpenDto adsMobileAppOpenDto, AdsMobileAppOpenDto adsMobileAppOpenDto2, List<BaseImageDto> list, Boolean bool2, Boolean bool3, Boolean bool4, String str4, String str5, List<AdsStatisticsPixelDto> list2, Boolean bool5, Boolean bool6, Boolean bool7, String str6, AdsCatchUpLinkDto adsCatchUpLinkDto, Boolean bool8, Boolean bool9, StoriesStoryLinkDto storiesStoryLinkDto, String str7, MasksMaskDto masksMaskDto, StoriesStoryDto storiesStoryDto, String str8, Integer num4, Integer num5, PhotosPhotoDto photosPhotoDto, String str9, Integer num6, StoriesQuestionsDto storiesQuestionsDto, StoriesRepliesDto storiesRepliesDto, BaseBoolIntDto baseBoolIntDto6, Boolean bool10, Integer num7, Boolean bool11, String str10, StoriesStoryTypeDto storiesStoryTypeDto, StoriesClickableStickersDto storiesClickableStickersDto, VideoVideoFullDto videoVideoFullDto, Integer num8, Integer num9, String str11, Integer num10, List<StoriesNewReactionDto> list3, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, Boolean bool16, Boolean bool17, Boolean bool18, Integer num11, String str12, Integer num12, Boolean bool19, Boolean bool20, Boolean bool21, StoriesStoryAlsoSubscribedDto storiesStoryAlsoSubscribedDto, Boolean bool22, Boolean bool23, Boolean bool24, AccountPrivacyValueDto accountPrivacyValueDto, String str13, TemplateIdDto templateIdDto, FormatDto formatDto, String str14, String str15, StoriesMediascopeResearchDto storiesMediascopeResearchDto) {
        this.id = i;
        this.ownerId = userId;
        this.accessKey = str;
        this.canComment = baseBoolIntDto;
        this.canReply = baseBoolIntDto2;
        this.canSee = baseBoolIntDto3;
        this.canLike = bool;
        this.canShare = baseBoolIntDto4;
        this.canHide = baseBoolIntDto5;
        this.date = num;
        this.answersCount = num2;
        this.expiresAt = num3;
        this.title = str2;
        this.memoryType = memoryTypeDto;
        this.memoryDate = str3;
        this.contentScaleType = contentScaleTypeDto;
        this.skad = adsSkadDto;
        this.androidApp = adsMobileAppOpenDto;
        this.iosApp = adsMobileAppOpenDto2;
        this.photoIcon = list;
        this.isAds = bool2;
        this.isAuthorsAds = bool3;
        this.isFromMessage = bool4;
        this.advertiserInfoUrl = str4;
        this.adMarker = str5;
        this.adsStatistics = list2;
        this.isPromo = bool5;
        this.isGenMemories = bool6;
        this.fromMemories = bool7;
        this.caption = str6;
        this.headerCatchUpLink = adsCatchUpLinkDto;
        this.isDeleted = bool8;
        this.isExpired = bool9;
        this.link = storiesStoryLinkDto;
        this.maskId = str7;
        this.mask = masksMaskDto;
        this.parentStory = storiesStoryDto;
        this.parentStoryAccessKey = str8;
        this.parentStoryId = num4;
        this.parentStoryOwnerId = num5;
        this.photo = photosPhotoDto;
        this.blurredPreview = str9;
        this.narrativeId = num6;
        this.questions = storiesQuestionsDto;
        this.replies = storiesRepliesDto;
        this.seen = baseBoolIntDto6;
        this.isLiked = bool10;
        this.seenProgress = num7;
        this.isOneTime = bool11;
        this.trackCode = str10;
        this.type = storiesStoryTypeDto;
        this.clickableStickers = storiesClickableStickersDto;
        this.video = videoVideoFullDto;
        this.views = num8;
        this.likesCount = num9;
        this.reactionSetId = str11;
        this.userReactionId = num10;
        this.newReactions = list3;
        this.isRestricted = bool12;
        this.noSound = bool13;
        this.needMute = bool14;
        this.muteReply = bool15;
        this.canAsk = baseBoolIntDto7;
        this.canAskAnonymous = baseBoolIntDto8;
        this.canDelete = bool16;
        this.canDeleteWithReason = bool17;
        this.preloadingEnabled = bool18;
        this.narrativesCount = num11;
        this.firstNarrativeTitle = str12;
        this.firstNarrativeId = num12;
        this.canUseInNarrative = bool19;
        this.needShowEmptyStats = bool20;
        this.haveOldPrivacy = bool21;
        this.alsoSubscribed = storiesStoryAlsoSubscribedDto;
        this.isProfileQuestion = bool22;
        this.isBestFriendsPrivacy = bool23;
        this.isMusicCover = bool24;
        this.privacy = accountPrivacyValueDto;
        this.sdkSource = str13;
        this.templateId = templateIdDto;
        this.format = formatDto;
        this.adDataImpression = str14;
        this.adData = str15;
        this.research = storiesMediascopeResearchDto;
    }

    public final BaseBoolIntDto B() {
        return this.canReply;
    }

    public final StoriesQuestionsDto B1() {
        return this.questions;
    }

    public final Boolean B2() {
        return this.isGenMemories;
    }

    public final BaseBoolIntDto C() {
        return this.canSee;
    }

    public final BaseBoolIntDto D() {
        return this.canShare;
    }

    public final MasksMaskDto D0() {
        return this.mask;
    }

    public final StoriesRepliesDto D1() {
        return this.replies;
    }

    public final StoriesMediascopeResearchDto E1() {
        return this.research;
    }

    public final Boolean E2() {
        return this.isLiked;
    }

    public final Boolean F() {
        return this.canUseInNarrative;
    }

    public final String F0() {
        return this.maskId;
    }

    public final String G() {
        return this.caption;
    }

    public final Boolean G2() {
        return this.isMusicCover;
    }

    public final String H0() {
        return this.memoryDate;
    }

    public final Boolean I2() {
        return this.isOneTime;
    }

    public final Boolean J2() {
        return this.isProfileQuestion;
    }

    public final StoriesClickableStickersDto K() {
        return this.clickableStickers;
    }

    public final MemoryTypeDto K0() {
        return this.memoryType;
    }

    public final String L1() {
        return this.sdkSource;
    }

    public final Boolean L2() {
        return this.isPromo;
    }

    public final ContentScaleTypeDto M() {
        return this.contentScaleType;
    }

    public final Boolean M2() {
        return this.isRestricted;
    }

    public final Boolean N0() {
        return this.muteReply;
    }

    public final BaseBoolIntDto N1() {
        return this.seen;
    }

    public final Integer P0() {
        return this.narrativeId;
    }

    public final Integer R() {
        return this.date;
    }

    public final Integer R1() {
        return this.seenProgress;
    }

    public final Integer S0() {
        return this.narrativesCount;
    }

    public final Integer T() {
        return this.expiresAt;
    }

    public final Boolean U0() {
        return this.needMute;
    }

    public final TemplateIdDto U1() {
        return this.templateId;
    }

    public final Boolean V0() {
        return this.needShowEmptyStats;
    }

    public final StoriesStoryTypeDto V1() {
        return this.type;
    }

    public final Integer W() {
        return this.firstNarrativeId;
    }

    public final Integer W1() {
        return this.userReactionId;
    }

    public final VideoVideoFullDto X1() {
        return this.video;
    }

    public final String Z() {
        return this.firstNarrativeTitle;
    }

    public final FormatDto a0() {
        return this.format;
    }

    public final List<StoriesNewReactionDto> b1() {
        return this.newReactions;
    }

    public final String d() {
        return this.accessKey;
    }

    public final Boolean d1() {
        return this.noSound;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.adData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryDto)) {
            return false;
        }
        StoriesStoryDto storiesStoryDto = (StoriesStoryDto) obj;
        return this.id == storiesStoryDto.id && epx.f(this.ownerId, storiesStoryDto.ownerId) && epx.f(this.accessKey, storiesStoryDto.accessKey) && this.canComment == storiesStoryDto.canComment && this.canReply == storiesStoryDto.canReply && this.canSee == storiesStoryDto.canSee && epx.f(this.canLike, storiesStoryDto.canLike) && this.canShare == storiesStoryDto.canShare && this.canHide == storiesStoryDto.canHide && epx.f(this.date, storiesStoryDto.date) && epx.f(this.answersCount, storiesStoryDto.answersCount) && epx.f(this.expiresAt, storiesStoryDto.expiresAt) && epx.f(this.title, storiesStoryDto.title) && this.memoryType == storiesStoryDto.memoryType && epx.f(this.memoryDate, storiesStoryDto.memoryDate) && this.contentScaleType == storiesStoryDto.contentScaleType && epx.f(this.skad, storiesStoryDto.skad) && epx.f(this.androidApp, storiesStoryDto.androidApp) && epx.f(this.iosApp, storiesStoryDto.iosApp) && epx.f(this.photoIcon, storiesStoryDto.photoIcon) && epx.f(this.isAds, storiesStoryDto.isAds) && epx.f(this.isAuthorsAds, storiesStoryDto.isAuthorsAds) && epx.f(this.isFromMessage, storiesStoryDto.isFromMessage) && epx.f(this.advertiserInfoUrl, storiesStoryDto.advertiserInfoUrl) && epx.f(this.adMarker, storiesStoryDto.adMarker) && epx.f(this.adsStatistics, storiesStoryDto.adsStatistics) && epx.f(this.isPromo, storiesStoryDto.isPromo) && epx.f(this.isGenMemories, storiesStoryDto.isGenMemories) && epx.f(this.fromMemories, storiesStoryDto.fromMemories) && epx.f(this.caption, storiesStoryDto.caption) && epx.f(this.headerCatchUpLink, storiesStoryDto.headerCatchUpLink) && epx.f(this.isDeleted, storiesStoryDto.isDeleted) && epx.f(this.isExpired, storiesStoryDto.isExpired) && epx.f(this.link, storiesStoryDto.link) && epx.f(this.maskId, storiesStoryDto.maskId) && epx.f(this.mask, storiesStoryDto.mask) && epx.f(this.parentStory, storiesStoryDto.parentStory) && epx.f(this.parentStoryAccessKey, storiesStoryDto.parentStoryAccessKey) && epx.f(this.parentStoryId, storiesStoryDto.parentStoryId) && epx.f(this.parentStoryOwnerId, storiesStoryDto.parentStoryOwnerId) && epx.f(this.photo, storiesStoryDto.photo) && epx.f(this.blurredPreview, storiesStoryDto.blurredPreview) && epx.f(this.narrativeId, storiesStoryDto.narrativeId) && epx.f(this.questions, storiesStoryDto.questions) && epx.f(this.replies, storiesStoryDto.replies) && this.seen == storiesStoryDto.seen && epx.f(this.isLiked, storiesStoryDto.isLiked) && epx.f(this.seenProgress, storiesStoryDto.seenProgress) && epx.f(this.isOneTime, storiesStoryDto.isOneTime) && epx.f(this.trackCode, storiesStoryDto.trackCode) && this.type == storiesStoryDto.type && epx.f(this.clickableStickers, storiesStoryDto.clickableStickers) && epx.f(this.video, storiesStoryDto.video) && epx.f(this.views, storiesStoryDto.views) && epx.f(this.likesCount, storiesStoryDto.likesCount) && epx.f(this.reactionSetId, storiesStoryDto.reactionSetId) && epx.f(this.userReactionId, storiesStoryDto.userReactionId) && epx.f(this.newReactions, storiesStoryDto.newReactions) && epx.f(this.isRestricted, storiesStoryDto.isRestricted) && epx.f(this.noSound, storiesStoryDto.noSound) && epx.f(this.needMute, storiesStoryDto.needMute) && epx.f(this.muteReply, storiesStoryDto.muteReply) && this.canAsk == storiesStoryDto.canAsk && this.canAskAnonymous == storiesStoryDto.canAskAnonymous && epx.f(this.canDelete, storiesStoryDto.canDelete) && epx.f(this.canDeleteWithReason, storiesStoryDto.canDeleteWithReason) && epx.f(this.preloadingEnabled, storiesStoryDto.preloadingEnabled) && epx.f(this.narrativesCount, storiesStoryDto.narrativesCount) && epx.f(this.firstNarrativeTitle, storiesStoryDto.firstNarrativeTitle) && epx.f(this.firstNarrativeId, storiesStoryDto.firstNarrativeId) && epx.f(this.canUseInNarrative, storiesStoryDto.canUseInNarrative) && epx.f(this.needShowEmptyStats, storiesStoryDto.needShowEmptyStats) && epx.f(this.haveOldPrivacy, storiesStoryDto.haveOldPrivacy) && epx.f(this.alsoSubscribed, storiesStoryDto.alsoSubscribed) && epx.f(this.isProfileQuestion, storiesStoryDto.isProfileQuestion) && epx.f(this.isBestFriendsPrivacy, storiesStoryDto.isBestFriendsPrivacy) && epx.f(this.isMusicCover, storiesStoryDto.isMusicCover) && this.privacy == storiesStoryDto.privacy && epx.f(this.sdkSource, storiesStoryDto.sdkSource) && this.templateId == storiesStoryDto.templateId && this.format == storiesStoryDto.format && epx.f(this.adDataImpression, storiesStoryDto.adDataImpression) && epx.f(this.adData, storiesStoryDto.adData) && epx.f(this.research, storiesStoryDto.research);
    }

    public final String f() {
        return this.adMarker;
    }

    public final List<AdsStatisticsPixelDto> g() {
        return this.adsStatistics;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b);
        String str = this.accessKey;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canReply;
        int hashCode3 = (hashCode2 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canSee;
        int hashCode4 = (hashCode3 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool = this.canLike;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canShare;
        int hashCode6 = (hashCode5 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canHide;
        int hashCode7 = (hashCode6 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        Integer num = this.date;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.answersCount;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.expiresAt;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.title;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MemoryTypeDto memoryTypeDto = this.memoryType;
        int hashCode12 = (hashCode11 + (memoryTypeDto == null ? 0 : memoryTypeDto.hashCode())) * 31;
        String str3 = this.memoryDate;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContentScaleTypeDto contentScaleTypeDto = this.contentScaleType;
        int hashCode14 = (hashCode13 + (contentScaleTypeDto == null ? 0 : contentScaleTypeDto.hashCode())) * 31;
        AdsSkadDto adsSkadDto = this.skad;
        int hashCode15 = (hashCode14 + (adsSkadDto == null ? 0 : adsSkadDto.hashCode())) * 31;
        AdsMobileAppOpenDto adsMobileAppOpenDto = this.androidApp;
        int hashCode16 = (hashCode15 + (adsMobileAppOpenDto == null ? 0 : adsMobileAppOpenDto.hashCode())) * 31;
        AdsMobileAppOpenDto adsMobileAppOpenDto2 = this.iosApp;
        int hashCode17 = (hashCode16 + (adsMobileAppOpenDto2 == null ? 0 : adsMobileAppOpenDto2.hashCode())) * 31;
        List<BaseImageDto> list = this.photoIcon;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.isAds;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAuthorsAds;
        int hashCode20 = (hashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isFromMessage;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str4 = this.advertiserInfoUrl;
        int hashCode22 = (hashCode21 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.adMarker;
        int hashCode23 = (hashCode22 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<AdsStatisticsPixelDto> list2 = this.adsStatistics;
        int hashCode24 = (hashCode23 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.isPromo;
        int hashCode25 = (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isGenMemories;
        int hashCode26 = (hashCode25 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.fromMemories;
        int hashCode27 = (hashCode26 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str6 = this.caption;
        int hashCode28 = (hashCode27 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AdsCatchUpLinkDto adsCatchUpLinkDto = this.headerCatchUpLink;
        int hashCode29 = (hashCode28 + (adsCatchUpLinkDto == null ? 0 : adsCatchUpLinkDto.hashCode())) * 31;
        Boolean bool8 = this.isDeleted;
        int hashCode30 = (hashCode29 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isExpired;
        int hashCode31 = (hashCode30 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        StoriesStoryLinkDto storiesStoryLinkDto = this.link;
        int hashCode32 = (hashCode31 + (storiesStoryLinkDto == null ? 0 : storiesStoryLinkDto.hashCode())) * 31;
        String str7 = this.maskId;
        int hashCode33 = (hashCode32 + (str7 == null ? 0 : str7.hashCode())) * 31;
        MasksMaskDto masksMaskDto = this.mask;
        int hashCode34 = (hashCode33 + (masksMaskDto == null ? 0 : masksMaskDto.hashCode())) * 31;
        StoriesStoryDto storiesStoryDto = this.parentStory;
        int hashCode35 = (hashCode34 + (storiesStoryDto == null ? 0 : storiesStoryDto.hashCode())) * 31;
        String str8 = this.parentStoryAccessKey;
        int hashCode36 = (hashCode35 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.parentStoryId;
        int hashCode37 = (hashCode36 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.parentStoryOwnerId;
        int hashCode38 = (hashCode37 + (num5 == null ? 0 : num5.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode39 = (hashCode38 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        String str9 = this.blurredPreview;
        int hashCode40 = (hashCode39 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num6 = this.narrativeId;
        int hashCode41 = (hashCode40 + (num6 == null ? 0 : num6.hashCode())) * 31;
        StoriesQuestionsDto storiesQuestionsDto = this.questions;
        int hashCode42 = (hashCode41 + (storiesQuestionsDto == null ? 0 : storiesQuestionsDto.hashCode())) * 31;
        StoriesRepliesDto storiesRepliesDto = this.replies;
        int hashCode43 = (hashCode42 + (storiesRepliesDto == null ? 0 : storiesRepliesDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.seen;
        int hashCode44 = (hashCode43 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        Boolean bool10 = this.isLiked;
        int hashCode45 = (hashCode44 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Integer num7 = this.seenProgress;
        int hashCode46 = (hashCode45 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool11 = this.isOneTime;
        int hashCode47 = (hashCode46 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str10 = this.trackCode;
        int hashCode48 = (hashCode47 + (str10 == null ? 0 : str10.hashCode())) * 31;
        StoriesStoryTypeDto storiesStoryTypeDto = this.type;
        int hashCode49 = (hashCode48 + (storiesStoryTypeDto == null ? 0 : storiesStoryTypeDto.hashCode())) * 31;
        StoriesClickableStickersDto storiesClickableStickersDto = this.clickableStickers;
        int hashCode50 = (hashCode49 + (storiesClickableStickersDto == null ? 0 : storiesClickableStickersDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode51 = (hashCode50 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        Integer num8 = this.views;
        int hashCode52 = (hashCode51 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.likesCount;
        int hashCode53 = (hashCode52 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str11 = this.reactionSetId;
        int hashCode54 = (hashCode53 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num10 = this.userReactionId;
        int hashCode55 = (hashCode54 + (num10 == null ? 0 : num10.hashCode())) * 31;
        List<StoriesNewReactionDto> list3 = this.newReactions;
        int hashCode56 = (hashCode55 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool12 = this.isRestricted;
        int hashCode57 = (hashCode56 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.noSound;
        int hashCode58 = (hashCode57 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.needMute;
        int hashCode59 = (hashCode58 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.muteReply;
        int hashCode60 = (hashCode59 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canAsk;
        int hashCode61 = (hashCode60 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.canAskAnonymous;
        int hashCode62 = (hashCode61 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        Boolean bool16 = this.canDelete;
        int hashCode63 = (hashCode62 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.canDeleteWithReason;
        int hashCode64 = (hashCode63 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.preloadingEnabled;
        int hashCode65 = (hashCode64 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Integer num11 = this.narrativesCount;
        int hashCode66 = (hashCode65 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str12 = this.firstNarrativeTitle;
        int hashCode67 = (hashCode66 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num12 = this.firstNarrativeId;
        int hashCode68 = (hashCode67 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Boolean bool19 = this.canUseInNarrative;
        int hashCode69 = (hashCode68 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.needShowEmptyStats;
        int hashCode70 = (hashCode69 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.haveOldPrivacy;
        int hashCode71 = (hashCode70 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        StoriesStoryAlsoSubscribedDto storiesStoryAlsoSubscribedDto = this.alsoSubscribed;
        int hashCode72 = (hashCode71 + (storiesStoryAlsoSubscribedDto == null ? 0 : storiesStoryAlsoSubscribedDto.hashCode())) * 31;
        Boolean bool22 = this.isProfileQuestion;
        int hashCode73 = (hashCode72 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.isBestFriendsPrivacy;
        int hashCode74 = (hashCode73 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.isMusicCover;
        int hashCode75 = (hashCode74 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        AccountPrivacyValueDto accountPrivacyValueDto = this.privacy;
        int hashCode76 = (hashCode75 + (accountPrivacyValueDto == null ? 0 : accountPrivacyValueDto.hashCode())) * 31;
        String str13 = this.sdkSource;
        int hashCode77 = (hashCode76 + (str13 == null ? 0 : str13.hashCode())) * 31;
        TemplateIdDto templateIdDto = this.templateId;
        int hashCode78 = (hashCode77 + (templateIdDto == null ? 0 : templateIdDto.hashCode())) * 31;
        FormatDto formatDto = this.format;
        int hashCode79 = (hashCode78 + (formatDto == null ? 0 : formatDto.hashCode())) * 31;
        String str14 = this.adDataImpression;
        int hashCode80 = (hashCode79 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.adData;
        int hashCode81 = (hashCode80 + (str15 == null ? 0 : str15.hashCode())) * 31;
        StoriesMediascopeResearchDto storiesMediascopeResearchDto = this.research;
        return hashCode81 + (storiesMediascopeResearchDto != null ? storiesMediascopeResearchDto.hashCode() : 0);
    }

    public final String i() {
        return this.advertiserInfoUrl;
    }

    public final Integer i2() {
        return this.views;
    }

    public final StoriesStoryAlsoSubscribedDto j() {
        return this.alsoSubscribed;
    }

    public final AdsMobileAppOpenDto k() {
        return this.androidApp;
    }

    public final BaseBoolIntDto l() {
        return this.canAsk;
    }

    public final Boolean l0() {
        return this.haveOldPrivacy;
    }

    public final Boolean l2() {
        return this.isAds;
    }

    public final Boolean m2() {
        return this.isAuthorsAds;
    }

    public final BaseBoolIntDto n() {
        return this.canAskAnonymous;
    }

    public final StoriesStoryDto n1() {
        return this.parentStory;
    }

    public final BaseBoolIntDto o() {
        return this.canComment;
    }

    public final String o1() {
        return this.parentStoryAccessKey;
    }

    public final Boolean o2() {
        return this.isBestFriendsPrivacy;
    }

    public final BaseBoolIntDto p() {
        return this.canHide;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final Boolean q2() {
        return this.isDeleted;
    }

    public final String r() {
        return this.trackCode;
    }

    public final Boolean r2() {
        return this.isExpired;
    }

    public final Integer s1() {
        return this.parentStoryId;
    }

    public final Integer t1() {
        return this.parentStoryOwnerId;
    }

    public final String toString() {
        return "StoriesStoryDto(id=" + this.id + ", ownerId=" + this.ownerId + ", accessKey=" + this.accessKey + ", canComment=" + this.canComment + ", canReply=" + this.canReply + ", canSee=" + this.canSee + ", canLike=" + this.canLike + ", canShare=" + this.canShare + ", canHide=" + this.canHide + ", date=" + this.date + ", answersCount=" + this.answersCount + ", expiresAt=" + this.expiresAt + ", title=" + this.title + ", memoryType=" + this.memoryType + ", memoryDate=" + this.memoryDate + ", contentScaleType=" + this.contentScaleType + ", skad=" + this.skad + ", androidApp=" + this.androidApp + ", iosApp=" + this.iosApp + ", photoIcon=" + this.photoIcon + ", isAds=" + this.isAds + ", isAuthorsAds=" + this.isAuthorsAds + ", isFromMessage=" + this.isFromMessage + ", advertiserInfoUrl=" + this.advertiserInfoUrl + ", adMarker=" + this.adMarker + ", adsStatistics=" + this.adsStatistics + ", isPromo=" + this.isPromo + ", isGenMemories=" + this.isGenMemories + ", fromMemories=" + this.fromMemories + ", caption=" + this.caption + ", headerCatchUpLink=" + this.headerCatchUpLink + ", isDeleted=" + this.isDeleted + ", isExpired=" + this.isExpired + ", link=" + this.link + ", maskId=" + this.maskId + ", mask=" + this.mask + ", parentStory=" + this.parentStory + ", parentStoryAccessKey=" + this.parentStoryAccessKey + ", parentStoryId=" + this.parentStoryId + ", parentStoryOwnerId=" + this.parentStoryOwnerId + ", photo=" + this.photo + ", blurredPreview=" + this.blurredPreview + ", narrativeId=" + this.narrativeId + ", questions=" + this.questions + ", replies=" + this.replies + ", seen=" + this.seen + ", isLiked=" + this.isLiked + ", seenProgress=" + this.seenProgress + ", isOneTime=" + this.isOneTime + ", trackCode=" + this.trackCode + ", type=" + this.type + ", clickableStickers=" + this.clickableStickers + ", video=" + this.video + ", views=" + this.views + ", likesCount=" + this.likesCount + ", reactionSetId=" + this.reactionSetId + ", userReactionId=" + this.userReactionId + ", newReactions=" + this.newReactions + ", isRestricted=" + this.isRestricted + ", noSound=" + this.noSound + ", needMute=" + this.needMute + ", muteReply=" + this.muteReply + ", canAsk=" + this.canAsk + ", canAskAnonymous=" + this.canAskAnonymous + ", canDelete=" + this.canDelete + ", canDeleteWithReason=" + this.canDeleteWithReason + ", preloadingEnabled=" + this.preloadingEnabled + ", narrativesCount=" + this.narrativesCount + ", firstNarrativeTitle=" + this.firstNarrativeTitle + ", firstNarrativeId=" + this.firstNarrativeId + ", canUseInNarrative=" + this.canUseInNarrative + ", needShowEmptyStats=" + this.needShowEmptyStats + ", haveOldPrivacy=" + this.haveOldPrivacy + ", alsoSubscribed=" + this.alsoSubscribed + ", isProfileQuestion=" + this.isProfileQuestion + ", isBestFriendsPrivacy=" + this.isBestFriendsPrivacy + ", isMusicCover=" + this.isMusicCover + ", privacy=" + this.privacy + ", sdkSource=" + this.sdkSource + ", templateId=" + this.templateId + ", format=" + this.format + ", adDataImpression=" + this.adDataImpression + ", adData=" + this.adData + ", research=" + this.research + ')';
    }

    public final Boolean u() {
        return this.canLike;
    }

    public final AdsCatchUpLinkDto v0() {
        return this.headerCatchUpLink;
    }

    public final Integer w0() {
        return this.likesCount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.accessKey);
        parcel.writeParcelable(this.canComment, i);
        parcel.writeParcelable(this.canReply, i);
        parcel.writeParcelable(this.canSee, i);
        Boolean bool = this.canLike;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.canShare, i);
        parcel.writeParcelable(this.canHide, i);
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.answersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.expiresAt;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.title);
        MemoryTypeDto memoryTypeDto = this.memoryType;
        if (memoryTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memoryTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.memoryDate);
        ContentScaleTypeDto contentScaleTypeDto = this.contentScaleType;
        if (contentScaleTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentScaleTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.skad, i);
        AdsMobileAppOpenDto adsMobileAppOpenDto = this.androidApp;
        if (adsMobileAppOpenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsMobileAppOpenDto.writeToParcel(parcel, i);
        }
        AdsMobileAppOpenDto adsMobileAppOpenDto2 = this.iosApp;
        if (adsMobileAppOpenDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsMobileAppOpenDto2.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.photoIcon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool2 = this.isAds;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isAuthorsAds;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isFromMessage;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeString(this.advertiserInfoUrl);
        parcel.writeString(this.adMarker);
        List<AdsStatisticsPixelDto> list2 = this.adsStatistics;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Boolean bool5 = this.isPromo;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.isGenMemories;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.fromMemories;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeString(this.caption);
        AdsCatchUpLinkDto adsCatchUpLinkDto = this.headerCatchUpLink;
        if (adsCatchUpLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsCatchUpLinkDto.writeToParcel(parcel, i);
        }
        Boolean bool8 = this.isDeleted;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.isExpired;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        StoriesStoryLinkDto storiesStoryLinkDto = this.link;
        if (storiesStoryLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesStoryLinkDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.maskId);
        parcel.writeParcelable(this.mask, i);
        StoriesStoryDto storiesStoryDto = this.parentStory;
        if (storiesStoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesStoryDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.parentStoryAccessKey);
        Integer num4 = this.parentStoryId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.parentStoryOwnerId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeParcelable(this.photo, i);
        parcel.writeString(this.blurredPreview);
        Integer num6 = this.narrativeId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        StoriesQuestionsDto storiesQuestionsDto = this.questions;
        if (storiesQuestionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesQuestionsDto.writeToParcel(parcel, i);
        }
        StoriesRepliesDto storiesRepliesDto = this.replies;
        if (storiesRepliesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesRepliesDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.seen, i);
        Boolean bool10 = this.isLiked;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Integer num7 = this.seenProgress;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        Boolean bool11 = this.isOneTime;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        parcel.writeString(this.trackCode);
        StoriesStoryTypeDto storiesStoryTypeDto = this.type;
        if (storiesStoryTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesStoryTypeDto.writeToParcel(parcel, i);
        }
        StoriesClickableStickersDto storiesClickableStickersDto = this.clickableStickers;
        if (storiesClickableStickersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesClickableStickersDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.video, i);
        Integer num8 = this.views;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Integer num9 = this.likesCount;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        parcel.writeString(this.reactionSetId);
        Integer num10 = this.userReactionId;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        List<StoriesNewReactionDto> list3 = this.newReactions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((StoriesNewReactionDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool12 = this.isRestricted;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        Boolean bool13 = this.noSound;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        Boolean bool14 = this.needMute;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        Boolean bool15 = this.muteReply;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        parcel.writeParcelable(this.canAsk, i);
        parcel.writeParcelable(this.canAskAnonymous, i);
        Boolean bool16 = this.canDelete;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        Boolean bool17 = this.canDeleteWithReason;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
        }
        Boolean bool18 = this.preloadingEnabled;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
        }
        Integer num11 = this.narrativesCount;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        parcel.writeString(this.firstNarrativeTitle);
        Integer num12 = this.firstNarrativeId;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        Boolean bool19 = this.canUseInNarrative;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
        Boolean bool20 = this.needShowEmptyStats;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool20);
        }
        Boolean bool21 = this.haveOldPrivacy;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool21);
        }
        StoriesStoryAlsoSubscribedDto storiesStoryAlsoSubscribedDto = this.alsoSubscribed;
        if (storiesStoryAlsoSubscribedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesStoryAlsoSubscribedDto.writeToParcel(parcel, i);
        }
        Boolean bool22 = this.isProfileQuestion;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
        Boolean bool23 = this.isBestFriendsPrivacy;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool23);
        }
        Boolean bool24 = this.isMusicCover;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool24);
        }
        AccountPrivacyValueDto accountPrivacyValueDto = this.privacy;
        if (accountPrivacyValueDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountPrivacyValueDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.sdkSource);
        TemplateIdDto templateIdDto = this.templateId;
        if (templateIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateIdDto.writeToParcel(parcel, i);
        }
        FormatDto formatDto = this.format;
        if (formatDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formatDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.adDataImpression);
        parcel.writeString(this.adData);
        StoriesMediascopeResearchDto storiesMediascopeResearchDto = this.research;
        if (storiesMediascopeResearchDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesMediascopeResearchDto.writeToParcel(parcel, i);
        }
    }

    public final PhotosPhotoDto x1() {
        return this.photo;
    }

    public final StoriesStoryLinkDto y0() {
        return this.link;
    }

    public final List<BaseImageDto> y1() {
        return this.photoIcon;
    }

    public final Boolean y2() {
        return this.isFromMessage;
    }

    public final AccountPrivacyValueDto z1() {
        return this.privacy;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StoriesStoryDto(int i, UserId userId, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, Integer num, Integer num2, Integer num3, String str2, MemoryTypeDto memoryTypeDto, String str3, ContentScaleTypeDto contentScaleTypeDto, AdsSkadDto adsSkadDto, AdsMobileAppOpenDto adsMobileAppOpenDto, AdsMobileAppOpenDto adsMobileAppOpenDto2, List list, Boolean bool2, Boolean bool3, Boolean bool4, String str4, String str5, List list2, Boolean bool5, Boolean bool6, Boolean bool7, String str6, AdsCatchUpLinkDto adsCatchUpLinkDto, Boolean bool8, Boolean bool9, StoriesStoryLinkDto storiesStoryLinkDto, String str7, MasksMaskDto masksMaskDto, StoriesStoryDto storiesStoryDto, String str8, Integer num4, Integer num5, PhotosPhotoDto photosPhotoDto, String str9, Integer num6, StoriesQuestionsDto storiesQuestionsDto, StoriesRepliesDto storiesRepliesDto, BaseBoolIntDto baseBoolIntDto6, Boolean bool10, Integer num7, Boolean bool11, String str10, StoriesStoryTypeDto storiesStoryTypeDto, StoriesClickableStickersDto storiesClickableStickersDto, VideoVideoFullDto videoVideoFullDto, Integer num8, Integer num9, String str11, Integer num10, List list3, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, Boolean bool16, Boolean bool17, Boolean bool18, Integer num11, String str12, Integer num12, Boolean bool19, Boolean bool20, Boolean bool21, StoriesStoryAlsoSubscribedDto storiesStoryAlsoSubscribedDto, Boolean bool22, Boolean bool23, Boolean bool24, AccountPrivacyValueDto accountPrivacyValueDto, String str13, TemplateIdDto templateIdDto, FormatDto formatDto, String str14, String str15, StoriesMediascopeResearchDto storiesMediascopeResearchDto, int i2, int i3, int i4, zcl zclVar) {
        this(i, userId, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r17, r19, r21, r23, r25, r27, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r0, (i3 & 1) != 0 ? null : bool9, (i3 & 2) != 0 ? null : storiesStoryLinkDto, (i3 & 4) != 0 ? null : str7, (i3 & 8) != 0 ? null : masksMaskDto, (i3 & 16) != 0 ? null : storiesStoryDto, (i3 & 32) != 0 ? null : str8, (i3 & 64) != 0 ? null : num4, (i3 & 128) != 0 ? null : num5, (i3 & 256) != 0 ? null : photosPhotoDto, (i3 & 512) != 0 ? null : str9, (i3 & 1024) != 0 ? null : num6, (i3 & 2048) != 0 ? null : storiesQuestionsDto, (i3 & 4096) != 0 ? null : storiesRepliesDto, (i3 & 8192) != 0 ? null : baseBoolIntDto6, (i3 & 16384) != 0 ? null : bool10, (i3 & 32768) != 0 ? null : num7, (i3 & 65536) != 0 ? null : bool11, (i3 & 131072) != 0 ? null : str10, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : storiesStoryTypeDto, (i3 & 524288) != 0 ? null : storiesClickableStickersDto, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : videoVideoFullDto, (i3 & 2097152) != 0 ? null : num8, (i3 & 4194304) != 0 ? null : num9, (i3 & 8388608) != 0 ? null : str11, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num10, (i3 & 33554432) != 0 ? null : list3, (i3 & 67108864) != 0 ? null : bool12, (i3 & 134217728) != 0 ? null : bool13, (i3 & 268435456) != 0 ? null : bool14, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool15, (i3 & 1073741824) != 0 ? null : baseBoolIntDto7, (i3 & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto8, (i4 & 1) != 0 ? null : bool16, (i4 & 2) != 0 ? null : bool17, (i4 & 4) != 0 ? null : bool18, (i4 & 8) != 0 ? null : num11, (i4 & 16) != 0 ? null : str12, (i4 & 32) != 0 ? null : num12, (i4 & 64) != 0 ? null : bool19, (i4 & 128) != 0 ? null : bool20, (i4 & 256) != 0 ? null : bool21, (i4 & 512) != 0 ? null : storiesStoryAlsoSubscribedDto, (i4 & 1024) != 0 ? null : bool22, (i4 & 2048) != 0 ? null : bool23, (i4 & 4096) != 0 ? null : bool24, (i4 & 8192) != 0 ? null : accountPrivacyValueDto, (i4 & 16384) != 0 ? null : str13, (i4 & 32768) != 0 ? null : templateIdDto, (i4 & 65536) != 0 ? null : formatDto, (i4 & 131072) != 0 ? null : str14, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str15, (i4 & 524288) != 0 ? null : storiesMediascopeResearchDto);
        String str16 = (i2 & 4) != 0 ? null : str;
        BaseBoolIntDto baseBoolIntDto9 = (i2 & 8) != 0 ? null : baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto10 = (i2 & 16) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto11 = (i2 & 32) != 0 ? null : baseBoolIntDto3;
        Boolean bool25 = (i2 & 64) != 0 ? null : bool;
        BaseBoolIntDto baseBoolIntDto12 = (i2 & 128) != 0 ? null : baseBoolIntDto4;
        BaseBoolIntDto baseBoolIntDto13 = (i2 & 256) != 0 ? null : baseBoolIntDto5;
        Integer num13 = (i2 & 512) != 0 ? null : num;
        Integer num14 = (i2 & 1024) != 0 ? null : num2;
        Integer num15 = (i2 & 2048) != 0 ? null : num3;
        String str17 = (i2 & 4096) != 0 ? null : str2;
        MemoryTypeDto memoryTypeDto2 = (i2 & 8192) != 0 ? null : memoryTypeDto;
        String str18 = (i2 & 16384) != 0 ? null : str3;
        ContentScaleTypeDto contentScaleTypeDto2 = (i2 & 32768) != 0 ? null : contentScaleTypeDto;
        AdsSkadDto adsSkadDto2 = (i2 & 65536) != 0 ? null : adsSkadDto;
        AdsMobileAppOpenDto adsMobileAppOpenDto3 = (i2 & 131072) != 0 ? null : adsMobileAppOpenDto;
        AdsMobileAppOpenDto adsMobileAppOpenDto4 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : adsMobileAppOpenDto2;
        List list4 = (i2 & 524288) != 0 ? null : list;
        Boolean bool26 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool2;
        Boolean bool27 = (i2 & 2097152) != 0 ? null : bool3;
        Boolean bool28 = (i2 & 4194304) != 0 ? null : bool4;
        String str19 = (i2 & 8388608) != 0 ? null : str4;
        String str20 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str5;
        List list5 = (i2 & 33554432) != 0 ? null : list2;
        Boolean bool29 = (i2 & 67108864) != 0 ? null : bool5;
        Boolean bool30 = (i2 & 134217728) != 0 ? null : bool6;
        Boolean bool31 = (i2 & 268435456) != 0 ? null : bool7;
        String str21 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str6;
        AdsCatchUpLinkDto adsCatchUpLinkDto2 = (i2 & 1073741824) != 0 ? null : adsCatchUpLinkDto;
        Boolean bool32 = (i2 & Integer.MIN_VALUE) != 0 ? null : bool8;
    }
}
