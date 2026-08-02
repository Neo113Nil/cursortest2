package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AudioGetAudioPreviewUrlResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetAudioPreviewUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetAudioPreviewUrlResponseDto> CREATOR = new a();

    @pmi0("clip_from")
    private final Integer clipFrom;

    @pmi0("clip_to")
    private final Integer clipTo;

    @pmi0("url")
    private final String url;

    /* compiled from: AudioGetAudioPreviewUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetAudioPreviewUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetAudioPreviewUrlResponseDto createFromParcel(Parcel parcel) {
            return new AudioGetAudioPreviewUrlResponseDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetAudioPreviewUrlResponseDto[] newArray(int i) {
            return new AudioGetAudioPreviewUrlResponseDto[i];
        }
    }

    public AudioGetAudioPreviewUrlResponseDto(String str, Integer num, Integer num2) {
        this.url = str;
        this.clipFrom = num;
        this.clipTo = num2;
    }

    public final Integer d() {
        return this.clipFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.clipTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetAudioPreviewUrlResponseDto)) {
            return false;
        }
        AudioGetAudioPreviewUrlResponseDto audioGetAudioPreviewUrlResponseDto = (AudioGetAudioPreviewUrlResponseDto) obj;
        return epx.f(this.url, audioGetAudioPreviewUrlResponseDto.url) && epx.f(this.clipFrom, audioGetAudioPreviewUrlResponseDto.clipFrom) && epx.f(this.clipTo, audioGetAudioPreviewUrlResponseDto.clipTo);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        Integer num = this.clipFrom;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.clipTo;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetAudioPreviewUrlResponseDto(url=");
        sb.append(this.url);
        sb.append(", clipFrom=");
        sb.append(this.clipFrom);
        sb.append(", clipTo=");
        return uqi.b(sb, this.clipTo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        Integer num = this.clipFrom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.clipTo;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AudioGetAudioPreviewUrlResponseDto(String str, Integer num, Integer num2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
