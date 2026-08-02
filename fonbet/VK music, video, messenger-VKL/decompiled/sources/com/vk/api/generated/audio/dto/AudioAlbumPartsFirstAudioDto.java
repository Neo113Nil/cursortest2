package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioAlbumPartsFirstAudioDto.kt */
/* loaded from: classes14.dex */
public final class AudioAlbumPartsFirstAudioDto implements Parcelable {
    public static final Parcelable.Creator<AudioAlbumPartsFirstAudioDto> CREATOR = new a();

    @pmi0("audio_id")
    private final String audioId;

    @pmi0("part_id")
    private final int partId;

    /* compiled from: AudioAlbumPartsFirstAudioDto.kt */
    public static final class a implements Parcelable.Creator<AudioAlbumPartsFirstAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAlbumPartsFirstAudioDto createFromParcel(Parcel parcel) {
            return new AudioAlbumPartsFirstAudioDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAlbumPartsFirstAudioDto[] newArray(int i) {
            return new AudioAlbumPartsFirstAudioDto[i];
        }
    }

    public AudioAlbumPartsFirstAudioDto(int i, String str) {
        this.partId = i;
        this.audioId = str;
    }

    public final String d() {
        return this.audioId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.partId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAlbumPartsFirstAudioDto)) {
            return false;
        }
        AudioAlbumPartsFirstAudioDto audioAlbumPartsFirstAudioDto = (AudioAlbumPartsFirstAudioDto) obj;
        return this.partId == audioAlbumPartsFirstAudioDto.partId && epx.f(this.audioId, audioAlbumPartsFirstAudioDto.audioId);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.partId) * 31;
        String str = this.audioId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAlbumPartsFirstAudioDto(partId=");
        sb.append(this.partId);
        sb.append(", audioId=");
        return ho8.a(sb, this.audioId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.partId);
        parcel.writeString(this.audioId);
    }

    public /* synthetic */ AudioAlbumPartsFirstAudioDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
