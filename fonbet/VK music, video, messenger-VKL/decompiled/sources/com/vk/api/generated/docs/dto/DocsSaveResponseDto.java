package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.messages.dto.MessagesAudioMessageDto;
import com.vk.api.generated.messages.dto.MessagesGraffitiDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DocsSaveResponseDto.kt */
/* loaded from: classes14.dex */
public final class DocsSaveResponseDto implements Parcelable {
    public static final Parcelable.Creator<DocsSaveResponseDto> CREATOR = new a();

    @pmi0("audio_message")
    private final MessagesAudioMessageDto audioMessage;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("graffiti")
    private final MessagesGraffitiDto graffiti;

    @pmi0("type")
    private final DocsDocAttachmentTypeDto type;

    /* compiled from: DocsSaveResponseDto.kt */
    public static final class a implements Parcelable.Creator<DocsSaveResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsSaveResponseDto createFromParcel(Parcel parcel) {
            return new DocsSaveResponseDto(parcel.readInt() == 0 ? null : DocsDocAttachmentTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MessagesAudioMessageDto.CREATOR.createFromParcel(parcel), (DocsDocDto) parcel.readParcelable(DocsSaveResponseDto.class.getClassLoader()), parcel.readInt() != 0 ? MessagesGraffitiDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DocsSaveResponseDto[] newArray(int i) {
            return new DocsSaveResponseDto[i];
        }
    }

    public DocsSaveResponseDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        return "DocsSaveResponseDto(type=" + this.type + ", audioMessage=" + this.audioMessage + ", doc=" + this.doc + ", graffiti=" + this.graffiti + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DocsDocAttachmentTypeDto docsDocAttachmentTypeDto = this.type;
        if (docsDocAttachmentTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            docsDocAttachmentTypeDto.writeToParcel(parcel, i);
        }
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
