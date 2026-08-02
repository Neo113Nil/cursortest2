package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AudioBooksGetAudioBookByIdResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksGetAudioBookByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksGetAudioBookByIdResponseDto> CREATOR = new a();

    @pmi0("audio_book")
    private final AudioBooksAudioBookDto audioBook;

    /* compiled from: AudioBooksGetAudioBookByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksGetAudioBookByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksGetAudioBookByIdResponseDto createFromParcel(Parcel parcel) {
            return new AudioBooksGetAudioBookByIdResponseDto(AudioBooksAudioBookDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksGetAudioBookByIdResponseDto[] newArray(int i) {
            return new AudioBooksGetAudioBookByIdResponseDto[i];
        }
    }

    public AudioBooksGetAudioBookByIdResponseDto(AudioBooksAudioBookDto audioBooksAudioBookDto) {
        this.audioBook = audioBooksAudioBookDto;
    }

    public final AudioBooksAudioBookDto d() {
        return this.audioBook;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioBooksGetAudioBookByIdResponseDto) && epx.f(this.audioBook, ((AudioBooksGetAudioBookByIdResponseDto) obj).audioBook);
    }

    public final int hashCode() {
        return this.audioBook.hashCode();
    }

    public final String toString() {
        return "AudioBooksGetAudioBookByIdResponseDto(audioBook=" + this.audioBook + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.audioBook.writeToParcel(parcel, i);
    }
}
