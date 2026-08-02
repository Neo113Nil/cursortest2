package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoQuestionnaireQuestionTargetDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoQuestionnaireQuestionTargetDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoQuestionnaireQuestionTargetDto> CREATOR = new a();

    @pmi0("next_question_code")
    private final String nextQuestionCode;

    @pmi0("values")
    private final List<String> values;

    /* compiled from: ShortVideoQuestionnaireQuestionTargetDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoQuestionnaireQuestionTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoQuestionnaireQuestionTargetDto createFromParcel(Parcel parcel) {
            return new ShortVideoQuestionnaireQuestionTargetDto(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoQuestionnaireQuestionTargetDto[] newArray(int i) {
            return new ShortVideoQuestionnaireQuestionTargetDto[i];
        }
    }

    public ShortVideoQuestionnaireQuestionTargetDto(String str, List<String> list) {
        this.nextQuestionCode = str;
        this.values = list;
    }

    public final String d() {
        return this.nextQuestionCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.values;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoQuestionnaireQuestionTargetDto)) {
            return false;
        }
        ShortVideoQuestionnaireQuestionTargetDto shortVideoQuestionnaireQuestionTargetDto = (ShortVideoQuestionnaireQuestionTargetDto) obj;
        return epx.f(this.nextQuestionCode, shortVideoQuestionnaireQuestionTargetDto.nextQuestionCode) && epx.f(this.values, shortVideoQuestionnaireQuestionTargetDto.values);
    }

    public final int hashCode() {
        int hashCode = this.nextQuestionCode.hashCode() * 31;
        List<String> list = this.values;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoQuestionnaireQuestionTargetDto(nextQuestionCode=");
        sb.append(this.nextQuestionCode);
        sb.append(", values=");
        return ms9.a(')', sb, this.values);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nextQuestionCode);
        parcel.writeStringList(this.values);
    }

    public /* synthetic */ ShortVideoQuestionnaireQuestionTargetDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
