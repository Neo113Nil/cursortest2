package com.vk.sdk.api.market.dto;

import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.kr;
import xsna.l4;
import xsna.mq;
import xsna.n6j;
import xsna.nyh0;
import xsna.pmi0;
import xsna.shy;
import xsna.tq;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketMarketItemDto.kt */
/* loaded from: classes5.dex */
public final class MarketMarketItemDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("availability")
    private final MarketMarketItemAvailabilityDto availability;

    @pmi0("button_title")
    private final String buttonTitle;

    @pmi0("category")
    private final MarketMarketCategoryDto category;

    @pmi0("category_v2")
    private final MarketMarketCategoryDto categoryV2;

    @pmi0("date")
    private final Integer date;

    @pmi0("description")
    private final String description;

    @pmi0("external_id")
    private final String externalId;

    @pmi0("id")
    private final int id;

    @pmi0("is_adult")
    private final Boolean isAdult;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_main_variant")
    private final Boolean isMainVariant;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("post_owner_id")
    private final UserId postOwnerId;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("sku")
    private final String sku;

    @pmi0("thumb_photo")
    private final String thumbPhoto;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    @pmi0("variants_grouping_id")
    private final Integer variantsGroupingId;

    public MarketMarketItemDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, String str3, String str4, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, String str7, Integer num2, Boolean bool4, String str8, Integer num3, UserId userId2) {
        this.availability = marketMarketItemAvailabilityDto;
        this.category = marketMarketCategoryDto;
        this.description = str;
        this.id = i;
        this.ownerId = userId;
        this.price = marketPriceDto;
        this.title = str2;
        this.accessKey = str3;
        this.buttonTitle = str4;
        this.categoryV2 = marketMarketCategoryDto2;
        this.date = num;
        this.externalId = str5;
        this.isFavorite = bool;
        this.isOwner = bool2;
        this.isAdult = bool3;
        this.thumbPhoto = str6;
        this.url = str7;
        this.variantsGroupingId = num2;
        this.isMainVariant = bool4;
        this.sku = str8;
        this.postId = num3;
        this.postOwnerId = userId2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItemDto)) {
            return false;
        }
        MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) obj;
        return this.availability == marketMarketItemDto.availability && epx.f(this.category, marketMarketItemDto.category) && epx.f(this.description, marketMarketItemDto.description) && this.id == marketMarketItemDto.id && epx.f(this.ownerId, marketMarketItemDto.ownerId) && epx.f(this.price, marketMarketItemDto.price) && epx.f(this.title, marketMarketItemDto.title) && epx.f(this.accessKey, marketMarketItemDto.accessKey) && epx.f(this.buttonTitle, marketMarketItemDto.buttonTitle) && epx.f(this.categoryV2, marketMarketItemDto.categoryV2) && epx.f(this.date, marketMarketItemDto.date) && epx.f(this.externalId, marketMarketItemDto.externalId) && epx.f(this.isFavorite, marketMarketItemDto.isFavorite) && epx.f(this.isOwner, marketMarketItemDto.isOwner) && epx.f(this.isAdult, marketMarketItemDto.isAdult) && epx.f(this.thumbPhoto, marketMarketItemDto.thumbPhoto) && epx.f(this.url, marketMarketItemDto.url) && epx.f(this.variantsGroupingId, marketMarketItemDto.variantsGroupingId) && epx.f(this.isMainVariant, marketMarketItemDto.isMainVariant) && epx.f(this.sku, marketMarketItemDto.sku) && epx.f(this.postId, marketMarketItemDto.postId) && epx.f(this.postOwnerId, marketMarketItemDto.postOwnerId);
    }

    public final int hashCode() {
        int a = urd0.a((this.price.hashCode() + bh10.a(shy.a(this.id, urd0.a((this.category.hashCode() + (this.availability.hashCode() * 31)) * 31, 31, this.description), 31), 31, this.ownerId.b)) * 31, 31, this.title);
        String str = this.accessKey;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MarketMarketCategoryDto marketMarketCategoryDto = this.categoryV2;
        int hashCode3 = (hashCode2 + (marketMarketCategoryDto == null ? 0 : marketMarketCategoryDto.hashCode())) * 31;
        Integer num = this.date;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.externalId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isOwner;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAdult;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.thumbPhoto;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.variantsGroupingId;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.isMainVariant;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str6 = this.sku;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.postId;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UserId userId = this.postOwnerId;
        return hashCode14 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto = this.availability;
        MarketMarketCategoryDto marketMarketCategoryDto = this.category;
        String str = this.description;
        int i = this.id;
        UserId userId = this.ownerId;
        MarketPriceDto marketPriceDto = this.price;
        String str2 = this.title;
        String str3 = this.accessKey;
        String str4 = this.buttonTitle;
        MarketMarketCategoryDto marketMarketCategoryDto2 = this.categoryV2;
        Integer num = this.date;
        String str5 = this.externalId;
        Boolean bool = this.isFavorite;
        Boolean bool2 = this.isOwner;
        Boolean bool3 = this.isAdult;
        String str6 = this.thumbPhoto;
        String str7 = this.url;
        Integer num2 = this.variantsGroupingId;
        Boolean bool4 = this.isMainVariant;
        String str8 = this.sku;
        Integer num3 = this.postId;
        UserId userId2 = this.postOwnerId;
        StringBuilder sb = new StringBuilder("MarketMarketItemDto(availability=");
        sb.append(marketMarketItemAvailabilityDto);
        sb.append(", category=");
        sb.append(marketMarketCategoryDto);
        sb.append(", description=");
        nyh0.a(i, str, ", id=", ", ownerId=", sb);
        sb.append(userId);
        sb.append(", price=");
        sb.append(marketPriceDto);
        sb.append(", title=");
        n6j.b(sb, str2, ", accessKey=", str3, ", buttonTitle=");
        sb.append(str4);
        sb.append(", categoryV2=");
        sb.append(marketMarketCategoryDto2);
        sb.append(", date=");
        mq.b(num, ", externalId=", str5, ", isFavorite=", sb);
        tq.i(sb, bool, ", isOwner=", bool2, ", isAdult=");
        l4.i(bool3, ", thumbPhoto=", str6, ", url=", sb);
        kr.b(num2, str7, ", variantsGroupingId=", ", isMainVariant=", sb);
        l4.i(bool4, ", sku=", str8, ", postId=", sb);
        sb.append(num3);
        sb.append(", postOwnerId=");
        sb.append(userId2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MarketMarketItemDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, String str3, String str4, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, String str7, Integer num2, Boolean bool4, String str8, Integer num3, UserId userId2, int i2, zcl zclVar) {
        this(marketMarketItemAvailabilityDto, marketMarketCategoryDto, str, i, userId, marketPriceDto, str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : marketMarketCategoryDto2, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? null : bool, (i2 & 8192) != 0 ? null : bool2, (i2 & 16384) != 0 ? null : bool3, (32768 & i2) != 0 ? null : str6, (65536 & i2) != 0 ? null : str7, (131072 & i2) != 0 ? null : num2, (262144 & i2) != 0 ? null : bool4, (524288 & i2) != 0 ? null : str8, (1048576 & i2) != 0 ? null : num3, (i2 & 2097152) != 0 ? null : userId2);
    }
}
