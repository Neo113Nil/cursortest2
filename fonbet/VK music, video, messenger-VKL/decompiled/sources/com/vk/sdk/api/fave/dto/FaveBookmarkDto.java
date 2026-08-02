package com.vk.sdk.api.fave.dto;

import com.vk.sdk.api.base.dto.BaseLinkDto;
import com.vk.sdk.api.market.dto.MarketMarketItemFullDto;
import com.vk.sdk.api.video.dto.VideoVideoFullDto;
import com.vk.sdk.api.wall.dto.WallWallpostFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: FaveBookmarkDto.kt */
/* loaded from: classes5.dex */
public final class FaveBookmarkDto {

    @pmi0("added_date")
    private final int addedDate;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0("post")
    private final WallWallpostFullDto post;

    @pmi0("product")
    private final MarketMarketItemFullDto product;

    @pmi0("seen")
    private final boolean seen;

    @pmi0("tags")
    private final List<FaveTagDto> tags;

    @pmi0("type")
    private final FaveBookmarkTypeDto type;

    @pmi0("video")
    private final VideoVideoFullDto video;

    public FaveBookmarkDto(int i, boolean z, List<FaveTagDto> list, FaveBookmarkTypeDto faveBookmarkTypeDto, BaseLinkDto baseLinkDto, WallWallpostFullDto wallWallpostFullDto, MarketMarketItemFullDto marketMarketItemFullDto, VideoVideoFullDto videoVideoFullDto) {
        this.addedDate = i;
        this.seen = z;
        this.tags = list;
        this.type = faveBookmarkTypeDto;
        this.link = baseLinkDto;
        this.post = wallWallpostFullDto;
        this.product = marketMarketItemFullDto;
        this.video = videoVideoFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveBookmarkDto)) {
            return false;
        }
        FaveBookmarkDto faveBookmarkDto = (FaveBookmarkDto) obj;
        return this.addedDate == faveBookmarkDto.addedDate && this.seen == faveBookmarkDto.seen && epx.f(this.tags, faveBookmarkDto.tags) && this.type == faveBookmarkDto.type && epx.f(this.link, faveBookmarkDto.link) && epx.f(this.post, faveBookmarkDto.post) && epx.f(this.product, faveBookmarkDto.product) && epx.f(this.video, faveBookmarkDto.video);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + fw3.a(qoy.b(Integer.hashCode(this.addedDate) * 31, 31, this.seen), 31, this.tags)) * 31;
        BaseLinkDto baseLinkDto = this.link;
        int hashCode2 = (hashCode + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        WallWallpostFullDto wallWallpostFullDto = this.post;
        int hashCode3 = (hashCode2 + (wallWallpostFullDto == null ? 0 : wallWallpostFullDto.hashCode())) * 31;
        MarketMarketItemFullDto marketMarketItemFullDto = this.product;
        int hashCode4 = (hashCode3 + (marketMarketItemFullDto == null ? 0 : marketMarketItemFullDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        return hashCode4 + (videoVideoFullDto != null ? videoVideoFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "FaveBookmarkDto(addedDate=" + this.addedDate + ", seen=" + this.seen + ", tags=" + this.tags + ", type=" + this.type + ", link=" + this.link + ", post=" + this.post + ", product=" + this.product + ", video=" + this.video + ")";
    }

    public /* synthetic */ FaveBookmarkDto(int i, boolean z, List list, FaveBookmarkTypeDto faveBookmarkTypeDto, BaseLinkDto baseLinkDto, WallWallpostFullDto wallWallpostFullDto, MarketMarketItemFullDto marketMarketItemFullDto, VideoVideoFullDto videoVideoFullDto, int i2, zcl zclVar) {
        this(i, z, list, faveBookmarkTypeDto, (i2 & 16) != 0 ? null : baseLinkDto, (i2 & 32) != 0 ? null : wallWallpostFullDto, (i2 & 64) != 0 ? null : marketMarketItemFullDto, (i2 & 128) != 0 ? null : videoVideoFullDto);
    }
}
