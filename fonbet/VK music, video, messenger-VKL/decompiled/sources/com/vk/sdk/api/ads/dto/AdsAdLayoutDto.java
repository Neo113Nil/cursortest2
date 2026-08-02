package com.vk.sdk.api.ads.dto;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.jax0;
import xsna.kr;
import xsna.mq;
import xsna.n6j;
import xsna.nyh0;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: AdsAdLayoutDto.kt */
/* loaded from: classes5.dex */
public final class AdsAdLayoutDto {

    @pmi0("ad_format")
    private final int adFormat;

    @pmi0("age_restriction")
    private final Integer ageRestriction;

    @pmi0("campaign_id")
    private final int campaignId;

    @pmi0("clips_list")
    private final List<AdsClipItemDto> clipsList;

    @pmi0("cost_type")
    private final AdsAdCostTypeDto costType;

    @pmi0("description")
    private final String description;

    @pmi0("goal_type")
    private final Integer goalType;

    @pmi0("icon_src")
    private final String iconSrc;

    @pmi0("icon_src_2x")
    private final String iconSrc2x;

    @pmi0("id")
    private final int id;

    @pmi0("image_src")
    private final String imageSrc;

    @pmi0("image_src_2x")
    private final String imageSrc2x;

    @pmi0("link_button")
    private final String linkButton;

    @pmi0("link_domain")
    private final String linkDomain;

    @pmi0("link_title")
    private final String linkTitle;

    @pmi0(CampaignEx.JSON_KEY_LINK_TYPE)
    private final int linkType;

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("okved")
    private final String okved;

    @pmi0("post")
    private final AdsPostDto post;

    @pmi0("preview_link")
    private final String previewLink;

    @pmi0("repeat_video")
    private final Integer repeatVideo;

    @pmi0(NotificationCompat.CATEGORY_SOCIAL)
    private final Boolean social;

    @pmi0("stories_data")
    private final AdsStoriesDto storiesData;

    @pmi0("title")
    private final String title;

    @pmi0("video")
    private final BaseBoolIntDto video;

    @pmi0("video_duration")
    private final Integer videoDuration;

    @pmi0("video_image_src")
    private final String videoImageSrc;

    @pmi0("video_image_src_2x")
    private final String videoImageSrc2x;

    @pmi0("video_src_1080")
    private final String videoSrc1080;

    @pmi0("video_src_240")
    private final String videoSrc240;

    @pmi0("video_src_360")
    private final String videoSrc360;

    @pmi0("video_src_480")
    private final String videoSrc480;

    @pmi0("video_src_720")
    private final String videoSrc720;

    public AdsAdLayoutDto(int i, int i2, AdsAdCostTypeDto adsAdCostTypeDto, String str, int i3, String str2, String str3, int i4, String str4, String str5, String str6, String str7, BaseBoolIntDto baseBoolIntDto, Boolean bool, String str8, Integer num, Integer num2, String str9, String str10, Integer num3, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num4, String str18, String str19, AdsPostDto adsPostDto, AdsStoriesDto adsStoriesDto, List<AdsClipItemDto> list) {
        this.adFormat = i;
        this.campaignId = i2;
        this.costType = adsAdCostTypeDto;
        this.description = str;
        this.id = i3;
        this.imageSrc = str2;
        this.linkUrl = str3;
        this.linkType = i4;
        this.title = str4;
        this.imageSrc2x = str5;
        this.linkDomain = str6;
        this.previewLink = str7;
        this.video = baseBoolIntDto;
        this.social = bool;
        this.okved = str8;
        this.ageRestriction = num;
        this.goalType = num2;
        this.linkTitle = str9;
        this.linkButton = str10;
        this.repeatVideo = num3;
        this.videoSrc240 = str11;
        this.videoSrc360 = str12;
        this.videoSrc480 = str13;
        this.videoSrc720 = str14;
        this.videoSrc1080 = str15;
        this.videoImageSrc = str16;
        this.videoImageSrc2x = str17;
        this.videoDuration = num4;
        this.iconSrc = str18;
        this.iconSrc2x = str19;
        this.post = adsPostDto;
        this.storiesData = adsStoriesDto;
        this.clipsList = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsAdLayoutDto)) {
            return false;
        }
        AdsAdLayoutDto adsAdLayoutDto = (AdsAdLayoutDto) obj;
        return this.adFormat == adsAdLayoutDto.adFormat && this.campaignId == adsAdLayoutDto.campaignId && this.costType == adsAdLayoutDto.costType && epx.f(this.description, adsAdLayoutDto.description) && this.id == adsAdLayoutDto.id && epx.f(this.imageSrc, adsAdLayoutDto.imageSrc) && epx.f(this.linkUrl, adsAdLayoutDto.linkUrl) && this.linkType == adsAdLayoutDto.linkType && epx.f(this.title, adsAdLayoutDto.title) && epx.f(this.imageSrc2x, adsAdLayoutDto.imageSrc2x) && epx.f(this.linkDomain, adsAdLayoutDto.linkDomain) && epx.f(this.previewLink, adsAdLayoutDto.previewLink) && this.video == adsAdLayoutDto.video && epx.f(this.social, adsAdLayoutDto.social) && epx.f(this.okved, adsAdLayoutDto.okved) && epx.f(this.ageRestriction, adsAdLayoutDto.ageRestriction) && epx.f(this.goalType, adsAdLayoutDto.goalType) && epx.f(this.linkTitle, adsAdLayoutDto.linkTitle) && epx.f(this.linkButton, adsAdLayoutDto.linkButton) && epx.f(this.repeatVideo, adsAdLayoutDto.repeatVideo) && epx.f(this.videoSrc240, adsAdLayoutDto.videoSrc240) && epx.f(this.videoSrc360, adsAdLayoutDto.videoSrc360) && epx.f(this.videoSrc480, adsAdLayoutDto.videoSrc480) && epx.f(this.videoSrc720, adsAdLayoutDto.videoSrc720) && epx.f(this.videoSrc1080, adsAdLayoutDto.videoSrc1080) && epx.f(this.videoImageSrc, adsAdLayoutDto.videoImageSrc) && epx.f(this.videoImageSrc2x, adsAdLayoutDto.videoImageSrc2x) && epx.f(this.videoDuration, adsAdLayoutDto.videoDuration) && epx.f(this.iconSrc, adsAdLayoutDto.iconSrc) && epx.f(this.iconSrc2x, adsAdLayoutDto.iconSrc2x) && epx.f(this.post, adsAdLayoutDto.post) && epx.f(this.storiesData, adsAdLayoutDto.storiesData) && epx.f(this.clipsList, adsAdLayoutDto.clipsList);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.linkType, urd0.a(urd0.a(shy.a(this.id, urd0.a((this.costType.hashCode() + shy.a(this.campaignId, Integer.hashCode(this.adFormat) * 31, 31)) * 31, 31, this.description), 31), 31, this.imageSrc), 31, this.linkUrl), 31), 31, this.title);
        String str = this.imageSrc2x;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkDomain;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.previewLink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.video;
        int hashCode4 = (hashCode3 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Boolean bool = this.social;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.okved;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.ageRestriction;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.goalType;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.linkTitle;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.linkButton;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.repeatVideo;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.videoSrc240;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.videoSrc360;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.videoSrc480;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.videoSrc720;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.videoSrc1080;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.videoImageSrc;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.videoImageSrc2x;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num4 = this.videoDuration;
        int hashCode19 = (hashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str14 = this.iconSrc;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.iconSrc2x;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        AdsPostDto adsPostDto = this.post;
        int hashCode22 = (hashCode21 + (adsPostDto == null ? 0 : adsPostDto.hashCode())) * 31;
        AdsStoriesDto adsStoriesDto = this.storiesData;
        int hashCode23 = (hashCode22 + (adsStoriesDto == null ? 0 : adsStoriesDto.hashCode())) * 31;
        List<AdsClipItemDto> list = this.clipsList;
        return hashCode23 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = this.adFormat;
        int i2 = this.campaignId;
        AdsAdCostTypeDto adsAdCostTypeDto = this.costType;
        String str = this.description;
        int i3 = this.id;
        String str2 = this.imageSrc;
        String str3 = this.linkUrl;
        int i4 = this.linkType;
        String str4 = this.title;
        String str5 = this.imageSrc2x;
        String str6 = this.linkDomain;
        String str7 = this.previewLink;
        BaseBoolIntDto baseBoolIntDto = this.video;
        Boolean bool = this.social;
        String str8 = this.okved;
        Integer num = this.ageRestriction;
        Integer num2 = this.goalType;
        String str9 = this.linkTitle;
        String str10 = this.linkButton;
        Integer num3 = this.repeatVideo;
        String str11 = this.videoSrc240;
        String str12 = this.videoSrc360;
        String str13 = this.videoSrc480;
        String str14 = this.videoSrc720;
        String str15 = this.videoSrc1080;
        String str16 = this.videoImageSrc;
        String str17 = this.videoImageSrc2x;
        Integer num4 = this.videoDuration;
        String str18 = this.iconSrc;
        String str19 = this.iconSrc2x;
        AdsPostDto adsPostDto = this.post;
        AdsStoriesDto adsStoriesDto = this.storiesData;
        List<AdsClipItemDto> list = this.clipsList;
        StringBuilder a = odj.a(i, i2, "AdsAdLayoutDto(adFormat=", ", campaignId=", ", costType=");
        a.append(adsAdCostTypeDto);
        a.append(", description=");
        a.append(str);
        a.append(", id=");
        jax0.a(i3, ", imageSrc=", str2, ", linkUrl=", a);
        nyh0.a(i4, str3, ", linkType=", ", title=", a);
        n6j.b(a, str4, ", imageSrc2x=", str5, ", linkDomain=");
        n6j.b(a, str6, ", previewLink=", str7, ", video=");
        a.append(baseBoolIntDto);
        a.append(", social=");
        a.append(bool);
        a.append(", okved=");
        kr.b(num, str8, ", ageRestriction=", ", goalType=", a);
        mq.b(num2, ", linkTitle=", str9, ", linkButton=", a);
        kr.b(num3, str10, ", repeatVideo=", ", videoSrc240=", a);
        n6j.b(a, str11, ", videoSrc360=", str12, ", videoSrc480=");
        n6j.b(a, str13, ", videoSrc720=", str14, ", videoSrc1080=");
        n6j.b(a, str15, ", videoImageSrc=", str16, ", videoImageSrc2x=");
        kr.b(num4, str17, ", videoDuration=", ", iconSrc=", a);
        n6j.b(a, str18, ", iconSrc2x=", str19, ", post=");
        a.append(adsPostDto);
        a.append(", storiesData=");
        a.append(adsStoriesDto);
        a.append(", clipsList=");
        return vp.b(")", a, list);
    }

    public /* synthetic */ AdsAdLayoutDto(int i, int i2, AdsAdCostTypeDto adsAdCostTypeDto, String str, int i3, String str2, String str3, int i4, String str4, String str5, String str6, String str7, BaseBoolIntDto baseBoolIntDto, Boolean bool, String str8, Integer num, Integer num2, String str9, String str10, Integer num3, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num4, String str18, String str19, AdsPostDto adsPostDto, AdsStoriesDto adsStoriesDto, List list, int i5, int i6, zcl zclVar) {
        this(i, i2, adsAdCostTypeDto, str, i3, str2, str3, i4, str4, (i5 & 512) != 0 ? null : str5, (i5 & 1024) != 0 ? null : str6, (i5 & 2048) != 0 ? null : str7, (i5 & 4096) != 0 ? null : baseBoolIntDto, (i5 & 8192) != 0 ? null : bool, (i5 & 16384) != 0 ? null : str8, (32768 & i5) != 0 ? null : num, (65536 & i5) != 0 ? null : num2, (131072 & i5) != 0 ? null : str9, (262144 & i5) != 0 ? null : str10, (524288 & i5) != 0 ? null : num3, (1048576 & i5) != 0 ? null : str11, (2097152 & i5) != 0 ? null : str12, (4194304 & i5) != 0 ? null : str13, (8388608 & i5) != 0 ? null : str14, (16777216 & i5) != 0 ? null : str15, (33554432 & i5) != 0 ? null : str16, (67108864 & i5) != 0 ? null : str17, (134217728 & i5) != 0 ? null : num4, (268435456 & i5) != 0 ? null : str18, (536870912 & i5) != 0 ? null : str19, (1073741824 & i5) != 0 ? null : adsPostDto, (i5 & Integer.MIN_VALUE) != 0 ? null : adsStoriesDto, (i6 & 1) != 0 ? null : list);
    }
}
