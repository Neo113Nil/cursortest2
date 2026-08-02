package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.audio.dto.AudioAudioDto;
import com.vk.sdk.api.docs.dto.DocsDocDto;
import com.vk.sdk.api.market.dto.MarketMarketItemDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesHistoryMessageAttachmentDto.kt */
/* loaded from: classes5.dex */
public final class MessagesHistoryMessageAttachmentDto {

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_message")
    private final MessagesAudioMessageDto audioMessage;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("graffiti")
    private final MessagesGraffitiDto graffiti;

    @pmi0("market")
    private final MarketMarketItemDto market;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("type")
    private final MessagesHistoryMessageAttachmentTypeDto type;

    public MessagesHistoryMessageAttachmentDto(MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto, AudioAudioDto audioAudioDto, MessagesAudioMessageDto messagesAudioMessageDto, DocsDocDto docsDocDto, MessagesGraffitiDto messagesGraffitiDto, MarketMarketItemDto marketMarketItemDto, PhotosPhotoDto photosPhotoDto) {
        this.type = messagesHistoryMessageAttachmentTypeDto;
        this.audio = audioAudioDto;
        this.audioMessage = messagesAudioMessageDto;
        this.doc = docsDocDto;
        this.graffiti = messagesGraffitiDto;
        this.market = marketMarketItemDto;
        this.photo = photosPhotoDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesHistoryMessageAttachmentDto)) {
            return false;
        }
        MessagesHistoryMessageAttachmentDto messagesHistoryMessageAttachmentDto = (MessagesHistoryMessageAttachmentDto) obj;
        return this.type == messagesHistoryMessageAttachmentDto.type && epx.f(this.audio, messagesHistoryMessageAttachmentDto.audio) && epx.f(this.audioMessage, messagesHistoryMessageAttachmentDto.audioMessage) && epx.f(this.doc, messagesHistoryMessageAttachmentDto.doc) && epx.f(this.graffiti, messagesHistoryMessageAttachmentDto.graffiti) && epx.f(this.market, messagesHistoryMessageAttachmentDto.market) && epx.f(this.photo, messagesHistoryMessageAttachmentDto.photo);
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
        MarketMarketItemDto marketMarketItemDto = this.market;
        int hashCode6 = (hashCode5 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        return hashCode6 + (photosPhotoDto != null ? photosPhotoDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesHistoryMessageAttachmentDto(type=" + this.type + ", audio=" + this.audio + ", audioMessage=" + this.audioMessage + ", doc=" + this.doc + ", graffiti=" + this.graffiti + ", market=" + this.market + ", photo=" + this.photo + ")";
    }

    public /* synthetic */ MessagesHistoryMessageAttachmentDto(MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto, AudioAudioDto audioAudioDto, MessagesAudioMessageDto messagesAudioMessageDto, DocsDocDto docsDocDto, MessagesGraffitiDto messagesGraffitiDto, MarketMarketItemDto marketMarketItemDto, PhotosPhotoDto photosPhotoDto, int i, zcl zclVar) {
        this(messagesHistoryMessageAttachmentTypeDto, (i & 2) != 0 ? null : audioAudioDto, (i & 4) != 0 ? null : messagesAudioMessageDto, (i & 8) != 0 ? null : docsDocDto, (i & 16) != 0 ? null : messagesGraffitiDto, (i & 32) != 0 ? null : marketMarketItemDto, (i & 64) != 0 ? null : photosPhotoDto);
    }
}
