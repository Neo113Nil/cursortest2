package com.vk.api.generated.feedbacks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: FeedbacksFeedbackQuestionValuesDto.kt */
/* loaded from: classes14.dex */
public final class FeedbacksFeedbackQuestionValuesDto implements Parcelable {
    public static final Parcelable.Creator<FeedbacksFeedbackQuestionValuesDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("value")
    private final String value;

    /* compiled from: FeedbacksFeedbackQuestionValuesDto.kt */
    public static final class a implements Parcelable.Creator<FeedbacksFeedbackQuestionValuesDto> {
        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackQuestionValuesDto createFromParcel(Parcel parcel) {
            return new FeedbacksFeedbackQuestionValuesDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackQuestionValuesDto[] newArray(int i) {
            return new FeedbacksFeedbackQuestionValuesDto[i];
        }
    }

    public FeedbacksFeedbackQuestionValuesDto(String str, String str2) {
        this.value = str;
        this.text = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbacksFeedbackQuestionValuesDto)) {
            return false;
        }
        FeedbacksFeedbackQuestionValuesDto feedbacksFeedbackQuestionValuesDto = (FeedbacksFeedbackQuestionValuesDto) obj;
        return epx.f(this.value, feedbacksFeedbackQuestionValuesDto.value) && epx.f(this.text, feedbacksFeedbackQuestionValuesDto.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.value.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbacksFeedbackQuestionValuesDto(value=");
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
