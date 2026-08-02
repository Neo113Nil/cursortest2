package com.vk.sdk.api.ads.dto;

import com.ironsource.D1;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.base.dto.BaseLinkButtonActionDto;
import com.vk.sdk.api.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.sdk.api.video.dto.VideoVideoFullDto;
import com.vk.sdk.api.wall.dto.WallWallpostFullDto;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.urd0;
import xsna.vr;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsItemBlockAdItemDto.kt */
/* loaded from: classes5.dex */
public final class AdsItemBlockAdItemDto {

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("ad_data")
    private final String adData;

    @pmi0("ad_data_impression")
    private final String adDataImpression;

    @pmi0("age_restriction")
    private final String ageRestriction;

    @pmi0("android_app")
    private final AdsItemBlockAdAppDto androidApp;

    @pmi0("button")
    private final String button;

    @pmi0("button_open")
    private final String buttonOpen;

    @pmi0("cards")
    private final List<AdsItemBlockAdCardDto> cards;

    @pmi0("description")
    private final String description;

    @pmi0("disclaimer")
    private final String disclaimer;

    @pmi0("disclaimer_img")
    private final AdsItemBlockDisclaimerImgDto disclaimerImg;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("feedback")
    private final NewsfeedItemWallpostFeedbackDto feedback;

    @pmi0("followers")
    private final String followers;

    @pmi0("genre")
    private final String genre;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("header_catch_up_link")
    private final AdsCatchUpLinkDto headerCatchUpLink;

    @pmi0("html5_app")
    private final AdsHtml5GameDto html5App;

    @pmi0("ios_app")
    private final AdsItemBlockAdAppIosDto iosApp;

    @pmi0("is_description_clickable")
    private final Boolean isDescriptionClickable;

    @pmi0(CampaignEx.JSON_KEY_LINK_TYPE)
    private final LinkTypeDto linkType;

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("link_url_target")
    private final LinkUrlTargetDto linkUrlTarget;

    @pmi0("links")
    private final AdsItemBlockAdBannerBaseLinksDto links;

    @pmi0("photo_icon")
    private final List<AdsItemBlockAdPhotoBaseDto> photoIcon;

    @pmi0("photo_main")
    private final List<AdsItemBlockAdPhotoMainDto> photoMain;

    @pmi0("post")
    private final WallWallpostFullDto post;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("short_text_rate")
    private final Float shortTextRate;

    @pmi0("site_description")
    private final String siteDescription;

    @pmi0("skad")
    private final AdsSkadDto skad;

    @pmi0("statistics")
    private final List<AdsItemBlockAdStatPixelDto> statistics;

    @pmi0("time_to_live")
    private final Integer timeToLive;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("video")
    private final VideoVideoFullDto video;

    @pmi0("wphone_app")
    private final AdsItemBlockAdAppDto wphoneApp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdItemDto.kt */
    public static final class LinkTypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkTypeDto[] $VALUES;

        @pmi0("join_group_and_open_url")
        public static final LinkTypeDto JOIN_GROUP_AND_OPEN_URL;

        @pmi0("open_url")
        public static final LinkTypeDto OPEN_URL;

        @pmi0("user_subscribe_and_open_url")
        public static final LinkTypeDto USER_SUBSCRIBE_AND_OPEN_URL;
        private final String value;

        static {
            LinkTypeDto linkTypeDto = new LinkTypeDto("OPEN_URL", 0, "open_url");
            OPEN_URL = linkTypeDto;
            LinkTypeDto linkTypeDto2 = new LinkTypeDto("JOIN_GROUP_AND_OPEN_URL", 1, "join_group_and_open_url");
            JOIN_GROUP_AND_OPEN_URL = linkTypeDto2;
            LinkTypeDto linkTypeDto3 = new LinkTypeDto("USER_SUBSCRIBE_AND_OPEN_URL", 2, "user_subscribe_and_open_url");
            USER_SUBSCRIBE_AND_OPEN_URL = linkTypeDto3;
            LinkTypeDto[] linkTypeDtoArr = {linkTypeDto, linkTypeDto2, linkTypeDto3};
            $VALUES = linkTypeDtoArr;
            $ENTRIES = new asp(linkTypeDtoArr);
        }

        private LinkTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkTypeDto valueOf(String str) {
            return (LinkTypeDto) Enum.valueOf(LinkTypeDto.class, str);
        }

        public static LinkTypeDto[] values() {
            return (LinkTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdItemDto.kt */
    public static final class LinkUrlTargetDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkUrlTargetDto[] $VALUES;

        @pmi0(D1.e)
        public static final LinkUrlTargetDto EXTERNAL;

        @pmi0("internal")
        public static final LinkUrlTargetDto INTERNAL;

        @pmi0("internal_hidden")
        public static final LinkUrlTargetDto INTERNAL_HIDDEN;
        private final String value;

        static {
            LinkUrlTargetDto linkUrlTargetDto = new LinkUrlTargetDto("INTERNAL", 0, "internal");
            INTERNAL = linkUrlTargetDto;
            LinkUrlTargetDto linkUrlTargetDto2 = new LinkUrlTargetDto("EXTERNAL", 1, D1.e);
            EXTERNAL = linkUrlTargetDto2;
            LinkUrlTargetDto linkUrlTargetDto3 = new LinkUrlTargetDto("INTERNAL_HIDDEN", 2, "internal_hidden");
            INTERNAL_HIDDEN = linkUrlTargetDto3;
            LinkUrlTargetDto[] linkUrlTargetDtoArr = {linkUrlTargetDto, linkUrlTargetDto2, linkUrlTargetDto3};
            $VALUES = linkUrlTargetDtoArr;
            $ENTRIES = new asp(linkUrlTargetDtoArr);
        }

        private LinkUrlTargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkUrlTargetDto valueOf(String str) {
            return (LinkUrlTargetDto) Enum.valueOf(LinkUrlTargetDto.class, str);
        }

        public static LinkUrlTargetDto[] values() {
            return (LinkUrlTargetDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdItemDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;

        @pmi0("app_slider")
        public static final TypeDto APP_SLIDER;

        @pmi0("app_video")
        public static final TypeDto APP_VIDEO;

        @pmi0("html5_ad")
        public static final TypeDto HTML5_AD;

        @pmi0("post")
        public static final TypeDto POST;

        @pmi0("site")
        public static final TypeDto SITE;

        @pmi0("site_slider")
        public static final TypeDto SITE_SLIDER;

        @pmi0("site_video")
        public static final TypeDto SITE_VIDEO;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("POST", 0, "post");
            POST = typeDto;
            TypeDto typeDto2 = new TypeDto("APP", 1, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto2;
            TypeDto typeDto3 = new TypeDto("SITE", 2, "site");
            SITE = typeDto3;
            TypeDto typeDto4 = new TypeDto("SITE_SLIDER", 3, "site_slider");
            SITE_SLIDER = typeDto4;
            TypeDto typeDto5 = new TypeDto("SITE_VIDEO", 4, "site_video");
            SITE_VIDEO = typeDto5;
            TypeDto typeDto6 = new TypeDto("APP_SLIDER", 5, "app_slider");
            APP_SLIDER = typeDto6;
            TypeDto typeDto7 = new TypeDto("APP_VIDEO", 6, "app_video");
            APP_VIDEO = typeDto7;
            TypeDto typeDto8 = new TypeDto("HTML5_AD", 7, "html5_ad");
            HTML5_AD = typeDto8;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8};
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

    public AdsItemBlockAdItemDto(TypeDto typeDto, String str, String str2, String str3, String str4, AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto, String str5, List<AdsItemBlockAdCardDto> list, Integer num, List<AdsItemBlockAdPhotoBaseDto> list2, VideoVideoFullDto videoVideoFullDto, AdsHtml5GameDto adsHtml5GameDto, BaseLinkButtonActionDto baseLinkButtonActionDto, WallWallpostFullDto wallWallpostFullDto, AdsSkadDto adsSkadDto, Float f, Boolean bool, AdsCatchUpLinkDto adsCatchUpLinkDto, List<AdsItemBlockAdStatPixelDto> list3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, String str6, String str7, List<AdsItemBlockAdPhotoMainDto> list4, String str8, Float f2, String str9, String str10, String str11, String str12, String str13, LinkUrlTargetDto linkUrlTargetDto, LinkTypeDto linkTypeDto, UserId userId, UserId userId2, AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto, AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto2) {
        this.type = typeDto;
        this.adData = str;
        this.adDataImpression = str2;
        this.ageRestriction = str3;
        this.disclaimer = str4;
        this.disclaimerImg = adsItemBlockDisclaimerImgDto;
        this.genre = str5;
        this.cards = list;
        this.timeToLive = num;
        this.photoIcon = list2;
        this.video = videoVideoFullDto;
        this.html5App = adsHtml5GameDto;
        this.action = baseLinkButtonActionDto;
        this.post = wallWallpostFullDto;
        this.skad = adsSkadDto;
        this.shortTextRate = f;
        this.isDescriptionClickable = bool;
        this.headerCatchUpLink = adsCatchUpLinkDto;
        this.statistics = list3;
        this.feedback = newsfeedItemWallpostFeedbackDto;
        this.title = str6;
        this.description = str7;
        this.photoMain = list4;
        this.followers = str8;
        this.rating = f2;
        this.domain = str9;
        this.siteDescription = str10;
        this.button = str11;
        this.buttonOpen = str12;
        this.linkUrl = str13;
        this.linkUrlTarget = linkUrlTargetDto;
        this.linkType = linkTypeDto;
        this.groupId = userId;
        this.userId = userId2;
        this.links = adsItemBlockAdBannerBaseLinksDto;
        this.androidApp = adsItemBlockAdAppDto;
        this.iosApp = adsItemBlockAdAppIosDto;
        this.wphoneApp = adsItemBlockAdAppDto2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdItemDto)) {
            return false;
        }
        AdsItemBlockAdItemDto adsItemBlockAdItemDto = (AdsItemBlockAdItemDto) obj;
        return this.type == adsItemBlockAdItemDto.type && epx.f(this.adData, adsItemBlockAdItemDto.adData) && epx.f(this.adDataImpression, adsItemBlockAdItemDto.adDataImpression) && epx.f(this.ageRestriction, adsItemBlockAdItemDto.ageRestriction) && epx.f(this.disclaimer, adsItemBlockAdItemDto.disclaimer) && epx.f(this.disclaimerImg, adsItemBlockAdItemDto.disclaimerImg) && epx.f(this.genre, adsItemBlockAdItemDto.genre) && epx.f(this.cards, adsItemBlockAdItemDto.cards) && epx.f(this.timeToLive, adsItemBlockAdItemDto.timeToLive) && epx.f(this.photoIcon, adsItemBlockAdItemDto.photoIcon) && epx.f(this.video, adsItemBlockAdItemDto.video) && epx.f(this.html5App, adsItemBlockAdItemDto.html5App) && epx.f(this.action, adsItemBlockAdItemDto.action) && epx.f(this.post, adsItemBlockAdItemDto.post) && epx.f(this.skad, adsItemBlockAdItemDto.skad) && epx.f(this.shortTextRate, adsItemBlockAdItemDto.shortTextRate) && epx.f(this.isDescriptionClickable, adsItemBlockAdItemDto.isDescriptionClickable) && epx.f(this.headerCatchUpLink, adsItemBlockAdItemDto.headerCatchUpLink) && epx.f(this.statistics, adsItemBlockAdItemDto.statistics) && epx.f(this.feedback, adsItemBlockAdItemDto.feedback) && epx.f(this.title, adsItemBlockAdItemDto.title) && epx.f(this.description, adsItemBlockAdItemDto.description) && epx.f(this.photoMain, adsItemBlockAdItemDto.photoMain) && epx.f(this.followers, adsItemBlockAdItemDto.followers) && epx.f(this.rating, adsItemBlockAdItemDto.rating) && epx.f(this.domain, adsItemBlockAdItemDto.domain) && epx.f(this.siteDescription, adsItemBlockAdItemDto.siteDescription) && epx.f(this.button, adsItemBlockAdItemDto.button) && epx.f(this.buttonOpen, adsItemBlockAdItemDto.buttonOpen) && epx.f(this.linkUrl, adsItemBlockAdItemDto.linkUrl) && this.linkUrlTarget == adsItemBlockAdItemDto.linkUrlTarget && this.linkType == adsItemBlockAdItemDto.linkType && epx.f(this.groupId, adsItemBlockAdItemDto.groupId) && epx.f(this.userId, adsItemBlockAdItemDto.userId) && epx.f(this.links, adsItemBlockAdItemDto.links) && epx.f(this.androidApp, adsItemBlockAdItemDto.androidApp) && epx.f(this.iosApp, adsItemBlockAdItemDto.iosApp) && epx.f(this.wphoneApp, adsItemBlockAdItemDto.wphoneApp);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.adData), 31, this.adDataImpression);
        String str = this.ageRestriction;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.disclaimer;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto = this.disclaimerImg;
        int hashCode3 = (hashCode2 + (adsItemBlockDisclaimerImgDto == null ? 0 : adsItemBlockDisclaimerImgDto.hashCode())) * 31;
        String str3 = this.genre;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AdsItemBlockAdCardDto> list = this.cards;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.timeToLive;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<AdsItemBlockAdPhotoBaseDto> list2 = this.photoIcon;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode8 = (hashCode7 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        AdsHtml5GameDto adsHtml5GameDto = this.html5App;
        int hashCode9 = (hashCode8 + (adsHtml5GameDto == null ? 0 : adsHtml5GameDto.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode10 = (hashCode9 + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        WallWallpostFullDto wallWallpostFullDto = this.post;
        int hashCode11 = (hashCode10 + (wallWallpostFullDto == null ? 0 : wallWallpostFullDto.hashCode())) * 31;
        AdsSkadDto adsSkadDto = this.skad;
        int hashCode12 = (hashCode11 + (adsSkadDto == null ? 0 : adsSkadDto.hashCode())) * 31;
        Float f = this.shortTextRate;
        int hashCode13 = (hashCode12 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.isDescriptionClickable;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        AdsCatchUpLinkDto adsCatchUpLinkDto = this.headerCatchUpLink;
        int hashCode15 = (hashCode14 + (adsCatchUpLinkDto == null ? 0 : adsCatchUpLinkDto.hashCode())) * 31;
        List<AdsItemBlockAdStatPixelDto> list3 = this.statistics;
        int hashCode16 = (hashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        int hashCode17 = (hashCode16 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
        String str4 = this.title;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int hashCode19 = (hashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<AdsItemBlockAdPhotoMainDto> list4 = this.photoMain;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str6 = this.followers;
        int hashCode21 = (hashCode20 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f2 = this.rating;
        int hashCode22 = (hashCode21 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str7 = this.domain;
        int hashCode23 = (hashCode22 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.siteDescription;
        int hashCode24 = (hashCode23 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.button;
        int hashCode25 = (hashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.buttonOpen;
        int hashCode26 = (hashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.linkUrl;
        int hashCode27 = (hashCode26 + (str11 == null ? 0 : str11.hashCode())) * 31;
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        int hashCode28 = (hashCode27 + (linkUrlTargetDto == null ? 0 : linkUrlTargetDto.hashCode())) * 31;
        LinkTypeDto linkTypeDto = this.linkType;
        int hashCode29 = (hashCode28 + (linkTypeDto == null ? 0 : linkTypeDto.hashCode())) * 31;
        UserId userId = this.groupId;
        int hashCode30 = (hashCode29 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.userId;
        int hashCode31 = (hashCode30 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto = this.links;
        int hashCode32 = (hashCode31 + (adsItemBlockAdBannerBaseLinksDto == null ? 0 : adsItemBlockAdBannerBaseLinksDto.hashCode())) * 31;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto = this.androidApp;
        int hashCode33 = (hashCode32 + (adsItemBlockAdAppDto == null ? 0 : adsItemBlockAdAppDto.hashCode())) * 31;
        AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto = this.iosApp;
        int hashCode34 = (hashCode33 + (adsItemBlockAdAppIosDto == null ? 0 : adsItemBlockAdAppIosDto.hashCode())) * 31;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto2 = this.wphoneApp;
        return hashCode34 + (adsItemBlockAdAppDto2 != null ? adsItemBlockAdAppDto2.hashCode() : 0);
    }

    public final String toString() {
        TypeDto typeDto = this.type;
        String str = this.adData;
        String str2 = this.adDataImpression;
        String str3 = this.ageRestriction;
        String str4 = this.disclaimer;
        AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto = this.disclaimerImg;
        String str5 = this.genre;
        List<AdsItemBlockAdCardDto> list = this.cards;
        Integer num = this.timeToLive;
        List<AdsItemBlockAdPhotoBaseDto> list2 = this.photoIcon;
        VideoVideoFullDto videoVideoFullDto = this.video;
        AdsHtml5GameDto adsHtml5GameDto = this.html5App;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        WallWallpostFullDto wallWallpostFullDto = this.post;
        AdsSkadDto adsSkadDto = this.skad;
        Float f = this.shortTextRate;
        Boolean bool = this.isDescriptionClickable;
        AdsCatchUpLinkDto adsCatchUpLinkDto = this.headerCatchUpLink;
        List<AdsItemBlockAdStatPixelDto> list3 = this.statistics;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        String str6 = this.title;
        String str7 = this.description;
        List<AdsItemBlockAdPhotoMainDto> list4 = this.photoMain;
        String str8 = this.followers;
        Float f2 = this.rating;
        String str9 = this.domain;
        String str10 = this.siteDescription;
        String str11 = this.button;
        String str12 = this.buttonOpen;
        String str13 = this.linkUrl;
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        LinkTypeDto linkTypeDto = this.linkType;
        UserId userId = this.groupId;
        UserId userId2 = this.userId;
        AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto = this.links;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto = this.androidApp;
        AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto = this.iosApp;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto2 = this.wphoneApp;
        StringBuilder sb = new StringBuilder("AdsItemBlockAdItemDto(type=");
        sb.append(typeDto);
        sb.append(", adData=");
        sb.append(str);
        sb.append(", adDataImpression=");
        n6j.b(sb, str2, ", ageRestriction=", str3, ", disclaimer=");
        sb.append(str4);
        sb.append(", disclaimerImg=");
        sb.append(adsItemBlockDisclaimerImgDto);
        sb.append(", genre=");
        b.c(str5, ", cards=", ", timeToLive=", sb, list);
        sb.append(num);
        sb.append(", photoIcon=");
        sb.append(list2);
        sb.append(", video=");
        sb.append(videoVideoFullDto);
        sb.append(", html5App=");
        sb.append(adsHtml5GameDto);
        sb.append(", action=");
        sb.append(baseLinkButtonActionDto);
        sb.append(", post=");
        sb.append(wallWallpostFullDto);
        sb.append(", skad=");
        sb.append(adsSkadDto);
        sb.append(", shortTextRate=");
        sb.append(f);
        sb.append(", isDescriptionClickable=");
        sb.append(bool);
        sb.append(", headerCatchUpLink=");
        sb.append(adsCatchUpLinkDto);
        sb.append(", statistics=");
        sb.append(list3);
        sb.append(", feedback=");
        sb.append(newsfeedItemWallpostFeedbackDto);
        sb.append(", title=");
        n6j.b(sb, str6, ", description=", str7, ", photoMain=");
        vr.c(", followers=", str8, ", rating=", sb, list4);
        sb.append(f2);
        sb.append(", domain=");
        sb.append(str9);
        sb.append(", siteDescription=");
        n6j.b(sb, str10, ", button=", str11, ", buttonOpen=");
        n6j.b(sb, str12, ", linkUrl=", str13, ", linkUrlTarget=");
        sb.append(linkUrlTargetDto);
        sb.append(", linkType=");
        sb.append(linkTypeDto);
        sb.append(", groupId=");
        sb.append(userId);
        sb.append(", userId=");
        sb.append(userId2);
        sb.append(", links=");
        sb.append(adsItemBlockAdBannerBaseLinksDto);
        sb.append(", androidApp=");
        sb.append(adsItemBlockAdAppDto);
        sb.append(", iosApp=");
        sb.append(adsItemBlockAdAppIosDto);
        sb.append(", wphoneApp=");
        sb.append(adsItemBlockAdAppDto2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ AdsItemBlockAdItemDto(TypeDto typeDto, String str, String str2, String str3, String str4, AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto, String str5, List list, Integer num, List list2, VideoVideoFullDto videoVideoFullDto, AdsHtml5GameDto adsHtml5GameDto, BaseLinkButtonActionDto baseLinkButtonActionDto, WallWallpostFullDto wallWallpostFullDto, AdsSkadDto adsSkadDto, Float f, Boolean bool, AdsCatchUpLinkDto adsCatchUpLinkDto, List list3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, String str6, String str7, List list4, String str8, Float f2, String str9, String str10, String str11, String str12, String str13, LinkUrlTargetDto linkUrlTargetDto, LinkTypeDto linkTypeDto, UserId userId, UserId userId2, AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto, AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto2, int i, int i2, zcl zclVar) {
        this(typeDto, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : adsItemBlockDisclaimerImgDto, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : videoVideoFullDto, (i & 2048) != 0 ? null : adsHtml5GameDto, (i & 4096) != 0 ? null : baseLinkButtonActionDto, (i & 8192) != 0 ? null : wallWallpostFullDto, (i & 16384) != 0 ? null : adsSkadDto, (32768 & i) != 0 ? null : f, (65536 & i) != 0 ? null : bool, (131072 & i) != 0 ? null : adsCatchUpLinkDto, (262144 & i) != 0 ? null : list3, (524288 & i) != 0 ? null : newsfeedItemWallpostFeedbackDto, (1048576 & i) != 0 ? null : str6, (2097152 & i) != 0 ? null : str7, (4194304 & i) != 0 ? null : list4, (8388608 & i) != 0 ? null : str8, (16777216 & i) != 0 ? null : f2, (33554432 & i) != 0 ? null : str9, (67108864 & i) != 0 ? null : str10, (134217728 & i) != 0 ? null : str11, (268435456 & i) != 0 ? null : str12, (536870912 & i) != 0 ? null : str13, (1073741824 & i) != 0 ? null : linkUrlTargetDto, (i & Integer.MIN_VALUE) != 0 ? null : linkTypeDto, (i2 & 1) != 0 ? null : userId, (i2 & 2) != 0 ? null : userId2, (i2 & 4) != 0 ? null : adsItemBlockAdBannerBaseLinksDto, (i2 & 8) != 0 ? null : adsItemBlockAdAppDto, (i2 & 16) != 0 ? null : adsItemBlockAdAppIosDto, (i2 & 32) != 0 ? null : adsItemBlockAdAppDto2);
    }
}
