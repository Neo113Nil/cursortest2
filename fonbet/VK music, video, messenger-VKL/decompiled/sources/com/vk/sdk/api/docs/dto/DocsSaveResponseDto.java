package com.vk.sdk.api.docs.dto;

import com.vk.sdk.api.messages.dto.MessagesAudioMessageDto;
import com.vk.sdk.api.messages.dto.MessagesGraffitiDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DocsSaveResponseDto.kt */
/* loaded from: classes5.dex */
public final class DocsSaveResponseDto {

    @pmi0("audio_message")
    private final MessagesAudioMessageDto audioMessage;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("graffiti")
    private final MessagesGraffitiDto graffiti;

    @pmi0("type")
    private final DocsDocAttachmentTypeDto type;

    public DocsSaveResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsSaveResponseDto)) {
            return false;
        }
        DocsSaveResponseDto docsSaveResponseDto = (DocsSaveResponseDto) obj;
        return this.type == docsSaveResponseDto.type && epx.f(this.audioMessage, docsSaveResponseDto.audioMessage) && epx.f(this.doc, docsSaveResponseDto.doc) && epx.f(this.graffiti, docsSaveResponseDto.graffiti);
    }

    public final int hashCode() {
        DocsDocAttachmentTypeDto docsDocAttachmentTypeDto = this.type;
        int hashCode = (docsDocAttachmentTypeDto == null ? 0 : docsDocAttachmentTypeDto.hashCode()) * 31;
        MessagesAudioMessageDto messagesAudioMessageDto = this.audioMessage;
        int hashCode2 = (hashCode + (messagesAudioMessageDto == null ? 0 : messagesAudioMessageDto.hashCode())) * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode3 = (hashCode2 + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        MessagesGraffitiDto messagesGraffitiDto = this.graffiti;
        return hashCode3 + (messagesGraffitiDto != null ? messagesGraffitiDto.hashCode() : 0);
    }

    public final String toString() {
        return "DocsSaveResponseDto(type=" + this.type + ", audioMessage=" + this.audioMessage + ", doc=" + this.doc + ", graffiti=" + this.graffiti + ")";
    }

    public DocsSaveResponseDto(DocsDocAttachmentTypeDto docsDocAttachmentTypeDto, MessagesAudioMessageDto messagesAudioMessageDto, DocsDocDto docsDocDto, MessagesGraffitiDto messagesGraffitiDto) {
        this.type = docsDocAttachmentTypeDto;
        this.audioMessage = messagesAudioMessageDto;
        this.doc = docsDocDto;
        this.graffiti = messagesGraffitiDto;
    }

    public /* synthetic */ DocsSaveResponseDto(DocsDocAttachmentTypeDto docsDocAttachmentTypeDto, MessagesAudioMessageDto messagesAudioMessageDto, DocsDocDto docsDocDto, MessagesGraffitiDto messagesGraffitiDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : docsDocAttachmentTypeDto, (i & 2) != 0 ? null : messagesAudioMessageDto, (i & 4) != 0 ? null : docsDocDto, (i & 8) != 0 ? null : messagesGraffitiDto);
    }
}
