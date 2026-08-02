package com.vk.sdk.api.market.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.xq;
import xsna.zcl;

/* compiled from: MarketOrderItemDto.kt */
/* loaded from: classes5.dex */
public final class MarketOrderItemDto {

    @pmi0("can_add_review")
    private final Boolean canAddReview;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final MarketMarketItemDto item;

    @pmi0("item_id")
    private final int itemId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("quantity")
    private final int quantity;

    @pmi0("title")
    private final String title;

    @pmi0("variants")
    private final List<String> variants;

    public MarketOrderItemDto(UserId userId, int i, MarketPriceDto marketPriceDto, int i2, MarketMarketItemDto marketMarketItemDto, String str, PhotosPhotoDto photosPhotoDto, List<String> list, Boolean bool) {
        this.ownerId = userId;
        this.itemId = i;
        this.price = marketPriceDto;
        this.quantity = i2;
        this.item = marketMarketItemDto;
        this.title = str;
        this.photo = photosPhotoDto;
        this.variants = list;
        this.canAddReview = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderItemDto)) {
            return false;
        }
        MarketOrderItemDto marketOrderItemDto = (MarketOrderItemDto) obj;
        return epx.f(this.ownerId, marketOrderItemDto.ownerId) && this.itemId == marketOrderItemDto.itemId && epx.f(this.price, marketOrderItemDto.price) && this.quantity == marketOrderItemDto.quantity && epx.f(this.item, marketOrderItemDto.item) && epx.f(this.title, marketOrderItemDto.title) && epx.f(this.photo, marketOrderItemDto.photo) && epx.f(this.variants, marketOrderItemDto.variants) && epx.f(this.canAddReview, marketOrderItemDto.canAddReview);
    }

    public final int hashCode() {
        int hashCode = (this.item.hashCode() + shy.a(this.quantity, (this.price.hashCode() + shy.a(this.itemId, Long.hashCode(this.ownerId.b) * 31, 31)) * 31, 31)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode3 = (hashCode2 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<String> list = this.variants;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.canAddReview;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.ownerId;
        int i = this.itemId;
        MarketPriceDto marketPriceDto = this.price;
        int i2 = this.quantity;
        MarketMarketItemDto marketMarketItemDto = this.item;
        String str = this.title;
        PhotosPhotoDto photosPhotoDto = this.photo;
        List<String> list = this.variants;
        Boolean bool = this.canAddReview;
        StringBuilder sb = new StringBuilder("MarketOrderItemDto(ownerId=");
        sb.append(userId);
        sb.append(", itemId=");
        sb.append(i);
        sb.append(", price=");
        sb.append(marketPriceDto);
        sb.append(", quantity=");
        sb.append(i2);
        sb.append(", item=");
        sb.append(marketMarketItemDto);
        sb.append(", title=");
        sb.append(str);
        sb.append(", photo=");
        sb.append(photosPhotoDto);
        sb.append(", variants=");
        sb.append(list);
        sb.append(", canAddReview=");
        return xq.d(sb, bool, ")");
    }

    public /* synthetic */ MarketOrderItemDto(UserId userId, int i, MarketPriceDto marketPriceDto, int i2, MarketMarketItemDto marketMarketItemDto, String str, PhotosPhotoDto photosPhotoDto, List list, Boolean bool, int i3, zcl zclVar) {
        this(userId, i, marketPriceDto, i2, marketMarketItemDto, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : photosPhotoDto, (i3 & 128) != 0 ? null : list, (i3 & 256) != 0 ? null : bool);
    }
}
