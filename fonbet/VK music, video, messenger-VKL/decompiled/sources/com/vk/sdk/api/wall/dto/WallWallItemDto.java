package com.vk.sdk.api.wall.dto;

import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.ads.dto.AdsHideReasonsDto;
import com.vk.sdk.api.ads.dto.AdsItemBlockAdItemDto;
import com.vk.sdk.api.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseCommentsInfoDto;
import com.vk.sdk.api.base.dto.BaseImageDto;
import com.vk.sdk.api.base.dto.BaseLikesInfoDto;
import com.vk.sdk.api.base.dto.BaseLinkButtonDto;
import com.vk.sdk.api.base.dto.BaseRepostsInfoDto;
import com.vk.sdk.api.donut.dto.DonutWallDonateBlockFriendsDto;
import com.vk.sdk.api.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.sdk.api.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.cgn;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.n6j;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.sq;
import xsna.up;
import xsna.uq;
import xsna.urd0;
import xsna.vr;
import xsna.xe9;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallWallItemDto.kt */
/* loaded from: classes5.dex */
public abstract class WallWallItemDto {

    /* compiled from: WallWallItemDto.kt */
    public static final class Deserializer implements a9y<WallWallItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1863356540:
                        if (f.equals("suggest")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 3059573:
                        if (f.equals("copy")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 3446944:
                        if (f.equals("post")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 106642994:
                        if (f.equals("photo")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 108401386:
                        if (f.equals("reply")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 112202875:
                        if (f.equals("video")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 757330065:
                        if (f.equals("post_ads")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 757850262:
                        if (f.equals("postpone")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: WallWallItemDto.kt */
    public static final class DonutWallDonateBlockDto extends WallWallItemDto {

        @pmi0("about")
        private final BaseLinkButtonDto about;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("friends")
        private final DonutWallDonateBlockFriendsDto friends;

        @pmi0("icon")
        private final List<BaseImageDto> icon;

        @pmi0("image")
        private final List<BaseImageDto> image;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final WallItemTypeDto type;

        public /* synthetic */ DonutWallDonateBlockDto(List list, List list2, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, String str3, BaseLinkButtonDto baseLinkButtonDto2, DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto, WallItemTypeDto wallItemTypeDto, int i, zcl zclVar) {
            this(list, list2, str, str2, baseLinkButtonDto, str3, (i & 64) != 0 ? null : baseLinkButtonDto2, (i & 128) != 0 ? null : donutWallDonateBlockFriendsDto, (i & 256) != 0 ? null : wallItemTypeDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DonutWallDonateBlockDto)) {
                return false;
            }
            DonutWallDonateBlockDto donutWallDonateBlockDto = (DonutWallDonateBlockDto) obj;
            return epx.f(this.image, donutWallDonateBlockDto.image) && epx.f(this.icon, donutWallDonateBlockDto.icon) && epx.f(this.title, donutWallDonateBlockDto.title) && epx.f(this.subtitle, donutWallDonateBlockDto.subtitle) && epx.f(this.button, donutWallDonateBlockDto.button) && epx.f(this.trackCode, donutWallDonateBlockDto.trackCode) && epx.f(this.about, donutWallDonateBlockDto.about) && epx.f(this.friends, donutWallDonateBlockDto.friends) && this.type == donutWallDonateBlockDto.type;
        }

        public final int hashCode() {
            int a = urd0.a((this.button.hashCode() + urd0.a(urd0.a(fw3.a(this.image.hashCode() * 31, 31, this.icon), 31, this.title), 31, this.subtitle)) * 31, 31, this.trackCode);
            BaseLinkButtonDto baseLinkButtonDto = this.about;
            int hashCode = (a + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto = this.friends;
            int hashCode2 = (hashCode + (donutWallDonateBlockFriendsDto == null ? 0 : donutWallDonateBlockFriendsDto.hashCode())) * 31;
            WallItemTypeDto wallItemTypeDto = this.type;
            return hashCode2 + (wallItemTypeDto != null ? wallItemTypeDto.hashCode() : 0);
        }

        public final String toString() {
            List<BaseImageDto> list = this.image;
            List<BaseImageDto> list2 = this.icon;
            String str = this.title;
            String str2 = this.subtitle;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            String str3 = this.trackCode;
            BaseLinkButtonDto baseLinkButtonDto2 = this.about;
            DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto = this.friends;
            WallItemTypeDto wallItemTypeDto = this.type;
            StringBuilder sb = new StringBuilder("DonutWallDonateBlockDto(image=");
            sb.append(list);
            sb.append(", icon=");
            sb.append(list2);
            sb.append(", title=");
            n6j.b(sb, str, ", subtitle=", str2, ", button=");
            sb.append(baseLinkButtonDto);
            sb.append(", trackCode=");
            sb.append(str3);
            sb.append(", about=");
            sb.append(baseLinkButtonDto2);
            sb.append(", friends=");
            sb.append(donutWallDonateBlockFriendsDto);
            sb.append(", type=");
            sb.append(wallItemTypeDto);
            sb.append(")");
            return sb.toString();
        }

        public DonutWallDonateBlockDto(List<BaseImageDto> list, List<BaseImageDto> list2, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, String str3, BaseLinkButtonDto baseLinkButtonDto2, DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto, WallItemTypeDto wallItemTypeDto) {
            super(null);
            this.image = list;
            this.icon = list2;
            this.title = str;
            this.subtitle = str2;
            this.button = baseLinkButtonDto;
            this.trackCode = str3;
            this.about = baseLinkButtonDto2;
            this.friends = donutWallDonateBlockFriendsDto;
            this.type = wallItemTypeDto;
        }
    }

    /* compiled from: WallWallItemDto.kt */
    public static final class WallItemAdsBlockDto extends WallWallItemDto {

        @pmi0("ad_marker")
        private final String adMarker;

        @pmi0("ad_source")
        private final AdSourceDto adSource;

        @pmi0(b.JSON_KEY_ADS)
        private final List<AdsItemBlockAdItemDto> ads;

        @pmi0("ads_debug")
        private final String adsDebug;

        @pmi0("ads_id1")
        private final int adsId1;

        @pmi0("ads_id2")
        private final int adsId2;

        @pmi0("ads_statistics")
        private final List<AdsItemBlockAdStatPixelDto> adsStatistics;

        @pmi0("ads_title")
        private final String adsTitle;

        @pmi0("advertiser_info_url")
        private final String advertiserInfoUrl;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("hide_reasons")
        private final AdsHideReasonsDto hideReasons;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallWallItemDto.kt */
        public static final class AdSourceDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AdSourceDto[] $VALUES;

            @pmi0("vkfeed")
            public static final AdSourceDto VKFEED;

            @pmi0("vkontakte")
            public static final AdSourceDto VKONTAKTE;
            private final String value;

            static {
                AdSourceDto adSourceDto = new AdSourceDto("VKONTAKTE", 0, "vkontakte");
                VKONTAKTE = adSourceDto;
                AdSourceDto adSourceDto2 = new AdSourceDto("VKFEED", 1, "vkfeed");
                VKFEED = adSourceDto2;
                AdSourceDto[] adSourceDtoArr = {adSourceDto, adSourceDto2};
                $VALUES = adSourceDtoArr;
                $ENTRIES = new asp(adSourceDtoArr);
            }

            private AdSourceDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static AdSourceDto valueOf(String str) {
                return (AdSourceDto) Enum.valueOf(AdSourceDto.class, str);
            }

            public static AdSourceDto[] values() {
                return (AdSourceDto[]) $VALUES.clone();
            }
        }

        public /* synthetic */ WallItemAdsBlockDto(String str, String str2, int i, int i2, List list, String str3, AdsHideReasonsDto adsHideReasonsDto, List list2, String str4, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, AdSourceDto adSourceDto, String str5, int i3, zcl zclVar) {
            this(str, str2, i, i2, list, str3, (i3 & 64) != 0 ? null : adsHideReasonsDto, (i3 & 128) != 0 ? null : list2, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (i3 & 1024) != 0 ? null : adSourceDto, (i3 & 2048) != 0 ? null : str5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallItemAdsBlockDto)) {
                return false;
            }
            WallItemAdsBlockDto wallItemAdsBlockDto = (WallItemAdsBlockDto) obj;
            return epx.f(this.type, wallItemAdsBlockDto.type) && epx.f(this.adsTitle, wallItemAdsBlockDto.adsTitle) && this.adsId1 == wallItemAdsBlockDto.adsId1 && this.adsId2 == wallItemAdsBlockDto.adsId2 && epx.f(this.ads, wallItemAdsBlockDto.ads) && epx.f(this.advertiserInfoUrl, wallItemAdsBlockDto.advertiserInfoUrl) && epx.f(this.hideReasons, wallItemAdsBlockDto.hideReasons) && epx.f(this.adsStatistics, wallItemAdsBlockDto.adsStatistics) && epx.f(this.adsDebug, wallItemAdsBlockDto.adsDebug) && epx.f(this.header, wallItemAdsBlockDto.header) && this.adSource == wallItemAdsBlockDto.adSource && epx.f(this.adMarker, wallItemAdsBlockDto.adMarker);
        }

        public final int hashCode() {
            int a = urd0.a(fw3.a(shy.a(this.adsId2, shy.a(this.adsId1, urd0.a(this.type.hashCode() * 31, 31, this.adsTitle), 31), 31), 31, this.ads), 31, this.advertiserInfoUrl);
            AdsHideReasonsDto adsHideReasonsDto = this.hideReasons;
            int hashCode = (a + (adsHideReasonsDto == null ? 0 : adsHideReasonsDto.hashCode())) * 31;
            List<AdsItemBlockAdStatPixelDto> list = this.adsStatistics;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.adsDebug;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            AdSourceDto adSourceDto = this.adSource;
            int hashCode5 = (hashCode4 + (adSourceDto == null ? 0 : adSourceDto.hashCode())) * 31;
            String str2 = this.adMarker;
            return hashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            String str2 = this.adsTitle;
            int i = this.adsId1;
            int i2 = this.adsId2;
            List<AdsItemBlockAdItemDto> list = this.ads;
            String str3 = this.advertiserInfoUrl;
            AdsHideReasonsDto adsHideReasonsDto = this.hideReasons;
            List<AdsItemBlockAdStatPixelDto> list2 = this.adsStatistics;
            String str4 = this.adsDebug;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            AdSourceDto adSourceDto = this.adSource;
            String str5 = this.adMarker;
            StringBuilder a = xe9.a("WallItemAdsBlockDto(type=", str, ", adsTitle=", str2, ", adsId1=");
            cgn.a(i, i2, ", adsId2=", ", ads=", a);
            vr.c(", advertiserInfoUrl=", str3, ", hideReasons=", a, list);
            a.append(adsHideReasonsDto);
            a.append(", adsStatistics=");
            a.append(list2);
            a.append(", adsDebug=");
            a.append(str4);
            a.append(", header=");
            a.append(newsfeedNewsfeedItemHeaderDto);
            a.append(", adSource=");
            a.append(adSourceDto);
            a.append(", adMarker=");
            a.append(str5);
            a.append(")");
            return a.toString();
        }

        public WallItemAdsBlockDto(String str, String str2, int i, int i2, List<AdsItemBlockAdItemDto> list, String str3, AdsHideReasonsDto adsHideReasonsDto, List<AdsItemBlockAdStatPixelDto> list2, String str4, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, AdSourceDto adSourceDto, String str5) {
            super(null);
            this.type = str;
            this.adsTitle = str2;
            this.adsId1 = i;
            this.adsId2 = i2;
            this.ads = list;
            this.advertiserInfoUrl = str3;
            this.hideReasons = adsHideReasonsDto;
            this.adsStatistics = list2;
            this.adsDebug = str4;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.adSource = adSourceDto;
            this.adMarker = str5;
        }
    }

    /* compiled from: WallWallItemDto.kt */
    public static final class WallWallpostFullDto extends WallWallItemDto {

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("attachments")
        private final List<WallWallpostAttachmentDto> attachments;

        @pmi0("can_delete")
        private final BaseBoolIntDto canDelete;

        @pmi0("can_edit")
        private final BaseBoolIntDto canEdit;

        @pmi0("can_pin")
        private final BaseBoolIntDto canPin;

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("comments")
        private final BaseCommentsInfoDto comments;

        @pmi0("copy_history")
        private final List<com.vk.sdk.api.wall.dto.WallWallpostFullDto> copyHistory;

        @pmi0("copyright")
        private final WallPostCopyrightDto copyright;

        @pmi0("created_by")
        private final UserId createdBy;

        @pmi0("date")
        private final Integer date;

        @pmi0("deleted_details")
        private final String deletedDetails;

        @pmi0("deleted_reason")
        private final String deletedReason;

        @pmi0("donut")
        private final WallWallpostDonutDto donut;

        @pmi0("edited")
        private final Integer edited;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("from_id")
        private final UserId fromId;

        @pmi0("geo")
        private final WallGeoDto geo;

        @pmi0("hash")
        private final String hash;

        @pmi0("id")
        private final Integer id;

        @pmi0("is_archived")
        private final Boolean isArchived;

        @pmi0("is_deleted")
        private final Boolean isDeleted;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_pinned")
        private final BaseBoolIntDto isPinned;

        @pmi0("likes")
        private final BaseLikesInfoDto likes;

        @pmi0("marked_as_ads")
        private final BaseBoolIntDto markedAsAds;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("parents_stack")
        private final List<Integer> parentsStack;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("post_source")
        private final WallPostSourceDto postSource;

        @pmi0("post_type")
        private final WallPostTypeDto postType;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("signer_id")
        private final UserId signerId;

        @pmi0("text")
        private final String text;

        @pmi0("to_id")
        private final UserId toId;

        @pmi0("topic_id")
        private final TopicIdDto topicId;

        @pmi0("type")
        private final WallPostTypeDto type;

        @pmi0("views")
        private final WallViewsDto views;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallWallItemDto.kt */
        public static final class TopicIdDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TopicIdDto[] $VALUES;

            @pmi0("1")
            public static final TopicIdDto ART;

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
        }

        public WallWallpostFullDto() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 127, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallWallpostFullDto)) {
                return false;
            }
            WallWallpostFullDto wallWallpostFullDto = (WallWallpostFullDto) obj;
            return epx.f(this.copyHistory, wallWallpostFullDto.copyHistory) && this.canEdit == wallWallpostFullDto.canEdit && epx.f(this.createdBy, wallWallpostFullDto.createdBy) && this.canDelete == wallWallpostFullDto.canDelete && this.canPin == wallWallpostFullDto.canPin && epx.f(this.donut, wallWallpostFullDto.donut) && this.isPinned == wallWallpostFullDto.isPinned && epx.f(this.comments, wallWallpostFullDto.comments) && this.markedAsAds == wallWallpostFullDto.markedAsAds && this.topicId == wallWallpostFullDto.topicId && epx.f(this.shortTextRate, wallWallpostFullDto.shortTextRate) && epx.f(this.hash, wallWallpostFullDto.hash) && this.type == wallWallpostFullDto.type && epx.f(this.feedback, wallWallpostFullDto.feedback) && epx.f(this.toId, wallWallpostFullDto.toId) && epx.f(this.carouselOffset, wallWallpostFullDto.carouselOffset) && epx.f(this.accessKey, wallWallpostFullDto.accessKey) && epx.f(this.isDeleted, wallWallpostFullDto.isDeleted) && epx.f(this.deletedReason, wallWallpostFullDto.deletedReason) && epx.f(this.deletedDetails, wallWallpostFullDto.deletedDetails) && epx.f(this.attachments, wallWallpostFullDto.attachments) && epx.f(this.copyright, wallWallpostFullDto.copyright) && epx.f(this.date, wallWallpostFullDto.date) && epx.f(this.edited, wallWallpostFullDto.edited) && epx.f(this.fromId, wallWallpostFullDto.fromId) && epx.f(this.geo, wallWallpostFullDto.geo) && epx.f(this.id, wallWallpostFullDto.id) && epx.f(this.isArchived, wallWallpostFullDto.isArchived) && epx.f(this.isFavorite, wallWallpostFullDto.isFavorite) && epx.f(this.likes, wallWallpostFullDto.likes) && epx.f(this.ownerId, wallWallpostFullDto.ownerId) && epx.f(this.postId, wallWallpostFullDto.postId) && epx.f(this.parentsStack, wallWallpostFullDto.parentsStack) && epx.f(this.postSource, wallWallpostFullDto.postSource) && this.postType == wallWallpostFullDto.postType && epx.f(this.reposts, wallWallpostFullDto.reposts) && epx.f(this.signerId, wallWallpostFullDto.signerId) && epx.f(this.text, wallWallpostFullDto.text) && epx.f(this.views, wallWallpostFullDto.views);
        }

        public final int hashCode() {
            List<com.vk.sdk.api.wall.dto.WallWallpostFullDto> list = this.copyHistory;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canEdit;
            int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            UserId userId = this.createdBy;
            int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
            int hashCode4 = (hashCode3 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canPin;
            int hashCode5 = (hashCode4 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            int hashCode6 = (hashCode5 + (wallWallpostDonutDto == null ? 0 : wallWallpostDonutDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.isPinned;
            int hashCode7 = (hashCode6 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            int hashCode8 = (hashCode7 + (baseCommentsInfoDto == null ? 0 : baseCommentsInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.markedAsAds;
            int hashCode9 = (hashCode8 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            TopicIdDto topicIdDto = this.topicId;
            int hashCode10 = (hashCode9 + (topicIdDto == null ? 0 : topicIdDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
            String str = this.hash;
            int hashCode12 = (hashCode11 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto = this.type;
            int hashCode13 = (hashCode12 + (wallPostTypeDto == null ? 0 : wallPostTypeDto.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode14 = (hashCode13 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            UserId userId2 = this.toId;
            int hashCode15 = (hashCode14 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            Integer num = this.carouselOffset;
            int hashCode16 = (hashCode15 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.accessKey;
            int hashCode17 = (hashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isDeleted;
            int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.deletedReason;
            int hashCode19 = (hashCode18 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deletedDetails;
            int hashCode20 = (hashCode19 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            int hashCode21 = (hashCode20 + (list2 == null ? 0 : list2.hashCode())) * 31;
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            int hashCode22 = (hashCode21 + (wallPostCopyrightDto == null ? 0 : wallPostCopyrightDto.hashCode())) * 31;
            Integer num2 = this.date;
            int hashCode23 = (hashCode22 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.edited;
            int hashCode24 = (hashCode23 + (num3 == null ? 0 : num3.hashCode())) * 31;
            UserId userId3 = this.fromId;
            int hashCode25 = (hashCode24 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            WallGeoDto wallGeoDto = this.geo;
            int hashCode26 = (hashCode25 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
            Integer num4 = this.id;
            int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Boolean bool2 = this.isArchived;
            int hashCode28 = (hashCode27 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isFavorite;
            int hashCode29 = (hashCode28 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            int hashCode30 = (hashCode29 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
            UserId userId4 = this.ownerId;
            int hashCode31 = (hashCode30 + (userId4 == null ? 0 : Long.hashCode(userId4.b))) * 31;
            Integer num5 = this.postId;
            int hashCode32 = (hashCode31 + (num5 == null ? 0 : num5.hashCode())) * 31;
            List<Integer> list3 = this.parentsStack;
            int hashCode33 = (hashCode32 + (list3 == null ? 0 : list3.hashCode())) * 31;
            WallPostSourceDto wallPostSourceDto = this.postSource;
            int hashCode34 = (hashCode33 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto2 = this.postType;
            int hashCode35 = (hashCode34 + (wallPostTypeDto2 == null ? 0 : wallPostTypeDto2.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode36 = (hashCode35 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            UserId userId5 = this.signerId;
            int hashCode37 = (hashCode36 + (userId5 == null ? 0 : Long.hashCode(userId5.b))) * 31;
            String str5 = this.text;
            int hashCode38 = (hashCode37 + (str5 == null ? 0 : str5.hashCode())) * 31;
            WallViewsDto wallViewsDto = this.views;
            return hashCode38 + (wallViewsDto != null ? wallViewsDto.hashCode() : 0);
        }

        public final String toString() {
            List<com.vk.sdk.api.wall.dto.WallWallpostFullDto> list = this.copyHistory;
            BaseBoolIntDto baseBoolIntDto = this.canEdit;
            UserId userId = this.createdBy;
            BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
            BaseBoolIntDto baseBoolIntDto3 = this.canPin;
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            BaseBoolIntDto baseBoolIntDto4 = this.isPinned;
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            BaseBoolIntDto baseBoolIntDto5 = this.markedAsAds;
            TopicIdDto topicIdDto = this.topicId;
            Float f = this.shortTextRate;
            String str = this.hash;
            WallPostTypeDto wallPostTypeDto = this.type;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            UserId userId2 = this.toId;
            Integer num = this.carouselOffset;
            String str2 = this.accessKey;
            Boolean bool = this.isDeleted;
            String str3 = this.deletedReason;
            String str4 = this.deletedDetails;
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            Integer num2 = this.date;
            Integer num3 = this.edited;
            UserId userId3 = this.fromId;
            WallGeoDto wallGeoDto = this.geo;
            Integer num4 = this.id;
            Boolean bool2 = this.isArchived;
            Boolean bool3 = this.isFavorite;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            UserId userId4 = this.ownerId;
            Integer num5 = this.postId;
            List<Integer> list3 = this.parentsStack;
            WallPostSourceDto wallPostSourceDto = this.postSource;
            WallPostTypeDto wallPostTypeDto2 = this.postType;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            UserId userId5 = this.signerId;
            String str5 = this.text;
            WallViewsDto wallViewsDto = this.views;
            StringBuilder sb = new StringBuilder("WallWallpostFullDto(copyHistory=");
            sb.append(list);
            sb.append(", canEdit=");
            sb.append(baseBoolIntDto);
            sb.append(", createdBy=");
            sb.append(userId);
            sb.append(", canDelete=");
            sb.append(baseBoolIntDto2);
            sb.append(", canPin=");
            sb.append(baseBoolIntDto3);
            sb.append(", donut=");
            sb.append(wallWallpostDonutDto);
            sb.append(", isPinned=");
            sb.append(baseBoolIntDto4);
            sb.append(", comments=");
            sb.append(baseCommentsInfoDto);
            sb.append(", markedAsAds=");
            sb.append(baseBoolIntDto5);
            sb.append(", topicId=");
            sb.append(topicIdDto);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", hash=");
            sb.append(str);
            sb.append(", type=");
            sb.append(wallPostTypeDto);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(", toId=");
            sb.append(userId2);
            sb.append(", carouselOffset=");
            sb.append(num);
            sb.append(", accessKey=");
            uq.c(bool, str2, ", isDeleted=", ", deletedReason=", sb);
            n6j.b(sb, str3, ", deletedDetails=", str4, ", attachments=");
            sb.append(list2);
            sb.append(", copyright=");
            sb.append(wallPostCopyrightDto);
            sb.append(", date=");
            sq.b(sb, num2, ", edited=", num3, ", fromId=");
            sb.append(userId3);
            sb.append(", geo=");
            sb.append(wallGeoDto);
            sb.append(", id=");
            rq.h(sb, num4, ", isArchived=", bool2, ", isFavorite=");
            sb.append(bool3);
            sb.append(", likes=");
            sb.append(baseLikesInfoDto);
            sb.append(", ownerId=");
            sb.append(userId4);
            sb.append(", postId=");
            sb.append(num5);
            sb.append(", parentsStack=");
            sb.append(list3);
            sb.append(", postSource=");
            sb.append(wallPostSourceDto);
            sb.append(", postType=");
            sb.append(wallPostTypeDto2);
            sb.append(", reposts=");
            sb.append(baseRepostsInfoDto);
            sb.append(", signerId=");
            sb.append(userId5);
            sb.append(", text=");
            sb.append(str5);
            sb.append(", views=");
            sb.append(wallViewsDto);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ WallWallpostFullDto(List list, BaseBoolIntDto baseBoolIntDto, UserId userId, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto4, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto5, TopicIdDto topicIdDto, Float f, String str, WallPostTypeDto wallPostTypeDto, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, UserId userId2, Integer num, String str2, Boolean bool, String str3, String str4, List list2, WallPostCopyrightDto wallPostCopyrightDto, Integer num2, Integer num3, UserId userId3, WallGeoDto wallGeoDto, Integer num4, Boolean bool2, Boolean bool3, BaseLikesInfoDto baseLikesInfoDto, UserId userId4, Integer num5, List list3, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto2, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId5, String str5, WallViewsDto wallViewsDto, int i, int i2, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : baseBoolIntDto, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : baseBoolIntDto2, (i & 16) != 0 ? null : baseBoolIntDto3, (i & 32) != 0 ? null : wallWallpostDonutDto, (i & 64) != 0 ? null : baseBoolIntDto4, (i & 128) != 0 ? null : baseCommentsInfoDto, (i & 256) != 0 ? null : baseBoolIntDto5, (i & 512) != 0 ? null : topicIdDto, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : wallPostTypeDto, (i & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i & 16384) != 0 ? null : userId2, (i & 32768) != 0 ? null : num, (i & 65536) != 0 ? null : str2, (i & 131072) != 0 ? null : bool, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str3, (i & 524288) != 0 ? null : str4, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list2, (i & 2097152) != 0 ? null : wallPostCopyrightDto, (i & 4194304) != 0 ? null : num2, (i & 8388608) != 0 ? null : num3, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : userId3, (i & 33554432) != 0 ? null : wallGeoDto, (i & 67108864) != 0 ? null : num4, (i & 134217728) != 0 ? null : bool2, (i & 268435456) != 0 ? null : bool3, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseLikesInfoDto, (i & 1073741824) != 0 ? null : userId4, (i & Integer.MIN_VALUE) != 0 ? null : num5, (i2 & 1) != 0 ? null : list3, (i2 & 2) != 0 ? null : wallPostSourceDto, (i2 & 4) != 0 ? null : wallPostTypeDto2, (i2 & 8) != 0 ? null : baseRepostsInfoDto, (i2 & 16) != 0 ? null : userId5, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : wallViewsDto);
        }

        public WallWallpostFullDto(List<com.vk.sdk.api.wall.dto.WallWallpostFullDto> list, BaseBoolIntDto baseBoolIntDto, UserId userId, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto4, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto5, TopicIdDto topicIdDto, Float f, String str, WallPostTypeDto wallPostTypeDto, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, UserId userId2, Integer num, String str2, Boolean bool, String str3, String str4, List<WallWallpostAttachmentDto> list2, WallPostCopyrightDto wallPostCopyrightDto, Integer num2, Integer num3, UserId userId3, WallGeoDto wallGeoDto, Integer num4, Boolean bool2, Boolean bool3, BaseLikesInfoDto baseLikesInfoDto, UserId userId4, Integer num5, List<Integer> list3, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto2, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId5, String str5, WallViewsDto wallViewsDto) {
            super(null);
            this.copyHistory = list;
            this.canEdit = baseBoolIntDto;
            this.createdBy = userId;
            this.canDelete = baseBoolIntDto2;
            this.canPin = baseBoolIntDto3;
            this.donut = wallWallpostDonutDto;
            this.isPinned = baseBoolIntDto4;
            this.comments = baseCommentsInfoDto;
            this.markedAsAds = baseBoolIntDto5;
            this.topicId = topicIdDto;
            this.shortTextRate = f;
            this.hash = str;
            this.type = wallPostTypeDto;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.toId = userId2;
            this.carouselOffset = num;
            this.accessKey = str2;
            this.isDeleted = bool;
            this.deletedReason = str3;
            this.deletedDetails = str4;
            this.attachments = list2;
            this.copyright = wallPostCopyrightDto;
            this.date = num2;
            this.edited = num3;
            this.fromId = userId3;
            this.geo = wallGeoDto;
            this.id = num4;
            this.isArchived = bool2;
            this.isFavorite = bool3;
            this.likes = baseLikesInfoDto;
            this.ownerId = userId4;
            this.postId = num5;
            this.parentsStack = list3;
            this.postSource = wallPostSourceDto;
            this.postType = wallPostTypeDto2;
            this.reposts = baseRepostsInfoDto;
            this.signerId = userId5;
            this.text = str5;
            this.views = wallViewsDto;
        }
    }

    public /* synthetic */ WallWallItemDto(zcl zclVar) {
        this();
    }

    private WallWallItemDto() {
    }
}
