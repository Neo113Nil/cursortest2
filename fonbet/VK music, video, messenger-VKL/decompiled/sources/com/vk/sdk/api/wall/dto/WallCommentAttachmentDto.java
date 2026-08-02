package com.vk.sdk.api.wall.dto;

import com.vk.sdk.api.audio.dto.AudioAudioDto;
import com.vk.sdk.api.base.dto.BaseLinkDto;
import com.vk.sdk.api.base.dto.BaseStickerDto;
import com.vk.sdk.api.docs.dto.DocsDocDto;
import com.vk.sdk.api.market.dto.MarketMarketAlbumDto;
import com.vk.sdk.api.market.dto.MarketMarketItemDto;
import com.vk.sdk.api.pages.dto.PagesWikipageFullDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import com.vk.sdk.api.video.dto.VideoVideoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallCommentAttachmentDto.kt */
/* loaded from: classes5.dex */
public final class WallCommentAttachmentDto {

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("graffiti")
    private final WallGraffitiDto graffiti;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0("market")
    private final MarketMarketItemDto market;

    @pmi0("market_market_album")
    private final MarketMarketAlbumDto marketMarketAlbum;

    @pmi0("note")
    private final WallAttachedNoteDto note;

    @pmi0("page")
    private final PagesWikipageFullDto page;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("sticker")
    private final BaseStickerDto sticker;

    @pmi0("type")
    private final WallCommentAttachmentTypeDto type;

    @pmi0("video")
    private final VideoVideoDto video;

    public WallCommentAttachmentDto(WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto, AudioAudioDto audioAudioDto, DocsDocDto docsDocDto, BaseLinkDto baseLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, WallAttachedNoteDto wallAttachedNoteDto, PagesWikipageFullDto pagesWikipageFullDto, PhotosPhotoDto photosPhotoDto, BaseStickerDto baseStickerDto, VideoVideoDto videoVideoDto, WallGraffitiDto wallGraffitiDto) {
        this.type = wallCommentAttachmentTypeDto;
        this.audio = audioAudioDto;
        this.doc = docsDocDto;
        this.link = baseLinkDto;
        this.market = marketMarketItemDto;
        this.marketMarketAlbum = marketMarketAlbumDto;
        this.note = wallAttachedNoteDto;
        this.page = pagesWikipageFullDto;
        this.photo = photosPhotoDto;
        this.sticker = baseStickerDto;
        this.video = videoVideoDto;
        this.graffiti = wallGraffitiDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallCommentAttachmentDto)) {
            return false;
        }
        WallCommentAttachmentDto wallCommentAttachmentDto = (WallCommentAttachmentDto) obj;
        return this.type == wallCommentAttachmentDto.type && epx.f(this.audio, wallCommentAttachmentDto.audio) && epx.f(this.doc, wallCommentAttachmentDto.doc) && epx.f(this.link, wallCommentAttachmentDto.link) && epx.f(this.market, wallCommentAttachmentDto.market) && epx.f(this.marketMarketAlbum, wallCommentAttachmentDto.marketMarketAlbum) && epx.f(this.note, wallCommentAttachmentDto.note) && epx.f(this.page, wallCommentAttachmentDto.page) && epx.f(this.photo, wallCommentAttachmentDto.photo) && epx.f(this.sticker, wallCommentAttachmentDto.sticker) && epx.f(this.video, wallCommentAttachmentDto.video) && epx.f(this.graffiti, wallCommentAttachmentDto.graffiti);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode2 = (hashCode + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode3 = (hashCode2 + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        int hashCode4 = (hashCode3 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.market;
        int hashCode5 = (hashCode4 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        MarketMarketAlbumDto marketMarketAlbumDto = this.marketMarketAlbum;
        int hashCode6 = (hashCode5 + (marketMarketAlbumDto == null ? 0 : marketMarketAlbumDto.hashCode())) * 31;
        WallAttachedNoteDto wallAttachedNoteDto = this.note;
        int hashCode7 = (hashCode6 + (wallAttachedNoteDto == null ? 0 : wallAttachedNoteDto.hashCode())) * 31;
        PagesWikipageFullDto pagesWikipageFullDto = this.page;
        int hashCode8 = (hashCode7 + (pagesWikipageFullDto == null ? 0 : pagesWikipageFullDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode9 = (hashCode8 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        BaseStickerDto baseStickerDto = this.sticker;
        int hashCode10 = (hashCode9 + (baseStickerDto == null ? 0 : baseStickerDto.hashCode())) * 31;
        VideoVideoDto videoVideoDto = this.video;
        int hashCode11 = (hashCode10 + (videoVideoDto == null ? 0 : videoVideoDto.hashCode())) * 31;
        WallGraffitiDto wallGraffitiDto = this.graffiti;
        return hashCode11 + (wallGraffitiDto != null ? wallGraffitiDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallCommentAttachmentDto(type=" + this.type + ", audio=" + this.audio + ", doc=" + this.doc + ", link=" + this.link + ", market=" + this.market + ", marketMarketAlbum=" + this.marketMarketAlbum + ", note=" + this.note + ", page=" + this.page + ", photo=" + this.photo + ", sticker=" + this.sticker + ", video=" + this.video + ", graffiti=" + this.graffiti + ")";
    }

    public /* synthetic */ WallCommentAttachmentDto(WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto, AudioAudioDto audioAudioDto, DocsDocDto docsDocDto, BaseLinkDto baseLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, WallAttachedNoteDto wallAttachedNoteDto, PagesWikipageFullDto pagesWikipageFullDto, PhotosPhotoDto photosPhotoDto, BaseStickerDto baseStickerDto, VideoVideoDto videoVideoDto, WallGraffitiDto wallGraffitiDto, int i, zcl zclVar) {
        this(wallCommentAttachmentTypeDto, (i & 2) != 0 ? null : audioAudioDto, (i & 4) != 0 ? null : docsDocDto, (i & 8) != 0 ? null : baseLinkDto, (i & 16) != 0 ? null : marketMarketItemDto, (i & 32) != 0 ? null : marketMarketAlbumDto, (i & 64) != 0 ? null : wallAttachedNoteDto, (i & 128) != 0 ? null : pagesWikipageFullDto, (i & 256) != 0 ? null : photosPhotoDto, (i & 512) != 0 ? null : baseStickerDto, (i & 1024) != 0 ? null : videoVideoDto, (i & 2048) != 0 ? null : wallGraffitiDto);
    }
}
