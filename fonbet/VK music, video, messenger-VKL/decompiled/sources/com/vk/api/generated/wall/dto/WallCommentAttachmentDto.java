package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.docs.dto.DocsDocDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.pages.dto.PagesWikipageFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallCommentAttachmentDto.kt */
/* loaded from: classes15.dex */
public final class WallCommentAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<WallCommentAttachmentDto> CREATOR = new a();

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_playlist")
    private final AudioPlaylistDto audioPlaylist;

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

    /* compiled from: WallCommentAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<WallCommentAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final WallCommentAttachmentDto createFromParcel(Parcel parcel) {
            return new WallCommentAttachmentDto(WallCommentAttachmentTypeDto.CREATOR.createFromParcel(parcel), (AudioAudioDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), (AudioPlaylistDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), (DocsDocDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), (BaseLinkDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), (MarketMarketItemDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), (MarketMarketAlbumDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), parcel.readInt() == 0 ? null : WallAttachedNoteDto.CREATOR.createFromParcel(parcel), (PagesWikipageFullDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), (PhotosPhotoDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), (BaseStickerDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), (VideoVideoDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()), (WallGraffitiDto) parcel.readParcelable(WallCommentAttachmentDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallCommentAttachmentDto[] newArray(int i) {
            return new WallCommentAttachmentDto[i];
        }
    }

    public WallCommentAttachmentDto(WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto, AudioAudioDto audioAudioDto, AudioPlaylistDto audioPlaylistDto, DocsDocDto docsDocDto, BaseLinkDto baseLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, WallAttachedNoteDto wallAttachedNoteDto, PagesWikipageFullDto pagesWikipageFullDto, PhotosPhotoDto photosPhotoDto, BaseStickerDto baseStickerDto, VideoVideoDto videoVideoDto, WallGraffitiDto wallGraffitiDto) {
        this.type = wallCommentAttachmentTypeDto;
        this.audio = audioAudioDto;
        this.audioPlaylist = audioPlaylistDto;
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallCommentAttachmentDto)) {
            return false;
        }
        WallCommentAttachmentDto wallCommentAttachmentDto = (WallCommentAttachmentDto) obj;
        return this.type == wallCommentAttachmentDto.type && epx.f(this.audio, wallCommentAttachmentDto.audio) && epx.f(this.audioPlaylist, wallCommentAttachmentDto.audioPlaylist) && epx.f(this.doc, wallCommentAttachmentDto.doc) && epx.f(this.link, wallCommentAttachmentDto.link) && epx.f(this.market, wallCommentAttachmentDto.market) && epx.f(this.marketMarketAlbum, wallCommentAttachmentDto.marketMarketAlbum) && epx.f(this.note, wallCommentAttachmentDto.note) && epx.f(this.page, wallCommentAttachmentDto.page) && epx.f(this.photo, wallCommentAttachmentDto.photo) && epx.f(this.sticker, wallCommentAttachmentDto.sticker) && epx.f(this.video, wallCommentAttachmentDto.video) && epx.f(this.graffiti, wallCommentAttachmentDto.graffiti);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode2 = (hashCode + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        AudioPlaylistDto audioPlaylistDto = this.audioPlaylist;
        int hashCode3 = (hashCode2 + (audioPlaylistDto == null ? 0 : audioPlaylistDto.hashCode())) * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode4 = (hashCode3 + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        int hashCode5 = (hashCode4 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.market;
        int hashCode6 = (hashCode5 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        MarketMarketAlbumDto marketMarketAlbumDto = this.marketMarketAlbum;
        int hashCode7 = (hashCode6 + (marketMarketAlbumDto == null ? 0 : marketMarketAlbumDto.hashCode())) * 31;
        WallAttachedNoteDto wallAttachedNoteDto = this.note;
        int hashCode8 = (hashCode7 + (wallAttachedNoteDto == null ? 0 : wallAttachedNoteDto.hashCode())) * 31;
        PagesWikipageFullDto pagesWikipageFullDto = this.page;
        int hashCode9 = (hashCode8 + (pagesWikipageFullDto == null ? 0 : pagesWikipageFullDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode10 = (hashCode9 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        BaseStickerDto baseStickerDto = this.sticker;
        int hashCode11 = (hashCode10 + (baseStickerDto == null ? 0 : baseStickerDto.hashCode())) * 31;
        VideoVideoDto videoVideoDto = this.video;
        int hashCode12 = (hashCode11 + (videoVideoDto == null ? 0 : videoVideoDto.hashCode())) * 31;
        WallGraffitiDto wallGraffitiDto = this.graffiti;
        return hashCode12 + (wallGraffitiDto != null ? wallGraffitiDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallCommentAttachmentDto(type=" + this.type + ", audio=" + this.audio + ", audioPlaylist=" + this.audioPlaylist + ", doc=" + this.doc + ", link=" + this.link + ", market=" + this.market + ", marketMarketAlbum=" + this.marketMarketAlbum + ", note=" + this.note + ", page=" + this.page + ", photo=" + this.photo + ", sticker=" + this.sticker + ", video=" + this.video + ", graffiti=" + this.graffiti + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.audio, i);
        parcel.writeParcelable(this.audioPlaylist, i);
        parcel.writeParcelable(this.doc, i);
        parcel.writeParcelable(this.link, i);
        parcel.writeParcelable(this.market, i);
        parcel.writeParcelable(this.marketMarketAlbum, i);
        WallAttachedNoteDto wallAttachedNoteDto = this.note;
        if (wallAttachedNoteDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallAttachedNoteDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.page, i);
        parcel.writeParcelable(this.photo, i);
        parcel.writeParcelable(this.sticker, i);
        parcel.writeParcelable(this.video, i);
        parcel.writeParcelable(this.graffiti, i);
    }

    public /* synthetic */ WallCommentAttachmentDto(WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto, AudioAudioDto audioAudioDto, AudioPlaylistDto audioPlaylistDto, DocsDocDto docsDocDto, BaseLinkDto baseLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, WallAttachedNoteDto wallAttachedNoteDto, PagesWikipageFullDto pagesWikipageFullDto, PhotosPhotoDto photosPhotoDto, BaseStickerDto baseStickerDto, VideoVideoDto videoVideoDto, WallGraffitiDto wallGraffitiDto, int i, zcl zclVar) {
        this(wallCommentAttachmentTypeDto, (i & 2) != 0 ? null : audioAudioDto, (i & 4) != 0 ? null : audioPlaylistDto, (i & 8) != 0 ? null : docsDocDto, (i & 16) != 0 ? null : baseLinkDto, (i & 32) != 0 ? null : marketMarketItemDto, (i & 64) != 0 ? null : marketMarketAlbumDto, (i & 128) != 0 ? null : wallAttachedNoteDto, (i & 256) != 0 ? null : pagesWikipageFullDto, (i & 512) != 0 ? null : photosPhotoDto, (i & 1024) != 0 ? null : baseStickerDto, (i & 2048) != 0 ? null : videoVideoDto, (i & 4096) != 0 ? null : wallGraffitiDto);
    }
}
