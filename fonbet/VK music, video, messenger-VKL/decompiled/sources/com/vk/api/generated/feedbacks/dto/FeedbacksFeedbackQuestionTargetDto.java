package com.vk.api.generated.feedbacks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FeedbacksFeedbackQuestionTargetDto.kt */
/* loaded from: classes14.dex */
public final class FeedbacksFeedbackQuestionTargetDto implements Parcelable {
    public static final Parcelable.Creator<FeedbacksFeedbackQuestionTargetDto> CREATOR = new a();

    @pmi0("next_question_code")
    private final String nextQuestionCode;

    @pmi0("values")
    private final List<String> values;

    /* compiled from: FeedbacksFeedbackQuestionTargetDto.kt */
    public static final class a implements Parcelable.Creator<FeedbacksFeedbackQuestionTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackQuestionTargetDto createFromParcel(Parcel parcel) {
            return new FeedbacksFeedbackQuestionTargetDto(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackQuestionTargetDto[] newArray(int i) {
            return new FeedbacksFeedbackQuestionTargetDto[i];
        }
    }

    public FeedbacksFeedbackQuestionTargetDto(String str, List<String> list) {
        this.nextQuestionCode = str;
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
        if (!(obj instanceof FeedbacksFeedbackQuestionTargetDto)) {
            return false;
        }
        FeedbacksFeedbackQuestionTargetDto feedbacksFeedbackQuestionTargetDto = (FeedbacksFeedbackQuestionTargetDto) obj;
        return epx.f(this.nextQuestionCode, feedbacksFeedbackQuestionTargetDto.nextQuestionCode) && epx.f(this.values, feedbacksFeedbackQuestionTargetDto.values);
    }

    public final int hashCode() {
        int hashCode = this.nextQuestionCode.hashCode() * 31;
        List<String> list = this.values;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbacksFeedbackQuestionTargetDto(nextQuestionCode=");
        sb.append(this.nextQuestionCode);
        sb.append(", values=");
        return ms9.a(')', sb, this.values);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nextQuestionCode);
        parcel.writeStringList(this.values);
    }

    public /* synthetic */ FeedbacksFeedbackQuestionTargetDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
