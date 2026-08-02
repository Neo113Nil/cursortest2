package com.vk.sdk.api.apps.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.kr;
import xsna.mq;
import xsna.n6j;
import xsna.oq;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.uq;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsAppDto.kt */
/* loaded from: classes5.dex */
public final class AppsAppDto {

    @pmi0("author_owner_id")
    private final Integer authorOwnerId;

    @pmi0("author_url")
    private final String authorUrl;

    @pmi0("background_loader_color")
    private final String backgroundLoaderColor;

    @pmi0("banner_1120")
    private final String banner1120;

    @pmi0("banner_560")
    private final String banner560;

    @pmi0("catalog_position")
    private final Integer catalogPosition;

    @pmi0("description")
    private final String description;

    @pmi0("friends")
    private final List<Integer> friends;

    @pmi0("genre")
    private final String genre;

    @pmi0("genre_id")
    private final Integer genreId;

    @pmi0("icon_139")
    private final String icon139;

    @pmi0("icon_150")
    private final String icon150;

    @pmi0("icon_16")
    private final String icon16;

    @pmi0("icon_278")
    private final String icon278;

    @pmi0("icon_576")
    private final String icon576;

    @pmi0("icon_75")
    private final String icon75;

    @pmi0("id")
    private final int id;

    @pmi0("international")
    private final Boolean international;

    @pmi0("is_in_catalog")
    private final Integer isInCatalog;

    @pmi0("is_installed")
    private final Boolean isInstalled;

    @pmi0("is_new")
    private final BaseBoolIntDto isNew;

    @pmi0("leaderboard_type")
    private final AppsAppLeaderboardTypeDto leaderboardType;

    @pmi0("loader_icon")
    private final String loaderIcon;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("open_in_external_browser")
    private final Boolean openInExternalBrowser;

    @pmi0("platform_id")
    private final String platformId;

    @pmi0("published_date")
    private final Integer publishedDate;

    @pmi0("push_enabled")
    private final BaseBoolIntDto pushEnabled;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("screen_orientation")
    private final Integer screenOrientation;

    @pmi0("section")
    private final String section;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final AppsAppTypeDto type;

    public AppsAppDto(AppsAppTypeDto appsAppTypeDto, int i, String str, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, List<Integer> list, Integer num, String str6, String str7, Integer num2, Boolean bool, Integer num3, AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto, Integer num4, String str8, Integer num5, String str9, String str10, Integer num6, Boolean bool2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool3, Integer num7) {
        this.type = appsAppTypeDto;
        this.id = i;
        this.title = str;
        this.authorUrl = str2;
        this.banner1120 = str3;
        this.banner560 = str4;
        this.icon16 = str5;
        this.isNew = baseBoolIntDto;
        this.pushEnabled = baseBoolIntDto2;
        this.friends = list;
        this.catalogPosition = num;
        this.description = str6;
        this.genre = str7;
        this.genreId = num2;
        this.international = bool;
        this.isInCatalog = num3;
        this.leaderboardType = appsAppLeaderboardTypeDto;
        this.membersCount = num4;
        this.platformId = str8;
        this.publishedDate = num5;
        this.screenName = str9;
        this.section = str10;
        this.authorOwnerId = num6;
        this.isInstalled = bool2;
        this.icon139 = str11;
        this.icon150 = str12;
        this.icon278 = str13;
        this.icon576 = str14;
        this.backgroundLoaderColor = str15;
        this.loaderIcon = str16;
        this.icon75 = str17;
        this.openInExternalBrowser = bool3;
        this.screenOrientation = num7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppDto)) {
            return false;
        }
        AppsAppDto appsAppDto = (AppsAppDto) obj;
        return this.type == appsAppDto.type && this.id == appsAppDto.id && epx.f(this.title, appsAppDto.title) && epx.f(this.authorUrl, appsAppDto.authorUrl) && epx.f(this.banner1120, appsAppDto.banner1120) && epx.f(this.banner560, appsAppDto.banner560) && epx.f(this.icon16, appsAppDto.icon16) && this.isNew == appsAppDto.isNew && this.pushEnabled == appsAppDto.pushEnabled && epx.f(this.friends, appsAppDto.friends) && epx.f(this.catalogPosition, appsAppDto.catalogPosition) && epx.f(this.description, appsAppDto.description) && epx.f(this.genre, appsAppDto.genre) && epx.f(this.genreId, appsAppDto.genreId) && epx.f(this.international, appsAppDto.international) && epx.f(this.isInCatalog, appsAppDto.isInCatalog) && this.leaderboardType == appsAppDto.leaderboardType && epx.f(this.membersCount, appsAppDto.membersCount) && epx.f(this.platformId, appsAppDto.platformId) && epx.f(this.publishedDate, appsAppDto.publishedDate) && epx.f(this.screenName, appsAppDto.screenName) && epx.f(this.section, appsAppDto.section) && epx.f(this.authorOwnerId, appsAppDto.authorOwnerId) && epx.f(this.isInstalled, appsAppDto.isInstalled) && epx.f(this.icon139, appsAppDto.icon139) && epx.f(this.icon150, appsAppDto.icon150) && epx.f(this.icon278, appsAppDto.icon278) && epx.f(this.icon576, appsAppDto.icon576) && epx.f(this.backgroundLoaderColor, appsAppDto.backgroundLoaderColor) && epx.f(this.loaderIcon, appsAppDto.loaderIcon) && epx.f(this.icon75, appsAppDto.icon75) && epx.f(this.openInExternalBrowser, appsAppDto.openInExternalBrowser) && epx.f(this.screenOrientation, appsAppDto.screenOrientation);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.id, this.type.hashCode() * 31, 31), 31, this.title);
        String str = this.authorUrl;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.banner1120;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.banner560;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon16;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isNew;
        int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.pushEnabled;
        int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        List<Integer> list = this.friends;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.catalogPosition;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.description;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.genre;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.genreId;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.international;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.isInCatalog;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto = this.leaderboardType;
        int hashCode14 = (hashCode13 + (appsAppLeaderboardTypeDto == null ? 0 : appsAppLeaderboardTypeDto.hashCode())) * 31;
        Integer num4 = this.membersCount;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.platformId;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num5 = this.publishedDate;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str8 = this.screenName;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.section;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num6 = this.authorOwnerId;
        int hashCode20 = (hashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool2 = this.isInstalled;
        int hashCode21 = (hashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str10 = this.icon139;
        int hashCode22 = (hashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.icon150;
        int hashCode23 = (hashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.icon278;
        int hashCode24 = (hashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.icon576;
        int hashCode25 = (hashCode24 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.backgroundLoaderColor;
        int hashCode26 = (hashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.loaderIcon;
        int hashCode27 = (hashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.icon75;
        int hashCode28 = (hashCode27 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool3 = this.openInExternalBrowser;
        int hashCode29 = (hashCode28 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num7 = this.screenOrientation;
        return hashCode29 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        AppsAppTypeDto appsAppTypeDto = this.type;
        int i = this.id;
        String str = this.title;
        String str2 = this.authorUrl;
        String str3 = this.banner1120;
        String str4 = this.banner560;
        String str5 = this.icon16;
        BaseBoolIntDto baseBoolIntDto = this.isNew;
        BaseBoolIntDto baseBoolIntDto2 = this.pushEnabled;
        List<Integer> list = this.friends;
        Integer num = this.catalogPosition;
        String str6 = this.description;
        String str7 = this.genre;
        Integer num2 = this.genreId;
        Boolean bool = this.international;
        Integer num3 = this.isInCatalog;
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto = this.leaderboardType;
        Integer num4 = this.membersCount;
        String str8 = this.platformId;
        Integer num5 = this.publishedDate;
        String str9 = this.screenName;
        String str10 = this.section;
        Integer num6 = this.authorOwnerId;
        Boolean bool2 = this.isInstalled;
        String str11 = this.icon139;
        String str12 = this.icon150;
        String str13 = this.icon278;
        String str14 = this.icon576;
        String str15 = this.backgroundLoaderColor;
        String str16 = this.loaderIcon;
        String str17 = this.icon75;
        Boolean bool3 = this.openInExternalBrowser;
        Integer num7 = this.screenOrientation;
        StringBuilder sb = new StringBuilder("AppsAppDto(type=");
        sb.append(appsAppTypeDto);
        sb.append(", id=");
        sb.append(i);
        sb.append(", title=");
        n6j.b(sb, str, ", authorUrl=", str2, ", banner1120=");
        n6j.b(sb, str3, ", banner560=", str4, ", icon16=");
        sb.append(str5);
        sb.append(", isNew=");
        sb.append(baseBoolIntDto);
        sb.append(", pushEnabled=");
        sb.append(baseBoolIntDto2);
        sb.append(", friends=");
        sb.append(list);
        sb.append(", catalogPosition=");
        mq.b(num, ", description=", str6, ", genre=", sb);
        kr.b(num2, str7, ", genreId=", ", international=", sb);
        sb.append(bool);
        sb.append(", isInCatalog=");
        sb.append(num3);
        sb.append(", leaderboardType=");
        sb.append(appsAppLeaderboardTypeDto);
        sb.append(", membersCount=");
        sb.append(num4);
        sb.append(", platformId=");
        kr.b(num5, str8, ", publishedDate=", ", screenName=", sb);
        n6j.b(sb, str9, ", section=", str10, ", authorOwnerId=");
        rq.h(sb, num6, ", isInstalled=", bool2, ", icon139=");
        n6j.b(sb, str11, ", icon150=", str12, ", icon278=");
        n6j.b(sb, str13, ", icon576=", str14, ", backgroundLoaderColor=");
        n6j.b(sb, str15, ", loaderIcon=", str16, ", icon75=");
        uq.c(bool3, str17, ", openInExternalBrowser=", ", screenOrientation=", sb);
        return oq.b(sb, num7, ")");
    }

    public /* synthetic */ AppsAppDto(AppsAppTypeDto appsAppTypeDto, int i, String str, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, List list, Integer num, String str6, String str7, Integer num2, Boolean bool, Integer num3, AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto, Integer num4, String str8, Integer num5, String str9, String str10, Integer num6, Boolean bool2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool3, Integer num7, int i2, int i3, zcl zclVar) {
        this(appsAppTypeDto, i, str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : baseBoolIntDto, (i2 & 256) != 0 ? null : baseBoolIntDto2, (i2 & 512) != 0 ? null : list, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : str6, (i2 & 4096) != 0 ? null : str7, (i2 & 8192) != 0 ? null : num2, (i2 & 16384) != 0 ? null : bool, (32768 & i2) != 0 ? null : num3, (65536 & i2) != 0 ? null : appsAppLeaderboardTypeDto, (131072 & i2) != 0 ? null : num4, (262144 & i2) != 0 ? null : str8, (524288 & i2) != 0 ? null : num5, (1048576 & i2) != 0 ? null : str9, (2097152 & i2) != 0 ? null : str10, (4194304 & i2) != 0 ? null : num6, (8388608 & i2) != 0 ? null : bool2, (16777216 & i2) != 0 ? null : str11, (33554432 & i2) != 0 ? null : str12, (67108864 & i2) != 0 ? null : str13, (134217728 & i2) != 0 ? null : str14, (268435456 & i2) != 0 ? null : str15, (536870912 & i2) != 0 ? null : str16, (1073741824 & i2) != 0 ? null : str17, (i2 & Integer.MIN_VALUE) != 0 ? null : bool3, (i3 & 1) != 0 ? null : num7);
    }
}
