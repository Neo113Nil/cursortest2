package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AudioBooksAudioFileDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksAudioFileDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksAudioFileDto> CREATOR = new a();

    @pmi0("duration")
    private final int duration;

    @pmi0("file_size")
    private final Integer fileSize;

    @pmi0("url")
    private final String url;

    /* compiled from: AudioBooksAudioFileDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksAudioFileDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksAudioFileDto createFromParcel(Parcel parcel) {
            return new AudioBooksAudioFileDto(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksAudioFileDto[] newArray(int i) {
            return new AudioBooksAudioFileDto[i];
        }
    }

    public AudioBooksAudioFileDto(String str, int i, Integer num) {
        this.url = str;
        this.duration = i;
        this.fileSize = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBooksAudioFileDto)) {
            return false;
        }
        AudioBooksAudioFileDto audioBooksAudioFileDto = (AudioBooksAudioFileDto) obj;
        return epx.f(this.url, audioBooksAudioFileDto.url) && this.duration == audioBooksAudioFileDto.duration && epx.f(this.fileSize, audioBooksAudioFileDto.fileSize);
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = shy.a(this.duration, this.url.hashCode() * 31, 31);
        Integer num = this.fileSize;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksAudioFileDto(url=");
        sb.append(this.url);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", fileSize=");
        return uqi.b(sb, this.fileSize, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.duration);
        Integer num = this.fileSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AudioBooksAudioFileDto(String str, int i, Integer num, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : num);
    }
}
