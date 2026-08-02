package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DocsDocPreviewDto.kt */
/* loaded from: classes14.dex */
public final class DocsDocPreviewDto implements Parcelable {
    public static final Parcelable.Creator<DocsDocPreviewDto> CREATOR = new a();

    @pmi0("audio_msg")
    private final DocsDocPreviewAudioMsgDto audioMsg;

    @pmi0("graffiti")
    private final DocsDocPreviewGraffitiDto graffiti;

    @pmi0("photo")
    private final DocsDocPreviewPhotoDto photo;

    @pmi0("video")
    private final DocsDocPreviewVideoDto video;

    /* compiled from: DocsDocPreviewDto.kt */
    public static final class a implements Parcelable.Creator<DocsDocPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewDto createFromParcel(Parcel parcel) {
            return new DocsDocPreviewDto(parcel.readInt() == 0 ? null : DocsDocPreviewAudioMsgDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocsDocPreviewGraffitiDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocsDocPreviewPhotoDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DocsDocPreviewVideoDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewDto[] newArray(int i) {
            return new DocsDocPreviewDto[i];
        }
    }

    public DocsDocPreviewDto() {
        this(null, null, null, null, 15, null);
    }

    public final DocsDocPreviewAudioMsgDto d() {
        return this.audioMsg;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DocsDocPreviewGraffitiDto e() {
        return this.graffiti;
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

    public final DocsDocPreviewPhotoDto f() {
        return this.photo;
    }

    public final DocsDocPreviewVideoDto g() {
        return this.video;
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
        return "DocsDocPreviewDto(audioMsg=" + this.audioMsg + ", graffiti=" + this.graffiti + ", photo=" + this.photo + ", video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DocsDocPreviewAudioMsgDto docsDocPreviewAudioMsgDto = this.audioMsg;
        if (docsDocPreviewAudioMsgDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            docsDocPreviewAudioMsgDto.writeToParcel(parcel, i);
        }
        DocsDocPreviewGraffitiDto docsDocPreviewGraffitiDto = this.graffiti;
        if (docsDocPreviewGraffitiDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            docsDocPreviewGraffitiDto.writeToParcel(parcel, i);
        }
        DocsDocPreviewPhotoDto docsDocPreviewPhotoDto = this.photo;
        if (docsDocPreviewPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            docsDocPreviewPhotoDto.writeToParcel(parcel, i);
        }
        DocsDocPreviewVideoDto docsDocPreviewVideoDto = this.video;
        if (docsDocPreviewVideoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            docsDocPreviewVideoDto.writeToParcel(parcel, i);
        }
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
