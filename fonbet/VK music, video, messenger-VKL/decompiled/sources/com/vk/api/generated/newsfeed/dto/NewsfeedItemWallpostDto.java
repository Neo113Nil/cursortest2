package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.ads.dto.AdsAdvertiserInfoDto;
import com.vk.api.generated.badges.dto.BadgesCommentInfoDto;
import com.vk.api.generated.badges.dto.BadgesDonutInfoDto;
import com.vk.api.generated.badges.dto.BadgesObjectInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseBottomExtensionDto;
import com.vk.api.generated.base.dto.BaseCommentsInfoDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.wall.dto.WallCoownersDto;
import com.vk.api.generated.wall.dto.WallGeoDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.api.generated.wall.dto.WallPostCopyrightDto;
import com.vk.api.generated.wall.dto.WallPostSourceDto;
import com.vk.api.generated.wall.dto.WallPostTypeDto;
import com.vk.api.generated.wall.dto.WallPosterDto;
import com.vk.api.generated.wall.dto.WallSharingDto;
import com.vk.api.generated.wall.dto.WallViewsDto;
import com.vk.api.generated.wall.dto.WallWallpostAdsEasyPromoteDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentsMetaDto;
import com.vk.api.generated.wall.dto.WallWallpostAuthorDataDto;
import com.vk.api.generated.wall.dto.WallWallpostCategoryActionDto;
import com.vk.api.generated.wall.dto.WallWallpostContentLayoutItemDto;
import com.vk.api.generated.wall.dto.WallWallpostDonutDto;
import com.vk.api.generated.wall.dto.WallWallpostFullDto;
import com.vk.api.generated.wall.dto.WallWallpostRatingDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedItemWallpostDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemWallpostDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemWallpostDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("activity")
    private final WallPostActivityDto activity;

    @pmi0("ad_data")
    private final String adData;

    @pmi0("ad_moderation_checksum")
    private final String adModerationChecksum;

    @pmi0("ads_easy_promote")
    private final WallWallpostAdsEasyPromoteDto adsEasyPromote;

    @pmi0("ads_easy_promote_three_dots")
    private final Boolean adsEasyPromoteThreeDots;

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("attachments_meta")
    private final WallWallpostAttachmentsMetaDto attachmentsMeta;

    @pmi0("author_ad")
    private final AdsAdvertiserInfoDto authorAd;

    @pmi0("away_params")
    private final Object awayParams;

    @pmi0("badge_id")
    private final Integer badgeId;

    @pmi0("badge_info")
    private final BadgesCommentInfoDto badgeInfo;

    @pmi0("badges")
    private final BadgesObjectInfoDto badges;

    @pmi0("best_friends_only")
    private final BaseBoolIntDto bestFriendsOnly;

    @pmi0("bottom_extension")
    private final BaseBottomExtensionDto bottomExtension;

    @pmi0("can_archive")
    private final Boolean canArchive;

    @pmi0("can_delete")
    private final BaseBoolIntDto canDelete;

    @pmi0("can_doubt_category")
    private final Boolean canDoubtCategory;

    @pmi0("can_edit")
    private final BaseBoolIntDto canEdit;

    @pmi0("can_ignore")
    private final Boolean canIgnore;

    @pmi0("can_pin")
    private final BaseBoolIntDto canPin;

    @pmi0("can_publish")
    private final BaseBoolIntDto canPublish;

    @pmi0("can_set_category")
    private final Boolean canSetCategory;

    @pmi0("can_view_stats")
    private final BaseBoolIntDto canViewStats;

    @pmi0("caption")
    private final NewsfeedNewsfeedItemCaptionDto caption;

    @pmi0("carousel_offset")
    private final Integer carouselOffset;

    @pmi0("category_action")
    private final WallWallpostCategoryActionDto categoryAction;

    @pmi0("check_sign")
    private final Boolean checkSign;

    @pmi0("comments")
    private final BaseCommentsInfoDto comments;

    @pmi0("compact_attachments_before_cut")
    private final Integer compactAttachmentsBeforeCut;

    @pmi0("content_layout")
    private final List<WallWallpostContentLayoutItemDto> contentLayout;

    @pmi0("coowners")
    private final WallCoownersDto coowners;

    @pmi0("copy_history")
    private final List<WallWallpostFullDto> copyHistory;

    @pmi0("copyright")
    private final WallPostCopyrightDto copyright;

    @pmi0("created_by")
    private final UserId createdBy;

    @pmi0("date")
    private final int date;

    @pmi0("debug_info")
    private final NewsfeedItemDebugInfoDto debugInfo;

    @pmi0("deleted_details")
    private final String deletedDetails;

    @pmi0("deleted_reason")
    private final String deletedReason;

    @pmi0("donut")
    private final WallWallpostDonutDto donut;

    @pmi0("donut_badge_info")
    private final BadgesDonutInfoDto donutBadgeInfo;

    @pmi0("donut_miniapp_url")
    private final String donutMiniappUrl;

    @pmi0("edited")
    private final Integer edited;

    @pmi0("facebook_export")
    private final Integer facebookExport;

    @pmi0("feedback")
    private final NewsfeedItemWallpostFeedbackDto feedback;

    @pmi0("final_post")
    private final BaseBoolIntDto finalPost;

    @pmi0("friends_only")
    private final BaseBoolIntDto friendsOnly;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("geo")
    private final WallGeoDto geo;

    @pmi0("has_market_link")
    private final Boolean hasMarketLink;

    @pmi0("has_translation")
    private final Boolean hasTranslation;

    @pmi0("has_video_autoplay")
    private final Boolean hasVideoAutoplay;

    @pmi0("hash")
    private final String hash;

    @pmi0("header")
    private final NewsfeedNewsfeedItemHeaderDto header;

    @pmi0("hide_likes")
    private final Boolean hideLikes;

    @pmi0("id")
    private final Integer id;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("is_added_to_main_tab")
    private final Boolean isAddedToMainTab;

    @pmi0("is_archived")
    private final Boolean isArchived;

    @pmi0("is_blacklisted")
    private final Boolean isBlacklisted;

    @pmi0("is_deleted")
    private final Boolean isDeleted;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_from_private_group")
    private final Boolean isFromPrivateGroup;

    @pmi0("is_pinned")
    private final BaseBoolIntDto isPinned;

    @pmi0("is_promoted_post_stealth")
    private final Boolean isPromotedPostStealth;

    @pmi0("keep_offline")
    private final Boolean keepOffline;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

    @pmi0("marked_as_ads")
    private final BaseBoolIntDto markedAsAds;

    @pmi0("marked_as_author_ad")
    private final Boolean markedAsAuthorAd;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("parents_stack")
    private final List<Integer> parentsStack;

    @pmi0("post_author_data")
    private final WallWallpostAuthorDataDto postAuthorData;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("post_source")
    private final WallPostSourceDto postSource;

    @pmi0("post_type")
    private final WallPostTypeDto postType;

    @pmi0("poster")
    private final WallPosterDto poster;

    @pmi0("postponed_id")
    private final Integer postponedId;

    @pmi0("push_subscription")
    private final NewsfeedPushSubscriptionDto pushSubscription;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final WallWallpostRatingDto rating;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reactions")
    private final LikesItemReactionsDto reactions;

    @pmi0("reply_count")
    private final Integer replyCount;

    @pmi0("reply_owner_id")
    private final UserId replyOwnerId;

    @pmi0("reply_post_id")
    private final Integer replyPostId;

    @pmi0("reply_to")
    private final UserId replyTo;

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0("research")
    private final NewsfeedMediascopeResearchDto research;

    @pmi0("share_url")
    private final String shareUrl;

    @pmi0("sharing")
    private final WallSharingDto sharing;

    @pmi0("short_attach_count")
    private final Integer shortAttachCount;

    @pmi0("short_text_rate")
    private final Float shortTextRate;

    @pmi0("signer_id")
    private final UserId signerId;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("suggest_subscribe")
    private final Boolean suggestSubscribe;

    @pmi0("text")
    private final String text;

    @pmi0("thumbs_max_height")
    private final Float thumbsMaxHeight;

    @pmi0("to_id")
    private final UserId toId;

    @pmi0("topic_id")
    private final TopicIdDto topicId;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("translation_lang")
    private final String translationLang;

    @pmi0("trending")
    private final Boolean trending;

    @pmi0("twitter_export")
    private final Integer twitterExport;

    @pmi0("type")
    private final NewsfeedNewsfeedItemTypeDto type;

    @pmi0("views")
    private final WallViewsDto views;

    @pmi0("zoom_text")
    private final Boolean zoomText;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemWallpostDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("wall_wallpost")
        public static final InnerTypeDto WALL_WALLPOST;
        private final String value;

        /* compiled from: NewsfeedItemWallpostDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("WALL_WALLPOST", 0, "wall_wallpost");
            WALL_WALLPOST = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
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
    /* compiled from: NewsfeedItemWallpostDto.kt */
    public static final class TopicIdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TopicIdDto[] $VALUES;

        @pmi0("1")
        public static final TopicIdDto ART;
        public static final Parcelable.Creator<TopicIdDto> CREATOR;

        @pmi0("0")
        public static final TopicIdDto EMPTY_TOPIC;

        @pmi0("43")
        public static final TopicIdDto FASHION;

        @pmi0("12")
        public static final TopicIdDto GAMES;

        @pmi0("32")
        public static final TopicIdDto HUMOR;

        @pmi0(Gc.e)
        public static final TopicIdDto IT;

        @pmi0("16")
        public static final TopicIdDto MUSIC;

        @pmi0("19")
        public static final TopicIdDto PHOTO;

        @pmi0("21")
        public static final TopicIdDto SCIENCE_AND_TECH;

        @pmi0("23")
        public static final TopicIdDto SPORT;

        @pmi0("25")
        public static final TopicIdDto TRAVEL;

        @pmi0("26")
        public static final TopicIdDto TV_AND_CINEMA;
        private final int value;

        /* compiled from: NewsfeedItemWallpostDto.kt */
        public static final class a implements Parcelable.Creator<TopicIdDto> {
            @Override // android.os.Parcelable.Creator
            public final TopicIdDto createFromParcel(Parcel parcel) {
                return TopicIdDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TopicIdDto[] newArray(int i) {
                return new TopicIdDto[i];
            }
        }

        static {
            TopicIdDto topicIdDto = new TopicIdDto("EMPTY_TOPIC", 0, 0);
            EMPTY_TOPIC = topicIdDto;
            TopicIdDto topicIdDto2 = new TopicIdDto("ART", 1, 1);
            ART = topicIdDto2;
            TopicIdDto topicIdDto3 = new TopicIdDto("IT", 2, 7);
            IT = topicIdDto3;
            TopicIdDto topicIdDto4 = new TopicIdDto("GAMES", 3, 12);
            GAMES = topicIdDto4;
            TopicIdDto topicIdDto5 = new TopicIdDto("MUSIC", 4, 16);
            MUSIC = topicIdDto5;
            TopicIdDto topicIdDto6 = new TopicIdDto("PHOTO", 5, 19);
            PHOTO = topicIdDto6;
            TopicIdDto topicIdDto7 = new TopicIdDto("SCIENCE_AND_TECH", 6, 21);
            SCIENCE_AND_TECH = topicIdDto7;
            TopicIdDto topicIdDto8 = new TopicIdDto("SPORT", 7, 23);
            SPORT = topicIdDto8;
            TopicIdDto topicIdDto9 = new TopicIdDto("TRAVEL", 8, 25);
            TRAVEL = topicIdDto9;
            TopicIdDto topicIdDto10 = new TopicIdDto("TV_AND_CINEMA", 9, 26);
            TV_AND_CINEMA = topicIdDto10;
            TopicIdDto topicIdDto11 = new TopicIdDto("HUMOR", 10, 32);
            HUMOR = topicIdDto11;
            TopicIdDto topicIdDto12 = new TopicIdDto("FASHION", 11, 43);
            FASHION = topicIdDto12;
            TopicIdDto[] topicIdDtoArr = {topicIdDto, topicIdDto2, topicIdDto3, topicIdDto4, topicIdDto5, topicIdDto6, topicIdDto7, topicIdDto8, topicIdDto9, topicIdDto10, topicIdDto11, topicIdDto12};
            $VALUES = topicIdDtoArr;
            $ENTRIES = new asp(topicIdDtoArr);
            CREATOR = new a();
        }

        private TopicIdDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static TopicIdDto valueOf(String str) {
            return (TopicIdDto) Enum.valueOf(TopicIdDto.class, str);
        }

        public static TopicIdDto[] values() {
            return (TopicIdDto[]) $VALUES.clone();
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

    /* compiled from: NewsfeedItemWallpostDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemWallpostDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemWallpostDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto;
            WallWallpostAdsEasyPromoteDto createFromParcel;
            Boolean valueOf4;
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto;
            WallPostActivityDto wallPostActivityDto;
            ArrayList arrayList;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto;
            BaseBoolIntDto baseBoolIntDto;
            WallWallpostDonutDto createFromParcel2;
            Boolean valueOf5;
            BaseBoolIntDto baseBoolIntDto2;
            BaseCommentsInfoDto createFromParcel3;
            Boolean valueOf6;
            BaseBoolIntDto baseBoolIntDto3;
            AdsAdvertiserInfoDto createFromParcel4;
            Boolean valueOf7;
            AdsAdvertiserInfoDto adsAdvertiserInfoDto;
            WallWallpostRatingDto createFromParcel5;
            Boolean valueOf8;
            Boolean valueOf9;
            WallWallpostRatingDto wallWallpostRatingDto;
            WallWallpostCategoryActionDto createFromParcel6;
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto;
            TopicIdDto createFromParcel7;
            Boolean valueOf10;
            BaseBottomExtensionDto baseBottomExtensionDto;
            WallCoownersDto createFromParcel8;
            Boolean valueOf11;
            Boolean valueOf12;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            UserId userId;
            WallWallpostAuthorDataDto createFromParcel9;
            WallWallpostAuthorDataDto wallWallpostAuthorDataDto;
            NewsfeedMediascopeResearchDto createFromParcel10;
            Boolean valueOf17;
            Boolean valueOf18;
            Boolean valueOf19;
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto;
            ArrayList arrayList2;
            ArrayList arrayList3;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto2;
            WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean valueOf20;
            BaseBoolIntDto baseBoolIntDto4;
            WallPostCopyrightDto createFromParcel11;
            Boolean valueOf21;
            Boolean valueOf22;
            LikesItemReactionsDto likesItemReactionsDto;
            BadgesObjectInfoDto createFromParcel12;
            UserId userId2;
            WallPosterDto createFromParcel13;
            WallPosterDto wallPosterDto;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Integer num;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto3 = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            UserId userId3 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            int readInt = parcel.readInt();
            InnerTypeDto createFromParcel14 = InnerTypeDto.CREATOR.createFromParcel(parcel);
            Float valueOf23 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            NewsfeedNewsfeedItemHeaderDto createFromParcel15 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel);
            Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            WallPostActivityDto wallPostActivityDto2 = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            Float valueOf25 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            Boolean bool = valueOf;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto2 = (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                newsfeedItemDebugInfoDto = newsfeedItemDebugInfoDto2;
                createFromParcel = null;
            } else {
                newsfeedItemDebugInfoDto = newsfeedItemDebugInfoDto2;
                createFromParcel = WallWallpostAdsEasyPromoteDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                wallWallpostAdsEasyPromoteDto = wallWallpostAdsEasyPromoteDto2;
                wallPostActivityDto = wallPostActivityDto2;
                newsfeedNewsfeedItemTypeDto = newsfeedNewsfeedItemTypeDto3;
                arrayList = null;
            } else {
                wallWallpostAdsEasyPromoteDto = wallWallpostAdsEasyPromoteDto2;
                int readInt2 = parcel.readInt();
                wallPostActivityDto = wallPostActivityDto2;
                arrayList = new ArrayList(readInt2);
                newsfeedNewsfeedItemTypeDto = newsfeedNewsfeedItemTypeDto3;
                int i = 0;
                while (i != readInt2) {
                    i = en.a(WallWallpostFullDto.CREATOR, parcel, arrayList, i, 1);
                    readInt2 = readInt2;
                    userId3 = userId3;
                }
            }
            UserId userId4 = userId3;
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            UserId userId5 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto8;
                createFromParcel2 = null;
            } else {
                baseBoolIntDto = baseBoolIntDto8;
                createFromParcel2 = WallWallpostDonutDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostDonutDto wallWallpostDonutDto = createFromParcel2;
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto12;
                createFromParcel3 = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto12;
                createFromParcel3 = BaseCommentsInfoDto.CREATOR.createFromParcel(parcel);
            }
            BaseCommentsInfoDto baseCommentsInfoDto = createFromParcel3;
            BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                baseBoolIntDto3 = baseBoolIntDto13;
                createFromParcel4 = null;
            } else {
                baseBoolIntDto3 = baseBoolIntDto13;
                createFromParcel4 = AdsAdvertiserInfoDto.CREATOR.createFromParcel(parcel);
            }
            AdsAdvertiserInfoDto adsAdvertiserInfoDto2 = createFromParcel4;
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                adsAdvertiserInfoDto = adsAdvertiserInfoDto2;
                createFromParcel5 = null;
            } else {
                adsAdvertiserInfoDto = adsAdvertiserInfoDto2;
                createFromParcel5 = WallWallpostRatingDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostRatingDto wallWallpostRatingDto2 = createFromParcel5;
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
                wallWallpostRatingDto = wallWallpostRatingDto2;
                createFromParcel6 = null;
            } else {
                wallWallpostRatingDto = wallWallpostRatingDto2;
                createFromParcel6 = WallWallpostCategoryActionDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto2 = createFromParcel6;
            if (parcel.readInt() == 0) {
                wallWallpostCategoryActionDto = wallWallpostCategoryActionDto2;
                createFromParcel7 = null;
            } else {
                wallWallpostCategoryActionDto = wallWallpostCategoryActionDto2;
                createFromParcel7 = TopicIdDto.CREATOR.createFromParcel(parcel);
            }
            TopicIdDto topicIdDto = createFromParcel7;
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBottomExtensionDto baseBottomExtensionDto2 = (BaseBottomExtensionDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBottomExtensionDto = baseBottomExtensionDto2;
                createFromParcel8 = null;
            } else {
                baseBottomExtensionDto = baseBottomExtensionDto2;
                createFromParcel8 = WallCoownersDto.CREATOR.createFromParcel(parcel);
            }
            WallCoownersDto wallCoownersDto = createFromParcel8;
            Boolean bool2 = valueOf3;
            Boolean bool3 = valueOf2;
            WallPostActivityDto wallPostActivityDto3 = wallPostActivityDto;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto4 = newsfeedNewsfeedItemTypeDto;
            BaseBoolIntDto baseBoolIntDto14 = baseBoolIntDto;
            Boolean bool4 = valueOf6;
            AdsAdvertiserInfoDto adsAdvertiserInfoDto3 = adsAdvertiserInfoDto;
            Boolean bool5 = valueOf8;
            Boolean bool6 = valueOf9;
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto3 = wallWallpostCategoryActionDto;
            Boolean bool7 = valueOf10;
            BaseBottomExtensionDto baseBottomExtensionDto3 = baseBottomExtensionDto;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object readValue = parcel.readValue(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf14 = null;
            } else {
                valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UserId userId6 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf15 = null;
            } else {
                valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf16 = null;
            } else {
                valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                userId = userId6;
                createFromParcel9 = null;
            } else {
                userId = userId6;
                createFromParcel9 = WallWallpostAuthorDataDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostAuthorDataDto wallWallpostAuthorDataDto2 = createFromParcel9;
            if (parcel.readInt() == 0) {
                wallWallpostAuthorDataDto = wallWallpostAuthorDataDto2;
                createFromParcel10 = null;
            } else {
                wallWallpostAuthorDataDto = wallWallpostAuthorDataDto2;
                createFromParcel10 = NewsfeedMediascopeResearchDto.CREATOR.createFromParcel(parcel);
            }
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto2 = createFromParcel10;
            if (parcel.readInt() == 0) {
                valueOf17 = null;
            } else {
                valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf18 = null;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString6 = parcel.readString();
            Boolean bool8 = valueOf11;
            Integer num2 = valueOf28;
            Integer num3 = valueOf29;
            Integer num4 = valueOf30;
            Boolean bool9 = valueOf12;
            Boolean bool10 = valueOf13;
            Boolean bool11 = valueOf15;
            Boolean bool12 = valueOf16;
            WallWallpostAuthorDataDto wallWallpostAuthorDataDto3 = wallWallpostAuthorDataDto;
            Boolean bool13 = valueOf17;
            Boolean bool14 = valueOf18;
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf19 = null;
            } else {
                valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString8 = parcel.readString();
            Boolean bool15 = valueOf19;
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                newsfeedMediascopeResearchDto = newsfeedMediascopeResearchDto2;
                arrayList2 = arrayList;
                newsfeedNewsfeedItemTypeDto2 = newsfeedNewsfeedItemTypeDto4;
                arrayList3 = null;
            } else {
                newsfeedMediascopeResearchDto = newsfeedMediascopeResearchDto2;
                int readInt3 = parcel.readInt();
                arrayList2 = arrayList;
                arrayList3 = new ArrayList(readInt3);
                newsfeedNewsfeedItemTypeDto2 = newsfeedNewsfeedItemTypeDto4;
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = bo.b(NewsfeedItemWallpostDto.class, parcel, arrayList3, i2, 1);
                    readInt3 = readInt3;
                }
            }
            WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto2 = (WallWallpostAttachmentsMetaDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
                arrayList5 = arrayList3;
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
                arrayList4 = new ArrayList(readInt4);
                arrayList5 = arrayList3;
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = bo.b(NewsfeedItemWallpostDto.class, parcel, arrayList4, i3, 1);
                    readInt4 = readInt4;
                }
            }
            Integer valueOf31 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BadgesCommentInfoDto badgesCommentInfoDto = (BadgesCommentInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            BadgesDonutInfoDto badgesDonutInfoDto = (BadgesDonutInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf20 = null;
            } else {
                valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseBoolIntDto4 = baseBoolIntDto15;
                createFromParcel11 = null;
            } else {
                baseBoolIntDto4 = baseBoolIntDto15;
                createFromParcel11 = WallPostCopyrightDto.CREATOR.createFromParcel(parcel);
            }
            WallPostCopyrightDto wallPostCopyrightDto = createFromParcel11;
            Integer valueOf32 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId7 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            WallGeoDto wallGeoDto = (WallGeoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            Integer valueOf33 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf21 = null;
            } else {
                valueOf21 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf22 = null;
            } else {
                valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseLikesInfoDto baseLikesInfoDto = (BaseLikesInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            ArrayList arrayList8 = arrayList5;
            String readString11 = parcel.readString();
            LikesItemReactionsDto likesItemReactionsDto2 = (LikesItemReactionsDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                likesItemReactionsDto = likesItemReactionsDto2;
                createFromParcel12 = null;
            } else {
                likesItemReactionsDto = likesItemReactionsDto2;
                createFromParcel12 = BadgesObjectInfoDto.CREATOR.createFromParcel(parcel);
            }
            BadgesObjectInfoDto badgesObjectInfoDto = createFromParcel12;
            UserId userId8 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            UserId userId9 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            Integer valueOf34 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId10 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                userId2 = userId10;
                createFromParcel13 = null;
            } else {
                userId2 = userId10;
                createFromParcel13 = WallPosterDto.CREATOR.createFromParcel(parcel);
            }
            WallPosterDto wallPosterDto2 = createFromParcel13;
            Integer valueOf35 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                wallPosterDto = wallPosterDto2;
                arrayList6 = arrayList4;
                num = valueOf31;
                arrayList7 = null;
            } else {
                wallPosterDto = wallPosterDto2;
                int readInt5 = parcel.readInt();
                arrayList6 = arrayList4;
                arrayList7 = new ArrayList(readInt5);
                num = valueOf31;
                int i4 = 0;
                while (i4 != readInt5) {
                    i4 = pm0.b(parcel, arrayList7, i4, 1);
                    readInt5 = readInt5;
                }
            }
            return new NewsfeedItemWallpostDto(newsfeedNewsfeedItemTypeDto2, userId4, readInt, createFromParcel14, valueOf23, createFromParcel15, valueOf24, bool, newsfeedNewsfeedItemCaptionDto, bool3, readString, wallPostActivityDto3, valueOf25, newsfeedPushSubscriptionDto, bool2, newsfeedItemWallpostFeedbackDto, newsfeedItemDebugInfoDto, wallWallpostAdsEasyPromoteDto, valueOf4, arrayList2, baseBoolIntDto5, userId5, baseBoolIntDto6, baseBoolIntDto7, baseBoolIntDto14, wallWallpostDonutDto, baseBoolIntDto9, baseBoolIntDto10, baseBoolIntDto11, valueOf5, baseBoolIntDto2, baseCommentsInfoDto, baseBoolIntDto3, bool4, adsAdvertiserInfoDto3, valueOf7, wallWallpostRatingDto, bool5, bool6, wallWallpostCategoryActionDto3, topicIdDto, bool7, baseBottomExtensionDto3, valueOf26, valueOf27, wallCoownersDto, readString2, readString3, readString4, readString5, bool8, num2, num3, num4, bool9, bool10, readValue, valueOf14, userId, bool11, bool12, wallWallpostAuthorDataDto3, newsfeedMediascopeResearchDto, bool13, bool14, readString6, readString7, bool15, readString8, readString9, readString10, arrayList8, wallWallpostAttachmentsMetaDto, arrayList6, num, badgesCommentInfoDto, badgesDonutInfoDto, valueOf20, baseBoolIntDto4, wallPostCopyrightDto, valueOf32, userId7, wallGeoDto, valueOf33, valueOf21, valueOf22, baseLikesInfoDto, readString11, likesItemReactionsDto, badgesObjectInfoDto, userId8, userId9, valueOf34, userId2, wallPosterDto, valueOf35, arrayList7, parcel.readInt() == 0 ? null : WallPostSourceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallPostTypeDto.CREATOR.createFromParcel(parcel), (BaseRepostsInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader()), (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : WallViewsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : WallSharingDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemWallpostDto[] newArray(int i) {
            return new NewsfeedItemWallpostDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemWallpostDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, InnerTypeDto innerTypeDto, Float f, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f2, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool4, List<WallWallpostFullDto> list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool5, BaseBoolIntDto baseBoolIntDto8, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool6, AdsAdvertiserInfoDto adsAdvertiserInfoDto, Boolean bool7, WallWallpostRatingDto wallWallpostRatingDto, Boolean bool8, Boolean bool9, WallWallpostCategoryActionDto wallWallpostCategoryActionDto, TopicIdDto topicIdDto, Boolean bool10, BaseBottomExtensionDto baseBottomExtensionDto, Integer num2, Integer num3, WallCoownersDto wallCoownersDto, String str2, String str3, String str4, String str5, Boolean bool11, Integer num4, Integer num5, Integer num6, Boolean bool12, Boolean bool13, Object obj, Boolean bool14, UserId userId3, Boolean bool15, Boolean bool16, WallWallpostAuthorDataDto wallWallpostAuthorDataDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool17, Boolean bool18, String str6, String str7, Boolean bool19, String str8, String str9, String str10, List<WallWallpostAttachmentDto> list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List<? extends WallWallpostContentLayoutItemDto> list3, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool20, BaseBoolIntDto baseBoolIntDto10, WallPostCopyrightDto wallPostCopyrightDto, Integer num8, UserId userId4, WallGeoDto wallGeoDto, Integer num9, Boolean bool21, Boolean bool22, BaseLikesInfoDto baseLikesInfoDto, String str11, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, UserId userId5, UserId userId6, Integer num10, UserId userId7, WallPosterDto wallPosterDto, Integer num11, List<Integer> list4, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId8, String str12, WallViewsDto wallViewsDto, Integer num12, WallSharingDto wallSharingDto) {
        this.type = newsfeedNewsfeedItemTypeDto;
        this.sourceId = userId;
        this.date = i;
        this.innerType = innerTypeDto;
        this.thumbsMaxHeight = f;
        this.header = newsfeedNewsfeedItemHeaderDto;
        this.carouselOffset = num;
        this.canIgnore = bool;
        this.caption = newsfeedNewsfeedItemCaptionDto;
        this.keepOffline = bool2;
        this.trackCode = str;
        this.activity = wallPostActivityDto;
        this.shortTextRate = f2;
        this.pushSubscription = newsfeedPushSubscriptionDto;
        this.suggestSubscribe = bool3;
        this.feedback = newsfeedItemWallpostFeedbackDto;
        this.debugInfo = newsfeedItemDebugInfoDto;
        this.adsEasyPromote = wallWallpostAdsEasyPromoteDto;
        this.adsEasyPromoteThreeDots = bool4;
        this.copyHistory = list;
        this.canEdit = baseBoolIntDto;
        this.createdBy = userId2;
        this.canDelete = baseBoolIntDto2;
        this.canPublish = baseBoolIntDto3;
        this.canPin = baseBoolIntDto4;
        this.donut = wallWallpostDonutDto;
        this.friendsOnly = baseBoolIntDto5;
        this.bestFriendsOnly = baseBoolIntDto6;
        this.finalPost = baseBoolIntDto7;
        this.checkSign = bool5;
        this.isPinned = baseBoolIntDto8;
        this.comments = baseCommentsInfoDto;
        this.markedAsAds = baseBoolIntDto9;
        this.markedAsAuthorAd = bool6;
        this.authorAd = adsAdvertiserInfoDto;
        this.zoomText = bool7;
        this.rating = wallWallpostRatingDto;
        this.canSetCategory = bool8;
        this.canDoubtCategory = bool9;
        this.categoryAction = wallWallpostCategoryActionDto;
        this.topicId = topicIdDto;
        this.trending = bool10;
        this.bottomExtension = baseBottomExtensionDto;
        this.shortAttachCount = num2;
        this.compactAttachmentsBeforeCut = num3;
        this.coowners = wallCoownersDto;
        this.hash = str2;
        this.adData = str3;
        this.adModerationChecksum = str4;
        this.translationLang = str5;
        this.hasTranslation = bool11;
        this.facebookExport = num4;
        this.twitterExport = num5;
        this.postponedId = num6;
        this.isPromotedPostStealth = bool12;
        this.hasVideoAutoplay = bool13;
        this.awayParams = obj;
        this.hideLikes = bool14;
        this.toId = userId3;
        this.hasMarketLink = bool15;
        this.isFromPrivateGroup = bool16;
        this.postAuthorData = wallWallpostAuthorDataDto;
        this.research = newsfeedMediascopeResearchDto;
        this.isAddedToMainTab = bool17;
        this.isBlacklisted = bool18;
        this.shareUrl = str6;
        this.accessKey = str7;
        this.isDeleted = bool19;
        this.deletedReason = str8;
        this.deletedDetails = str9;
        this.donutMiniappUrl = str10;
        this.attachments = list2;
        this.attachmentsMeta = wallWallpostAttachmentsMetaDto;
        this.contentLayout = list3;
        this.badgeId = num7;
        this.badgeInfo = badgesCommentInfoDto;
        this.donutBadgeInfo = badgesDonutInfoDto;
        this.canArchive = bool20;
        this.canViewStats = baseBoolIntDto10;
        this.copyright = wallPostCopyrightDto;
        this.edited = num8;
        this.fromId = userId4;
        this.geo = wallGeoDto;
        this.id = num9;
        this.isArchived = bool21;
        this.isFavorite = bool22;
        this.likes = baseLikesInfoDto;
        this.reactionSetId = str11;
        this.reactions = likesItemReactionsDto;
        this.badges = badgesObjectInfoDto;
        this.ownerId = userId5;
        this.replyOwnerId = userId6;
        this.replyPostId = num10;
        this.replyTo = userId7;
        this.poster = wallPosterDto;
        this.postId = num11;
        this.parentsStack = list4;
        this.postSource = wallPostSourceDto;
        this.postType = wallPostTypeDto;
        this.reposts = baseRepostsInfoDto;
        this.signerId = userId8;
        this.text = str12;
        this.views = wallViewsDto;
        this.replyCount = num12;
        this.sharing = wallSharingDto;
    }

    public final Integer d() {
        return this.carouselOffset;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemWallpostDto)) {
            return false;
        }
        NewsfeedItemWallpostDto newsfeedItemWallpostDto = (NewsfeedItemWallpostDto) obj;
        return this.type == newsfeedItemWallpostDto.type && epx.f(this.sourceId, newsfeedItemWallpostDto.sourceId) && this.date == newsfeedItemWallpostDto.date && this.innerType == newsfeedItemWallpostDto.innerType && epx.f(this.thumbsMaxHeight, newsfeedItemWallpostDto.thumbsMaxHeight) && epx.f(this.header, newsfeedItemWallpostDto.header) && epx.f(this.carouselOffset, newsfeedItemWallpostDto.carouselOffset) && epx.f(this.canIgnore, newsfeedItemWallpostDto.canIgnore) && epx.f(this.caption, newsfeedItemWallpostDto.caption) && epx.f(this.keepOffline, newsfeedItemWallpostDto.keepOffline) && epx.f(this.trackCode, newsfeedItemWallpostDto.trackCode) && epx.f(this.activity, newsfeedItemWallpostDto.activity) && epx.f(this.shortTextRate, newsfeedItemWallpostDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemWallpostDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemWallpostDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemWallpostDto.feedback) && epx.f(this.debugInfo, newsfeedItemWallpostDto.debugInfo) && epx.f(this.adsEasyPromote, newsfeedItemWallpostDto.adsEasyPromote) && epx.f(this.adsEasyPromoteThreeDots, newsfeedItemWallpostDto.adsEasyPromoteThreeDots) && epx.f(this.copyHistory, newsfeedItemWallpostDto.copyHistory) && this.canEdit == newsfeedItemWallpostDto.canEdit && epx.f(this.createdBy, newsfeedItemWallpostDto.createdBy) && this.canDelete == newsfeedItemWallpostDto.canDelete && this.canPublish == newsfeedItemWallpostDto.canPublish && this.canPin == newsfeedItemWallpostDto.canPin && epx.f(this.donut, newsfeedItemWallpostDto.donut) && this.friendsOnly == newsfeedItemWallpostDto.friendsOnly && this.bestFriendsOnly == newsfeedItemWallpostDto.bestFriendsOnly && this.finalPost == newsfeedItemWallpostDto.finalPost && epx.f(this.checkSign, newsfeedItemWallpostDto.checkSign) && this.isPinned == newsfeedItemWallpostDto.isPinned && epx.f(this.comments, newsfeedItemWallpostDto.comments) && this.markedAsAds == newsfeedItemWallpostDto.markedAsAds && epx.f(this.markedAsAuthorAd, newsfeedItemWallpostDto.markedAsAuthorAd) && epx.f(this.authorAd, newsfeedItemWallpostDto.authorAd) && epx.f(this.zoomText, newsfeedItemWallpostDto.zoomText) && epx.f(this.rating, newsfeedItemWallpostDto.rating) && epx.f(this.canSetCategory, newsfeedItemWallpostDto.canSetCategory) && epx.f(this.canDoubtCategory, newsfeedItemWallpostDto.canDoubtCategory) && epx.f(this.categoryAction, newsfeedItemWallpostDto.categoryAction) && this.topicId == newsfeedItemWallpostDto.topicId && epx.f(this.trending, newsfeedItemWallpostDto.trending) && epx.f(this.bottomExtension, newsfeedItemWallpostDto.bottomExtension) && epx.f(this.shortAttachCount, newsfeedItemWallpostDto.shortAttachCount) && epx.f(this.compactAttachmentsBeforeCut, newsfeedItemWallpostDto.compactAttachmentsBeforeCut) && epx.f(this.coowners, newsfeedItemWallpostDto.coowners) && epx.f(this.hash, newsfeedItemWallpostDto.hash) && epx.f(this.adData, newsfeedItemWallpostDto.adData) && epx.f(this.adModerationChecksum, newsfeedItemWallpostDto.adModerationChecksum) && epx.f(this.translationLang, newsfeedItemWallpostDto.translationLang) && epx.f(this.hasTranslation, newsfeedItemWallpostDto.hasTranslation) && epx.f(this.facebookExport, newsfeedItemWallpostDto.facebookExport) && epx.f(this.twitterExport, newsfeedItemWallpostDto.twitterExport) && epx.f(this.postponedId, newsfeedItemWallpostDto.postponedId) && epx.f(this.isPromotedPostStealth, newsfeedItemWallpostDto.isPromotedPostStealth) && epx.f(this.hasVideoAutoplay, newsfeedItemWallpostDto.hasVideoAutoplay) && epx.f(this.awayParams, newsfeedItemWallpostDto.awayParams) && epx.f(this.hideLikes, newsfeedItemWallpostDto.hideLikes) && epx.f(this.toId, newsfeedItemWallpostDto.toId) && epx.f(this.hasMarketLink, newsfeedItemWallpostDto.hasMarketLink) && epx.f(this.isFromPrivateGroup, newsfeedItemWallpostDto.isFromPrivateGroup) && epx.f(this.postAuthorData, newsfeedItemWallpostDto.postAuthorData) && epx.f(this.research, newsfeedItemWallpostDto.research) && epx.f(this.isAddedToMainTab, newsfeedItemWallpostDto.isAddedToMainTab) && epx.f(this.isBlacklisted, newsfeedItemWallpostDto.isBlacklisted) && epx.f(this.shareUrl, newsfeedItemWallpostDto.shareUrl) && epx.f(this.accessKey, newsfeedItemWallpostDto.accessKey) && epx.f(this.isDeleted, newsfeedItemWallpostDto.isDeleted) && epx.f(this.deletedReason, newsfeedItemWallpostDto.deletedReason) && epx.f(this.deletedDetails, newsfeedItemWallpostDto.deletedDetails) && epx.f(this.donutMiniappUrl, newsfeedItemWallpostDto.donutMiniappUrl) && epx.f(this.attachments, newsfeedItemWallpostDto.attachments) && epx.f(this.attachmentsMeta, newsfeedItemWallpostDto.attachmentsMeta) && epx.f(this.contentLayout, newsfeedItemWallpostDto.contentLayout) && epx.f(this.badgeId, newsfeedItemWallpostDto.badgeId) && epx.f(this.badgeInfo, newsfeedItemWallpostDto.badgeInfo) && epx.f(this.donutBadgeInfo, newsfeedItemWallpostDto.donutBadgeInfo) && epx.f(this.canArchive, newsfeedItemWallpostDto.canArchive) && this.canViewStats == newsfeedItemWallpostDto.canViewStats && epx.f(this.copyright, newsfeedItemWallpostDto.copyright) && epx.f(this.edited, newsfeedItemWallpostDto.edited) && epx.f(this.fromId, newsfeedItemWallpostDto.fromId) && epx.f(this.geo, newsfeedItemWallpostDto.geo) && epx.f(this.id, newsfeedItemWallpostDto.id) && epx.f(this.isArchived, newsfeedItemWallpostDto.isArchived) && epx.f(this.isFavorite, newsfeedItemWallpostDto.isFavorite) && epx.f(this.likes, newsfeedItemWallpostDto.likes) && epx.f(this.reactionSetId, newsfeedItemWallpostDto.reactionSetId) && epx.f(this.reactions, newsfeedItemWallpostDto.reactions) && epx.f(this.badges, newsfeedItemWallpostDto.badges) && epx.f(this.ownerId, newsfeedItemWallpostDto.ownerId) && epx.f(this.replyOwnerId, newsfeedItemWallpostDto.replyOwnerId) && epx.f(this.replyPostId, newsfeedItemWallpostDto.replyPostId) && epx.f(this.replyTo, newsfeedItemWallpostDto.replyTo) && epx.f(this.poster, newsfeedItemWallpostDto.poster) && epx.f(this.postId, newsfeedItemWallpostDto.postId) && epx.f(this.parentsStack, newsfeedItemWallpostDto.parentsStack) && epx.f(this.postSource, newsfeedItemWallpostDto.postSource) && this.postType == newsfeedItemWallpostDto.postType && epx.f(this.reposts, newsfeedItemWallpostDto.reposts) && epx.f(this.signerId, newsfeedItemWallpostDto.signerId) && epx.f(this.text, newsfeedItemWallpostDto.text) && epx.f(this.views, newsfeedItemWallpostDto.views) && epx.f(this.replyCount, newsfeedItemWallpostDto.replyCount) && epx.f(this.sharing, newsfeedItemWallpostDto.sharing);
    }

    public final Integer f() {
        return this.id;
    }

    public final Integer g() {
        return this.postId;
    }

    public final int hashCode() {
        int hashCode = (this.innerType.hashCode() + shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31)) * 31;
        Float f = this.thumbsMaxHeight;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
        int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
        Integer num = this.carouselOffset;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canIgnore;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
        int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
        Boolean bool2 = this.keepOffline;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        WallPostActivityDto wallPostActivityDto = this.activity;
        int hashCode9 = (hashCode8 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
        Float f2 = this.shortTextRate;
        int hashCode10 = (hashCode9 + (f2 == null ? 0 : f2.hashCode())) * 31;
        NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
        int hashCode11 = (hashCode10 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
        Boolean bool3 = this.suggestSubscribe;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        int hashCode13 = (hashCode12 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
        NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
        int hashCode14 = (hashCode13 + (newsfeedItemDebugInfoDto == null ? 0 : newsfeedItemDebugInfoDto.hashCode())) * 31;
        WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
        int hashCode15 = (hashCode14 + (wallWallpostAdsEasyPromoteDto == null ? 0 : wallWallpostAdsEasyPromoteDto.hashCode())) * 31;
        Boolean bool4 = this.adsEasyPromoteThreeDots;
        int hashCode16 = (hashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<WallWallpostFullDto> list = this.copyHistory;
        int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        int hashCode18 = (hashCode17 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        UserId userId = this.createdBy;
        int hashCode19 = (hashCode18 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
        int hashCode20 = (hashCode19 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canPublish;
        int hashCode21 = (hashCode20 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canPin;
        int hashCode22 = (hashCode21 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        WallWallpostDonutDto wallWallpostDonutDto = this.donut;
        int hashCode23 = (hashCode22 + (wallWallpostDonutDto == null ? 0 : wallWallpostDonutDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.friendsOnly;
        int hashCode24 = (hashCode23 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.bestFriendsOnly;
        int hashCode25 = (hashCode24 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.finalPost;
        int hashCode26 = (hashCode25 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        Boolean bool5 = this.checkSign;
        int hashCode27 = (hashCode26 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.isPinned;
        int hashCode28 = (hashCode27 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
        int hashCode29 = (hashCode28 + (baseCommentsInfoDto == null ? 0 : baseCommentsInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.markedAsAds;
        int hashCode30 = (hashCode29 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        Boolean bool6 = this.markedAsAuthorAd;
        int hashCode31 = (hashCode30 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.authorAd;
        int hashCode32 = (hashCode31 + (adsAdvertiserInfoDto == null ? 0 : adsAdvertiserInfoDto.hashCode())) * 31;
        Boolean bool7 = this.zoomText;
        int hashCode33 = (hashCode32 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        WallWallpostRatingDto wallWallpostRatingDto = this.rating;
        int hashCode34 = (hashCode33 + (wallWallpostRatingDto == null ? 0 : wallWallpostRatingDto.hashCode())) * 31;
        Boolean bool8 = this.canSetCategory;
        int hashCode35 = (hashCode34 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canDoubtCategory;
        int hashCode36 = (hashCode35 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        WallWallpostCategoryActionDto wallWallpostCategoryActionDto = this.categoryAction;
        int hashCode37 = (hashCode36 + (wallWallpostCategoryActionDto == null ? 0 : wallWallpostCategoryActionDto.hashCode())) * 31;
        TopicIdDto topicIdDto = this.topicId;
        int hashCode38 = (hashCode37 + (topicIdDto == null ? 0 : topicIdDto.hashCode())) * 31;
        Boolean bool10 = this.trending;
        int hashCode39 = (hashCode38 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        BaseBottomExtensionDto baseBottomExtensionDto = this.bottomExtension;
        int hashCode40 = (hashCode39 + (baseBottomExtensionDto == null ? 0 : baseBottomExtensionDto.hashCode())) * 31;
        Integer num2 = this.shortAttachCount;
        int hashCode41 = (hashCode40 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.compactAttachmentsBeforeCut;
        int hashCode42 = (hashCode41 + (num3 == null ? 0 : num3.hashCode())) * 31;
        WallCoownersDto wallCoownersDto = this.coowners;
        int hashCode43 = (hashCode42 + (wallCoownersDto == null ? 0 : wallCoownersDto.hashCode())) * 31;
        String str2 = this.hash;
        int hashCode44 = (hashCode43 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adData;
        int hashCode45 = (hashCode44 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adModerationChecksum;
        int hashCode46 = (hashCode45 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.translationLang;
        int hashCode47 = (hashCode46 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool11 = this.hasTranslation;
        int hashCode48 = (hashCode47 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Integer num4 = this.facebookExport;
        int hashCode49 = (hashCode48 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.twitterExport;
        int hashCode50 = (hashCode49 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.postponedId;
        int hashCode51 = (hashCode50 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool12 = this.isPromotedPostStealth;
        int hashCode52 = (hashCode51 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.hasVideoAutoplay;
        int hashCode53 = (hashCode52 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Object obj = this.awayParams;
        int hashCode54 = (hashCode53 + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool14 = this.hideLikes;
        int hashCode55 = (hashCode54 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        UserId userId2 = this.toId;
        int hashCode56 = (hashCode55 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Boolean bool15 = this.hasMarketLink;
        int hashCode57 = (hashCode56 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.isFromPrivateGroup;
        int hashCode58 = (hashCode57 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        WallWallpostAuthorDataDto wallWallpostAuthorDataDto = this.postAuthorData;
        int hashCode59 = (hashCode58 + (wallWallpostAuthorDataDto == null ? 0 : wallWallpostAuthorDataDto.hashCode())) * 31;
        NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
        int hashCode60 = (hashCode59 + (newsfeedMediascopeResearchDto == null ? 0 : newsfeedMediascopeResearchDto.hashCode())) * 31;
        Boolean bool17 = this.isAddedToMainTab;
        int hashCode61 = (hashCode60 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.isBlacklisted;
        int hashCode62 = (hashCode61 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        String str6 = this.shareUrl;
        int hashCode63 = (hashCode62 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.accessKey;
        int hashCode64 = (hashCode63 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool19 = this.isDeleted;
        int hashCode65 = (hashCode64 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        String str8 = this.deletedReason;
        int hashCode66 = (hashCode65 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.deletedDetails;
        int hashCode67 = (hashCode66 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.donutMiniappUrl;
        int hashCode68 = (hashCode67 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<WallWallpostAttachmentDto> list2 = this.attachments;
        int hashCode69 = (hashCode68 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = this.attachmentsMeta;
        int hashCode70 = (hashCode69 + (wallWallpostAttachmentsMetaDto == null ? 0 : wallWallpostAttachmentsMetaDto.hashCode())) * 31;
        List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
        int hashCode71 = (hashCode70 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num7 = this.badgeId;
        int hashCode72 = (hashCode71 + (num7 == null ? 0 : num7.hashCode())) * 31;
        BadgesCommentInfoDto badgesCommentInfoDto = this.badgeInfo;
        int hashCode73 = (hashCode72 + (badgesCommentInfoDto == null ? 0 : badgesCommentInfoDto.hashCode())) * 31;
        BadgesDonutInfoDto badgesDonutInfoDto = this.donutBadgeInfo;
        int hashCode74 = (hashCode73 + (badgesDonutInfoDto == null ? 0 : badgesDonutInfoDto.hashCode())) * 31;
        Boolean bool20 = this.canArchive;
        int hashCode75 = (hashCode74 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.canViewStats;
        int hashCode76 = (hashCode75 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
        int hashCode77 = (hashCode76 + (wallPostCopyrightDto == null ? 0 : wallPostCopyrightDto.hashCode())) * 31;
        Integer num8 = this.edited;
        int hashCode78 = (hashCode77 + (num8 == null ? 0 : num8.hashCode())) * 31;
        UserId userId3 = this.fromId;
        int hashCode79 = (hashCode78 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
        WallGeoDto wallGeoDto = this.geo;
        int hashCode80 = (hashCode79 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
        Integer num9 = this.id;
        int hashCode81 = (hashCode80 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool21 = this.isArchived;
        int hashCode82 = (hashCode81 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.isFavorite;
        int hashCode83 = (hashCode82 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        int hashCode84 = (hashCode83 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
        String str11 = this.reactionSetId;
        int hashCode85 = (hashCode84 + (str11 == null ? 0 : str11.hashCode())) * 31;
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        int hashCode86 = (hashCode85 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
        BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
        int hashCode87 = (hashCode86 + (badgesObjectInfoDto == null ? 0 : badgesObjectInfoDto.hashCode())) * 31;
        UserId userId4 = this.ownerId;
        int hashCode88 = (hashCode87 + (userId4 == null ? 0 : Long.hashCode(userId4.b))) * 31;
        UserId userId5 = this.replyOwnerId;
        int hashCode89 = (hashCode88 + (userId5 == null ? 0 : Long.hashCode(userId5.b))) * 31;
        Integer num10 = this.replyPostId;
        int hashCode90 = (hashCode89 + (num10 == null ? 0 : num10.hashCode())) * 31;
        UserId userId6 = this.replyTo;
        int hashCode91 = (hashCode90 + (userId6 == null ? 0 : Long.hashCode(userId6.b))) * 31;
        WallPosterDto wallPosterDto = this.poster;
        int hashCode92 = (hashCode91 + (wallPosterDto == null ? 0 : wallPosterDto.hashCode())) * 31;
        Integer num11 = this.postId;
        int hashCode93 = (hashCode92 + (num11 == null ? 0 : num11.hashCode())) * 31;
        List<Integer> list4 = this.parentsStack;
        int hashCode94 = (hashCode93 + (list4 == null ? 0 : list4.hashCode())) * 31;
        WallPostSourceDto wallPostSourceDto = this.postSource;
        int hashCode95 = (hashCode94 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
        WallPostTypeDto wallPostTypeDto = this.postType;
        int hashCode96 = (hashCode95 + (wallPostTypeDto == null ? 0 : wallPostTypeDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode97 = (hashCode96 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        UserId userId7 = this.signerId;
        int hashCode98 = (hashCode97 + (userId7 == null ? 0 : Long.hashCode(userId7.b))) * 31;
        String str12 = this.text;
        int hashCode99 = (hashCode98 + (str12 == null ? 0 : str12.hashCode())) * 31;
        WallViewsDto wallViewsDto = this.views;
        int hashCode100 = (hashCode99 + (wallViewsDto == null ? 0 : wallViewsDto.hashCode())) * 31;
        Integer num12 = this.replyCount;
        int hashCode101 = (hashCode100 + (num12 == null ? 0 : num12.hashCode())) * 31;
        WallSharingDto wallSharingDto = this.sharing;
        return hashCode101 + (wallSharingDto != null ? wallSharingDto.hashCode() : 0);
    }

    public final WallPostTypeDto i() {
        return this.postType;
    }

    public final Float j() {
        return this.shortTextRate;
    }

    public final UserId k() {
        return this.sourceId;
    }

    public final String l() {
        return this.text;
    }

    public final Float n() {
        return this.thumbsMaxHeight;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "NewsfeedItemWallpostDto(type=" + this.type + ", sourceId=" + this.sourceId + ", date=" + this.date + ", innerType=" + this.innerType + ", thumbsMaxHeight=" + this.thumbsMaxHeight + ", header=" + this.header + ", carouselOffset=" + this.carouselOffset + ", canIgnore=" + this.canIgnore + ", caption=" + this.caption + ", keepOffline=" + this.keepOffline + ", trackCode=" + this.trackCode + ", activity=" + this.activity + ", shortTextRate=" + this.shortTextRate + ", pushSubscription=" + this.pushSubscription + ", suggestSubscribe=" + this.suggestSubscribe + ", feedback=" + this.feedback + ", debugInfo=" + this.debugInfo + ", adsEasyPromote=" + this.adsEasyPromote + ", adsEasyPromoteThreeDots=" + this.adsEasyPromoteThreeDots + ", copyHistory=" + this.copyHistory + ", canEdit=" + this.canEdit + ", createdBy=" + this.createdBy + ", canDelete=" + this.canDelete + ", canPublish=" + this.canPublish + ", canPin=" + this.canPin + ", donut=" + this.donut + ", friendsOnly=" + this.friendsOnly + ", bestFriendsOnly=" + this.bestFriendsOnly + ", finalPost=" + this.finalPost + ", checkSign=" + this.checkSign + ", isPinned=" + this.isPinned + ", comments=" + this.comments + ", markedAsAds=" + this.markedAsAds + ", markedAsAuthorAd=" + this.markedAsAuthorAd + ", authorAd=" + this.authorAd + ", zoomText=" + this.zoomText + ", rating=" + this.rating + ", canSetCategory=" + this.canSetCategory + ", canDoubtCategory=" + this.canDoubtCategory + ", categoryAction=" + this.categoryAction + ", topicId=" + this.topicId + ", trending=" + this.trending + ", bottomExtension=" + this.bottomExtension + ", shortAttachCount=" + this.shortAttachCount + ", compactAttachmentsBeforeCut=" + this.compactAttachmentsBeforeCut + ", coowners=" + this.coowners + ", hash=" + this.hash + ", adData=" + this.adData + ", adModerationChecksum=" + this.adModerationChecksum + ", translationLang=" + this.translationLang + ", hasTranslation=" + this.hasTranslation + ", facebookExport=" + this.facebookExport + ", twitterExport=" + this.twitterExport + ", postponedId=" + this.postponedId + ", isPromotedPostStealth=" + this.isPromotedPostStealth + ", hasVideoAutoplay=" + this.hasVideoAutoplay + ", awayParams=" + this.awayParams + ", hideLikes=" + this.hideLikes + ", toId=" + this.toId + ", hasMarketLink=" + this.hasMarketLink + ", isFromPrivateGroup=" + this.isFromPrivateGroup + ", postAuthorData=" + this.postAuthorData + ", research=" + this.research + ", isAddedToMainTab=" + this.isAddedToMainTab + ", isBlacklisted=" + this.isBlacklisted + ", shareUrl=" + this.shareUrl + ", accessKey=" + this.accessKey + ", isDeleted=" + this.isDeleted + ", deletedReason=" + this.deletedReason + ", deletedDetails=" + this.deletedDetails + ", donutMiniappUrl=" + this.donutMiniappUrl + ", attachments=" + this.attachments + ", attachmentsMeta=" + this.attachmentsMeta + ", contentLayout=" + this.contentLayout + ", badgeId=" + this.badgeId + ", badgeInfo=" + this.badgeInfo + ", donutBadgeInfo=" + this.donutBadgeInfo + ", canArchive=" + this.canArchive + ", canViewStats=" + this.canViewStats + ", copyright=" + this.copyright + ", edited=" + this.edited + ", fromId=" + this.fromId + ", geo=" + this.geo + ", id=" + this.id + ", isArchived=" + this.isArchived + ", isFavorite=" + this.isFavorite + ", likes=" + this.likes + ", reactionSetId=" + this.reactionSetId + ", reactions=" + this.reactions + ", badges=" + this.badges + ", ownerId=" + this.ownerId + ", replyOwnerId=" + this.replyOwnerId + ", replyPostId=" + this.replyPostId + ", replyTo=" + this.replyTo + ", poster=" + this.poster + ", postId=" + this.postId + ", parentsStack=" + this.parentsStack + ", postSource=" + this.postSource + ", postType=" + this.postType + ", reposts=" + this.reposts + ", signerId=" + this.signerId + ", text=" + this.text + ", views=" + this.views + ", replyCount=" + this.replyCount + ", sharing=" + this.sharing + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.type, i);
        parcel.writeParcelable(this.sourceId, i);
        parcel.writeInt(this.date);
        this.innerType.writeToParcel(parcel, i);
        Float f = this.thumbsMaxHeight;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
        if (newsfeedNewsfeedItemHeaderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
        }
        Integer num = this.carouselOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.canIgnore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.caption, i);
        Boolean bool2 = this.keepOffline;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.activity, i);
        Float f2 = this.shortTextRate;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        parcel.writeParcelable(this.pushSubscription, i);
        Boolean bool3 = this.suggestSubscribe;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.feedback, i);
        parcel.writeParcelable(this.debugInfo, i);
        WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
        if (wallWallpostAdsEasyPromoteDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAdsEasyPromoteDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.adsEasyPromoteThreeDots;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        List<WallWallpostFullDto> list = this.copyHistory;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list, 1);
            while (f3.hasNext()) {
                ((WallWallpostFullDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.canEdit, i);
        parcel.writeParcelable(this.createdBy, i);
        parcel.writeParcelable(this.canDelete, i);
        parcel.writeParcelable(this.canPublish, i);
        parcel.writeParcelable(this.canPin, i);
        WallWallpostDonutDto wallWallpostDonutDto = this.donut;
        if (wallWallpostDonutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostDonutDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.friendsOnly, i);
        parcel.writeParcelable(this.bestFriendsOnly, i);
        parcel.writeParcelable(this.finalPost, i);
        Boolean bool5 = this.checkSign;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeParcelable(this.isPinned, i);
        BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
        if (baseCommentsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseCommentsInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.markedAsAds, i);
        Boolean bool6 = this.markedAsAuthorAd;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.authorAd;
        if (adsAdvertiserInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsAdvertiserInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool7 = this.zoomText;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        WallWallpostRatingDto wallWallpostRatingDto = this.rating;
        if (wallWallpostRatingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostRatingDto.writeToParcel(parcel, i);
        }
        Boolean bool8 = this.canSetCategory;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.canDoubtCategory;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        WallWallpostCategoryActionDto wallWallpostCategoryActionDto = this.categoryAction;
        if (wallWallpostCategoryActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostCategoryActionDto.writeToParcel(parcel, i);
        }
        TopicIdDto topicIdDto = this.topicId;
        if (topicIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topicIdDto.writeToParcel(parcel, i);
        }
        Boolean bool10 = this.trending;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        parcel.writeParcelable(this.bottomExtension, i);
        Integer num2 = this.shortAttachCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.compactAttachmentsBeforeCut;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        WallCoownersDto wallCoownersDto = this.coowners;
        if (wallCoownersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallCoownersDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.hash);
        parcel.writeString(this.adData);
        parcel.writeString(this.adModerationChecksum);
        parcel.writeString(this.translationLang);
        Boolean bool11 = this.hasTranslation;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Integer num4 = this.facebookExport;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.twitterExport;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.postponedId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Boolean bool12 = this.isPromotedPostStealth;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        Boolean bool13 = this.hasVideoAutoplay;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        parcel.writeValue(this.awayParams);
        Boolean bool14 = this.hideLikes;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        parcel.writeParcelable(this.toId, i);
        Boolean bool15 = this.hasMarketLink;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        Boolean bool16 = this.isFromPrivateGroup;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        WallWallpostAuthorDataDto wallWallpostAuthorDataDto = this.postAuthorData;
        if (wallWallpostAuthorDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAuthorDataDto.writeToParcel(parcel, i);
        }
        NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
        if (newsfeedMediascopeResearchDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedMediascopeResearchDto.writeToParcel(parcel, i);
        }
        Boolean bool17 = this.isAddedToMainTab;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
        }
        Boolean bool18 = this.isBlacklisted;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
        }
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.accessKey);
        Boolean bool19 = this.isDeleted;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
        parcel.writeString(this.deletedReason);
        parcel.writeString(this.deletedDetails);
        parcel.writeString(this.donutMiniappUrl);
        List<WallWallpostAttachmentDto> list2 = this.attachments;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list2, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        parcel.writeParcelable(this.attachmentsMeta, i);
        List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list3, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        Integer num7 = this.badgeId;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeParcelable(this.badgeInfo, i);
        parcel.writeParcelable(this.donutBadgeInfo, i);
        Boolean bool20 = this.canArchive;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool20);
        }
        parcel.writeParcelable(this.canViewStats, i);
        WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
        if (wallPostCopyrightDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostCopyrightDto.writeToParcel(parcel, i);
        }
        Integer num8 = this.edited;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeParcelable(this.fromId, i);
        parcel.writeParcelable(this.geo, i);
        Integer num9 = this.id;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Boolean bool21 = this.isArchived;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool21);
        }
        Boolean bool22 = this.isFavorite;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
        parcel.writeParcelable(this.likes, i);
        parcel.writeString(this.reactionSetId);
        parcel.writeParcelable(this.reactions, i);
        BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
        if (badgesObjectInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesObjectInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.replyOwnerId, i);
        Integer num10 = this.replyPostId;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        parcel.writeParcelable(this.replyTo, i);
        WallPosterDto wallPosterDto = this.poster;
        if (wallPosterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPosterDto.writeToParcel(parcel, i);
        }
        Integer num11 = this.postId;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        List<Integer> list4 = this.parentsStack;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list4, 1);
            while (f6.hasNext()) {
                parcel.writeInt(((Number) f6.next()).intValue());
            }
        }
        WallPostSourceDto wallPostSourceDto = this.postSource;
        if (wallPostSourceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostSourceDto.writeToParcel(parcel, i);
        }
        WallPostTypeDto wallPostTypeDto = this.postType;
        if (wallPostTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.reposts, i);
        parcel.writeParcelable(this.signerId, i);
        parcel.writeString(this.text);
        WallViewsDto wallViewsDto = this.views;
        if (wallViewsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallViewsDto.writeToParcel(parcel, i);
        }
        Integer num12 = this.replyCount;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        WallSharingDto wallSharingDto = this.sharing;
        if (wallSharingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallSharingDto.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ NewsfeedItemWallpostDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, InnerTypeDto innerTypeDto, Float f, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f2, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool4, List list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool5, BaseBoolIntDto baseBoolIntDto8, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool6, AdsAdvertiserInfoDto adsAdvertiserInfoDto, Boolean bool7, WallWallpostRatingDto wallWallpostRatingDto, Boolean bool8, Boolean bool9, WallWallpostCategoryActionDto wallWallpostCategoryActionDto, TopicIdDto topicIdDto, Boolean bool10, BaseBottomExtensionDto baseBottomExtensionDto, Integer num2, Integer num3, WallCoownersDto wallCoownersDto, String str2, String str3, String str4, String str5, Boolean bool11, Integer num4, Integer num5, Integer num6, Boolean bool12, Boolean bool13, Object obj, Boolean bool14, UserId userId3, Boolean bool15, Boolean bool16, WallWallpostAuthorDataDto wallWallpostAuthorDataDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool17, Boolean bool18, String str6, String str7, Boolean bool19, String str8, String str9, String str10, List list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List list3, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool20, BaseBoolIntDto baseBoolIntDto10, WallPostCopyrightDto wallPostCopyrightDto, Integer num8, UserId userId4, WallGeoDto wallGeoDto, Integer num9, Boolean bool21, Boolean bool22, BaseLikesInfoDto baseLikesInfoDto, String str11, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, UserId userId5, UserId userId6, Integer num10, UserId userId7, WallPosterDto wallPosterDto, Integer num11, List list4, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId8, String str12, WallViewsDto wallViewsDto, Integer num12, WallSharingDto wallSharingDto, int i2, int i3, int i4, int i5, zcl zclVar) {
        this(newsfeedNewsfeedItemTypeDto, userId, i, innerTypeDto, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r36, r37, r38, r39, r40, r41, r90, r42, r43, r44, r45, r46, r47, r48, r5, r91, r92, r93, r94, r95, r96, r0, (i3 & 32768) != 0 ? null : str3, (i3 & 65536) != 0 ? null : str4, (i3 & 131072) != 0 ? null : str5, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool11, (i3 & 524288) != 0 ? null : num4, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num5, (i3 & 2097152) != 0 ? null : num6, (i3 & 4194304) != 0 ? null : bool12, (i3 & 8388608) != 0 ? null : bool13, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : obj, (i3 & 33554432) != 0 ? null : bool14, (i3 & 67108864) != 0 ? null : userId3, (i3 & 134217728) != 0 ? null : bool15, (i3 & 268435456) != 0 ? null : bool16, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : wallWallpostAuthorDataDto, (i3 & 1073741824) != 0 ? null : newsfeedMediascopeResearchDto, (i3 & Integer.MIN_VALUE) != 0 ? null : bool17, (i4 & 1) != 0 ? null : bool18, (i4 & 2) != 0 ? null : str6, (i4 & 4) != 0 ? null : str7, (i4 & 8) != 0 ? null : bool19, (i4 & 16) != 0 ? null : str8, (i4 & 32) != 0 ? null : str9, (i4 & 64) != 0 ? null : str10, (i4 & 128) != 0 ? null : list2, (i4 & 256) != 0 ? null : wallWallpostAttachmentsMetaDto, (i4 & 512) != 0 ? null : list3, (i4 & 1024) != 0 ? null : num7, (i4 & 2048) != 0 ? null : badgesCommentInfoDto, (i4 & 4096) != 0 ? null : badgesDonutInfoDto, (i4 & 8192) != 0 ? null : bool20, (i4 & 16384) != 0 ? null : baseBoolIntDto10, (i4 & 32768) != 0 ? null : wallPostCopyrightDto, (i4 & 65536) != 0 ? null : num8, (i4 & 131072) != 0 ? null : userId4, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : wallGeoDto, (i4 & 524288) != 0 ? null : num9, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool21, (i4 & 2097152) != 0 ? null : bool22, (i4 & 4194304) != 0 ? null : baseLikesInfoDto, (i4 & 8388608) != 0 ? null : str11, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : likesItemReactionsDto, (i4 & 33554432) != 0 ? null : badgesObjectInfoDto, (i4 & 67108864) != 0 ? null : userId5, (i4 & 134217728) != 0 ? null : userId6, (i4 & 268435456) != 0 ? null : num10, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : userId7, (i4 & 1073741824) != 0 ? null : wallPosterDto, (i4 & Integer.MIN_VALUE) != 0 ? null : num11, (i5 & 1) != 0 ? null : list4, (i5 & 2) != 0 ? null : wallPostSourceDto, (i5 & 4) != 0 ? null : wallPostTypeDto, (i5 & 8) != 0 ? null : baseRepostsInfoDto, (i5 & 16) != 0 ? null : userId8, (i5 & 32) != 0 ? null : str12, (i5 & 64) != 0 ? null : wallViewsDto, (i5 & 128) != 0 ? null : num12, (i5 & 256) != 0 ? null : wallSharingDto);
        Float f3 = (i2 & 16) != 0 ? null : f;
        NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto2 = (i2 & 32) != 0 ? null : newsfeedNewsfeedItemHeaderDto;
        Integer num13 = (i2 & 64) != 0 ? null : num;
        Boolean bool23 = (i2 & 128) != 0 ? null : bool;
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto2 = (i2 & 256) != 0 ? null : newsfeedNewsfeedItemCaptionDto;
        Boolean bool24 = (i2 & 512) != 0 ? null : bool2;
        String str13 = (i2 & 1024) != 0 ? null : str;
        WallPostActivityDto wallPostActivityDto2 = (i2 & 2048) != 0 ? null : wallPostActivityDto;
        Float f4 = (i2 & 4096) != 0 ? null : f2;
        NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto2 = (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto;
        Boolean bool25 = (i2 & 16384) != 0 ? null : bool3;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto2 = (i2 & 32768) != 0 ? null : newsfeedItemWallpostFeedbackDto;
        NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto2 = (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto;
        WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto2 = (i2 & 131072) != 0 ? null : wallWallpostAdsEasyPromoteDto;
        Boolean bool26 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool4;
        List list5 = (i2 & 524288) != 0 ? null : list;
        BaseBoolIntDto baseBoolIntDto11 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto;
        UserId userId9 = (i2 & 2097152) != 0 ? null : userId2;
        BaseBoolIntDto baseBoolIntDto12 = (i2 & 4194304) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto13 = (i2 & 8388608) != 0 ? null : baseBoolIntDto3;
        BaseBoolIntDto baseBoolIntDto14 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto4;
        WallWallpostDonutDto wallWallpostDonutDto2 = (i2 & 33554432) != 0 ? null : wallWallpostDonutDto;
        BaseBoolIntDto baseBoolIntDto15 = (i2 & 67108864) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto16 = (i2 & 134217728) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto17 = (i2 & 268435456) != 0 ? null : baseBoolIntDto7;
        Boolean bool27 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool5;
        BaseBoolIntDto baseBoolIntDto18 = (i2 & 1073741824) != 0 ? null : baseBoolIntDto8;
        BaseCommentsInfoDto baseCommentsInfoDto2 = (i2 & Integer.MIN_VALUE) != 0 ? null : baseCommentsInfoDto;
        BaseBoolIntDto baseBoolIntDto19 = (i3 & 1) != 0 ? null : baseBoolIntDto9;
        Boolean bool28 = (i3 & 2) != 0 ? null : bool6;
        AdsAdvertiserInfoDto adsAdvertiserInfoDto2 = (i3 & 4) != 0 ? null : adsAdvertiserInfoDto;
        Boolean bool29 = (i3 & 8) != 0 ? null : bool7;
        WallWallpostRatingDto wallWallpostRatingDto2 = (i3 & 16) != 0 ? null : wallWallpostRatingDto;
        Boolean bool30 = (i3 & 32) != 0 ? null : bool8;
        Boolean bool31 = (i3 & 64) != 0 ? null : bool9;
        WallWallpostCategoryActionDto wallWallpostCategoryActionDto2 = (i3 & 128) != 0 ? null : wallWallpostCategoryActionDto;
        BaseCommentsInfoDto baseCommentsInfoDto3 = baseCommentsInfoDto2;
        TopicIdDto topicIdDto2 = (i3 & 256) != 0 ? null : topicIdDto;
        Boolean bool32 = (i3 & 512) != 0 ? null : bool10;
        BaseBottomExtensionDto baseBottomExtensionDto2 = (i3 & 1024) != 0 ? null : baseBottomExtensionDto;
        Integer num14 = (i3 & 2048) != 0 ? null : num2;
        Integer num15 = (i3 & 4096) != 0 ? null : num3;
        WallCoownersDto wallCoownersDto2 = (i3 & 8192) != 0 ? null : wallCoownersDto;
        String str14 = (i3 & 16384) != 0 ? null : str2;
    }
}
