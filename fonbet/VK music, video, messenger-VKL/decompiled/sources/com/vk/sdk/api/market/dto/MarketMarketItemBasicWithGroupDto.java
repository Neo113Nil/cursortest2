package com.vk.sdk.api.market.dto;

import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.l4;
import xsna.pmi0;
import xsna.uq;
import xsna.urd0;
import xsna.xq;
import xsna.zcl;

/* compiled from: MarketMarketItemBasicWithGroupDto.kt */
/* loaded from: classes5.dex */
public final class MarketMarketItemBasicWithGroupDto {

    @pmi0("group_link")
    private final String groupLink;

    @pmi0("group_name")
    private final String groupName;

    @pmi0("id")
    private final int id;

    @pmi0("is_adult")
    private final Boolean isAdult;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_group_verified")
    private final Boolean isGroupVerified;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("thumb_photo")
    private final String thumbPhoto;

    @pmi0("title")
    private final String title;

    public MarketMarketItemBasicWithGroupDto(int i, UserId userId, String str, MarketPriceDto marketPriceDto, Boolean bool, String str2, String str3, Boolean bool2, Boolean bool3, String str4, Boolean bool4) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.price = marketPriceDto;
        this.isGroupVerified = bool;
        this.groupName = str2;
        this.groupLink = str3;
        this.isOwner = bool2;
        this.isAdult = bool3;
        this.thumbPhoto = str4;
        this.isFavorite = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItemBasicWithGroupDto)) {
            return false;
        }
        MarketMarketItemBasicWithGroupDto marketMarketItemBasicWithGroupDto = (MarketMarketItemBasicWithGroupDto) obj;
        return this.id == marketMarketItemBasicWithGroupDto.id && epx.f(this.ownerId, marketMarketItemBasicWithGroupDto.ownerId) && epx.f(this.title, marketMarketItemBasicWithGroupDto.title) && epx.f(this.price, marketMarketItemBasicWithGroupDto.price) && epx.f(this.isGroupVerified, marketMarketItemBasicWithGroupDto.isGroupVerified) && epx.f(this.groupName, marketMarketItemBasicWithGroupDto.groupName) && epx.f(this.groupLink, marketMarketItemBasicWithGroupDto.groupLink) && epx.f(this.isOwner, marketMarketItemBasicWithGroupDto.isOwner) && epx.f(this.isAdult, marketMarketItemBasicWithGroupDto.isAdult) && epx.f(this.thumbPhoto, marketMarketItemBasicWithGroupDto.thumbPhoto) && epx.f(this.isFavorite, marketMarketItemBasicWithGroupDto.isFavorite);
    }

    public final int hashCode() {
        int hashCode = (this.price.hashCode() + urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title)) * 31;
        Boolean bool = this.isGroupVerified;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.groupName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupLink;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.isOwner;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAdult;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.thumbPhoto;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.isFavorite;
        return hashCode7 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.ownerId;
        String str = this.title;
        MarketPriceDto marketPriceDto = this.price;
        Boolean bool = this.isGroupVerified;
        String str2 = this.groupName;
        String str3 = this.groupLink;
        Boolean bool2 = this.isOwner;
        Boolean bool3 = this.isAdult;
        String str4 = this.thumbPhoto;
        Boolean bool4 = this.isFavorite;
        StringBuilder sb = new StringBuilder("MarketMarketItemBasicWithGroupDto(id=");
        sb.append(i);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", title=");
        sb.append(str);
        sb.append(", price=");
        sb.append(marketPriceDto);
        sb.append(", isGroupVerified=");
        l4.i(bool, ", groupName=", str2, ", groupLink=", sb);
        uq.c(bool2, str3, ", isOwner=", ", isAdult=", sb);
        l4.i(bool3, ", thumbPhoto=", str4, ", isFavorite=", sb);
        return xq.d(sb, bool4, ")");
    }

    public /* synthetic */ MarketMarketItemBasicWithGroupDto(int i, UserId userId, String str, MarketPriceDto marketPriceDto, Boolean bool, String str2, String str3, Boolean bool2, Boolean bool3, String str4, Boolean bool4, int i2, zcl zclVar) {
        this(i, userId, str, marketPriceDto, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : bool3, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : bool4);
    }
}
