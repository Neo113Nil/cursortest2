package com.vk.sdk.api.docs.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DocsDocPreviewDto.kt */
/* loaded from: classes5.dex */
public final class DocsDocPreviewDto {

    @pmi0("audio_msg")
    private final DocsDocPreviewAudioMsgDto audioMsg;

    @pmi0("graffiti")
    private final DocsDocPreviewGraffitiDto graffiti;

    @pmi0("photo")
    private final DocsDocPreviewPhotoDto photo;

    @pmi0("video")
    private final DocsDocPreviewVideoDto video;

    public DocsDocPreviewDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewDto)) {
            return false;
        }
        DocsDocPreviewDto docsDocPreviewDto = (DocsDocPreviewDto) obj;
        return epx.f(this.audioMsg, docsDocPreviewDto.audioMsg) && epx.f(this.graffiti, docsDocPreviewDto.graffiti) && epx.f(this.photo, docsDocPreviewDto.photo) && epx.f(this.video, docsDocPreviewDto.video);
    }

    public final int hashCode() {
        DocsDocPreviewAudioMsgDto docsDocPreviewAudioMsgDto = this.audioMsg;
        int hashCode = (docsDocPreviewAudioMsgDto == null ? 0 : docsDocPreviewAudioMsgDto.hashCode()) * 31;
        DocsDocPreviewGraffitiDto docsDocPreviewGraffitiDto = this.graffiti;
        int hashCode2 = (hashCode + (docsDocPreviewGraffitiDto == null ? 0 : docsDocPreviewGraffitiDto.hashCode())) * 31;
        DocsDocPreviewPhotoDto docsDocPreviewPhotoDto = this.photo;
        int hashCode3 = (hashCode2 + (docsDocPreviewPhotoDto == null ? 0 : docsDocPreviewPhotoDto.hashCode())) * 31;
        DocsDocPreviewVideoDto docsDocPreviewVideoDto = this.video;
        return hashCode3 + (docsDocPreviewVideoDto != null ? docsDocPreviewVideoDto.hashCode() : 0);
    }

    public final String toString() {
        return "DocsDocPreviewDto(audioMsg=" + this.audioMsg + ", graffiti=" + this.graffiti + ", photo=" + this.photo + ", video=" + this.video + ")";
    }

    public DocsDocPreviewDto(DocsDocPreviewAudioMsgDto docsDocPreviewAudioMsgDto, DocsDocPreviewGraffitiDto docsDocPreviewGraffitiDto, DocsDocPreviewPhotoDto docsDocPreviewPhotoDto, DocsDocPreviewVideoDto docsDocPreviewVideoDto) {
        this.audioMsg = docsDocPreviewAudioMsgDto;
        this.graffiti = docsDocPreviewGraffitiDto;
        this.photo = docsDocPreviewPhotoDto;
        this.video = docsDocPreviewVideoDto;
    }

    public /* synthetic */ DocsDocPreviewDto(DocsDocPreviewAudioMsgDto docsDocPreviewAudioMsgDto, DocsDocPreviewGraffitiDto docsDocPreviewGraffitiDto, DocsDocPreviewPhotoDto docsDocPreviewPhotoDto, DocsDocPreviewVideoDto docsDocPreviewVideoDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : docsDocPreviewAudioMsgDto, (i & 2) != 0 ? null : docsDocPreviewGraffitiDto, (i & 4) != 0 ? null : docsDocPreviewPhotoDto, (i & 8) != 0 ? null : docsDocPreviewVideoDto);
    }
}
