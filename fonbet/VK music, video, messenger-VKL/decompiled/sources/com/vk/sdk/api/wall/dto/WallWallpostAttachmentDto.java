package com.vk.sdk.api.wall.dto;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.sdk.api.audio.dto.AudioAudioDto;
import com.vk.sdk.api.base.dto.BaseLinkDto;
import com.vk.sdk.api.docs.dto.DocsDocDto;
import com.vk.sdk.api.events.dto.EventsEventAttachDto;
import com.vk.sdk.api.groups.dto.GroupsGroupAttachDto;
import com.vk.sdk.api.market.dto.MarketMarketAlbumDto;
import com.vk.sdk.api.market.dto.MarketMarketItemDto;
import com.vk.sdk.api.notes.dto.NotesNoteDto;
import com.vk.sdk.api.pages.dto.PagesWikipageFullDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoAlbumDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import com.vk.sdk.api.polls.dto.PollsPollDto;
import com.vk.sdk.api.video.dto.VideoVideoAlbumFullDto;
import com.vk.sdk.api.video.dto.VideoVideoFullDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallWallpostAttachmentDto.kt */
/* loaded from: classes5.dex */
public final class WallWallpostAttachmentDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("album")
    private final PhotosPhotoAlbumDto album;

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final WallAppPostDto f95app;

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final EventsEventAttachDto event;

    @pmi0("graffiti")
    private final WallGraffitiDto graffiti;

    @pmi0("group")
    private final GroupsGroupAttachDto group;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0("market")
    private final MarketMarketItemDto market;

    @pmi0("market_album")
    private final MarketMarketAlbumDto marketAlbum;

    @pmi0("note")
    private final NotesNoteDto note;

    @pmi0("page")
    private final PagesWikipageFullDto page;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("posted_photo")
    private final WallPostedPhotoDto postedPhoto;

    @pmi0("type")
    private final WallWallpostAttachmentTypeDto type;

    @pmi0("video")
    private final VideoVideoFullDto video;

    @pmi0("video_playlist")
    private final VideoVideoAlbumFullDto videoPlaylist;

    public WallWallpostAttachmentDto(WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto, String str, PhotosPhotoAlbumDto photosPhotoAlbumDto, WallAppPostDto wallAppPostDto, AudioAudioDto audioAudioDto, DocsDocDto docsDocDto, EventsEventAttachDto eventsEventAttachDto, GroupsGroupAttachDto groupsGroupAttachDto, WallGraffitiDto wallGraffitiDto, BaseLinkDto baseLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, NotesNoteDto notesNoteDto, PagesWikipageFullDto pagesWikipageFullDto, PhotosPhotoDto photosPhotoDto, PollsPollDto pollsPollDto, WallPostedPhotoDto wallPostedPhotoDto, VideoVideoFullDto videoVideoFullDto, VideoVideoAlbumFullDto videoVideoAlbumFullDto) {
        this.type = wallWallpostAttachmentTypeDto;
        this.accessKey = str;
        this.album = photosPhotoAlbumDto;
        this.f95app = wallAppPostDto;
        this.audio = audioAudioDto;
        this.doc = docsDocDto;
        this.event = eventsEventAttachDto;
        this.group = groupsGroupAttachDto;
        this.graffiti = wallGraffitiDto;
        this.link = baseLinkDto;
        this.market = marketMarketItemDto;
        this.marketAlbum = marketMarketAlbumDto;
        this.note = notesNoteDto;
        this.page = pagesWikipageFullDto;
        this.photo = photosPhotoDto;
        this.poll = pollsPollDto;
        this.postedPhoto = wallPostedPhotoDto;
        this.video = videoVideoFullDto;
        this.videoPlaylist = videoVideoAlbumFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAttachmentDto)) {
            return false;
        }
        WallWallpostAttachmentDto wallWallpostAttachmentDto = (WallWallpostAttachmentDto) obj;
        return this.type == wallWallpostAttachmentDto.type && epx.f(this.accessKey, wallWallpostAttachmentDto.accessKey) && epx.f(this.album, wallWallpostAttachmentDto.album) && epx.f(this.f95app, wallWallpostAttachmentDto.f95app) && epx.f(this.audio, wallWallpostAttachmentDto.audio) && epx.f(this.doc, wallWallpostAttachmentDto.doc) && epx.f(this.event, wallWallpostAttachmentDto.event) && epx.f(this.group, wallWallpostAttachmentDto.group) && epx.f(this.graffiti, wallWallpostAttachmentDto.graffiti) && epx.f(this.link, wallWallpostAttachmentDto.link) && epx.f(this.market, wallWallpostAttachmentDto.market) && epx.f(this.marketAlbum, wallWallpostAttachmentDto.marketAlbum) && epx.f(this.note, wallWallpostAttachmentDto.note) && epx.f(this.page, wallWallpostAttachmentDto.page) && epx.f(this.photo, wallWallpostAttachmentDto.photo) && epx.f(this.poll, wallWallpostAttachmentDto.poll) && epx.f(this.postedPhoto, wallWallpostAttachmentDto.postedPhoto) && epx.f(this.video, wallWallpostAttachmentDto.video) && epx.f(this.videoPlaylist, wallWallpostAttachmentDto.videoPlaylist);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.accessKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PhotosPhotoAlbumDto photosPhotoAlbumDto = this.album;
        int hashCode3 = (hashCode2 + (photosPhotoAlbumDto == null ? 0 : photosPhotoAlbumDto.hashCode())) * 31;
        WallAppPostDto wallAppPostDto = this.f95app;
        int hashCode4 = (hashCode3 + (wallAppPostDto == null ? 0 : wallAppPostDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode5 = (hashCode4 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode6 = (hashCode5 + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        EventsEventAttachDto eventsEventAttachDto = this.event;
        int hashCode7 = (hashCode6 + (eventsEventAttachDto == null ? 0 : eventsEventAttachDto.hashCode())) * 31;
        GroupsGroupAttachDto groupsGroupAttachDto = this.group;
        int hashCode8 = (hashCode7 + (groupsGroupAttachDto == null ? 0 : groupsGroupAttachDto.hashCode())) * 31;
        WallGraffitiDto wallGraffitiDto = this.graffiti;
        int hashCode9 = (hashCode8 + (wallGraffitiDto == null ? 0 : wallGraffitiDto.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        int hashCode10 = (hashCode9 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.market;
        int hashCode11 = (hashCode10 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        MarketMarketAlbumDto marketMarketAlbumDto = this.marketAlbum;
        int hashCode12 = (hashCode11 + (marketMarketAlbumDto == null ? 0 : marketMarketAlbumDto.hashCode())) * 31;
        NotesNoteDto notesNoteDto = this.note;
        int hashCode13 = (hashCode12 + (notesNoteDto == null ? 0 : notesNoteDto.hashCode())) * 31;
        PagesWikipageFullDto pagesWikipageFullDto = this.page;
        int hashCode14 = (hashCode13 + (pagesWikipageFullDto == null ? 0 : pagesWikipageFullDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode15 = (hashCode14 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        PollsPollDto pollsPollDto = this.poll;
        int hashCode16 = (hashCode15 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        WallPostedPhotoDto wallPostedPhotoDto = this.postedPhoto;
        int hashCode17 = (hashCode16 + (wallPostedPhotoDto == null ? 0 : wallPostedPhotoDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode18 = (hashCode17 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        VideoVideoAlbumFullDto videoVideoAlbumFullDto = this.videoPlaylist;
        return hashCode18 + (videoVideoAlbumFullDto != null ? videoVideoAlbumFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallWallpostAttachmentDto(type=" + this.type + ", accessKey=" + this.accessKey + ", album=" + this.album + ", app=" + this.f95app + ", audio=" + this.audio + ", doc=" + this.doc + ", event=" + this.event + ", group=" + this.group + ", graffiti=" + this.graffiti + ", link=" + this.link + ", market=" + this.market + ", marketAlbum=" + this.marketAlbum + ", note=" + this.note + ", page=" + this.page + ", photo=" + this.photo + ", poll=" + this.poll + ", postedPhoto=" + this.postedPhoto + ", video=" + this.video + ", videoPlaylist=" + this.videoPlaylist + ")";
    }

    public /* synthetic */ WallWallpostAttachmentDto(WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto, String str, PhotosPhotoAlbumDto photosPhotoAlbumDto, WallAppPostDto wallAppPostDto, AudioAudioDto audioAudioDto, DocsDocDto docsDocDto, EventsEventAttachDto eventsEventAttachDto, GroupsGroupAttachDto groupsGroupAttachDto, WallGraffitiDto wallGraffitiDto, BaseLinkDto baseLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, NotesNoteDto notesNoteDto, PagesWikipageFullDto pagesWikipageFullDto, PhotosPhotoDto photosPhotoDto, PollsPollDto pollsPollDto, WallPostedPhotoDto wallPostedPhotoDto, VideoVideoFullDto videoVideoFullDto, VideoVideoAlbumFullDto videoVideoAlbumFullDto, int i, zcl zclVar) {
        this(wallWallpostAttachmentTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : photosPhotoAlbumDto, (i & 8) != 0 ? null : wallAppPostDto, (i & 16) != 0 ? null : audioAudioDto, (i & 32) != 0 ? null : docsDocDto, (i & 64) != 0 ? null : eventsEventAttachDto, (i & 128) != 0 ? null : groupsGroupAttachDto, (i & 256) != 0 ? null : wallGraffitiDto, (i & 512) != 0 ? null : baseLinkDto, (i & 1024) != 0 ? null : marketMarketItemDto, (i & 2048) != 0 ? null : marketMarketAlbumDto, (i & 4096) != 0 ? null : notesNoteDto, (i & 8192) != 0 ? null : pagesWikipageFullDto, (i & 16384) != 0 ? null : photosPhotoDto, (i & 32768) != 0 ? null : pollsPollDto, (i & 65536) != 0 ? null : wallPostedPhotoDto, (i & 131072) != 0 ? null : videoVideoFullDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : videoVideoAlbumFullDto);
    }
}
