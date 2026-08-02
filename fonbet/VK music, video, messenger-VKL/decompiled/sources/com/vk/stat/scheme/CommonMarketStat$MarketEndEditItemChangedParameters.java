package com.vk.stat.scheme;

import com.facebook.soloader.MinElf;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$MarketEndEditItemChangedParameters {

    @pmi0("album")
    private final Integer album;

    @pmi0("category_1")
    private final Integer category1;

    @pmi0("category_2")
    private final Integer category2;

    @pmi0("description")
    private final Integer description;

    @pmi0("has_attendant_items")
    private final Integer hasAttendantItems;

    @pmi0("in_stock_cnt")
    private final Integer inStockCnt;

    @pmi0("item_height")
    private final Integer itemHeight;

    @pmi0("item_length")
    private final Integer itemLength;

    @pmi0("item_name")
    private final Integer itemName;

    @pmi0("item_weight")
    private final Integer itemWeight;

    @pmi0("item_width")
    private final Integer itemWidth;

    @pmi0("old_price")
    private final Integer oldPrice;

    @pmi0("photo")
    private final Integer photo;

    @pmi0("price")
    private final Integer price;

    @pmi0("sku")
    private final Integer sku;

    @pmi0("video")
    private final Integer video;

    public CommonMarketStat$MarketEndEditItemChangedParameters() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, MinElf.PN_XNUM, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$MarketEndEditItemChangedParameters)) {
            return false;
        }
        CommonMarketStat$MarketEndEditItemChangedParameters commonMarketStat$MarketEndEditItemChangedParameters = (CommonMarketStat$MarketEndEditItemChangedParameters) obj;
        return epx.f(this.category1, commonMarketStat$MarketEndEditItemChangedParameters.category1) && epx.f(this.category2, commonMarketStat$MarketEndEditItemChangedParameters.category2) && epx.f(this.itemName, commonMarketStat$MarketEndEditItemChangedParameters.itemName) && epx.f(this.sku, commonMarketStat$MarketEndEditItemChangedParameters.sku) && epx.f(this.description, commonMarketStat$MarketEndEditItemChangedParameters.description) && epx.f(this.photo, commonMarketStat$MarketEndEditItemChangedParameters.photo) && epx.f(this.video, commonMarketStat$MarketEndEditItemChangedParameters.video) && epx.f(this.price, commonMarketStat$MarketEndEditItemChangedParameters.price) && epx.f(this.oldPrice, commonMarketStat$MarketEndEditItemChangedParameters.oldPrice) && epx.f(this.itemWeight, commonMarketStat$MarketEndEditItemChangedParameters.itemWeight) && epx.f(this.itemHeight, commonMarketStat$MarketEndEditItemChangedParameters.itemHeight) && epx.f(this.itemWidth, commonMarketStat$MarketEndEditItemChangedParameters.itemWidth) && epx.f(this.itemLength, commonMarketStat$MarketEndEditItemChangedParameters.itemLength) && epx.f(this.inStockCnt, commonMarketStat$MarketEndEditItemChangedParameters.inStockCnt) && epx.f(this.album, commonMarketStat$MarketEndEditItemChangedParameters.album) && epx.f(this.hasAttendantItems, commonMarketStat$MarketEndEditItemChangedParameters.hasAttendantItems);
    }

    public final int hashCode() {
        Integer num = this.category1;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.category2;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemName;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sku;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.description;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.photo;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.video;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.price;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.oldPrice;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.itemWeight;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.itemHeight;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.itemWidth;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.itemLength;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.inStockCnt;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.album;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.hasAttendantItems;
        return hashCode15 + (num16 != null ? num16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketEndEditItemChangedParameters(category1=");
        sb.append(this.category1);
        sb.append(", category2=");
        sb.append(this.category2);
        sb.append(", itemName=");
        sb.append(this.itemName);
        sb.append(", sku=");
        sb.append(this.sku);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", oldPrice=");
        sb.append(this.oldPrice);
        sb.append(", itemWeight=");
        sb.append(this.itemWeight);
        sb.append(", itemHeight=");
        sb.append(this.itemHeight);
        sb.append(", itemWidth=");
        sb.append(this.itemWidth);
        sb.append(", itemLength=");
        sb.append(this.itemLength);
        sb.append(", inStockCnt=");
        sb.append(this.inStockCnt);
        sb.append(", album=");
        sb.append(this.album);
        sb.append(", hasAttendantItems=");
        return uqi.b(sb, this.hasAttendantItems, ')');
    }

    public CommonMarketStat$MarketEndEditItemChangedParameters(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16) {
        this.category1 = num;
        this.category2 = num2;
        this.itemName = num3;
        this.sku = num4;
        this.description = num5;
        this.photo = num6;
        this.video = num7;
        this.price = num8;
        this.oldPrice = num9;
        this.itemWeight = num10;
        this.itemHeight = num11;
        this.itemWidth = num12;
        this.itemLength = num13;
        this.inStockCnt = num14;
        this.album = num15;
        this.hasAttendantItems = num16;
    }

    public /* synthetic */ CommonMarketStat$MarketEndEditItemChangedParameters(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : num14, (i & 16384) != 0 ? null : num15, (i & 32768) != 0 ? null : num16);
    }
}
