package com.vk.api.generated.translations.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: TranslationsTranslateResponseDto.kt */
/* loaded from: classes15.dex */
public final class TranslationsTranslateResponseDto implements Parcelable {
    public static final Parcelable.Creator<TranslationsTranslateResponseDto> CREATOR = new a();

    @pmi0("source_lang")
    private final String sourceLang;

    @pmi0("texts")
    private final List<String> texts;

    /* compiled from: TranslationsTranslateResponseDto.kt */
    public static final class a implements Parcelable.Creator<TranslationsTranslateResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final TranslationsTranslateResponseDto createFromParcel(Parcel parcel) {
            return new TranslationsTranslateResponseDto(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TranslationsTranslateResponseDto[] newArray(int i) {
            return new TranslationsTranslateResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TranslationsTranslateResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.sourceLang;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.texts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationsTranslateResponseDto)) {
            return false;
        }
        TranslationsTranslateResponseDto translationsTranslateResponseDto = (TranslationsTranslateResponseDto) obj;
        return epx.f(this.texts, translationsTranslateResponseDto.texts) && epx.f(this.sourceLang, translationsTranslateResponseDto.sourceLang);
    }

    public final int hashCode() {
        List<String> list = this.texts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.sourceLang;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslationsTranslateResponseDto(texts=");
        sb.append(this.texts);
        sb.append(", sourceLang=");
        return ho8.a(sb, this.sourceLang, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.texts);
        parcel.writeString(this.sourceLang);
    }

    public TranslationsTranslateResponseDto(List<String> list, String str) {
        this.texts = list;
        this.sourceLang = str;
    }

    public /* synthetic */ TranslationsTranslateResponseDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
