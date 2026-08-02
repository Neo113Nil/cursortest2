package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsActionAttachmentDto;
import com.vk.api.generated.apps.dto.AppsMiniAppAttachDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.docs.dto.DocsDocDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketMarketOrderDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoOneOfVideoAlbumObjectsDto;
import com.vk.api.generated.video.dto.VideoOneOfVideoObjectsDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesHistoryMessageAttachmentDto.kt */
/* loaded from: classes15.dex */
public final class MessagesHistoryMessageAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<MessagesHistoryMessageAttachmentDto> CREATOR = new a();

    @pmi0("app_action")
    private final AppsActionAttachmentDto appAction;

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_message")
    private final MessagesAudioMessageDto audioMessage;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("graffiti")
    private final MessagesGraffitiDto graffiti;

    @pmi0("link")
    private final MessagesMessageAttachmentLinkDto link;

    @pmi0("market")
    private final MarketMarketItemDto market;

    @pmi0("market_order")
    private final MarketMarketOrderDto marketOrder;

    @pmi0("mini_app")
    private final AppsMiniAppAttachDto miniApp;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("type")
    private final MessagesHistoryMessageAttachmentTypeDto type;

    @pmi0("video")
    private final VideoOneOfVideoObjectsDto video;

    @pmi0("video_message")
    private final MessagesMessageAttachmentVideoMessageDto videoMessage;

    @pmi0("video_playlist")
    private final VideoOneOfVideoAlbumObjectsDto videoPlaylist;

    @pmi0("wall")
    private final MessagesMessageAttachmentWallpostDto wall;

    /* compiled from: MessagesHistoryMessageAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<MessagesHistoryMessageAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesHistoryMessageAttachmentDto createFromParcel(Parcel parcel) {
            return new MessagesHistoryMessageAttachmentDto(MessagesHistoryMessageAttachmentTypeDto.CREATOR.createFromParcel(parcel), (AudioAudioDto) parcel.readParcelable(MessagesHistoryMessageAttachmentDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MessagesAudioMessageDto.CREATOR.createFromParcel(parcel), (DocsDocDto) parcel.readParcelable(MessagesHistoryMessageAttachmentDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MessagesGraffitiDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MessagesMessageAttachmentLinkDto.CREATOR.createFromParcel(parcel), (MarketMarketItemDto) parcel.readParcelable(MessagesHistoryMessageAttachmentDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MarketMarketOrderDto.CREATOR.createFromParcel(parcel), (AppsMiniAppAttachDto) parcel.readParcelable(MessagesHistoryMessageAttachmentDto.class.getClassLoader()), (PhotosPhotoDto) parcel.readParcelable(MessagesHistoryMessageAttachmentDto.class.getClassLoader()), (VideoOneOfVideoObjectsDto) parcel.readParcelable(MessagesHistoryMessageAttachmentDto.class.getClassLoader()), (VideoOneOfVideoAlbumObjectsDto) parcel.readParcelable(MessagesHistoryMessageAttachmentDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MessagesMessageAttachmentVideoMessageDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MessagesMessageAttachmentWallpostDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsActionAttachmentDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesHistoryMessageAttachmentDto[] newArray(int i) {
            return new MessagesHistoryMessageAttachmentDto[i];
        }
    }

    public MessagesHistoryMessageAttachmentDto(MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto, AudioAudioDto audioAudioDto, MessagesAudioMessageDto messagesAudioMessageDto, DocsDocDto docsDocDto, MessagesGraffitiDto messagesGraffitiDto, MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketOrderDto marketMarketOrderDto, AppsMiniAppAttachDto appsMiniAppAttachDto, PhotosPhotoDto photosPhotoDto, VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto, VideoOneOfVideoAlbumObjectsDto videoOneOfVideoAlbumObjectsDto, MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto, MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto, AppsActionAttachmentDto appsActionAttachmentDto) {
        this.type = messagesHistoryMessageAttachmentTypeDto;
        this.audio = audioAudioDto;
        this.audioMessage = messagesAudioMessageDto;
        this.doc = docsDocDto;
        this.graffiti = messagesGraffitiDto;
        this.link = messagesMessageAttachmentLinkDto;
        this.market = marketMarketItemDto;
        this.marketOrder = marketMarketOrderDto;
        this.miniApp = appsMiniAppAttachDto;
        this.photo = photosPhotoDto;
        this.video = videoOneOfVideoObjectsDto;
        this.videoPlaylist = videoOneOfVideoAlbumObjectsDto;
        this.videoMessage = messagesMessageAttachmentVideoMessageDto;
        this.wall = messagesMessageAttachmentWallpostDto;
        this.appAction = appsActionAttachmentDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesHistoryMessageAttachmentDto)) {
            return false;
        }
        MessagesHistoryMessageAttachmentDto messagesHistoryMessageAttachmentDto = (MessagesHistoryMessageAttachmentDto) obj;
        return this.type == messagesHistoryMessageAttachmentDto.type && epx.f(this.audio, messagesHistoryMessageAttachmentDto.audio) && epx.f(this.audioMessage, messagesHistoryMessageAttachmentDto.audioMessage) && epx.f(this.doc, messagesHistoryMessageAttachmentDto.doc) && epx.f(this.graffiti, messagesHistoryMessageAttachmentDto.graffiti) && epx.f(this.link, messagesHistoryMessageAttachmentDto.link) && epx.f(this.market, messagesHistoryMessageAttachmentDto.market) && epx.f(this.marketOrder, messagesHistoryMessageAttachmentDto.marketOrder) && epx.f(this.miniApp, messagesHistoryMessageAttachmentDto.miniApp) && epx.f(this.photo, messagesHistoryMessageAttachmentDto.photo) && epx.f(this.video, messagesHistoryMessageAttachmentDto.video) && epx.f(this.videoPlaylist, messagesHistoryMessageAttachmentDto.videoPlaylist) && epx.f(this.videoMessage, messagesHistoryMessageAttachmentDto.videoMessage) && epx.f(this.wall, messagesHistoryMessageAttachmentDto.wall) && epx.f(this.appAction, messagesHistoryMessageAttachmentDto.appAction);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode2 = (hashCode + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        MessagesAudioMessageDto messagesAudioMessageDto = this.audioMessage;
        int hashCode3 = (hashCode2 + (messagesAudioMessageDto == null ? 0 : messagesAudioMessageDto.hashCode())) * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode4 = (hashCode3 + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        MessagesGraffitiDto messagesGraffitiDto = this.graffiti;
        int hashCode5 = (hashCode4 + (messagesGraffitiDto == null ? 0 : messagesGraffitiDto.hashCode())) * 31;
        MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto = this.link;
        int hashCode6 = (hashCode5 + (messagesMessageAttachmentLinkDto == null ? 0 : messagesMessageAttachmentLinkDto.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.market;
        int hashCode7 = (hashCode6 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        MarketMarketOrderDto marketMarketOrderDto = this.marketOrder;
        int hashCode8 = (hashCode7 + (marketMarketOrderDto == null ? 0 : marketMarketOrderDto.hashCode())) * 31;
        AppsMiniAppAttachDto appsMiniAppAttachDto = this.miniApp;
        int hashCode9 = (hashCode8 + (appsMiniAppAttachDto == null ? 0 : appsMiniAppAttachDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode10 = (hashCode9 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto = this.video;
        int hashCode11 = (hashCode10 + (videoOneOfVideoObjectsDto == null ? 0 : videoOneOfVideoObjectsDto.hashCode())) * 31;
        VideoOneOfVideoAlbumObjectsDto videoOneOfVideoAlbumObjectsDto = this.videoPlaylist;
        int hashCode12 = (hashCode11 + (videoOneOfVideoAlbumObjectsDto == null ? 0 : videoOneOfVideoAlbumObjectsDto.hashCode())) * 31;
        MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto = this.videoMessage;
        int hashCode13 = (hashCode12 + (messagesMessageAttachmentVideoMessageDto == null ? 0 : messagesMessageAttachmentVideoMessageDto.hashCode())) * 31;
        MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto = this.wall;
        int hashCode14 = (hashCode13 + (messagesMessageAttachmentWallpostDto == null ? 0 : messagesMessageAttachmentWallpostDto.hashCode())) * 31;
        AppsActionAttachmentDto appsActionAttachmentDto = this.appAction;
        return hashCode14 + (appsActionAttachmentDto != null ? appsActionAttachmentDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesHistoryMessageAttachmentDto(type=" + this.type + ", audio=" + this.audio + ", audioMessage=" + this.audioMessage + ", doc=" + this.doc + ", graffiti=" + this.graffiti + ", link=" + this.link + ", market=" + this.market + ", marketOrder=" + this.marketOrder + ", miniApp=" + this.miniApp + ", photo=" + this.photo + ", video=" + this.video + ", videoPlaylist=" + this.videoPlaylist + ", videoMessage=" + this.videoMessage + ", wall=" + this.wall + ", appAction=" + this.appAction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.audio, i);
        MessagesAudioMessageDto messagesAudioMessageDto = this.audioMessage;
        if (messagesAudioMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesAudioMessageDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.doc, i);
        MessagesGraffitiDto messagesGraffitiDto = this.graffiti;
        if (messagesGraffitiDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesGraffitiDto.writeToParcel(parcel, i);
        }
        MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto = this.link;
        if (messagesMessageAttachmentLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentLinkDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.market, i);
        MarketMarketOrderDto marketMarketOrderDto = this.marketOrder;
        if (marketMarketOrderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketOrderDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.miniApp, i);
        parcel.writeParcelable(this.photo, i);
        parcel.writeParcelable(this.video, i);
        parcel.writeParcelable(this.videoPlaylist, i);
        MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto = this.videoMessage;
        if (messagesMessageAttachmentVideoMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentVideoMessageDto.writeToParcel(parcel, i);
        }
        MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto = this.wall;
        if (messagesMessageAttachmentWallpostDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentWallpostDto.writeToParcel(parcel, i);
        }
        AppsActionAttachmentDto appsActionAttachmentDto = this.appAction;
        if (appsActionAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsActionAttachmentDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesHistoryMessageAttachmentDto(MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto, AudioAudioDto audioAudioDto, MessagesAudioMessageDto messagesAudioMessageDto, DocsDocDto docsDocDto, MessagesGraffitiDto messagesGraffitiDto, MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketOrderDto marketMarketOrderDto, AppsMiniAppAttachDto appsMiniAppAttachDto, PhotosPhotoDto photosPhotoDto, VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto, VideoOneOfVideoAlbumObjectsDto videoOneOfVideoAlbumObjectsDto, MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto, MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto, AppsActionAttachmentDto appsActionAttachmentDto, int i, zcl zclVar) {
        this(messagesHistoryMessageAttachmentTypeDto, (i & 2) != 0 ? null : audioAudioDto, (i & 4) != 0 ? null : messagesAudioMessageDto, (i & 8) != 0 ? null : docsDocDto, (i & 16) != 0 ? null : messagesGraffitiDto, (i & 32) != 0 ? null : messagesMessageAttachmentLinkDto, (i & 64) != 0 ? null : marketMarketItemDto, (i & 128) != 0 ? null : marketMarketOrderDto, (i & 256) != 0 ? null : appsMiniAppAttachDto, (i & 512) != 0 ? null : photosPhotoDto, (i & 1024) != 0 ? null : videoOneOfVideoObjectsDto, (i & 2048) != 0 ? null : videoOneOfVideoAlbumObjectsDto, (i & 4096) != 0 ? null : messagesMessageAttachmentVideoMessageDto, (i & 8192) != 0 ? null : messagesMessageAttachmentWallpostDto, (i & 16384) != 0 ? null : appsActionAttachmentDto);
    }
}
