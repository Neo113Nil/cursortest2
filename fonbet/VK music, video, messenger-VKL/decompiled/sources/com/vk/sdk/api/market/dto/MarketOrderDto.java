package com.vk.sdk.api.market.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseLinkDto;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bh10;
import xsna.cgn;
import xsna.epx;
import xsna.kr;
import xsna.n6j;
import xsna.pmi0;
import xsna.shy;
import xsna.xq;
import xsna.zcl;

/* compiled from: MarketOrderDto.kt */
/* loaded from: classes5.dex */
public final class MarketOrderDto {

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("can_add_review")
    private final Boolean canAddReview;

    @pmi0("cancel_info")
    private final BaseLinkDto cancelInfo;

    @pmi0("comment")
    private final String comment;

    @pmi0("date")
    private final int date;

    @pmi0("display_order_id")
    private final String displayOrderId;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("id")
    private final int id;

    @pmi0("items_count")
    private final int itemsCount;

    @pmi0("merchant_comment")
    private final String merchantComment;

    @pmi0("preview_order_items")
    private final List<MarketOrderItemDto> previewOrderItems;

    @pmi0("status")
    private final int status;

    @pmi0("total_price")
    private final MarketPriceDto totalPrice;

    @pmi0("track_link")
    private final String trackLink;

    @pmi0("track_number")
    private final String trackNumber;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("weight")
    private final Integer weight;

    public MarketOrderDto(int i, UserId userId, UserId userId2, int i2, int i3, int i4, MarketPriceDto marketPriceDto, String str, String str2, String str3, String str4, String str5, String str6, Integer num, List<MarketOrderItemDto> list, BaseLinkDto baseLinkDto, Boolean bool) {
        this.id = i;
        this.groupId = userId;
        this.userId = userId2;
        this.date = i2;
        this.status = i3;
        this.itemsCount = i4;
        this.totalPrice = marketPriceDto;
        this.displayOrderId = str;
        this.trackNumber = str2;
        this.trackLink = str3;
        this.comment = str4;
        this.address = str5;
        this.merchantComment = str6;
        this.weight = num;
        this.previewOrderItems = list;
        this.cancelInfo = baseLinkDto;
        this.canAddReview = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderDto)) {
            return false;
        }
        MarketOrderDto marketOrderDto = (MarketOrderDto) obj;
        return this.id == marketOrderDto.id && epx.f(this.groupId, marketOrderDto.groupId) && epx.f(this.userId, marketOrderDto.userId) && this.date == marketOrderDto.date && this.status == marketOrderDto.status && this.itemsCount == marketOrderDto.itemsCount && epx.f(this.totalPrice, marketOrderDto.totalPrice) && epx.f(this.displayOrderId, marketOrderDto.displayOrderId) && epx.f(this.trackNumber, marketOrderDto.trackNumber) && epx.f(this.trackLink, marketOrderDto.trackLink) && epx.f(this.comment, marketOrderDto.comment) && epx.f(this.address, marketOrderDto.address) && epx.f(this.merchantComment, marketOrderDto.merchantComment) && epx.f(this.weight, marketOrderDto.weight) && epx.f(this.previewOrderItems, marketOrderDto.previewOrderItems) && epx.f(this.cancelInfo, marketOrderDto.cancelInfo) && epx.f(this.canAddReview, marketOrderDto.canAddReview);
    }

    public final int hashCode() {
        int hashCode = (this.totalPrice.hashCode() + shy.a(this.itemsCount, shy.a(this.status, shy.a(this.date, bh10.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.groupId.b), 31, this.userId.b), 31), 31), 31)) * 31;
        String str = this.displayOrderId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackLink;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.comment;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.address;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.merchantComment;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.weight;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<MarketOrderItemDto> list = this.previewOrderItems;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.cancelInfo;
        int hashCode10 = (hashCode9 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        Boolean bool = this.canAddReview;
        return hashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.groupId;
        UserId userId2 = this.userId;
        int i2 = this.date;
        int i3 = this.status;
        int i4 = this.itemsCount;
        MarketPriceDto marketPriceDto = this.totalPrice;
        String str = this.displayOrderId;
        String str2 = this.trackNumber;
        String str3 = this.trackLink;
        String str4 = this.comment;
        String str5 = this.address;
        String str6 = this.merchantComment;
        Integer num = this.weight;
        List<MarketOrderItemDto> list = this.previewOrderItems;
        BaseLinkDto baseLinkDto = this.cancelInfo;
        Boolean bool = this.canAddReview;
        StringBuilder sb = new StringBuilder("MarketOrderDto(id=");
        sb.append(i);
        sb.append(", groupId=");
        sb.append(userId);
        sb.append(", userId=");
        sb.append(userId2);
        sb.append(", date=");
        sb.append(i2);
        sb.append(", status=");
        cgn.a(i3, i4, ", itemsCount=", ", totalPrice=", sb);
        sb.append(marketPriceDto);
        sb.append(", displayOrderId=");
        sb.append(str);
        sb.append(", trackNumber=");
        n6j.b(sb, str2, ", trackLink=", str3, ", comment=");
        n6j.b(sb, str4, ", address=", str5, ", merchantComment=");
        kr.b(num, str6, ", weight=", ", previewOrderItems=", sb);
        sb.append(list);
        sb.append(", cancelInfo=");
        sb.append(baseLinkDto);
        sb.append(", canAddReview=");
        return xq.d(sb, bool, ")");
    }

    public /* synthetic */ MarketOrderDto(int i, UserId userId, UserId userId2, int i2, int i3, int i4, MarketPriceDto marketPriceDto, String str, String str2, String str3, String str4, String str5, String str6, Integer num, List list, BaseLinkDto baseLinkDto, Boolean bool, int i5, zcl zclVar) {
        this(i, userId, userId2, i2, i3, i4, marketPriceDto, (i5 & 128) != 0 ? null : str, (i5 & 256) != 0 ? null : str2, (i5 & 512) != 0 ? null : str3, (i5 & 1024) != 0 ? null : str4, (i5 & 2048) != 0 ? null : str5, (i5 & 4096) != 0 ? null : str6, (i5 & 8192) != 0 ? null : num, (i5 & 16384) != 0 ? null : list, (32768 & i5) != 0 ? null : baseLinkDto, (i5 & 65536) != 0 ? null : bool);
    }
}
