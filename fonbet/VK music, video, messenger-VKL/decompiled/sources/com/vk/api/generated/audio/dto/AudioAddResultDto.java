package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AudioAddResultDto.kt */
/* loaded from: classes14.dex */
public final class AudioAddResultDto implements Parcelable {
    public static final Parcelable.Creator<AudioAddResultDto> CREATOR = new a();

    @pmi0("audio_raw_id")
    private final String audioRawId;

    @pmi0("new_audio_id")
    private final int newAudioId;

    @pmi0("new_owner_id")
    private final UserId newOwnerId;

    /* compiled from: AudioAddResultDto.kt */
    public static final class a implements Parcelable.Creator<AudioAddResultDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAddResultDto createFromParcel(Parcel parcel) {
            return new AudioAddResultDto(parcel.readInt(), parcel.readString(), (UserId) parcel.readParcelable(AudioAddResultDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAddResultDto[] newArray(int i) {
            return new AudioAddResultDto[i];
        }
    }

    public AudioAddResultDto(int i, String str, UserId userId) {
        this.newAudioId = i;
        this.audioRawId = str;
        this.newOwnerId = userId;
    }

    public final int d() {
        return this.newAudioId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAddResultDto)) {
            return false;
        }
        AudioAddResultDto audioAddResultDto = (AudioAddResultDto) obj;
        return this.newAudioId == audioAddResultDto.newAudioId && epx.f(this.audioRawId, audioAddResultDto.audioRawId) && epx.f(this.newOwnerId, audioAddResultDto.newOwnerId);
    }

    public final int hashCode() {
        return Long.hashCode(this.newOwnerId.b) + urd0.a(Integer.hashCode(this.newAudioId) * 31, 31, this.audioRawId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAddResultDto(newAudioId=");
        sb.append(this.newAudioId);
        sb.append(", audioRawId=");
        sb.append(this.audioRawId);
        sb.append(", newOwnerId=");
        return gp.b(sb, this.newOwnerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.newAudioId);
        parcel.writeString(this.audioRawId);
        parcel.writeParcelable(this.newOwnerId, i);
    }
}
