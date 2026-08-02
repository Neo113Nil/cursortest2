package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioMoosicPlaylistDto.kt */
/* loaded from: classes14.dex */
public final class AudioMoosicPlaylistDto implements Parcelable {
    public static final Parcelable.Creator<AudioMoosicPlaylistDto> CREATOR = new a();

    @pmi0("moosic_id")
    private final String moosicId;

    @pmi0("playlist")
    private final AudioPlaylistDto playlist;

    /* compiled from: AudioMoosicPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<AudioMoosicPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioMoosicPlaylistDto createFromParcel(Parcel parcel) {
            return new AudioMoosicPlaylistDto(parcel.readString(), (AudioPlaylistDto) parcel.readParcelable(AudioMoosicPlaylistDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioMoosicPlaylistDto[] newArray(int i) {
            return new AudioMoosicPlaylistDto[i];
        }
    }

    public AudioMoosicPlaylistDto(String str, AudioPlaylistDto audioPlaylistDto) {
        this.moosicId = str;
        this.playlist = audioPlaylistDto;
    }

    public final String d() {
        return this.moosicId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AudioPlaylistDto e() {
        return this.playlist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioMoosicPlaylistDto)) {
            return false;
        }
        AudioMoosicPlaylistDto audioMoosicPlaylistDto = (AudioMoosicPlaylistDto) obj;
        return epx.f(this.moosicId, audioMoosicPlaylistDto.moosicId) && epx.f(this.playlist, audioMoosicPlaylistDto.playlist);
    }

    public final int hashCode() {
        int hashCode = this.moosicId.hashCode() * 31;
        AudioPlaylistDto audioPlaylistDto = this.playlist;
        return hashCode + (audioPlaylistDto == null ? 0 : audioPlaylistDto.hashCode());
    }

    public final String toString() {
        return "AudioMoosicPlaylistDto(moosicId=" + this.moosicId + ", playlist=" + this.playlist + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.moosicId);
        parcel.writeParcelable(this.playlist, i);
    }

    public /* synthetic */ AudioMoosicPlaylistDto(String str, AudioPlaylistDto audioPlaylistDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : audioPlaylistDto);
    }
}
