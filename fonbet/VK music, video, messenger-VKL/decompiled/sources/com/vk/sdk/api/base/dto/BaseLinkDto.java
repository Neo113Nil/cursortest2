package com.vk.sdk.api.base.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.sdk.api.link.dto.LinkTargetObjectDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import com.vk.sdk.api.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: BaseLinkDto.kt */
/* loaded from: classes5.dex */
public final class BaseLinkDto {

    @pmi0("application")
    private final BaseLinkApplicationDto application;

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("caption")
    private final String caption;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final String id;

    @pmi0("is_external")
    private final Boolean isExternal;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("preview_page")
    private final String previewPage;

    @pmi0("preview_url")
    private final String previewUrl;

    @pmi0("product")
    private final BaseLinkProductDto product;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final BaseLinkRatingDto rating;

    @pmi0("target_object")
    private final LinkTargetObjectDto targetObject;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    @pmi0("video")
    private final VideoVideoFullDto video;

    public BaseLinkDto(String str, String str2, BaseLinkProductDto baseLinkProductDto, BaseLinkApplicationDto baseLinkApplicationDto, BaseLinkButtonDto baseLinkButtonDto, String str3, String str4, String str5, Boolean bool, PhotosPhotoDto photosPhotoDto, String str6, String str7, BaseLinkRatingDto baseLinkRatingDto, String str8, LinkTargetObjectDto linkTargetObjectDto, Boolean bool2, VideoVideoFullDto videoVideoFullDto) {
        this.url = str;
        this.text = str2;
        this.product = baseLinkProductDto;
        this.application = baseLinkApplicationDto;
        this.button = baseLinkButtonDto;
        this.caption = str3;
        this.description = str4;
        this.id = str5;
        this.isFavorite = bool;
        this.photo = photosPhotoDto;
        this.previewPage = str6;
        this.previewUrl = str7;
        this.rating = baseLinkRatingDto;
        this.title = str8;
        this.targetObject = linkTargetObjectDto;
        this.isExternal = bool2;
        this.video = videoVideoFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkDto)) {
            return false;
        }
        BaseLinkDto baseLinkDto = (BaseLinkDto) obj;
        return epx.f(this.url, baseLinkDto.url) && epx.f(this.text, baseLinkDto.text) && epx.f(this.product, baseLinkDto.product) && epx.f(this.application, baseLinkDto.application) && epx.f(this.button, baseLinkDto.button) && epx.f(this.caption, baseLinkDto.caption) && epx.f(this.description, baseLinkDto.description) && epx.f(this.id, baseLinkDto.id) && epx.f(this.isFavorite, baseLinkDto.isFavorite) && epx.f(this.photo, baseLinkDto.photo) && epx.f(this.previewPage, baseLinkDto.previewPage) && epx.f(this.previewUrl, baseLinkDto.previewUrl) && epx.f(this.rating, baseLinkDto.rating) && epx.f(this.title, baseLinkDto.title) && epx.f(this.targetObject, baseLinkDto.targetObject) && epx.f(this.isExternal, baseLinkDto.isExternal) && epx.f(this.video, baseLinkDto.video);
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkProductDto baseLinkProductDto = this.product;
        int hashCode3 = (hashCode2 + (baseLinkProductDto == null ? 0 : baseLinkProductDto.hashCode())) * 31;
        BaseLinkApplicationDto baseLinkApplicationDto = this.application;
        int hashCode4 = (hashCode3 + (baseLinkApplicationDto == null ? 0 : baseLinkApplicationDto.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        int hashCode5 = (hashCode4 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        String str2 = this.caption;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode10 = (hashCode9 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        String str5 = this.previewPage;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.previewUrl;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BaseLinkRatingDto baseLinkRatingDto = this.rating;
        int hashCode13 = (hashCode12 + (baseLinkRatingDto == null ? 0 : baseLinkRatingDto.hashCode())) * 31;
        String str7 = this.title;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        LinkTargetObjectDto linkTargetObjectDto = this.targetObject;
        int hashCode15 = (hashCode14 + (linkTargetObjectDto == null ? 0 : linkTargetObjectDto.hashCode())) * 31;
        Boolean bool2 = this.isExternal;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        return hashCode16 + (videoVideoFullDto != null ? videoVideoFullDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.url;
        String str2 = this.text;
        BaseLinkProductDto baseLinkProductDto = this.product;
        BaseLinkApplicationDto baseLinkApplicationDto = this.application;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        String str3 = this.caption;
        String str4 = this.description;
        String str5 = this.id;
        Boolean bool = this.isFavorite;
        PhotosPhotoDto photosPhotoDto = this.photo;
        String str6 = this.previewPage;
        String str7 = this.previewUrl;
        BaseLinkRatingDto baseLinkRatingDto = this.rating;
        String str8 = this.title;
        LinkTargetObjectDto linkTargetObjectDto = this.targetObject;
        Boolean bool2 = this.isExternal;
        VideoVideoFullDto videoVideoFullDto = this.video;
        StringBuilder a = xe9.a("BaseLinkDto(url=", str, ", text=", str2, ", product=");
        a.append(baseLinkProductDto);
        a.append(", application=");
        a.append(baseLinkApplicationDto);
        a.append(", button=");
        a.append(baseLinkButtonDto);
        a.append(", caption=");
        a.append(str3);
        a.append(", description=");
        n6j.b(a, str4, ", id=", str5, ", isFavorite=");
        a.append(bool);
        a.append(", photo=");
        a.append(photosPhotoDto);
        a.append(", previewPage=");
        n6j.b(a, str6, ", previewUrl=", str7, ", rating=");
        a.append(baseLinkRatingDto);
        a.append(", title=");
        a.append(str8);
        a.append(", targetObject=");
        a.append(linkTargetObjectDto);
        a.append(", isExternal=");
        a.append(bool2);
        a.append(", video=");
        a.append(videoVideoFullDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ BaseLinkDto(String str, String str2, BaseLinkProductDto baseLinkProductDto, BaseLinkApplicationDto baseLinkApplicationDto, BaseLinkButtonDto baseLinkButtonDto, String str3, String str4, String str5, Boolean bool, PhotosPhotoDto photosPhotoDto, String str6, String str7, BaseLinkRatingDto baseLinkRatingDto, String str8, LinkTargetObjectDto linkTargetObjectDto, Boolean bool2, VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : baseLinkProductDto, (i & 8) != 0 ? null : baseLinkApplicationDto, (i & 16) != 0 ? null : baseLinkButtonDto, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : photosPhotoDto, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : baseLinkRatingDto, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : linkTargetObjectDto, (i & 32768) != 0 ? null : bool2, (i & 65536) != 0 ? null : videoVideoFullDto);
    }
}
