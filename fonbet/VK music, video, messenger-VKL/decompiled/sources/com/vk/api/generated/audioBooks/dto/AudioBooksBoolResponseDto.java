package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.pmi0;

/* compiled from: AudioBooksBoolResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksBoolResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksBoolResponseDto> CREATOR = new a();

    @pmi0("result")
    private final BaseBoolIntDto result;

    /* compiled from: AudioBooksBoolResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksBoolResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksBoolResponseDto createFromParcel(Parcel parcel) {
            return new AudioBooksBoolResponseDto((BaseBoolIntDto) parcel.readParcelable(AudioBooksBoolResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksBoolResponseDto[] newArray(int i) {
            return new AudioBooksBoolResponseDto[i];
        }
    }

    public AudioBooksBoolResponseDto(BaseBoolIntDto baseBoolIntDto) {
        this.result = baseBoolIntDto;
    }

    public final BaseBoolIntDto d() {
        return this.result;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioBooksBoolResponseDto) && this.result == ((AudioBooksBoolResponseDto) obj).result;
    }

    public final int hashCode() {
        return this.result.hashCode();
    }

    public final String toString() {
        return "AudioBooksBoolResponseDto(result=" + this.result + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.result, i);
    }
}
