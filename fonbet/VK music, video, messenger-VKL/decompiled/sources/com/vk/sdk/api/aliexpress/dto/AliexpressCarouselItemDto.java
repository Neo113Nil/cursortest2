package com.vk.sdk.api.aliexpress.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.sdk.api.base.dto.BaseLinkButtonDto;
import com.vk.sdk.api.market.dto.MarketPriceDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AliexpressCarouselItemDto.kt */
/* loaded from: classes5.dex */
public final class AliexpressCarouselItemDto {

    @pmi0("action_button")
    private final BaseLinkButtonDto actionButton;

    @pmi0("delivery_date_text")
    private final String deliveryDateText;

    @pmi0("details_button")
    private final BaseLinkButtonDto detailsButton;

    @pmi0("discount_text")
    private final String discountText;

    @pmi0("group_info")
    private final AliexpressGroupInfoDto groupInfo;

    @pmi0("id")
    private final String id;

    @pmi0("is_favorite")
    private final boolean isFavorite;

    @pmi0("label")
    private final String label;

    @pmi0("orders_count")
    private final Integer ordersCount;

    @pmi0("owner_id")
    private final String ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    public AliexpressCarouselItemDto(String str, String str2, boolean z, String str3, BaseLinkButtonDto baseLinkButtonDto, String str4, MarketPriceDto marketPriceDto, String str5, String str6, String str7, Float f, Integer num, BaseLinkButtonDto baseLinkButtonDto2, PhotosPhotoDto photosPhotoDto, AliexpressGroupInfoDto aliexpressGroupInfoDto) {
        this.id = str;
        this.title = str2;
        this.isFavorite = z;
        this.url = str3;
        this.detailsButton = baseLinkButtonDto;
        this.ownerId = str4;
        this.price = marketPriceDto;
        this.discountText = str5;
        this.deliveryDateText = str6;
        this.label = str7;
        this.rating = f;
        this.ordersCount = num;
        this.actionButton = baseLinkButtonDto2;
        this.photo = photosPhotoDto;
        this.groupInfo = aliexpressGroupInfoDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliexpressCarouselItemDto)) {
            return false;
        }
        AliexpressCarouselItemDto aliexpressCarouselItemDto = (AliexpressCarouselItemDto) obj;
        return epx.f(this.id, aliexpressCarouselItemDto.id) && epx.f(this.title, aliexpressCarouselItemDto.title) && this.isFavorite == aliexpressCarouselItemDto.isFavorite && epx.f(this.url, aliexpressCarouselItemDto.url) && epx.f(this.detailsButton, aliexpressCarouselItemDto.detailsButton) && epx.f(this.ownerId, aliexpressCarouselItemDto.ownerId) && epx.f(this.price, aliexpressCarouselItemDto.price) && epx.f(this.discountText, aliexpressCarouselItemDto.discountText) && epx.f(this.deliveryDateText, aliexpressCarouselItemDto.deliveryDateText) && epx.f(this.label, aliexpressCarouselItemDto.label) && epx.f(this.rating, aliexpressCarouselItemDto.rating) && epx.f(this.ordersCount, aliexpressCarouselItemDto.ordersCount) && epx.f(this.actionButton, aliexpressCarouselItemDto.actionButton) && epx.f(this.photo, aliexpressCarouselItemDto.photo) && epx.f(this.groupInfo, aliexpressCarouselItemDto.groupInfo);
    }

    public final int hashCode() {
        int hashCode = (this.detailsButton.hashCode() + urd0.a(qoy.b(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.isFavorite), 31, this.url)) * 31;
        String str = this.ownerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.price;
        int hashCode3 = (hashCode2 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        String str2 = this.discountText;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deliveryDateText;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.rating;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.ordersCount;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.actionButton;
        int hashCode9 = (hashCode8 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode10 = (hashCode9 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        AliexpressGroupInfoDto aliexpressGroupInfoDto = this.groupInfo;
        return hashCode10 + (aliexpressGroupInfoDto != null ? aliexpressGroupInfoDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        boolean z = this.isFavorite;
        String str3 = this.url;
        BaseLinkButtonDto baseLinkButtonDto = this.detailsButton;
        String str4 = this.ownerId;
        MarketPriceDto marketPriceDto = this.price;
        String str5 = this.discountText;
        String str6 = this.deliveryDateText;
        String str7 = this.label;
        Float f = this.rating;
        Integer num = this.ordersCount;
        BaseLinkButtonDto baseLinkButtonDto2 = this.actionButton;
        PhotosPhotoDto photosPhotoDto = this.photo;
        AliexpressGroupInfoDto aliexpressGroupInfoDto = this.groupInfo;
        StringBuilder a = xe9.a("AliexpressCarouselItemDto(id=", str, ", title=", str2, ", isFavorite=");
        a.append(z);
        a.append(", url=");
        a.append(str3);
        a.append(", detailsButton=");
        a.append(baseLinkButtonDto);
        a.append(", ownerId=");
        a.append(str4);
        a.append(", price=");
        a.append(marketPriceDto);
        a.append(", discountText=");
        a.append(str5);
        a.append(", deliveryDateText=");
        n6j.b(a, str6, ", label=", str7, ", rating=");
        a.append(f);
        a.append(", ordersCount=");
        a.append(num);
        a.append(", actionButton=");
        a.append(baseLinkButtonDto2);
        a.append(", photo=");
        a.append(photosPhotoDto);
        a.append(", groupInfo=");
        a.append(aliexpressGroupInfoDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ AliexpressCarouselItemDto(String str, String str2, boolean z, String str3, BaseLinkButtonDto baseLinkButtonDto, String str4, MarketPriceDto marketPriceDto, String str5, String str6, String str7, Float f, Integer num, BaseLinkButtonDto baseLinkButtonDto2, PhotosPhotoDto photosPhotoDto, AliexpressGroupInfoDto aliexpressGroupInfoDto, int i, zcl zclVar) {
        this(str, str2, z, str3, baseLinkButtonDto, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : marketPriceDto, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : baseLinkButtonDto2, (i & 8192) != 0 ? null : photosPhotoDto, (i & 16384) != 0 ? null : aliexpressGroupInfoDto);
    }
}
