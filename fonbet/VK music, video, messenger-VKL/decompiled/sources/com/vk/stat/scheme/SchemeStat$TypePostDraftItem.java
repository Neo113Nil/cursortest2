package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Ad;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import io.appmetrica.analytics.BuildConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypePostDraftItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("archive_period")
    private final String archivePeriod;

    @pmi0("archive_period_type")
    private final ArchivePeriodType archivePeriodType;

    @pmi0("attachments")
    private final List<SchemeStat$TypePostDraftAttachment> attachments;

    @pmi0("background_id")
    private final Integer backgroundId;

    @pmi0("background_owner_id")
    private final Long backgroundOwnerId;

    @pmi0("background_type")
    private final BackgroundType backgroundType;

    @pmi0("click_events")
    private final List<SchemeStat$PostDraftItemClickEvent> clickEvents;

    @pmi0("copyright_item_id")
    private final Integer copyrightItemId;

    @pmi0("copyright_owner_id")
    private final Long copyrightOwnerId;

    @pmi0("copyright_type")
    private final CopyrightType copyrightType;

    @pmi0("created_by")
    private final Long createdBy;

    @pmi0("created_time")
    private final String createdTime;

    @pmi0("draft_creator_id")
    private final Long draftCreatorId;

    @pmi0("draft_post_id")
    private final Integer draftPostId;

    @pmi0("event_type")
    private final SchemeStat$PostDraftItemEventType eventType;

    @pmi0("has_comments_on")
    private final Boolean hasCommentsOn;

    @pmi0("has_notification_on")
    private final Boolean hasNotificationOn;

    @pmi0("has_signature")
    private final Boolean hasSignature;

    @pmi0("hashtags")
    private final List<String> hashtags;

    @pmi0("is_from_ads_market")
    private final Boolean isFromAdsMarket;

    @pmi0("is_poster")
    private final Boolean isPoster;

    @pmi0("mentioned_ids")
    private final List<Long> mentionedIds;

    @pmi0("nav_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen navScreen;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("owner_wall_settings")
    private final List<SchemeStat$OwnerWallSettingsItem> ownerWallSettings;

    @pmi0("parent_owner_id")
    private final Long parentOwnerId;

    @pmi0("parent_post_id")
    private final Integer parentPostId;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("post_privacy")
    private final PostPrivacy postPrivacy;

    @pmi0("post_type")
    private final PostType postType;

    @pmi0("suggest_owner_id")
    private final Long suggestOwnerId;

    @pmi0("suggest_post_id")
    private final Integer suggestPostId;

    @pmi0("timer_delay")
    private final Integer timerDelay;

    @pmi0("was_marked_as_ads")
    private final Boolean wasMarkedAsAds;

    @pmi0("words_count")
    private final Integer wordsCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ArchivePeriodType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ArchivePeriodType[] $VALUES;

        @pmi0("month")
        public static final ArchivePeriodType MONTH;

        @pmi0(Ad.d)
        public static final ArchivePeriodType SINGLE;

        @pmi0("year")
        public static final ArchivePeriodType YEAR;

        static {
            ArchivePeriodType archivePeriodType = new ArchivePeriodType("SINGLE", 0);
            SINGLE = archivePeriodType;
            ArchivePeriodType archivePeriodType2 = new ArchivePeriodType("MONTH", 1);
            MONTH = archivePeriodType2;
            ArchivePeriodType archivePeriodType3 = new ArchivePeriodType("YEAR", 2);
            YEAR = archivePeriodType3;
            ArchivePeriodType[] archivePeriodTypeArr = {archivePeriodType, archivePeriodType2, archivePeriodType3};
            $VALUES = archivePeriodTypeArr;
            $ENTRIES = new asp(archivePeriodTypeArr);
        }

        private ArchivePeriodType(String str, int i) {
        }

        public static ArchivePeriodType valueOf(String str) {
            return (ArchivePeriodType) Enum.valueOf(ArchivePeriodType.class, str);
        }

        public static ArchivePeriodType[] values() {
            return (ArchivePeriodType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class BackgroundType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BackgroundType[] $VALUES;

        @pmi0("custom")
        public static final BackgroundType CUSTOM;

        @pmi0("emoji")
        public static final BackgroundType EMOJI;

        @pmi0("gradient")
        public static final BackgroundType GRADIENT;

        @pmi0("picture")
        public static final BackgroundType PICTURE;

        static {
            BackgroundType backgroundType = new BackgroundType("PICTURE", 0);
            PICTURE = backgroundType;
            BackgroundType backgroundType2 = new BackgroundType("EMOJI", 1);
            EMOJI = backgroundType2;
            BackgroundType backgroundType3 = new BackgroundType("GRADIENT", 2);
            GRADIENT = backgroundType3;
            BackgroundType backgroundType4 = new BackgroundType("CUSTOM", 3);
            CUSTOM = backgroundType4;
            BackgroundType[] backgroundTypeArr = {backgroundType, backgroundType2, backgroundType3, backgroundType4};
            $VALUES = backgroundTypeArr;
            $ENTRIES = new asp(backgroundTypeArr);
        }

        private BackgroundType(String str, int i) {
        }

        public static BackgroundType valueOf(String str) {
            return (BackgroundType) Enum.valueOf(BackgroundType.class, str);
        }

        public static BackgroundType[] values() {
            return (BackgroundType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class CopyrightType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CopyrightType[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final CopyrightType APP;

        @pmi0("article")
        public static final CopyrightType ARTICLE;

        @pmi0("audio")
        public static final CopyrightType AUDIO;

        @pmi0("comment")
        public static final CopyrightType COMMENT;

        @pmi0("discussion")
        public static final CopyrightType DISCUSSION;

        @pmi0("document")
        public static final CopyrightType DOCUMENT;

        @pmi0("narrative")
        public static final CopyrightType NARRATIVE;

        @pmi0("photo")
        public static final CopyrightType PHOTO;

        @pmi0("photo_album")
        public static final CopyrightType PHOTO_ALBUM;

        @pmi0("playlist")
        public static final CopyrightType PLAYLIST;

        @pmi0("podcast")
        public static final CopyrightType PODCAST;

        @pmi0("poll")
        public static final CopyrightType POLL;

        @pmi0("post")
        public static final CopyrightType POST;

        @pmi0("product")
        public static final CopyrightType PRODUCT;

        @pmi0("service")
        public static final CopyrightType SERVICE;

        @pmi0("story")
        public static final CopyrightType STORY;

        @pmi0("video")
        public static final CopyrightType VIDEO;

        @pmi0("wiki")
        public static final CopyrightType WIKI;

        static {
            CopyrightType copyrightType = new CopyrightType(SignalingProtocol.MEDIA_OPTION_AUDIO, 0);
            AUDIO = copyrightType;
            CopyrightType copyrightType2 = new CopyrightType("PLAYLIST", 1);
            PLAYLIST = copyrightType2;
            CopyrightType copyrightType3 = new CopyrightType("APP", 2);
            APP = copyrightType3;
            CopyrightType copyrightType4 = new CopyrightType("SERVICE", 3);
            SERVICE = copyrightType4;
            CopyrightType copyrightType5 = new CopyrightType("POST", 4);
            POST = copyrightType5;
            CopyrightType copyrightType6 = new CopyrightType("COMMENT", 5);
            COMMENT = copyrightType6;
            CopyrightType copyrightType7 = new CopyrightType("PHOTO", 6);
            PHOTO = copyrightType7;
            CopyrightType copyrightType8 = new CopyrightType("PHOTO_ALBUM", 7);
            PHOTO_ALBUM = copyrightType8;
            CopyrightType copyrightType9 = new CopyrightType(SignalingProtocol.MEDIA_OPTION_VIDEO, 8);
            VIDEO = copyrightType9;
            CopyrightType copyrightType10 = new CopyrightType("POLL", 9);
            POLL = copyrightType10;
            CopyrightType copyrightType11 = new CopyrightType("STORY", 10);
            STORY = copyrightType11;
            CopyrightType copyrightType12 = new CopyrightType("NARRATIVE", 11);
            NARRATIVE = copyrightType12;
            CopyrightType copyrightType13 = new CopyrightType("WIKI", 12);
            WIKI = copyrightType13;
            CopyrightType copyrightType14 = new CopyrightType("PODCAST", 13);
            PODCAST = copyrightType14;
            CopyrightType copyrightType15 = new CopyrightType("PRODUCT", 14);
            PRODUCT = copyrightType15;
            CopyrightType copyrightType16 = new CopyrightType("ARTICLE", 15);
            ARTICLE = copyrightType16;
            CopyrightType copyrightType17 = new CopyrightType("DISCUSSION", 16);
            DISCUSSION = copyrightType17;
            CopyrightType copyrightType18 = new CopyrightType("DOCUMENT", 17);
            DOCUMENT = copyrightType18;
            CopyrightType[] copyrightTypeArr = {copyrightType, copyrightType2, copyrightType3, copyrightType4, copyrightType5, copyrightType6, copyrightType7, copyrightType8, copyrightType9, copyrightType10, copyrightType11, copyrightType12, copyrightType13, copyrightType14, copyrightType15, copyrightType16, copyrightType17, copyrightType18};
            $VALUES = copyrightTypeArr;
            $ENTRIES = new asp(copyrightTypeArr);
        }

        private CopyrightType(String str, int i) {
        }

        public static CopyrightType valueOf(String str) {
            return (CopyrightType) Enum.valueOf(CopyrightType.class, str);
        }

        public static CopyrightType[] values() {
            return (CopyrightType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class PostPrivacy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostPrivacy[] $VALUES;

        @pmi0("friends_only")
        public static final PostPrivacy FRIENDS_ONLY;

        @pmi0(BuildConfig.SDK_BUILD_FLAVOR)
        public static final PostPrivacy PUBLIC;

        static {
            PostPrivacy postPrivacy = new PostPrivacy(Privacy.PUBLIC, 0);
            PUBLIC = postPrivacy;
            PostPrivacy postPrivacy2 = new PostPrivacy("FRIENDS_ONLY", 1);
            FRIENDS_ONLY = postPrivacy2;
            PostPrivacy[] postPrivacyArr = {postPrivacy, postPrivacy2};
            $VALUES = postPrivacyArr;
            $ENTRIES = new asp(postPrivacyArr);
        }

        private PostPrivacy(String str, int i) {
        }

        public static PostPrivacy valueOf(String str) {
            return (PostPrivacy) Enum.valueOf(PostPrivacy.class, str);
        }

        public static PostPrivacy[] values() {
            return (PostPrivacy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class PostType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostType[] $VALUES;

        @pmi0("copy")
        public static final PostType COPY;

        @pmi0("postpone_copy")
        public static final PostType POSTPONE_COPY;

        @pmi0("postpone_status")
        public static final PostType POSTPONE_STATUS;

        @pmi0("status")
        public static final PostType STATUS;

        @pmi0("suggest")
        public static final PostType SUGGEST;

        @pmi0("wall")
        public static final PostType WALL;

        static {
            PostType postType = new PostType(CommonConstant.RETKEY.STATUS, 0);
            STATUS = postType;
            PostType postType2 = new PostType("POSTPONE_STATUS", 1);
            POSTPONE_STATUS = postType2;
            PostType postType3 = new PostType("WALL", 2);
            WALL = postType3;
            PostType postType4 = new PostType("COPY", 3);
            COPY = postType4;
            PostType postType5 = new PostType("POSTPONE_COPY", 4);
            POSTPONE_COPY = postType5;
            PostType postType6 = new PostType("SUGGEST", 5);
            SUGGEST = postType6;
            PostType[] postTypeArr = {postType, postType2, postType3, postType4, postType5, postType6};
            $VALUES = postTypeArr;
            $ENTRIES = new asp(postTypeArr);
        }

        private PostType(String str, int i) {
        }

        public static PostType valueOf(String str) {
            return (PostType) Enum.valueOf(PostType.class, str);
        }

        public static PostType[] values() {
            return (PostType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypePostDraftItem(SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType, PostType postType, Boolean bool, Boolean bool2, Integer num, Long l, String str, Long l2, Integer num2, Long l3, Integer num3, Long l4, Integer num4, Long l5, ArchivePeriodType archivePeriodType, String str2, CopyrightType copyrightType, Long l6, Integer num5, Integer num6, Boolean bool3, BackgroundType backgroundType, Long l7, Integer num7, List<SchemeStat$TypePostDraftAttachment> list, List<Long> list2, Integer num8, Boolean bool4, Boolean bool5, Boolean bool6, PostPrivacy postPrivacy, List<SchemeStat$OwnerWallSettingsItem> list3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, List<SchemeStat$PostDraftItemClickEvent> list4, List<String> list5) {
        this.eventType = schemeStat$PostDraftItemEventType;
        this.postType = postType;
        this.wasMarkedAsAds = bool;
        this.isFromAdsMarket = bool2;
        this.postId = num;
        this.ownerId = l;
        this.createdTime = str;
        this.createdBy = l2;
        this.parentPostId = num2;
        this.parentOwnerId = l3;
        this.draftPostId = num3;
        this.draftCreatorId = l4;
        this.suggestPostId = num4;
        this.suggestOwnerId = l5;
        this.archivePeriodType = archivePeriodType;
        this.archivePeriod = str2;
        this.copyrightType = copyrightType;
        this.copyrightOwnerId = l6;
        this.copyrightItemId = num5;
        this.wordsCount = num6;
        this.isPoster = bool3;
        this.backgroundType = backgroundType;
        this.backgroundOwnerId = l7;
        this.backgroundId = num7;
        this.attachments = list;
        this.mentionedIds = list2;
        this.timerDelay = num8;
        this.hasCommentsOn = bool4;
        this.hasSignature = bool5;
        this.hasNotificationOn = bool6;
        this.postPrivacy = postPrivacy;
        this.ownerWallSettings = list3;
        this.navScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.clickEvents = list4;
        this.hashtags = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypePostDraftItem)) {
            return false;
        }
        SchemeStat$TypePostDraftItem schemeStat$TypePostDraftItem = (SchemeStat$TypePostDraftItem) obj;
        return this.eventType == schemeStat$TypePostDraftItem.eventType && this.postType == schemeStat$TypePostDraftItem.postType && epx.f(this.wasMarkedAsAds, schemeStat$TypePostDraftItem.wasMarkedAsAds) && epx.f(this.isFromAdsMarket, schemeStat$TypePostDraftItem.isFromAdsMarket) && epx.f(this.postId, schemeStat$TypePostDraftItem.postId) && epx.f(this.ownerId, schemeStat$TypePostDraftItem.ownerId) && epx.f(this.createdTime, schemeStat$TypePostDraftItem.createdTime) && epx.f(this.createdBy, schemeStat$TypePostDraftItem.createdBy) && epx.f(this.parentPostId, schemeStat$TypePostDraftItem.parentPostId) && epx.f(this.parentOwnerId, schemeStat$TypePostDraftItem.parentOwnerId) && epx.f(this.draftPostId, schemeStat$TypePostDraftItem.draftPostId) && epx.f(this.draftCreatorId, schemeStat$TypePostDraftItem.draftCreatorId) && epx.f(this.suggestPostId, schemeStat$TypePostDraftItem.suggestPostId) && epx.f(this.suggestOwnerId, schemeStat$TypePostDraftItem.suggestOwnerId) && this.archivePeriodType == schemeStat$TypePostDraftItem.archivePeriodType && epx.f(this.archivePeriod, schemeStat$TypePostDraftItem.archivePeriod) && this.copyrightType == schemeStat$TypePostDraftItem.copyrightType && epx.f(this.copyrightOwnerId, schemeStat$TypePostDraftItem.copyrightOwnerId) && epx.f(this.copyrightItemId, schemeStat$TypePostDraftItem.copyrightItemId) && epx.f(this.wordsCount, schemeStat$TypePostDraftItem.wordsCount) && epx.f(this.isPoster, schemeStat$TypePostDraftItem.isPoster) && this.backgroundType == schemeStat$TypePostDraftItem.backgroundType && epx.f(this.backgroundOwnerId, schemeStat$TypePostDraftItem.backgroundOwnerId) && epx.f(this.backgroundId, schemeStat$TypePostDraftItem.backgroundId) && epx.f(this.attachments, schemeStat$TypePostDraftItem.attachments) && epx.f(this.mentionedIds, schemeStat$TypePostDraftItem.mentionedIds) && epx.f(this.timerDelay, schemeStat$TypePostDraftItem.timerDelay) && epx.f(this.hasCommentsOn, schemeStat$TypePostDraftItem.hasCommentsOn) && epx.f(this.hasSignature, schemeStat$TypePostDraftItem.hasSignature) && epx.f(this.hasNotificationOn, schemeStat$TypePostDraftItem.hasNotificationOn) && this.postPrivacy == schemeStat$TypePostDraftItem.postPrivacy && epx.f(this.ownerWallSettings, schemeStat$TypePostDraftItem.ownerWallSettings) && this.navScreen == schemeStat$TypePostDraftItem.navScreen && epx.f(this.clickEvents, schemeStat$TypePostDraftItem.clickEvents) && epx.f(this.hashtags, schemeStat$TypePostDraftItem.hashtags);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        PostType postType = this.postType;
        int hashCode2 = (hashCode + (postType == null ? 0 : postType.hashCode())) * 31;
        Boolean bool = this.wasMarkedAsAds;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFromAdsMarket;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.postId;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.createdTime;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.createdBy;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.parentPostId;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l3 = this.parentOwnerId;
        int hashCode10 = (hashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num3 = this.draftPostId;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l4 = this.draftCreatorId;
        int hashCode12 = (hashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num4 = this.suggestPostId;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l5 = this.suggestOwnerId;
        int hashCode14 = (hashCode13 + (l5 == null ? 0 : l5.hashCode())) * 31;
        ArchivePeriodType archivePeriodType = this.archivePeriodType;
        int hashCode15 = (hashCode14 + (archivePeriodType == null ? 0 : archivePeriodType.hashCode())) * 31;
        String str2 = this.archivePeriod;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CopyrightType copyrightType = this.copyrightType;
        int hashCode17 = (hashCode16 + (copyrightType == null ? 0 : copyrightType.hashCode())) * 31;
        Long l6 = this.copyrightOwnerId;
        int hashCode18 = (hashCode17 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num5 = this.copyrightItemId;
        int hashCode19 = (hashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.wordsCount;
        int hashCode20 = (hashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool3 = this.isPoster;
        int hashCode21 = (hashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BackgroundType backgroundType = this.backgroundType;
        int hashCode22 = (hashCode21 + (backgroundType == null ? 0 : backgroundType.hashCode())) * 31;
        Long l7 = this.backgroundOwnerId;
        int hashCode23 = (hashCode22 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num7 = this.backgroundId;
        int hashCode24 = (hashCode23 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List<SchemeStat$TypePostDraftAttachment> list = this.attachments;
        int hashCode25 = (hashCode24 + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.mentionedIds;
        int hashCode26 = (hashCode25 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num8 = this.timerDelay;
        int hashCode27 = (hashCode26 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool4 = this.hasCommentsOn;
        int hashCode28 = (hashCode27 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasSignature;
        int hashCode29 = (hashCode28 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasNotificationOn;
        int hashCode30 = (hashCode29 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        PostPrivacy postPrivacy = this.postPrivacy;
        int hashCode31 = (hashCode30 + (postPrivacy == null ? 0 : postPrivacy.hashCode())) * 31;
        List<SchemeStat$OwnerWallSettingsItem> list3 = this.ownerWallSettings;
        int hashCode32 = (hashCode31 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.navScreen;
        int hashCode33 = (hashCode32 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        List<SchemeStat$PostDraftItemClickEvent> list4 = this.clickEvents;
        int hashCode34 = (hashCode33 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.hashtags;
        return hashCode34 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypePostDraftItem(eventType=");
        sb.append(this.eventType);
        sb.append(", postType=");
        sb.append(this.postType);
        sb.append(", wasMarkedAsAds=");
        sb.append(this.wasMarkedAsAds);
        sb.append(", isFromAdsMarket=");
        sb.append(this.isFromAdsMarket);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(", createdBy=");
        sb.append(this.createdBy);
        sb.append(", parentPostId=");
        sb.append(this.parentPostId);
        sb.append(", parentOwnerId=");
        sb.append(this.parentOwnerId);
        sb.append(", draftPostId=");
        sb.append(this.draftPostId);
        sb.append(", draftCreatorId=");
        sb.append(this.draftCreatorId);
        sb.append(", suggestPostId=");
        sb.append(this.suggestPostId);
        sb.append(", suggestOwnerId=");
        sb.append(this.suggestOwnerId);
        sb.append(", archivePeriodType=");
        sb.append(this.archivePeriodType);
        sb.append(", archivePeriod=");
        sb.append(this.archivePeriod);
        sb.append(", copyrightType=");
        sb.append(this.copyrightType);
        sb.append(", copyrightOwnerId=");
        sb.append(this.copyrightOwnerId);
        sb.append(", copyrightItemId=");
        sb.append(this.copyrightItemId);
        sb.append(", wordsCount=");
        sb.append(this.wordsCount);
        sb.append(", isPoster=");
        sb.append(this.isPoster);
        sb.append(", backgroundType=");
        sb.append(this.backgroundType);
        sb.append(", backgroundOwnerId=");
        sb.append(this.backgroundOwnerId);
        sb.append(", backgroundId=");
        sb.append(this.backgroundId);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", mentionedIds=");
        sb.append(this.mentionedIds);
        sb.append(", timerDelay=");
        sb.append(this.timerDelay);
        sb.append(", hasCommentsOn=");
        sb.append(this.hasCommentsOn);
        sb.append(", hasSignature=");
        sb.append(this.hasSignature);
        sb.append(", hasNotificationOn=");
        sb.append(this.hasNotificationOn);
        sb.append(", postPrivacy=");
        sb.append(this.postPrivacy);
        sb.append(", ownerWallSettings=");
        sb.append(this.ownerWallSettings);
        sb.append(", navScreen=");
        sb.append(this.navScreen);
        sb.append(", clickEvents=");
        sb.append(this.clickEvents);
        sb.append(", hashtags=");
        return ms9.a(')', sb, this.hashtags);
    }

    public /* synthetic */ SchemeStat$TypePostDraftItem(SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType, PostType postType, Boolean bool, Boolean bool2, Integer num, Long l, String str, Long l2, Integer num2, Long l3, Integer num3, Long l4, Integer num4, Long l5, ArchivePeriodType archivePeriodType, String str2, CopyrightType copyrightType, Long l6, Integer num5, Integer num6, Boolean bool3, BackgroundType backgroundType, Long l7, Integer num7, List list, List list2, Integer num8, Boolean bool4, Boolean bool5, Boolean bool6, PostPrivacy postPrivacy, List list3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, List list4, List list5, int i, int i2, zcl zclVar) {
        this(schemeStat$PostDraftItemEventType, (i & 2) != 0 ? null : postType, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : l3, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : l4, (i & 4096) != 0 ? null : num4, (i & 8192) != 0 ? null : l5, (i & 16384) != 0 ? null : archivePeriodType, (i & 32768) != 0 ? null : str2, (i & 65536) != 0 ? null : copyrightType, (i & 131072) != 0 ? null : l6, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num5, (i & 524288) != 0 ? null : num6, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool3, (i & 2097152) != 0 ? null : backgroundType, (i & 4194304) != 0 ? null : l7, (i & 8388608) != 0 ? null : num7, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list, (i & 33554432) != 0 ? null : list2, (i & 67108864) != 0 ? null : num8, (i & 134217728) != 0 ? null : bool4, (i & 268435456) != 0 ? null : bool5, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool6, (i & 1073741824) != 0 ? null : postPrivacy, (i & Integer.MIN_VALUE) != 0 ? null : list3, (i2 & 1) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i2 & 2) != 0 ? null : list4, (i2 & 4) != 0 ? null : list5);
    }
}
