package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoQuestionnaireAnswerDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoQuestionnaireAnswerDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoQuestionnaireAnswerDto> CREATOR = new a();

    @pmi0("question_code")
    private final String questionCode;

    @pmi0("value")
    private final String value;

    @pmi0("values")
    private final List<String> values;

    /* compiled from: ShortVideoQuestionnaireAnswerDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoQuestionnaireAnswerDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoQuestionnaireAnswerDto createFromParcel(Parcel parcel) {
            return new ShortVideoQuestionnaireAnswerDto(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoQuestionnaireAnswerDto[] newArray(int i) {
            return new ShortVideoQuestionnaireAnswerDto[i];
        }
    }

    public ShortVideoQuestionnaireAnswerDto(String str, String str2, List<String> list) {
        this.questionCode = str;
        this.value = str2;
        this.values = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoQuestionnaireAnswerDto)) {
            return false;
        }
        ShortVideoQuestionnaireAnswerDto shortVideoQuestionnaireAnswerDto = (ShortVideoQuestionnaireAnswerDto) obj;
        return epx.f(this.questionCode, shortVideoQuestionnaireAnswerDto.questionCode) && epx.f(this.value, shortVideoQuestionnaireAnswerDto.value) && epx.f(this.values, shortVideoQuestionnaireAnswerDto.values);
    }

    public final int hashCode() {
        int hashCode = this.questionCode.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.values;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoQuestionnaireAnswerDto(questionCode=");
        sb.append(this.questionCode);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", values=");
        return ms9.a(')', sb, this.values);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.questionCode);
        parcel.writeString(this.value);
        parcel.writeStringList(this.values);
    }

    public /* synthetic */ ShortVideoQuestionnaireAnswerDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
