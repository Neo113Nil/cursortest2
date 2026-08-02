package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioGetStreamMixSettingsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetStreamMixSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetStreamMixSettingsResponseDto> CREATOR = new a();

    @pmi0("settings")
    private final AudioStreamMixSettingsDto settings;

    /* compiled from: AudioGetStreamMixSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetStreamMixSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetStreamMixSettingsResponseDto createFromParcel(Parcel parcel) {
            return new AudioGetStreamMixSettingsResponseDto(parcel.readInt() == 0 ? null : AudioStreamMixSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetStreamMixSettingsResponseDto[] newArray(int i) {
            return new AudioGetStreamMixSettingsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioGetStreamMixSettingsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final AudioStreamMixSettingsDto d() {
        return this.settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioGetStreamMixSettingsResponseDto) && epx.f(this.settings, ((AudioGetStreamMixSettingsResponseDto) obj).settings);
    }

    public final int hashCode() {
        AudioStreamMixSettingsDto audioStreamMixSettingsDto = this.settings;
        if (audioStreamMixSettingsDto == null) {
            return 0;
        }
        return audioStreamMixSettingsDto.hashCode();
    }

    public final String toString() {
        return "AudioGetStreamMixSettingsResponseDto(settings=" + this.settings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudioStreamMixSettingsDto audioStreamMixSettingsDto = this.settings;
        if (audioStreamMixSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioStreamMixSettingsDto.writeToParcel(parcel, i);
        }
    }

    public AudioGetStreamMixSettingsResponseDto(AudioStreamMixSettingsDto audioStreamMixSettingsDto) {
        this.settings = audioStreamMixSettingsDto;
    }

    public /* synthetic */ AudioGetStreamMixSettingsResponseDto(AudioStreamMixSettingsDto audioStreamMixSettingsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : audioStreamMixSettingsDto);
    }
}
