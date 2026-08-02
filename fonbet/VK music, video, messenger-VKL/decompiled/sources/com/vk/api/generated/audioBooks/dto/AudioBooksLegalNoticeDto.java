package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioBooksLegalNoticeDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksLegalNoticeDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksLegalNoticeDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioBooksLegalNoticeDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksLegalNoticeDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksLegalNoticeDto createFromParcel(Parcel parcel) {
            return new AudioBooksLegalNoticeDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksLegalNoticeDto[] newArray(int i) {
            return new AudioBooksLegalNoticeDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioBooksLegalNoticeDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBooksLegalNoticeDto)) {
            return false;
        }
        AudioBooksLegalNoticeDto audioBooksLegalNoticeDto = (AudioBooksLegalNoticeDto) obj;
        return epx.f(this.title, audioBooksLegalNoticeDto.title) && epx.f(this.text, audioBooksLegalNoticeDto.text);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksLegalNoticeDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
    }

    public AudioBooksLegalNoticeDto(String str, String str2) {
        this.title = str;
        this.text = str2;
    }

    public /* synthetic */ AudioBooksLegalNoticeDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
