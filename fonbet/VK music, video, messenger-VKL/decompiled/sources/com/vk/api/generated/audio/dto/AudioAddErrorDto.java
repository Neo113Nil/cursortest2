package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AudioAddErrorDto.kt */
/* loaded from: classes14.dex */
public final class AudioAddErrorDto implements Parcelable {
    public static final Parcelable.Creator<AudioAddErrorDto> CREATOR = new a();

    @pmi0("audio_raw_id")
    private final String audioRawId;

    @pmi0("error_code")
    private final String errorCode;

    @pmi0(SharedKt.PARAM_ERROR_MSG)
    private final String errorMsg;

    /* compiled from: AudioAddErrorDto.kt */
    public static final class a implements Parcelable.Creator<AudioAddErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAddErrorDto createFromParcel(Parcel parcel) {
            return new AudioAddErrorDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAddErrorDto[] newArray(int i) {
            return new AudioAddErrorDto[i];
        }
    }

    public AudioAddErrorDto(String str, String str2, String str3) {
        this.audioRawId = str;
        this.errorCode = str2;
        this.errorMsg = str3;
    }

    public final String d() {
        return this.errorMsg;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAddErrorDto)) {
            return false;
        }
        AudioAddErrorDto audioAddErrorDto = (AudioAddErrorDto) obj;
        return epx.f(this.audioRawId, audioAddErrorDto.audioRawId) && epx.f(this.errorCode, audioAddErrorDto.errorCode) && epx.f(this.errorMsg, audioAddErrorDto.errorMsg);
    }

    public final int hashCode() {
        return this.errorMsg.hashCode() + urd0.a(this.audioRawId.hashCode() * 31, 31, this.errorCode);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAddErrorDto(audioRawId=");
        sb.append(this.audioRawId);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMsg=");
        return ho8.a(sb, this.errorMsg, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.audioRawId);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMsg);
    }
}
