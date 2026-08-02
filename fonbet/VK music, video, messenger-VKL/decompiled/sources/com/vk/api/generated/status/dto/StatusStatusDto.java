package com.vk.api.generated.status.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StatusStatusDto.kt */
/* loaded from: classes15.dex */
public final class StatusStatusDto implements Parcelable {
    public static final Parcelable.Creator<StatusStatusDto> CREATOR = new a();

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("text")
    private final String text;

    /* compiled from: StatusStatusDto.kt */
    public static final class a implements Parcelable.Creator<StatusStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final StatusStatusDto createFromParcel(Parcel parcel) {
            return new StatusStatusDto(parcel.readString(), (AudioAudioDto) parcel.readParcelable(StatusStatusDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StatusStatusDto[] newArray(int i) {
            return new StatusStatusDto[i];
        }
    }

    public StatusStatusDto(String str, AudioAudioDto audioAudioDto) {
        this.text = str;
        this.audio = audioAudioDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusStatusDto)) {
            return false;
        }
        StatusStatusDto statusStatusDto = (StatusStatusDto) obj;
        return epx.f(this.text, statusStatusDto.text) && epx.f(this.audio, statusStatusDto.audio);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        AudioAudioDto audioAudioDto = this.audio;
        return hashCode + (audioAudioDto == null ? 0 : audioAudioDto.hashCode());
    }

    public final String toString() {
        return "StatusStatusDto(text=" + this.text + ", audio=" + this.audio + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.audio, i);
    }

    public /* synthetic */ StatusStatusDto(String str, AudioAudioDto audioAudioDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : audioAudioDto);
    }
}
