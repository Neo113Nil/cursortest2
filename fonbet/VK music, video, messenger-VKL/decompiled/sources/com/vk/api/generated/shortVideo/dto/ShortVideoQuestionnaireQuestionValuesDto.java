package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ShortVideoQuestionnaireQuestionValuesDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoQuestionnaireQuestionValuesDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoQuestionnaireQuestionValuesDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("value")
    private final String value;

    /* compiled from: ShortVideoQuestionnaireQuestionValuesDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoQuestionnaireQuestionValuesDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoQuestionnaireQuestionValuesDto createFromParcel(Parcel parcel) {
            return new ShortVideoQuestionnaireQuestionValuesDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoQuestionnaireQuestionValuesDto[] newArray(int i) {
            return new ShortVideoQuestionnaireQuestionValuesDto[i];
        }
    }

    public ShortVideoQuestionnaireQuestionValuesDto(String str, String str2) {
        this.value = str;
        this.text = str2;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoQuestionnaireQuestionValuesDto)) {
            return false;
        }
        ShortVideoQuestionnaireQuestionValuesDto shortVideoQuestionnaireQuestionValuesDto = (ShortVideoQuestionnaireQuestionValuesDto) obj;
        return epx.f(this.value, shortVideoQuestionnaireQuestionValuesDto.value) && epx.f(this.text, shortVideoQuestionnaireQuestionValuesDto.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.value.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoQuestionnaireQuestionValuesDto(value=");
        sb.append(this.value);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
        parcel.writeString(this.text);
    }
}
