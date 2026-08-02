package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioGetReactionsConfigResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetReactionsConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetReactionsConfigResponseDto> CREATOR = new a();

    @pmi0("reactions_config")
    private final AudioReactionsConfigDto reactionsConfig;

    /* compiled from: AudioGetReactionsConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetReactionsConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetReactionsConfigResponseDto createFromParcel(Parcel parcel) {
            return new AudioGetReactionsConfigResponseDto(parcel.readInt() == 0 ? null : AudioReactionsConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetReactionsConfigResponseDto[] newArray(int i) {
            return new AudioGetReactionsConfigResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioGetReactionsConfigResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final AudioReactionsConfigDto d() {
        return this.reactionsConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioGetReactionsConfigResponseDto) && epx.f(this.reactionsConfig, ((AudioGetReactionsConfigResponseDto) obj).reactionsConfig);
    }

    public final int hashCode() {
        AudioReactionsConfigDto audioReactionsConfigDto = this.reactionsConfig;
        if (audioReactionsConfigDto == null) {
            return 0;
        }
        return audioReactionsConfigDto.hashCode();
    }

    public final String toString() {
        return "AudioGetReactionsConfigResponseDto(reactionsConfig=" + this.reactionsConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudioReactionsConfigDto audioReactionsConfigDto = this.reactionsConfig;
        if (audioReactionsConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioReactionsConfigDto.writeToParcel(parcel, i);
        }
    }

    public AudioGetReactionsConfigResponseDto(AudioReactionsConfigDto audioReactionsConfigDto) {
        this.reactionsConfig = audioReactionsConfigDto;
    }

    public /* synthetic */ AudioGetReactionsConfigResponseDto(AudioReactionsConfigDto audioReactionsConfigDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : audioReactionsConfigDto);
    }
}
