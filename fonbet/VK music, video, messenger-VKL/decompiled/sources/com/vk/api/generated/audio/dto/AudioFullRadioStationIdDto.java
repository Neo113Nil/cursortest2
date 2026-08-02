package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: AudioFullRadioStationIdDto.kt */
/* loaded from: classes14.dex */
public final class AudioFullRadioStationIdDto implements Parcelable {
    public static final Parcelable.Creator<AudioFullRadioStationIdDto> CREATOR = new a();

    @pmi0("station_id")
    private final long stationId;

    /* compiled from: AudioFullRadioStationIdDto.kt */
    public static final class a implements Parcelable.Creator<AudioFullRadioStationIdDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioFullRadioStationIdDto createFromParcel(Parcel parcel) {
            return new AudioFullRadioStationIdDto(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioFullRadioStationIdDto[] newArray(int i) {
            return new AudioFullRadioStationIdDto[i];
        }
    }

    public AudioFullRadioStationIdDto(long j) {
        this.stationId = j;
    }

    public final long d() {
        return this.stationId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioFullRadioStationIdDto) && this.stationId == ((AudioFullRadioStationIdDto) obj).stationId;
    }

    public final int hashCode() {
        return Long.hashCode(this.stationId);
    }

    public final String toString() {
        return vu5.a(')', this.stationId, new StringBuilder("AudioFullRadioStationIdDto(stationId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.stationId);
    }
}
