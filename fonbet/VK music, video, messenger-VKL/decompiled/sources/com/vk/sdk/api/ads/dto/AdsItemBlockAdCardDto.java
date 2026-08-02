package com.vk.sdk.api.ads.dto;

import com.ironsource.D1;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.vr;
import xsna.xe9;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsItemBlockAdCardDto.kt */
/* loaded from: classes5.dex */
public final class AdsItemBlockAdCardDto {

    @pmi0("android_app")
    private final AdsItemBlockAdAppDto androidApp;

    @pmi0("button")
    private final String button;

    @pmi0("button_open")
    private final String buttonOpen;

    @pmi0("card_id")
    private final String cardId;

    @pmi0("description")
    private final String description;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("followers")
    private final String followers;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("ios_app")
    private final AdsItemBlockAdAppIosDto iosApp;

    @pmi0(CampaignEx.JSON_KEY_LINK_TYPE)
    private final LinkTypeDto linkType;

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("link_url_target")
    private final LinkUrlTargetDto linkUrlTarget;

    @pmi0("links")
    private final AdsItemBlockAdBannerBaseLinksDto links;

    @pmi0("old_price")
    private final String oldPrice;

    @pmi0("photo_main")
    private final List<AdsItemBlockAdPhotoMainDto> photoMain;

    @pmi0("price")
    private final String price;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("site_description")
    private final String siteDescription;

    @pmi0("statistics")
    private final List<AdsItemBlockAdStatPixelDto> statistics;

    @pmi0("title")
    private final String title;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("wphone_app")
    private final AdsItemBlockAdAppDto wphoneApp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdCardDto.kt */
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
    /* compiled from: AdsItemBlockAdCardDto.kt */
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

    public AdsItemBlockAdCardDto(String str, String str2, String str3, List<AdsItemBlockAdStatPixelDto> list, String str4, String str5, List<AdsItemBlockAdPhotoMainDto> list2, String str6, Float f, String str7, String str8, String str9, String str10, String str11, LinkUrlTargetDto linkUrlTargetDto, LinkTypeDto linkTypeDto, UserId userId, UserId userId2, AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto, AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto2) {
        this.cardId = str;
        this.price = str2;
        this.oldPrice = str3;
        this.statistics = list;
        this.title = str4;
        this.description = str5;
        this.photoMain = list2;
        this.followers = str6;
        this.rating = f;
        this.domain = str7;
        this.siteDescription = str8;
        this.button = str9;
        this.buttonOpen = str10;
        this.linkUrl = str11;
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
        if (!(obj instanceof AdsItemBlockAdCardDto)) {
            return false;
        }
        AdsItemBlockAdCardDto adsItemBlockAdCardDto = (AdsItemBlockAdCardDto) obj;
        return epx.f(this.cardId, adsItemBlockAdCardDto.cardId) && epx.f(this.price, adsItemBlockAdCardDto.price) && epx.f(this.oldPrice, adsItemBlockAdCardDto.oldPrice) && epx.f(this.statistics, adsItemBlockAdCardDto.statistics) && epx.f(this.title, adsItemBlockAdCardDto.title) && epx.f(this.description, adsItemBlockAdCardDto.description) && epx.f(this.photoMain, adsItemBlockAdCardDto.photoMain) && epx.f(this.followers, adsItemBlockAdCardDto.followers) && epx.f(this.rating, adsItemBlockAdCardDto.rating) && epx.f(this.domain, adsItemBlockAdCardDto.domain) && epx.f(this.siteDescription, adsItemBlockAdCardDto.siteDescription) && epx.f(this.button, adsItemBlockAdCardDto.button) && epx.f(this.buttonOpen, adsItemBlockAdCardDto.buttonOpen) && epx.f(this.linkUrl, adsItemBlockAdCardDto.linkUrl) && this.linkUrlTarget == adsItemBlockAdCardDto.linkUrlTarget && this.linkType == adsItemBlockAdCardDto.linkType && epx.f(this.groupId, adsItemBlockAdCardDto.groupId) && epx.f(this.userId, adsItemBlockAdCardDto.userId) && epx.f(this.links, adsItemBlockAdCardDto.links) && epx.f(this.androidApp, adsItemBlockAdCardDto.androidApp) && epx.f(this.iosApp, adsItemBlockAdCardDto.iosApp) && epx.f(this.wphoneApp, adsItemBlockAdCardDto.wphoneApp);
    }

    public final int hashCode() {
        int hashCode = this.cardId.hashCode() * 31;
        String str = this.price;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.oldPrice;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AdsItemBlockAdStatPixelDto> list = this.statistics;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.title;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<AdsItemBlockAdPhotoMainDto> list2 = this.photoMain;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.followers;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.rating;
        int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
        String str6 = this.domain;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.siteDescription;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.button;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.buttonOpen;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.linkUrl;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        int hashCode15 = (hashCode14 + (linkUrlTargetDto == null ? 0 : linkUrlTargetDto.hashCode())) * 31;
        LinkTypeDto linkTypeDto = this.linkType;
        int hashCode16 = (hashCode15 + (linkTypeDto == null ? 0 : linkTypeDto.hashCode())) * 31;
        UserId userId = this.groupId;
        int hashCode17 = (hashCode16 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.userId;
        int hashCode18 = (hashCode17 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto = this.links;
        int hashCode19 = (hashCode18 + (adsItemBlockAdBannerBaseLinksDto == null ? 0 : adsItemBlockAdBannerBaseLinksDto.hashCode())) * 31;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto = this.androidApp;
        int hashCode20 = (hashCode19 + (adsItemBlockAdAppDto == null ? 0 : adsItemBlockAdAppDto.hashCode())) * 31;
        AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto = this.iosApp;
        int hashCode21 = (hashCode20 + (adsItemBlockAdAppIosDto == null ? 0 : adsItemBlockAdAppIosDto.hashCode())) * 31;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto2 = this.wphoneApp;
        return hashCode21 + (adsItemBlockAdAppDto2 != null ? adsItemBlockAdAppDto2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.cardId;
        String str2 = this.price;
        String str3 = this.oldPrice;
        List<AdsItemBlockAdStatPixelDto> list = this.statistics;
        String str4 = this.title;
        String str5 = this.description;
        List<AdsItemBlockAdPhotoMainDto> list2 = this.photoMain;
        String str6 = this.followers;
        Float f = this.rating;
        String str7 = this.domain;
        String str8 = this.siteDescription;
        String str9 = this.button;
        String str10 = this.buttonOpen;
        String str11 = this.linkUrl;
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        LinkTypeDto linkTypeDto = this.linkType;
        UserId userId = this.groupId;
        UserId userId2 = this.userId;
        AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto = this.links;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto = this.androidApp;
        AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto = this.iosApp;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto2 = this.wphoneApp;
        StringBuilder a = xe9.a("AdsItemBlockAdCardDto(cardId=", str, ", price=", str2, ", oldPrice=");
        b.c(str3, ", statistics=", ", title=", a, list);
        n6j.b(a, str4, ", description=", str5, ", photoMain=");
        vr.c(", followers=", str6, ", rating=", a, list2);
        a.append(f);
        a.append(", domain=");
        a.append(str7);
        a.append(", siteDescription=");
        n6j.b(a, str8, ", button=", str9, ", buttonOpen=");
        n6j.b(a, str10, ", linkUrl=", str11, ", linkUrlTarget=");
        a.append(linkUrlTargetDto);
        a.append(", linkType=");
        a.append(linkTypeDto);
        a.append(", groupId=");
        a.append(userId);
        a.append(", userId=");
        a.append(userId2);
        a.append(", links=");
        a.append(adsItemBlockAdBannerBaseLinksDto);
        a.append(", androidApp=");
        a.append(adsItemBlockAdAppDto);
        a.append(", iosApp=");
        a.append(adsItemBlockAdAppIosDto);
        a.append(", wphoneApp=");
        a.append(adsItemBlockAdAppDto2);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ AdsItemBlockAdCardDto(String str, String str2, String str3, List list, String str4, String str5, List list2, String str6, Float f, String str7, String str8, String str9, String str10, String str11, LinkUrlTargetDto linkUrlTargetDto, LinkTypeDto linkTypeDto, UserId userId, UserId userId2, AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto, AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : linkUrlTargetDto, (i & 32768) != 0 ? null : linkTypeDto, (i & 65536) != 0 ? null : userId, (i & 131072) != 0 ? null : userId2, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : adsItemBlockAdBannerBaseLinksDto, (i & 524288) != 0 ? null : adsItemBlockAdAppDto, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : adsItemBlockAdAppIosDto, (i & 2097152) != 0 ? null : adsItemBlockAdAppDto2);
    }
}
