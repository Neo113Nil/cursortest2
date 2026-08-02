package com.vk.api.generated.questions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: QuestionsGetByIdResponseDto.kt */
/* loaded from: classes15.dex */
public final class QuestionsGetByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<QuestionsGetByIdResponseDto> CREATOR = new a();

    @pmi0("question")
    private final QuestionsQuestionDto question;

    /* compiled from: QuestionsGetByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<QuestionsGetByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final QuestionsGetByIdResponseDto createFromParcel(Parcel parcel) {
            return new QuestionsGetByIdResponseDto(QuestionsQuestionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionsGetByIdResponseDto[] newArray(int i) {
            return new QuestionsGetByIdResponseDto[i];
        }
    }

    public QuestionsGetByIdResponseDto(QuestionsQuestionDto questionsQuestionDto) {
        this.question = questionsQuestionDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuestionsGetByIdResponseDto) && epx.f(this.question, ((QuestionsGetByIdResponseDto) obj).question);
    }

    public final int hashCode() {
        return this.question.hashCode();
    }

    public final String toString() {
        return "QuestionsGetByIdResponseDto(question=" + this.question + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.question.writeToParcel(parcel, i);
    }
}
