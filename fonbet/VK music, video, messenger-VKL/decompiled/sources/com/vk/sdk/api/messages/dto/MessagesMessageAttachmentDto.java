package com.vk.sdk.api.messages.dto;

import androidx.core.app.NotificationCompat;
import com.vk.sdk.api.audio.dto.AudioAudioDto;
import com.vk.sdk.api.base.dto.BaseStickerDto;
import com.vk.sdk.api.calls.dto.CallsCallDto;
import com.vk.sdk.api.docs.dto.DocsDocDto;
import com.vk.sdk.api.gifts.dto.GiftsLayoutDto;
import com.vk.sdk.api.market.dto.MarketMarketAlbumDto;
import com.vk.sdk.api.market.dto.MarketMarketItemDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import com.vk.sdk.api.polls.dto.PollsPollDto;
import com.vk.sdk.api.stories.dto.StoriesStoryDto;
import com.vk.sdk.api.wall.dto.WallWallCommentDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesMessageAttachmentDto.kt */
/* loaded from: classes5.dex */
public final class MessagesMessageAttachmentDto {

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_message")
    private final MessagesAudioMessageDto audioMessage;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    private final CallsCallDto call;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("gift")
    private final GiftsLayoutDto gift;

    @pmi0("graffiti")
    private final MessagesGraffitiDto graffiti;

    @pmi0("market")
    private final MarketMarketItemDto market;

    @pmi0("market_market_album")
    private final MarketMarketAlbumDto marketMarketAlbum;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("sticker")
    private final BaseStickerDto sticker;

    @pmi0("story")
    private final StoriesStoryDto story;

    @pmi0("type")
    private final MessagesMessageAttachmentTypeDto type;

    @pmi0("wall_reply")
    private final WallWallCommentDto wallReply;

    public MessagesMessageAttachmentDto(MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto, AudioAudioDto audioAudioDto, MessagesAudioMessageDto messagesAudioMessageDto, CallsCallDto callsCallDto, DocsDocDto docsDocDto, GiftsLayoutDto giftsLayoutDto, MessagesGraffitiDto messagesGraffitiDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, PhotosPhotoDto photosPhotoDto, BaseStickerDto baseStickerDto, StoriesStoryDto storiesStoryDto, WallWallCommentDto wallWallCommentDto, PollsPollDto pollsPollDto) {
        this.type = messagesMessageAttachmentTypeDto;
        this.audio = audioAudioDto;
        this.audioMessage = messagesAudioMessageDto;
        this.call = callsCallDto;
        this.doc = docsDocDto;
        this.gift = giftsLayoutDto;
        this.graffiti = messagesGraffitiDto;
        this.market = marketMarketItemDto;
        this.marketMarketAlbum = marketMarketAlbumDto;
        this.photo = photosPhotoDto;
        this.sticker = baseStickerDto;
        this.story = storiesStoryDto;
        this.wallReply = wallWallCommentDto;
        this.poll = pollsPollDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAttachmentDto)) {
            return false;
        }
        MessagesMessageAttachmentDto messagesMessageAttachmentDto = (MessagesMessageAttachmentDto) obj;
        return this.type == messagesMessageAttachmentDto.type && epx.f(this.audio, messagesMessageAttachmentDto.audio) && epx.f(this.audioMessage, messagesMessageAttachmentDto.audioMessage) && epx.f(this.call, messagesMessageAttachmentDto.call) && epx.f(this.doc, messagesMessageAttachmentDto.doc) && epx.f(this.gift, messagesMessageAttachmentDto.gift) && epx.f(this.graffiti, messagesMessageAttachmentDto.graffiti) && epx.f(this.market, messagesMessageAttachmentDto.market) && epx.f(this.marketMarketAlbum, messagesMessageAttachmentDto.marketMarketAlbum) && epx.f(this.photo, messagesMessageAttachmentDto.photo) && epx.f(this.sticker, messagesMessageAttachmentDto.sticker) && epx.f(this.story, messagesMessageAttachmentDto.story) && epx.f(this.wallReply, messagesMessageAttachmentDto.wallReply) && epx.f(this.poll, messagesMessageAttachmentDto.poll);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode2 = (hashCode + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        MessagesAudioMessageDto messagesAudioMessageDto = this.audioMessage;
        int hashCode3 = (hashCode2 + (messagesAudioMessageDto == null ? 0 : messagesAudioMessageDto.hashCode())) * 31;
        CallsCallDto callsCallDto = this.call;
        int hashCode4 = (hashCode3 + (callsCallDto == null ? 0 : callsCallDto.hashCode())) * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode5 = (hashCode4 + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        GiftsLayoutDto giftsLayoutDto = this.gift;
        int hashCode6 = (hashCode5 + (giftsLayoutDto == null ? 0 : giftsLayoutDto.hashCode())) * 31;
        MessagesGraffitiDto messagesGraffitiDto = this.graffiti;
        int hashCode7 = (hashCode6 + (messagesGraffitiDto == null ? 0 : messagesGraffitiDto.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.market;
        int hashCode8 = (hashCode7 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        MarketMarketAlbumDto marketMarketAlbumDto = this.marketMarketAlbum;
        int hashCode9 = (hashCode8 + (marketMarketAlbumDto == null ? 0 : marketMarketAlbumDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode10 = (hashCode9 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        BaseStickerDto baseStickerDto = this.sticker;
        int hashCode11 = (hashCode10 + (baseStickerDto == null ? 0 : baseStickerDto.hashCode())) * 31;
        StoriesStoryDto storiesStoryDto = this.story;
        int hashCode12 = (hashCode11 + (storiesStoryDto == null ? 0 : storiesStoryDto.hashCode())) * 31;
        WallWallCommentDto wallWallCommentDto = this.wallReply;
        int hashCode13 = (hashCode12 + (wallWallCommentDto == null ? 0 : wallWallCommentDto.hashCode())) * 31;
        PollsPollDto pollsPollDto = this.poll;
        return hashCode13 + (pollsPollDto != null ? pollsPollDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesMessageAttachmentDto(type=" + this.type + ", audio=" + this.audio + ", audioMessage=" + this.audioMessage + ", call=" + this.call + ", doc=" + this.doc + ", gift=" + this.gift + ", graffiti=" + this.graffiti + ", market=" + this.market + ", marketMarketAlbum=" + this.marketMarketAlbum + ", photo=" + this.photo + ", sticker=" + this.sticker + ", story=" + this.story + ", wallReply=" + this.wallReply + ", poll=" + this.poll + ")";
    }

    public /* synthetic */ MessagesMessageAttachmentDto(MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto, AudioAudioDto audioAudioDto, MessagesAudioMessageDto messagesAudioMessageDto, CallsCallDto callsCallDto, DocsDocDto docsDocDto, GiftsLayoutDto giftsLayoutDto, MessagesGraffitiDto messagesGraffitiDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, PhotosPhotoDto photosPhotoDto, BaseStickerDto baseStickerDto, StoriesStoryDto storiesStoryDto, WallWallCommentDto wallWallCommentDto, PollsPollDto pollsPollDto, int i, zcl zclVar) {
        this(messagesMessageAttachmentTypeDto, (i & 2) != 0 ? null : audioAudioDto, (i & 4) != 0 ? null : messagesAudioMessageDto, (i & 8) != 0 ? null : callsCallDto, (i & 16) != 0 ? null : docsDocDto, (i & 32) != 0 ? null : giftsLayoutDto, (i & 64) != 0 ? null : messagesGraffitiDto, (i & 128) != 0 ? null : marketMarketItemDto, (i & 256) != 0 ? null : marketMarketAlbumDto, (i & 512) != 0 ? null : photosPhotoDto, (i & 1024) != 0 ? null : baseStickerDto, (i & 2048) != 0 ? null : storiesStoryDto, (i & 4096) != 0 ? null : wallWallCommentDto, (i & 8192) != 0 ? null : pollsPollDto);
    }
}
